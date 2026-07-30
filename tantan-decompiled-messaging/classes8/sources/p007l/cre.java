package p007l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import l.ibe;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class cre {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f2473a;

    /* JADX INFO: renamed from: b */
    public EGLContext f2474b;

    /* JADX INFO: renamed from: c */
    public EGLConfig f2475c;

    /* JADX INFO: renamed from: d */
    public int f2476d;

    public cre(EGLContext eGLContext, int i) {
        EGLConfig eGLConfigM8793c;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f2473a = eGLDisplay;
        this.f2474b = EGL14.EGL_NO_CONTEXT;
        this.f2475c = null;
        this.f2476d = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            upk0.a("EGL already set up");
            throw null;
        }
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f2473a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            upk0.a("unable to get EGL14 display");
            throw null;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f2473a = null;
            upk0.a("unable to initialize EGL14");
            throw null;
        }
        if ((i & 2) != 0 && (eGLConfigM8793c = m8793c(i, 3)) != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f2473a, eGLConfigM8793c, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f2475c = eGLConfigM8793c;
                this.f2474b = eGLContextEglCreateContext;
                this.f2476d = 3;
            }
        }
        if (this.f2474b == EGL14.EGL_NO_CONTEXT) {
            EGLConfig eGLConfigM8793c2 = m8793c(i, 2);
            if (eGLConfigM8793c2 == null) {
                upk0.a("Unable to find a suitable EGLConfig");
                throw null;
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.f2473a, eGLConfigM8793c2, eGLContext, new int[]{12440, 2, 12344}, 0);
            m8791a("eglCreateContext");
            this.f2475c = eGLConfigM8793c2;
            this.f2474b = eGLContextEglCreateContext2;
            this.f2476d = 2;
        }
        EGL14.eglQueryContext(this.f2473a, this.f2474b, 12440, new int[1], 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m8791a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    /* JADX INFO: renamed from: b */
    public EGLSurface m8792b(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            ibe.a("invalid surface: ", obj);
            return null;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f2473a, this.f2475c, obj, new int[]{12344}, 0);
        m8791a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        upk0.a("surface was null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final EGLConfig m8793c(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f2473a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m8794d(EGLSurface eGLSurface) {
        if (EGL14.eglMakeCurrent(this.f2473a, eGLSurface, eGLSurface, this.f2474b)) {
            return;
        }
        m8791a("eglMakeCurrent error");
        upk0.a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: e */
    public void m8795e() {
        EGLDisplay eGLDisplay = this.f2473a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f2473a, this.f2474b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f2473a);
        }
        this.f2473a = EGL14.EGL_NO_DISPLAY;
        this.f2474b = EGL14.EGL_NO_CONTEXT;
        this.f2475c = null;
    }

    /* JADX INFO: renamed from: f */
    public void m8796f(EGLSurface eGLSurface, long j) {
        EGLExt.eglPresentationTimeANDROID(this.f2473a, eGLSurface, j);
    }

    public void finalize() throws Throwable {
        try {
            if (this.f2473a != EGL14.EGL_NO_DISPLAY) {
                m8795e();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m8797g(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.f2473a, eGLSurface);
    }

    public cre() {
        this(null, 0);
    }
}
