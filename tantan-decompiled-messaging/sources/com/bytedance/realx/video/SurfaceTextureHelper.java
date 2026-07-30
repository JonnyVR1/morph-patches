package com.bytedance.realx.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.SurfaceTextureHelper;
import com.bytedance.realx.video.agfx.RXGPUCacheCtrl;
import com.bytedance.realx.video.memory.NativeRXOpenGLMemory;
import com.bytedance.realx.video.memory.NativeRXVideoFrame;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import p149l.e2h0;
import p149l.k250;
import p149l.qkq0;

/* JADX INFO: loaded from: classes.dex */
public class SurfaceTextureHelper {
    private static final String TAG = "SurfaceTextureHelper";
    private static float[] TEX_MATRIX = new float[16];
    private boolean capture2DTexture;
    private final EglBase eglBase;
    private boolean enableOutsideControlTextureMemory;
    private final int frameBufferId;
    private int frameRotation;
    private Object frameSyncObject;
    private final GlRectDrawer glRectDrawer;
    private final Handler handler;
    private boolean hasPendingTexture;
    private boolean isAvaliable;
    private boolean isQuitting;
    private volatile boolean isTextureInUse;
    private long lastBindTimestamp;
    private long lastDeliverTime;

    @Nullable
    private VideoSink listener;
    private int maxDeliverTimerInternal;
    private int oesTextureId;

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
    private boolean useAgfx;
    private RXVideoFrameHelperInterface videoFrameHelperOpenGL;

