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
import p153l.bmk0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.a */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(17)
@Deprecated
public final class RunnableC2078a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g */
    public static final int[] f9581g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a */
    public final Handler f9582a;

    /* JADX INFO: renamed from: b */
    public final int[] f9583b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public EGLDisplay f9584c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public EGLContext f9585d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public EGLSurface f9586e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public SurfaceTexture f9587f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.a$a */
    public interface a {
    }

    public RunnableC2078a(Handler handler, @Nullable a aVar) {
        this.f9582a = handler;
        this.f9583b = new int[1];
    }

    /* JADX INFO: renamed from: a */
    public static EGLConfig m12206a(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f9581g, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.m12184c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, bmk0.m105071D("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    /* JADX INFO: renamed from: b */
    public static EGLContext m12207b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.m12184c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    /* JADX INFO: renamed from: c */
    public static EGLSurface m12208c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.m12184c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.m12184c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    /* JADX INFO: renamed from: e */
    public static void m12209e(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.m12183b();
    }

    /* JADX INFO: renamed from: f */
    public static EGLDisplay m12210f() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.m12184c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.m12184c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    /* JADX INFO: renamed from: d */
    public final void m12211d() {
    }

    /* JADX INFO: renamed from: g */
    public SurfaceTexture m12212g() {
        return (SurfaceTexture) w11.m204369e(this.f9587f);
    }

    /* JADX INFO: renamed from: h */
    public void m12213h(int i) throws GlUtil.GlException {
        EGLDisplay eGLDisplayM12210f = m12210f();
        this.f9584c = eGLDisplayM12210f;
        EGLConfig eGLConfigM12206a = m12206a(eGLDisplayM12210f);
        EGLContext eGLContextM12207b = m12207b(this.f9584c, eGLConfigM12206a, i);
        this.f9585d = eGLContextM12207b;
        this.f9586e = m12208c(this.f9584c, eGLConfigM12206a, eGLContextM12207b, i);
        m12209e(this.f9583b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9583b[0]);
        this.f9587f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public void m12214i() {
        this.f9582a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f9587f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f9583b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f9584c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f9584c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f9586e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9584c, this.f9586e);
            }
            EGLContext eGLContext = this.f9585d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f9584c, eGLContext);
            }
            if (bmk0.f77313a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f9584c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f9584c);
            }
            this.f9584c = null;
            this.f9585d = null;
            this.f9586e = null;
            this.f9587f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9582a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m12211d();
        SurfaceTexture surfaceTexture = this.f9587f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC2078a(Handler handler) {
        this(handler, null);
    }
}
