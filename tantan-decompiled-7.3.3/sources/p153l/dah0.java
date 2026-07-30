package p153l;

import android.annotation.SuppressLint;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class dah0 {

    /* JADX INFO: renamed from: a */
    int f85873a;

    /* JADX INFO: renamed from: b */
    int[] f85874b = {12375, 640, 12374, 352, 12344};

    /* JADX INFO: renamed from: c */
    int[] f85875c = {12344};

    /* JADX INFO: renamed from: d */
    int[] f85876d = {12440, 2, 12344};

    /* JADX INFO: renamed from: e */
    EGLConfig[] f85877e = new EGLConfig[1];

    /* JADX INFO: renamed from: f */
    int[] f85878f = new int[1];

    /* JADX INFO: renamed from: g */
    int[] f85879g = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: h */
    int[] f85880h = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: i */
    private EGLContext f85881i = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: j */
    private EGLContext f85882j;

    /* JADX INFO: renamed from: k */
    private EGLSurface f85883k;

    /* JADX INFO: renamed from: l */
    private EGLSurface f85884l;

    /* JADX INFO: renamed from: m */
    private EGLDisplay f85885m;

    /* JADX INFO: renamed from: n */
    private EGL10 f85886n;

    /* JADX INFO: renamed from: o */
    private Object f85887o;

    /* JADX INFO: renamed from: p */
    private int[] f85888p;

    /* JADX INFO: renamed from: q */
    private int[] f85889q;

    public dah0(Object obj, int i, EGLContext eGLContext, Object obj2) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f85883k = eGLSurface;
        this.f85884l = eGLSurface;
        this.f85885m = EGL10.EGL_NO_DISPLAY;
        this.f85886n = null;
        this.f85888p = new int[1];
        this.f85889q = new int[1];
        this.f85887o = obj;
        this.f85882j = eGLContext;
        this.f85873a = i;
        m115119b();
    }

    /* JADX INFO: renamed from: a */
    private void m115118a(String str) {
        EGL10 egl10 = this.f85886n;
        if (egl10 != null) {
            egl10.eglGetError();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m115119b() {
        try {
            if (this.f85886n == null) {
                this.f85886n = (EGL10) EGLContext.getEGL();
            }
            EGLDisplay eGLDisplayEglGetDisplay = this.f85886n.eglGetDisplay(0);
            this.f85885m = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f85886n.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                int i = this.f85873a;
                EGL10 egl10 = this.f85886n;
                if (i != 2) {
                    egl10.eglChooseConfig(this.f85885m, this.f85879g, this.f85877e, 1, this.f85878f);
                } else {
                    egl10.eglChooseConfig(this.f85885m, this.f85880h, this.f85877e, 1, this.f85878f);
                }
                m115118a("eglCreateContext RGB888+recordable ES2");
                EGLContext eGLContext = this.f85882j;
                EGL10 egl11 = this.f85886n;
                if (eGLContext == null) {
                    this.f85881i = egl11.eglCreateContext(this.f85885m, this.f85877e[0], EGL10.EGL_NO_CONTEXT, this.f85876d);
                } else {
                    this.f85881i = egl11.eglCreateContext(this.f85885m, this.f85877e[0], eGLContext, this.f85876d);
                }
                m115118a("eglCreateContext");
                Object obj = this.f85887o;
                if (obj != null) {
                    this.f85883k = this.f85886n.eglCreateWindowSurface(this.f85885m, this.f85877e[0], obj, this.f85875c);
                    m115118a("eglCreateWindowSurface");
                    this.f85886n.eglQuerySurface(this.f85885m, this.f85883k, 12374, this.f85889q);
                    this.f85886n.eglQuerySurface(this.f85885m, this.f85883k, 12375, this.f85888p);
                    return;
                }
                if (this.f85873a == 0 && this.f85884l == EGL10.EGL_NO_SURFACE) {
                    this.f85884l = this.f85886n.eglCreatePbufferSurface(this.f85885m, this.f85877e[0], this.f85874b);
                    m115118a("eglCreatePbufferSurface");
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public void m115120c() {
        EGLSurface eGLSurface = this.f85883k;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f85886n.eglMakeCurrent(this.f85885m, eGLSurface2, eGLSurface2, this.f85881i);
            EGL10 egl10 = this.f85886n;
            EGLDisplay eGLDisplay = this.f85885m;
            EGLSurface eGLSurface3 = this.f85883k;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, this.f85881i);
        }
        EGLSurface eGLSurface4 = this.f85884l;
        if (eGLSurface4 != eGLSurface2) {
            this.f85886n.eglMakeCurrent(this.f85885m, eGLSurface4, eGLSurface4, this.f85881i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m115121d() {
        EGLDisplay eGLDisplay = this.f85885m;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            this.f85886n.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            this.f85886n.eglDestroySurface(this.f85885m, this.f85883k);
            this.f85886n.eglDestroyContext(this.f85885m, this.f85881i);
            this.f85886n.eglTerminate(this.f85885m);
        }
        this.f85885m = eGLDisplay2;
        this.f85881i = eGLContext;
        this.f85883k = eGLSurface;
        this.f85884l = eGLSurface;
    }

    /* JADX INFO: renamed from: e */
    public void m115122e() {
        EGLSurface eGLSurface = this.f85883k;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            this.f85886n.eglSwapBuffers(this.f85885m, eGLSurface);
        }
    }
}
