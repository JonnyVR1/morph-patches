package com.p074ss.bytertc.engine.mediaio;

import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.VideoFrame;
import com.cosmos.photon.push.service.PushService;
import com.p074ss.bytertc.base.media.SurfaceEglRenderer;
import com.p074ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.p074ss.bytertc.engine.p075ui.VideoFrameRender;
import com.p074ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p153l.wtq0;

/* JADX INFO: loaded from: classes11.dex */
public class SurfaceEglRender extends SurfaceEglRenderer {
    private static final String TAG = "SurfaceEglRender";
    private SurfaceHolder.Callback mCallback;
    private final AtomicBoolean mHasBindAtomic;
    private final AtomicBoolean mHasInitAtomic;
    private final Object mSurfaceCallbackLock;
    private VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    private final Object mSurfaceLifecycleCallbackLock;
    private SoftReference<SurfaceView> surfaceViewSoftReference;

    public SurfaceEglRender(String str) {
        super(str);
        this.mHasInitAtomic = new AtomicBoolean(false);
        this.mHasBindAtomic = new AtomicBoolean(false);
        this.mSurfaceLifecycleCallbackLock = new Object();
        this.mSurfaceCallbackLock = new Object();
        this.surfaceViewSoftReference = new SoftReference<>(null);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m82073i(SurfaceEglRender surfaceEglRender, SurfaceView surfaceView) {
        surfaceEglRender.getClass();
        SurfaceHolder holder = surfaceView.getHolder();
        synchronized (surfaceEglRender.mSurfaceCallbackLock) {
            try {
                SurfaceHolder.Callback callback = surfaceEglRender.mCallback;
                if (callback != null) {
                    holder.addCallback(callback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        surfaceEglRender.surfaceViewSoftReference = new SoftReference<>(surfaceView);
        if (holder.getSurface() != null && holder.getSurface().isValid()) {
            surfaceEglRender.setLayoutAspectRatio(surfaceView.getMeasuredWidth() / surfaceView.getMeasuredHeight());
            surfaceEglRender.surfaceCreated(holder);
        }
        holder.addCallback(surfaceEglRender);
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void bind(final SurfaceView surfaceView) {
        if (!this.mHasInitAtomic.get()) {
            wtq0.m207906a("TextureEglRenderer has not init!!!!!!");
        } else if (!this.mHasBindAtomic.compareAndSet(false, true)) {
            wtq0.m207906a("Called bind functions multiple times!!!!!!");
        } else {
            LogUtil.m82083d(TAG, PushService.COMMAND_BIND);
            runOnUIThread(new Runnable() { // from class: l.aah0
                @Override // java.lang.Runnable
                public final void run() {
                    SurfaceEglRender.m82073i(this.f69144a, surfaceView);
                }
            });
        }
    }

    @Override // com.p074ss.bytertc.base.media.SurfaceEglRenderer, com.p074ss.bytertc.base.media.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        if (!this.mHasInitAtomic.compareAndSet(false, true)) {
            wtq0.m207906a("SurfaceEglRender has already init!!!!!!");
        } else {
            LogUtil.m82083d(TAG, "init");
            super.init(context, iArr, glDrawer);
        }
    }

    @Override // com.p074ss.bytertc.base.media.SurfaceEglRenderer, com.p074ss.bytertc.base.media.EglRenderer, com.p074ss.bytertc.base.media.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get()) {
            super.onFrame(videoFrame);
        }
    }

    @Override // com.p074ss.bytertc.base.media.SurfaceEglRenderer, com.p074ss.bytertc.base.media.EglRenderer
    public void release() {
        SurfaceView surfaceView;
        if (!this.mHasInitAtomic.compareAndSet(true, false)) {
            wtq0.m207906a("TextureEglRenderer has not init or already released!!!!!");
            return;
        }
        LogUtil.m82083d(TAG, "release");
        super.release();
        this.mHasBindAtomic.compareAndSet(true, false);
        SoftReference<SurfaceView> softReference = this.surfaceViewSoftReference;
        if (softReference == null || (surfaceView = softReference.get()) == null) {
            return;
        }
        surfaceView.getHolder().removeCallback(this);
    }

    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        synchronized (this.mSurfaceCallbackLock) {
            this.mCallback = callback;
        }
    }

    public void setSurfaceLifecycleLisenter(VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
        }
    }

    @Override // com.p074ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        LogUtil.m82083d(TAG, "surfaceChanged");
    }

    @Override // com.p074ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        LogUtil.m82083d(TAG, "surfaceCreated");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
                if (surfaceLifecycleCallback != null) {
                    surfaceLifecycleCallback.onCreated();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.p074ss.bytertc.base.media.SurfaceEglRenderer, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        super.surfaceDestroyed(surfaceHolder);
        LogUtil.m82083d(TAG, "surfaceDestroyed");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
                if (surfaceLifecycleCallback != null) {
                    surfaceLifecycleCallback.onDestroy();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
