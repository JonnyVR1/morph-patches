package com.bytedance.realx.video;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.memory.NativeRXByteMemory;
import com.bytedance.realx.video.memory.NativeRXVideoFrame;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.google.android.gms.common.util.GmsVersion;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.k250;

/* JADX INFO: loaded from: classes.dex */
class AndroidVideoDecoder extends MediaCodec.Callback implements VideoDecoder, VideoSink {
    private static final int ADAPTIVE_PLAYBACK_MAX_DIMENSION = 9000;
    private static final int DEFAULT_OUTPUT_FRAME_WAIT_TIME_MS = 16;
    private static final int DEQUEUE_INPUT_INDEX_TIME_US = 5000;
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String DIRECT_RENDER_BY_VSYNC_MAX_CACHE_SIZE = "bytertc.hw.decoder.dr.vsync.cache.size";
    private static final int DIRECT_RENDER_MODE_BY_VSYNC = 2;
    private static final int DIRECT_RENDER_MODE_NONE = 0;
    private static final int DIRECT_RENDER_MODE_NORMAL = 1;
    private static final String ENABLE_CHECK_SYS_RESOLUTION_SUPPORT = "bytertc.check.sys.resolution.support.enable";
    private static final String FLAG_CHECK_TEXTURE_SIZE = "bytertc.hw.decoder.check.texture.size";
    private static final String HISI_DECODER_END_CODE = "bytertc.hisi.decoder.endcode.enable";
    private static final String MAX_EGL_NUM = "bytertc.hw.decoder.maxeglnum";
    private static final int MAX_OUTPUT_FRAME_WAIT_TIME_MS = 1300;
    private static final int MAX_RECREATE_DECODER_COUNT = 2;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 6000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final int MIN_OUTPUT_FRAME_TIME_DELTA_MS = 10;
    private static final String NEW_INPUT_BUFFER_API = "bytertc.hw.decoder.newinputbuffer";
    private static final String NEW_OUTPUT_BUFFER_API = "bytertc.hw.decoder.newoutputbuffer";
    private static final String TAG = "AndroidVideoDecoder";
    private static final int TEXTURE_PLAYOUT_INSIDE_DECODER = 0;
    private static final int TEXTURE_PLAYOUT_OUTSIDE_DECODER = 1;
    private static int curEglContextNum = 0;
    private static int maxDirectRenderCacheSize = 5;
    private static int maxEglContextNum = 16;
    private Handler asyncHandler;
    private HandlerThread asyncOutputThread;

    @Nullable
    private VideoDecoder.Callback callback;

    @Nullable
    private MediaCodecWrapper codec;
    private final String codecName;
    private final RXVideoCodecStandard codecType;
    private int colorFormat;
    private ThreadUtils.ThreadChecker decoderThreadChecker;

    @Nullable
    private Surface exSurface;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;

    @Nullable
    private SurfaceTextureHelper outSideSurfaceTextureHelper;

    @Nullable
    private Thread outputThread;

    @Nullable
    private DecodedTextureMetadata renderedTextureMetadata;
    private volatile boolean running;

    @Nullable
    private VideoDecoder.Settings settings;
    private EglBase.Context sharedContext;

    @Nullable
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;

    @Nullable
    private Surface surface;

    @Nullable
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    boolean enableHisiEndCode = true;
    boolean enableCheckSysResolutionSupport = false;
    boolean enableTextureSizeCheck = true;
    private int maxExSurfaceRecreateDecoderCount = 0;
    private Thread directRenderThread = null;
    private final Object outputBufferQueueLock = new Object();
    private LinkedBlockingQueue<OutputBufferInfo> outputBufferQueue = new LinkedBlockingQueue<>();
    private ThreadUtils.ThreadChecker outputThreadChecker = new ThreadUtils.ThreadChecker();
    private final Object dimensionLock = new Object();
    private int encoded_width = 0;
    private int encoded_height = 0;
    private final Object surfaceTextureHelperLock = new Object();
    private long lastOutputTime = 0;
    private long currentOutputTime = 0;
    private long lastInputTime = 0;
    private long currentInputTimeDelta = 0;
    private long packetCount2s = 0;
    private long timeForAvg = 0;
    private long avgInputTimeDelta = 0;
    private long inputFrameCount = 0;
    private long outputFrameCount = 0;
    private long dropDecodedFrameCount = 0;
    private long callbackDecodedFrameCount = 0;
    private long minFrameCache = -1;
    private long currentFrameCache = -1;
    private final Object smoothOutputLock = new Object();
    private boolean usingInternalSurfaceLast = true;
    private HashMap<String, String> privateParams = new HashMap<>();
    private HashMap<String, String> vpassPrivateParams = new HashMap<>();
    private boolean mustUseYUVoutput = false;
    private boolean useNewInputBufferAPI = true;
    private boolean useNewOutputBufferAPI = true;
    private boolean enable_adaptive_playback = false;
    private int adaptive_playback_max_width = 0;
    private int adaptive_playback_max_height = 0;
    private boolean enableRetryDeliver = false;
    private int maxTryCount = 16;
    private float minAccelerateRatio = 0.0f;
    private float maxDeaccelerateRatio = 1.0f;
    private int frameCacheThreshold = 2;
    private int directRenderMode = 2;
    private int texturePlayoutMode = 0;
    private final Object renderedTextureMetadataLock = new Object();
    private boolean useAsyncMode = false;
    private LinkedList<Integer> inputBuffers = new LinkedList<>();
    private final Object callbackLock = new Object();
    private AtomicBoolean isError = new AtomicBoolean(false);

    public static class DecodedTextureMetadata {
        final long presentationTimestampUs;

        public DecodedTextureMetadata(long j) {
            this.presentationTimestampUs = j;
        }
    }

    public static class OutputBufferInfo {
        final int bufferIndex;
        final long presentationTimestampUs;

        public OutputBufferInfo(long j, int i) {
            this.presentationTimestampUs = j;
            this.bufferIndex = i;
        }
    }

