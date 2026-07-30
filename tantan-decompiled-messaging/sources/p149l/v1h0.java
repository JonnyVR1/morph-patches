package p149l;

import android.annotation.SuppressLint;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class v1h0 {

    /* JADX INFO: renamed from: a */
    int f179235a;

    /* JADX INFO: renamed from: b */
    int[] f179236b = {12375, 640, 12374, 352, 12344};

    /* JADX INFO: renamed from: c */
    int[] f179237c = {12344};

    /* JADX INFO: renamed from: d */
    int[] f179238d = {12440, 2, 12344};

    /* JADX INFO: renamed from: e */
    EGLConfig[] f179239e = new EGLConfig[1];

    /* JADX INFO: renamed from: f */
    int[] f179240f = new int[1];

    /* JADX INFO: renamed from: g */
    int[] f179241g = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: h */
    int[] f179242h = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: i */
    private EGLContext f179243i = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: j */
    private EGLContext f179244j;

    /* JADX INFO: renamed from: k */
    private EGLSurface f179245k;

    /* JADX INFO: renamed from: l */
    private EGLSurface f179246l;

    /* JADX INFO: renamed from: m */
    private EGLDisplay f179247m;

    /* JADX INFO: renamed from: n */
    private EGL10 f179248n;

    /* JADX INFO: renamed from: o */
    private Object f179249o;

    /* JADX INFO: renamed from: p */
    private int[] f179250p;

    /* JADX INFO: renamed from: q */
    private int[] f179251q;

    public v1h0(Object obj, int i, EGLContext eGLContext, Object obj2) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f179245k = eGLSurface;
        this.f179246l = eGLSurface;
        this.f179247m = EGL10.EGL_NO_DISPLAY;
        this.f179248n = null;
        this.f179250p = new int[1];
        this.f179251q = new int[1];
        this.f179249o = obj;
        this.f179244j = eGLContext;
        this.f179235a = i;
        m196638b();
    }

    /* JADX INFO: renamed from: a */
    private void m196637a(String str) {
        EGL10 egl10 = this.f179248n;
        if (egl10 != null) {
            egl10.eglGetError();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m196638b() {
        try {
            if (this.f179248n == null) {
                this.f179248n = (EGL10) EGLContext.getEGL();
            }
            EGLDisplay eGLDisplayEglGetDisplay = this.f179248n.eglGetDisplay(0);
            this.f179247m = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f179248n.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                int i = this.f179235a;
                EGL10 egl10 = this.f179248n;
                if (i != 2) {
                    egl10.eglChooseConfig(this.f179247m, this.f179241g, this.f179239e, 1, this.f179240f);
                } else {
                    egl10.eglChooseConfig(this.f179247m, this.f179242h, this.f179239e, 1, this.f179240f);
                }
                m196637a("eglCreateContext RGB888+recordable ES2");
                EGLContext eGLContext = this.f179244j;
                EGL10 egl11 = this.f179248n;
                if (eGLContext == null) {
                    this.f179243i = egl11.eglCreateContext(this.f179247m, this.f179239e[0], EGL10.EGL_NO_CONTEXT, this.f179238d);
                } else {
                    this.f179243i = egl11.eglCreateContext(this.f179247m, this.f179239e[0], eGLContext, this.f179238d);
                }
                m196637a("eglCreateContext");
                Object obj = this.f179249o;
                if (obj != null) {
                    this.f179245k = this.f179248n.eglCreateWindowSurface(this.f179247m, this.f179239e[0], obj, this.f179237c);
                    m196637a("eglCreateWindowSurface");
                    this.f179248n.eglQuerySurface(this.f179247m, this.f179245k, 12374, this.f179251q);
                    this.f179248n.eglQuerySurface(this.f179247m, this.f179245k, 12375, this.f179250p);
                    return;
                }
                if (this.f179235a == 0 && this.f179246l == EGL10.EGL_NO_SURFACE) {
                    this.f179246l = this.f179248n.eglCreatePbufferSurface(this.f179247m, this.f179239e[0], this.f179236b);
                    m196637a("eglCreatePbufferSurface");
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public void m196639c() {
        EGLSurface eGLSurface = this.f179245k;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f179248n.eglMakeCurrent(this.f179247m, eGLSurface2, eGLSurface2, this.f179243i);
            EGL10 egl10 = this.f179248n;
            EGLDisplay eGLDisplay = this.f179247m;
            EGLSurface eGLSurface3 = this.f179245k;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, this.f179243i);
        }
        EGLSurface eGLSurface4 = this.f179246l;
        if (eGLSurface4 != eGLSurface2) {
            this.f179248n.eglMakeCurrent(this.f179247m, eGLSurface4, eGLSurface4, this.f179243i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m196640d() {
        EGLDisplay eGLDisplay = this.f179247m;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            this.f179248n.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            this.f179248n.eglDestroySurface(this.f179247m, this.f179245k);
            this.f179248n.eglDestroyContext(this.f179247m, this.f179243i);
            this.f179248n.eglTerminate(this.f179247m);
        }
        this.f179247m = eGLDisplay2;
        this.f179243i = eGLContext;
        this.f179245k = eGLSurface;
        this.f179246l = eGLSurface;
    }

    /* JADX INFO: renamed from: e */
    public void m196641e() {
        EGLSurface eGLSurface = this.f179245k;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            this.f179248n.eglSwapBuffers(this.f179247m, eGLSurface);
        }
    }
}
