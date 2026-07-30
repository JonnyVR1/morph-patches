package com.momo.rtcbase;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.os.Build;
import android.view.Surface;
import l.o5d0;
import l.qkq0;
import l.upk0;
import p007l.bre;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@TargetApi(18)
public class EglBase14 implements EglBase {
    private static final int CURRENT_SDK_VERSION = Build.VERSION.SDK_INT;
    private static final int EGLExt_SDK_VERSION = 18;
    private static final String TAG = "EglBase14";
    private EGLConfig eglConfig;
    private EGLContext eglContext;
    private EGLDisplay eglDisplay;
    private EGLSurface eglSurface = EGL14.EGL_NO_SURFACE;

    public static class Context implements EglBase.Context {
        private final EGLContext egl14Context;

        public Context(EGLContext eGLContext) {
            this.egl14Context = eGLContext;
        }

        @Override // com.momo.rtcbase.EglBase.Context
        @TargetApi(21)
        public long getNativeEglContext() {
            int i = EglBase14.CURRENT_SDK_VERSION;
            EGLContext eGLContext = this.egl14Context;
            return i >= 21 ? eGLContext.getNativeHandle() : eGLContext.getHandle();
        }
    }

    public EglBase14(Context context, int[] iArr) {
        EGLDisplay eglDisplay = getEglDisplay();
        this.eglDisplay = eglDisplay;
        EGLConfig eglConfig = getEglConfig(eglDisplay, iArr);
        this.eglConfig = eglConfig;
        this.eglContext = createEglContext(context, this.eglDisplay, eglConfig);
    }

    private void checkIsNotReleased() {
        if (this.eglDisplay == EGL14.EGL_NO_DISPLAY || this.eglContext == EGL14.EGL_NO_CONTEXT || this.eglConfig == null) {
            upk0.a("This object has been released");
        }
    }

    private static EGLContext createEglContext(Context context, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        EGLContext eGLContextEglCreateContext;
        if (context != null && context.egl14Context == EGL14.EGL_NO_CONTEXT) {
            upk0.a("Invalid sharedContext");
            return null;
        }
        int[] iArr = {12440, 2, 12344};
        EGLContext eGLContext = context == null ? EGL14.EGL_NO_CONTEXT : context.egl14Context;
        synchronized (EglBase.lock) {
            eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        }
        if (eGLContextEglCreateContext != EGL14.EGL_NO_CONTEXT) {
            return eGLContextEglCreateContext;
        }
        o5d0.a("Failed to create EGL context: 0x", Integer.toHexString(EGL14.eglGetError()));
        return null;
    }

    private void createSurfaceInternal(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            qkq0.a("Input must be either a Surface or SurfaceTexture");
            return;
        }
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            upk0.a("Already has an EGLSurface");
            return;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.eglDisplay, this.eglConfig, obj, new int[]{12344}, 0);
        this.eglSurface = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        o5d0.a("Failed to create window surface: 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
            o5d0.a("eglChooseConfig failed: 0x", Integer.toHexString(EGL14.eglGetError()));
            return null;
        }
        if (iArr2[0] <= 0) {
            upk0.a("Unable to find any matching EGL config");
            return null;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig != null) {
            return eGLConfig;
        }
        upk0.a("eglChooseConfig returned null");
        return null;
    }

    private static EGLDisplay getEglDisplay() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            o5d0.a("Unable to get EGL14 display: 0x", Integer.toHexString(EGL14.eglGetError()));
            return null;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        o5d0.a("Unable to initialize EGL14: 0x", Integer.toHexString(EGL14.eglGetError()));
        return null;
    }

    public static boolean isEGL14Supported() {
        StringBuilder sb = new StringBuilder("SDK version: ");
        int i = CURRENT_SDK_VERSION;
        sb.append(i);
        sb.append(". isEGL14Supported: ");
        sb.append(i >= 18);
        Logging.m468d(TAG, sb.toString());
        return i >= 18;
    }

    @Override // com.momo.rtcbase.EglBase
    public void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // com.momo.rtcbase.EglBase
    public void createPbufferSurface(int i, int i2) {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            upk0.a("Already has an EGLSurface");
            return;
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.eglDisplay, this.eglConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        this.eglSurface = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        bre.m8645a("Failed to create pixel buffer surface with size ", i, "x", i2, ": 0x", Integer.toHexString(EGL14.eglGetError()));
    }

    @Override // com.momo.rtcbase.EglBase
    public void createSurface(Surface surface) {
        createSurfaceInternal(surface);
    }

    @Override // com.momo.rtcbase.EglBase
    public void detachCurrent() {
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                    throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.rtcbase.EglBase
    public Context getEglBaseContext() {
        return new Context(this.eglContext);
    }

    @Override // com.momo.rtcbase.EglBase
    public EGLContext getSharedConect() {
        return this.eglContext;
    }

    @Override // com.momo.rtcbase.EglBase
    public boolean hasSurface() {
        return this.eglSurface != EGL14.EGL_NO_SURFACE;
    }

    @Override // com.momo.rtcbase.EglBase
    public void makeCurrent() {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            upk0.a("No EGLSurface - can't make current");
            return;
        }
        synchronized (EglBase.lock) {
            try {
                EGLDisplay eGLDisplay = this.eglDisplay;
                EGLSurface eGLSurface = this.eglSurface;
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.eglContext)) {
                    throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.rtcbase.EglBase
    public void release() {
        checkIsNotReleased();
        releaseSurface();
        detachCurrent();
        EGL14.eglDestroyContext(this.eglDisplay, this.eglContext);
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.eglDisplay);
        this.eglContext = EGL14.EGL_NO_CONTEXT;
        this.eglDisplay = EGL14.EGL_NO_DISPLAY;
        this.eglConfig = null;
    }

    @Override // com.momo.rtcbase.EglBase
    public void releaseSurface() {
        EGLSurface eGLSurface = this.eglSurface;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.eglDisplay, eGLSurface);
            this.eglSurface = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // com.momo.rtcbase.EglBase
    public int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // com.momo.rtcbase.EglBase
    public int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.eglDisplay, this.eglSurface, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // com.momo.rtcbase.EglBase
    public void swapBuffers(long j) {
        checkIsNotReleased();
        if (this.eglSurface == EGL14.EGL_NO_SURFACE) {
            upk0.a("No EGLSurface - can't swap buffers");
            return;
        }
        synchronized (EglBase.lock) {
            EGLExt.eglPresentationTimeANDROID(this.eglDisplay, this.eglSurface, j);
            EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
        }
    }

    @Override // com.momo.rtcbase.EglBase
    public void createSurface(SurfaceTexture surfaceTexture) {
        createSurfaceInternal(surfaceTexture);
    }

    @Override // com.momo.rtcbase.EglBase
    public void swapBuffers() {
        checkIsNotReleased();
        if (this.eglSurface != EGL14.EGL_NO_SURFACE) {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.eglDisplay, this.eglSurface);
            }
            return;
        }
        upk0.a("No EGLSurface - can't swap buffers");
    }
}
