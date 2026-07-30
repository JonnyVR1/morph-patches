package p153l;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes8.dex */
public class cvm {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f84014a;

    /* JADX INFO: renamed from: b */
    public EGLContext f84015b;

    /* JADX INFO: renamed from: c */
    public EGLSurface f84016c;

    /* JADX INFO: renamed from: d */
    public Surface f84017d;

    public cvm(Surface surface) {
        surface.getClass();
        this.f84017d = surface;
        m112815b();
    }

    /* JADX INFO: renamed from: a */
    public final void m112814a(String str) {
        boolean z = false;
        while (EGL14.eglGetError() != 12288) {
            z = true;
        }
        if (z) {
            azk0.m101074a("EGL error encountered (see log)");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m112815b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f84014a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            azk0.m101074a("unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f84014a = null;
            azk0.m101074a("unable to initialize EGL14");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f84014a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            azk0.m101074a("unable to find RGB888+recordable ES2 EGL config");
            return;
        }
        this.f84015b = EGL14.eglCreateContext(this.f84014a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        m112814a("eglCreateContext");
        if (this.f84015b == null) {
            azk0.m101074a("null context");
            return;
        }
        this.f84016c = EGL14.eglCreateWindowSurface(this.f84014a, eGLConfigArr[0], this.f84017d, new int[]{12344}, 0);
        m112814a("eglCreateWindowSurface");
        if (this.f84016c != null) {
            return;
        }
        azk0.m101074a("surface was null");
    }

    /* JADX INFO: renamed from: c */
    public void m112816c() {
        EGLDisplay eGLDisplay = this.f84014a;
        EGLSurface eGLSurface = this.f84016c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f84015b)) {
            return;
        }
        azk0.m101074a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: d */
    public void m112817d() {
        if (EGL14.eglGetCurrentContext().equals(this.f84015b)) {
            EGLDisplay eGLDisplay = this.f84014a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f84014a, this.f84016c);
        EGL14.eglDestroyContext(this.f84014a, this.f84015b);
        this.f84017d.release();
        this.f84014a = null;
        this.f84015b = null;
        this.f84016c = null;
        this.f84017d = null;
    }

    /* JADX INFO: renamed from: e */
    public void m112818e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f84014a, this.f84016c, j);
    }

    /* JADX INFO: renamed from: f */
    public boolean m112819f() {
        return EGL14.eglSwapBuffers(this.f84014a, this.f84016c);
    }
}
