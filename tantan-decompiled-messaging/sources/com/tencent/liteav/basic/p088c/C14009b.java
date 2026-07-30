package com.tencent.liteav.basic.p088c;

import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14009b {

    /* JADX INFO: renamed from: a */
    public static final String f58083a = "b";

    /* JADX INFO: renamed from: l */
    private static int[] f58084l = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* JADX INFO: renamed from: m */
    private static int[] f58085m = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: b */
    private EGL10 f58086b;

    /* JADX INFO: renamed from: c */
    private EGLDisplay f58087c;

    /* JADX INFO: renamed from: d */
    private EGLConfig f58088d;

    /* JADX INFO: renamed from: e */
    private boolean f58089e;

    /* JADX INFO: renamed from: f */
    private EGLContext f58090f;

    /* JADX INFO: renamed from: g */
    private boolean f58091g;

    /* JADX INFO: renamed from: h */
    private EGLSurface f58092h;

    /* JADX INFO: renamed from: i */
    private int f58093i = 0;

    /* JADX INFO: renamed from: j */
    private int f58094j = 0;

    /* JADX INFO: renamed from: k */
    private int[] f58095k = new int[2];

    private C14009b() {
    }

    /* JADX INFO: renamed from: a */
    private boolean m82717a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f58086b = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f58087c = eGLDisplayEglGetDisplay;
        this.f58086b.eglInitialize(eGLDisplayEglGetDisplay, this.f58095k);
        if (eGLConfig == null) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            this.f58086b.eglChooseConfig(this.f58087c, surface == null ? f58084l : f58085m, eGLConfigArr, 1, new int[1]);
            this.f58088d = eGLConfigArr[0];
            this.f58089e = true;
        } else {
            this.f58088d = eGLConfig;
        }
        if (eGLContext != null) {
            this.f58091g = true;
        }
        try {
            this.f58090f = m82716a(this.f58087c, this.f58088d, 2, eGLContext);
        } catch (C14011d unused) {
            TXCLog.m82969i(f58083a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f58090f = m82716a(this.f58087c, this.f58088d, 3, eGLContext);
            } catch (C14011d e) {
                TXCLog.m82966e(f58083a, "failed to create EGLContext of 3.0. " + e);
                return false;
            }
        }
        int[] iArr = {12375, this.f58093i, 12374, this.f58094j, 12344};
        EGL10 egl11 = this.f58086b;
        if (surface == null) {
            this.f58092h = egl11.eglCreatePbufferSurface(this.f58087c, this.f58088d, iArr);
        } else {
            this.f58092h = egl11.eglCreateWindowSurface(this.f58087c, this.f58088d, surface, null);
        }
        EGLSurface eGLSurface = this.f58092h;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            m82723e();
            return false;
        }
        if (this.f58086b.eglMakeCurrent(this.f58087c, eGLSurface, eGLSurface, this.f58090f)) {
            return true;
        }
        m82723e();
        return false;
    }

    /* JADX INFO: renamed from: f */
    private void m82718f() throws C14011d {
        int iEglGetError = this.f58086b.eglGetError();
        if (iEglGetError != 12288) {
            throw new C14011d(iEglGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82720b() {
        EGL10 egl10 = this.f58086b;
        EGLDisplay eGLDisplay = this.f58087c;
        EGLSurface eGLSurface = this.f58092h;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58090f);
        m82723e();
    }

    /* JADX INFO: renamed from: c */
    public void m82721c() {
        EGL10 egl10 = this.f58086b;
        EGLDisplay eGLDisplay = this.f58087c;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        EGLSurface eGLSurface2 = this.f58092h;
        if (eGLSurface2 != null) {
            this.f58086b.eglDestroySurface(this.f58087c, eGLSurface2);
        }
        EGLContext eGLContext = this.f58090f;
        if (eGLContext != null) {
            this.f58086b.eglDestroyContext(this.f58087c, eGLContext);
        }
        this.f58086b.eglTerminate(this.f58087c);
        m82723e();
        this.f58092h = null;
        this.f58087c = null;
    }

    /* JADX INFO: renamed from: d */
    public EGLContext m82722d() {
        return this.f58090f;
    }

    /* JADX INFO: renamed from: e */
    public void m82723e() {
        int iEglGetError = this.f58086b.eglGetError();
        if (iEglGetError != 12288) {
            TXCLog.m82966e(f58083a, "EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m82719a() {
        boolean zEglSwapBuffers = this.f58086b.eglSwapBuffers(this.f58087c, this.f58092h);
        m82723e();
        return zEglSwapBuffers;
    }

    /* JADX INFO: renamed from: a */
    public static C14009b m82715a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i, int i2) {
        C14009b c14009b = new C14009b();
        c14009b.f58093i = i;
        c14009b.f58094j = i2;
        if (c14009b.m82717a(eGLConfig, eGLContext, surface)) {
            return c14009b;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private EGLContext m82716a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) throws C14011d {
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.f58086b.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        m82718f();
        return eGLContextEglCreateContext;
    }
}
