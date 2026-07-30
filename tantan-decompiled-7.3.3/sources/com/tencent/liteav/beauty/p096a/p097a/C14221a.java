package com.tencent.liteav.beauty.p096a.p097a;

import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p153l.azk0;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14221a {

    /* JADX INFO: renamed from: a */
    private EGL10 f59408a;

    /* JADX INFO: renamed from: b */
    private final EGLContext f59409b;

    /* JADX INFO: renamed from: c */
    private EGLDisplay f59410c;

    /* JADX INFO: renamed from: d */
    private EGLConfig f59411d;

    /* JADX INFO: renamed from: e */
    private EGLSurface f59412e;

    public C14221a(EGLConfig eGLConfig) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f59408a = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f59410c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            azk0.m101074a("unable to get EGL10 display");
            throw null;
        }
        if (!this.f59408a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            this.f59410c = null;
            azk0.m101074a("unable to initialize EGL10");
            throw null;
        }
        if (eGLConfig != null) {
            this.f59411d = eGLConfig;
        } else {
            this.f59411d = m84259b();
        }
        this.f59409b = this.f59408a.eglCreateContext(this.f59410c, this.f59411d, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    /* JADX INFO: renamed from: a */
    private void m84258a(String str) {
        int iEglGetError = this.f59408a.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    /* JADX INFO: renamed from: b */
    private EGLConfig m84259b() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (this.f59408a.eglChooseConfig(this.f59410c, new int[]{12339, 1, 12325, 16, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
            return eGLConfigArr[0];
        }
        TXCLog.m84156w("ImageEglSurface", "unable to find RGB8888  EGLConfig");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m84263b(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.f59410c;
        if (eGLDisplay == EGL11.EGL_NO_DISPLAY) {
            TXCLog.m84152i("EglCore", "NOTE: makeCurrent w/o display");
        }
        if (this.f59408a.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f59409b)) {
            return;
        }
        azk0.m101074a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: a */
    public void m84262a(EGLSurface eGLSurface) {
        this.f59408a.eglDestroySurface(this.f59410c, eGLSurface);
    }

    /* JADX INFO: renamed from: a */
    public EGLSurface m84260a(int i, int i2) {
        this.f59412e = this.f59408a.eglCreatePbufferSurface(this.f59410c, this.f59411d, new int[]{12375, i, 12374, i2, 12344});
        m84258a("eglCreatePbufferSurface");
        EGLSurface eGLSurface = this.f59412e;
        if (eGLSurface != null) {
            return eGLSurface;
        }
        azk0.m101074a("surface was null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m84261a() {
        EGL10 egl10 = this.f59408a;
        EGLDisplay eGLDisplay = this.f59410c;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f59408a.eglDestroyContext(this.f59410c, this.f59409b);
        this.f59408a.eglTerminate(this.f59410c);
    }

    public C14221a() {
        this(null);
    }
}
