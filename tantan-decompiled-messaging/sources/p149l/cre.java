package p149l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes8.dex */
public final class cre {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f82208a;

    /* JADX INFO: renamed from: b */
    public EGLContext f82209b;

    /* JADX INFO: renamed from: c */
    public EGLConfig f82210c;

    /* JADX INFO: renamed from: d */
    public int f82211d;

    public cre(EGLContext eGLContext, int i) {
        EGLConfig eGLConfigM108357c;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f82208a = eGLDisplay;
        this.f82209b = EGL14.EGL_NO_CONTEXT;
        this.f82210c = null;
        this.f82211d = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            upk0.m194883a("EGL already set up");
            throw null;
        }
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f82208a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            upk0.m194883a("unable to get EGL14 display");
            throw null;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f82208a = null;
            upk0.m194883a("unable to initialize EGL14");
            throw null;
        }
        if ((i & 2) != 0 && (eGLConfigM108357c = m108357c(i, 3)) != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f82208a, eGLConfigM108357c, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f82210c = eGLConfigM108357c;
                this.f82209b = eGLContextEglCreateContext;
                this.f82211d = 3;
            }
        }
        if (this.f82209b == EGL14.EGL_NO_CONTEXT) {
            EGLConfig eGLConfigM108357c2 = m108357c(i, 2);
            if (eGLConfigM108357c2 == null) {
                upk0.m194883a("Unable to find a suitable EGLConfig");
                throw null;
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.f82208a, eGLConfigM108357c2, eGLContext, new int[]{12440, 2, 12344}, 0);
            m108355a("eglCreateContext");
            this.f82210c = eGLConfigM108357c2;
            this.f82209b = eGLContextEglCreateContext2;
            this.f82211d = 2;
        }
        EGL14.eglQueryContext(this.f82208a, this.f82209b, 12440, new int[1], 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m108355a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    /* JADX INFO: renamed from: b */
    public EGLSurface m108356b(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            ibe.m135253a("invalid surface: ", obj);
            return null;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f82208a, this.f82210c, obj, new int[]{12344}, 0);
        m108355a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        upk0.m194883a("surface was null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final EGLConfig m108357c(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f82208a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m108358d(EGLSurface eGLSurface) {
        if (EGL14.eglMakeCurrent(this.f82208a, eGLSurface, eGLSurface, this.f82209b)) {
            return;
        }
        m108355a("eglMakeCurrent error");
        upk0.m194883a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: e */
    public void m108359e() {
        EGLDisplay eGLDisplay = this.f82208a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f82208a, this.f82209b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f82208a);
        }
        this.f82208a = EGL14.EGL_NO_DISPLAY;
        this.f82209b = EGL14.EGL_NO_CONTEXT;
        this.f82210c = null;
    }

    /* JADX INFO: renamed from: f */
    public void m108360f(EGLSurface eGLSurface, long j) {
        EGLExt.eglPresentationTimeANDROID(this.f82208a, eGLSurface, j);
    }

    public void finalize() throws Throwable {
        try {
            if (this.f82208a != EGL14.EGL_NO_DISPLAY) {
                m108359e();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m108361g(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.f82208a, eGLSurface);
    }

    public cre() {
        this(null, 0);
    }
}
