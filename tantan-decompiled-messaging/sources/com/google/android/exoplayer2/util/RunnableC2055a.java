package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.a */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
@Deprecated
public final class RunnableC2055a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g */
    public static final int[] f9544g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a */
    public final Handler f9545a;

    /* JADX INFO: renamed from: b */
    public final int[] f9546b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public EGLDisplay f9547c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public EGLContext f9548d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public EGLSurface f9549e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public SurfaceTexture f9550f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.a$a */
    public interface a {
    }

    public RunnableC2055a(Handler handler, @Nullable a aVar) {
        this.f9545a = handler;
        this.f9546b = new int[1];
    }

    /* JADX INFO: renamed from: a */
    public static EGLConfig m12152a(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f9544g, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.m12130c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, vck0.m197793D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    /* JADX INFO: renamed from: b */
    public static EGLContext m12153b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.m12130c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    /* JADX INFO: renamed from: c */
    public static EGLSurface m12154c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.m12130c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.m12130c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    /* JADX INFO: renamed from: e */
    public static void m12155e(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.m12129b();
    }

    /* JADX INFO: renamed from: f */
    public static EGLDisplay m12156f() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.m12130c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.m12130c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    /* JADX INFO: renamed from: d */
    public final void m12157d() {
    }

    /* JADX INFO: renamed from: g */
    public SurfaceTexture m12158g() {
        return (SurfaceTexture) p11.m167011e(this.f9550f);
    }

    /* JADX INFO: renamed from: h */
    public void m12159h(int i) throws GlUtil.GlException {
        EGLDisplay eGLDisplayM12156f = m12156f();
        this.f9547c = eGLDisplayM12156f;
        EGLConfig eGLConfigM12152a = m12152a(eGLDisplayM12156f);
        EGLContext eGLContextM12153b = m12153b(this.f9547c, eGLConfigM12152a, i);
        this.f9548d = eGLContextM12153b;
        this.f9549e = m12154c(this.f9547c, eGLConfigM12152a, eGLContextM12153b, i);
        m12155e(this.f9546b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9546b[0]);
        this.f9550f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m12160i() {
        this.f9545a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f9550f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f9546b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f9547c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f9547c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f9549e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9547c, this.f9549e);
            }
            EGLContext eGLContext = this.f9548d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f9547c, eGLContext);
            }
            if (vck0.f180948a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f9547c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f9547c);
            }
            this.f9547c = null;
            this.f9548d = null;
            this.f9549e = null;
            this.f9550f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9545a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m12157d();
        SurfaceTexture surfaceTexture = this.f9550f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC2055a(Handler handler) {
        this(handler, null);
    }
}
