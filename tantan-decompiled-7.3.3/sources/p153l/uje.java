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

/* JADX INFO: loaded from: classes7.dex */
public class uje {

    /* JADX INFO: renamed from: a */
    private final String f179205a = "EGLWrapper14";

    /* JADX INFO: renamed from: b */
    public EGLDisplay f179206b = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: c */
    public EGLContext f179207c = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: d */
    public EGLConfig f179208d = null;

    /* JADX INFO: renamed from: e */
    public EGLSurface f179209e = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: f */
    public int f179210f = 3;

    /* JADX INFO: renamed from: g */
    public boolean f179211g = false;

    /* JADX INFO: renamed from: d */
    public static int m196321d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        jej.m144567a("glBindTexture mTextureID");
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        jej.m144567a("glTexParameter");
        return iArr[0];
    }

    /* JADX INFO: renamed from: h */
    public static void m196322h(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: a */
    public void m196323a() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f179206b = eGLDisplayEglGetDisplay;
        if (EGL14.EGL_NO_DISPLAY == eGLDisplayEglGetDisplay) {
            rdd0.m180845a("eglGetDisplay,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglGetDisplay");
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f179206b, iArr, 0, iArr, 1)) {
            rdd0.m180845a("eglInitialize,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglInitialize");
        int[] iArr2 = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(this.f179206b, this.f179211g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglChooseConfig");
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f179208d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f179206b, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.f179207c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper  eglCreateContext");
        EGL14.eglQueryContext(this.f179206b, this.f179207c, 12440, new int[1], 0);
        try {
            this.f179209e = EGL14.eglCreatePbufferSurface(this.f179206b, this.f179208d, iArr3, 0);
        } catch (Exception unused) {
            this.f179209e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f179209e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreatePbufferSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        } else {
            MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglCreatePbufferSurface");
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: b */
    public void m196324b(EGLContext eGLContext) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f179206b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f179206b, this.f179211g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f179208d = eGLConfig;
        int[] iArr3 = {12375, 1, 12374, 1, 12344};
        int[] iArr4 = {12440, 2, 12344};
        EGLDisplay eGLDisplay = this.f179206b;
        if (eGLContext != null) {
            this.f179207c = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr4, 0);
        } else {
            this.f179207c = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr4, 0);
        }
        EGLContext eGLContext2 = EGL14.EGL_NO_CONTEXT;
        EGLContext eGLContext3 = this.f179207c;
        if (eGLContext2 == eGLContext3) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f179206b, eGLContext3, 12440, new int[1], 0);
        try {
            this.f179209e = EGL14.eglCreatePbufferSurface(this.f179206b, this.f179208d, iArr3, 0);
        } catch (Exception unused) {
            this.f179209e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f179209e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreatePbufferSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: c */
    public void m196325c(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f179206b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f179206b, this.f179211g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12610, 1, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12610, 1, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f179208d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f179206b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f179207c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f179206b, eGLContextEglCreateContext, 12440, new int[1], 0);
        try {
            this.f179209e = EGL14.eglCreateWindowSurface(this.f179206b, this.f179208d, obj, iArr3, 0);
        } catch (Exception unused) {
            this.f179209e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f179209e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: e */
    public void m196326e(EGLContext eGLContext, Object obj) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f179206b = eGLDisplayEglGetDisplay;
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
        EGL14.eglChooseConfig(this.f179206b, this.f179211g ? new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] <= 0) {
            rdd0.m180845a("eglChooseConfig,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        this.f179208d = eGLConfig;
        int[] iArr3 = {12344};
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f179206b, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
        this.f179207c = eGLContextEglCreateContext;
        if (EGL14.EGL_NO_CONTEXT == eGLContextEglCreateContext) {
            rdd0.m180845a("eglCreateContext,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return;
        }
        EGL14.eglQueryContext(this.f179206b, eGLContextEglCreateContext, 12440, new int[1], 0);
        try {
            this.f179209e = EGL14.eglCreateWindowSurface(this.f179206b, this.f179208d, obj, iArr3, 0);
        } catch (Exception unused) {
            this.f179209e = EGL14.EGL_NO_SURFACE;
        }
        EGLSurface eGLSurface = this.f179209e;
        if (eGLSurface == null || EGL14.EGL_NO_SURFACE == eGLSurface) {
            rdd0.m180845a("eglCreateWindowSurface,failed:", GLUtils.getEGLErrorString(EGL14.eglGetError()));
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: f */
    public synchronized boolean m196327f() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        EGLDisplay eGLDisplay = this.f179206b;
        if (eGLDisplay == EGL14.EGL_NO_DISPLAY || (eGLSurface = this.f179209e) == EGL14.EGL_NO_SURFACE || (eGLContext = this.f179207c) == EGL14.EGL_NO_CONTEXT) {
            return false;
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return true;
        }
        this.f179209e = EGL14.EGL_NO_SURFACE;
        return false;
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: g */
    public synchronized void m196328g() {
        EGLContext eGLContext;
        try {
            EGLDisplay eGLDisplay = this.f179206b;
            if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLContext = this.f179207c) != EGL14.EGL_NO_CONTEXT) {
                EGLSurface eGLSurface = this.f179209e;
                if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                    if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Warpper eglReleased fail");
                    }
                    EGL14.eglDestroySurface(this.f179206b, this.f179209e);
                }
                EGLDisplay eGLDisplay2 = this.f179206b;
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(this.f179206b, this.f179207c);
                EGL14.eglTerminate(this.f179206b);
                this.f179209e = EGL14.EGL_NO_SURFACE;
                this.f179206b = EGL14.EGL_NO_DISPLAY;
                this.f179207c = EGL14.EGL_NO_CONTEXT;
                this.f179208d = null;
                MDLog.m7449i(MDLogTag.MOMENT_RENDER_TAG, "EGL14Wrapper eglReleased");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(17)
    /* JADX INFO: renamed from: i */
    public synchronized void m196329i() {
        EGLSurface eGLSurface;
        EGLDisplay eGLDisplay = this.f179206b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.f179209e) != EGL14.EGL_NO_SURFACE) {
            EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        }
    }
}
