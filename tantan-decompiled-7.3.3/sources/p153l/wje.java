package p153l;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes.dex */
public class wje {

    /* JADX INFO: renamed from: h */
    private static wje f189436h;

    /* JADX INFO: renamed from: a */
    private final String f189437a;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f189438b;

    /* JADX INFO: renamed from: c */
    public EGLContext f189439c;

    /* JADX INFO: renamed from: d */
    public EGLConfig f189440d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f189441e;

    /* JADX INFO: renamed from: f */
    public int f189442f;

    /* JADX INFO: renamed from: g */
    public boolean f189443g;

    public wje() {
        this.f189437a = "EGLWrapper14";
        this.f189438b = EGL14.EGL_NO_DISPLAY;
        this.f189439c = EGL14.EGL_NO_CONTEXT;
        this.f189440d = null;
        this.f189441e = EGL14.EGL_NO_SURFACE;
        this.f189442f = 3;
        this.f189443g = false;
    }

    /* JADX INFO: renamed from: f */
    public static EGLContext m206628f() {
        if (f189436h == null) {
            wje wjeVar = new wje();
            f189436h = wjeVar;
            wjeVar.m206631b();
            f189436h.m206637i();
        }
        return f189436h.f189439c;
    }

    /* JADX INFO: renamed from: k */
    public static void m206629k(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public synchronized int m206630a(Object obj) {
        int[] iArr = {12344};
        EGLDisplay eGLDisplay = this.f189438b;
        int i = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && this.f189439c != EGL14.EGL_NO_CONTEXT) {
            EGLSurface eGLSurface = this.f189441e;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                this.f189441e = eGLSurface2;
                EGL14.eglMakeCurrent(this.f189438b, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            }
            try {
                this.f189441e = EGL14.eglCreateWindowSurface(this.f189438b, this.f189440d, obj, iArr, 0);
            } catch (Exception unused) {
                this.f189441e = EGL14.EGL_NO_SURFACE;
            }
            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
            EGLSurface eGLSurface4 = this.f189441e;
            if (eGLSurface3 != eGLSurface4 && eGLSurface4 != null) {
                EGL14.eglMakeCurrent(this.f189438b, eGLSurface4, eGLSurface4, this.f189439c);
                i = 0;
            }
            return -1;
        }
        return i;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public void m206631b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f189438b = eGLDisplayEglGetDisplay;
        if (EGL14.EGL_NO_DISPLAY == eGLDisplayEglGetDisplay) {
            rdd0.m180845a("eglGetDisplay,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglGetDisplay");
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f189438b, iArr, 0, iArr, 1)) {
            rdd0.m180845a("eglInitialize,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglInitialize");
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f189438b, this.f189443g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglChooseConfig");
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f189440d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f189438b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f189439c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper  eglCreateContext");
        EGL14.eglQueryContext(this.f189438b, this.f189439c, 12440, new int[1], 0);
        try {
            this.f189441e = EGL14.eglCreatePbufferSurface(this.f189438b, this.f189440d, iArr3, 0);
        } catch (Exception unused) {
            this.f189441e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f189441e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreatePbufferSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        } else {
            MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglCreatePbufferSurface");
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: c */
    public void m206632c(EGLContext eGLContext) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f189438b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f189438b, this.f189443g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f189440d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        int[] iArr4 = {12440, 2, 12344};
        EGLDisplay eGLDisplay = this.f189438b;
        if (eGLContext != null) {
            this.f189439c = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr4, 0);
        } else {
            this.f189439c = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr4, 0);
        }
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        EGLContext eGLContext3 = this.f189439c;
        if (eGLContext2 == eGLContext3) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f189438b, eGLContext3, 12440, new int[1], 0);
        try {
            this.f189441e = EGL14.eglCreatePbufferSurface(this.f189438b, this.f189440d, iArr3, 0);
        } catch (Exception unused) {
            this.f189441e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f189441e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreatePbufferSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    public void m206633d(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f189438b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f189438b, this.f189443g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12610, 1, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12610, 1, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f189440d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f189438b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f189439c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f189438b, eGLContextEglCreateContext, 12440, new int[1], 0);
        try {
            this.f189441e = EGL14.eglCreateWindowSurface(this.f189438b, this.f189440d, obj, iArr3, 0);
        } catch (Exception unused) {
            this.f189441e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f189441e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: e */
    public void m206634e(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f189438b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f189438b, this.f189443g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f189440d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f189438b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f189439c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f189438b, eGLContextEglCreateContext, 12440, new int[1], 0);
        try {
            this.f189441e = EGL14.eglCreateWindowSurface(this.f189438b, this.f189440d, obj, iArr3, 0);
        } catch (Exception unused) {
            this.f189441e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f189441e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    public int m206635g() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f189438b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f189441e) != EGL14.EGL_NO_SURFACE && this.f189439c != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: h */
    public int m206636h() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f189438b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f189441e) != EGL14.EGL_NO_SURFACE && this.f189439c != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: i */
    public synchronized boolean m206637i() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplay = this.f189438b;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY || (eGLSurface = this.f189441e) == EGL14.EGL_NO_SURFACE || (eGLContext = this.f189439c) == EGL14.EGL_NO_CONTEXT) {
            return false;
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return true;
        }
        this.f189441e = EGL14.EGL_NO_SURFACE;
        return false;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: j */
    public synchronized void m206638j() {
        EGLContext eGLContext;
        try {
            EGLDisplay eGLDisplay = this.f189438b;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLContext = this.f189439c) != EGL14.EGL_NO_CONTEXT) {
                EGLSurface eGLSurface = this.f189441e;
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Warpper eglReleased fail");
                    }
                    EGL14.eglDestroySurface(this.f189438b, this.f189441e);
                }
                EGLDisplay eGLDisplay2 = this.f189438b;
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f189438b, this.f189439c);
                EGL14.eglTerminate(this.f189438b);
                this.f189441e = EGL14.EGL_NO_SURFACE;
                this.f189438b = EGL14.EGL_NO_DISPLAY;
                this.f189439c = EGL14.EGL_NO_CONTEXT;
                this.f189440d = null;
                MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglReleased");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: l */
    public synchronized void m206639l() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f189438b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f189441e) != EGL14.EGL_NO_SURFACE) {
            EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        }
    }

    public wje(boolean z) {
        this.f189437a = "EGLWrapper14";
        this.f189438b = EGL14.EGL_NO_DISPLAY;
        this.f189439c = EGL14.EGL_NO_CONTEXT;
        this.f189440d = null;
        this.f189441e = EGL14.EGL_NO_SURFACE;
        this.f189442f = 3;
        this.f189443g = z;
    }
}
