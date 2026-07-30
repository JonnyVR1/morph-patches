package com.tencent.liteav.beauty.p091a.p092a;

import com.tencent.liteav.basic.log.TXCLog;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGL11;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p149l.upk0;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14058a {

    /* JADX INFO: renamed from: a */
    private EGL10 f58560a;

    /* JADX INFO: renamed from: b */
    private final EGLContext f58561b;

    /* JADX INFO: renamed from: c */
    private EGLDisplay f58562c;

    /* JADX INFO: renamed from: d */
    private EGLConfig f58563d;

    /* JADX INFO: renamed from: e */
    private EGLSurface f58564e;

    public C14058a(EGLConfig eGLConfig) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f58560a = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f58562c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            upk0.m194883a("unable to get EGL10 display");
            throw null;
        }
        if (!this.f58560a.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            this.f58562c = null;
            upk0.m194883a("unable to initialize EGL10");
            throw null;
        }
        if (eGLConfig != null) {
            this.f58563d = eGLConfig;
        } else {
            this.f58563d = m83076b();
        }
        this.f58561b = this.f58560a.eglCreateContext(this.f58562c, this.f58563d, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    /* JADX INFO: renamed from: a */
    private void m83075a(String str) {
        int iEglGetError = this.f58560a.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    /* JADX INFO: renamed from: b */
    private EGLConfig m83076b() {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (this.f58560a.eglChooseConfig(this.f58562c, new int[]{12339, 1, 12325, 16, 12326, 0, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
            return eGLConfigArr[0];
        }
        TXCLog.m82973w("ImageEglSurface", "unable to find RGB8888  EGLConfig");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m83080b(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.f58562c;
        if (eGLDisplay == EGL11.EGL_NO_DISPLAY) {
            TXCLog.m82969i("EglCore", "NOTE: makeCurrent w/o display");
        }
        if (this.f58560a.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58561b)) {
            return;
        }
        upk0.m194883a("eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: a */
    public void m83079a(EGLSurface eGLSurface) {
        this.f58560a.eglDestroySurface(this.f58562c, eGLSurface);
    }

    /* JADX INFO: renamed from: a */
    public EGLSurface m83077a(int i, int i2) {
        this.f58564e = this.f58560a.eglCreatePbufferSurface(this.f58562c, this.f58563d, new int[]{12375, i, 12374, i2, 12344});
        m83075a("eglCreatePbufferSurface");
        EGLSurface eGLSurface = this.f58564e;
        if (eGLSurface != null) {
            return eGLSurface;
        }
        upk0.m194883a("surface was null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m83078a() {
        EGL10 egl10 = this.f58560a;
        EGLDisplay eGLDisplay = this.f58562c;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f58560a.eglDestroyContext(this.f58562c, this.f58561b);
        this.f58560a.eglTerminate(this.f58562c);
    }

    public C14058a() {
        this(null);
    }
}
