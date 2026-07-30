package p153l;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLUtils;

/* JADX INFO: loaded from: classes7.dex */
public class vje {

    /* JADX INFO: renamed from: a */
    private final String f184376a;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f184377b;

    /* JADX INFO: renamed from: c */
    public EGLContext f184378c;

    /* JADX INFO: renamed from: d */
    public EGLConfig f184379d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f184380e;

    /* JADX INFO: renamed from: f */
    public int f184381f;

    /* JADX INFO: renamed from: g */
    public boolean f184382g;

    public vje() {
        this.f184376a = "EGL14Wrapper";
        this.f184381f = 3;
        this.f184382g = false;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public void m201497a() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f184377b = eGLDisplayEglGetDisplay;
        if (EGL14.EGL_NO_DISPLAY == eGLDisplayEglGetDisplay) {
            rdd0.m180845a("eglGetDisplay,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        zqe.m221010a("EGL14Wrapper", "eglGetDisplay");
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f184377b, iArr, 0, iArr, 1)) {
            rdd0.m180845a("eglInitialize,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        zqe.m221010a("EGL14Wrapper", "eglInitialize");
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f184377b, this.f184382g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        zqe.m221010a("EGL14Wrapper", "eglChooseConfig");
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f184379d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f184377b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f184378c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        zqe.m221010a("EGL14Wrapper", "eglCreateContext");
        EGL14.eglQueryContext(this.f184377b, this.f184378c, 12440, new int[1], 0);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f184377b, this.f184379d, iArr3, 0);
        this.f184380e = eGLSurfaceEglCreatePbufferSurface;
        if (eGLSurfaceEglCreatePbufferSurface == null || EGL14.EGL_NO_SURFACE == eGLSurfaceEglCreatePbufferSurface) {
            rdd0.m180845a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        } else {
            zqe.m221010a("EGL14Wrapper", "eglCreatePbufferSurface");
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public void m201498b(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f184377b = eGLDisplayEglGetDisplay;
        if (EGL14.EGL_NO_DISPLAY == eGLDisplayEglGetDisplay) {
            rdd0.m180845a("eglGetDisplay,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            rdd0.m180845a("eglInitialize,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f184377b, this.f184382g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f184379d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f184377b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f184378c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f184377b, eGLContextEglCreateContext, 12440, new int[1], 0);
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f184377b, this.f184379d, obj, iArr3, 0);
        this.f184380e = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == null || EGL14.EGL_NO_SURFACE == eGLSurfaceEglCreateWindowSurface) {
            rdd0.m180845a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: c */
    public int m201499c() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f184377b;
        if (eGLDisplay != null && (eGLSurface = this.f184380e) != null && this.f184378c != null) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    public int m201500d() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f184377b;
        if (eGLDisplay != null && (eGLSurface = this.f184380e) != null && this.f184378c != null) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: e */
    public boolean m201501e() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplay = this.f184377b;
        if (eGLDisplay == null || (eGLSurface = this.f184380e) == null || (eGLContext = this.f184378c) == null) {
            return false;
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return true;
        }
        rdd0.m180845a("eglMakeCurrent,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        return false;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: f */
    public void m201502f() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplay = this.f184377b;
        if (eGLDisplay != null && (eGLSurface = this.f184380e) != null && (eGLContext = this.f184378c) != null) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            EGL14.eglDestroySurface(this.f184377b, this.f184380e);
            EGL14.eglDestroyContext(this.f184377b, this.f184378c);
            EGL14.eglTerminate(this.f184377b);
        }
        EGLDisplay eGLDisplay2 = this.f184377b;
        EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    public void m201503g() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f184377b;
        if (eGLDisplay == null || (eGLSurface = this.f184380e) == null || EGL14.eglSwapBuffers(eGLDisplay, eGLSurface)) {
            return;
        }
        azk0.m101074a("eglSwapBuffers,failed!");
    }

    public vje(boolean z) {
        this.f184376a = "EGL14Wrapper";
        this.f184381f = 3;
        this.f184382g = z;
    }
}
