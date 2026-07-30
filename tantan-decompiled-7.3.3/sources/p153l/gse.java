package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes8.dex */
public final class gse {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f106269a;

    /* JADX INFO: renamed from: b */
    public EGLContext f106270b;

    /* JADX INFO: renamed from: c */
    public EGLConfig f106271c;

    /* JADX INFO: renamed from: d */
    public int f106272d;

    public gse(EGLContext eGLContext, int i) {
        EGLConfig eGLConfigM132030c;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.f106269a = eGLDisplay;
        this.f106270b = EGL14.EGL_NO_CONTEXT;
        this.f106271c = null;
        this.f106272d = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            azk0.m101074a("EGL already set up");
            throw null;
        }
        eGLContext = eGLContext == null ? EGL14.EGL_NO_CONTEXT : eGLContext;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f106269a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            azk0.m101074a("unable to get EGL14 display");
            throw null;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f106269a = null;
            azk0.m101074a("unable to initialize EGL14");
            throw null;
        }
        if ((i & 2) != 0 && (eGLConfigM132030c = m132030c(i, 3)) != null) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f106269a, eGLConfigM132030c, eGLContext, new int[]{12440, 3, 12344}, 0);
            if (EGL14.eglGetError() == 12288) {
                this.f106271c = eGLConfigM132030c;
                this.f106270b = eGLContextEglCreateContext;
                this.f106272d = 3;
            }
        }
        if (this.f106270b == EGL14.EGL_NO_CONTEXT) {
            EGLConfig eGLConfigM132030c2 = m132030c(i, 2);
            if (eGLConfigM132030c2 == null) {
                azk0.m101074a("Unable to find a suitable EGLConfig");
                throw null;
            }
            EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(this.f106269a, eGLConfigM132030c2, eGLContext, new int[]{12440, 2, 12344}, 0);
            m132028a("eglCreateContext");
            this.f106271c = eGLConfigM132030c2;
            this.f106270b = eGLContextEglCreateContext2;
            this.f106272d = 2;
        }
        EGL14.eglQueryContext(this.f106269a, this.f106270b, 12440, new int[1], 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m132028a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    /* JADX INFO: renamed from: b */
    public EGLSurface m132029b(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            mce.m157919a("invalid surface: ", obj);
            return null;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f106269a, this.f106271c, obj, new int[]{12344}, 0);
        m132028a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        azk0.m101074a("surface was null");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final EGLConfig m132030c(int i, int i2) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i2 >= 3 ? 68 : 4, 12344, 0, 12344};
        if ((i & 1) != 0) {
            iArr[10] = 12610;
            iArr[11] = 1;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(this.f106269a, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m132031d(EGLSurface eGLSurface) {
        if (EGL14.eglMakeCurrent(this.f106269a, eGLSurface, eGLSurface, this.f106270b)) {
            return;
        }
        m132028a("eglMakeCurrent error");
        azk0.m101074a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: e */
    public void m132032e() {
        EGLDisplay eGLDisplay = this.f106269a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.f106269a, this.f106270b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f106269a);
        }
        this.f106269a = EGL14.EGL_NO_DISPLAY;
        this.f106270b = EGL14.EGL_NO_CONTEXT;
        this.f106271c = null;
    }

    /* JADX INFO: renamed from: f */
    public void m132033f(EGLSurface eGLSurface, long j) {
        EGLExt.eglPresentationTimeANDROID(this.f106269a, eGLSurface, j);
    }

    public void finalize() throws Throwable {
        try {
            if (this.f106269a != EGL14.EGL_NO_DISPLAY) {
                m132032e();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m132034g(EGLSurface eGLSurface) {
        return EGL14.eglSwapBuffers(this.f106269a, eGLSurface);
    }

    public gse() {
        this(null, 0);
    }
}
