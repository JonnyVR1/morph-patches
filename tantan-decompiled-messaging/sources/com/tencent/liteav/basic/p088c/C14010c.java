package com.tencent.liteav.basic.p088c;

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
public class C14010c {

    /* JADX INFO: renamed from: a */
    private static int f58096a = 2;

    /* JADX INFO: renamed from: b */
    private static final String f58097b = "c";

    /* JADX INFO: renamed from: k */
    private static int[] f58098k;

    /* JADX INFO: renamed from: l */
    private static int[] f58099l;

    /* JADX INFO: renamed from: h */
    private boolean f58105h;

    /* JADX INFO: renamed from: i */
    private EGLSurface f58106i;

    /* JADX INFO: renamed from: c */
    private EGLDisplay f58100c = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: d */
    private EGLContext f58101d = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: e */
    private EGLConfig f58102e = null;

    /* JADX INFO: renamed from: f */
    private int f58103f = 0;

    /* JADX INFO: renamed from: g */
    private int f58104g = 0;

    /* JADX INFO: renamed from: j */
    private int f58107j = -1;

    static {
        int i = f58096a;
        f58098k = new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i == 2 ? 4 : 68, 12610, 1, 12344};
        f58099l = new int[]{12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, i == 2 ? 4 : 68, 12610, 1, 12344};
    }

    /* JADX INFO: renamed from: a */
    private boolean m82726a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) {
        EGLContext eGLContext2;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f58100c = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            TXCLog.m82966e(f58097b, "unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f58100c, iArr, 0, iArr, 1)) {
            this.f58100c = null;
            TXCLog.m82966e(f58097b, "unable to initialize EGL14");
        }
        if (eGLConfig != null) {
            this.f58102e = eGLConfig;
        } else {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(this.f58100c, surface == null ? f58099l : f58098k, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return false;
            }
            this.f58102e = eGLConfigArr[0];
        }
        if (eGLContext != null) {
            this.f58105h = true;
            eGLContext2 = eGLContext;
        } else {
            eGLContext2 = EGL14.EGL_NO_CONTEXT;
        }
        try {
            this.f58101d = m82724a(this.f58100c, this.f58102e, 2, eGLContext2);
        } catch (C14011d unused) {
            TXCLog.m82969i(f58097b, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
            try {
                this.f58101d = m82724a(this.f58100c, this.f58102e, 3, eGLContext2);
            } catch (C14011d e) {
                TXCLog.m82966e(f58097b, "failed to create EGLContext of 3.0. " + e);
                return false;
            }
        }
        int[] iArr2 = {12344};
        if (surface == null) {
            this.f58106i = EGL14.eglCreatePbufferSurface(this.f58100c, this.f58102e, new int[]{12375, this.f58103f, 12374, this.f58104g, 12344}, 0);
        } else {
            this.f58106i = EGL14.eglCreateWindowSurface(this.f58100c, this.f58102e, surface, iArr2, 0);
        }
        m82728a();
        EGLDisplay eGLDisplay = this.f58100c;
        EGLSurface eGLSurface = this.f58106i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58101d)) {
            return true;
        }
        m82728a();
        return false;
    }

    /* JADX INFO: renamed from: f */
    private static void m82727f() throws C14011d {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new C14011d(iEglGetError);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82730b() {
        EGLDisplay eGLDisplay = this.f58100c;
        EGLDisplay eGLDisplay2 = EGL14.EGL_NO_DISPLAY;
        EGLSurface eGLSurface = this.f58106i;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f58101d)) {
            return;
        }
        TXCLog.m82966e(f58097b, "eglMakeCurrent failed");
    }

    /* JADX INFO: renamed from: c */
    public void m82731c() {
        EGLDisplay eGLDisplay = this.f58100c;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroySurface(this.f58100c, this.f58106i);
            EGL14.eglDestroyContext(this.f58100c, this.f58101d);
            this.f58101d = EGL14.EGL_NO_CONTEXT;
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f58100c);
        }
        this.f58100c = EGL14.EGL_NO_DISPLAY;
    }

    /* JADX INFO: renamed from: d */
    public boolean m82732d() {
        return EGL14.eglSwapBuffers(this.f58100c, this.f58106i);
    }

    /* JADX INFO: renamed from: e */
    public EGLContext m82733e() {
        return this.f58101d;
    }

    /* JADX INFO: renamed from: a */
    public void m82728a() {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            TXCLog.m82966e(f58097b, "EGL error:" + iEglGetError);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14010c m82725a(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i, int i2) {
        C14010c c14010c = new C14010c();
        c14010c.f58103f = i;
        c14010c.f58104g = i2;
        if (c14010c.m82726a(eGLConfig, eGLContext, surface)) {
            return c14010c;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static EGLContext m82724a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, EGLContext eGLContext) throws C14011d {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i, 12344}, 0);
        m82727f();
        return eGLContextEglCreateContext;
    }

    /* JADX INFO: renamed from: a */
    public void m82729a(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f58100c, this.f58106i, j);
    }
}
