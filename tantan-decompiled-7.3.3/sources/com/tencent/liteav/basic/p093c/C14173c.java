package com.tencent.liteav.basic.p093c;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.tencent.liteav.basic.log.TXCLog;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.c */
/* JADX INFO: loaded from: classes2.dex */
@TargetApi(17)
public class C14173c {

    /* JADX INFO: renamed from: a */
    private static int f58944a = 2;

    /* JADX INFO: renamed from: b */
    private static final String f58945b = "c";

    /* JADX INFO: renamed from: k */
    private static int[] f58946k;

    /* JADX INFO: renamed from: l */
    private static int[] f58947l;

    /* JADX INFO: renamed from: h */
    private boolean f58953h;

    /* JADX INFO: renamed from: i */
    private EGLSurface f58954i;

    /* JADX INFO: renamed from: c */
    private EGLDisplay f58948c = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: d */
    private EGLContext f58949d = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: e */
    private EGLConfig f58950e = null;

    /* JADX INFO: renamed from: f */
    private int f58951f = 0;

    /* JADX INFO: renamed from: g */
    private int f58952g = 0;

    /* JADX INFO: renamed from: j */
    private int f58955j = -1;

    static {
        int i = f58944a;
        f58946k = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i == 2 ? 4 : 68, 12610, 1, 12344};
        f58947l = new int[]{12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i == 2 ? 4 : 68, 12610, 1, 12344};
    }

    /* JADX INFO: renamed from: a */
    private boolean m83909a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGLContext eGLContext2;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f58948c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            TXCLog.m84149e(f58945b, "unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f58948c, iArr, 0, iArr, 1)) {
            this.f58948c = null;
            TXCLog.m84149e(f58945b, "unable to initialize EGL14");
        }
        if (eGLConfig != null) {
            this.f58950e = eGLConfig;
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.f58948c, surface == null ? f58947l : f58946k, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return false;
            }
            this.f58950e = eGLConfigArr[0];
        }
        if (eGLContext != null) {
            this.f58953h = true;
            eGLContext2 = eGLContext;
        } else {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        }
        try {
            this.f58949d = m83907a(this.f58948c, this.f58950e, 2, eGLContext2);
        } catch (C14174d unused) {
            TXCLog.m84152i(f58945b, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f58949d = m83907a(this.f58948c, this.f58950e, 3, eGLContext2);
            } catch (C14174d e) {
                TXCLog.m84149e(f58945b, "failed to create EGLContext of 3.0. " + e);
                return false;
            }
        }
        int[] iArr2 = {12344};
        if (surface == null) {
            this.f58954i = EGL14.eglCreatePbufferSurface(this.f58948c, this.f58950e, new int[]{12375, this.f58951f, 12374, this.f58952g, 12344}, 0);
        } else {
            this.f58954i = EGL14.eglCreateWindowSurface(this.f58948c, this.f58950e, surface, iArr2, 0);
        }
        m83911a();
        EGLDisplay eGLDisplay = this.f58948c;
        EGLSurface eGLSurface = this.f58954i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58949d)) {
            return true;
        }
        m83911a();
        return false;
    }

    /* JADX INFO: renamed from: f */
    private static void m83910f() throws C14174d {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new C14174d(iEglGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83913b() {
        EGLDisplay eGLDisplay = this.f58948c;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        EGLSurface eGLSurface = this.f58954i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58949d)) {
            return;
        }
        TXCLog.m84149e(f58945b, "eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: c */
    public void m83914c() {
        EGLDisplay eGLDisplay = this.f58948c;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f58948c, this.f58954i);
            EGL14.eglDestroyContext(this.f58948c, this.f58949d);
            this.f58949d = EGL14.EGL_NO_CONTEXT;
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f58948c);
        }
        this.f58948c = EGL14.EGL_NO_DISPLAY;
    }

    /* JADX INFO: renamed from: d */
    public boolean m83915d() {
        return EGL14.eglSwapBuffers(this.f58948c, this.f58954i);
    }

    /* JADX INFO: renamed from: e */
    public EGLContext m83916e() {
        return this.f58949d;
    }

    /* JADX INFO: renamed from: a */
    public void m83911a() {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            TXCLog.m84149e(f58945b, "EGL error:" + iEglGetError);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14173c m83908a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i, int i2) {
        C14173c c14173c = new C14173c();
        c14173c.f58951f = i;
        c14173c.f58952g = i2;
        if (c14173c.m83909a(eGLConfig, eGLContext, surface)) {
            return c14173c;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static EGLContext m83907a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) throws C14174d {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i, 12344}, 0);
        m83910f();
        return eGLContextEglCreateContext;
    }

    /* JADX INFO: renamed from: a */
    public void m83912a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f58948c, this.f58954i, j);
    }
}
