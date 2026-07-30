package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p149l.ig3;
import p149l.k250;
import p149l.qkq0;
import p149l.upk0;

/* JADX INFO: loaded from: classes2.dex */
public class TimerSurfaceTextureHelper implements ISurfaceTextureHelper {
    private static final int ANDROID_API_TEXTURE_IN_USE = 10;
    private static final int DEFAULT_MAX_BUFFER_COUNT = 4;
    private static final String TAG = "TSurfaceTextureHelper";
    private final VideoDecimator auxiliaryDecimator;
    private EglBase eglBase;
    private int frameRate;
    private int frameRotation;
    private final Handler handler;
    private boolean hasFrameRate;
    private boolean hasPendingTexture;
    private volatile boolean isOesTextureInUse;
    private boolean isQuitting;

    @Nullable
    private VideoSink listener;
    private int notifyIntervalInMS;
    private final int oesTextureId;

    @Nullable
    private VideoSink pendingListener;
    private volatile long prevTimeMillis;
    private final Handler proxyHandler;
    final Runnable scheduledExecutorRunnable;

    @Nullable
    private ScheduledExecutorService scheduledService;
    final Runnable setListenerRunnable;

    @NonNull
    private final EglBase.Context sharedContext;
    private final boolean smoothCapture;
    final Runnable supplementRunnable;
    private final SurfaceTexture surfaceTexture;
    final Runnable systemGenerateRunnable;
    private final TextureBufferPool textureBufferPool;
    private int textureHeight;
    private int textureWidth;
    final Runnable timerNotifyRunnable;
    final Runnable timerRunnable;
    private final VideoDecimator videoDecimator;
    private final YuvConverter yuvConverter;

    public interface IVideoCapture extends VideoSink {
        void onFrameDropped(int i);
    }

