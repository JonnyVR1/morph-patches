package io.agora.base.internal.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.tencent.connect.common.Constants;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public class EglRenderer implements VideoSink {
    private static final boolean DEBUG = false;
    private static long DEFAULT_FRAME_INTERVAL_NANOS = 16666666;
    private static boolean ENABLE_LAST_FRAME = false;
    private static final long LOG_INTERVAL_SEC = 4;
    private static final int MAX_INVOKE_TIME_MS = 1000;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final String TAG = "EglRenderer";

    @Nullable
    private RendererCommon.GlDrawer drawer;

    @Nullable
    private EglBase eglBase;
    protected boolean isFirstFrameRendered;
    private long minRenderPeriodNs;
    private boolean mirror;
    protected final String name;
    private long nextFrameTimeNs;
    private Rect rect;
    private int renderMode;

    @Nullable
    private Handler renderThreadHandler;
    protected RendererCommon.RendererEvents rendererEvents;
    private float viewHeight;
    private float viewWidth;
    private int transferID = VideoFrame.ColorSpace.Transfer.Unspecified.getTransfer();
    private final Object handlerLock = new Object();
    private final Object surfaceLock = new Object();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private boolean eglContextAttached = false;
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Matrix drawMatrix = new Matrix();

    @Nullable
    private VideoFrame lastFrame = null;
    private final Object layoutLock = new Object();
    private boolean enableAlphaMask = false;
    private StatisticsInfo statisticsInfo = new StatisticsInfo();
    private long frameIntervalNanos = 0;
    private boolean switchToStartVsync = false;
    private boolean isVsyncCallbackStared = false;
    private boolean isRenderOnSurfaceView = false;
    private boolean surfaceValid = true;
    private volatile boolean isReleasing = false;
    private volatile boolean islut10Update = false;
    private volatile boolean textureCoordUpdate = false;
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private final Runnable logStatisticsRunnable = new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.1
        @Override // java.lang.Runnable
        public void run() {
            EglRenderer.this.statisticsInfo.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                try {
                    if (EglRenderer.this.renderThreadHandler != null) {
                        EglRenderer.this.renderThreadHandler.removeCallbacks(EglRenderer.this.logStatisticsRunnable);
                        EglRenderer.this.renderThreadHandler.postDelayed(EglRenderer.this.logStatisticsRunnable, 4000L);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };
    private final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    protected Color backgroudColor = new Color(0);

    public class Color {
        public float alpha;
        public float blue;
        public float green;
        public float red;

        public Color(int i) {
            this.red = ((i >> 24) & 255) / 255.0f;
            this.green = ((i >> 16) & 255) / 255.0f;
            this.blue = ((i >> 8) & 255) / 255.0f;
            this.alpha = (i & 255) / 255.0f;
        }
    }

    public class EglSurfaceCreation implements Runnable {
        private Object surface;

        private EglSurfaceCreation() {
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                if (this.surface != null && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                    Object obj = this.surface;
                    if (obj instanceof Surface) {
                        EglRenderer.this.eglBase.createSurface((Surface) this.surface);
                    } else {
                        if (!(obj instanceof SurfaceTexture)) {
                            throw new IllegalStateException("Invalid surface: " + this.surface);
                        }
                        EglRenderer.this.eglBase.createSurface((SurfaceTexture) this.surface);
                    }
                    EglRenderer.this.eglBase.makeCurrent();
                    EglRenderer.this.eglContextAttached = true;
                    GLES20.glPixelStorei(3317, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    public static class HandlerWithFrameSyncControl extends Handler implements Choreographer.FrameCallback {
        private static final int MSG_SEND_CHOREOGRAPHER_QUIT_SIGNAL = 0;
        private static final int MSG_SEND_DROP_FRAME = 1;
        private static final int MSG_SEND_RENDER_FRAME_SIGNAL = 2;
        private static final int QUEUE_BUFFER = 3;
        private final Runnable exceptionCallback;
        private boolean isPreviousFrameDrawn;
        private VsyncStats lastPersionStats;
        private long mLastFrameTimeNanos;
        private final Object queueLock;
        private final Queue<VideoFrameInternal> renderFrames;
        private WeakReference<EglRenderer> weakRenderer;

        public HandlerWithFrameSyncControl(Looper looper, Runnable runnable, EglRenderer eglRenderer) {
            super(looper);
            this.queueLock = new Object();
            this.mLastFrameTimeNanos = 0L;
            this.lastPersionStats = VsyncStats.NORMAL;
            this.exceptionCallback = runnable;
            this.renderFrames = new LinkedList();
            this.weakRenderer = new WeakReference<>(eglRenderer);
            this.mLastFrameTimeNanos = 0L;
            this.isPreviousFrameDrawn = false;
        }

        private void doLut10Frame(byte[] bArr) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.m88098e(EglRenderer.TAG, "handleMessage: weak is null");
            } else {
                eglRenderer.doLut10Frame(bArr);
            }
        }

        private void doRenderFrame(long j) {
            VideoFrameInternal videoFrameInternalPoll;
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.m88098e(EglRenderer.TAG, "handleMessage: weak is null");
                return;
            }
            long j2 = 0;
            if (eglRenderer.frameIntervalNanos == 0) {
                return;
            }
            if (this.mLastFrameTimeNanos == 0) {
                this.mLastFrameTimeNanos = j;
            }
            long j3 = j - this.mLastFrameTimeNanos;
            this.mLastFrameTimeNanos = j;
            if (j3 >= eglRenderer.frameIntervalNanos + (eglRenderer.frameIntervalNanos / 2)) {
                j2 = j3 / eglRenderer.frameIntervalNanos;
                this.lastPersionStats = VsyncStats.DELAY;
            } else {
                this.lastPersionStats = VsyncStats.NORMAL;
            }
            eglRenderer.statisticsInfo.updateEveryVsyncStatistics(this.lastPersionStats, this.isPreviousFrameDrawn, j2, j3);
            this.isPreviousFrameDrawn = false;
            synchronized (this.queueLock) {
                videoFrameInternalPoll = this.renderFrames.poll();
            }
            if (videoFrameInternalPoll == null) {
                return;
            }
            this.isPreviousFrameDrawn = true;
            eglRenderer.renderFrameOnRenderThread(videoFrameInternalPoll, j);
            if (videoFrameInternalPoll.frame.getAlphaBuffer() != null) {
                videoFrameInternalPoll.frame.releaseAlphaBuffer();
            }
        }

        private void stopChoreographer() {
            synchronized (this.queueLock) {
                try {
                    for (VideoFrameInternal videoFrameInternal : this.renderFrames) {
                        videoFrameInternal.frame.release();
                        if (videoFrameInternal.frame.getAlphaBuffer() != null) {
                            videoFrameInternal.frame.releaseAlphaBuffer();
                        }
                    }
                    this.renderFrames.clear();
                    EglRenderer eglRenderer = this.weakRenderer.get();
                    if (eglRenderer == null) {
                        Logging.m88098e(EglRenderer.TAG, "handleMessage: weak is null");
                    } else if (eglRenderer.switchToStartVsync) {
                        Choreographer.getInstance().removeFrameCallback(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                Logging.m88099e(EglRenderer.TAG, "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.m88098e(EglRenderer.TAG, "doFrame: weak is null");
                return;
            }
            boolean unused = eglRenderer.isVsyncCallbackStared;
            eglRenderer.isVsyncCallbackStared = true;
            sendMessage(obtainMessage(2, new Long(j)));
            Choreographer.getInstance().postFrameCallback(this);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            if (eglRenderer == null) {
                Logging.m88098e(EglRenderer.TAG, "handleMessage: weak is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                stopChoreographer();
                return;
            }
            if (i == 1) {
                RendererCommon.RendererEvents rendererEvents = eglRenderer.rendererEvents;
                if (rendererEvents != null) {
                    rendererEvents.onFrameDropped();
                }
                eglRenderer.statisticsInfo.updateFramesDropped();
                return;
            }
            if (i == 2) {
                long jNanoTime = System.nanoTime();
                Object obj = message.obj;
                if (obj != null) {
                    jNanoTime = ((Long) obj).longValue();
                }
                doRenderFrame(jNanoTime);
                return;
            }
            try {
                super.handleMessage(message);
            } catch (Exception e) {
                Logging.m88098e(EglRenderer.TAG, "setRepeatingRequest failed, error message : " + e.getMessage());
            }
        }

        public void sendFrameToRenderThread(long j, VideoFrame videoFrame) {
            synchronized (this.queueLock) {
                try {
                    videoFrame.retain();
                    if (this.renderFrames.size() >= 3) {
                        VideoFrameInternal videoFrameInternalPoll = this.renderFrames.poll();
                        if (videoFrameInternalPoll != null) {
                            videoFrameInternalPoll.frame.release();
                            if (videoFrameInternalPoll.frame.getAlphaBuffer() != null) {
                                videoFrameInternalPoll.frame.releaseAlphaBuffer();
                            }
                        }
                        sendMessage(obtainMessage(1));
                    }
                    VideoFrameInternal videoFrameInternal = new VideoFrameInternal(videoFrame, j);
                    if (!this.renderFrames.add(videoFrameInternal)) {
                        Logging.m88098e(EglRenderer.TAG, "offer error ");
                    } else if (videoFrameInternal.frame.getAlphaBuffer() != null) {
                        videoFrameInternal.frame.retainAlphaBuffer();
                    }
                    EglRenderer eglRenderer = this.weakRenderer.get();
                    if (eglRenderer != null && !eglRenderer.isVsyncCallbackStared) {
                        sendMessage(obtainMessage(2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void sendLastFrameToRenderThread(long j) {
            EglRenderer eglRenderer = this.weakRenderer.get();
            synchronized (this.queueLock) {
                try {
                    if (EglRenderer.ENABLE_LAST_FRAME && eglRenderer != null) {
                        if (!this.renderFrames.add(new VideoFrameInternal(eglRenderer.lastFrame, j))) {
                            Logging.m88098e(EglRenderer.TAG, "sendLastFrameToRenderThread offer error ");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void sendStopChoreographer() {
            sendMessage(obtainMessage(0));
        }
    }

    public class StatisticsInfo {
        private long statisticsStartTimeNs = 0;
        private long framesReceived = 0;
        private long framesDropped = 0;
        private long framesRendered = 0;
        private long framesDrawTimeNs = 0;
        private long renderTimeNs = 0;
        private long renderSwapBufferTimeNs = 0;
        private int frameDrawn = 0;
        private Object statisticsLock = new Object();
        private long vsyncNum = 0;
        private long vsyncRenderJankCount = 0;

        public StatisticsInfo() {
        }

        private String averageTimeAsString(long j, long j2) {
            if (j2 <= 0) {
                return "NA";
            }
            return ((j / j2) / 1000) + " us";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void logStatistics() {
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            long jNanoTime = System.nanoTime();
            synchronized (this.statisticsLock) {
                try {
                    long j = jNanoTime - this.statisticsStartTimeNs;
                    if (j <= 0) {
                        return;
                    }
                    float f = j;
                    float f2 = (this.framesRendered * EglRenderer.NANOS_PER_SECOND) / f;
                    float f3 = (this.framesReceived * EglRenderer.NANOS_PER_SECOND) / f;
                    EglRenderer.this.logI("logStatistics Duration: " + (j / 1000000) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". vsync jank:" + this.vsyncRenderJankCount + ". received fps: " + decimalFormat.format(f3) + ". Render fps: " + decimalFormat.format(f2) + ". Average frame draw time: " + averageTimeAsString(this.framesDrawTimeNs, this.framesRendered) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                    resetStatistics(jNanoTime);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void resetStatistics(long j) {
            synchronized (this.statisticsLock) {
                this.statisticsStartTimeNs = j;
                this.framesReceived = 0L;
                this.framesDropped = 0L;
                this.framesRendered = 0L;
                this.framesDrawTimeNs = 0L;
                this.renderTimeNs = 0L;
                this.renderSwapBufferTimeNs = 0L;
                this.vsyncRenderJankCount = 0L;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateEveryVsyncStatistics(VsyncStats vsyncStats, boolean z, long j, long j2) {
            synchronized (this.statisticsLock) {
                try {
                    if (vsyncStats != VsyncStats.NORMAL) {
                        if (z) {
                            j--;
                        }
                        this.vsyncRenderJankCount += j;
                    } else if (!z) {
                        this.vsyncRenderJankCount++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFrameReceived() {
            synchronized (this.statisticsLock) {
                this.framesReceived++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFramesDropped() {
            synchronized (this.statisticsLock) {
                this.framesDropped++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateFramesHasDrawn(long j, long j2, long j3, long j4) {
            synchronized (this.statisticsLock) {
                this.framesRendered++;
                this.framesDrawTimeNs += j - j2;
                this.renderTimeNs += j - j3;
                this.renderSwapBufferTimeNs += j - j4;
                this.frameDrawn++;
            }
        }
    }

    public static class VideoFrameInternal {
        public VideoFrame frame;
        public long frameDrawStartTimeNs;

        public VideoFrameInternal(VideoFrame videoFrame, long j) {
            this.frame = videoFrame;
            this.frameDrawStartTimeNs = j;
        }
    }

    public enum VsyncStats {
        NORMAL,
        DELAY
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    public static float[] DoConvertRectFromAndroidGraphicsRect(Rect rect, VideoFrame videoFrame, boolean z) {
        float rotatedHeight;
        float rotatedHeight2;
        float rotatedWidth;
        float f;
        int rotatedWidth2;
        float f2;
        int rotatedWidth3;
        float f3;
        float rotatedWidth4;
        float f4;
        int rotatedWidth5;
        float f5;
        int rotatedWidth6;
        float f6;
        int rotation = videoFrame.getRotation() % 360;
        if (rotation == 0) {
            rotatedHeight = 1.0f - (rect.top / videoFrame.getRotatedHeight());
            rotatedHeight2 = 1.0f - (rect.bottom / videoFrame.getRotatedHeight());
            if (z) {
                rotatedWidth = 1.0f - (rect.right / videoFrame.getRotatedWidth());
                f2 = rect.left;
                rotatedWidth3 = videoFrame.getRotatedWidth();
                f3 = 1.0f - (f2 / rotatedWidth3);
            } else {
                rotatedWidth = rect.left / videoFrame.getRotatedWidth();
                f = rect.right;
                rotatedWidth2 = videoFrame.getRotatedWidth();
                f3 = f / rotatedWidth2;
            }
        } else if (rotation == 90) {
            rotatedHeight = rect.top / videoFrame.getRotatedHeight();
            rotatedHeight2 = rect.bottom / videoFrame.getRotatedHeight();
            if (z) {
                rotatedWidth4 = 1.0f - (rect.left / videoFrame.getRotatedWidth());
                f5 = rect.right;
                rotatedWidth6 = videoFrame.getRotatedWidth();
                f6 = 1.0f - (f5 / rotatedWidth6);
                float f7 = rotatedWidth4;
                rotatedWidth = f6;
                f3 = f7;
            } else {
                rotatedWidth4 = rect.right / videoFrame.getRotatedWidth();
                f4 = rect.left;
                rotatedWidth5 = videoFrame.getRotatedWidth();
                f6 = f4 / rotatedWidth5;
                float f8 = rotatedWidth4;
                rotatedWidth = f6;
                f3 = f8;
            }
        } else if (rotation == 180) {
            rotatedHeight = 1.0f - (rect.top / videoFrame.getRotatedHeight());
            rotatedHeight2 = 1.0f - (rect.bottom / videoFrame.getRotatedHeight());
            if (z) {
                rotatedWidth4 = rect.right / videoFrame.getRotatedWidth();
                f4 = rect.left;
                rotatedWidth5 = videoFrame.getRotatedWidth();
                f6 = f4 / rotatedWidth5;
                float f9 = rotatedWidth4;
                rotatedWidth = f6;
                f3 = f9;
            } else {
                rotatedWidth4 = 1.0f - (rect.left / videoFrame.getRotatedWidth());
                f5 = rect.right;
                rotatedWidth6 = videoFrame.getRotatedWidth();
                f6 = 1.0f - (f5 / rotatedWidth6);
                float f10 = rotatedWidth4;
                rotatedWidth = f6;
                f3 = f10;
            }
        } else if (rotation != 270) {
            rotatedWidth = 0.0f;
            rotatedHeight2 = 0.0f;
            f3 = 1.0f;
            rotatedHeight = 1.0f;
        } else {
            rotatedHeight = 1.0f - (rect.top / videoFrame.getRotatedHeight());
            rotatedHeight2 = 1.0f - (rect.bottom / videoFrame.getRotatedHeight());
            if (z) {
                rotatedWidth = rect.left / videoFrame.getRotatedWidth();
                f = rect.right;
                rotatedWidth2 = videoFrame.getRotatedWidth();
                f3 = f / rotatedWidth2;
            } else {
                rotatedWidth = 1.0f - (rect.right / videoFrame.getRotatedWidth());
                f2 = rect.left;
                rotatedWidth3 = videoFrame.getRotatedWidth();
                f3 = 1.0f - (f2 / rotatedWidth3);
            }
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (rotatedHeight2 > 1.0f) {
            rotatedHeight2 = 1.0f;
        }
        if (rotatedHeight > 1.0f) {
            rotatedHeight = 1.0f;
        }
        float f11 = rotatedWidth <= 1.0f ? rotatedWidth : 1.0f;
        return new float[]{f11, rotatedHeight2, f3, rotatedHeight2, f11, rotatedHeight, f3, rotatedHeight};
    }

    private void checkHDR() {
        VideoRenderUtils.isSupportedHDRByType(2);
        VideoRenderUtils.getDesiredMaxAverageLuminance();
        VideoRenderUtils.getDesiredMaxLuminance();
        VideoRenderUtils.getDesiredMinLuminance();
        VideoRenderUtils.isWideColorGamut();
        VideoRenderUtils.getPreferredWideGamutColorSpaceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfaceOnRenderThread(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logI("clearSurface");
        GLES20.glClearColor(f, f2, f3, f4);
        GLES20.glClear(16384);
        this.eglBase.swapBuffers();
    }

    private float[] convertRectFromAndroidGraphicsRect(Rect rect, VideoFrame videoFrame) {
        float[] fArrDoConvertRectFromAndroidGraphicsRect = DoConvertRectFromAndroidGraphicsRect(rect, videoFrame, this.mirror);
        logI("rotation " + (videoFrame.getRotation() % 360) + " mirror " + this.mirror + " left " + fArrDoConvertRectFromAndroidGraphicsRect[0] + " right " + fArrDoConvertRectFromAndroidGraphicsRect[2] + " top " + fArrDoConvertRectFromAndroidGraphicsRect[5] + " bottom " + fArrDoConvertRectFromAndroidGraphicsRect[1]);
        return fArrDoConvertRectFromAndroidGraphicsRect;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0070 A[PHI: r3 r8
      0x0070: PHI (r3v16 float) = (r3v12 float), (r3v17 float), (r3v18 float), (r3v19 float) binds: [B:25:0x008e, B:22:0x0085, B:19:0x007c, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r8v9 float) = (r8v5 float), (r8v10 float), (r8v11 float), (r8v12 float) binds: [B:25:0x008e, B:22:0x0085, B:19:0x007c, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    private float[] convertRectFromAndroidGraphicsRectForHiddenMode(float f, float f2, Rect rect, VideoFrame videoFrame) {
        int i = rect.bottom - rect.top;
        int i2 = rect.right;
        int i3 = rect.left;
        int i4 = i2 - i3;
        if (f2 > f) {
            i4 = (int) (i * f);
        } else {
            i = (int) (i4 / f);
        }
        int i5 = i4 / 2;
        float rotatedWidth = ((((i3 + i2) / 2) - i5) * 1.0f) / videoFrame.getRotatedWidth();
        float rotatedWidth2 = ((((rect.right + rect.left) / 2) + i5) * 1.0f) / videoFrame.getRotatedWidth();
        int i6 = i / 2;
        float rotatedHeight = ((((rect.top + rect.bottom) / 2) - i6) * 1.0f) / videoFrame.getRotatedHeight();
        float rotatedHeight2 = ((((rect.top + rect.bottom) / 2) + i6) * 1.0f) / videoFrame.getRotatedHeight();
        int rotation = videoFrame.getRotation() % 360;
        if (rotation == 0) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
            if (this.mirror) {
                float f3 = 1.0f - rotatedWidth2;
                rotatedWidth2 = 1.0f - rotatedWidth;
                rotatedWidth = f3;
            }
        } else if (rotation == 90) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
            if (this.mirror) {
                float f4 = 1.0f - rotatedWidth2;
                rotatedWidth2 = 1.0f - rotatedWidth;
                rotatedWidth = f4;
            }
        } else if (rotation == 180) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
            if (this.mirror) {
                float f5 = 1.0f - rotatedWidth2;
                rotatedWidth2 = 1.0f - rotatedWidth;
                rotatedWidth = f5;
            }
        } else if (rotation == 270) {
            rotatedHeight = 1.0f - rotatedHeight;
            rotatedHeight2 = 1.0f - rotatedHeight2;
            if (this.mirror) {
                float f6 = 1.0f - rotatedWidth2;
                rotatedWidth2 = 1.0f - rotatedWidth;
                rotatedWidth = f6;
            }
        }
        if (rotatedWidth2 > 1.0f) {
            rotatedWidth2 = 1.0f;
        }
        if (rotatedHeight2 > 1.0f) {
            rotatedHeight2 = 1.0f;
        }
        if (rotatedHeight > 1.0f) {
            rotatedHeight = 1.0f;
        }
        float f7 = rotatedWidth <= 1.0f ? rotatedWidth : 1.0f;
        logI("hidden mode: rotation " + (videoFrame.getRotation() % 360) + " mirror " + this.mirror + " left " + f7 + " right " + rotatedWidth2 + " top " + rotatedHeight + " bottom " + rotatedHeight2 + "frame texture type: " + (videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer));
        return new float[]{f7, rotatedHeight2, rotatedWidth2, rotatedHeight2, f7, rotatedHeight, rotatedWidth2, rotatedHeight};
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        synchronized (this.surfaceLock) {
            this.surfaceValid = true;
        }
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLut10Frame(byte[] bArr) {
        if (this.renderThreadHandler == null) {
            logD("Lut10Frame failed, Already released");
        } else if (this.drawer != null) {
            this.islut10Update = true;
            this.frameDrawer.doLut10Frame(this.drawer, bArr);
        }
    }

    public static double getDefaultDisplayRefreshRateParams() {
        WindowManager windowManager;
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        return (applicationContext == null || (windowManager = (WindowManager) applicationContext.getApplicationContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : defaultDisplay.getRefreshRate();
    }

    private void logD(String str) {
        Logging.m88097d(TAG, this.name + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logI(String str) {
        Logging.m88100i(TAG, this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        if (this.mirror) {
            this.drawMatrix.preScale(-1.0f, 1.0f);
        }
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                ByteBuffer byteBufferAllocateDirect = null;
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    Color color = this.backgroudColor;
                    GLES20.glClearColor(color.red, color.green, color.blue, color.alpha);
                    GLES20.glClear(16384);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight, false);
                    try {
                        byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    } catch (IllegalArgumentException e) {
                        ThrowableExtension.printStackTrace(e);
                    }
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    try {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                        next.listener.onFrame(bitmapCreateBitmap);
                    } catch (IllegalArgumentException e2) {
                        ThrowableExtension.printStackTrace(e2);
                    } catch (IllegalStateException e3) {
                        ThrowableExtension.printStackTrace(e3);
                    }
                }
            }
        }
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderFrameOnRenderThread(VideoFrameInternal videoFrameInternal, long j) {
        boolean z;
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        float f3;
        float f4;
        if (this.renderThreadHandler == null) {
            logI("renderFrameOnRenderThread failed, Already released");
            return;
        }
        System.currentTimeMillis();
        if (videoFrameInternal == null) {
            return;
        }
        VideoFrame videoFrame = videoFrameInternal.frame;
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface() || this.isReleasing) {
            logI("Dropping frame - No Surface");
            videoFrame.release();
            return;
        }
        synchronized (this.surfaceLock) {
            try {
                if (!this.surfaceValid) {
                    logI("Dropping frame - surface not valid");
                    videoFrame.release();
                    return;
                }
                if (ENABLE_LAST_FRAME) {
                    VideoFrame videoFrame2 = this.lastFrame;
                    if (videoFrame2 != null && videoFrame2 != videoFrame) {
                        videoFrame2.release();
                    }
                    this.lastFrame = videoFrame;
                    videoFrame.retain();
                }
                synchronized (this.fpsReductionLock) {
                    try {
                        long j2 = this.minRenderPeriodNs;
                        if (j2 != Long.MAX_VALUE) {
                            if (j2 > 0) {
                                long jNanoTime = System.nanoTime();
                                long j3 = this.nextFrameTimeNs;
                                if (jNanoTime < j3) {
                                    logI("Skipping frame rendering - fps reduction is active.");
                                    z = false;
                                } else {
                                    long j4 = j3 + this.minRenderPeriodNs;
                                    this.nextFrameTimeNs = j4;
                                    this.nextFrameTimeNs = Math.max(j4, jNanoTime);
                                }
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jNanoTime2 = System.nanoTime();
                float sampleAspectRatio = videoFrame.getSampleAspectRatio();
                float f5 = 1.0f;
                if (sampleAspectRatio == 1.0f || sampleAspectRatio <= 0.0f) {
                    sampleAspectRatio = 1.0f;
                }
                float rotatedWidth = (videoFrame.getRotatedWidth() / videoFrame.getRotatedHeight()) * sampleAspectRatio;
                if (this.rect != null) {
                    videoFrame.getRotation();
                    Rect rect = this.rect;
                    int i9 = rect.right - rect.left;
                    int i10 = rect.bottom - rect.top;
                    if (i9 <= videoFrame.getRotatedWidth() && i10 <= videoFrame.getRotatedHeight()) {
                        rotatedWidth = i9 / i10;
                    }
                }
                synchronized (this.layoutLock) {
                    try {
                        float f6 = this.viewHeight;
                        f = f6 > 0.0f ? this.viewWidth / f6 : 0.0f;
                        if (f == 0.0f) {
                            f = rotatedWidth;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                int iSurfaceWidth = this.eglBase.surfaceWidth();
                int iSurfaceHeight = this.eglBase.surfaceHeight();
                int i11 = this.renderMode;
                if (i11 == 1) {
                    if (this.rect != null) {
                        f3 = 1.0f;
                        f4 = 1.0f;
                    } else if (rotatedWidth > f) {
                        f3 = f / rotatedWidth;
                        f4 = 1.0f;
                    } else {
                        f4 = rotatedWidth / f;
                        f3 = 1.0f;
                    }
                    i4 = 0;
                    f5 = f4;
                    i5 = iSurfaceHeight;
                    i6 = iSurfaceWidth;
                    f2 = f3;
                    i2 = 0;
                } else {
                    if (i11 == 10) {
                        if (rotatedWidth > f) {
                            i8 = (int) (((1.0f - (f / rotatedWidth)) * iSurfaceHeight) / 2.0f);
                            i7 = 0;
                        } else {
                            i7 = (int) (((1.0f - (rotatedWidth / f)) * iSurfaceWidth) / 2.0f);
                            i8 = 0;
                        }
                        i3 = iSurfaceWidth - (i7 * 2);
                        i5 = iSurfaceHeight - (i8 * 2);
                        i4 = i7;
                        i2 = iSurfaceHeight - i5;
                    } else {
                        if (rotatedWidth > f) {
                            i2 = (int) (((1.0f - (f / rotatedWidth)) * iSurfaceHeight) / 2.0f);
                            i = 0;
                        } else {
                            i = (int) (((1.0f - (rotatedWidth / f)) * iSurfaceWidth) / 2.0f);
                            i2 = 0;
                        }
                        i3 = iSurfaceWidth - (i * 2);
                        i4 = i;
                        i5 = iSurfaceHeight - (i2 * 2);
                    }
                    i6 = i3;
                    f2 = f5;
                }
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                if (this.mirror) {
                    this.drawMatrix.preScale(-1.0f, 1.0f);
                }
                this.drawMatrix.preScale(f2, f5);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                if (this.rect != null && this.textureCoordUpdate) {
                    this.textureCoordUpdate = false;
                    int i12 = this.renderMode;
                    if (i12 == 2 || i12 == 10) {
                        this.drawer.setTextureCropCoord(GlUtil.createFloatBuffer(convertRectFromAndroidGraphicsRect(this.rect, videoFrame)));
                    } else {
                        this.drawer.setTextureCropCoord(GlUtil.createFloatBuffer(convertRectFromAndroidGraphicsRectForHiddenMode(f, rotatedWidth, this.rect, videoFrame)));
                    }
                }
                if (!this.islut10Update && HdrUtil.isNeedHdrSdrTrans(this.transferID)) {
                    Logging.m88100i(TAG, "doLut10Frame getTransfer: " + videoFrame.getColorSpace().getTransfer().getTransfer());
                    byte[] bArrNativeGetLut10Buffer = HdrUtil.nativeGetLut10Buffer(videoFrame.getColorSpace().getTransfer().getTransfer(), videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer);
                    if (bArrNativeGetLut10Buffer != null && bArrNativeGetLut10Buffer.length != 0) {
                        doLut10Frame(bArrNativeGetLut10Buffer);
                    }
                }
                if (z) {
                    GLES20.glClear(16384);
                    boolean z2 = videoFrame.getAlphaStitchMode() != VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value();
                    boolean z3 = this.enableAlphaMask;
                    if (z3) {
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glEnable(3042);
                        GLES20.glBlendFuncSeparate(770, 771, z2 ? 770 : 1, 771);
                    } else {
                        Color color = this.backgroudColor;
                        GLES20.glClearColor(color.red, color.green, color.blue, color.alpha);
                    }
                    this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, i4, i2, i6, i5, this.enableAlphaMask);
                    if (z3) {
                        GLES20.glDisable(3042);
                    }
                    long jNanoTime3 = System.nanoTime();
                    EglBase eglBase2 = this.eglBase;
                    if ((eglBase2 instanceof EglBase14) && this.isVsyncCallbackStared) {
                        ((EglBase14) eglBase2).setPresentationTime(j + this.frameIntervalNanos);
                    }
                    this.eglBase.swapBuffers();
                    long jNanoTime4 = System.nanoTime();
                    this.statisticsInfo.updateFramesHasDrawn(jNanoTime4, videoFrameInternal.frameDrawStartTimeNs, jNanoTime2, jNanoTime3);
                    RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
                    if (rendererEvents != null) {
                        rendererEvents.onFrameDrawn(videoFrame.getTimestampNs() / 1000000, (jNanoTime4 - videoFrameInternal.frameDrawStartTimeNs) / 1000000);
                    }
                    if (!this.isFirstFrameRendered) {
                        this.isFirstFrameRendered = true;
                        logI("Reporting first rendered frame.");
                        if (this.rendererEvents != null && videoFrame.getBuffer() != null) {
                            this.rendererEvents.onFirstFrameRendered(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                        }
                    }
                }
                notifyCallbacks(videoFrame, z);
                videoFrame.release();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void addFrameListener(final FrameListener frameListener, final float f, @Nullable final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.8
            @Override // java.lang.Runnable
            public void run() {
                RendererCommon.GlDrawer glDrawer2 = glDrawer;
                if (glDrawer2 == null) {
                    glDrawer2 = EglRenderer.this.drawer;
                }
                EglRenderer.this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer2, z));
            }
        });
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        EglRenderer.this.clearSurfaceOnRenderThread(f, f2, f3, f4);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void enableAlphaMask(boolean z) {
        logI("enableAlphaMask: " + z);
        if (this.enableAlphaMask != z) {
            this.enableAlphaMask = z;
        }
    }

    public int getFrameDrawn() {
        return this.statisticsInfo.frameDrawn;
    }

    public void init(@Nullable final EglBase.Context context, int i, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logI("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.isReleasing = false;
                this.islut10Update = false;
                this.transferID = i;
                HandlerThread handlerThread = new HandlerThread(this.name + TAG);
                handlerThread.start();
                HandlerWithFrameSyncControl handlerWithFrameSyncControl = new HandlerWithFrameSyncControl(handlerThread.getLooper(), new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (EglRenderer.this.surfaceLock) {
                            EglRenderer.this.logI("Initializing EglRenderer set surfaceValid.");
                            EglRenderer.this.surfaceValid = false;
                        }
                    }
                }, this);
                this.renderThreadHandler = handlerWithFrameSyncControl;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithFrameSyncControl, new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.3
                    @Override // java.lang.Runnable
                    public void run() {
                        int i2 = EglRenderer.this.transferID;
                        EglBase.Context context2 = context;
                        EglRenderer eglRenderer = EglRenderer.this;
                        if (context2 == null) {
                            eglRenderer.logI("EglBase10.create context, transfer: " + i2);
                            EglRenderer.this.eglBase = EglBaseFactory.createEgl10(i2, HdrUtil.isDisplayHdrVision(i2), EglRenderer.this.enableAlphaMask ? EglBase.EglConfigType.CONFIG_RGBA_TYPE : EglBase.EglConfigType.CONFIG_PLAIN_TYPE);
                        } else {
                            eglRenderer.logI("EglBase.create shared context, transfer: " + i2);
                            EglRenderer.this.eglBase = EglBaseFactory.create(context, i2, HdrUtil.isDisplayHdrVision(i2), EglRenderer.this.enableAlphaMask ? EglBase.EglConfigType.CONFIG_RGBA_TYPE : EglBase.EglConfigType.CONFIG_PLAIN_TYPE);
                        }
                        EglRenderer eglRenderer2 = EglRenderer.this;
                        StringBuilder sb = new StringBuilder("Frame Buffer Type:");
                        sb.append(HdrUtil.is10BitLumaDepth(EglRenderer.this.transferID) ? Constants.VIA_REPORT_TYPE_SHARE_TO_QQ : Constants.VIA_SHARE_TYPE_PUBLISHVIDEO);
                        sb.append(", HDR capbility:");
                        sb.append(HdrUtil.isBt2020PqExtensionSupported() && HdrUtil.isScreenSupportHdrVision());
                        sb.append(", HDR SDR transform type:");
                        sb.append(HdrUtil.nativeHdrSdrTransform());
                        eglRenderer2.logI(sb.toString());
                    }
                });
                this.switchToStartVsync = z;
                logI("renderThreadHandler useVsync:" + z);
                if (this.switchToStartVsync) {
                    this.renderThreadHandler.post(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.4
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Choreographer.getInstance().postFrameCallback((Choreographer.FrameCallback) EglRenderer.this.renderThreadHandler);
                                EglRenderer.this.logI("renderThreadHandler Choreographer start");
                            } catch (Exception e) {
                                Logging.m88099e(EglRenderer.TAG, "Exception on Choreographer start and not use vsync to render", e);
                            }
                        }
                    });
                } else {
                    logI("renderThreadHandler Choreographer disable");
                }
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.post(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.5
                    @Override // java.lang.Runnable
                    public void run() {
                        double defaultDisplayRefreshRateParams = EglRenderer.getDefaultDisplayRefreshRateParams();
                        EglRenderer eglRenderer = EglRenderer.this;
                        if (defaultDisplayRefreshRateParams != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                            eglRenderer.frameIntervalNanos = new Double(1.0E9d / defaultDisplayRefreshRateParams).longValue();
                        } else {
                            eglRenderer.frameIntervalNanos = EglRenderer.DEFAULT_FRAME_INTERVAL_NANOS;
                        }
                    }
                });
                this.statisticsInfo.resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, 4000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void isRenderOnSurfaceView(boolean z) {
        this.isRenderOnSurfaceView = z;
    }

    public void notifySurfaceSizeChanged() {
        if (ENABLE_LAST_FRAME) {
            synchronized (this.handlerLock) {
                try {
                    if (this.renderThreadHandler == null) {
                        logI("notifySurfaceSizeChanged ");
                        return;
                    }
                    if (this.lastFrame != null) {
                        ((HandlerWithFrameSyncControl) this.renderThreadHandler).sendLastFrameToRenderThread(System.nanoTime());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // io.agora.base.internal.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.statisticsInfo.updateFrameReceived();
        long jNanoTime = System.nanoTime();
        synchronized (this.surfaceLock) {
            try {
                if (this.surfaceValid) {
                    synchronized (this.handlerLock) {
                        try {
                            Handler handler = this.renderThreadHandler;
                            if (handler == null) {
                                logI("Dropping frame - Not initialized or already released.");
                            } else {
                                ((HandlerWithFrameSyncControl) handler).sendFrameToRenderThread(jNanoTime, videoFrame);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    public void printStackTrace() {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                Thread thread = handler == null ? null : handler.getLooper().getThread();
                if (thread != null) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace.length > 0) {
                        logI("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logI(stackTraceElement.toString());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        VideoFrame videoFrame;
        logI("Releasing.");
        this.isReleasing = true;
        this.islut10Update = true;
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logI("Already released");
                    return;
                }
                handler.removeCallbacks(this.logStatisticsRunnable);
                try {
                    ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.EglRenderer.6
                        @Override // java.util.concurrent.Callable
                        public Void call() throws Exception {
                            EglRenderer.this.logI("release egl and gl resources on render thread");
                            if (!EglRenderer.this.eglContextAttached && EglRenderer.this.eglBase != null && !EglRenderer.this.eglBase.hasSurface()) {
                                EglRenderer.this.logI("egl context not attached, make current to release gl resource");
                                try {
                                    EglRenderer.this.eglBase.createDummyPbufferSurface();
                                    EglRenderer.this.eglBase.makeCurrent();
                                    EglRenderer.this.eglContextAttached = true;
                                } catch (RuntimeException e) {
                                    EglRenderer.this.logI("failed to make current: " + e);
                                }
                            }
                            synchronized (EglBase.lock) {
                                GLES20.glUseProgram(0);
                            }
                            if (EglRenderer.this.drawer != null) {
                                EglRenderer.this.drawer.release();
                                EglRenderer.this.drawer = null;
                            }
                            EglRenderer.this.frameDrawer.release();
                            EglRenderer.this.bitmapTextureFramebuffer.release();
                            if (EglRenderer.this.eglBase != null) {
                                EglRenderer.this.logI("eglBase detach and release.");
                                EglRenderer.this.eglBase.detachCurrent();
                                EglRenderer.this.eglContextAttached = false;
                                EglRenderer.this.eglBase.release();
                                EglRenderer.this.eglBase = null;
                            }
                            EglRenderer.this.frameListeners.clear();
                            return null;
                        }
                    });
                } catch (Exception e) {
                    logI("failed to make current and detach: " + e);
                }
                ((HandlerWithFrameSyncControl) this.renderThreadHandler).sendStopChoreographer();
                this.renderThreadHandler.getLooper().quitSafely();
                this.renderThreadHandler = null;
                this.isVsyncCallbackStared = false;
                if (ENABLE_LAST_FRAME && (videoFrame = this.lastFrame) != null) {
                    videoFrame.release();
                    this.lastFrame = null;
                }
                logI("Releasing done.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releaseEglSurface() {
        logI("releaseEglSurface");
        synchronized (this.surfaceLock) {
            this.surfaceValid = false;
        }
        logI("release surface");
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    logI("releaseEglSurface call");
                    ThreadUtils.invokeAtFrontUninterruptibly(this.renderThreadHandler, 1000L, new Callable<Void>() { // from class: io.agora.base.internal.video.EglRenderer.10
                        @Override // java.util.concurrent.Callable
                        public Void call() throws Exception {
                            EglRenderer.this.logI("detach egl context and release egl surface");
                            if (EglRenderer.this.eglContextAttached && EglRenderer.this.eglBase != null) {
                                EglRenderer.this.eglBase.detachCurrent();
                                EglRenderer.this.eglContextAttached = false;
                                EglRenderer.this.eglBase.releaseSurface();
                            }
                            EglRenderer.this.logI("releaseEglSurface in renderThread done.");
                            return null;
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    return;
                }
                if (Thread.currentThread() == this.renderThreadHandler.getLooper().getThread()) {
                    throw new RuntimeException("removeFrameListener must not be called on the render thread.");
                }
                postToRenderThread(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.9
                    @Override // java.lang.Runnable
                    public void run() {
                        countDownLatch.countDown();
                        Iterator it = EglRenderer.this.frameListeners.iterator();
                        while (it.hasNext()) {
                            if (((FrameListenerAndParams) it.next()).listener == frameListener) {
                                it.remove();
                            }
                        }
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resetFirstFrameFlag() {
        this.isFirstFrameRendered = false;
    }

    public void setBackgroundColor(int i) {
        logI("setBackgroundColor" + Integer.toHexString(i));
        this.backgroudColor = new Color(i);
    }

    public void setFpsReduction(float f) {
        logI("setFpsReduction: " + f);
        synchronized (this.fpsReductionLock) {
            try {
                long j = this.minRenderPeriodNs;
                if (f <= 0.0f) {
                    this.minRenderPeriodNs = Long.MAX_VALUE;
                } else {
                    this.minRenderPeriodNs = (long) (1.0E9f / f);
                }
                if (this.minRenderPeriodNs != j) {
                    this.nextFrameTimeNs = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setMirror(boolean z) {
        logI("setMirror: " + z);
        synchronized (this.layoutLock) {
            try {
                if (this.mirror != z) {
                    this.mirror = z;
                    this.textureCoordUpdate = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setRenderMode(int i) {
        logI("setRenderMode: " + i);
        synchronized (this.layoutLock) {
            this.renderMode = i;
        }
    }

    public void setViewSize(float f, float f2) {
        logI("setViewSize width: " + f + " height: " + f2);
        synchronized (this.layoutLock) {
            this.viewWidth = f;
            this.viewHeight = f2;
        }
    }

    public void updateCropArea(Rect rect) {
        logI("updateCropArea: " + rect.toString());
        synchronized (this.layoutLock) {
            try {
                Rect rect2 = this.rect;
                if (rect2 == null) {
                    this.rect = rect;
                    this.textureCoordUpdate = true;
                } else if (rect2 != null && !rect2.equals(rect)) {
                    this.rect = rect;
                    this.textureCoordUpdate = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateVsyncDuration(final long j) {
        Handler handler = this.renderThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.agora.base.internal.video.EglRenderer.7
                @Override // java.lang.Runnable
                public void run() {
                    EglRenderer.this.logI("update vsync duration, old:" + EglRenderer.this.frameIntervalNanos + " new:" + j);
                    EglRenderer.this.frameIntervalNanos = j;
                }
            });
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void clearImage() {
        Color color = this.backgroudColor;
        clearImage(color.red, color.green, color.blue, color.alpha);
    }
}
