package com.bytedance.realx.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.bytedance.realx.RXVideoSurfaceController;
import com.bytedance.realx.base.RXDeviceInfoAndroid;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.memory.NativeRXByteMemory;
import com.bytedance.realx.video.memory.NativeRXOpenGLMemory;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.bytedance.realx.video.memory.RXVideoMemoryInterface;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.exoplayer2.PlaybackException;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import p153l.za50;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
class HardwareVideoEncoder extends MediaCodec.Callback implements VideoEncoder {
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US_RELEASE_ASYNC = 40000;
    private static final int DTS_OFFSET_FRAME_NUM = 7;
    private static final String KEY_HISI_EXT_CODEC_MAX_QP = "vendor.hisi.hisi-ext-codec-max-qp";
    private static final String KEY_HISI_EXT_CODEC_MIN_QP = "vendor.hisi.hisi-ext-codec-min-qp";
    private static final String KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES = "vendor.hisi.hisi-ext-codec-non-ref-p-frames";
    private static final String KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES_SUPPORTED = "vendor.hisi.hisi-ext-codec-non-ref-p-frames-supported";
    private static final String KEY_HISI_EXT_CODEC_QP_REGULATION_SUPPORETD = "vendor.hisi.hisi-ext-codec-qp-regulation-supported";
    private static final String KEY_HISI_EXT_CODEC_VENDOR_CONFIGURE = "vendor.hisi.hisi-ext-codec-vendor-configure";
    private static final String KEY_PRIVATE_PARAM_CHECK_SVC_LAYER = "realx.check.svc.layer";
    private static final String KEY_PRIVATE_PARAM_FORCE_SURFACE_INPUT = "realx.force.surface.input";
    private static final String KEY_PRIVATE_PARAM_GLCLEAR = "realx.glclear";
    private static final String KEY_PRIVATE_PARAM_NATIVE_RENDER = "realx.native.render";
    private static final String KEY_PRIVATE_PARAM_RELEASE_ASYNC = "realx.release.async";
    private static final int MAX_VIDEO_FRAMERATE = 60;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int RESTART_ENCODER_TIME_THRESHOLD_MS = 5000;
    private static final String TAG = "HardwareVideoEncoder";
    private int adjustedBitrate;
    private Handler asyncHandler;
    private HandlerThread asyncOutputThread;
    private boolean automaticResizeOn;
    private VideoEncoder.BitrateMode bitrateMode;
    private VideoEncoder.Callback callback;
    private final Object callbackLock;
    private boolean checkSVCLayer;

    @Nullable
    private MediaCodecWrapper codec;
    private final RXVideoCodecDesc codecDesc;
    private final String codecName;

    @Nullable
    private ByteBuffer configBuffer;
    private final Deque<Long> dtsQueue;
    private boolean enableGlClear;
    private boolean enableNativeRender;
    private final ThreadUtils.ThreadChecker encodeThreadChecker;
    private boolean encodedFirstFrame;
    private long firstFrameDiffUs;
    private Boolean forceSurfaceInput;
    private final long forcedKeyFrameNs;
    private int height;
    private LinkedList<Integer> inputBuffers;
    private boolean isError;
    private boolean isNeedSurfaceInputWorkaround;
    private boolean isStatisticsEnabled;
    private Boolean isTextureBuffer;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;

    @Nullable
    private Thread outputThread;
    private final ThreadUtils.ThreadChecker outputThreadChecker;
    private HashMap<String, String> privateParams;
    private boolean releaseAsync;
    private volatile boolean running;
    private VideoEncoder.ScaleMode scaleMode;
    private VideoEncoder.Settings settings;
    private EglBase14.Context sharedContext;

    @Nullable
    private volatile Exception shutdownException;
    private final Integer surfaceColorFormat;
    private int svcRealLayerNum;

    @Nullable
    private EglBase14 textureEglBase;

    @Nullable
    private Surface textureInputSurface;
    private int updateBitrate;
    private long updateBitrateTimestamp;
    private boolean useAsyncMode;
    private boolean useSurfaceMode;
    private HashMap<String, String> vpassPrivateParams;
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;
    private GlRectDrawer textureDrawer = null;
    private VideoFrameDrawer videoFrameDrawer = null;
    private long videoFrameDrawerHandler = 0;

    /* JADX INFO: renamed from: com.bytedance.realx.video.HardwareVideoEncoder$2 */
    public static /* synthetic */ class C11602 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile;

