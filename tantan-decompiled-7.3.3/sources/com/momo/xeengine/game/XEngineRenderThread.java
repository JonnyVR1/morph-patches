package com.momo.xeengine.game;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes8.dex */
final class XEngineRenderThread extends Thread {
    private EGL10 mEgl;
    private EGLContext mEglContext;
    private EGLDisplay mEglDisplay;
    private IXRender mRender;
    private Object nativeWindow;
    private boolean running;
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int[] CONTEXT_ATTRIBS = {EGL_CONTEXT_CLIENT_VERSION, 3, 12344};
    private static final int[] CONFIG_ATTRIBS = {12320, 32, 12321, 8, 12322, 8, 12323, 8, 12324, 8, 12325, 16, 12352, 4, 12339, 4, 12344};
    private final boolean syncSurfaceCreate = false;
    private final Queue<Runnable> mEventQueue = new ConcurrentLinkedQueue();
    private final EGLConfig[] configs = new EGLConfig[1];
    private EGLSurface mEglSurface = null;
    private int mWidth = 0;
    private int mHeight = 0;

    public XEngineRenderThread(Object obj, IXRender iXRender) {
        setName(XEngineRenderThread.class.getName());
        this.nativeWindow = obj;
        this.mRender = iXRender;
    }

    private void ThrowException(boolean z, String str) {
        throw new RuntimeException((z ? "Reset gl " : "Init gl ") + str + " error:" + GLUtils.getEGLErrorString(this.mEgl.eglGetError()));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m21239a(XEngineRenderThread xEngineRenderThread, int i, int i2) {
        if (xEngineRenderThread.mWidth == i && xEngineRenderThread.mHeight == i2) {
            return;
        }
        xEngineRenderThread.mWidth = i;
        xEngineRenderThread.mHeight = i2;
        xEngineRenderThread.mRender.onGLRenderSizeChanged(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21240b(XEngineRenderThread xEngineRenderThread, Object obj, AtomicBoolean atomicBoolean) {
        xEngineRenderThread.nativeWindow = obj;
        xEngineRenderThread.initGLEnv(true);
        atomicBoolean.set(true);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21241c(XEngineRenderThread xEngineRenderThread, AtomicBoolean atomicBoolean) {
        xEngineRenderThread.nativeWindow = null;
        EGL10 egl10 = xEngineRenderThread.mEgl;
        EGLDisplay eGLDisplay = xEngineRenderThread.mEglDisplay;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        try {
            xEngineRenderThread.mEgl.eglDestroySurface(xEngineRenderThread.mEglDisplay, xEngineRenderThread.mEglSurface);
        } catch (Exception unused) {
        }
        xEngineRenderThread.mEglSurface = null;
        atomicBoolean.set(true);
    }

    private void initGLEnv(boolean z) {
        if (this.mEgl == null) {
            this.mEgl = (EGL10) EGLContext.getEGL();
        }
        if (this.mEglDisplay == null) {
            EGLDisplay eGLDisplayEglGetDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mEglDisplay = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                ThrowException(z, "eglGetDisplay");
            }
            if (!this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                ThrowException(z, "eglInitialize");
            }
            if (!this.mEgl.eglChooseConfig(this.mEglDisplay, CONFIG_ATTRIBS, this.configs, 1, new int[1])) {
                ThrowException(z, "eglChooseConfig");
            }
        }
        if (this.mEglContext == null) {
            EGL10 egl10 = this.mEgl;
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLConfig eGLConfig = this.configs[0];
            int[] iArr = CONTEXT_ATTRIBS;
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
            this.mEglContext = eGLContextEglCreateContext;
            if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == eGLContext) {
                ThrowException(z, "eglCreateContext");
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = this.mEgl.eglCreateWindowSurface(this.mEglDisplay, this.configs[0], this.nativeWindow, null);
        this.mEglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == null) {
            ThrowException(z, "eglCreateWindowSurface1");
        }
        if (this.mEglSurface == EGL10.EGL_NO_SURFACE) {
            ThrowException(z, "eglCreateWindowSurface2");
        }
        EGL10 egl11 = this.mEgl;
        EGLDisplay eGLDisplay2 = this.mEglDisplay;
        EGLSurface eGLSurface = this.mEglSurface;
        if (egl11.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, this.mEglContext)) {
            return;
        }
        ThrowException(z, "eglMakeCurrent");
    }

    private void swapBuffers() {
        try {
            this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface);
        } catch (Throwable unused) {
        }
    }

    public void destroyNativeWindow() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mEventQueue.add(new Runnable() { // from class: com.momo.xeengine.game.f
            @Override // java.lang.Runnable
            public final void run() {
                XEngineRenderThread.m21241c(this.f15304a, atomicBoolean);
            }
        });
    }

    public void onSizeChanged(final int i, final int i2) {
        this.mEventQueue.add(new Runnable() { // from class: com.momo.xeengine.game.e
            @Override // java.lang.Runnable
            public final void run() {
                XEngineRenderThread.m21239a(this.f15301a, i, i2);
            }
        });
    }

    public void queueEvent(Runnable runnable) {
        this.mEventQueue.add(runnable);
    }

    public void requestStop() {
        this.running = false;
    }

    public void resetNativeWindow(final Object obj) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mEventQueue.add(new Runnable() { // from class: com.momo.xeengine.game.d
            @Override // java.lang.Runnable
            public final void run() {
                XEngineRenderThread.m21240b(this.f15298a, obj, atomicBoolean);
            }
        });
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            initGLEnv(false);
            this.running = true;
            this.mRender.onGLEnvCreated();
            while (this.running) {
                while (!this.mEventQueue.isEmpty()) {
                    Runnable runnablePoll = this.mEventQueue.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    }
                }
                synchronized (this) {
                    try {
                        if (this.mEglSurface == null || this.mWidth == 0 || this.mHeight == 0) {
                            this.mRender.onBackgroundFrame();
                        } else if (this.mRender.onGLDrawFrame(this.mEgl)) {
                            swapBuffers();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.mRender.onGLEnvRelease();
            try {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface);
            } catch (Throwable unused) {
            }
            this.mRender = null;
            EGL10 egl10 = this.mEgl;
            EGLDisplay eGLDisplay = this.mEglDisplay;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            try {
                EGLSurface eGLSurface2 = this.mEglSurface;
                if (eGLSurface2 != null) {
                    this.mEgl.eglDestroySurface(this.mEglDisplay, eGLSurface2);
                    this.mEglSurface = null;
                }
            } catch (Exception unused2) {
            }
            this.mEgl.eglDestroyContext(this.mEglDisplay, this.mEglContext);
            this.mEglContext = null;
        } catch (Throwable th2) {
            this.mRender.onGLEnvCreatedFailed(th2.toString());
        }
    }
}
