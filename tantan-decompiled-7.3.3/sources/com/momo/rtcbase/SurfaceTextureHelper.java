package com.momo.rtcbase;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import com.momo.rtcbase.SurfaceTextureHelper;
import java.util.concurrent.Callable;
import p153l.azk0;
import p153l.wtq0;
import p153l.za50;

/* JADX INFO: loaded from: classes8.dex */
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
                Logging.m21196d(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
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
            wtq0.m207906a("SurfaceTextureHelper must be created on the handler thread");
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
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: l.hah0
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    SurfaceTextureHelper.m21207b(this.f108497a, surfaceTexture2);
                }
            }, handler);
        } catch (RuntimeException e) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21207b(SurfaceTextureHelper surfaceTextureHelper, SurfaceTexture surfaceTexture) {
        surfaceTextureHelper.hasPendingTexture = true;
        surfaceTextureHelper.tryDeliverTextureFrame();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21208c(SurfaceTextureHelper surfaceTextureHelper) {
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
                    Logging.m21198e(SurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21209d(SurfaceTextureHelper surfaceTextureHelper, int i, int i2) {
        surfaceTextureHelper.textureWidth = i;
        surfaceTextureHelper.textureHeight = i2;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m21210e(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.isQuitting = true;
        if (surfaceTextureHelper.isTextureInUse) {
            return;
        }
        surfaceTextureHelper.release();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m21212g(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.listener = null;
        surfaceTextureHelper.pendingListener = null;
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            wtq0.m207906a("Wrong thread.");
            return;
        }
        if (this.isTextureInUse || !this.isQuitting) {
            wtq0.m207906a("Unexpected release.");
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
        this.handler.post(new Runnable() { // from class: l.nah0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m21208c(this.f141014a);
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
            wtq0.m207906a("Wrong thread.");
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
            azk0.m101074a("Texture size has not been set.");
            return;
        }
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i2, i, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: l.wah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188122a.returnTextureFrame();
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
        Logging.m21196d(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.eah0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m21210e(this.f92785a);
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
        this.handler.post(new Runnable() { // from class: l.tah0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172732a.frameRotation = i;
            }
        });
    }

    public void setTextureSize(final int i, final int i2) {
        if (i <= 0) {
            za50.m219101a("Texture width must be positive, but was ", i);
        } else if (i2 <= 0) {
            za50.m219101a("Texture height must be positive, but was ", i2);
        } else {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new Runnable() { // from class: l.kah0
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTextureHelper.m21209d(this.f124689a, i, i2);
                }
            });
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            wtq0.m207906a("SurfaceTextureHelper listener has already been set.");
        } else {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
        }
    }

    public void stopListening() {
        Logging.m21196d(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.qah0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m21212g(this.f156384a);
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
