package p149l;

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
public class sie {

    /* JADX INFO: renamed from: h */
    private static sie f164703h;

    /* JADX INFO: renamed from: a */
    private final String f164704a;

    /* JADX INFO: renamed from: b */
    public EGLDisplay f164705b;

    /* JADX INFO: renamed from: c */
    public EGLContext f164706c;

    /* JADX INFO: renamed from: d */
    public EGLConfig f164707d;

    /* JADX INFO: renamed from: e */
    public EGLSurface f164708e;

    /* JADX INFO: renamed from: f */
    public int f164709f;

    /* JADX INFO: renamed from: g */
    public boolean f164710g;

    public sie() {
        this.f164704a = "EGLWrapper14";
        this.f164705b = EGL14.EGL_NO_DISPLAY;
        this.f164706c = EGL14.EGL_NO_CONTEXT;
        this.f164707d = null;
        this.f164708e = EGL14.EGL_NO_SURFACE;
        this.f164709f = 3;
        this.f164710g = false;
    }

    /* JADX INFO: renamed from: f */
    public static EGLContext m184324f() {
        if (f164703h == null) {
            sie sieVar = new sie();
            f164703h = sieVar;
            sieVar.m184327b();
            f164703h.m184333i();
        }
        return f164703h.f164706c;
    }

    /* JADX INFO: renamed from: k */
    public static void m184325k(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public synchronized int m184326a(Object obj) {
        int[] iArr = {12344};
        EGLDisplay eGLDisplay = this.f164705b;
        int i = -1;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && this.f164706c != EGL14.EGL_NO_CONTEXT) {
            EGLSurface eGLSurface = this.f164708e;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                this.f164708e = eGLSurface2;
                EGL14.eglMakeCurrent(this.f164705b, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            }
            try {
                this.f164708e = EGL14.eglCreateWindowSurface(this.f164705b, this.f164707d, obj, iArr, 0);
            } catch (Exception unused) {
                this.f164708e = EGL14.EGL_NO_SURFACE;
            }
            EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
            EGLSurface eGLSurface4 = this.f164708e;
            if (eGLSurface3 != eGLSurface4 && eGLSurface4 != null) {
                EGL14.eglMakeCurrent(this.f164705b, eGLSurface4, eGLSurface4, this.f164706c);
                i = 0;
            }
            return -1;
        }
        return i;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public void m184327b() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f164705b = eGLDisplayEglGetDisplay;
        if (EGL14.EGL_NO_DISPLAY == eGLDisplayEglGetDisplay) {
            o5d0.m162778a("eglGetDisplay,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglGetDisplay");
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f164705b, iArr, 0, iArr, 1)) {
            o5d0.m162778a("eglInitialize,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglInitialize");
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f164705b, this.f164710g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            o5d0.m162778a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglChooseConfig");
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f164707d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f164705b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f164706c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            o5d0.m162778a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper  eglCreateContext");
        EGL14.eglQueryContext(this.f164705b, this.f164706c, 12440, new int[1], 0);
        try {
            this.f164708e = EGL14.eglCreatePbufferSurface(this.f164705b, this.f164707d, iArr3, 0);
        } catch (Exception unused) {
            this.f164708e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f164708e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            o5d0.m162778a("eglCreatePbufferSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        } else {
            MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglCreatePbufferSurface");
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: c */
    public void m184328c(EGLContext eGLContext) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f164705b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f164705b, this.f164710g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            o5d0.m162778a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f164707d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        int[] iArr4 = {12440, 2, 12344};
        EGLDisplay eGLDisplay = this.f164705b;
        if (eGLContext != null) {
            this.f164706c = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr4, 0);
        } else {
            this.f164706c = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr4, 0);
        }
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        EGLContext eGLContext3 = this.f164706c;
        if (eGLContext2 == eGLContext3) {
            o5d0.m162778a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f164705b, eGLContext3, 12440, new int[1], 0);
        try {
            this.f164708e = EGL14.eglCreatePbufferSurface(this.f164705b, this.f164707d, iArr3, 0);
        } catch (Exception unused) {
            this.f164708e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f164708e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            o5d0.m162778a("eglCreatePbufferSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: d */
    public void m184329d(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f164705b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f164705b, this.f164710g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12610, 1, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12610, 1, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            o5d0.m162778a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f164707d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f164705b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f164706c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            o5d0.m162778a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f164705b, eGLContextEglCreateContext, 12440, new int[1], 0);
        try {
            this.f164708e = EGL14.eglCreateWindowSurface(this.f164705b, this.f164707d, obj, iArr3, 0);
        } catch (Exception unused) {
            this.f164708e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f164708e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            o5d0.m162778a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: e */
    public void m184330e(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f164705b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f164705b, this.f164710g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            o5d0.m162778a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f164707d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f164705b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f164706c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            o5d0.m162778a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f164705b, eGLContextEglCreateContext, 12440, new int[1], 0);
        try {
            this.f164708e = EGL14.eglCreateWindowSurface(this.f164705b, this.f164707d, obj, iArr3, 0);
        } catch (Exception unused) {
            this.f164708e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f164708e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            o5d0.m162778a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    public int m184331g() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f164705b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f164708e) != EGL14.EGL_NO_SURFACE && this.f164706c != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: h */
    public int m184332h() {
        EGLSurface eGLSurface;
        int[] iArr = new int[1];
        EGLDisplay eGLDisplay = this.f164705b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f164708e) != EGL14.EGL_NO_SURFACE && this.f164706c != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 0);
        }
        return iArr[0];
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: i */
    public synchronized boolean m184333i() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplay = this.f164705b;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY || (eGLSurface = this.f164708e) == EGL14.EGL_NO_SURFACE || (eGLContext = this.f164706c) == EGL14.EGL_NO_CONTEXT) {
            return false;
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return true;
        }
        this.f164708e = EGL14.EGL_NO_SURFACE;
        return false;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: j */
    public synchronized void m184334j() {
        EGLContext eGLContext;
        try {
            EGLDisplay eGLDisplay = this.f164705b;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLContext = this.f164706c) != EGL14.EGL_NO_CONTEXT) {
                EGLSurface eGLSurface = this.f164708e;
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Warpper eglReleased fail");
                    }
                    EGL14.eglDestroySurface(this.f164705b, this.f164708e);
                }
                EGLDisplay eGLDisplay2 = this.f164705b;
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f164705b, this.f164706c);
                EGL14.eglTerminate(this.f164705b);
                this.f164708e = EGL14.EGL_NO_SURFACE;
                this.f164705b = EGL14.EGL_NO_DISPLAY;
                this.f164706c = EGL14.EGL_NO_CONTEXT;
                this.f164707d = null;
                MDLog.m7395i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglReleased");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: l */
    public synchronized void m184335l() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f164705b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f164708e) != EGL14.EGL_NO_SURFACE) {
            EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        }
    }

    public sie(boolean z) {
        this.f164704a = "EGLWrapper14";
        this.f164705b = EGL14.EGL_NO_DISPLAY;
        this.f164706c = EGL14.EGL_NO_CONTEXT;
        this.f164707d = null;
        this.f164708e = EGL14.EGL_NO_SURFACE;
        this.f164709f = 3;
        this.f164710g = z;
    }
}
