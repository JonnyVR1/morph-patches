package com.p069ss.bytertc.engine.mediaio;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.cosmos.photon.push.service.PushService;
import com.p069ss.bytertc.base.media.EglRenderer;
import com.p069ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.p069ss.bytertc.engine.p070ui.VideoFrameRender;
import com.p069ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import p149l.qkq0;
import p149l.t1h0;

/* JADX INFO: loaded from: classes13.dex */
public class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
    private static final String TAG = "TextureEglRenderer";
    private final AtomicBoolean mHasBindAtomic;
    private final AtomicBoolean mHasInitAtomic;
    private VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    private TextureView.SurfaceTextureListener mSurfaceTextureListener;
    private final Object mSurfaceTextureListenerLock;
    private volatile WeakReference<TextureView> mTextureViewRef;
    private final Handler mainHandler;

    public TextureEglRenderer(String str) {
        super(str);
        this.mSurfaceTextureListenerLock = new Object();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mTextureViewRef = new WeakReference<>(null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m80891i(TextureEglRenderer textureEglRenderer, TextureView textureView) {
        textureEglRenderer.getClass();
        if (textureView.getSurfaceTexture() != null) {
            textureEglRenderer.createEglSurface(textureView.getSurfaceTexture());
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = textureEglRenderer.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onCreated();
            }
        }
        textureView.setSurfaceTextureListener(textureEglRenderer);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m80892j(TextureEglRenderer textureEglRenderer, VideoFrame videoFrame, CountDownLatchI420Buffer countDownLatchI420Buffer) {
        super.onFrame(videoFrame);
        countDownLatchI420Buffer.release();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m80893k(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        try {
            if (countDownLatch.getCount() != 0) {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean postOnMainThreadAndLock(final Runnable runnable, final CountDownLatch countDownLatch) {
        return this.mainHandler.post(new Runnable() { // from class: l.hki0
            @Override // java.lang.Runnable
            public final void run() {
                TextureEglRenderer.m80893k(runnable, countDownLatch);
            }
        });
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void bind(final TextureView textureView, VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        if (!this.mHasInitAtomic.get()) {
            qkq0.m175383a("TextureEglRenderer has not init!!!!!!");
            return;
        }
        if (!this.mHasBindAtomic.compareAndSet(false, true)) {
            qkq0.m175383a("Called bind functions multiple times!!!!!!");
            return;
        }
        LogUtil.m80900d(TAG, PushService.COMMAND_BIND);
        this.mTextureViewRef = new WeakReference<>(textureView);
        this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
        runOnUIThread(new Runnable() { // from class: l.jki0
            @Override // java.lang.Runnable
            public final void run() {
                TextureEglRenderer.m80891i(this.f118385a, textureView);
            }
        });
    }

    @Override // com.p069ss.bytertc.base.media.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        if (!this.mHasInitAtomic.compareAndSet(false, true)) {
            qkq0.m175383a("TextureEglRenderer has already init!!!!!!");
        } else {
            LogUtil.m80900d(TAG, "init");
            super.init(context, iArr, glDrawer);
        }
    }

    @Override // com.p069ss.bytertc.base.media.EglRenderer, com.p069ss.bytertc.base.media.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get() && this.mTextureViewRef != null) {
            TextureView textureView = this.mTextureViewRef.get();
            if (videoFrame == null || textureView == null || !textureView.isShown()) {
                return;
            }
            if (!(videoFrame.getBuffer() instanceof CountDownLatchI420Buffer)) {
                super.onFrame(videoFrame);
                return;
            }
            final CountDownLatchI420Buffer countDownLatchI420Buffer = (CountDownLatchI420Buffer) videoFrame.getBuffer();
            countDownLatchI420Buffer.retain();
            if (postOnMainThreadAndLock(new Runnable() { // from class: l.iki0
                @Override // java.lang.Runnable
                public final void run() {
                    TextureEglRenderer.m80892j(this.f113678a, videoFrame, countDownLatchI420Buffer);
                }
            }, countDownLatchI420Buffer.getLatch())) {
                return;
            }
            countDownLatchI420Buffer.release();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m80900d(TAG, "onSurfaceTextureAvailable");
        createEglSurface(surfaceTexture);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onCreated();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m80900d(TAG, "onSurfaceTextureDestroyed");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(new t1h0(countDownLatch));
        int i = EglRenderer.mDestroyTimeoutMs;
        if (i <= 0) {
            ThreadUtils.awaitUninterruptibly(countDownLatch);
        } else {
            ThreadUtils.awaitUninterruptibly(countDownLatch, i);
        }
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onDestroy();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        LogUtil.m80900d(TAG, "onSurfaceTextureSizeChanged");
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p069ss.bytertc.base.media.EglRenderer
    public void release() {
        TextureView textureView;
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            qkq0.m175383a("TextureEglRenderer has not init or already released!!!!!");
            return;
        }
        LogUtil.m80900d(TAG, "release");
        super.release();
        this.mHasBindAtomic.compareAndSet(true, false);
        if (this.mTextureViewRef == null || (textureView = this.mTextureViewRef.get()) == null) {
            return;
        }
        textureView.setSurfaceTextureListener(null);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        synchronized (this.mSurfaceTextureListenerLock) {
            this.mSurfaceTextureListener = surfaceTextureListener;
        }
    }
}
