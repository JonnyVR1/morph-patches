package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGL10;
import p149l.k250;
import p149l.qkq0;
import p149l.upk0;

/* JADX INFO: loaded from: classes2.dex */
public class SurfaceTextureHelper implements ISurfaceTextureHelper {
    private static final int ANDROID_API_TEXTURE_IN_USE = 10;
    private static final int DEFAULT_MAX_BUFFER_COUNT = 4;
    private static final String TAG = "SurfaceTextureHelper";
    private EglBase eglBase;
    private int frameRotation;
    private final Handler handler;
    private boolean hasPendingTexture;
    private volatile boolean isOesTextureInUse;
    private boolean isQuitting;

    @Nullable
    private VideoSink listener;
    private int mLumaBitDepth;
    private final String name;
    private final int oesTextureId;

    @Nullable
    private VideoSink pendingListener;
    final Runnable setListenerRunnable;

    @NonNull
    private final EglBase.Context sharedContext;
    private final SurfaceTexture surfaceTexture;
    private final TextureBufferPool textureBufferPool;
    private int textureHeight;
    private int textureWidth;
    private final YuvConverter yuvConverter;

    public interface IVideoCapture extends VideoSink {
        void onFrameDropped(int i);
    }

    private SurfaceTextureHelper(String str, EglBase.Context context, Handler handler, int i, int i2) {
        YuvConverter yuvConverter = new YuvConverter();
        this.yuvConverter = yuvConverter;
        this.hasPendingTexture = false;
        this.isOesTextureInUse = false;
        this.isQuitting = false;
        this.mLumaBitDepth = 0;
        this.setListenerRunnable = new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                Logging.m87211i(SurfaceTextureHelper.TAG, "Setting listener to " + SurfaceTextureHelper.this.pendingListener);
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                SurfaceTextureHelper.this.pendingListener = null;
                if (SurfaceTextureHelper.this.hasPendingTexture) {
                    SurfaceTextureHelper.this.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }
        };
        Logging.m87211i(TAG, "construct");
        if (handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("SurfaceTextureHelper must be created on the handler thread");
            throw null;
        }
        this.name = str;
        this.handler = handler;
        try {
            EglBase eglBaseCreate = EglBaseFactory.create(context, i2, false, EglBase.EglConfigType.CONFIG_PIXEL_BUFFER_TYPE);
            this.eglBase = eglBaseCreate;
            eglBaseCreate.createDummyPbufferSurface();
            this.eglBase.makeCurrent();
            this.sharedContext = context != null ? context : this.eglBase.getEglBaseContext();
            TextureBufferPool textureBufferPoolCreateWithinGlThread = TextureBufferPool.createWithinGlThread(str, i, 6407, handler, this.eglBase, context, yuvConverter);
            this.textureBufferPool = textureBufferPoolCreateWithinGlThread;
            textureBufferPoolCreateWithinGlThread.setPoolBufferReleaseCallback(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.3
                @Override // java.lang.Runnable
                public void run() {
                    SurfaceTextureHelper.this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!SurfaceTextureHelper.this.isQuitting || SurfaceTextureHelper.this.isOesTextureInUse || SurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                                return;
                            }
                            SurfaceTextureHelper.this.release();
                        }
                    });
                }
            });
            int iGenerateTexture = GlUtil.generateTexture(36197);
            this.oesTextureId = iGenerateTexture;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iGenerateTexture);
            this.surfaceTexture = surfaceTexture;
            setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.4
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    SurfaceTextureHelper.this.hasPendingTexture = true;
                    SurfaceTextureHelper.this.tryDeliverTextureFrame();
                }
            }, handler);
        } catch (RuntimeException e) {
            Logging.m87210e(TAG, str + " create eglBase failure", e);
            try {
                this.eglBase.release();
            } catch (Exception e2) {
                Logging.m87210e(TAG, "Failed to release EglBase: " + this.eglBase, e2);
            }
            handler.getLooper().quit();
            throw e;
        }
    }

    @Nullable
    public static SurfaceTextureHelper create(String str, final EglBase.Context context, final int i, final int i2) {
        final String str2;
        Logging.m87211i(TAG, "create " + str);
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        final Handler handler = new Handler(handlerThread.getLooper());
        try {
            str2 = str;
            try {
                return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    @Nullable
                    public SurfaceTextureHelper call() {
                        try {
                            return new SurfaceTextureHelper(str2, context, handler, i, i2);
                        } catch (RuntimeException e) {
                            Logging.m87210e(SurfaceTextureHelper.TAG, str2 + " create failure", e);
                            return null;
                        }
                    }
                });
            } catch (Exception e) {
                e = e;
                Logging.m87210e(TAG, str2 + " create failure", e);
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            str2 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        Logging.m87211i(TAG, "release()");
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
        this.handler.getLooper().quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnTextureFrame() {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.8
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.isOesTextureInUse = false;
                boolean z = SurfaceTextureHelper.this.isQuitting;
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (!z) {
                    surfaceTextureHelper.tryDeliverTextureFrame();
                } else {
                    if (surfaceTextureHelper.textureBufferPool.anyTextureInUse()) {
                        return;
                    }
                    SurfaceTextureHelper.this.release();
                }
            }
        });
    }

    @TargetApi(21)
    private static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryDeliverTextureFrame() {
        int i;
        if (this.handler.getLooper().getThread() != Thread.currentThread()) {
            qkq0.m175383a("Wrong thread.");
            return;
        }
        if (this.isQuitting || !this.hasPendingTexture || this.listener == null) {
            return;
        }
        if (this.isOesTextureInUse) {
            VideoSink videoSink = this.listener;
            if (videoSink instanceof IVideoCapture) {
                ((IVideoCapture) videoSink).onFrameDropped(10);
                return;
            }
            return;
        }
        EglBase.Context context = this.sharedContext;
        if ((context instanceof EglBase10.Context) && ((EglBase10.Context) context).getEglContext().equals(EGL10.EGL_NO_CONTEXT)) {
            return;
        }
        EglBase.Context context2 = this.sharedContext;
        if ((context2 instanceof EglBase14.Context) && ((EglBase14.Context) context2).getEglContext().equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        this.isOesTextureInUse = true;
        this.hasPendingTexture = false;
        updateTexImage();
        float[] fArr = new float[16];
        this.surfaceTexture.getTransformMatrix(fArr);
        long timestamp = this.surfaceTexture.getTimestamp();
        int i2 = this.textureWidth;
        if (i2 == 0 || (i = this.textureHeight) == 0) {
            upk0.m194883a("Texture size has not been set.");
            return;
        }
        VideoFrame videoFrame = new VideoFrame(new TextureBuffer(this.sharedContext, i2, i, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.11
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.returnTextureFrame();
            }
        }, this.mLumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()), this.frameRotation, timestamp);
        this.listener.onFrame(videoFrame);
        videoFrame.release();
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
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.9
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.isQuitting = true;
                if (!SurfaceTextureHelper.this.isOesTextureInUse && !SurfaceTextureHelper.this.textureBufferPool.anyTextureInUse()) {
                    SurfaceTextureHelper.this.release();
                    return;
                }
                Logging.m87211i(SurfaceTextureHelper.TAG, SurfaceTextureHelper.this.name + " not release yet, this: " + SurfaceTextureHelper.this + " isOesTextureInUse: " + SurfaceTextureHelper.this.isOesTextureInUse);
            }
        });
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public Handler getHandler() {
        return this.handler;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public <V> V invoke(Callable<V> callable) {
        return (V) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, callable);
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public boolean isOesTextureInUse() {
        return this.isOesTextureInUse;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.7
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.frameRotation = i;
            }
        });
    }

    public void setLumaBitDepth(int i) {
        this.mLumaBitDepth = i;
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void setTextureSize(final int i, final int i2) {
        if (i <= 0) {
            k250.m144273a("Texture width must be positive, but was ", i);
        } else if (i2 <= 0) {
            k250.m144273a("Texture height must be positive, but was ", i2);
        } else {
            this.surfaceTexture.setDefaultBufferSize(i, i2);
            this.handler.post(new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.6
                @Override // java.lang.Runnable
                public void run() {
                    SurfaceTextureHelper.this.textureWidth = i;
                    SurfaceTextureHelper.this.textureHeight = i2;
                }
            });
        }
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void startListening(VideoSink videoSink) {
        if (this.listener != null || this.pendingListener != null) {
            qkq0.m175383a("SurfaceTextureHelper listener has already been set.");
        } else {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
        }
    }

    @Override // io.agora.base.internal.video.ISurfaceTextureHelper
    public void stopListening() {
        Logging.m87211i(TAG, "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Runnable() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.5
            @Override // java.lang.Runnable
            public void run() {
                SurfaceTextureHelper.this.listener = null;
                SurfaceTextureHelper.this.pendingListener = null;
            }
        });
    }

    @Nullable
    public VideoFrame.TextureBuffer textureCopy(final VideoFrame.TextureBuffer textureBuffer, final int i) {
        if (textureBuffer == null) {
            Logging.m87213w(TAG, "textureCopy: " + this.name + " textureBuffer is null, IllegalStateException");
            qkq0.m175383a("textureCopy called unexpected with textureBuffer is null");
            return null;
        }
        if (this.handler != null && ((IHandlerReplaceable) textureBuffer).getToI420Handler() != null) {
            return (VideoFrame.TextureBuffer) ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new Callable<VideoFrame.TextureBuffer>() { // from class: io.agora.base.internal.video.SurfaceTextureHelper.10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame.TextureBuffer call() throws Exception {
                    return SurfaceTextureHelper.this.textureBufferPool.textureCopy(textureBuffer, i, null);
                }
            });
        }
        Logging.m87213w(TAG, "textureCopy: " + this.name + " handler is null, IllegalStateException");
        qkq0.m175383a("textureCopy called unexpected with handler is null");
        return null;
    }

    @Deprecated
    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    @Nullable
    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, 4, 0);
    }

    @Nullable
    public VideoFrame.TextureBuffer textureCopy(VideoFrame.TextureBuffer textureBuffer) {
        return textureCopy(textureBuffer, 0);
    }
}