    private SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, boolean z2, boolean z3) {
        this.textureWidth = 0;
        this.textureHeight = 0;
        this.capture2DTexture = false;
        this.useAgfx = false;
        this.lastBindTimestamp = 0L;
        this.enableOutsideControlTextureMemory = false;
        this.frameSyncObject = new Object();
        this.isAvaliable = false;
        this.setListenerRunnable = new Runnable() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                RXLogging.m5690i(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
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
        this.timedDeliverRunnable = new Runnable() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                if (SurfaceTextureHelper.this.maxDeliverTimerInternal <= 0 || SurfaceTextureHelper.this.handler == null || SurfaceTextureHelper.this.listener == null) {
                    return;
                }
                if (!SurfaceTextureHelper.this.hasPendingTexture && System.currentTimeMillis() - SurfaceTextureHelper.this.lastDeliverTime >= SurfaceTextureHelper.this.maxDeliverTimerInternal) {
                    SurfaceTextureHelper.this.hasPendingTexture = true;
                    if (!SurfaceTextureHelper.this.enableOutsideControlTextureMemory) {
                        SurfaceTextureHelper.this.tryDeliverTextureFrame();
                    }
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
            qkq0.m175383a("SurfaceTextureHelper must be created on the handler thread");
            throw null;
        }
        if (z3) {
            qkq0.m175383a("non agfx package not support SurfaceTextureHelper with AGFX");
            throw null;
        }
        this.handler = handler;
        this.timestampAligner = z ? new TimestampAligner() : null;
        this.capture2DTexture = z2;
        this.useAgfx = z3;
        if (z3) {
            this.eglBase = null;
            bind();
            this.videoFrameHelperOpenGL = RXVideoFrameHelper.createRXVideoFrameHelperOpenGL(EGL14.eglGetCurrentContext());
        } else {
            EglBase eglBaseCreate = EglBase.create(context, EglBase.getEGLConfig(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PIXEL_BUFFER));
            this.eglBase = eglBaseCreate;
            this.videoFrameHelperOpenGL = RXVideoFrameHelper.createRXVideoFrameHelperOpenGL(eglBaseCreate.getEglBaseContext().getEgl14Context());
            try {
                eglBaseCreate.createDummyPbufferSurface();
                eglBaseCreate.makeCurrent();
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
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
        this.oesTextureId = GlUtil.generateTexture(36197);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.oesTextureId);
        this.surfaceTexture = surfaceTexture;
        setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: l.q2h0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SurfaceTextureHelper.m5713e(this.f152273a, surfaceTexture2);
            }
        }, handler);
        if (z3) {
            surfaceTexture.detachFromGLContext();
            this.oesTextureId = 0;
            unbind();
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5709a(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.listener = null;
        surfaceTextureHelper.pendingListener = null;
    }

    private void bind() {
        if (this.useAgfx) {
            RXGPUCacheCtrl.getInstance().bind();
            this.lastBindTimestamp = System.currentTimeMillis();
        }
    }

    public static SurfaceTextureHelper create(final String str, final EglBase.Context context, final boolean z, final boolean z2, final boolean z3) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            @Nullable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(context, handler, z, z2, z3);
                } catch (RuntimeException e) {
                    RXLogging.m5689e(SurfaceTextureHelper.TAG, str + " create failure", e);
                    return null;
                }
            }
        });
    }

    public static SurfaceTextureHelper createWithAGFX(String str) {
        return createWithAGFX(str, false);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5712d(SurfaceTextureHelper surfaceTextureHelper) {
        if (surfaceTextureHelper.useAgfx) {
            surfaceTextureHelper.surfaceTexture.detachFromGLContext();
            surfaceTextureHelper.oesTextureId = 0;
            surfaceTextureHelper.unbind();
        }
        surfaceTextureHelper.isTextureInUse = false;
        if (surfaceTextureHelper.isQuitting) {
            surfaceTextureHelper.release();
        } else {
            if (surfaceTextureHelper.enableOutsideControlTextureMemory) {
                return;
            }
            surfaceTextureHelper.tryDeliverTextureFrame();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5713e(SurfaceTextureHelper surfaceTextureHelper, SurfaceTexture surfaceTexture) {
        if (!surfaceTextureHelper.enableOutsideControlTextureMemory) {
            surfaceTextureHelper.hasPendingTexture = true;
            surfaceTextureHelper.tryDeliverTextureFrame();
        } else {
            synchronized (surfaceTextureHelper.frameSyncObject) {
                surfaceTextureHelper.isAvaliable = true;
                surfaceTextureHelper.frameSyncObject.notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5714f(SurfaceTextureHelper surfaceTextureHelper, int i, int i2) {
        surfaceTextureHelper.textureWidth = i;
        surfaceTextureHelper.textureHeight = i2;
        if (surfaceTextureHelper.capture2DTexture) {
            surfaceTextureHelper.bind();
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, surfaceTextureHelper.twoDTextureId);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
            surfaceTextureHelper.unbind();
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m5715g(SurfaceTextureHelper surfaceTextureHelper) {
        surfaceTextureHelper.isQuitting = true;
        if (surfaceTextureHelper.isTextureInUse) {
            return;
        }
        surfaceTextureHelper.release();
    }

    private void release() {
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("Wrong thread.");
            return;
        }
        if (this.isTextureInUse || !this.isQuitting) {
            qkq0.m175383a("Unexpected release.");
            return;
        }
        bind();
        int i = this.oesTextureId;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.oesTextureId = 0;
        }
        if (this.capture2DTexture) {
            GLES20.glDeleteTextures(1, new int[]{this.twoDTextureId}, 0);
            GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
            this.glRectDrawer.release();
        }
        this.surfaceTexture.release();
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.release();
        }
        unbind();
        RXVideoFrameHelperInterface rXVideoFrameHelperInterface = this.videoFrameHelperOpenGL;
        if (rXVideoFrameHelperInterface != null) {
            rXVideoFrameHelperInterface.release();
            this.videoFrameHelperOpenGL = null;
        }
        this.handler.getLooper().quit();
        TimestampAligner timestampAligner = this.timestampAligner;
        if (timestampAligner != null) {
            timestampAligner.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: l.h2h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m5712d(this.f105532a);
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDeliverTextureFrame() {
        NativeRXOpenGLMemory nativeRXOpenGLMemoryCreateRXOpenGLMemory;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("Wrong thread.");
            return;
        }
        if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
            return;
        }
        if (this.textureWidth == 0 || this.textureHeight == 0) {
            RXLogging.m5692w(TAG, "Texture size has not been set.");
            return;
        }
        if (this.useAgfx) {
            bind();
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            this.surfaceTexture.attachToGLContext(iGenerateTexture);
        }
        this.isTextureInUse = true;
        this.hasPendingTexture = false;
        try {
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
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
                int i4 = this.textureWidth;
                int i5 = this.textureHeight;
                nativeRXOpenGLMemoryCreateRXOpenGLMemory = NativeRXOpenGLMemory.createRXOpenGLMemory(i4, i5, i4, i5, this.twoDTextureId, RXPixelFormat.kTexture2D, fArr, EGL14.eglGetCurrentContext(), RXVideoScaleFilter.kOpenGLOrigin, RXVideoRotation.fromId(this.frameRotation), new e2h0(this));
            } else {
                int i6 = this.textureWidth;
                int i7 = this.textureHeight;
                nativeRXOpenGLMemoryCreateRXOpenGLMemory = NativeRXOpenGLMemory.createRXOpenGLMemory(i6, i7, i6, i7, this.oesTextureId, RXPixelFormat.kTextureOES, fArr, EGL14.eglGetCurrentContext(), RXVideoScaleFilter.kOpenGLOrigin, RXVideoRotation.fromId(this.frameRotation), new e2h0(this));
            }
            NativeRXOpenGLMemory nativeRXOpenGLMemory = nativeRXOpenGLMemoryCreateRXOpenGLMemory;
            NativeRXVideoFrame nativeRXVideoFrameCreateRXVideoFrame = NativeRXVideoFrame.createRXVideoFrame(nativeRXOpenGLMemory, this.videoFrameHelperOpenGL, timestamp, (ByteBuffer) null, RXColorSpace.kYCbCrBT601LimitedRange);
            this.listener.onFrame(nativeRXVideoFrameCreateRXVideoFrame);
            nativeRXOpenGLMemory.release();
            nativeRXVideoFrameCreateRXVideoFrame.release();
        } catch (Exception e) {
            RXLogging.m5689e(TAG, " updateTexImage failure", e);
            this.isTextureInUse = false;
            this.hasPendingTexture = true;
        }
    }

    private void unbind() {
        if (this.useAgfx) {
            RXGPUCacheCtrl.getInstance().unbind();
            if (this.lastBindTimestamp == 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.lastBindTimestamp > 1000) {
                RXLogging.m5692w(TAG, "AGFX bind time: " + (jCurrentTimeMillis - this.lastBindTimestamp));
            }
            this.lastBindTimestamp = 0L;
        }
    }

    public void dispose() {
        RXLogging.m5690i(TAG, "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.k2h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m5715g(this.f120736a);
            }
        });
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public float[] getTexMatrix() {
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        return fArr;
    }

    public boolean isAvaliable() {
        boolean z;
        synchronized (this.frameSyncObject) {
            z = this.isAvaliable;
        }
        return z;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public void onFrame(MediaCodecTextureBufferHelper mediaCodecTextureBufferHelper) {
        NativeRXOpenGLMemory nativeRXOpenGLMemoryCreateRXOpenGLMemory;
        if (this.textureHeight <= 0 || this.textureWidth <= 0) {
            mediaCodecTextureBufferHelper.runTask(false);
            return;
        }
        long timestamp = this.surfaceTexture.getTimestamp();
        float[] fArr = new float[16];
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
            int i4 = this.textureWidth;
            int i5 = this.textureHeight;
            nativeRXOpenGLMemoryCreateRXOpenGLMemory = NativeRXOpenGLMemory.createRXOpenGLMemory(i4, i5, i4, i5, this.twoDTextureId, RXPixelFormat.kTexture2D, fArr, this.eglBase.getEglBaseContext().getEgl14Context(), RXVideoScaleFilter.kOpenGLOrigin, RXVideoRotation.fromId(this.frameRotation), new e2h0(this));
        } else {
            int i6 = this.textureWidth;
            int i7 = this.textureHeight;
            nativeRXOpenGLMemoryCreateRXOpenGLMemory = NativeRXOpenGLMemory.createRXOpenGLMemory(i6, i7, i6, i7, this.oesTextureId, RXPixelFormat.kTextureOES, fArr, this.eglBase.getEglBaseContext().getEgl14Context(), RXVideoScaleFilter.kOpenGLOrigin, RXVideoRotation.fromId(this.frameRotation), new e2h0(this));
        }
        NativeRXOpenGLMemory nativeRXOpenGLMemory = nativeRXOpenGLMemoryCreateRXOpenGLMemory;
        mediaCodecTextureBufferHelper.setSurfaceTextureHelper(this);
        nativeRXOpenGLMemory.setRenderHelper(mediaCodecTextureBufferHelper);
        NativeRXVideoFrame nativeRXVideoFrameCreateRXVideoFrame = NativeRXVideoFrame.createRXVideoFrame(nativeRXOpenGLMemory, this.videoFrameHelperOpenGL, timestamp, (ByteBuffer) null, RXColorSpace.kYCbCrBT601LimitedRange);
        this.listener.onFrame(nativeRXVideoFrameCreateRXVideoFrame);
        nativeRXOpenGLMemory.release();
        nativeRXVideoFrameCreateRXVideoFrame.release();
    }

    public void setEnableOutsideControlTextureMemory(boolean z) {
        this.enableOutsideControlTextureMemory = z;
    }

    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: l.b2h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f72697a.frameRotation = i;
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

    public void setTextureSize(final int i, final int i2, boolean z) {
        if (z && i == this.textureWidth && i2 == this.textureHeight) {
            return;
        }
        if (i <= 0) {
            k250.m144273a("Texture width must be positive, but was ", i);
        } else if (i2 <= 0) {
            k250.m144273a("Texture height must be positive, but was ", i2);
        } else {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new Runnable() { // from class: l.n2h0
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceTextureHelper.m5714f(this.f136832a, i, i2);
                }
            });
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            qkq0.m175383a("SurfaceTextureHelper listener has already been set.");
            return;
        }
        this.pendingListener = videoSink;
        this.handler.post(this.setListenerRunnable);
        if (this.enableOutsideControlTextureMemory) {
            return;
        }
        this.handler.post(this.timedDeliverRunnable);
    }

    public void stopListening() {
        RXLogging.m5690i(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: l.y1h0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.m5709a(this.f195412a);
            }
        });
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
        synchronized (this.frameSyncObject) {
            this.isAvaliable = false;
        }
    }

    public boolean updateTexImageAndWait(int i) {
        synchronized (this.frameSyncObject) {
            while (!this.isAvaliable) {
                try {
                    try {
                        this.frameSyncObject.wait(i);
                        if (!this.isAvaliable) {
                            return false;
                        }
                    } catch (InterruptedException e) {
                        RXLogging.m5688e(TAG, "updateTexImage exception: " + e.getMessage());
                        return false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (EglBase.lock) {
                this.surfaceTexture.updateTexImage();
            }
            this.isAvaliable = false;
            return true;
        }
    }

    public static SurfaceTextureHelper createWithAGFX(String str, boolean z) {
        return null;
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false, false, false);
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, false, false);
    }

    public void setTextureSize(int i, int i2) {
        setTextureSize(i, i2, false);
    }
}
