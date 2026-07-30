package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import io.agora.base.JavaI420Buffer;
import io.agora.base.NV12Buffer;
import io.agora.base.NV21Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(16)
class HardwareVideoDecoder implements VideoDecoder, VideoSink {
    private static final boolean DEBUG = false;
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_HIGH_LATENCY_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String FEATURE_LowLatency = "low-latency";
    private static final int MAX_DECODER_Q_SIZE = 5;
    private static final int MAX_DECODER_Q_WAIT_TIMEOUT_MS = 2000;
    private static final int MAX_DECODE_HIGH_LATENCY_TIME_MS = 300;
    private static final int MAX_DECODE_TIME_MS = 2000;
    private static final int MAX_DEQUEUED_OUTPUTBUFFERS = 3;
    private static final int MAX_HIGH_LATENCY_DECODE_LIMIT = 8;
    private static final int MAX_NO_INPUT_LIMIT = 5;
    private static final int MAX_TEXTURE_BUFFER_COUNT = 16;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final String TAG = "HardwareVideoDecoder";
    private static Map<String, Boolean> codecUnavailableMap = new ConcurrentHashMap();

    @Nullable
    private VideoDecoder.Callback callback;
    private final String codecName;
    private final VideoCodecType codecType;
    private int colorFormat;

    @Nullable
    private String customConfigJson;
    private int deliveredCount;
    private boolean deliveredVideoFrame;
    private int dequeueOutputTimeUs;
    private Surface directSurface;
    private boolean fallbackByCodecError;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean highLatencyTrigger;
    private int inputDropCount;
    private boolean keyFrameRequired;
    private long lastPresentationTimestampUs;
    private int maxDecodeTimeMs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;

    @Nullable
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;

    @Nullable
    private Handler proxyThreadHandler;

    @Nullable
    private DecodedTextureMetadata renderedTextureMetadata;
    private VideoDecoder.Settings settings;
    private final EglBase.Context sharedContext;
    private boolean shouldResetCodec;
    private int sliceHeight;
    private int stride;
    private int supportCodecs;

    @Nullable
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private int transfer = VideoFrame.ColorSpace.Transfer.Unspecified.getTransfer();
    private long firstDecoderQueueFullMs = -1;
    private final Queue<TimeStamps> decodeTimeStamps = new ConcurrentLinkedQueue();
    private volatile boolean running = false;

    @Nullable
    private volatile Exception shutdownException = null;
    private final Object dimensionLock = new Object();
    private boolean isHisiCodec = false;
    private boolean textureCopy = true;

    @Nullable
    private Surface surface = null;
    private final Object textureMetadataLock = new Object();
    private final Queue<DecodedTextureMetadata> dequeuedSurfaceOutputBuffers = new LinkedList();

    @Nullable
    private MediaCodecWrapper codec = null;
    private Map<Long, CodecSpecificInfo> codecSpecificInfoMap = new ConcurrentHashMap();
    private Map<Long, FrameExtraInfo> bframeExtraInfoMap = new ConcurrentHashMap();

    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final int delaySize;
        final int height;
        private final long infoPresentationTimeUs;
        final int outputBufferIndex;
        final long presentationTimestampUs;
        final long prevElapsedRealtime;
        final int rotation;
        final int width;

