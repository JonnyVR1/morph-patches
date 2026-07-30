package com.tencent.liteav.basic.p093c;

import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14172b {

    /* JADX INFO: renamed from: a */
    public static final String f58931a = "b";

    /* JADX INFO: renamed from: l */
    private static int[] f58932l = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* JADX INFO: renamed from: m */
    private static int[] f58933m = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: b */
    private EGL10 f58934b;

    /* JADX INFO: renamed from: c */
    private EGLDisplay f58935c;

    /* JADX INFO: renamed from: d */
    private EGLConfig f58936d;

    /* JADX INFO: renamed from: e */
    private boolean f58937e;

    /* JADX INFO: renamed from: f */
    private EGLContext f58938f;

    /* JADX INFO: renamed from: g */
    private boolean f58939g;

    /* JADX INFO: renamed from: h */
    private EGLSurface f58940h;

    /* JADX INFO: renamed from: i */
    private int f58941i = 0;

    /* JADX INFO: renamed from: j */
    private int f58942j = 0;

    /* JADX INFO: renamed from: k */
    private int[] f58943k = new int[2];

    private C14172b() {
    }

    /* JADX INFO: renamed from: a */
    private boolean m83900a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f58934b = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f58935c = eGLDisplayEglGetDisplay;
        this.f58934b.eglInitialize(eGLDisplayEglGetDisplay, this.f58943k);
        if (eGLConfig == null) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            this.f58934b.eglChooseConfig(this.f58935c, surface == null ? f58932l : f58933m, eGLConfigArr, 1, new int[1]);
            this.f58936d = eGLConfigArr[0];
            this.f58937e = true;
        } else {
            this.f58936d = eGLConfig;
        }
        if (eGLContext != null) {
            this.f58939g = true;
        }
        try {
            this.f58938f = m83899a(this.f58935c, this.f58936d, 2, eGLContext);
        } catch (C14174d unused) {
            TXCLog.m84152i(f58931a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f58938f = m83899a(this.f58935c, this.f58936d, 3, eGLContext);
            } catch (C14174d e) {
                TXCLog.m84149e(f58931a, "failed to create EGLContext of 3.0. " + e);
                return false;
            }
        }
        int[] iArr = {12375, this.f58941i, 12374, this.f58942j, 12344};
        EGL10 egl11 = this.f58934b;
        if (surface == null) {
            this.f58940h = egl11.eglCreatePbufferSurface(this.f58935c, this.f58936d, iArr);
        } else {
            this.f58940h = egl11.eglCreateWindowSurface(this.f58935c, this.f58936d, surface, null);
        }
        EGLSurface eGLSurface = this.f58940h;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            m83906e();
            return false;
        }
        if (this.f58934b.eglMakeCurrent(this.f58935c, eGLSurface, eGLSurface, this.f58938f)) {
            return true;
        }
        m83906e();
        return false;
    }

    /* JADX INFO: renamed from: f */
    private void m83901f() throws C14174d {
        int iEglGetError = this.f58934b.eglGetError();
        if (iEglGetError != 12288) {
            throw new C14174d(iEglGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83903b() {
        EGL10 egl10 = this.f58934b;
        EGLDisplay eGLDisplay = this.f58935c;
        EGLSurface eGLSurface = this.f58940h;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58938f);
        m83906e();
    }

    /* JADX INFO: renamed from: c */
    public void m83904c() {
        EGL10 egl10 = this.f58934b;
        EGLDisplay eGLDisplay = this.f58935c;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        EGLSurface eGLSurface2 = this.f58940h;
        if (eGLSurface2 != null) {
            this.f58934b.eglDestroySurface(this.f58935c, eGLSurface2);
        }
        EGLContext eGLContext = this.f58938f;
        if (eGLContext != null) {
            this.f58934b.eglDestroyContext(this.f58935c, eGLContext);
        }
        this.f58934b.eglTerminate(this.f58935c);
        m83906e();
        this.f58940h = null;
        this.f58935c = null;
    }

    /* JADX INFO: renamed from: d */
    public EGLContext m83905d() {
        return this.f58938f;
    }

    /* JADX INFO: renamed from: e */
    public void m83906e() {
        int iEglGetError = this.f58934b.eglGetError();
        if (iEglGetError != 12288) {
            TXCLog.m84149e(f58931a, "EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m83902a() {
        boolean zEglSwapBuffers = this.f58934b.eglSwapBuffers(this.f58935c, this.f58940h);
        m83906e();
        return zEglSwapBuffers;
    }

    /* JADX INFO: renamed from: a */
    public static C14172b m83898a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i, int i2) {
        C14172b c14172b = new C14172b();
        c14172b.f58941i = i;
        c14172b.f58942j = i2;
        if (c14172b.m83900a(eGLConfig, eGLContext, surface)) {
            return c14172b;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private EGLContext m83899a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) throws C14174d {
        int[] iArr = {12440, i, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.f58934b.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        m83901f();
        return eGLContextEglCreateContext;
    }
}
