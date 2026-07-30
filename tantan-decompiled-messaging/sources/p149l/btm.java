package p149l;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* JADX INFO: loaded from: classes8.dex */
public class btm {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f77244a;

    /* JADX INFO: renamed from: b */
    public EGLContext f77245b;

    /* JADX INFO: renamed from: c */
    public EGLSurface f77246c;

    /* JADX INFO: renamed from: d */
    public Surface f77247d;

    public btm(Surface surface) {
        surface.getClass();
        this.f77247d = surface;
        m103866b();
    }

    /* JADX INFO: renamed from: a */
    public final void m103865a(String str) {
        boolean z = false;
        while (EGL14.eglGetError() != 12288) {
            z = true;
        }
        if (z) {
            upk0.m194883a("EGL error encountered (see log)");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m103866b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f77244a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            upk0.m194883a("unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f77244a = null;
            upk0.m194883a("unable to initialize EGL14");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f77244a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            upk0.m194883a("unable to find RGB888+recordable ES2 EGL config");
            return;
        }
        this.f77245b = EGL14.eglCreateContext(this.f77244a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        m103865a("eglCreateContext");
        if (this.f77245b == null) {
            upk0.m194883a("null context");
            return;
        }
        this.f77246c = EGL14.eglCreateWindowSurface(this.f77244a, eGLConfigArr[0], this.f77247d, new int[]{12344}, 0);
        m103865a("eglCreateWindowSurface");
        if (this.f77246c != null) {
            return;
        }
        upk0.m194883a("surface was null");
    }

    /* JADX INFO: renamed from: c */
    public void m103867c() {
        EGLDisplay eGLDisplay = this.f77244a;
        EGLSurface eGLSurface = this.f77246c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f77245b)) {
            return;
        }
        upk0.m194883a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: d */
    public void m103868d() {
        if (EGL14.eglGetCurrentContext().equals(this.f77245b)) {
            EGLDisplay eGLDisplay = this.f77244a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f77244a, this.f77246c);
        EGL14.eglDestroyContext(this.f77244a, this.f77245b);
        this.f77247d.release();
        this.f77244a = null;
        this.f77245b = null;
        this.f77246c = null;
        this.f77247d = null;
    }

    /* JADX INFO: renamed from: e */
    public void m103869e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f77244a, this.f77246c, j);
    }

    /* JADX INFO: renamed from: f */
    public boolean m103870f() {
        return EGL14.eglSwapBuffers(this.f77244a, this.f77246c);
    }
}
