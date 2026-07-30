package com.p006ss.bytertc.base.media;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlClearWorkaround;
import com.bytedance.realx.video.GlTextureFrameBuffer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.p006ss.bytertc.base.media.EglRenderer;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class EglRenderer implements VideoSink {
    private static final long LOG_INTERVAL_SEC = 4;
    private static final String TAG = "EglRenderer";
    private static GlClearWorkaround.WORKAROUND_STATUS enableGLWorkaround = GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown;
    protected static int mDestroyTimeoutMs = -1;

    @Nullable
    private RendererCommon.GlDrawer drawer;

    @Nullable
    private EglBase eglBase;
    private int framesDropped;
    private int framesReceived;
    private int framesRendered;
    private float layoutAspectRatio;
    private long minRenderPeriodNs;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    protected final String name;
    private long nextFrameTimeNs;

    @Nullable
    private VideoFrame pendingFrame;
    private long renderSwapBufferTimeNs;

    @Nullable
    private Handler renderThreadHandler;
    private long renderTimeNs;
    private long statisticsStartTimeNs;
    private boolean usePresentationTimeStamp;
    private final GlClearWorkaround glClearWorkaround = new GlClearWorkaround();
    private final Object handlerLock = new Object();
    private final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    private final ArrayList<FirstVideoFrameRenderListener> firstVideoFrameListeners = new ArrayList<>();
    private final Object fpsReductionLock = new Object();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Matrix drawMatrix = new Matrix();
    private final Object frameLock = new Object();
    private final Object firstRenderLock = new Object();
    private final Object layoutLock = new Object();
    private final Object statisticsLock = new Object();
    private final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    private volatile RendererCommon.ScalingType renderModel = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
    private final Runnable logStatisticsRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.EglRenderer.1
        @Override // java.lang.Runnable
        public void run() {
            EglRenderer.this.logStatistics();
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
    private boolean haveRenderFirstVideoFrame = false;

    /* JADX INFO: renamed from: com.ss.bytertc.base.media.EglRenderer$3 */
    public static /* synthetic */ class C22723 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType = iArr;
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
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

    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender();
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

    public static class HandlerWithExceptionCallback extends Handler {
        private final Runnable exceptionCallback;

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) throws Exception {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                RXLogging.e(EglRenderer.TAG, "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8342a(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = eglRenderer.drawer;
        }
        eglRenderer.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        return ((j / ((long) i)) / 1000) + " us";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8343b(EglRenderer eglRenderer, CountDownLatch countDownLatch, FrameListener frameListener) {
        eglRenderer.getClass();
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = eglRenderer.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSurfaceOnRenderThread(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase == null || !eglBase.hasSurface()) {
            return;
        }
        logD("clearSurface");
        glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, f, f2, f3, f4);
        this.eglBase.swapBuffers();
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m8345d(EglRenderer eglRenderer, Runnable runnable) {
        EglBase eglBase = eglRenderer.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            eglRenderer.eglBase.releaseSurface();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8346e(EglRenderer eglRenderer, EglBase.Context context, int[] iArr) {
        if (context == null) {
            eglRenderer.logD("EglBase10.create context");
            eglRenderer.eglBase = EglBase.createEgl10(iArr);
        } else {
            eglRenderer.logD("EglBase.create shared context");
            eglRenderer.eglBase = EglBase.create(context, iArr);
        }
        eglRenderer.glClearWorkaround.init();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m8347f(EglRenderer eglRenderer, CountDownLatch countDownLatch) {
        eglRenderer.glClearWorkaround.release();
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = eglRenderer.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            eglRenderer.drawer = null;
        }
        eglRenderer.frameDrawer.release();
        eglRenderer.bitmapTextureFramebuffer.release();
        if (eglRenderer.eglBase != null) {
            eglRenderer.logD("eglBase detach and release.");
            eglRenderer.eglBase.detachCurrent();
            eglRenderer.eglBase.release();
            eglRenderer.eglBase = null;
        }
        eglRenderer.frameListeners.clear();
        synchronized (eglRenderer.firstRenderLock) {
            eglRenderer.firstVideoFrameListeners.clear();
        }
        countDownLatch.countDown();
    }

    private void glClear(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown) {
            enableGLWorkaround = GlClearWorkaround.isNeedWorkaround();
        }
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusEnable) {
            this.glClearWorkaround.clear(i, i2, i3, f, f2, f3, f4, 1.0f, 8);
        } else {
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m8349h(EglRenderer eglRenderer, Looper looper) {
        eglRenderer.logD("Quitting render thread.");
        looper.quit();
    }

    private void logD(String str) {
        RXLogging.i(TAG, this.name + str);
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
                logD("Duration: " + (j / 1000000) + " ms. Frames received: " + this.framesReceived + ". Dropped: " + this.framesDropped + ". Rendered: " + this.framesRendered + ". Render fps: " + decimalFormat.format((((long) this.framesRendered) * 1000000000) / j) + ". Average render time: " + averageTimeAsString(this.renderTimeNs, this.framesRendered) + ". Average swapBuffer time: " + averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered) + ".");
                resetStatistics(jNanoTime);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void logW(String str) {
        RXLogging.w(TAG, this.name + str);
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        this.drawMatrix.preScale(this.mirrorHorizontally ? -1.0f : 1.0f, this.mirrorVertically ? -1.0f : 1.0f);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    glClear(rotatedWidth, rotatedHeight, 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, byteBufferAllocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
                    next.listener.onFrame(bitmapCreateBitmap);
                }
            }
        }
    }

    private void notifyFristRenderCallback() {
        synchronized (this.firstRenderLock) {
            try {
                Iterator<FirstVideoFrameRenderListener> it = this.firstVideoFrameListeners.iterator();
                while (it.hasNext()) {
                    it.next().onFirstVideoFrameRender();
                }
            } catch (Throwable th) {
                throw th;
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
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:80:0x016d  */
    /* JADX WARN: Code duplicated, block: B:92:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void renderFrameOnRenderThread() {
        boolean z;
        float f;
        int iSurfaceWidth;
        int iSurfaceHeight;
        float f2;
        float f3;
        int i;
        int i2;
        float f4;
        float f5;
        VideoFrame videoFrame;
        long jNanoTime;
        boolean z2;
        EglBase eglBase;
        long jNanoTime2;
        synchronized (this.frameLock) {
            try {
                VideoFrame videoFrame2 = this.pendingFrame;
                if (videoFrame2 == null) {
                    return;
                }
                this.pendingFrame = null;
                EglBase eglBase2 = this.eglBase;
                if (eglBase2 == null || !eglBase2.hasSurface()) {
                    logD("Dropping frame - No surface");
                    videoFrame2.release();
                    return;
                }
                synchronized (this.fpsReductionLock) {
                    try {
                        long j = this.minRenderPeriodNs;
                        if (j != Long.MAX_VALUE) {
                            if (j > 0) {
                                long jNanoTime3 = System.nanoTime();
                                long j2 = this.nextFrameTimeNs;
                                if (jNanoTime3 < j2) {
                                    logD("Skipping frame rendering - fps reduction is active.");
                                    z = false;
                                } else {
                                    long j3 = j2 + this.minRenderPeriodNs;
                                    this.nextFrameTimeNs = j3;
                                    this.nextFrameTimeNs = Math.max(j3, jNanoTime3);
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
                long jNanoTime4 = System.nanoTime();
                if (videoFrame2.getRotatedHeight() <= 0) {
                    return;
                }
                float rotatedWidth = videoFrame2.getRotatedWidth() / videoFrame2.getRotatedHeight();
                synchronized (this.layoutLock) {
                    f = this.layoutAspectRatio;
                    if (f == 0.0f) {
                        f = rotatedWidth;
                    }
                }
                int iSurfaceWidth2 = this.eglBase.surfaceWidth();
                int iSurfaceHeight2 = this.eglBase.surfaceHeight();
                int i3 = C22723.$SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[this.renderModel.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        iSurfaceWidth = 0;
                        iSurfaceHeight = 0;
                    } else if (rotatedWidth > f) {
                        f3 = f / rotatedWidth;
                        iSurfaceWidth = 0;
                        iSurfaceHeight = 0;
                        videoFrame2 = videoFrame2;
                        f2 = 1.0f;
                        i = iSurfaceWidth2;
                        i2 = iSurfaceHeight2;
                        f4 = 1.0f;
                    } else {
                        f2 = rotatedWidth / f;
                        iSurfaceWidth = 0;
                        iSurfaceHeight = 0;
                        f3 = 1.0f;
                        i = iSurfaceWidth2;
                        i2 = iSurfaceHeight2;
                        f4 = f3;
                    }
                    this.drawMatrix.reset();
                    this.drawMatrix.preTranslate(0.5f, 0.5f);
                    Matrix matrix = this.drawMatrix;
                    if (this.mirrorHorizontally) {
                        f5 = -1.0f;
                    } else {
                        f5 = f4;
                    }
                    if (this.mirrorVertically) {
                        f4 = -1.0f;
                    }
                    matrix.preScale(f5, f4);
                    this.drawMatrix.preScale(f3, f2);
                    this.drawMatrix.preTranslate(-0.5f, -0.5f);
                    if (z) {
                        glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                        videoFrame = videoFrame2;
                        this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, iSurfaceWidth, iSurfaceHeight, i, i2);
                        jNanoTime = System.nanoTime();
                        z2 = this.usePresentationTimeStamp;
                        eglBase = this.eglBase;
                        if (z2) {
                            eglBase.swapBuffers(videoFrame.getTimestampNs());
                        } else {
                            eglBase.swapBuffers();
                        }
                        jNanoTime2 = System.nanoTime();
                        synchronized (this.statisticsLock) {
                            this.framesRendered++;
                            this.renderTimeNs += jNanoTime2 - jNanoTime4;
                            this.renderSwapBufferTimeNs += jNanoTime2 - jNanoTime;
                        }
                    } else {
                        videoFrame = videoFrame2;
                    }
                    notifyCallbacks(videoFrame, z);
                    if (!this.haveRenderFirstVideoFrame) {
                        notifyFristRenderCallback();
                        this.haveRenderFirstVideoFrame = true;
                    }
                    videoFrame.release();
                }
                EglBase eglBase3 = this.eglBase;
                if (rotatedWidth > f) {
                    iSurfaceHeight2 = (int) (eglBase3.surfaceWidth() / rotatedWidth);
                    iSurfaceHeight = (this.eglBase.surfaceHeight() - iSurfaceHeight2) / 2;
                    iSurfaceWidth = 0;
                } else {
                    iSurfaceWidth2 = (int) (eglBase3.surfaceHeight() * rotatedWidth);
                    iSurfaceWidth = (this.eglBase.surfaceWidth() - iSurfaceWidth2) / 2;
                    iSurfaceHeight = 0;
                }
                f2 = 1.0f;
                f3 = 1.0f;
                i = iSurfaceWidth2;
                i2 = iSurfaceHeight2;
                f4 = f3;
                this.drawMatrix.reset();
                this.drawMatrix.preTranslate(0.5f, 0.5f);
                Matrix matrix2 = this.drawMatrix;
                if (this.mirrorHorizontally) {
                    f5 = -1.0f;
                } else {
                    f5 = f4;
                }
                if (this.mirrorVertically) {
                    f4 = -1.0f;
                }
                matrix2.preScale(f5, f4);
                this.drawMatrix.preScale(f3, f2);
                this.drawMatrix.preTranslate(-0.5f, -0.5f);
                if (z) {
                    glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                    videoFrame = videoFrame2;
                    this.frameDrawer.drawFrame(videoFrame, this.drawer, this.drawMatrix, iSurfaceWidth, iSurfaceHeight, i, i2);
                    jNanoTime = System.nanoTime();
                    z2 = this.usePresentationTimeStamp;
                    eglBase = this.eglBase;
                    if (z2) {
                        eglBase.swapBuffers(videoFrame.getTimestampNs());
                    } else {
                        eglBase.swapBuffers();
                    }
                    jNanoTime2 = System.nanoTime();
                    synchronized (this.statisticsLock) {
                        this.framesRendered++;
                        this.renderTimeNs += jNanoTime2 - jNanoTime4;
                        this.renderSwapBufferTimeNs += jNanoTime2 - jNanoTime;
                    }
                } else {
                    videoFrame = videoFrame2;
                }
                notifyCallbacks(videoFrame, z);
                if (!this.haveRenderFirstVideoFrame) {
                    notifyFristRenderCallback();
                    this.haveRenderFirstVideoFrame = true;
                }
                videoFrame.release();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    public void addFrameListener(final FrameListener frameListener, final float f, @Nullable final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: l.zre
            @Override // java.lang.Runnable
            public final void run() {
                EglRenderer.m8342a(this.f15843a, glDrawer, frameListener, f, z);
            }
        });
    }

    public void addFristFrameListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.firstRenderLock) {
            this.firstVideoFrameListeners.add(firstVideoFrameRenderListener);
        }
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    return;
                }
                handler.postAtFrontOfQueue(new Runnable() { // from class: l.kre
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9775a.clearSurfaceOnRenderThread(f, f2, f3, f4);
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

    public void init(@Nullable final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler != null) {
                    throw new IllegalStateException(this.name + "Already initialized");
                }
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                HandlerThread handlerThread = new HandlerThread(this.name + TAG);
                handlerThread.start();
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() { // from class: com.ss.bytertc.base.media.EglRenderer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (EglRenderer.this.handlerLock) {
                            EglRenderer.this.renderThreadHandler = null;
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Runnable() { // from class: l.wre
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.m8346e(this.f14665a, context, iArr);
                    }
                });
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, 4000L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p006ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            try {
                if (this.renderThreadHandler == null) {
                    logD("Dropping frame - Not initialized or already released.");
                    return;
                }
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame2 = this.pendingFrame;
                        z = videoFrame2 != null;
                        if (z) {
                            videoFrame2.release();
                        }
                        this.pendingFrame = videoFrame;
                        videoFrame.retain();
                        this.renderThreadHandler.post(new Runnable() { // from class: l.nre
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f10854a.renderFrameOnRenderThread();
                            }
                        });
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    synchronized (this.statisticsLock) {
                        this.framesDropped++;
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
                        logW("EglRenderer stack trace:");
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            logW(stackTraceElement.toString());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    logD("Already released");
                    return;
                }
                handler.removeCallbacks(this.logStatisticsRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: l.qre
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.m8347f(this.f12353a, countDownLatch);
                    }
                });
                final Looper looper = this.renderThreadHandler.getLooper();
                this.renderThreadHandler.post(new Runnable() { // from class: l.tre
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.m8349h(this.f13388a, looper);
                    }
                });
                this.renderThreadHandler = null;
                int i = mDestroyTimeoutMs;
                if (i <= 0) {
                    ThreadUtils.awaitUninterruptibly(countDownLatch);
                } else {
                    ThreadUtils.awaitUninterruptibly(countDownLatch, i);
                }
                synchronized (this.frameLock) {
                    try {
                        VideoFrame videoFrame = this.pendingFrame;
                        if (videoFrame != null) {
                            videoFrame.release();
                            this.pendingFrame = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                logD("Releasing done.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            try {
                Handler handler = this.renderThreadHandler;
                if (handler == null) {
                    runnable.run();
                } else {
                    handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                    this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: l.hre
                        @Override // java.lang.Runnable
                        public final void run() {
                            EglRenderer.m8345d(this.f8796a, runnable);
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
                postToRenderThread(new Runnable() { // from class: l.ere
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.m8343b(this.f7463a, countDownLatch, frameListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setFpsReduction(float f) {
        logD("setFpsReduction: " + f);
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

    public void setLayoutAspectRatio(float f) {
        logD("setLayoutAspectRatio: " + f);
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        logD("setMirrorHorizontally: " + z);
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        logD("setMirrorVertically: " + z);
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void setRenderModel(RendererCommon.ScalingType scalingType) {
        this.renderModel = scalingType;
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
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void init(@Nullable EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }
}
