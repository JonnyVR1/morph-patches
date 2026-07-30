package com.p006ss.bytertc.base.media;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.GlUtil;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.TimestampAligner;
import com.bytedance.realx.video.VideoFrame;
import com.bytedance.realx.video.YuvConverter;
import com.p006ss.bytertc.base.media.SurfaceTextureHelper;
import java.util.concurrent.Callable;
import l.k250;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private static float[] TEX_MATRIX = new float[16];
    private boolean capture2DTexture;
    private final EglBase eglBase;
    private final int frameBufferId;
    private int frameRotation;
    private final GlRectDrawer glRectDrawer;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private long lastDeliverTime;

    @Nullable
    private VideoSink listener;
    private boolean mUsedByCamera;
    private int maxDeliverTimerInternal;
    private final int oesTextureId;

    @Nullable
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;
    private final SurfaceTexture surfaceTexture;
    private int textureHeight;
    private int textureWidth;
    final Runnable timedDeliverRunnable;

    @Nullable
    private final TimestampAligner timestampAligner;
    private final int twoDTextureId;
    private final YuvConverter yuvConverter;

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, boolean z2) {
        this.yuvConverter = new YuvConverter();
        this.capture2DTexture = false;
        this.mUsedByCamera = false;
        this.setListenerRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                RXLogging.i(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        this.lastDeliverTime = 0L;
        this.maxDeliverTimerInternal = -1;
        this.timedDeliverRunnable = new Runnable() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (SurfaceTextureHelper.this.maxDeliverTimerInternal <= 0 || SurfaceTextureHelper.this.handler == null || SurfaceTextureHelper.this.listener == null) {
                    return;
                }
                if (!SurfaceTextureHelper.this.hasPendingTexture && System.currentTimeMillis() - SurfaceTextureHelper.this.lastDeliverTime >= SurfaceTextureHelper.this.maxDeliverTimerInternal) {
                    SurfaceTextureHelper.this.hasPendingTexture = true;
                    SurfaceTextureHelper.this.tryDeliverTextureFrame();
                }
                long jCurrentTimeMillis = ((long) SurfaceTextureHelper.this.maxDeliverTimerInternal) - (System.currentTimeMillis() - SurfaceTextureHelper.this.lastDeliverTime);
                Handler handler2 = SurfaceTextureHelper.this.handler;
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = SurfaceTextureHelper.this.maxDeliverTimerInternal;
                }
                handler2.postDelayed(this, jCurrentTimeMillis);
            }
        };
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.a("SurfaceTextureHelper must be created on the handler thread");
            throw null;
        }
        this.handler = handler;
        this.timestampAligner = z ? new TimestampAligner() : null;
        this.capture2DTexture = z2;
        EglBase eglBaseCreate = EglBase.create(context, EglBase.CONFIG_PIXEL_BUFFER);
        this.eglBase = eglBaseCreate;
        try {
            eglBaseCreate.createDummyPbufferSurface();
            eglBaseCreate.makeCurrent();
            if (z2) {
                this.glRectDrawer = new GlRectDrawer();
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.frameBufferId = iArr[0];
                Matrix.setIdentityM(TEX_MATRIX, 0);
                this.twoDTextureId = GlUtil.generateTexture(3553);
            } else {
                this.glRectDrawer = null;
                this.frameBufferId = 0;
                this.twoDTextureId = 0;
            }
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
            this.surfaceTexture = surfaceTexture;
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: l.j2h0
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    SurfaceTextureHelper.m8358f(this.f9203a, surfaceTexture2);
                }
            }, handler);
        } catch (RuntimeException e) {
            this.eglBase.release();
            handler.getLooper().quit();
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m8354b(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.isQuitting = true;
        if (surfaceTextureHelper.isTextureInUse) {
            return;
        }
        surfaceTextureHelper.release();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m8355c(SurfaceTextureHelper surfaceTextureHelper, int i, int i2) {
        surfaceTextureHelper.textureWidth = i;
        surfaceTextureHelper.textureHeight = i2;
        if (surfaceTextureHelper.capture2DTexture) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, surfaceTextureHelper.twoDTextureId);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final boolean z2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: com.ss.bytertc.base.media.SurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @Nullable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler, z, z2);
                } catch (RuntimeException e) {
                    RXLogging.e(SurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m8357e(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.isTextureInUse = false;
        if (surfaceTextureHelper.isQuitting) {
            surfaceTextureHelper.release();
        } else {
            surfaceTextureHelper.tryDeliverTextureFrame();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m8358f(SurfaceTextureHelper surfaceTextureHelper, SurfaceTexture surfaceTexture) {
        surfaceTextureHelper.hasPendingTexture = true;
        surfaceTextureHelper.tryDeliverTextureFrame();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8359g(SurfaceTextureHelper surfaceTextureHelper) {
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
        if (this.capture2DTexture) {
            GLES20.glDeleteTextures(1, new int[]{this.twoDTextureId}, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
            this.glRectDrawer.release();
        }
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
        this.handler.post(new Runnable() { // from class: l.x1h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m8357e(this.f14737a);
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDeliverTextureFrame() {
        VideoFrame.Buffer textureBufferImpl;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.a("Wrong thread.");
            return;
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        if (this.textureWidth == 0 || this.textureHeight == 0) {
            RXLogging.w(TAG, "Texture size has not been set.");
            return;
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        if (this.mUsedByCamera) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f};
        } else {
            this.surfaceTexture.getTransformMatrix(fArr);
        }
        long timestamp = this.surfaceTexture.getTimestamp();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestamp = timestampAligner.translateTimestamp(timestamp);
        }
        this.lastDeliverTime = System.currentTimeMillis();
        if (this.capture2DTexture) {
            GLES20.glBindFramebuffer(36160, this.frameBufferId);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.twoDTextureId, 0);
            GlRectDrawer glRectDrawer = this.glRectDrawer;
            int i = this.oesTextureId;
            float[] fArr2 = TEX_MATRIX;
            int i2 = this.textureWidth;
            int i3 = this.textureHeight;
            glRectDrawer.drawOes(i, fArr2, i2, i3, 0, 0, i2, i3);
            GLES20.glBindFramebuffer(36160, 0);
            textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.RGB, this.twoDTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: l.a2h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5556a.returnTextureFrame();
                }
            });
        } else {
            textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: l.a2h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5556a.returnTextureFrame();
                }
            });
        }
        VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
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
        RXLogging.i(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.d2h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m8354b(this.f6781a);
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
        this.handler.post(new Runnable() { // from class: l.m2h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f10192a.frameRotation = i;
            }
        });
    }

    public void setMinFps(int i) {
        if (i > 0) {
            this.maxDeliverTimerInternal = (int) (1000.0f / i);
        } else {
            this.maxDeliverTimerInternal = 0;
        }
    }

    public void setTextureSize(final int i, final int i2) {
        if (i <= 0) {
            k250.a("Texture width must be positive, but was ", i);
        } else if (i2 <= 0) {
            k250.a("Texture height must be positive, but was ", i2);
        } else {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new Runnable() { // from class: l.g2h0
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTextureHelper.m8355c(this.f8306a, i, i2);
                }
            });
        }
    }

    public void setUsedByCamera(boolean z) {
        this.mUsedByCamera = z;
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            qkq0.a("SurfaceTextureHelper listener has already been set.");
            return;
        }
        this.pendingListener = videoSink;
        this.handler.post(this.setListenerRunnable);
        this.handler.post(this.timedDeliverRunnable);
    }

    public void stopListening() {
        RXLogging.i(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.p2h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m8359g(this.f11672a);
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

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, false);
    }
}