    public AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, RXVideoCodecStandard rXVideoCodecStandard, int i) {
        if (!isSupportedColorFormat(i)) {
            k250.m144273a("Unsupported color format: ", i);
            throw null;
        }
        RXLogging.m5692w(TAG, "ctor name: " + str + " type: " + rXVideoCodecStandard + " color format(19:I420 21:NV12): " + i);
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = rXVideoCodecStandard;
        this.colorFormat = i;
        this.width = 0;
        this.height = 0;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m5694a(AndroidVideoDecoder androidVideoDecoder, int i, MediaCodec.BufferInfo bufferInfo, boolean z) {
        MediaCodecWrapper mediaCodecWrapper = androidVideoDecoder.codec;
        try {
            if (z) {
                mediaCodecWrapper.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
            } else {
                mediaCodecWrapper.releaseOutputBuffer(i, z);
            }
            return 0;
        } catch (Exception e) {
            RXLogging.m5693w(TAG, "releaseOutputBuffer failed", e);
            return 0;
        }
    }

    public static /* synthetic */ long access$508(AndroidVideoDecoder androidVideoDecoder) {
        long j = androidVideoDecoder.dropDecodedFrameCount;
        androidVideoDecoder.dropDecodedFrameCount = 1 + j;
        return j;
    }

    private int appendHisiEndCode(ByteBuffer byteBuffer, int i) {
        if (this.enableHisiEndCode && this.codecName.startsWith("OMX.hisi")) {
            byte[] bArr = {0, 0, 0, 1, 30, 72, 83, 80, 73, 67, 69, 78, 68, 0, 0, 0, 1, 0};
            int i2 = i + 18;
            if (byteBuffer.capacity() >= i2) {
                byteBuffer.put(bArr);
                return i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5695b(AndroidVideoDecoder androidVideoDecoder, HandlerThread handlerThread) {
        androidVideoDecoder.releaseCodecOnOutputThread();
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callbackDirectRenderFrame(long j) {
        VideoDecoder.Callback callback = this.callback;
        if (callback == null) {
            return;
        }
        if (!this.hasDecodedFirstFrame) {
            this.hasDecodedFirstFrame = true;
        }
        NativeRXByteMemory nativeRXByteMemory = new NativeRXByteMemory(this.width, this.height, 0L, null, null, RXPixelFormat.kUnknown);
        NativeRXVideoFrame nativeRXVideoFrameCreateRXVideoFrame = NativeRXVideoFrame.createRXVideoFrame(nativeRXByteMemory, 1000 * j, (ByteBuffer) null, RXColorSpace.kUnknown, RXVideoRotation.VIDEO_ROTATION_0);
        callback.onDecodedFrame(nativeRXVideoFrameCreateRXVideoFrame);
        this.callbackDecodedFrameCount++;
        nativeRXByteMemory.release();
        nativeRXVideoFrameCreateRXVideoFrame.release();
    }

    private NativeRXByteMemory copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        NativeRXByteMemory nativeRXByteMemory;
        if (i % 2 != 0) {
            RXLogging.m5688e(TAG, "Stride is not divisible by two: " + i);
            return null;
        }
        int i5 = (i3 + 1) / 2;
        int i6 = i2 % 2 == 0 ? (i4 + 1) / 2 : i4 / 2;
        int i7 = i / 2;
        int i8 = i * i4;
        int i9 = i * i2;
        int i10 = i7 * i6;
        int i11 = i9 + i10;
        int i12 = i9 + ((i7 * i2) / 2);
        int i13 = i12 + i10;
        NativeRXByteMemory nativeRXByteMemoryAllocateI420Buffer = allocateI420Buffer(i3, i4);
        if (nativeRXByteMemoryAllocateI420Buffer == null) {
            return null;
        }
        if (nativeRXByteMemoryAllocateI420Buffer.getNumberOfPlanes() != 3) {
            nativeRXByteMemoryAllocateI420Buffer.release();
            return null;
        }
        try {
            byteBuffer.limit(i8);
            byteBuffer.position(0);
            nativeRXByteMemory = nativeRXByteMemoryAllocateI420Buffer;
            try {
                copyPlane(byteBuffer.slice(), i, nativeRXByteMemoryAllocateI420Buffer.getPlaneData(0), nativeRXByteMemoryAllocateI420Buffer.getPlaneLineSize(0), i3, i4);
                byteBuffer.limit(i11);
                byteBuffer.position(i9);
                copyPlane(byteBuffer.slice(), i7, nativeRXByteMemory.getPlaneData(1), nativeRXByteMemory.getPlaneLineSize(1), i5, i6);
                if (i2 % 2 == 1) {
                    byteBuffer.position(i9 + ((i6 - 1) * i7));
                    ByteBuffer planeData = nativeRXByteMemory.getPlaneData(1);
                    planeData.position(nativeRXByteMemory.getPlaneLineSize(1) * i6);
                    planeData.put(byteBuffer);
                }
                byteBuffer.limit(i13);
                byteBuffer.position(i12);
                copyPlane(byteBuffer.slice(), i7, nativeRXByteMemory.getPlaneData(2), nativeRXByteMemory.getPlaneLineSize(2), i5, i6);
                if (i2 % 2 == 1) {
                    byteBuffer.position(i12 + (i7 * (i6 - 1)));
                    ByteBuffer planeData2 = nativeRXByteMemory.getPlaneData(2);
                    planeData2.position(nativeRXByteMemory.getPlaneLineSize(2) * i6);
                    planeData2.put(byteBuffer);
                }
                return nativeRXByteMemory;
            } catch (Exception e) {
                e = e;
                RXLogging.m5689e(TAG, "buffer err:", e);
                nativeRXByteMemory.release();
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            nativeRXByteMemory = nativeRXByteMemoryAllocateI420Buffer;
        }
    }

    private NativeRXByteMemory copyNV12Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5 = (i4 + 1) / 2;
        int i6 = i * i4;
        int i7 = i * i2;
        int i8 = i7 + (i * i5);
        NativeRXByteMemory nativeRXByteMemoryCreateRXByteMemory = NativeRXByteMemory.createRXByteMemory(i3, i4, RXPixelFormat.kNv12, 0L);
        if (nativeRXByteMemoryCreateRXByteMemory == null) {
            return null;
        }
        if (nativeRXByteMemoryCreateRXByteMemory.getNumberOfPlanes() != 2) {
            nativeRXByteMemoryCreateRXByteMemory.release();
            return null;
        }
        try {
            byteBuffer.limit(i6);
            byteBuffer.position(0);
            copyPlane(byteBuffer.slice(), i, nativeRXByteMemoryCreateRXByteMemory.getPlaneData(0), nativeRXByteMemoryCreateRXByteMemory.getPlaneLineSize(0), i3, i4);
            byteBuffer.limit(i8);
            byteBuffer.position(i7);
            copyPlane(byteBuffer.slice(), i, nativeRXByteMemoryCreateRXByteMemory.getPlaneData(1), nativeRXByteMemoryCreateRXByteMemory.getPlaneLineSize(1), i3, i5);
            return nativeRXByteMemoryCreateRXByteMemory;
        } catch (Exception e) {
            RXLogging.m5689e(TAG, "copyNV12Buffer err:", e);
            nativeRXByteMemoryCreateRXByteMemory.release();
            return null;
        }
    }

    private void createDirectRenderVSyncThread() {
        Thread thread = new Thread(new Runnable() { // from class: com.bytedance.realx.video.AndroidVideoDecoder.1
            @Override // java.lang.Runnable
            public void run() {
                AndroidVideoDecoder.this.directRenderByVSync();
            }
        });
        this.directRenderThread = thread;
        thread.start();
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") { // from class: com.bytedance.realx.video.AndroidVideoDecoder.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    boolean z = AndroidVideoDecoder.this.running;
                    AndroidVideoDecoder androidVideoDecoder = AndroidVideoDecoder.this;
                    if (!z) {
                        androidVideoDecoder.releaseCodecOnOutputThread();
                        return;
                    }
                    androidVideoDecoder.deliverDecodedFrame();
                }
            }
        };
    }

    private void deliverByteFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        int i4;
        int i5;
        ByteBuffer outputBuffer;
        NativeRXByteMemory nativeRXByteMemoryCopyI420Buffer;
        AndroidVideoDecoder androidVideoDecoder = this;
        synchronized (androidVideoDecoder.dimensionLock) {
            i2 = androidVideoDecoder.width;
            i3 = androidVideoDecoder.height;
            i4 = androidVideoDecoder.stride;
            i5 = androidVideoDecoder.sliceHeight;
        }
        VideoDecoder.Callback callback = androidVideoDecoder.callback;
        int i6 = bufferInfo.size;
        if (i6 < ((i2 * i3) * 3) / 2) {
            RXLogging.m5688e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
            return;
        }
        if (i6 < ((i4 * i3) * 3) / 2 && i5 == i3 && i4 > i2) {
            i4 = (i6 * 2) / (i3 * 3);
        }
        try {
            if (androidVideoDecoder.useAsyncMode) {
                outputBuffer = androidVideoDecoder.codec.getOutputBuffer(i);
            } else {
                boolean z = androidVideoDecoder.useNewOutputBufferAPI;
                MediaCodecWrapper mediaCodecWrapper = androidVideoDecoder.codec;
                outputBuffer = z ? mediaCodecWrapper.getOutputBuffer(i) : mediaCodecWrapper.getOutputBuffers()[i];
            }
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBufferSlice = outputBuffer.slice();
            try {
                if (androidVideoDecoder.colorFormat == 19) {
                    try {
                        nativeRXByteMemoryCopyI420Buffer = androidVideoDecoder.copyI420Buffer(byteBufferSlice, i4, i5, i2, i3);
                        androidVideoDecoder = this;
                    } catch (Exception e) {
                        e = e;
                        androidVideoDecoder = this;
                        RXLogging.m5689e(TAG, "buffer err!", e);
                        androidVideoDecoder.dropDecodedFrameCount++;
                        return;
                    }
                } else {
                    nativeRXByteMemoryCopyI420Buffer = androidVideoDecoder.copyNV12Buffer(byteBufferSlice, i4, i5, i2, i3);
                }
                NativeRXByteMemory nativeRXByteMemory = nativeRXByteMemoryCopyI420Buffer;
                if (nativeRXByteMemory == null) {
                    RXLogging.m5688e(TAG, "byteMemory is null, colorFormat:" + androidVideoDecoder.colorFormat);
                    androidVideoDecoder.dropDecodedFrameCount = androidVideoDecoder.dropDecodedFrameCount + 1;
                    return;
                }
                try {
                    androidVideoDecoder.codec.releaseOutputBuffer(i, false);
                    NativeRXVideoFrame nativeRXVideoFrameCreateRXVideoFrame = NativeRXVideoFrame.createRXVideoFrame(nativeRXByteMemory, bufferInfo.presentationTimeUs * 1000, (ByteBuffer) null, RXColorSpace.kUnknown, RXVideoRotation.VIDEO_ROTATION_0);
                    if (callback != null) {
                        callback.onDecodedFrame(nativeRXVideoFrameCreateRXVideoFrame);
                        androidVideoDecoder.callbackDecodedFrameCount++;
                        nativeRXByteMemory.release();
                        nativeRXVideoFrameCreateRXVideoFrame.release();
                        return;
                    }
                    RXLogging.m5688e(TAG, "callback is null, dropDecodedFrameCount:" + androidVideoDecoder.dropDecodedFrameCount);
                    androidVideoDecoder.dropDecodedFrameCount = androidVideoDecoder.dropDecodedFrameCount + 1;
                    nativeRXByteMemory.release();
                    nativeRXVideoFrameCreateRXVideoFrame.release();
                } catch (Exception e2) {
                    RXLogging.m5689e(TAG, "releaseOutputBuffer failed!", e2);
                    nativeRXByteMemory.release();
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            RXLogging.m5689e(TAG, "getOutputBuffer failed!", e4);
        }
    }

    private void deliverTextureFrame(int i, MediaCodec.BufferInfo bufferInfo) {
        int i2;
        int i3;
        MediaCodecWrapper mediaCodecWrapper;
        float f;
        float f2;
        boolean z;
        boolean z2;
        synchronized (this.dimensionLock) {
            i2 = this.width;
            i3 = this.height;
        }
        VideoDecoder.Settings settings = this.settings;
        if (settings.enableSmoothOutput && !settings.latencyInsensitiveMode) {
            smoothOutputFrame();
        }
        if (this.settings.latencyInsensitiveMode && this.running) {
            int i4 = 0;
            boolean z3 = true;
            while (z3 && i4 < 200) {
                i4++;
                synchronized (this.renderedTextureMetadataLock) {
                    z2 = this.renderedTextureMetadata != null;
                }
                if (z2) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                z3 = z2;
            }
        }
        if (this.enableRetryDeliver && this.running) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.inputFrameCount - this.outputFrameCount;
            if (j < 0) {
                j = this.frameCacheThreshold + 1;
            }
            this.currentFrameCache = j;
            RXLogging.m5690i(TAG, "currentFrameCache:" + this.currentFrameCache);
            long j2 = this.currentFrameCache;
            long j3 = (long) this.frameCacheThreshold;
            int i5 = this.maxTryCount;
            if (j2 <= j3) {
                f = i5;
                f2 = this.maxDeaccelerateRatio;
            } else {
                f = i5;
                f2 = this.minAccelerateRatio;
            }
            int i6 = (int) (f * f2);
            boolean z4 = true;
            while (z4 && SystemClock.elapsedRealtime() - jElapsedRealtime < i6) {
                synchronized (this.renderedTextureMetadataLock) {
                    z = this.renderedTextureMetadata != null;
                }
                if (z) {
                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
                z4 = z;
            }
            RXLogging.m5690i(TAG, "retry delivering frame take ms: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
        VideoDecoder.Callback callback = this.callback;
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null && (mediaCodecWrapper = this.codec) != null) {
                try {
                    mediaCodecWrapper.releaseOutputBuffer(i, false);
                } catch (IllegalStateException e3) {
                    RXLogging.m5689e(TAG, "releaseOutputBuffer failed", e3);
                }
                this.dropDecodedFrameCount++;
                if (callback != null) {
                    callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "waiting for texture for the previous frame");
                }
                return;
            }
            synchronized (this.surfaceTextureHelperLock) {
                SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.setTextureSize(i2, i3, this.enableTextureSizeCheck);
                    this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
                    MediaCodecWrapper mediaCodecWrapper2 = this.codec;
                    if (mediaCodecWrapper2 != null) {
                        try {
                            mediaCodecWrapper2.releaseOutputBuffer(i, true);
                        } catch (IllegalStateException e4) {
                            RXLogging.m5689e(TAG, "releaseOutputBuffer failed!", e4);
                        }
                    }
                    return;
                }
                this.dropDecodedFrameCount++;
                if (callback != null) {
                    callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "surfaceTextureHelper is null");
                }
                RXLogging.m5688e(TAG, "surfaceTextureHelper is null, drop current decoded frame.");
                MediaCodecWrapper mediaCodecWrapper3 = this.codec;
                if (mediaCodecWrapper3 != null) {
                    try {
                        mediaCodecWrapper3.releaseOutputBuffer(i, false);
                    } catch (IllegalStateException e5) {
                        RXLogging.m5689e(TAG, "releaseOutputBuffer failed", e5);
                    }
                }
                return;
            }
            throw th;
        }
    }

    private void deliverTextureFrameOutSide(final int i, final MediaCodec.BufferInfo bufferInfo) {
        this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs);
        synchronized (this.surfaceTextureHelperLock) {
            SurfaceTextureHelper surfaceTextureHelper = this.outSideSurfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.setTextureSize(this.width, this.height);
                this.outSideSurfaceTextureHelper.onFrame(new MediaCodecTextureBufferHelper(new MediaCodecTextureBufferHelper.ReleaseOutPutBuffer() { // from class: com.bytedance.realx.video.b
                    @Override // com.bytedance.realx.video.MediaCodecTextureBufferHelper.ReleaseOutPutBuffer
                    public final int release(boolean z) {
                        return AndroidVideoDecoder.m5694a(this.f4739a, i, bufferInfo, z);
                    }
                }));
                return;
            }
            this.dropDecodedFrameCount++;
            this.callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "outSideSurfaceTextureHelper is null");
            RXLogging.m5688e(TAG, "outSideSurfaceTextureHelper is null, drop current decoded frame.");
            MediaCodecWrapper mediaCodecWrapper = this.codec;
            if (mediaCodecWrapper != null) {
                try {
                    mediaCodecWrapper.releaseOutputBuffer(i, false);
                } catch (Exception e) {
                    RXLogging.m5689e(TAG, "releaseOutputBuffer failed", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void directRenderByVSync() {
        try {
            Looper.prepare();
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.bytedance.realx.video.AndroidVideoDecoder.2
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    OutputBufferInfo outputBufferInfo;
                    synchronized (AndroidVideoDecoder.this.outputBufferQueueLock) {
                        try {
                            outputBufferInfo = AndroidVideoDecoder.this.outputBufferQueue.size() > 0 ? (OutputBufferInfo) AndroidVideoDecoder.this.outputBufferQueue.poll() : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (outputBufferInfo != null) {
                        try {
                            AndroidVideoDecoder.this.codec.releaseOutputBuffer(outputBufferInfo.bufferIndex, outputBufferInfo.presentationTimestampUs * 1000);
                            AndroidVideoDecoder.this.callbackDirectRenderFrame(outputBufferInfo.presentationTimestampUs);
                        } catch (Exception e) {
                            RXLogging.m5689e(AndroidVideoDecoder.TAG, "releaseOutputBuffer err:", e);
                            VideoDecoder.Callback callback = AndroidVideoDecoder.this.callback;
                            if (callback != null) {
                                callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, "releaseOutputBuffer err");
                                callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "releaseOutputBuffer err");
                            }
                            AndroidVideoDecoder.access$508(AndroidVideoDecoder.this);
                        }
                    }
                    if (AndroidVideoDecoder.this.running) {
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                }
            });
            Looper.loop();
        } catch (Exception e) {
            RXLogging.m5689e(TAG, "direct render by vsync is error", e);
        }
    }

    private void drainOutputFrame(MediaCodec.BufferInfo bufferInfo, int i) {
        OutputBufferInfo outputBufferInfoPoll;
        this.outputFrameCount++;
        if (this.isError.get()) {
            RXLogging.m5692w(TAG, "codec is error when call drainOutputFrame");
            return;
        }
        VideoDecoder.Callback callback = this.callback;
        if (callback == null) {
            RXLogging.m5688e(TAG, "callback is null, return");
            return;
        }
        if (this.exSurface == null) {
            if (!this.hasDecodedFirstFrame) {
                this.hasDecodedFirstFrame = true;
            }
            if (this.surfaceTextureHelper != null && this.texturePlayoutMode == 0) {
                deliverTextureFrame(i, bufferInfo);
                return;
            } else if (this.outSideSurfaceTextureHelper == null || 1 != this.texturePlayoutMode) {
                deliverByteFrame(i, bufferInfo);
                return;
            } else {
                deliverTextureFrameOutSide(i, bufferInfo);
                return;
            }
        }
        int i2 = this.texturePlayoutMode;
        if (i2 != 0) {
            if (1 == i2) {
                deliverTextureFrameOutSide(i, bufferInfo);
                return;
            }
            return;
        }
        try {
            int i3 = this.directRenderMode;
            if (1 == i3) {
                this.codec.releaseOutputBuffer(i, bufferInfo.presentationTimeUs * 1000);
            } else {
                if (2 == i3) {
                    synchronized (this.outputBufferQueueLock) {
                        try {
                            this.outputBufferQueue.put(new OutputBufferInfo(bufferInfo.presentationTimeUs, i));
                            if (this.outputBufferQueue.size() > maxDirectRenderCacheSize && (outputBufferInfoPoll = this.outputBufferQueue.poll()) != null) {
                                this.codec.releaseOutputBuffer(outputBufferInfoPoll.bufferIndex, false);
                                callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "direct render drop frame");
                                this.dropDecodedFrameCount++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                this.codec.releaseOutputBuffer(i, true);
            }
            callbackDirectRenderFrame(bufferInfo.presentationTimeUs);
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
            callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "releaseOutputBuffer err");
            this.dropDecodedFrameCount++;
        }
    }

    private VideoCodecStatus feedInputBufferAsync(EncodedImage encodedImage) {
        int iIntValue;
        int iRemaining = encodedImage.buffer.remaining();
        int i = (this.settings.latencyInsensitiveMode ? GmsVersion.VERSION_LONGHORN : DEQUEUE_INPUT_TIMEOUT_US) / 5000;
        do {
            synchronized (this.callbackLock) {
                iIntValue = this.inputBuffers.size() <= 0 ? -1 : this.inputBuffers.removeFirst().intValue();
            }
            if (iIntValue == -1) {
                int i2 = i - 1;
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    RXLogging.m5690i(TAG, "" + e);
                }
                i = i2;
            }
            if (iIntValue != -1) {
                break;
            }
        } while (i > 0);
        if (iIntValue == -1) {
            RXLogging.m5692w(TAG, "decode() - no HW buffers available; decoder falling behind");
            return VideoCodecStatus.OVERLOAD;
        }
        try {
            ByteBuffer inputBuffer = this.codec.getInputBuffer(iIntValue);
            if (inputBuffer.capacity() < iRemaining) {
                RXLogging.m5688e(TAG, "decode() - HW buffer too small");
                return VideoCodecStatus.OVERLOAD;
            }
            inputBuffer.put(encodedImage.buffer);
            try {
                this.codec.queueInputBuffer(iIntValue, 0, appendHisiEndCode(inputBuffer, iRemaining), encodedImage.captureTimeNs / 1000, 0);
                return VideoCodecStatus.OK;
            } catch (IllegalStateException e2) {
                RXLogging.m5689e(TAG, "queueInputBuffer failed", e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (Exception e3) {
            RXLogging.m5689e(TAG, "getInputBuffer failed", e3);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus feedInputBufferSync(EncodedImage encodedImage) {
        int iRemaining = encodedImage.buffer.remaining();
        try {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(this.settings.latencyInsensitiveMode ? 5000000L : 500000L);
            if (iDequeueInputBuffer < 0) {
                RXLogging.m5688e(TAG, "decode() - no HW buffers available; decoder falling behind");
                return VideoCodecStatus.OVERLOAD;
            }
            try {
                boolean z = this.useNewInputBufferAPI;
                MediaCodecWrapper mediaCodecWrapper = this.codec;
                ByteBuffer inputBuffer = z ? mediaCodecWrapper.getInputBuffer(iDequeueInputBuffer) : mediaCodecWrapper.getInputBuffers()[iDequeueInputBuffer];
                if (inputBuffer == null) {
                    RXLogging.m5688e(TAG, "decode() - HW buffer is null");
                    return VideoCodecStatus.OVERLOAD;
                }
                if (inputBuffer.remaining() < iRemaining) {
                    RXLogging.m5688e(TAG, "decode() - HW buffer too small");
                    return VideoCodecStatus.OVERLOAD;
                }
                inputBuffer.put(encodedImage.buffer);
                try {
                    this.codec.queueInputBuffer(iDequeueInputBuffer, 0, appendHisiEndCode(inputBuffer, iRemaining), encodedImage.captureTimeNs / 1000, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    RXLogging.m5689e(TAG, "queueInputBuffer failed", e);
                    return VideoCodecStatus.ERROR;
                }
            } catch (Exception e2) {
                RXLogging.m5688e(TAG, "getInputBuffers failed,useNewInputBufferAPI" + this.useNewInputBufferAPI + "exception:" + e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            RXLogging.m5689e(TAG, "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        Surface surface;
        if (this.callback == null) {
            RXLogging.m5687d(TAG, "callback uninitalized");
            return VideoCodecStatus.UNINITIALIZED;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
        VideoCodecStatus videoCodecStatusInitOutSideSurfaceTextureHelper = 1 == this.texturePlayoutMode ? initOutSideSurfaceTextureHelper(i, i2) : initSurfaceTextureHelper();
        if (videoCodecStatusInitOutSideSurfaceTextureHelper != VideoCodecStatus.OK) {
            return videoCodecStatusInitOutSideSurfaceTextureHelper;
        }
        RXLogging.m5692w(TAG, "initDecodeInternal name: " + this.codecName + " type: " + this.codecType + " width: " + i + " height: " + i2 + " sharedContext:" + this.sharedContext + " outputByDts:" + this.settings.outputByDts + ", external surface:" + this.exSurface + ", internal surface:" + this.surface + " smoothOutput:" + this.settings.enableSmoothOutput + " yuv mode:" + this.settings.enableYUVOutput + " mustUseYUVoutput:" + this.mustUseYUVoutput + ", latencyInsensitiveMode:" + this.settings.latencyInsensitiveMode + ", enableRecreateByResolution:" + this.settings.enableRecreateByResolution + ", enableBFrameDecode:" + this.settings.enableBFrameDecode + ", useAsyncMode:" + this.useAsyncMode + ", texturePlayoutMode:" + this.texturePlayoutMode + ", directRenderMode:" + this.directRenderMode + ", curEglContextNum:" + curEglContextNum);
        if (this.outputThread != null) {
            RXLogging.m5688e(TAG, "initDecodeInternal called while the codec is already running");
            releaseSurface();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i;
        this.height = i2;
        this.stride = i;
        this.sliceHeight = i2;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        this.inputFrameCount = 0L;
        this.outputFrameCount = 0L;
        this.dropDecodedFrameCount = 0L;
        this.callbackDecodedFrameCount = 0L;
        this.minFrameCache = -1L;
        this.currentFrameCache = -1L;
        this.privateParams.clear();
        this.privateParams.putAll(this.vpassPrivateParams);
        this.isError.set(false);
        synchronized (this.callbackLock) {
            this.inputBuffers.clear();
        }
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            updateCheckSysResolutionStatus();
            if (this.enableCheckSysResolutionSupport && !this.codec.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType()).getVideoCapabilities().isSizeSupported(i, i2)) {
                this.codec.release();
                releaseSurface();
                RXLogging.m5692w(TAG, "isSizeSupported return false with the resolution:" + i + "xheight, fallback software");
                this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_OUT_OF_RESOLUTION, "isSizeSupported return false with the resolution:" + i + BaseSei.f13930X + i2);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            try {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                initMediaFormat(mediaFormatCreateVideoFormat);
                if (this.useAsyncMode) {
                    HandlerThread handlerThread = new HandlerThread("asyncOutput");
                    this.asyncOutputThread = handlerThread;
                    handlerThread.start();
                    this.asyncHandler = new Handler(this.asyncOutputThread.getLooper());
                    this.running = true;
                    this.outputThreadChecker.detachThread();
                    this.codec.setCallback(this, this.asyncHandler);
                }
                int i3 = this.maxExSurfaceRecreateDecoderCount;
                if (i3 >= -1) {
                    this.exSurface = null;
                }
                if (this.outSideSurfaceTextureHelper == null || (surface = this.surface) == null) {
                    Surface surface2 = this.exSurface;
                    if (surface2 != null) {
                        this.maxExSurfaceRecreateDecoderCount = i3 + 1;
                        this.codec.configure(mediaFormatCreateVideoFormat, surface2, null, 0);
                        RXLogging.m5692w(TAG, "init codec done with external surface:" + this.exSurface);
                    } else {
                        this.codec.configure(mediaFormatCreateVideoFormat, this.surface, null, 0);
                        RXLogging.m5692w(TAG, "init codec done with internal surface:" + this.surface);
                    }
                } else {
                    this.codec.configure(mediaFormatCreateVideoFormat, surface, null, 0);
                    RXLogging.m5692w(TAG, "init codec done control by outside with internal surface:" + this.surface);
                }
                this.codec.start();
            } catch (IllegalArgumentException | IllegalStateException unused) {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = this.codec.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType());
                RXLogging.m5692w(TAG, "current decoder SupportedHeights:" + capabilitiesForType.getVideoCapabilities().getSupportedHeights());
                RXLogging.m5692w(TAG, "current decoder SupportedWidths:" + capabilitiesForType.getVideoCapabilities().getSupportedWidths());
                RXLogging.m5692w(TAG, "current decoder SupportedFrameRates:" + capabilitiesForType.getVideoCapabilities().getSupportedFrameRates());
                if (!capabilitiesForType.getVideoCapabilities().getSupportedHeights().contains(Integer.valueOf(i2)) || !capabilitiesForType.getVideoCapabilities().getSupportedWidths().contains(Integer.valueOf(i))) {
                    this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_OUT_OF_RESOLUTION, "hardware decoder not support the resolution:" + i + BaseSei.f13930X + i2);
                    this.codec.release();
                    releaseSurface();
                    RXLogging.m5692w(TAG, "initDecodeInternal err,decoder not support the resolution:" + i + "xheight, fallback software");
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                RXLogging.m5688e(TAG, "initDecode Argument err, try reset Argument and reconfig");
                this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, "initDecode Argument err, try reset Argument and reconfig");
                MediaFormat mediaFormatCreateVideoFormat2 = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                if (this.sharedContext == null || this.settings.enableYUVOutput) {
                    mediaFormatCreateVideoFormat2.setInteger("color-format", this.colorFormat);
                }
                try {
                    this.codec.configure(mediaFormatCreateVideoFormat2, this.surface, null, 0);
                    this.codec.start();
                } catch (IllegalArgumentException | IllegalStateException e) {
                    RXLogging.m5688e(TAG, "initDecode failed when retry config:" + e);
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    this.callback.onMediaCodecStatus(VideoCodecStatus.MEDIACODEC_EXCEPTION, stringWriter.toString());
                    this.codec.release();
                    releaseSurface();
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            }
            this.maxExSurfaceRecreateDecoderCount = 0;
            if (!this.useAsyncMode) {
                this.running = true;
                try {
                    this.outputThreadChecker.detachThread();
                    Thread threadCreateOutputThread = createOutputThread();
                    this.outputThread = threadCreateOutputThread;
                    threadCreateOutputThread.start();
                } catch (Exception e2) {
                    this.codec.release();
                    releaseSurface();
                    RXLogging.m5689e(TAG, "outputThread create err, fallback software:", e2);
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
            }
            if (this.directRenderMode == 2) {
                createDirectRenderVSyncThread();
            }
            RXLogging.m5692w(TAG, "initDecodeInternal done,init video decoder cost time:" + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            Surface surface3 = this.exSurface;
            if (surface3 != null && this.surface == null) {
                this.usingInternalSurfaceLast = false;
            } else if (surface3 == null && this.surface != null && !this.usingInternalSurfaceLast) {
                this.usingInternalSurfaceLast = true;
                this.callback.onMediaCodecStatus(VideoCodecStatus.USING_INTERNAL_SURFACE, "using internal surface");
            }
            return VideoCodecStatus.OK;
        } catch (IOException | IllegalArgumentException | IllegalStateException | NullPointerException unused2) {
            RXLogging.m5688e(TAG, "Cannot create media decoder " + this.codecName);
            releaseSurface();
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private void initMediaFormat(MediaFormat mediaFormat) {
        if ((this.sharedContext == null || this.settings.enableYUVOutput) && this.exSurface == null) {
            RXLogging.m5692w(TAG, "init colorFormat is(I420:19):" + this.colorFormat);
            setIntegerParam(mediaFormat, "color-format", Integer.valueOf(this.colorFormat));
        }
        MediaCodecWrapper mediaCodecWrapper = this.codec;
        if (mediaCodecWrapper != null && mediaCodecWrapper.getCodecInfo().getCapabilitiesForType(this.codecType.mimeType()).isFeatureSupported("adaptive-playback")) {
            boolean z = setAdaptivePlaybackParam(mediaFormat, "max-width", Integer.valueOf(mediaFormat.getInteger("width"))) && setAdaptivePlaybackParam(mediaFormat, "max-height", Integer.valueOf(mediaFormat.getInteger("height")));
            this.enable_adaptive_playback = z;
            if (z) {
                this.adaptive_playback_max_width = mediaFormat.getInteger("max-width");
                this.adaptive_playback_max_height = mediaFormat.getInteger("max-height");
                RXLogging.m5692w(TAG, "enable adaptive playback max_width: " + this.adaptive_playback_max_width + ", max_height: " + this.adaptive_playback_max_height);
            }
        }
        VideoDecoder.Settings settings = this.settings;
        if (settings.outputByDts && !settings.latencyInsensitiveMode) {
            setIntegerParam(mediaFormat, "low-latency", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-picture-order.enable", 1);
            setIntegerParam(mediaFormat, "vendor.qti-ext-dec-low-latency.enable", 1);
            setIntegerParam(mediaFormat, "vendor.rtc-ext-dec-low-latency.enable", 1);
            if (this.width < this.height) {
                setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            }
            setIntegerParam(mediaFormat, "vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
            setIntegerParam(mediaFormat, "fast-output-mode", 1);
            setStringParam(mediaFormat, "vendor.vdec.example-ext-dec-low-latency.enable", "true");
        }
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (!entry.getKey().equals("max-width") && !entry.getKey().equals("max-height")) {
                RXLogging.m5692w(TAG, "set android hardware decoder private param with Key:" + entry.getKey() + " Value:" + entry.getValue());
                if (entry.getKey().equals(HISI_DECODER_END_CODE) && "0".equals(entry.getValue())) {
                    this.enableHisiEndCode = false;
                    RXLogging.m5692w(TAG, "set android hardware decoder close hisi hw decoder endcode");
                } else {
                    RXLogging.m5692w(TAG, "set android hardware decoder private param with Key:" + entry.getKey() + " Value:" + entry.getValue());
                    if (isNumeric(entry.getValue())) {
                        mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
                    } else if (entry.getValue().length() > 0) {
                        mediaFormat.setString(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    private VideoCodecStatus initOutSideSurfaceTextureHelper(int i, int i2) {
        try {
            if (!this.settings.enableYUVOutput && curEglContextNum < maxEglContextNum && this.outSideSurfaceTextureHelper == null) {
                SurfaceTextureHelper surfaceTextureHelperCreateSurfaceTextureHelper = createSurfaceTextureHelper();
                this.outSideSurfaceTextureHelper = surfaceTextureHelperCreateSurfaceTextureHelper;
                initSurfaceTextureHelper(surfaceTextureHelperCreateSurfaceTextureHelper, true);
            }
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m5688e(TAG, "err when create surface:" + e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoCodecStatus initSurfaceTextureHelper() {
        try {
            if ((this.sharedContext != null || this.settings.enableAGFXSurfaceTextureHelper) && this.exSurface == null) {
                VideoDecoder.Settings settings = this.settings;
                if (!settings.enableYUVOutput && curEglContextNum < maxEglContextNum && (this.surfaceTextureHelper == null || !settings.enableSurfaceTextureReuse)) {
                    SurfaceTextureHelper surfaceTextureHelperCreateSurfaceTextureHelper = createSurfaceTextureHelper();
                    this.surfaceTextureHelper = surfaceTextureHelperCreateSurfaceTextureHelper;
                    initSurfaceTextureHelper(surfaceTextureHelperCreateSurfaceTextureHelper, false);
                }
            }
            return VideoCodecStatus.OK;
        } catch (Exception e) {
            RXLogging.m5688e(TAG, "err when create surface:" + e);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isNumeric(String str) {
        return str != null && str.matches("[0-9]+");
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
            RXLogging.m5690i(TAG, "stream have crop info newWidth:" + integer + " newHeight:" + integer2);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                if (!this.hasDecodedFirstFrame || (this.width == integer && this.height == integer2)) {
                    this.width = integer;
                    this.height = integer2;
                    if (((this.surfaceTextureHelper == null && this.outSideSurfaceTextureHelper == null && this.exSurface == null) || this.settings.enableYUVOutput) && mediaFormat.containsKey("color-format")) {
                        this.colorFormat = mediaFormat.getInteger("color-format");
                        RXLogging.m5690i(TAG, "Color: 0x" + Integer.toHexString(this.colorFormat));
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
                            RXLogging.m5690i(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                            this.stride = Math.max(this.width, this.stride);
                            this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                stopOnOutputThread(new RuntimeException("Unexpected size change. Configured " + this.width + "*" + this.height + ". New " + integer + "*" + integer2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        if (!this.settings.enableSurfaceTextureReuse) {
            releaseSurface();
        }
        if (videoCodecStatusReleaseInternal != VideoCodecStatus.OK) {
            RXLogging.m5688e(TAG, "releaseInternal err");
            return videoCodecStatusReleaseInternal;
        }
        VideoCodecStatus videoCodecStatusInitDecodeInternal = VideoCodecStatus.FALLBACK_SOFTWARE;
        for (int i3 = 0; i3 < 2; i3++) {
            videoCodecStatusInitDecodeInternal = initDecodeInternal(i, i2);
            if (VideoCodecStatus.OK == videoCodecStatusInitDecodeInternal) {
                return videoCodecStatusInitDecodeInternal;
            }
            releaseSurface();
        }
        return videoCodecStatusInitDecodeInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        try {
            this.outputThreadChecker.checkIsOnValidThread();
        } catch (IllegalStateException unused) {
            RXLogging.m5688e(TAG, "thread check err");
        }
        RXLogging.m5690i(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            RXLogging.m5689e(TAG, "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            RXLogging.m5689e(TAG, "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        releaseSurface();
        RXLogging.m5690i(TAG, "Release on output thread done");
    }

    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            RXLogging.m5687d(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            Thread thread = this.directRenderThread;
            if (thread != null) {
                thread.join(6000L);
                this.directRenderThread = null;
            }
        } catch (Exception e) {
            RXLogging.m5689e(TAG, "directRenderThread join error", e);
        }
        if (this.useAsyncMode) {
            VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
            this.running = false;
            final HandlerThread handlerThread = this.asyncOutputThread;
            if (handlerThread != null) {
                this.asyncHandler.post(new Runnable() { // from class: com.bytedance.realx.video.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidVideoDecoder.m5695b(this.f4737a, handlerThread);
                    }
                });
                if (!ThreadUtils.joinUninterruptibly(this.asyncOutputThread, 6000L)) {
                    RXLogging.m5689e(TAG, "Media decoder release timeout", new RuntimeException());
                    videoCodecStatus = VideoCodecStatus.TIMEOUT;
                }
                this.asyncOutputThread = null;
                this.asyncHandler = null;
            }
            return videoCodecStatus;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 6000L)) {
                RXLogging.m5689e(TAG, "Media decoder release timeout", new RuntimeException());
                VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.TIMEOUT;
                this.codec = null;
                this.outputThread = null;
                return videoCodecStatus2;
            }
            this.codec = null;
            this.outputThread = null;
            if (this.shutdownException == null) {
                return VideoCodecStatus.OK;
            }
            RXLogging.m5689e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
            this.shutdownException = null;
            return VideoCodecStatus.ERROR;
        } catch (Throwable th) {
            this.codec = null;
            this.outputThread = null;
            throw th;
        }
    }

    private boolean setAdaptivePlaybackParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str) && isNumeric(entry.getValue())) {
                int iMax = Math.max(Integer.parseInt(entry.getValue()), num.intValue());
                if (iMax > ADAPTIVE_PLAYBACK_MAX_DIMENSION || iMax <= 0) {
                    RXLogging.m5692w(TAG, "setAdaptivePlaybackParam failed! exceeding the valid range(0, 10000], key: " + entry.getKey() + ", value: " + iMax + " {privateConfig: " + Integer.parseInt(entry.getValue()) + ", resoluion: " + num + "}");
                    return false;
                }
                mediaFormat.setInteger(entry.getKey(), iMax);
                RXLogging.m5692w(TAG, "setAdaptivePlaybackParam params key: " + entry.getKey() + ", value:" + Math.max(Integer.parseInt(entry.getValue()), num.intValue()) + " {privateConfig: " + Integer.parseInt(entry.getValue()) + ", resoluion: " + num + "}");
                return true;
            }
        }
        RXLogging.m5692w(TAG, "setAdaptivePlaybackParam, but private key isn't setted, params: " + str);
        return false;
    }

    private void setIntegerParam(MediaFormat mediaFormat, String str, Integer num) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (isNumeric(entry.getValue())) {
                    mediaFormat.setInteger(entry.getKey(), Integer.parseInt(entry.getValue()));
                    RXLogging.m5692w(TAG, "the decoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                    this.privateParams.remove(str);
                    return;
                }
                this.privateParams.remove(str);
                if (entry.getValue().length() <= 0) {
                    RXLogging.m5692w(TAG, "the decoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                    return;
                }
                RXLogging.m5692w(TAG, "the decoder params " + entry.getKey() + " set by vpaas is invalid with value:" + entry.getValue() + ",skip it");
            }
        }
        RXLogging.m5692w(TAG, "decoder int params has been set with Key:" + str + " Value:" + num);
        mediaFormat.setInteger(str, num.intValue());
    }

    private void setStringParam(MediaFormat mediaFormat, String str, String str2) {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(str)) {
                if (entry.getValue().length() > 0) {
                    mediaFormat.setString(entry.getKey(), entry.getValue());
                    RXLogging.m5692w(TAG, "the decoder params " + entry.getKey() + " is coverd by vpaas with value:" + entry.getValue());
                } else {
                    RXLogging.m5692w(TAG, "the decoder params " + entry.getKey() + " is disabled by vpaas,skip it");
                }
                this.privateParams.remove(str);
                return;
            }
        }
        RXLogging.m5692w(TAG, "decoder string params has been set with Key:" + str + " Value:" + str2);
        mediaFormat.setString(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    private void smoothOutputFrame() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.currentOutputTime = jElapsedRealtime;
        long j = this.outputFrameCount;
        long j2 = this.inputFrameCount;
        if (j > j2) {
            this.outputFrameCount = j2;
        }
        long j3 = this.minFrameCache;
        long j4 = this.currentFrameCache;
        if (j3 < 0) {
            this.minFrameCache = j4;
        } else {
            if (j3 > j4 && j4 >= 0) {
                j3 = j4;
            }
            this.minFrameCache = j3;
        }
        long j5 = this.lastOutputTime;
        long j6 = jElapsedRealtime - j5;
        long j7 = this.avgInputTimeDelta;
        long j8 = this.currentInputTimeDelta;
        if (j7 <= 0) {
            if (j8 > 0) {
                j7 = j8;
            } else {
                j7 = 16;
            }
        } else if (j8 < j7) {
            j7 = 10;
            if (j8 > 10) {
                j7 = j8;
            }
        }
        if (j5 > 0 && j6 < j7) {
            long j9 = j7 - j6;
            if (this.currentFrameCache > this.minFrameCache) {
                j9 /= 2;
            }
            if (j9 > 1300) {
                j9 = 1300;
            }
            if (j9 > 0) {
                try {
                    synchronized (this.smoothOutputLock) {
                        this.smoothOutputLock.wait(j9);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        this.lastOutputTime = SystemClock.elapsedRealtime();
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        if (this.useAsyncMode) {
            this.isError.set(true);
        } else {
            this.running = false;
            this.shutdownException = exc;
        }
    }

    private void updateCheckSysResolutionStatus() {
        for (Map.Entry<String, String> entry : this.privateParams.entrySet()) {
            if (entry.getKey().equals(ENABLE_CHECK_SYS_RESOLUTION_SUPPORT)) {
                if (entry.getValue() == "0") {
                    this.enableCheckSysResolutionSupport = false;
                    RXLogging.m5692w(TAG, "set android hardware decoder close check sys resolution support");
                } else if (entry.getValue() == "1") {
                    this.enableCheckSysResolutionSupport = true;
                    RXLogging.m5692w(TAG, "set android hardware decoder open check sys resolution support");
                }
            }
        }
    }

    public NativeRXByteMemory allocateI420Buffer(int i, int i2) {
        return NativeRXByteMemory.createRXByteMemory(i, i2, RXPixelFormat.kI420, 0L);
    }

    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return this.settings.enableAGFXSurfaceTextureHelper ? SurfaceTextureHelper.createWithAGFX("decoder-texture-thread") : SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus decode(EncodedImage encodedImage) {
        VideoCodecStatus videoCodecStatusReinitDecode;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.lastInputTime;
        if (j > 0) {
            this.currentInputTimeDelta = jElapsedRealtime - j;
        }
        this.lastInputTime = jElapsedRealtime;
        long j2 = this.packetCount2s + 1;
        this.packetCount2s = j2;
        if (0 == this.timeForAvg) {
            this.timeForAvg = jElapsedRealtime;
        }
        long j3 = this.timeForAvg;
        if (jElapsedRealtime - j3 >= 2000 && j2 > 0) {
            this.avgInputTimeDelta = (jElapsedRealtime - j3) / j2;
            this.packetCount2s = 0L;
            this.timeForAvg = jElapsedRealtime;
        }
        if (this.isError.get()) {
            RXLogging.m5688e(TAG, "mediacodec error.");
            return VideoCodecStatus.ERROR;
        }
        try {
            int i = encodedImage.encodedWidth;
            boolean z = true;
            if (i != this.encoded_width || encodedImage.encodedHeight != this.encoded_height) {
                if (this.codec != null && this.enable_adaptive_playback && (i > this.adaptive_playback_max_width || encodedImage.encodedHeight > this.adaptive_playback_max_height)) {
                    RXLogging.m5692w(TAG, "frame resolution(" + encodedImage.encodedWidth + "*" + encodedImage.encodedHeight + " exceeded maximum limit of adaptive playback max_width: " + this.adaptive_playback_max_width + ", max_height: " + this.adaptive_playback_max_height);
                    this.enable_adaptive_playback = false;
                }
                StringBuilder sb = new StringBuilder("resolution changed, try to reinit decoder. enable_adaptive_playback: ");
                sb.append(this.enable_adaptive_playback);
                sb.append(", is first init: ");
                sb.append(this.encoded_width == 0);
                sb.append(", new width: ");
                sb.append(encodedImage.encodedWidth);
                sb.append(", new height: ");
                sb.append(encodedImage.encodedHeight);
                RXLogging.m5692w(TAG, sb.toString());
                if ((this.encoded_width == 0 || !this.enable_adaptive_playback) && (videoCodecStatusReinitDecode = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight)) != VideoCodecStatus.OK) {
                    return videoCodecStatusReinitDecode;
                }
                synchronized (this.dimensionLock) {
                    int i2 = encodedImage.encodedWidth;
                    this.encoded_width = i2;
                    int i3 = encodedImage.encodedHeight;
                    this.encoded_height = i3;
                    this.width = i2;
                    this.height = i3;
                }
            }
            if (this.codec != null && this.callback != null) {
                ByteBuffer byteBuffer = encodedImage.buffer;
                if (byteBuffer == null) {
                    RXLogging.m5688e(TAG, "decode() - no input data");
                    return VideoCodecStatus.ERR_PARAMETER;
                }
                if (byteBuffer.remaining() == 0) {
                    RXLogging.m5688e(TAG, "decode() - input buffer empty");
                    return VideoCodecStatus.ERR_PARAMETER;
                }
                if (this.keyFrameRequired) {
                    if (encodedImage.frameType != EncodedImage.FrameType.kIntra) {
                        RXLogging.m5688e(TAG, "decode() - key frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    }
                    if (!encodedImage.completeFrame) {
                        RXLogging.m5688e(TAG, "decode() - complete frame required first");
                        return VideoCodecStatus.NO_OUTPUT;
                    }
                }
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.OK;
                VideoCodecStatus videoCodecStatusFeedInputBufferAsync = this.useAsyncMode ? feedInputBufferAsync(encodedImage) : feedInputBufferSync(encodedImage);
                if (videoCodecStatusFeedInputBufferAsync != VideoCodecStatus.OK) {
                    return videoCodecStatusFeedInputBufferAsync;
                }
                if (this.keyFrameRequired) {
                    this.keyFrameRequired = false;
                }
                VideoDecoder.Settings settings = this.settings;
                if (settings.enableSmoothOutput && !settings.latencyInsensitiveMode && !settings.enableBFrameDecode) {
                    long j4 = this.inputFrameCount - this.outputFrameCount;
                    if (j4 <= 0) {
                        j4 = this.currentFrameCache;
                    }
                    this.currentFrameCache = j4;
                    long j5 = this.minFrameCache;
                    if (j5 >= 0 && j4 > j5) {
                        try {
                            synchronized (this.smoothOutputLock) {
                                this.smoothOutputLock.notify();
                            }
                        } catch (Exception unused) {
                            RXLogging.m5688e(TAG, "currentFrameCache:" + this.currentFrameCache + " minFrameCache:" + this.minFrameCache);
                        }
                    }
                }
                this.inputFrameCount++;
                return VideoCodecStatus.OK;
            }
            StringBuilder sb2 = new StringBuilder("decode uninitalized, codec: ");
            if (this.codec == null) {
                z = false;
            }
            sb2.append(z);
            sb2.append(", callback: ");
            sb2.append(this.callback);
            RXLogging.m5687d(TAG, sb2.toString());
            return VideoCodecStatus.UNINITIALIZED;
        } catch (Exception e) {
            RXLogging.m5689e(TAG, "android decode err", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public void deliverDecodedFrame() {
        try {
            this.outputThreadChecker.checkIsOnValidThread();
            if (this.codec == null) {
                RXLogging.m5692w(TAG, "codec is null when call deliverDecodedFrame");
                return;
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.settings.latencyInsensitiveMode ? 25000L : 100000L);
            if (iDequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else {
                if (iDequeueOutputBuffer >= 0) {
                    drainOutputFrame(bufferInfo, iDequeueOutputBuffer);
                    return;
                }
                RXLogging.m5692w(TAG, "dequeueOutputBuffer err, returned " + iDequeueOutputBuffer);
            }
        } catch (Exception unused) {
            RXLogging.m5688e(TAG, "deliverDecodedFrame failed");
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public void disableExternalSurface() {
        RXLogging.m5692w(TAG, "disable external surface.");
        this.exSurface = null;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public String getImplementationName() {
        return this.codecName;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public boolean getPrefersLateDecoding() {
        return true;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        this.callback = callback;
        this.settings = settings;
        EglBase.Context context = settings.sharedContext;
        if (context != null) {
            this.sharedContext = context;
        }
        this.useAsyncMode = settings.enableAsyncMode;
        int i = settings.directRenderMode;
        this.directRenderMode = i;
        if (i == 2) {
            this.texturePlayoutMode = 0;
        } else {
            this.texturePlayoutMode = settings.texturePlayoutMode;
        }
        return VideoCodecStatus.OK;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        MediaCodecWrapper mediaCodecWrapper;
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            this.isError.set(true);
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder, com.bytedance.realx.video.VideoSink
    public void onFrame(RXVideoFrameInterface rXVideoFrameInterface) {
        VideoDecoder.Callback callback = this.callback;
        if (callback == null) {
            this.dropDecodedFrameCount++;
            RXLogging.m5688e(TAG, "callback is null, dropDecodedFrameCount:" + this.dropDecodedFrameCount);
            return;
        }
        synchronized (this.renderedTextureMetadataLock) {
            try {
                DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
                if (decodedTextureMetadata == null) {
                    RXLogging.m5688e(TAG, "renderedTextureMetadata is null drop current decoded frame,running:" + this.running);
                    callback.onMediaCodecStatus(VideoCodecStatus.DROP_DECODED_FRAME, "renderedTextureMetadata is null");
                    this.dropDecodedFrameCount = this.dropDecodedFrameCount + 1;
                    return;
                }
                long j = decodedTextureMetadata.presentationTimestampUs * 1000;
                this.renderedTextureMetadata = null;
                rXVideoFrameInterface.setTimestampNs(j);
                callback.onDecodedFrame(rXVideoFrameInterface);
                this.callbackDecodedFrameCount++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        MediaCodecWrapper mediaCodecWrapper;
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            synchronized (this.callbackLock) {
                this.inputBuffers.addLast(Integer.valueOf(i));
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        MediaCodecWrapper mediaCodecWrapper;
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            try {
                drainOutputFrame(bufferInfo, i);
            } catch (Exception e) {
                RXLogging.m5688e(TAG, "" + e);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecWrapper mediaCodecWrapper;
        RXLogging.m5688e(TAG, "onOutputFormatChanged ");
        if (this.running && (mediaCodecWrapper = this.codec) != null && mediaCodecWrapper.getRealCodec() == mediaCodec) {
            reformat(mediaFormat);
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus release() {
        RXLogging.m5692w(TAG, "mediacodec release start");
        VideoCodecStatus videoCodecStatusReleaseInternal = releaseInternal();
        releaseSurface();
        releaseSurfaceTextureHelper();
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.encoded_width = 0;
        this.encoded_height = 0;
        return videoCodecStatusReleaseInternal;
    }

    public void releaseSurface() {
        RXLogging.m5692w(TAG, "releaseSurface start");
        try {
            if (this.surface != null) {
                RXLogging.m5692w(TAG, "release surface");
                this.surface.release();
                this.surface = null;
            }
            synchronized (this.surfaceTextureHelperLock) {
                try {
                    if (this.surfaceTextureHelper != null) {
                        RXLogging.m5692w(TAG, "surfaceTextureHelper.stopListening()");
                        this.surfaceTextureHelper.stopListening();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!this.settings.enableSurfaceTextureReuse) {
                releaseSurfaceTextureHelper();
            }
        } catch (Exception e) {
            RXLogging.m5688e(TAG, "releaseSurface:" + e);
        }
        RXLogging.m5692w(TAG, "releaseSurface end");
    }

    public void releaseSurfaceTextureHelper() {
        synchronized (this.surfaceTextureHelperLock) {
            try {
                if (this.surfaceTextureHelper != null) {
                    RXLogging.m5692w(TAG, "release surfaceTextureHelper");
                    this.surfaceTextureHelper.dispose();
                    this.surfaceTextureHelper = null;
                    curEglContextNum--;
                    RXLogging.m5692w(TAG, "release surfaceTextureHelper done, curEglContextNum:" + curEglContextNum);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus setDeliverParams(boolean z, int i, float f, float f2, int i2) {
        RXLogging.m5692w(TAG, "got android hardware decoder setDeliverParams enable:" + z + ", maxTryCount:" + i + ", minAccelerateRatio:" + f + ", maxDeaccelerateRatio:" + f2 + ", frameCacheThreshold:" + i2);
        this.enableRetryDeliver = z;
        this.maxTryCount = i;
        this.minAccelerateRatio = f;
        this.maxDeaccelerateRatio = f2;
        this.frameCacheThreshold = i2;
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public void setExternalSurface(Surface surface) {
        MediaCodecWrapper mediaCodecWrapper;
        RXLogging.m5692w(TAG, "set external surface:" + surface);
        if (surface != this.exSurface && (mediaCodecWrapper = this.codec) != null) {
            try {
                mediaCodecWrapper.setOutputSurface(surface);
            } catch (Exception e) {
                RXLogging.m5688e(TAG, "setOutputSurface error:" + e);
            }
        }
        this.exSurface = surface;
        this.surface = null;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus setPrivateParam(String str, String str2) {
        RXLogging.m5692w(TAG, "got android hardware decoder setPrivateParam key:" + str + " value:" + str2);
        if (str.equals(DIRECT_RENDER_BY_VSYNC_MAX_CACHE_SIZE)) {
            if (isNumeric(str2)) {
                maxDirectRenderCacheSize = Integer.parseInt(str2);
            }
            return VideoCodecStatus.OK;
        }
        if (str.equals(MAX_EGL_NUM)) {
            if (isNumeric(str2)) {
                maxEglContextNum = Integer.parseInt(str2);
            }
            RXLogging.m5692w(TAG, "this is not a param set to HW Decoder, only for control.");
            return VideoCodecStatus.OK;
        }
        if (str.equals(FLAG_CHECK_TEXTURE_SIZE)) {
            this.enableTextureSizeCheck = "true".equalsIgnoreCase(str2);
            RXLogging.m5692w(TAG, "set FLAG_CHECK_TEXTURE_SIZE to " + this.enableTextureSizeCheck);
            return VideoCodecStatus.OK;
        }
        if (str.equals(NEW_INPUT_BUFFER_API)) {
            if (isNumeric(str2)) {
                this.useNewInputBufferAPI = Integer.parseInt(str2) >= 1;
            }
            RXLogging.m5692w(TAG, "this is not a param set to HW Decoder, only for control. useNewInputBufferAPI:" + this.useNewInputBufferAPI);
            return VideoCodecStatus.OK;
        }
        if (!str.equals(NEW_OUTPUT_BUFFER_API)) {
            this.vpassPrivateParams.put(str, str2);
            return VideoCodecStatus.OK;
        }
        if (isNumeric(str2)) {
            this.useNewOutputBufferAPI = Integer.parseInt(str2) >= 1;
        }
        RXLogging.m5692w(TAG, "this is not a param set to HW Decoder, only for control. useNewOutputBufferAPI:" + this.useNewOutputBufferAPI);
        return VideoCodecStatus.OK;
    }

    @Override // com.bytedance.realx.video.VideoDecoder
    public VideoCodecStatus updateSettings(VideoDecoder.Settings settings) {
        this.settings = settings;
        RXLogging.m5692w(TAG, "updateSettings outputByDts:" + this.settings.outputByDts + ", smoothOutput:" + this.settings.enableSmoothOutput + ", yuv mode:" + this.settings.enableYUVOutput + ", latencyInsensitiveMode:" + this.settings.latencyInsensitiveMode + ", enableRecreateByResolution:" + this.settings.enableRecreateByResolution + ", enableBFrameDecode:" + this.settings.enableBFrameDecode + ", context: " + this.settings.sharedContext + ", enableAsyncMode:" + settings.enableAsyncMode + ", directRenderMode:" + settings.directRenderMode + ", texturePlayoutMode:" + settings.texturePlayoutMode);
        return VideoCodecStatus.OK;
    }

    public void initSurfaceTextureHelper(SurfaceTextureHelper surfaceTextureHelper, boolean z) {
        if (surfaceTextureHelper == null) {
            RXLogging.m5692w(TAG, "surfaceTextureHelper create fail,egl context maybe is full, the hw decoder should use yuvoutput mode");
            this.mustUseYUVoutput = true;
            return;
        }
        RXLogging.m5692w(TAG, "surfaceTextureHelper create successful.");
        if (!this.settings.enableAGFXSurfaceTextureHelper) {
            curEglContextNum++;
        }
        surfaceTextureHelper.setEnableOutsideControlTextureMemory(z);
        this.surface = new Surface(surfaceTextureHelper.getSurfaceTexture());
        surfaceTextureHelper.startListening(this);
    }
}