        public DecodedTextureMetadata(int i, int i2, int i3, int i4, long j, Integer num, int i5, long j2, long j3) {
            this.outputBufferIndex = i;
            this.width = i2;
            this.height = i3;
            this.rotation = i4;
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
            this.delaySize = i5;
            this.prevElapsedRealtime = j2;
            this.infoPresentationTimeUs = j3;
        }
    }

    public static class TimeStamps {
        private final long presentationTimeStampUs;
        private final long prevElapsedRealtime;
        private final int rotation;

        public TimeStamps(long j, long j2, int i) {
            this.prevElapsedRealtime = j;
            this.presentationTimeStampUs = j2;
            this.rotation = i;
        }
    }

    public HardwareVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecType videoCodecType, Map<String, String> map, int i, EglBase.Context context, Surface surface) {
        this.dequeueOutputTimeUs = 100000;
        this.maxDecodeTimeMs = 2000;
        if (MediaCodecUtils.useHighLatencyStrategy()) {
            this.dequeueOutputTimeUs = 500000;
            this.maxDecodeTimeMs = 300;
        }
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecType;
        this.colorFormat = i;
        this.params = map;
        this.sharedContext = context;
        this.directSurface = surface;
    }

    public static /* synthetic */ int access$708(HardwareVideoDecoder hardwareVideoDecoder) {
        int i = hardwareVideoDecoder.inputDropCount;
        hardwareVideoDecoder.inputDropCount = i + 1;
        return i;
    }

    public static /* synthetic */ long access$804(HardwareVideoDecoder hardwareVideoDecoder) {
        long j = hardwareVideoDecoder.lastPresentationTimestampUs + 1;
        hardwareVideoDecoder.lastPresentationTimestampUs = j;
        return j;
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        if (i % 2 != 0) {
            throw new AssertionError("Stride is not divisible by two: " + i);
        }
        int i5 = (i3 + 1) / 2;
        int i6 = i2 % 2;
        int i7 = i6 == 0 ? (i4 + 1) / 2 : i4 / 2;
        int i8 = i / 2;
        int i9 = i * i2;
        int i10 = i8 * i7;
        int i11 = i9 + ((i8 * i2) / 2);
        int i12 = i11 + i10;
        VideoFrame.I420Buffer i420BufferAllocateI420Buffer = allocateI420Buffer(i3, i4);
        byteBuffer.limit(i * i4);
        byteBuffer.position(0);
        copyPlane(byteBuffer.slice(), i, i420BufferAllocateI420Buffer.getDataY(), i420BufferAllocateI420Buffer.getStrideY(), i3, i4);
        byteBuffer.limit(i9 + i10);
        byteBuffer.position(i9);
        copyPlane(byteBuffer.slice(), i8, i420BufferAllocateI420Buffer.getDataU(), i420BufferAllocateI420Buffer.getStrideU(), i5, i7);
        if (i6 == 1) {
            byteBuffer.position(i9 + (i8 * (i7 - 1)));
            ByteBuffer dataU = i420BufferAllocateI420Buffer.getDataU();
            dataU.position(i420BufferAllocateI420Buffer.getStrideU() * i7);
            dataU.put(byteBuffer);
        }
        byteBuffer.limit(i12);
        byteBuffer.position(i11);
        copyPlane(byteBuffer.slice(), i8, i420BufferAllocateI420Buffer.getDataV(), i420BufferAllocateI420Buffer.getStrideV(), i5, i7);
        if (i6 == 1) {
            byteBuffer.position(i11 + (i8 * (i7 - 1)));
            ByteBuffer dataV = i420BufferAllocateI420Buffer.getDataV();
            dataV.position(i420BufferAllocateI420Buffer.getStrideV() * i7);
            dataV.put(byteBuffer);
        }
        return i420BufferAllocateI420Buffer;
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV12Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    private VideoFrame.Buffer copyNV21ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        return new NV21Buffer(i3, i4, i, i2, byteBuffer, null).toI420();
    }

    private Thread createOutputThread() {
        return new Thread("HardwareVideoDecoder.outputThread") { // from class: io.agora.base.internal.video.HardwareVideoDecoder.5
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                HardwareVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (true) {
                    boolean z = HardwareVideoDecoder.this.running;
                    HardwareVideoDecoder hardwareVideoDecoder = HardwareVideoDecoder.this;
                    if (!z) {
                        hardwareVideoDecoder.releaseCodecOnOutputThread();
                        return;
                    }
                    hardwareVideoDecoder.deliverDecodedFrame();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void debug_log(String str) {
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer byteBuffer;
        HardwareVideoDecoder hardwareVideoDecoder;
        VideoFrame.Buffer bufferCopyNV21ToI420Buffer;
        VideoFrame videoFrame;
        synchronized (this.dimensionLock) {
            i2 = this.width;
            i3 = this.height;
            i4 = this.stride;
            i5 = this.sliceHeight;
        }
        int i6 = bufferInfo.size;
        if (i6 < ((i2 * i3) * 3) / 2) {
            Logging.m88098e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        if (i6 < ((i4 * i3) * 3) / 2 && i5 == i3 && i4 > i2) {
            i4 = (i6 * 2) / (i3 * 3);
        }
        int i7 = i4;
        try {
            byteBuffer = this.codec.getOutputBuffers()[i];
        } catch (IllegalStateException e) {
            Logging.m88099e(TAG, "getOutputBuffers failed", e);
            byteBuffer = null;
        }
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        int i8 = this.colorFormat;
        if (i8 == 19) {
            hardwareVideoDecoder = this;
            bufferCopyNV21ToI420Buffer = hardwareVideoDecoder.copyI420Buffer(byteBufferSlice, i7, i5, i2, i3);
        } else {
            hardwareVideoDecoder = this;
            bufferCopyNV21ToI420Buffer = (hardwareVideoDecoder.isHisiCodec && i8 == 39) ? hardwareVideoDecoder.copyNV21ToI420Buffer(byteBufferSlice, i7, i5, i2, i3) : hardwareVideoDecoder.copyNV12ToI420Buffer(byteBufferSlice, i7, i5, i2, i3);
        }
        try {
            hardwareVideoDecoder.codec.releaseOutputBuffer(i, false);
        } catch (IllegalStateException e2) {
            Logging.m88099e(TAG, "deliverByteFrame failed", e2);
        } catch (Exception e3) {
            Logging.m88099e(TAG, "deliverByteFrame error", e3);
        }
        int size = hardwareVideoDecoder.decodeTimeStamps.size();
        TimeStamps timeStampsPoll = hardwareVideoDecoder.decodeTimeStamps.poll();
        if (timeStampsPoll == null) {
            Logging.m88098e(TAG, "deliverByteFrame cannot find presentationTimeUs.");
            return;
        }
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - timeStampsPoll.prevElapsedRealtime);
        long j = bufferInfo.presentationTimeUs;
        if (j == 0) {
            j = timeStampsPoll.presentationTimeStampUs;
        }
        VideoFrame videoFrame2 = new VideoFrame(bufferCopyNV21ToI420Buffer, timeStampsPoll.rotation, 1000 * j);
        CodecSpecificInfo codecSpecificInfoRemove = hardwareVideoDecoder.codecSpecificInfoMap.remove(Long.valueOf(j));
        FrameExtraInfo frameExtraInfoRemove = hardwareVideoDecoder.bframeExtraInfoMap.remove(Long.valueOf(j));
        if (frameExtraInfoRemove == null) {
            Logging.m88098e(TAG, "HW frameExtraInfo empty. cannot find: " + j);
            hardwareVideoDecoder.fallbackByCodecError = true;
            videoFrame2.release();
            return;
        }
        if (codecSpecificInfoRemove == null) {
            Logging.m88098e(TAG, "HW decodeTimeStamps empty. cannot find: " + j);
        }
        int iElapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - timeStampsPoll.prevElapsedRealtime);
        if (iElapsedRealtime2 > hardwareVideoDecoder.maxDecodeTimeMs) {
            if (MediaCodecUtils.useHighLatencyStrategy() && hardwareVideoDecoder.deliveredCount >= 8) {
                hardwareVideoDecoder.highLatencyTrigger = true;
                hardwareVideoDecoder.deliveredCount = 0;
            }
            Logging.m88102w(TAG, "Very high decode time: " + iElapsedRealtime2 + "ms.");
            iElapsedRealtime2 = hardwareVideoDecoder.maxDecodeTimeMs;
        }
        int i9 = iElapsedRealtime2;
        if (hardwareVideoDecoder.running) {
            videoFrame = videoFrame2;
            hardwareVideoDecoder.callback.onDecodedFrame(videoFrame, Integer.valueOf(iElapsedRealtime), null, i9, size, hardwareVideoDecoder.supportCodecs, codecSpecificInfoRemove, frameExtraInfoRemove);
        } else {
            videoFrame = videoFrame2;
        }
        videoFrame.release();
        debug_log("frame delivered to native, pts_us: " + timeStampsPoll.presentationTimeStampUs + "decode delay time: " + i9 + "ms, deliveredCount: " + hardwareVideoDecoder.deliveredCount);
        hardwareVideoDecoder.deliveredCount = hardwareVideoDecoder.deliveredCount + 1;
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        synchronized (this.dimensionLock) {
            i2 = this.width;
            i3 = this.height;
        }
        int size = this.decodeTimeStamps.size();
        TimeStamps timeStampsPoll = this.decodeTimeStamps.poll();
        if (timeStampsPoll == null) {
            Logging.m88098e(TAG, "deliverTextureFrame cannot find presentationTimeUs.");
            return;
        }
        DecodedTextureMetadata decodedTextureMetadata = new DecodedTextureMetadata(i, i2, i3, timeStampsPoll.rotation, timeStampsPoll.presentationTimeStampUs, Integer.valueOf((int) (SystemClock.elapsedRealtime() - timeStampsPoll.prevElapsedRealtime)), size, timeStampsPoll.prevElapsedRealtime, bufferInfo.presentationTimeUs);
        synchronized (this.textureMetadataLock) {
            this.dequeuedSurfaceOutputBuffers.offer(decodedTextureMetadata);
            maybeRenderDecodedTextureBuffer();
            if (this.dequeuedSurfaceOutputBuffers.size() >= 3) {
                DecodedTextureMetadata decodedTextureMetadataPoll = this.dequeuedSurfaceOutputBuffers.poll();
                debug_log("drop the oldest output frame in cache, pts_us: " + decodedTextureMetadataPoll.presentationTimestampUs);
                try {
                    this.codec.releaseOutputBuffer(decodedTextureMetadataPoll.outputBufferIndex, false);
                } catch (IllegalStateException e) {
                    Logging.m88099e(TAG, "deliverTextureFrame failed", e);
                }
            }
        }
    }

    private void deliverToDirectSurface(int i, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.codec.releaseOutputBuffer(i, true);
        } catch (IllegalStateException e) {
            Logging.m88099e(TAG, "deliverToDirectSurface failed", e);
        }
    }

    private VideoCodecStatus initDecodeInternal(VideoDecoder.Settings settings) {
        MediaCodecInfo.CodecCapabilities codecInfo;
        String str;
        Logging.m88100i(TAG, "initDecodeInternal");
        if (this.proxyThreadHandler == null) {
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        if (this.outputThread != null) {
            Logging.m88098e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        Boolean bool = codecUnavailableMap.get(this.codecName);
        if (bool != null && bool.booleanValue()) {
            Logging.m88098e(TAG, "initDecodeInternal failed, by createByCodecName.");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        int i = settings.width;
        this.width = i;
        int i2 = settings.height;
        this.height = i2;
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            try {
                surfaceTextureHelper.setTextureSize(i, i2);
            } catch (IllegalArgumentException e) {
                Logging.m88099e(TAG, "setTextureSize:", e);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        this.stride = this.width;
        this.sliceHeight = this.height;
        this.hasDecodedFirstFrame = false;
        this.deliveredCount = 0;
        this.highLatencyTrigger = false;
        this.keyFrameRequired = true;
        this.deliveredVideoFrame = false;
        this.shouldResetCodec = false;
        this.fallbackByCodecError = false;
        this.firstDecoderQueueFullMs = -1L;
        String str2 = this.codecName;
        if (str2 == null || (str = Build.HARDWARE) == null || !str2.startsWith("OMX.hisi.") || !str.startsWith("bigfish")) {
            this.isHisiCodec = false;
        } else {
            this.isHisiCodec = true;
            Logging.m88100i(TAG, " bigfish isHisiCodec: " + this.isHisiCodec);
        }
        try {
            VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoDecoder.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() throws Exception {
                    VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.OK;
                    try {
                        HardwareVideoDecoder hardwareVideoDecoder = HardwareVideoDecoder.this;
                        hardwareVideoDecoder.codec = hardwareVideoDecoder.mediaCodecWrapperFactory.createByCodecName(HardwareVideoDecoder.this.codecName);
                        return videoCodecStatus2;
                    } catch (Exception unused) {
                        Logging.m88098e(HardwareVideoDecoder.TAG, "Cannot create media decoder " + HardwareVideoDecoder.this.codecName);
                        return VideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                }
            });
            if (videoCodecStatus == null) {
                codecUnavailableMap.put(this.codecName, Boolean.TRUE);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            if (videoCodecStatus != VideoCodecStatus.OK) {
                codecUnavailableMap.put(this.codecName, Boolean.TRUE);
                return videoCodecStatus;
            }
            try {
                codecInfo = this.codec.getCodecInfo(this.codecType.mimeType());
            } catch (Exception unused) {
                Logging.m88098e(TAG, "Cannot get CodecInfo " + this.codecName);
                codecInfo = null;
            }
            readVideoCapabilities(codecInfo);
            final MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
            if (this.sharedContext == null && this.directSurface == null) {
                mediaFormatCreateVideoFormat.setInteger("color-format", this.colorFormat);
            }
            if (Build.VERSION.SDK_INT >= 30 && isSupportedLowLatency(codecInfo)) {
                mediaFormatCreateVideoFormat.setInteger(FEATURE_LowLatency, 1);
            }
            if (HdrUtil.is10BitLumaDepth(this.transfer)) {
                mediaFormatCreateVideoFormat.setByteBuffer("hdr-static-info", MediaCodecUtils.getHdrStaticInfo());
            }
            String str3 = this.params.get(VideoCodecInfo.KEY_AV_DEC_VIDEO_HWDEC_CONFIG);
            this.customConfigJson = str3;
            MediaCodecUtils.applyCustomConfig(mediaFormatCreateVideoFormat, str3);
            Logging.m88102w(TAG, "Format: " + mediaFormatCreateVideoFormat);
            try {
                VideoCodecStatus videoCodecStatus2 = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoDecoder.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public VideoCodecStatus call() throws Exception {
                        try {
                            HardwareVideoDecoder.this.codec.configure(mediaFormatCreateVideoFormat, HardwareVideoDecoder.this.surface, null, MediaCodecUtils.applyCustomFlags(HardwareVideoDecoder.this.customConfigJson));
                            HardwareVideoDecoder.this.codec.start();
                            return VideoCodecStatus.OK;
                        } catch (Throwable th) {
                            Logging.m88098e(HardwareVideoDecoder.TAG, "initDecode failed" + th.getMessage());
                            HardwareVideoDecoder.this.release();
                            return VideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                    }
                });
                if (videoCodecStatus2 == null) {
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                VideoCodecStatus videoCodecStatus3 = VideoCodecStatus.OK;
                if (videoCodecStatus2 != videoCodecStatus3) {
                    return videoCodecStatus2;
                }
                synchronized (this.textureMetadataLock) {
                    this.dequeuedSurfaceOutputBuffers.clear();
                }
                this.proxyThreadHandler.post(new Runnable() { // from class: io.agora.base.internal.video.HardwareVideoDecoder.3
                    @Override // java.lang.Runnable
                    public void run() {
                        HardwareVideoDecoder.this.supportCodecs = VideoDecoderUtils.getSupportedDecoders();
                    }
                });
                this.running = true;
                Thread threadCreateOutputThread = createOutputThread();
                this.outputThread = threadCreateOutputThread;
                threadCreateOutputThread.start();
                Logging.m88100i(TAG, "initDecodeInternal " + this.codecType.mimeType() + " done, format: " + mediaFormatCreateVideoFormat + " transfer: " + this.transfer);
                return videoCodecStatus3;
            } catch (Exception unused2) {
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception unused3) {
            codecUnavailableMap.put(this.codecName, Boolean.TRUE);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportedColorFormatHDR(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS_HDR) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportedLowLatency(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (codecCapabilities == null) {
            return false;
        }
        try {
            return codecCapabilities.isFeatureSupported(FEATURE_LowLatency);
        } catch (Exception e) {
            Logging.m88098e(TAG, "Cannot get LowLatency: " + e.getMessage());
            return false;
        }
    }

    private void maybeRenderDecodedTextureBuffer() {
        if (this.renderedTextureMetadata != null) {
            return;
        }
        if (!this.running) {
            Logging.m88100i(TAG, "RenderTexture: Decoder is not running.");
            return;
        }
        DecodedTextureMetadata decodedTextureMetadataPoll = this.dequeuedSurfaceOutputBuffers.poll();
        if (decodedTextureMetadataPoll == null) {
            return;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            try {
                surfaceTextureHelper.setTextureSize(decodedTextureMetadataPoll.width, decodedTextureMetadataPoll.height);
                this.surfaceTextureHelper.setFrameRotation(decodedTextureMetadataPoll.rotation);
            } catch (IllegalArgumentException e) {
                Logging.m88099e(TAG, "setTextureSize:", e);
            }
        }
        this.renderedTextureMetadata = decodedTextureMetadataPoll;
        debug_log("render output buffer to surface, pts_us: " + decodedTextureMetadataPoll.presentationTimestampUs);
        try {
            this.codec.releaseOutputBuffer(decodedTextureMetadataPoll.outputBufferIndex, true);
        } catch (IllegalStateException e2) {
            Logging.m88099e(TAG, "deliverToDirectSurface failed", e2);
        } catch (Exception e3) {
            Logging.m88099e(TAG, "deliverToDirectSurface error", e3);
        }
    }

    private void parseTextureCopyFromParam() {
        try {
            String str = this.params.get(VideoCodecInfo.KEY_AV_DEC_VIDEO_TEXTURE_COPY_ENABLE);
            Boolean boolValueOf = str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
            if (boolValueOf != null) {
                this.textureCopy = boolValueOf.booleanValue();
            }
            Logging.m88100i(TAG, "parse hwdec textureCopy success, value : " + this.textureCopy);
        } catch (Exception unused) {
            Logging.m88100i(TAG, "fail to convert hwdec textureCopy");
        }
    }

    private void readVideoCapabilities(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return;
        }
        Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        int iIntValue4 = 0;
        if (supportedWidths != null) {
            iIntValue2 = ((Integer) supportedWidths.getUpper()).intValue();
            iIntValue = ((Integer) supportedWidths.getLower()).intValue();
        } else {
            iIntValue = 0;
            iIntValue2 = 0;
        }
        Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedHeights != null) {
            iIntValue4 = ((Integer) supportedHeights.getUpper()).intValue();
            iIntValue3 = ((Integer) supportedHeights.getLower()).intValue();
        } else {
            iIntValue3 = 0;
        }
        Logging.m88100i(TAG, this.codecType.mimeType() + "  max supported size:" + iIntValue2 + BaseSei.f14624X + iIntValue4 + " min supported size:" + iIntValue + BaseSei.f14624X + iIntValue3);
        StringBuilder sb = new StringBuilder("max supported instance: ");
        sb.append(codecCapabilities.getMaxSupportedInstances());
        Logging.m88100i(TAG, sb.toString());
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m88100i(TAG, "Decoder format changed: " + mediaFormat.toString());
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                if (this.hasDecodedFirstFrame && (this.width != integer || this.height != integer2)) {
                    Logging.m88102w(TAG, "Configured size change, " + this.width + "*" + this.height + ". New " + integer + "*" + integer2);
                }
                this.width = integer;
                this.height = integer2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.surfaceTextureHelper == null && this.directSurface == null && mediaFormat.containsKey("color-format")) {
            int integer3 = mediaFormat.getInteger("color-format");
            Logging.m88100i(TAG, "reformat, Color: 0x" + Integer.toHexString(integer3));
            if (this.isHisiCodec && integer3 == 47) {
                this.colorFormat = 39;
            } else {
                this.colorFormat = integer3;
            }
            if (!isSupportedColorFormat(this.colorFormat)) {
                stopOnOutputThread(new IllegalStateException("Unsupported color format: " + this.colorFormat));
                return;
            }
        }
        synchronized (this.dimensionLock) {
            try {
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                    this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                }
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                }
                Logging.m88100i(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i) {
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (videoCodecStatusReleaseInternal != VideoCodecStatus.OK) {
            return videoCodecStatusReleaseInternal;
        }
        this.transfer = i;
        if (this.surface != null && this.directSurface == null) {
            releaseSurface();
            this.surface = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.textureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.codecSpecificInfoMap.clear();
        return initDecode(this.settings, this.callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m88100i(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m88099e(TAG, "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m88099e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        synchronized (this.textureMetadataLock) {
            this.dequeuedSurfaceOutputBuffers.clear();
        }
        Logging.m88100i(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        VideoCodecStatus videoCodecStatus;
        if (!this.running) {
            Logging.m88100i(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
                Logging.m88099e(TAG, "Media decoder release timeout", new RuntimeException());
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else {
                if (this.shutdownException == null) {
                    Object[] objArr = objArr == true ? 1 : 0;
                    return VideoCodecStatus.OK;
                }
                Logging.m88099e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
            return videoCodecStatus;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus attachProxyThread() {
        if (this.proxyThreadHandler == null) {
            Logging.m88100i(TAG, "attach decoder proxyThread");
            try {
                HandlerThread handlerThread = new HandlerThread("proxyThread-Decoder");
                handlerThread.start();
                this.proxyThreadHandler = new Handler(handlerThread.getLooper());
            } catch (Exception e) {
                Logging.m88102w(TAG, "attach decoder proxyThread fail!, " + e.getMessage());
            }
        }
        return VideoCodecStatus.OK;
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public long createNativeVideoDecoder() {
        return 0L;
    }

    @Nullable
    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext, 16, this.transfer);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus decode(final EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, final CodecSpecificInfo codecSpecificInfo, final FrameExtraInfo frameExtraInfo) {
        int i;
        int i2;
        if (this.codec == null || this.callback == null || this.proxyThreadHandler == null || !this.running) {
            StringBuilder sb = new StringBuilder("decode uninitalized, codec: ");
            sb.append(this.codec != null);
            sb.append(", callback: ");
            sb.append(this.callback);
            Logging.m88100i(TAG, sb.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.m88098e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        final int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            Logging.m88098e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            i = this.width;
            i2 = this.height;
        }
        VideoFrame.ColorSpace colorSpace = encodedImage.colorSpace;
        if (colorSpace != null && colorSpace.getTransfer().getTransfer() != this.transfer && HdrUtil.is10BitLumaDepth(encodedImage.colorSpace.getTransfer().getTransfer())) {
            Logging.m88098e(TAG, "decode() - transfer change: " + encodedImage.colorSpace.getTransfer().getTransfer() + " should reset codec.");
            VideoCodecStatus videoCodecStatusReinitDecode = reinitDecode(encodedImage.colorSpace.getTransfer().getTransfer());
            return videoCodecStatusReinitDecode != VideoCodecStatus.OK ? videoCodecStatusReinitDecode : VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        if (this.highLatencyTrigger) {
            Logging.m88098e(TAG, "decode() - codec high delay trigger, should reset codec.");
            this.highLatencyTrigger = false;
            VideoCodecStatus videoCodecStatusReinitDecode2 = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight);
            return videoCodecStatusReinitDecode2 != VideoCodecStatus.OK ? videoCodecStatusReinitDecode2 : VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        int i3 = encodedImage.encodedWidth;
        int i4 = encodedImage.encodedHeight;
        if ((i3 * i4 > 0 && (i3 != i || i4 != i2)) || this.shouldResetCodec) {
            Logging.m88102w(TAG, "decode() - reinitDecode.");
            VideoCodecStatus videoCodecStatusReinitDecode3 = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight);
            if (videoCodecStatusReinitDecode3 != VideoCodecStatus.OK) {
                return videoCodecStatusReinitDecode3;
            }
        }
        if (this.inputDropCount > 5) {
            release();
            Logging.m88102w(TAG, "Fallback to software, no input buffers available");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        long j = 0;
        if (this.decodeTimeStamps.size() > 5) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.firstDecoderQueueFullMs < 0) {
                this.firstDecoderQueueFullMs = jCurrentTimeMillis;
            }
            if (jCurrentTimeMillis - this.firstDecoderQueueFullMs > 2000) {
                Logging.m88098e(TAG, "Fallback to software, decoder queue full");
                release();
                return VideoCodecStatus.ERROR_CODEC_OUTPUT_FAILURE;
            }
        }
        if (this.fallbackByCodecError) {
            release();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        if (this.callback != null) {
            if (codecSpecificInfo != null) {
                j = codecSpecificInfo.opaque;
            } else {
                Logging.m88098e(TAG, "onDecodeBufferPrepared fail, cannot get opaque.");
            }
            this.callback.onDecodeBufferPrepared(j);
        }
        if (this.keyFrameRequired) {
            if (encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                Logging.m88098e(TAG, "decode() - key frame required first");
                return VideoCodecStatus.NO_OUTPUT;
            }
            if (!encodedImage.completeFrame) {
                Logging.m88098e(TAG, "decode() - complete frame required first");
                return VideoCodecStatus.NO_OUTPUT;
            }
        }
        try {
            VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoDecoder.4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() throws Exception {
                    long j2;
                    try {
                        int iDequeueInputBuffer = HardwareVideoDecoder.this.codec.dequeueInputBuffer(500000L);
                        HardwareVideoDecoder hardwareVideoDecoder = HardwareVideoDecoder.this;
                        if (iDequeueInputBuffer == -1) {
                            HardwareVideoDecoder.access$708(hardwareVideoDecoder);
                            Logging.m88100i(HardwareVideoDecoder.TAG, "Dropped frame, no input buffers available");
                            return VideoCodecStatus.NO_OUTPUT;
                        }
                        hardwareVideoDecoder.inputDropCount = 0;
                        if (iDequeueInputBuffer < 0) {
                            Logging.m88098e(HardwareVideoDecoder.TAG, "decode() - no HW buffers available; decoder falling behind");
                            return VideoCodecStatus.ERROR;
                        }
                        try {
                            ByteBuffer byteBuffer2 = HardwareVideoDecoder.this.codec.getInputBuffers()[iDequeueInputBuffer];
                            if (byteBuffer2.capacity() < iRemaining) {
                                Logging.m88098e(HardwareVideoDecoder.TAG, "decode() - HW buffer too small");
                                return VideoCodecStatus.ERROR;
                            }
                            byteBuffer2.put(encodedImage.buffer);
                            long jAccess$804 = encodedImage.captureTimeNs / 1000;
                            long j3 = HardwareVideoDecoder.this.lastPresentationTimestampUs;
                            HardwareVideoDecoder hardwareVideoDecoder2 = HardwareVideoDecoder.this;
                            if (j3 == jAccess$804) {
                                jAccess$804 = HardwareVideoDecoder.access$804(hardwareVideoDecoder2);
                            } else {
                                hardwareVideoDecoder2.lastPresentationTimestampUs = jAccess$804;
                            }
                            long j4 = jAccess$804;
                            TimeStamps timeStamps = null;
                            try {
                                CodecSpecificInfo codecSpecificInfo2 = codecSpecificInfo;
                                if (codecSpecificInfo2 != null) {
                                    codecSpecificInfo2.elapsedRealtime = SystemClock.elapsedRealtime();
                                    HardwareVideoDecoder.this.codecSpecificInfoMap.put(Long.valueOf(j4), codecSpecificInfo);
                                } else {
                                    HardwareVideoDecoder.this.codecSpecificInfoMap.put(Long.valueOf(j4), new CodecSpecificInfo(null, SystemClock.elapsedRealtime()));
                                }
                                j2 = j4;
                                try {
                                    timeStamps = new TimeStamps(SystemClock.elapsedRealtime(), j2, encodedImage.rotation);
                                    HardwareVideoDecoder.this.decodeTimeStamps.add(timeStamps);
                                    HardwareVideoDecoder.this.bframeExtraInfoMap.put(Long.valueOf(j2), frameExtraInfo);
                                    HardwareVideoDecoder.debug_log("queue input buffer, pts_us: " + j2);
                                    j4 = j2;
                                    HardwareVideoDecoder.this.codec.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, j4, 0);
                                    if (HardwareVideoDecoder.this.keyFrameRequired) {
                                        HardwareVideoDecoder.this.keyFrameRequired = false;
                                    }
                                    return VideoCodecStatus.OK;
                                } catch (RuntimeException e) {
                                    e = e;
                                    Logging.m88099e(HardwareVideoDecoder.TAG, "queueInputBuffer failed", e);
                                    HardwareVideoDecoder.this.codecSpecificInfoMap.remove(Long.valueOf(j2));
                                    HardwareVideoDecoder.this.bframeExtraInfoMap.remove(Long.valueOf(j2));
                                    HardwareVideoDecoder.this.decodeTimeStamps.remove(timeStamps);
                                    return !HardwareVideoDecoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e);
                                }
                            } catch (RuntimeException e2) {
                                e = e2;
                                j2 = j4;
                            }
                        } catch (IllegalStateException e3) {
                            Logging.m88099e(HardwareVideoDecoder.TAG, "getInputBuffers failed", e3);
                            return !HardwareVideoDecoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e3);
                        }
                    } catch (IllegalStateException e4) {
                        Logging.m88099e(HardwareVideoDecoder.TAG, "dequeueInputBuffer failed", e4);
                        return !HardwareVideoDecoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e4);
                    }
                }
            });
            return videoCodecStatus == null ? VideoCodecStatus.FALLBACK_SOFTWARE : videoCodecStatus;
        } catch (Exception unused) {
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.dequeueOutputTimeUs);
            debug_log("dequeue output buffer, pts_us: " + bufferInfo.presentationTimeUs + " result: " + iDequeueOutputBuffer);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (iDequeueOutputBuffer < 0) {
                return;
            }
            if (bufferInfo.presentationTimeUs == 0) {
                Logging.m88100i(TAG, "dequeueOutputBuffer fail, presentationTimeUs is 0.");
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, this.directSurface != null);
                return;
            }
            this.hasDecodedFirstFrame = true;
            this.firstDecoderQueueFullMs = -1L;
            if (this.directSurface != null) {
                deliverToDirectSurface(iDequeueOutputBuffer, bufferInfo);
            } else if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(iDequeueOutputBuffer, bufferInfo);
            } else {
                deliverByteFrame(iDequeueOutputBuffer, bufferInfo);
            }
            this.deliveredVideoFrame = true;
        } catch (IllegalStateException e) {
            Logging.m88099e(TAG, "deliverDecodedFrame failed", e);
            if (!this.deliveredVideoFrame) {
                this.fallbackByCodecError = true;
            } else if (MediaCodecUtils.isMediaCodecException(e) != VideoCodecStatus.ERROR) {
                this.fallbackByCodecError = true;
            } else {
                this.shouldResetCodec = true;
            }
        } catch (Exception e2) {
            this.fallbackByCodecError = true;
            Logging.m88099e(TAG, "deliverDecodedFrame error", e2);
        }
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus detachProxyThread() {
        Handler handler = this.proxyThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.proxyThreadHandler.getLooper().quitSafely();
            this.proxyThreadHandler = null;
            Logging.m88100i(TAG, "detach decoder proxyThread");
        }
        return VideoCodecStatus.OK;
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public String getImplementationName() {
        return "HWDecoder";
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        if (this.running) {
            Logging.m88102w(TAG, "already initialized!");
            return VideoCodecStatus.OK;
        }
        this.callback = callback;
        this.settings = settings;
        parseTextureCopyFromParam();
        if (VideoDecoderUtils.IsSupportDecodeHEVC10Bit() && settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth() && this.transfer == VideoFrame.ColorSpace.Transfer.Unspecified.getTransfer()) {
            this.transfer = VideoFrame.ColorSpace.Transfer.SMPTEST2084.getTransfer();
        }
        Surface surface = this.directSurface;
        if (surface != null) {
            this.surface = surface;
        } else if (this.sharedContext != null) {
            SurfaceTextureHelper surfaceTextureHelperCreateSurfaceTextureHelper = createSurfaceTextureHelper();
            this.surfaceTextureHelper = surfaceTextureHelperCreateSurfaceTextureHelper;
            if (surfaceTextureHelperCreateSurfaceTextureHelper == null) {
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
            this.surfaceTextureHelper.setLumaBitDepth(settings.lumaBitDepth);
        } else if (settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
            Logging.m88102w(TAG, "initDecodeInternal fail, raw data format not supported!");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        return initDecodeInternal(settings);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public boolean isHardwareDecoder() {
        return true;
    }

    @Override // io.agora.base.internal.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j;
        long j2;
        Integer num;
        long j3;
        CodecSpecificInfo codecSpecificInfoRemove;
        int size = this.codecSpecificInfoMap.size();
        synchronized (this.textureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j = decodedTextureMetadata.infoPresentationTimeUs;
            DecodedTextureMetadata decodedTextureMetadata2 = this.renderedTextureMetadata;
            j2 = decodedTextureMetadata2.presentationTimestampUs;
            num = decodedTextureMetadata2.decodeTimeMs;
            num.intValue();
            DecodedTextureMetadata decodedTextureMetadata3 = this.renderedTextureMetadata;
            j3 = decodedTextureMetadata3.prevElapsedRealtime;
            int i = decodedTextureMetadata3.delaySize;
            codecSpecificInfoRemove = this.codecSpecificInfoMap.remove(Long.valueOf(decodedTextureMetadata3.presentationTimestampUs));
            this.renderedTextureMetadata = null;
            maybeRenderDecodedTextureBuffer();
        }
        long j4 = j == 0 ? j2 : j;
        VideoFrame videoFrame2 = new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j2 * 1000);
        FrameExtraInfo frameExtraInfoRemove = this.bframeExtraInfoMap.remove(Long.valueOf(j4));
        if (frameExtraInfoRemove == null) {
            Logging.m88098e(TAG, "HW frameExtraInfo empty. cannot find: " + j4);
            this.fallbackByCodecError = true;
            videoFrame.release();
            return;
        }
        if (codecSpecificInfoRemove == null) {
            Logging.m88098e(TAG, "HW decodeTimeStamps empty. cannot find: " + j4);
        }
        int iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j3);
        if (iElapsedRealtime > this.maxDecodeTimeMs) {
            if (MediaCodecUtils.useHighLatencyStrategy() && this.deliveredCount >= 8) {
                this.highLatencyTrigger = true;
                this.deliveredCount = 0;
            }
            Logging.m88102w(TAG, "Very high decode time: " + iElapsedRealtime + "ms.");
            iElapsedRealtime = this.maxDecodeTimeMs;
        }
        boolean z = (codecSpecificInfoRemove != null && codecSpecificInfoRemove.getVideoCodecType() == VideoCodecType.H265 && (codecSpecificInfoRemove.getVideoCodecProfile() == VideoCodecProfile.HEVCMain10 || codecSpecificInfoRemove.getVideoCodecProfile() == VideoCodecProfile.HEVCMain10HDR10 || codecSpecificInfoRemove.getVideoCodecProfile() == VideoCodecProfile.HEVCMain10HDR10Plus)) || HdrUtil.is10BitLumaDepth(this.transfer) || HdrUtil.isNeedHdrSdrTrans(this.transfer);
        if (this.deliveredCount == 0) {
            Logging.m88100i(TAG, "directOes: " + z + ", transfer: " + this.transfer + " is10BitLumaDepth: " + HdrUtil.is10BitLumaDepth(this.transfer) + " textureCopy: " + this.textureCopy);
        }
        if (z || !this.textureCopy) {
            int i2 = iElapsedRealtime;
            VideoFrame videoFrame3 = new VideoFrame(videoFrame2.getBuffer(), videoFrame2.getRotation(), videoFrame2.getTimestampNs());
            if (this.running) {
                this.callback.onDecodedFrame(videoFrame3, num, null, i2, size, this.supportCodecs, codecSpecificInfoRemove, frameExtraInfoRemove);
            }
            videoFrame3.release();
            debug_log("frame delivered to native by direct oes, pts_us: " + j4);
            this.deliveredCount = this.deliveredCount + 1;
            return;
        }
        VideoFrame.TextureBuffer textureBufferTextureCopy = this.surfaceTextureHelper.textureCopy((VideoFrame.TextureBuffer) videoFrame2.getBuffer(), this.transfer);
        if (textureBufferTextureCopy == null) {
            Logging.m88100i(TAG, "failed to copy texture buffer, drop frame");
            return;
        }
        int i3 = iElapsedRealtime;
        VideoFrame videoFrame4 = new VideoFrame(textureBufferTextureCopy, videoFrame2.getRotation(), videoFrame2.getTimestampNs());
        if (this.running) {
            this.callback.onDecodedFrame(videoFrame4, num, null, i3, size, this.supportCodecs, codecSpecificInfoRemove, frameExtraInfoRemove);
        }
        videoFrame4.release();
        debug_log("frame delivered to native, pts_us: " + j4 + "decode delay time: " + i3 + "ms, deliveredCount: " + this.deliveredCount);
        this.deliveredCount = this.deliveredCount + 1;
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus release() {
        Logging.m88100i(TAG, "release");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (this.surface != null && this.directSurface == null) {
            releaseSurface();
            this.surface = null;
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
                this.surfaceTextureHelper.dispose();
                this.surfaceTextureHelper = null;
            }
        }
        synchronized (this.textureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.deliveredVideoFrame = false;
        this.shouldResetCodec = false;
        this.fallbackByCodecError = false;
        this.codecSpecificInfoMap.clear();
        this.decodeTimeStamps.clear();
        this.deliveredCount = 0;
        this.inputDropCount = 0;
        this.highLatencyTrigger = false;
        this.firstDecoderQueueFullMs = -1L;
        return videoCodecStatusReleaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        VideoDecoder.Callback callback = this.callback;
        if (callback != null) {
            callback.onDecodeReset();
        }
        if (videoCodecStatusReleaseInternal != VideoCodecStatus.OK) {
            return videoCodecStatusReleaseInternal;
        }
        VideoDecoder.Settings settings = this.settings;
        settings.width = i;
        settings.height = i2;
        return initDecodeInternal(settings);
    }
}
