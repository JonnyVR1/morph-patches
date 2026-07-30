package p007l;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.momo.rtcbase.EglBase;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class btm {

    /* JADX INFO: renamed from: a */
    public EGLDisplay f2343a;

    /* JADX INFO: renamed from: b */
    public EGLContext f2344b;

    /* JADX INFO: renamed from: c */
    public EGLSurface f2345c;

    /* JADX INFO: renamed from: d */
    public Surface f2346d;

    public btm(Surface surface) {
        surface.getClass();
        this.f2346d = surface;
        m8686b();
    }

    /* JADX INFO: renamed from: a */
    public final void m8685a(String str) {
        boolean z = false;
        while (EGL14.eglGetError() != 12288) {
            z = true;
        }
        if (z) {
            upk0.a("EGL error encountered (see log)");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8686b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f2343a = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            upk0.a("unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            this.f2343a = null;
            upk0.a("unable to initialize EGL14");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f2343a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            upk0.a("unable to find RGB888+recordable ES2 EGL config");
            return;
        }
        this.f2344b = EGL14.eglCreateContext(this.f2343a, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        m8685a("eglCreateContext");
        if (this.f2344b == null) {
            upk0.a("null context");
            return;
        }
        this.f2345c = EGL14.eglCreateWindowSurface(this.f2343a, eGLConfigArr[0], this.f2346d, new int[]{12344}, 0);
        m8685a("eglCreateWindowSurface");
        if (this.f2345c != null) {
            return;
        }
        upk0.a("surface was null");
    }

    /* JADX INFO: renamed from: c */
    public void m8687c() {
        EGLDisplay eGLDisplay = this.f2343a;
        EGLSurface eGLSurface = this.f2345c;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f2344b)) {
            return;
        }
        upk0.a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: d */
    public void m8688d() {
        if (EGL14.eglGetCurrentContext().equals(this.f2344b)) {
            EGLDisplay eGLDisplay = this.f2343a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f2343a, this.f2345c);
        EGL14.eglDestroyContext(this.f2343a, this.f2344b);
        this.f2346d.release();
        this.f2343a = null;
        this.f2344b = null;
        this.f2345c = null;
        this.f2346d = null;
    }

    /* JADX INFO: renamed from: e */
    public void m8689e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f2343a, this.f2345c, j);
    }

    /* JADX INFO: renamed from: f */
    public boolean m8690f() {
        return EGL14.eglSwapBuffers(this.f2343a, this.f2345c);
    }
}