        static {
            int[] iArr = new int[RXVideoCodecProfile.values().length];
            $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile = iArr;
            try {
                iArr[RXVideoCodecProfile.ProfileHigh.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileConstrainedHigh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileBaseline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileConstrainedBaseline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ProfileMain.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain10.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[RXVideoCodecProfile.ByteVC1ProfileMain10HDR10.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum YuvFormat {
        I420 { // from class: com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat.1
            @Override // com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface) {
                RXVideoMemoryInterface andRetainVideoFrameMemory;
                if (rXVideoFrameInterface == null || (andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory()) == null) {
                    return;
                }
                if (andRetainVideoFrameMemory.getPixelFormat() == RXPixelFormat.kI420 && (andRetainVideoFrameMemory instanceof NativeRXByteMemory)) {
                    NativeRXByteMemory nativeRXByteMemory = (NativeRXByteMemory) andRetainVideoFrameMemory;
                    YuvHelper.I420Copy(nativeRXByteMemory.getPlaneData(0), nativeRXByteMemory.getPlaneLineSize(0), nativeRXByteMemory.getPlaneData(1), nativeRXByteMemory.getPlaneLineSize(1), nativeRXByteMemory.getPlaneData(2), nativeRXByteMemory.getPlaneLineSize(2), byteBuffer, rXVideoFrameInterface.getWidth(), rXVideoFrameInterface.getHeight());
                } else {
                    RXVideoFrameInterface i420 = rXVideoFrameInterface.toI420();
                    if (i420 == null) {
                        andRetainVideoFrameMemory.release();
                        return;
                    }
                    RXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                    if (andRetainVideoFrameMemory2 == null) {
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else if (!(andRetainVideoFrameMemory2 instanceof NativeRXByteMemory)) {
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else {
                        NativeRXByteMemory nativeRXByteMemory2 = (NativeRXByteMemory) andRetainVideoFrameMemory2;
                        YuvHelper.I420Copy(nativeRXByteMemory2.getPlaneData(0), nativeRXByteMemory2.getPlaneLineSize(0), nativeRXByteMemory2.getPlaneData(1), nativeRXByteMemory2.getPlaneLineSize(1), nativeRXByteMemory2.getPlaneData(2), nativeRXByteMemory2.getPlaneLineSize(2), byteBuffer, i420.getWidth(), i420.getHeight());
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                    }
                }
                andRetainVideoFrameMemory.release();
            }
        },
        NV12 { // from class: com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat.2
            @Override // com.bytedance.realx.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface) {
                RXVideoMemoryInterface andRetainVideoFrameMemory;
                if (rXVideoFrameInterface == null || (andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory()) == null) {
                    return;
                }
                if (andRetainVideoFrameMemory.getPixelFormat() == RXPixelFormat.kNv12 && (andRetainVideoFrameMemory instanceof NativeRXByteMemory)) {
                    NativeRXByteMemory nativeRXByteMemory = (NativeRXByteMemory) andRetainVideoFrameMemory;
                    YuvHelper.NV12Copy(nativeRXByteMemory.getPlaneData(0), nativeRXByteMemory.getPlaneLineSize(0), nativeRXByteMemory.getPlaneData(1), nativeRXByteMemory.getPlaneLineSize(1), byteBuffer, rXVideoFrameInterface.getWidth(), rXVideoFrameInterface.getHeight());
                } else {
                    RXVideoFrameInterface i420 = rXVideoFrameInterface.toI420();
                    if (i420 == null) {
                        andRetainVideoFrameMemory.release();
                        return;
                    }
                    RXVideoMemoryInterface andRetainVideoFrameMemory2 = i420.getAndRetainVideoFrameMemory();
                    if (andRetainVideoFrameMemory2 == null) {
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else if (!(andRetainVideoFrameMemory2 instanceof NativeRXByteMemory)) {
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                        andRetainVideoFrameMemory.release();
                        return;
                    } else {
                        NativeRXByteMemory nativeRXByteMemory2 = (NativeRXByteMemory) andRetainVideoFrameMemory2;
                        YuvHelper.I420ToNV12(nativeRXByteMemory2.getPlaneData(0), nativeRXByteMemory2.getPlaneLineSize(0), nativeRXByteMemory2.getPlaneData(1), nativeRXByteMemory2.getPlaneLineSize(1), nativeRXByteMemory2.getPlaneData(2), nativeRXByteMemory2.getPlaneLineSize(2), byteBuffer, i420.getWidth(), i420.getHeight());
                        andRetainVideoFrameMemory2.release();
                        i420.release();
                    }
                }
                andRetainVideoFrameMemory.release();
            }
        };

        public static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            za50.m219101a("Unsupported colorFormat: ", i);
            return null;
        }

        public abstract void fillBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface);
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, RXVideoCodecDesc rXVideoCodecDesc, Integer num, Integer num2, int i, int i2) {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.encodeThreadChecker = threadChecker;
        this.outputThreadChecker = new ThreadUtils.ThreadChecker();
        this.privateParams = new HashMap<>();
        this.vpassPrivateParams = new HashMap<>();
        this.forceSurfaceInput = null;
        this.isNeedSurfaceInputWorkaround = false;
        this.svcRealLayerNum = 1;
        this.checkSVCLayer = false;
        this.encodedFirstFrame = false;
        this.firstFrameDiffUs = 0L;
        this.dtsQueue = new LinkedBlockingDeque();
        this.releaseAsync = true;
        this.enableGlClear = false;
        this.useAsyncMode = false;
        this.inputBuffers = new LinkedList<>();
        this.isError = false;
        this.callbackLock = new Object();
        this.enableNativeRender = false;
        this.isStatisticsEnabled = false;
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecDesc = rXVideoCodecDesc;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i2);
        String strGetCpuModel = RXDeviceInfoAndroid.GetCpuModel();
        String strGetDeviceModel = RXDeviceInfoAndroid.GetDeviceModel();
        if (strGetCpuModel != null) {
            this.isNeedSurfaceInputWorkaround = strGetCpuModel.contains("MT6785V/CC") || (strGetCpuModel.contains("MT6833V/ZA") && !"RMX3610".equalsIgnoreCase(strGetDeviceModel)) || strGetCpuModel.contains("MT6833V/PNZA") || strGetCpuModel.contains("MT6853V/ZA") || strGetCpuModel.contains("MT6893Z_C/CZA");
        }
        threadChecker.detachThread();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5758a(HardwareVideoEncoder hardwareVideoEncoder, MediaCodecWrapper mediaCodecWrapper) {
        hardwareVideoEncoder.getClass();
        if (mediaCodecWrapper == null) {
            return;
        }
        RXLogging.m5742e(TAG, "mediacodec release start!");
        try {
            mediaCodecWrapper.stop();
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "Media encoder stop failed", e);
        }
        try {
            mediaCodecWrapper.release();
        } catch (Exception e2) {
            RXLogging.m5743e(TAG, "Media encoder release failed", e2);
            hardwareVideoEncoder.shutdownException = e2;
        }
        RXLogging.m5742e(TAG, "mediacodec release end!");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5759b(HardwareVideoEncoder hardwareVideoEncoder, HandlerThread handlerThread) {
        hardwareVideoEncoder.releaseCodecOnOutputThread();
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    private void caculateDts(long j, EncodedImage.Builder builder) {
        if (isBFrameEnabled()) {
            Long lPollLast = this.dtsQueue.pollLast();
            if (lPollLast == null) {
                RXLogging.m5742e(TAG, "dtsQueue is empty.");
                return;
            }
            if (!this.encodedFirstFrame) {
                this.encodedFirstFrame = true;
                this.firstFrameDiffUs = j - lPollLast.longValue();
                RXLogging.m5746w(TAG, "firstFrameDiffUs: " + this.firstFrameDiffUs + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + j);
            }
            long jLongValue = (lPollLast.longValue() + this.firstFrameDiffUs) - ((long) ((PlaybackException.CUSTOM_ERROR_CODE_BASE / this.settings.targetFps) * 7));
            Long lValueOf = Long.valueOf(jLongValue);
            long j2 = j - jLongValue;
            if (jLongValue >= 0 && j2 >= 0) {
                if (j2 == 0) {
                    j2 = 1;
                }
                builder.setCompositionTimeUs(j2);
            } else {
                RXLogging.m5742e(TAG, "ctsUs < 0; " + j2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + lValueOf);
            }
        }
    }

    private boolean canUseSurface() {
        return this.surfaceColorFormat != null;
    }

    private Thread createOutputThread() {
        return new Thread("video_encoded_thread") { // from class: com.bytedance.realx.video.HardwareVideoEncoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    boolean z = HardwareVideoEncoder.this.running;
                    HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                    if (!z) {
                        hardwareVideoEncoder.releaseCodecOnOutputThread();
                        return;
                    }
                    hardwareVideoEncoder.deliverEncodedImage();
                }
            }
        };
    }

    private VideoCodecStatus drainInputData(int i, ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface) {
        int height = ((rXVideoFrameInterface.getHeight() * rXVideoFrameInterface.getWidth()) * 3) / 2;
        long timestampNs = rXVideoFrameInterface.getTimestampNs() / 1000;
        fillInputBuffer(byteBuffer, rXVideoFrameInterface);
        try {
            this.codec.queueInputBuffer(i, 0, height, timestampNs, 0);
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "queueInputBuffer failed", e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void drainOutputData(int i, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        Integer numValueOf;
        ByteBuffer byteBufferSlice;
        MediaFormat outputFormat;
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        int i2 = bufferInfo.flags;
        if ((i2 & 2) != 0) {
            RXLogging.m5744i(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            this.configBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(byteBuffer);
        } else {
            boolean z = (i2 & 1) != 0;
            if (z) {
                RXLogging.m5744i(TAG, "Sync frame generated");
            }
            Integer numValueOf2 = null;
            if (!this.isStatisticsEnabled || (outputFormat = this.codec.getOutputFormat(i)) == null) {
                numValueOf = null;
            } else {
                numValueOf = outputFormat.containsKey("video-qp-average") ? Integer.valueOf(outputFormat.getInteger("video-qp-average")) : null;
                if (outputFormat.containsKey("picture-type")) {
                    numValueOf2 = Integer.valueOf(outputFormat.getInteger("picture-type"));
                }
            }
            if (z && (this.codecDesc.getStandard() == RXVideoCodecStandard.H264 || this.codecDesc.getStandard() == RXVideoCodecStandard.ByteVC1)) {
                RXLogging.m5744i(TAG, "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                byteBufferSlice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                this.configBuffer.rewind();
                byteBufferSlice.put(this.configBuffer);
                byteBufferSlice.put(byteBuffer);
                byteBufferSlice.rewind();
            } else {
                byteBufferSlice = byteBuffer.slice();
            }
            EncodedImage.FrameType frameTypeValueOf = z ? EncodedImage.FrameType.kIntra : EncodedImage.FrameType.kPredicted;
            if (numValueOf2 != null) {
                frameTypeValueOf = EncodedImage.FrameType.valueOf(numValueOf2.intValue());
            }
            EncodedImage.Builder frameType = EncodedImage.builder().setEncodedWidth(this.width).setEncodedHeight(this.height).setCaptureTimeNs(bufferInfo.presentationTimeUs * 1000).setBuffer(byteBufferSlice).setSvcLayerNum(this.checkSVCLayer ? this.svcRealLayerNum : this.settings.temporalLayerNum).setFrameType(frameTypeValueOf);
            if (numValueOf != null && numValueOf.intValue() > 0) {
                frameType.setQp(numValueOf);
            }
            caculateDts(bufferInfo.presentationTimeUs, frameType);
            this.callback.onEncodedFrame(frameType.createEncodedImage(), new VideoEncoder.CodecSpecificInfo(this.codecDesc.getStandard()));
        }
        this.codec.releaseOutputBuffer(i, false);
    }

    private void enableEncodingStatistics(MediaFormat mediaFormat) {
        if (isEncodingStatisticsSupported() && this.settings.isStatisticsEnabled) {
            mediaFormat.setInteger("video-encoding-statistics-level", 1);
            this.isStatisticsEnabled = true;
        }
    }

    private VideoCodecStatus encodeByteBuffer(RXVideoFrameInterface rXVideoFrameInterface) {
        int iDequeueInputBuffer;
        ByteBuffer inputBuffer;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.useAsyncMode) {
            synchronized (this.callbackLock) {
                iDequeueInputBuffer = this.inputBuffers.size() <= 0 ? -1 : this.inputBuffers.removeFirst().intValue();
            }
            if (iDequeueInputBuffer == -1) {
                RXLogging.m5744i(TAG, "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
            } catch (Exception e) {
                RXLogging.m5743e(TAG, "getInputBuffer failed", e);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } else {
            try {
                iDequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
                if (iDequeueInputBuffer == -1) {
                    RXLogging.m5744i(TAG, "Dropped frame, no input buffers available");
                    return VideoCodecStatus.NO_OUTPUT;
                }
                try {
                    inputBuffer = this.codec.getInputBuffers()[iDequeueInputBuffer];
                } catch (Exception e2) {
                    RXLogging.m5743e(TAG, "getInputBuffers failed", e2);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            } catch (Exception e3) {
                RXLogging.m5743e(TAG, "dequeueInputBuffer failed", e3);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        return drainInputData(iDequeueInputBuffer, inputBuffer, rXVideoFrameInterface);
    }

    private VideoCodecStatus encodeTextureBuffer(RXVideoFrameInterface rXVideoFrameInterface) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError != 0) {
                RXLogging.m5742e(TAG, "got egl err:" + iGlGetError);
            }
            if (this.enableGlClear) {
                GLES20.glClear(16384);
            }
            if (this.enableNativeRender) {
                nativeDrawFrame(this.videoFrameDrawerHandler, rXVideoFrameInterface.getNativeHandle(), this.width, this.height);
            } else {
                rXVideoFrameInterface.setRotation(RXVideoRotation.VIDEO_ROTATION_0);
                this.videoFrameDrawer.drawFrame(rXVideoFrameInterface, this.textureDrawer, null);
            }
            this.textureEglBase.swapBuffers(rXVideoFrameInterface.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "encodeTexture failed", e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoCodecStatus initEncodeInternal() {
        MediaFormat outputFormat;
        this.encodeThreadChecker.checkIsOnValidThread();
        this.lastKeyFrameNs = -1L;
        this.privateParams.clear();
        this.privateParams.putAll(this.vpassPrivateParams);
        this.dtsQueue.clear();
        this.isStatisticsEnabled = false;
        synchronized (this.callbackLock) {
            this.inputBuffers.clear();
            this.isError = false;
        }
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecDesc.getStandard().mimeType(), this.width, this.height);
                initMediaFormat(mediaFormatCreateVideoFormat);
                enableEncodingStatistics(mediaFormatCreateVideoFormat);
                RXLogging.m5746w(TAG, "Format: " + mediaFormatCreateVideoFormat);
                if (this.useAsyncMode) {
                    HandlerThread handlerThread = new HandlerThread("asyncOutput");
                    this.asyncOutputThread = handlerThread;
                    handlerThread.start();
                    this.asyncHandler = new Handler(this.asyncOutputThread.getLooper());
                    this.outputThreadChecker.detachThread();
                    this.running = true;
                    this.codec.setCallback(this, this.asyncHandler);
                }
                this.codec.configure(mediaFormatCreateVideoFormat, null, null, 1);
                if (isSvcEnabled() && (outputFormat = this.codec.getOutputFormat()) != null) {
                    this.svcRealLayerNum = parseRealLayerNum(outputFormat);
                    RXLogging.m5746w(TAG, "" + this.svcRealLayerNum + "，output format after configure: " + outputFormat.toString());
                }
                if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    RXVideoSurfaceController.getInstance().setSurface(this.textureInputSurface);
                } else if (this.useSurfaceMode) {
                    this.textureInputSurface = this.codec.createInputSurface();
                    EglBase14 eglBase14 = new EglBase14(this.sharedContext, EglBase.getEGLConfig(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_RECORDABLE));
                    this.textureEglBase = eglBase14;
                    eglBase14.createSurface(this.textureInputSurface);
                    this.textureEglBase.makeCurrent();
                    initFrameDrawer();
                }
                this.codec.start();
                VideoEncoder.Settings settings = this.settings;
                setExtCodecForHisi(settings.maxQp, settings.minQp);
                VideoEncoder.Settings settings2 = this.settings;
                if (settings2.encodeMode == VideoEncoder.EncodeMode.LIVE) {
                    updateBitrate(settings2.targetBps);
                }
                if (!this.useAsyncMode) {
                    this.running = true;
                    this.outputThreadChecker.detachThread();
                    Thread threadCreateOutputThread = createOutputThread();
                    this.outputThread = threadCreateOutputThread;
                    threadCreateOutputThread.start();
                }
                return VideoCodecStatus.OK;
            } catch (Exception e) {
                RXLogging.m5743e(TAG, "initEncodeInternal failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception e2) {
            RXLogging.m5743e(TAG, "Cannot create media encoder " + this.codecName, e2);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void initFrameDrawer() {
        if (this.enableNativeRender) {
            this.videoFrameDrawerHandler = nativeCreateDrawer();
            RXLogging.m5744i(TAG, "created native frame drawer 0x" + Long.toHexString(this.videoFrameDrawerHandler));
            return;
        }
        this.textureDrawer = new GlRectDrawer();
        this.videoFrameDrawer = new VideoFrameDrawer();
        RXLogging.m5744i(TAG, "created java frame drawer " + this.videoFrameDrawer);
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        Integer num = this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat;
        num.intValue();
        RXVideoCodecStandard standard = this.codecDesc.getStandard();
        setIntegerParam(mediaFormat, "bitrate", Integer.valueOf(this.settings.targetBps));
        setIntegerParam(mediaFormat, "color-format", num);
        setIntegerParam(mediaFormat, "frame-rate", Integer.valueOf(this.settings.targetFps));
        int i = this.settings.targetKeyFrameIntervalMs;
        if (i <= 0) {
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(this.keyFrameIntervalSec));
        } else {
            int i2 = i / 1000;
            if (i2 <= 1) {
                i2 = 1;
            }
            setIntegerParam(mediaFormat, "i-frame-interval", Integer.valueOf(i2));
        }
        setBitrateMode(mediaFormat);
        if (this.settings.encodeMode == VideoEncoder.EncodeMode.LIVE) {
            setProfileForLive(mediaFormat);
        } else {
            setProfileForRTC(mediaFormat);
            setColorSpace(mediaFormat);
        }
        setBFrameNumber(mediaFormat);
        setSVCNumber(mediaFormat);
        if (standard != RXVideoCodecStandard.VP8 && this.settings.enableQpSetting) {
            if (this.codecName.contains("OMX.hisi.")) {
                setIntegerParam(mediaFormat, KEY_HISI_EXT_CODEC_VENDOR_CONFIGURE, 1);
            }
            setIPFrameMinMaxQP(mediaFormat);
            if (isBFrameEnabled()) {
                setBFrameMinMaxQP(mediaFormat);
            }
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            RXLogging.m5746w(TAG, "set android hardware encoder private param with Key:" + entry.getKey() + " Value:" + entry.getValue());
            if (isNumeric(entry.getValue())) {
                mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
            } else if (entry.getValue().length() > 0) {
                mediaFormat.setString(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean isBFrameEnabled() {
        return Build.VERSION.SDK_INT >= 29 && this.settings.bFrameNum > 0;
    }

    private boolean isDeviceSupportResetBitrate() {
        return !"M2007J17C".equalsIgnoreCase(RXDeviceInfoAndroid.GetDeviceModel());
    }

    private boolean isEncodingStatisticsSupported() {
        MediaCodecInfo codecInfo;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (this.codecDesc.standard == RXVideoCodecStandard.VP8 || (codecInfo = this.codec.getCodecInfo()) == null || (capabilitiesForType = codecInfo.getCapabilitiesForType(this.codecDesc.standard.mimeType())) == null || Build.VERSION.SDK_INT < 33) {
            return false;
        }
        return capabilitiesForType.isFeatureSupported("encoding-statistics");
    }

    private boolean isForceUseSurfaceInput(int i) {
        if ((this.codecName.toLowerCase().contains("qti") || this.codecName.toLowerCase().contains("qcom")) && isBFrameEnabled()) {
            return true;
        }
        Boolean bool = this.forceSurfaceInput;
        return !(bool == null || !bool.booleanValue() || this.isNeedSurfaceInputWorkaround) || (this.isNeedSurfaceInputWorkaround && i % 16 != 0);
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("[0-9]+");
    }

    private boolean isSvcEnabled() {
        return this.settings.temporalLayerNum > 1;
    }

    public static native long nativeCreateDrawer();

    public static native void nativeDestroyDrawer(long j);

    public static native int nativeDrawFrame(long j, long j2, int i, int i2);

    private int parseRealLayerNum(MediaFormat mediaFormat) {
        String string = mediaFormat.getString("ts-schema");
        if (TextUtils.isEmpty(string) || string.length() < 17) {
            RXLogging.m5746w(TAG, "output temporal str is: " + string);
            return 1;
        }
        String strSubstring = string.substring(16, 17);
        if (isNumeric(strSubstring)) {
            try {
                int i = Integer.parseInt(strSubstring);
                if (i <= this.settings.temporalLayerNum && i > 0) {
                    return i;
                }
            } catch (NumberFormatException e) {
                RXLogging.m5742e(TAG, e.toString());
            }
        }
        RXLogging.m5742e(TAG, "temporal layer invalid: ".concat(string));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        try {
            this.outputThreadChecker.checkIsOnValidThread();
        } catch (IllegalStateException unused) {
            RXLogging.m5742e(TAG, "check thread error.");
        }
        RXLogging.m5744i(TAG, "Releasing MediaCodec on output thread");
        final MediaCodecWrapper mediaCodecWrapper = this.codec;
        this.codec = null;
        if (this.releaseAsync) {
            new Thread(new Runnable() { // from class: com.bytedance.realx.video.d
                @Override // java.lang.Runnable
                public final void run() {
                    HardwareVideoEncoder.m5758a(this.f4781a, mediaCodecWrapper);
                }
            }).start();
        } else if (mediaCodecWrapper != null) {
            try {
                mediaCodecWrapper.stop();
            } catch (Exception e) {
                RXLogging.m5743e(TAG, "Media encoder stop failed", e);
            }
            try {
                mediaCodecWrapper.release();
            } catch (Exception e2) {
                RXLogging.m5743e(TAG, "Media encoder release failed", e2);
                this.shutdownException = e2;
            }
        }
        this.configBuffer = null;
        RXLogging.m5744i(TAG, "Release on output thread done");
    }

    private void releaseFrameDrawer() {
        long j = this.videoFrameDrawerHandler;
        if (j != 0) {
            nativeDestroyDrawer(j);
            RXLogging.m5744i(TAG, "released native frame drawer 0x" + Long.toHexString(this.videoFrameDrawerHandler));
            this.videoFrameDrawerHandler = 0L;
        }
        GlRectDrawer glRectDrawer = this.textureDrawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.textureDrawer = null;
        }
        VideoFrameDrawer videoFrameDrawer = this.videoFrameDrawer;
        if (videoFrameDrawer != null) {
            videoFrameDrawer.release();
            RXLogging.m5744i(TAG, "released java frame drawer " + this.videoFrameDrawer);
            this.videoFrameDrawer = null;
        }
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "requestKeyFrame failed", e);
        }
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        RXLogging.m5746w(TAG, "resetCodec: " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + z);
        VideoCodecStatus videoCodecStatusRelease = release();
        if (videoCodecStatusRelease != VideoCodecStatus.OK) {
            return videoCodecStatusRelease;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        this.settings.targetBps = this.updateBitrate;
        this.updateBitrateTimestamp = SystemClock.elapsedRealtime();
        return initEncodeInternal();
    }

    private void resetCodecWhenBitrateChange() {
        if (isDeviceSupportResetBitrate() || this.updateBitrate == this.settings.targetBps || SystemClock.elapsedRealtime() - this.updateBitrateTimestamp < Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            return;
        }
        resetCodec(this.width, this.height, this.useSurfaceMode);
    }

    private void setBFrameMinMaxQP(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 31) {
            setIntegerParam(mediaFormat, "video-qp-b-max", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "video-qp-b-min", Integer.valueOf(this.settings.minQp));
        }
        if (this.codecName.toLowerCase().contains("qti")) {
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-b-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-b-max", Integer.valueOf(this.settings.maxQp));
        }
    }

    private void setBFrameNumber(MediaFormat mediaFormat) {
        RXVideoCodecProfile profile;
        if (!isBFrameEnabled()) {
            setIntegerParam(mediaFormat, "max-bframes", 0);
            return;
        }
        if (this.codecDesc.getStandard() == RXVideoCodecStandard.H264 && (profile = this.codecDesc.getProfile()) != RXVideoCodecProfile.ProfileHigh && profile != RXVideoCodecProfile.ProfileConstrainedHigh) {
            RXLogging.m5746w(TAG, "enabel b frame, set high profile explicitly");
            setIntegerParam(mediaFormat, "profile", 8);
            setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 256);
        }
        setIntegerParam(mediaFormat, "max-bframes", 1);
    }

    private void setBitrateMode(MediaFormat mediaFormat) {
        this.codec.getCodecInfo();
        VideoEncoder.BitrateMode bitrateMode = VideoEncoder.BitrateMode.CBR;
        VideoEncoder.BitrateMode bitrateMode2 = this.settings.bitrateMode;
        if (bitrateMode == bitrateMode2 || VideoEncoder.BitrateMode.AUTO == bitrateMode2) {
            setIntegerParam(mediaFormat, "bitrate-mode", 2);
        } else {
            setIntegerParam(mediaFormat, "bitrate-mode", 1);
        }
    }

    private void setExtCodecForHisi(int i, int i2) {
        MediaCodecWrapper mediaCodecWrapper;
        MediaFormat outputFormat;
        if (!this.codecName.contains("OMX.hisi.") || (mediaCodecWrapper = this.codec) == null) {
            return;
        }
        try {
            outputFormat = mediaCodecWrapper.getOutputFormat();
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "getOutputFormat failed", e);
            outputFormat = null;
        }
        if (outputFormat == null) {
            return;
        }
        RXLogging.m5744i(TAG, "output format before start: " + outputFormat.toString());
        boolean z = false;
        boolean z2 = outputFormat.containsKey(KEY_HISI_EXT_CODEC_QP_REGULATION_SUPPORETD) && outputFormat.getInteger(KEY_HISI_EXT_CODEC_QP_REGULATION_SUPPORETD) == 1;
        if (outputFormat.containsKey(KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES_SUPPORTED) && outputFormat.getInteger(KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES_SUPPORTED) == 1) {
            z = true;
        }
        Bundle bundle = new Bundle();
        if (z && isSvcEnabled() && this.svcRealLayerNum <= 1) {
            bundle.putInt(KEY_HISI_EXT_CODEC_NON_REF_P_FRAMES, 1);
            this.svcRealLayerNum = 2;
            RXLogging.m5746w(TAG, "support Non Ref PFrame.");
        }
        if (z2) {
            bundle.putInt(KEY_HISI_EXT_CODEC_MAX_QP, i);
            bundle.putInt(KEY_HISI_EXT_CODEC_MIN_QP, i2);
        }
        if (z || z2) {
            try {
                this.codec.setParameters(bundle);
            } catch (Exception e2) {
                RXLogging.m5743e(TAG, "setExtCodecForHisi failed", e2);
            }
        }
    }

    private void setIPFrameMinMaxQP(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 31) {
            setIntegerParam(mediaFormat, "video-qp-i-min", Integer.valueOf(this.settings.minIQp));
            setIntegerParam(mediaFormat, "video-qp-i-max", Integer.valueOf(this.settings.maxIQp));
            setIntegerParam(mediaFormat, "video-qp-p-min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "video-qp-p-max", Integer.valueOf(this.settings.maxQp));
        }
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minIQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxIQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
        setIntegerParam(mediaFormat, "vendor.qti-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-min", Integer.valueOf(this.settings.minIQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-i-max", Integer.valueOf(this.settings.maxIQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-min", Integer.valueOf(this.settings.minQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-qp-range.qp-p-max", Integer.valueOf(this.settings.maxQp));
        setIntegerParam(mediaFormat, "vendor.rtc-ext-enc-low-latency.enable", 1);
        if (this.codecName.toLowerCase().contains("exynos")) {
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-minQP", Integer.valueOf(this.settings.minIQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.I-maxQP", Integer.valueOf(this.settings.maxIQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-maxQP", Integer.valueOf(this.settings.maxQp));
            setIntegerParam(mediaFormat, "vendor.sec-ext-enc-qp-range.P-minQP", Integer.valueOf(this.settings.minQp));
        }
        if (this.codecName.toLowerCase().contains("mtk")) {
            setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.min", Integer.valueOf(this.settings.minQp));
            setIntegerParam(mediaFormat, "vendor.mtk.venc.dynamic.qpbound.max", Integer.valueOf(this.settings.maxQp));
        }
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
                    RXLogging.m5746w(TAG, "the encoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() <= 0) {
                    RXLogging.m5746w(TAG, "the encoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                    return;
                }
                RXLogging.m5746w(TAG, "the encoder params " + entry.getKey() + " set by vpaas is invalid with value:" + entry.getValue() + ",skip it");
            }
        }
        RXLogging.m5746w(TAG, "encoder int params has been set with Key:" + str + " Value:" + num);
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setProfileForLive(MediaFormat mediaFormat) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int length;
        int i;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel;
        RXVideoCodecStandard standard = this.codecDesc.getStandard();
        MediaCodecInfo codecInfo = this.codec.getCodecInfo();
        RXVideoCodecProfile profile = this.codecDesc.getProfile();
        int systemProfile = 1;
        if (standard != RXVideoCodecStandard.H264) {
            if (standard == RXVideoCodecStandard.ByteVC1) {
                try {
                    systemProfile = profile.toSystemProfile();
                } catch (Exception e) {
                    RXLogging.m5746w(TAG, "" + e);
                }
                mediaFormat.setInteger("profile", systemProfile);
                mediaFormat.setInteger(FirebaseAnalytics.Param.LEVEL, 256);
                return;
            }
            return;
        }
        try {
            systemProfile = profile.toSystemProfile();
            while (true) {
                if (i >= length) {
                    codecProfileLevel = null;
                    break;
                }
                codecProfileLevel = codecProfileLevelArr[i];
                if (systemProfile == codecProfileLevel.profile) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Exception e2) {
            RXLogging.m5746w(TAG, "" + e2);
        }
        codecProfileLevelArr = codecInfo.getCapabilitiesForType(standard.mimeType()).profileLevels;
        length = codecProfileLevelArr.length;
        i = 0;
        if (codecProfileLevel == null) {
            RXLogging.m5746w(TAG, "not set profile");
        } else {
            mediaFormat.setInteger("profile", codecProfileLevel.profile);
            mediaFormat.setInteger(FirebaseAnalytics.Param.LEVEL, codecProfileLevel.level);
        }
    }

    private void setProfileForRTC(MediaFormat mediaFormat) {
        RXLogging.m5746w(TAG, "close setting profile:" + this.settings.closeSetProfile);
        RXVideoCodecStandard standard = this.codecDesc.getStandard();
        if (this.settings.closeSetProfile) {
            return;
        }
        if (standard == RXVideoCodecStandard.H264) {
            RXVideoCodecProfile profile = this.codecDesc.getProfile();
            int i = C11602.$SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[profile.ordinal()];
            if (i == 1 || i == 2) {
                RXLogging.m5746w(TAG, "setting high profile ");
                setIntegerParam(mediaFormat, "profile", 8);
                setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 256);
                return;
            } else if (i == 3 || i == 4 || i == 5) {
                RXLogging.m5746w(TAG, "setting baseline profile ");
                setIntegerParam(mediaFormat, "profile", 1);
                setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 256);
                return;
            } else {
                RXLogging.m5746w(TAG, "Unknown profile level id: " + profile + "default to baseline profile");
                setIntegerParam(mediaFormat, "profile", 1);
                setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 256);
                return;
            }
        }
        if (standard != RXVideoCodecStandard.ByteVC1) {
            if (standard == RXVideoCodecStandard.VP8) {
                setIntegerParam(mediaFormat, "profile", 1);
                return;
            }
            return;
        }
        RXVideoCodecProfile profile2 = this.codecDesc.getProfile();
        int i2 = C11602.$SwitchMap$com$bytedance$realx$video$RXVideoCodecProfile[profile2.ordinal()];
        if (i2 == 6) {
            setIntegerParam(mediaFormat, "profile", 1);
            setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 8);
            return;
        }
        if (i2 == 7) {
            setIntegerParam(mediaFormat, "profile", 2);
            setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 8);
        } else {
            if (i2 == 8) {
                setIntegerParam(mediaFormat, "profile", 4096);
                setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 8);
                return;
            }
            RXLogging.m5746w(TAG, "Unknown profile level id: " + profile2 + "default to Main profile");
            setIntegerParam(mediaFormat, "profile", 1);
            setIntegerParam(mediaFormat, FirebaseAnalytics.Param.LEVEL, 8);
        }
    }

    private void setSVCNumber(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT < 25 || !isSvcEnabled()) {
            return;
        }
        setStringParam(mediaFormat, "ts-schema", "android.generic." + this.settings.temporalLayerNum);
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    RXLogging.m5746w(TAG, "the encoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                } else {
                    RXLogging.m5746w(TAG, "the encoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                }
                this.privateParams.remove(str);
                return;
            }
        }
        RXLogging.m5746w(TAG, "encoder string params has been set with Key:" + str + " Value:" + str2);
        mediaFormat.setString(str, str2);
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long j2 = this.forcedKeyFrameNs;
        return j2 > 0 && j > this.lastKeyFrameNs + j2;
    }

    private VideoCodecStatus updateBitrate(int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.updateBitrate = i;
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverEncodedImage() {
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.releaseAsync ? 40000L : 100000L);
            if (iDequeueOutputBuffer == -2) {
                RXLogging.m5744i(TAG, "output format changed: " + this.codec.getOutputFormat().toString());
                return;
            }
            if (iDequeueOutputBuffer == -1) {
                return;
            }
            if (iDequeueOutputBuffer != -3 && iDequeueOutputBuffer < 0) {
                RXLogging.m5742e(TAG, "should not be here: index:" + iDequeueOutputBuffer);
                return;
            }
            drainOutputData(iDequeueOutputBuffer, bufferInfo, this.codec.getOutputBuffers()[iDequeueOutputBuffer]);
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "deliverOutput failed", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus encode(RXVideoFrameInterface rXVideoFrameInterface, boolean z) {
        VideoCodecStatus videoCodecStatusEncodeByteBuffer;
        EglBase14 eglBase14;
        this.encodeThreadChecker.checkIsOnValidThread();
        GlUtil.clearGLES2Error(TAG);
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        synchronized (this.callbackLock) {
            try {
                if (this.isError) {
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                RXVideoMemoryInterface andRetainVideoFrameMemory = rXVideoFrameInterface.getAndRetainVideoFrameMemory();
                if (andRetainVideoFrameMemory == null) {
                    return VideoCodecStatus.MEMORY;
                }
                boolean z2 = andRetainVideoFrameMemory instanceof NativeRXOpenGLMemory;
                Boolean bool = this.isTextureBuffer;
                if (bool == null || bool.booleanValue() != z2) {
                    this.isTextureBuffer = Boolean.valueOf(z2);
                    RXLogging.m5742e(TAG, "isTextureBuffer: " + this.isTextureBuffer);
                }
                int width = rXVideoFrameInterface.getWidth();
                int height = rXVideoFrameInterface.getHeight();
                boolean z3 = true;
                boolean z4 = false;
                boolean z5 = canUseSurface() && (z2 || isForceUseSurfaceInput(width));
                if (z5 && z2) {
                    EglBase14.Context context = new EglBase14.Context(((NativeRXOpenGLMemory) andRetainVideoFrameMemory).getEGLContext(), EglBase.EglVersion.getPreferredEglVersion());
                    if (this.sharedContext == null || context.getNativeEglContext() != this.sharedContext.getNativeEglContext()) {
                        this.sharedContext = context;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                andRetainVideoFrameMemory.release();
                if (z5 != this.useSurfaceMode) {
                    VideoCodecStatus videoCodecStatusResetCodec = resetCodec(width, height, z5);
                    if (videoCodecStatusResetCodec != VideoCodecStatus.OK) {
                        return videoCodecStatusResetCodec;
                    }
                } else {
                    z4 = z3;
                }
                if (z4 && this.useSurfaceMode && !RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
                    RXLogging.m5746w(TAG, "egl env changed, create new shared context from the new videoframe egl context");
                    releaseFrameDrawer();
                    EglBase14 eglBase15 = this.textureEglBase;
                    if (eglBase15 != null) {
                        eglBase15.release();
                        this.textureEglBase = null;
                    }
                    try {
                        EglBase14 eglBase16 = new EglBase14(this.sharedContext, EglBase.getEGLConfig(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_RECORDABLE));
                        this.textureEglBase = eglBase16;
                        eglBase16.createSurface(this.textureInputSurface);
                        this.textureEglBase.makeCurrent();
                        initFrameDrawer();
                    } catch (Exception e) {
                        RXLogging.m5743e(TAG, "egl failed, fallback software:", e);
                        return VideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                }
                resetCodecWhenBitrateChange();
                if (z) {
                    RXLogging.m5744i(TAG, "Request key frame");
                }
                if (z || shouldForceKeyFrame(rXVideoFrameInterface.getTimestampNs())) {
                    requestKeyFrame(rXVideoFrameInterface.getTimestampNs());
                }
                if (isBFrameEnabled()) {
                    this.dtsQueue.push(Long.valueOf(rXVideoFrameInterface.getTimestampUs()));
                }
                if (this.useSurfaceMode) {
                    if (this.enableGlClear && (eglBase14 = this.textureEglBase) != null) {
                        eglBase14.makeCurrent();
                    }
                    videoCodecStatusEncodeByteBuffer = encodeTextureBuffer(rXVideoFrameInterface);
                } else {
                    videoCodecStatusEncodeByteBuffer = encodeByteBuffer(rXVideoFrameInterface);
                }
                if (videoCodecStatusEncodeByteBuffer != VideoCodecStatus.OK && isBFrameEnabled()) {
                    this.dtsQueue.pollFirst();
                }
                return videoCodecStatusEncodeByteBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, RXVideoFrameInterface rXVideoFrameInterface) {
        this.yuvFormat.fillBuffer(byteBuffer, rXVideoFrameInterface);
    }

    public VideoEncoder.ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            RXVideoCodecStandard standard = this.codecDesc.getStandard();
            RXVideoCodecStandard rXVideoCodecStandard = RXVideoCodecStandard.VP8;
            if (standard == rXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (this.codecDesc.getStandard() == rXVideoCodecStandard) {
                return new VideoEncoder.ScalingSettings(24, 37);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.sharedContext = settings.sharedContext;
        this.callback = callback;
        this.automaticResizeOn = true;
        this.width = settings.width;
        this.height = settings.height;
        this.scaleMode = settings.scaleMode;
        this.bitrateMode = settings.bitrateMode;
        this.updateBitrate = settings.targetBps;
        this.updateBitrateTimestamp = SystemClock.elapsedRealtime();
        this.settings = settings;
        this.useAsyncMode = settings.enableAsyncMode;
        if (RXVideoSurfaceController.getInstance().usePassSurfaceMode()) {
            RXLogging.m5742e(TAG, "using pass surface mode");
            this.useSurfaceMode = true;
        } else {
            this.useSurfaceMode = canUseSurface() && settings.useSurfaceMode && this.sharedContext != null;
            if (isForceUseSurfaceInput(this.width)) {
                this.useSurfaceMode = true;
            }
        }
        RXLogging.m5746w(TAG, "initEncode, codec name:" + this.codecName + ", with resolution:" + this.width + " x " + this.height + ". @ " + settings.targetBps + "bps. Fps: " + settings.targetFps + " Use surface mode: " + this.useSurfaceMode + " initUseSurfaceMode: " + settings.useSurfaceMode + " settings.bitrateMode:" + settings.bitrateMode + " qp_min:" + settings.minQp + " qp_max:" + settings.maxQp + " qp_i_min:" + settings.minIQp + " qp_i_max:" + settings.maxIQp + " useAsyncMode:" + this.useAsyncMode);
        return initEncodeInternal();
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        MediaCodecWrapper mediaCodecWrapper;
        RXLogging.m5746w(TAG, "mediacodec error: " + codecException.getDiagnosticInfo() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + codecException);
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            synchronized (this.callbackLock) {
                this.isError = true;
            }
        } else {
            RXLogging.m5742e(TAG, "onError not same codec " + codecException);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodecWrapper mediaCodecWrapper;
        if (!this.running || (mediaCodecWrapper = this.codec) == null || mediaCodecWrapper.getRealCodec() != mediaCodec) {
            RXLogging.m5742e(TAG, "onInputBufferAvailable not same codec");
        } else {
            synchronized (this.callbackLock) {
                this.inputBuffers.addLast(Integer.valueOf(i));
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        MediaCodecWrapper mediaCodecWrapper;
        if (!this.running || (mediaCodecWrapper = this.codec) == null || mediaCodecWrapper.getRealCodec() != mediaCodec) {
            RXLogging.m5742e(TAG, "onOutputBufferAvailable not same codec");
            return;
        }
        try {
            drainOutputData(i, bufferInfo, mediaCodec.getOutputBuffer(i));
        } catch (Exception e) {
            RXLogging.m5743e(TAG, "onOutputBufferAvailable failed", e);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecWrapper mediaCodecWrapper;
        if (!this.running || (mediaCodecWrapper = this.codec) == null || mediaCodecWrapper.getRealCodec() != mediaCodec) {
            RXLogging.m5742e(TAG, "onOutputFormatChanged not same codec");
            return;
        }
        RXLogging.m5744i(TAG, "output format changed: " + mediaFormat.toString());
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus release() {
        this.encodeThreadChecker.checkIsOnValidThread();
        RXLogging.m5746w(TAG, "hardware video encoder release start.");
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        if (this.useAsyncMode) {
            this.running = false;
            final HandlerThread handlerThread = this.asyncOutputThread;
            if (handlerThread != null) {
                this.asyncHandler.post(new Runnable() { // from class: com.bytedance.realx.video.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        HardwareVideoEncoder.m5759b(this.f4779a, handlerThread);
                    }
                });
                if (!ThreadUtils.joinUninterruptibly(this.asyncOutputThread, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
                    RXLogging.m5742e(TAG, "Media encoder release timeout");
                    videoCodecStatus = VideoCodecStatus.TIMEOUT;
                }
                this.asyncOutputThread = null;
                this.asyncHandler = null;
            }
        } else if (this.outputThread != null) {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
                RXLogging.m5742e(TAG, "Media encoder release timeout");
                videoCodecStatus = VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                RXLogging.m5743e(TAG, "Media encoder release exception", this.shutdownException);
                videoCodecStatus = VideoCodecStatus.ERROR;
            }
        }
        RXLogging.m5746w(TAG, "Media encoder release ok.");
        releaseFrameDrawer();
        EglBase14 eglBase14 = this.textureEglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.textureEglBase = null;
        }
        RXLogging.m5746w(TAG, "textureEglBase release ok.");
        Surface surface = this.textureInputSurface;
        if (surface != null) {
            surface.release();
            this.textureInputSurface = null;
        }
        RXLogging.m5746w(TAG, "textureInputSurface release ok.");
        this.codec = null;
        this.outputThread = null;
        this.encodeThreadChecker.detachThread();
        RXLogging.m5746w(TAG, "hardware video encoder release end." + videoCodecStatus);
        return videoCodecStatus;
    }

    public void setColorSpace(MediaFormat mediaFormat) {
        if (!this.useSurfaceMode && this.codecName.contains("OMX.hisi.") && this.settings.rangeId == 0 && (this.yuvColorFormat.intValue() == 19 || this.yuvColorFormat.intValue() == 21)) {
            RXLogging.m5746w(TAG, "kirin chips skip setting MediaFormat COLOR_RANGE");
        } else if (this.settings.rangeId == 1) {
            RXLogging.m5746w(TAG, "setting MediaFormat COLOR_RANGE_FULL");
            setIntegerParam(mediaFormat, "color-range", 1);
        } else {
            RXLogging.m5746w(TAG, "setting MediaFormat COLOR_RANGE_LIMITED");
            setIntegerParam(mediaFormat, "color-range", 2);
        }
        setIntegerParam(mediaFormat, "color-standard", 4);
        setIntegerParam(mediaFormat, "color-transfer", 3);
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus setPrivateParam(String str, String str2) {
        RXLogging.m5746w(TAG, "got android hardware encoder setPrivateParam with key:" + str + " value:" + str2);
        str.getClass();
        switch (str) {
            case "realx.force.surface.input":
                this.forceSurfaceInput = Boolean.valueOf("true".equalsIgnoreCase(str2));
                break;
            case "realx.glclear":
                this.enableGlClear = "true".equalsIgnoreCase(str2);
                break;
            case "realx.release.async":
                this.releaseAsync = "true".equalsIgnoreCase(str2);
                break;
            case "realx.check.svc.layer":
                this.checkSVCLayer = "true".equalsIgnoreCase(str2);
                break;
            case "realx.native.render":
                this.enableNativeRender = "true".equalsIgnoreCase(str2);
                break;
            default:
                this.vpassPrivateParams.put(str, str2);
                break;
        }
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus setRateAllocation(int i, int i2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        updateBitrate(i);
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoEncoder
    public VideoCodecStatus requestKeyFrame() {
        requestKeyFrame(System.currentTimeMillis());
        return VideoCodecStatus.OK;
    }
}