    private TimerSurfaceTextureHelper(String str, boolean z, EglBase.Context context, Handler handler, int i) {
        this.notifyIntervalInMS = 67;
        this.prevTimeMillis = 0L;
        YuvConverter yuvConverter = new YuvConverter();
        this.yuvConverter = yuvConverter;
        this.hasPendingTexture = false;
        this.isOesTextureInUse = false;
        this.isQuitting = false;
        this.setListenerRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                Logging.m87211i(TimerSurfaceTextureHelper.TAG, "Setting listener to " + TimerSurfaceTextureHelper.this.pendingListener);
                TimerSurfaceTextureHelper timerSurfaceTextureHelper = TimerSurfaceTextureHelper.this;
                timerSurfaceTextureHelper.listener = timerSurfaceTextureHelper.pendingListener;
                TimerSurfaceTextureHelper.this.pendingListener = null;
                if (TimerSurfaceTextureHelper.this.hasPendingTexture) {
                    TimerSurfaceTextureHelper.this.updateTexImage();
                    TimerSurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.timerNotifyRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.tryDeliverTextureFrame();
            }
        };
        this.systemGenerateRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.4
            @Override // java.lang.Runnable
            public void run() {
                if (TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.listener == null) {
                    return;
                }
                TimerSurfaceTextureHelper.this.videoDecimator.updateIncomingFramerate();
                if (TimerSurfaceTextureHelper.this.videoDecimator.dropFrame()) {
                    Logging.m87211i(TimerSurfaceTextureHelper.TAG, "systemGenerate dropFrame.");
                } else {
                    TimerSurfaceTextureHelper.this.handler.post(TimerSurfaceTextureHelper.this.timerNotifyRunnable);
                    TimerSurfaceTextureHelper.this.prevTimeMillis = System.currentTimeMillis();
                }
                TimerSurfaceTextureHelper.this.proxyHandler.removeCallbacks(TimerSurfaceTextureHelper.this.supplementRunnable);
                float fInputFramerate = TimerSurfaceTextureHelper.this.videoDecimator.inputFramerate() - TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate();
                if ((fInputFramerate >= 0.0f || Math.abs(fInputFramerate) <= 3.0f || Math.abs(fInputFramerate) <= ((double) TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate()) * 0.1d) && System.currentTimeMillis() - TimerSurfaceTextureHelper.this.prevTimeMillis <= TimerSurfaceTextureHelper.this.notifyIntervalInMS * 2) {
                    return;
                }
                Handler handler2 = TimerSurfaceTextureHelper.this.proxyHandler;
                TimerSurfaceTextureHelper timerSurfaceTextureHelper = TimerSurfaceTextureHelper.this;
                handler2.postDelayed(timerSurfaceTextureHelper.supplementRunnable, timerSurfaceTextureHelper.notifyIntervalInMS);
            }
        };
        this.supplementRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.5
            @Override // java.lang.Runnable
            public void run() {
                if (TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.listener == null) {
                    return;
                }
                TimerSurfaceTextureHelper.this.videoDecimator.updateIncomingFramerate();
                if (TimerSurfaceTextureHelper.this.videoDecimator.dropFrame()) {
                    Logging.m87211i(TimerSurfaceTextureHelper.TAG, "supplement dropFrame.");
                } else {
                    TimerSurfaceTextureHelper.this.prevTimeMillis = System.currentTimeMillis();
                    TimerSurfaceTextureHelper.this.handler.post(TimerSurfaceTextureHelper.this.timerNotifyRunnable);
                }
                TimerSurfaceTextureHelper.this.proxyHandler.removeCallbacks(TimerSurfaceTextureHelper.this.supplementRunnable);
                float fInputFramerate = TimerSurfaceTextureHelper.this.videoDecimator.inputFramerate() - TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate();
                if ((fInputFramerate >= 0.0f || Math.abs(fInputFramerate) <= 3.0f || Math.abs(fInputFramerate) <= ((double) TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate()) * 0.1d) && System.currentTimeMillis() - TimerSurfaceTextureHelper.this.prevTimeMillis <= TimerSurfaceTextureHelper.this.notifyIntervalInMS * 2) {
                    return;
                }
                Handler handler2 = TimerSurfaceTextureHelper.this.proxyHandler;
                TimerSurfaceTextureHelper timerSurfaceTextureHelper = TimerSurfaceTextureHelper.this;
                handler2.postDelayed(timerSurfaceTextureHelper.supplementRunnable, timerSurfaceTextureHelper.notifyIntervalInMS);
            }
        };
        this.timerRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.6
            @Override // java.lang.Runnable
            public void run() {
                float fInputFramerate = TimerSurfaceTextureHelper.this.videoDecimator.inputFramerate() - TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate();
                if ((fInputFramerate < 0.0f && Math.abs(fInputFramerate) > 3.0f && Math.abs(fInputFramerate) > ((double) TimerSurfaceTextureHelper.this.auxiliaryDecimator.getTargetFrameRate()) * 0.1d) || System.currentTimeMillis() - TimerSurfaceTextureHelper.this.prevTimeMillis > TimerSurfaceTextureHelper.this.notifyIntervalInMS * 2) {
                    Handler handler2 = TimerSurfaceTextureHelper.this.proxyHandler;
                    TimerSurfaceTextureHelper timerSurfaceTextureHelper = TimerSurfaceTextureHelper.this;
                    handler2.postDelayed(timerSurfaceTextureHelper.supplementRunnable, timerSurfaceTextureHelper.notifyIntervalInMS);
                }
                Handler handler3 = TimerSurfaceTextureHelper.this.proxyHandler;
                TimerSurfaceTextureHelper timerSurfaceTextureHelper2 = TimerSurfaceTextureHelper.this;
                handler3.postDelayed(timerSurfaceTextureHelper2.timerRunnable, timerSurfaceTextureHelper2.notifyIntervalInMS);
            }
        };
        this.scheduledExecutorRunnable = new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.7
            @Override // java.lang.Runnable
            public void run() {
                if (TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.listener == null) {
                    return;
                }
                TimerSurfaceTextureHelper.this.videoDecimator.updateIncomingFramerate();
                if (TimerSurfaceTextureHelper.this.videoDecimator.dropFrame()) {
                    Logging.m87211i(TimerSurfaceTextureHelper.TAG, "smoothDecimator dropFrame.");
                } else {
                    TimerSurfaceTextureHelper.this.handler.post(TimerSurfaceTextureHelper.this.timerNotifyRunnable);
                }
            }
        };
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("SurfaceTextureHelper must be created on the handler thread");
            throw null;
        }
        this.handler = handler;
        this.smoothCapture = z;
        HandlerThread handlerThread = new HandlerThread("delayThread");
        handlerThread.start();
        this.proxyHandler = new Handler(handlerThread.getLooper());
        try {
            EglBase eglBaseCreate = EglBaseFactory.create(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = eglBaseCreate;
            eglBaseCreate.createDummyPbufferSurface();
            this.eglBase.makeCurrent();
            this.videoDecimator = new VideoDecimator();
            this.auxiliaryDecimator = new VideoDecimator();
            this.sharedContext = context != null ? context : this.eglBase.getEglBaseContext();
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
            this.surfaceTexture = surfaceTexture;
            TextureBufferPool textureBufferPoolCreateWithinGlThread = TextureBufferPool.createWithinGlThread(str, i, 6407, handler, this.eglBase, context, yuvConverter);
            this.textureBufferPool = textureBufferPoolCreateWithinGlThread;
            textureBufferPoolCreateWithinGlThread.setPoolBufferReleaseCallback(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.8
                @Override // java.lang.Runnable
                public void run() {
                    TimerSurfaceTextureHelper.this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.isOesTextureInUse || TimerSurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                                return;
                            }
                            TimerSurfaceTextureHelper.this.release();
                        }
                    });
                }
            });
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.9
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    TimerSurfaceTextureHelper.this.hasPendingTexture = true;
                    if (!TimerSurfaceTextureHelper.this.hasFrameRate || TimerSurfaceTextureHelper.this.isSmoothCapture()) {
                        return;
                    }
                    TimerSurfaceTextureHelper.this.proxyHandler.post(TimerSurfaceTextureHelper.this.systemGenerateRunnable);
                }
            }, handler);
        } catch (RuntimeException e) {
            try {
                this.eglBase.release();
            } catch (Exception e2) {
                ThrowableExtension.printStackTrace(e2);
            }
            handler.getLooper().quit();
            this.proxyHandler.getLooper().quit();
            throw e;
        }
    }

    public static TimerSurfaceTextureHelper create(final String str, final boolean z, final EglBase.Context context, final int i) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (TimerSurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<TimerSurfaceTextureHelper>() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @Nullable
            public TimerSurfaceTextureHelper call() {
                try {
                    return new TimerSurfaceTextureHelper(str, z, context, handler, i);
                } catch (RuntimeException e) {
                    Logging.m87210e(TimerSurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSmoothCapture() {
        return this.smoothCapture || this.frameRate <= 15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("Wrong thread.");
            return;
        }
        if (this.isOesTextureInUse || this.textureBufferPool.anyTextureInUse() || !this.isQuitting) {
            qkq0.m175383a("Unexpected release.");
            return;
        }
        this.yuvConverter.release();
        this.textureBufferPool.dispose();
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        this.eglBase.release();
        this.proxyHandler.getLooper().quit();
        this.handler.getLooper().quit();
        this.hasFrameRate = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.14
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.isOesTextureInUse = false;
                if (!TimerSurfaceTextureHelper.this.isQuitting || TimerSurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                    return;
                }
                TimerSurfaceTextureHelper.this.release();
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tryDeliverTextureFrame() {
        int i;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("Wrong thread.");
            return false;
        }
        if (this.isQuitting || this.listener == null) {
            return false;
        }
        if (this.isOesTextureInUse) {
            VideoSink videoSink = this.listener;
            if (videoSink instanceof IVideoCapture) {
                ((IVideoCapture) videoSink).onFrameDropped(10);
            }
            Logging.m87211i(TAG, "frame Dropped texture in use. ");
            return true;
        }
        this.isOesTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long jNanoTime = System.nanoTime();
        int i2 = this.textureWidth;
        if (i2 == 0 || (i = this.textureHeight) == 0) {
            upk0.m194883a("Texture size has not been set.");
            return false;
        }
        VideoFrame videoFrame = new VideoFrame(new TextureBuffer(this.sharedContext, i2, i, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.16
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.returnTextureFrame();
            }
        }, false), this.frameRotation, jNanoTime);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        try {
            synchronized (EglBase.lock) {
                this.surfaceTexture.updateTexImage();
            }
        } catch (Exception e) {
            Logging.m87209e(TAG, "failed to updateTexImage. " + e.getMessage());
        }
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void dispose() {
        Logging.m87211i(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.15
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.isQuitting = true;
                if (!TimerSurfaceTextureHelper.this.isOesTextureInUse && !TimerSurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                    TimerSurfaceTextureHelper.this.release();
                    return;
                }
                Logging.m87211i(TimerSurfaceTextureHelper.TAG, " not release yet, this: " + this + " isOesTextureInUse: " + TimerSurfaceTextureHelper.this.isOesTextureInUse);
            }
        });
    }

    public void executeSmoothCapture(int i) {
        stopScheduledService();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(4);
        this.scheduledService = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(this.scheduledExecutorRunnable, 0L, i, TimeUnit.MILLISECONDS);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public Handler getHandler() {
        return this.handler;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public boolean isOesTextureInUse() {
        return this.isOesTextureInUse;
    }

    public void setFrameRate(int i) {
        if (i <= 0) {
            ig3.m135964a("invalid frame rate");
            return;
        }
        this.frameRate = i;
        this.hasFrameRate = true;
        Logging.m87211i(TAG, "setFrameRate frameRate:" + i + " smoothCapture: " + this.smoothCapture);
        if (isSmoothCapture()) {
            this.notifyIntervalInMS = (int) (1000.0f / ((float) Math.min(i + 3, ((double) i) * 1.067d)));
            VideoDecimator videoDecimator = this.videoDecimator;
            if (videoDecimator != null) {
                videoDecimator.setTargetFramerate(i);
            }
            VideoDecimator videoDecimator2 = this.auxiliaryDecimator;
            if (videoDecimator2 != null) {
                videoDecimator2.setTargetFramerate(i);
            }
            Logging.m87211i(TAG, "scheduledRunnable notifyIntervalInMS:" + this.notifyIntervalInMS);
            executeSmoothCapture(this.notifyIntervalInMS);
            return;
        }
        int i2 = i + 3;
        int i3 = i2 < 5 ? i2 : 5;
        if (i2 >= 15) {
            i3 = 15;
        }
        if (i2 >= 30) {
            i3 = 30;
        }
        float f = i3;
        this.notifyIntervalInMS = (int) (1000.0f / f);
        VideoDecimator videoDecimator3 = this.videoDecimator;
        if (videoDecimator3 != null) {
            videoDecimator3.setTargetFramerate(i2);
        }
        VideoDecimator videoDecimator4 = this.auxiliaryDecimator;
        if (videoDecimator4 != null) {
            videoDecimator4.setTargetFramerate(f);
        }
        this.proxyHandler.postDelayed(this.timerRunnable, this.notifyIntervalInMS);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.13
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.frameRotation = i;
            }
        });
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setTextureSize(final int i, final int i2) {
        if (i <= 0) {
            k250.m144273a("Texture width must be positive, but was ", i);
            return;
        }
        if (i2 <= 0) {
            k250.m144273a("Texture height must be positive, but was ", i2);
            return;
        }
        Logging.m87211i(TAG, "setTextureSize textureWidth: " + i + " textureHeight: " + i2);
        this.surfaceTexture.setDefaultBufferSize(i, i2);
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.12
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.textureWidth = i;
                TimerSurfaceTextureHelper.this.textureHeight = i2;
            }
        });
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            qkq0.m175383a("SurfaceTextureHelper listener has already been set.");
        } else if (this.notifyIntervalInMS == 0) {
            qkq0.m175383a("frame rate not set");
        } else {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
        }
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void stopListening() {
        Logging.m87211i(TAG, "stopListening()");
        stopScheduledService();
        this.proxyHandler.removeCallbacks(this.systemGenerateRunnable);
        this.proxyHandler.removeCallbacks(this.supplementRunnable);
        this.proxyHandler.removeCallbacks(this.timerRunnable);
        this.handler.removeCallbacks(this.setListenerRunnable);
        this.videoDecimator.reset();
        this.auxiliaryDecimator.reset();
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.11
            @Override // java.lang.Runnable
            public void run() {
                TimerSurfaceTextureHelper.this.listener = null;
                TimerSurfaceTextureHelper.this.pendingListener = null;
            }
        });
    }

    public void stopScheduledService() {
        ScheduledExecutorService scheduledExecutorService = this.scheduledService;
        if (scheduledExecutorService == null) {
            return;
        }
        try {
            scheduledExecutorService.shutdownNow();
            this.scheduledService = null;
        } catch (Throwable unused) {
            this.scheduledService = null;
            Logging.m87211i(TAG, "shutdownNow error.");
        }
    }

    public VideoFrame.TextureBuffer textureCopy(final VideoFrame.TextureBuffer textureBuffer) {
        if (textureBuffer.getTextureId() == this.oesTextureId) {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.TimerSurfaceTextureHelper.10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() {
                    return TimerSurfaceTextureHelper.this.textureBufferPool.textureCopy(textureBuffer, null);
                }
            });
        }
        qkq0.m175383a("textureCopy called with unexpected textureId");
        return null;
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static TimerSurfaceTextureHelper create(String str, boolean z, EglBase.Context context) {
        return create(str, z, context, 4);
    }

    public static TimerSurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, false, context, 4);
    }
}
