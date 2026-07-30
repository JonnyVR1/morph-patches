package p149l;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;

/* JADX INFO: loaded from: classes7.dex */
public class rie {

    /* JADX INFO: renamed from: a */
    private final String f159540a;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f159541b;

    /* JADX INFO: renamed from: c */
    public EGLContext f159542c;

    /* JADX INFO: renamed from: d */
    public EGLConfig f159543d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f159544e;

    /* JADX INFO: renamed from: f */
    public int f159545f;

    /* JADX INFO: renamed from: g */
    public boolean f159546g;

    public rie() {
        this.f159540a = "EGL14Wrapper";
        this.f159545f = 3;
        this.f159546g = false;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public void m179496a() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f159541b = eGLDisplayEglGetDisplay;
        if (EGL14.EGL_NO_DISPLAY == eGLDisplayEglGetDisplay) {
            o5d0.m162778a("eglGetDisplay,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        vpe.m199230a("EGL14Wrapper", "eglGetDisplay");
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f159541b, iArr, 0, iArr, 1)) {
            o5d0.m162778a("eglInitialize,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        vpe.m199230a("EGL14Wrapper", "eglInitialize");
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f159541b, this.f159546g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            o5d0.m162778a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        vpe.m199230a("EGL14Wrapper", "eglChooseConfig");
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f159543d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f159541b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f159542c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            o5d0.m162778a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        vpe.m199230a("EGL14Wrapper", "eglCreateContext");
        EGL14.eglQueryContext(this.f159541b, this.f159542c, 12440, new int[1], 0);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f159541b, this.f159543d, iArr3, 0);
        this.f159544e = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface == null || EGL14.EGL_NO_SURFACE == eGLSurfaceEglCreatePbufferSurface) {
            o5d0.m162778a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        } else {
            vpe.m199230a("EGL14Wrapper", "eglCreatePbufferSurface");
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public void m179497b(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f159541b = eGLDisplayEglGetDisplay;
        if (EGL14.EGL_NO_DISPLAY == eGLDisplayEglGetDisplay) {
            o5d0.m162778a("eglGetDisplay,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            o5d0.m162778a("eglInitialize,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f159541b, this.f159546g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            o5d0.m162778a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f159543d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f159541b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f159542c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            o5d0.m162778a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f159541b, eGLContextEglCreateContext, 12440, new int[1], 0);
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f159541b, this.f159543d, obj, iArr3, 0);
        this.f159544e = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == null || EGL14.EGL_NO_SURFACE == eGLSurfaceEglCreateWindowSurface) {
            o5d0.m162778a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: c */
    public int m179498c() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f159541b;
        if (eGLDisplay != null && (eGLSurface = this.f159544e) != null && this.f159542c != null) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    public int m179499d() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f159541b;
        if (eGLDisplay != null && (eGLSurface = this.f159544e) != null && this.f159542c != null) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: e */
    public boolean m179500e() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplay = this.f159541b;
        if (eGLDisplay == null || (eGLSurface = this.f159544e) == null || (eGLContext = this.f159542c) == null) {
            return false;
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return true;
        }
        o5d0.m162778a("eglMakeCurrent,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        return false;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: f */
    public void m179501f() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplay = this.f159541b;
        if (eGLDisplay != null && (eGLSurface = this.f159544e) != null && (eGLContext = this.f159542c) != null) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            EGL14.eglDestroySurface(this.f159541b, this.f159544e);
            EGL14.eglDestroyContext(this.f159541b, this.f159542c);
            EGL14.eglTerminate(this.f159541b);
        }
        EGLDisplay eGLDisplay2 = this.f159541b;
        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    public void m179502g() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f159541b;
        if (eGLDisplay == null || (eGLSurface = this.f159544e) == null || EGL14.eglSwapBuffers(eGLDisplay, eGLSurface)) {
            return;
        }
        upk0.m194883a("eglSwapBuffers,failed!");
    }

    public rie(boolean z) {
        this.f159540a = "EGL14Wrapper";
        this.f159545f = 3;
        this.f159546g = z;
    }
}
