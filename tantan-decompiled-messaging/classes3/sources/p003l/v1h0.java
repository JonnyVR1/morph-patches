package p003l;

import android.annotation.SuppressLint;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"NewApi"})
public class v1h0 {

    /* JADX INFO: renamed from: a */
    int f8149a;

    /* JADX INFO: renamed from: b */
    int[] f8150b = {12375, 640, 12374, 352, 12344};

    /* JADX INFO: renamed from: c */
    int[] f8151c = {12344};

    /* JADX INFO: renamed from: d */
    int[] f8152d = {12440, 2, 12344};

    /* JADX INFO: renamed from: e */
    EGLConfig[] f8153e = new EGLConfig[1];

    /* JADX INFO: renamed from: f */
    int[] f8154f = new int[1];

    /* JADX INFO: renamed from: g */
    int[] f8155g = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: h */
    int[] f8156h = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: i */
    private EGLContext f8157i = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: j */
    private EGLContext f8158j;

    /* JADX INFO: renamed from: k */
    private EGLSurface f8159k;

    /* JADX INFO: renamed from: l */
    private EGLSurface f8160l;

    /* JADX INFO: renamed from: m */
    private EGLDisplay f8161m;

    /* JADX INFO: renamed from: n */
    private EGL10 f8162n;

    /* JADX INFO: renamed from: o */
    private Object f8163o;

    /* JADX INFO: renamed from: p */
    private int[] f8164p;

    /* JADX INFO: renamed from: q */
    private int[] f8165q;

    public v1h0(Object obj, int i, EGLContext eGLContext, Object obj2) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f8159k = eGLSurface;
        this.f8160l = eGLSurface;
        this.f8161m = EGL10.EGL_NO_DISPLAY;
        this.f8162n = null;
        this.f8164p = new int[1];
        this.f8165q = new int[1];
        this.f8163o = obj;
        this.f8158j = eGLContext;
        this.f8149a = i;
        m8271b();
    }

    /* JADX INFO: renamed from: a */
    private void m8270a(String str) {
        EGL10 egl10 = this.f8162n;
        if (egl10 != null) {
            egl10.eglGetError();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m8271b() {
        try {
            if (this.f8162n == null) {
                this.f8162n = (EGL10) EGLContext.getEGL();
            }
            EGLDisplay eGLDisplayEglGetDisplay = this.f8162n.eglGetDisplay(0);
            this.f8161m = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f8162n.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                int i = this.f8149a;
                EGL10 egl10 = this.f8162n;
                if (i != 2) {
                    egl10.eglChooseConfig(this.f8161m, this.f8155g, this.f8153e, 1, this.f8154f);
                } else {
                    egl10.eglChooseConfig(this.f8161m, this.f8156h, this.f8153e, 1, this.f8154f);
                }
                m8270a("eglCreateContext RGB888+recordable ES2");
                EGLContext eGLContext = this.f8158j;
                EGL10 egl11 = this.f8162n;
                if (eGLContext == null) {
                    this.f8157i = egl11.eglCreateContext(this.f8161m, this.f8153e[0], EGL10.EGL_NO_CONTEXT, this.f8152d);
                } else {
                    this.f8157i = egl11.eglCreateContext(this.f8161m, this.f8153e[0], eGLContext, this.f8152d);
                }
                m8270a("eglCreateContext");
                Object obj = this.f8163o;
                if (obj != null) {
                    this.f8159k = this.f8162n.eglCreateWindowSurface(this.f8161m, this.f8153e[0], obj, this.f8151c);
                    m8270a("eglCreateWindowSurface");
                    this.f8162n.eglQuerySurface(this.f8161m, this.f8159k, 12374, this.f8165q);
                    this.f8162n.eglQuerySurface(this.f8161m, this.f8159k, 12375, this.f8164p);
                    return;
                }
                if (this.f8149a == 0 && this.f8160l == EGL10.EGL_NO_SURFACE) {
                    this.f8160l = this.f8162n.eglCreatePbufferSurface(this.f8161m, this.f8153e[0], this.f8150b);
                    m8270a("eglCreatePbufferSurface");
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8272c() {
        EGLSurface eGLSurface = this.f8159k;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f8162n.eglMakeCurrent(this.f8161m, eGLSurface2, eGLSurface2, this.f8157i);
            EGL10 egl10 = this.f8162n;
            EGLDisplay eGLDisplay = this.f8161m;
            EGLSurface eGLSurface3 = this.f8159k;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, this.f8157i);
        }
        EGLSurface eGLSurface4 = this.f8160l;
        if (eGLSurface4 != eGLSurface2) {
            this.f8162n.eglMakeCurrent(this.f8161m, eGLSurface4, eGLSurface4, this.f8157i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m8273d() {
        EGLDisplay eGLDisplay = this.f8161m;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            this.f8162n.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            this.f8162n.eglDestroySurface(this.f8161m, this.f8159k);
            this.f8162n.eglDestroyContext(this.f8161m, this.f8157i);
            this.f8162n.eglTerminate(this.f8161m);
        }
        this.f8161m = eGLDisplay2;
        this.f8157i = eGLContext;
        this.f8159k = eGLSurface;
        this.f8160l = eGLSurface;
    }

    /* JADX INFO: renamed from: e */
    public void m8274e() {
        EGLSurface eGLSurface = this.f8159k;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            this.f8162n.eglSwapBuffers(this.f8161m, eGLSurface);
        }
    }
}
