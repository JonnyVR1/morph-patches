package com.momo.rtcbase;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.momo.rtcbase.SurfaceTextureHelper;
import java.util.concurrent.Callable;
import l.k250;
import l.qkq0;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private final EglBase eglBase;
    private int frameRotation;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private VideoSink listener;
    private final int oesTextureId;
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private int textureWidth;
    private final TimestampAligner timestampAligner;
    private final YuvConverter yuvConverter;

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z) {
        this.yuvConverter = new YuvConverter();
        this.setListenerRunnable = new Runnable() { // from class: com.momo.rtcbase.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                Logging.m468d(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.a("SurfaceTextureHelper must be created on the handler thread");
            throw null;
        }
        this.handler = handler;
        this.timestampAligner = z ? new TimestampAligner() : null;
        EglBase eglBaseCreate = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = eglBaseCreate;
        try {
            eglBaseCreate.createDummyPbufferSurface();
            eglBaseCreate.makeCurrent();
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
            this.surfaceTexture = surfaceTexture;
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: l.z1h0
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    SurfaceTextureHelper.m479b(this.f5478a, surfaceTexture2);
                }
            }, handler);
        } catch (RuntimeException e) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m479b(SurfaceTextureHelper surfaceTextureHelper, SurfaceTexture surfaceTexture) {
        surfaceTextureHelper.hasPendingTexture = true;
        surfaceTextureHelper.tryDeliverTextureFrame();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m480c(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.isTextureInUse = false;
        if (surfaceTextureHelper.isQuitting) {
            surfaceTextureHelper.release();
        } else {
            surfaceTextureHelper.tryDeliverTextureFrame();
        }
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: com.momo.rtcbase.SurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler, z);
                } catch (RuntimeException e) {
                    Logging.m470e(SurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m481d(SurfaceTextureHelper surfaceTextureHelper, int i, int i2) {
        surfaceTextureHelper.textureWidth = i;
        surfaceTextureHelper.textureHeight = i2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m482e(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.isQuitting = true;
        if (surfaceTextureHelper.isTextureInUse) {
            return;
        }
        surfaceTextureHelper.release();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m484g(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.listener = null;
        surfaceTextureHelper.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.a("Wrong thread.");
            return;
        }
        if (this.isTextureInUse || !this.isQuitting) {
            qkq0.a("Unexpected release.");
            return;
        }
        this.yuvConverter.release();
        GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
        this.surfaceTexture.release();
        this.eglBase.release();
        this.handler.getLooper().quit();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: l.f2h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m480c(this.f2664a);
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    private void tryDeliverTextureFrame() {
        int i;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.a("Wrong thread.");
            return;
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long timestamp = this.surfaceTexture.getTimestamp();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestamp = timestampAligner.translateTimestamp(timestamp);
        }
        int i2 = this.textureWidth;
        if (i2 == 0 || (i = this.textureHeight) == 0) {
            upk0.a("Texture size has not been set.");
            return;
        }
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i2, i, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: l.o2h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3475a.returnTextureFrame();
            }
        }), this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public void dispose() {
        Logging.m468d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.w1h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m482e(this.f5004a);
            }
        });
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: l.l2h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3204a.frameRotation = i;
            }
        });
    }

    public void setTextureSize(final int i, final int i2) {
        if (i <= 0) {
            k250.a("Texture width must be positive, but was ", i);
        } else if (i2 <= 0) {
            k250.a("Texture height must be positive, but was ", i2);
        } else {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new Runnable() { // from class: l.c2h0
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTextureHelper.m481d(this.f2356a, i, i2);
                }
            });
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            qkq0.a("SurfaceTextureHelper listener has already been set.");
        } else {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
        }
    }

    public void stopListening() {
        Logging.m468d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.i2h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m484g(this.f2864a);
            }
        });
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false);
    }
}
