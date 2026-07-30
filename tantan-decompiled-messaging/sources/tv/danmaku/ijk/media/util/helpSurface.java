package tv.danmaku.ijk.media.util;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p149l.n8c;
import tv.danmaku.ijk.media.streamer.MomoSurface;

/* JADX INFO: loaded from: classes3.dex */
public class helpSurface implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    int[] f208902a = {12375, 640, 12374, 352, 12344};

    /* JADX INFO: renamed from: b */
    int[] f208903b = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: c */
    int[] f208904c = {12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};

    /* JADX INFO: renamed from: d */
    int[] f208905d = {12440, 2, 12344};

    /* JADX INFO: renamed from: e */
    EGLConfig[] f208906e = null;

    /* JADX INFO: renamed from: f */
    int[] f208907f = null;

    /* JADX INFO: renamed from: g */
    private EGL10 f208908g = null;

    /* JADX INFO: renamed from: h */
    private EGLDisplay f208909h = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: i */
    private EGLContext f208910i = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: j */
    private EGLSurface f208911j;

    /* JADX INFO: renamed from: k */
    private EGLSurface f208912k;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f208913l;

    /* JADX INFO: renamed from: m */
    private Surface f208914m;

    /* JADX INFO: renamed from: n */
    private int[] f208915n;

    /* JADX INFO: renamed from: o */
    private int[] f208916o;

    /* JADX INFO: renamed from: p */
    private int f208917p;

    /* JADX INFO: renamed from: q */
    private int f208918q;

    /* JADX INFO: renamed from: r */
    private int f208919r;

    /* JADX INFO: renamed from: s */
    private MomoSurface f208920s;

    /* JADX INFO: renamed from: t */
    private boolean f208921t;

    /* JADX INFO: renamed from: u */
    int f208922u;

    /* JADX INFO: renamed from: v */
    long f208923v;

    public helpSurface(SurfaceHolder surfaceHolder, long j) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f208911j = eGLSurface;
        this.f208912k = eGLSurface;
        this.f208915n = new int[1];
        this.f208916o = new int[1];
        this.f208917p = 0;
        this.f208918q = 16;
        this.f208919r = 16;
        this.f208921t = false;
        this.f208922u = 0;
        this.f208923v = -1L;
        try {
            m222867b(surfaceHolder);
            m222868f();
            m222869i();
            this.f208923v = j;
        } catch (IllegalArgumentException unused) {
            n8c.m158483a("helpSurface", "eglSetup exception");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m222866a(String str) {
        while (true) {
            int iEglGetError = this.f208908g.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            n8c.m158485c("helpSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m222867b(Object obj) {
        EGLSurface eGLSurface;
        if (this.f208908g == null) {
            this.f208908g = (EGL10) EGLContext.getEGL();
        }
        if (this.f208909h == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f208908g.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f208909h = eGLDisplayEglGetDisplay;
            if (!this.f208908g.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f208917p = -1;
                return;
            }
        }
        if (this.f208906e == null) {
            this.f208906e = new EGLConfig[1];
        }
        if (this.f208907f == null) {
            this.f208907f = new int[1];
        }
        EGL10 egl10 = this.f208908g;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f208909h, this.f208904c, this.f208906e, 1, this.f208907f)) {
                this.f208917p = -1;
                return;
            }
        } else if (!egl10.eglChooseConfig(this.f208909h, this.f208903b, this.f208906e, 1, this.f208907f)) {
            this.f208917p = -1;
            return;
        }
        EGLContext eGLContext = this.f208910i;
        EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        if (eGLContext == eGLContext2) {
            this.f208910i = this.f208908g.eglCreateContext(this.f208909h, this.f208906e[0], eGLContext2, this.f208905d);
            m222866a("eglCreateContext");
            if (this.f208910i == null) {
                this.f208917p = -1;
                return;
            }
        }
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (obj != null) {
            EGLSurface eGLSurface3 = this.f208911j;
            if (eGLSurface3 != eGLSurface2) {
                this.f208908g.eglDestroySurface(this.f208909h, eGLSurface3);
                this.f208911j = eGLSurface2;
            }
            if (this.f208911j == eGLSurface2) {
                try {
                    this.f208911j = this.f208908g.eglCreateWindowSurface(this.f208909h, this.f208906e[0], obj, null);
                    m222866a("eglCreateWindowSurface");
                    if (this.f208911j == null) {
                        this.f208917p = -1;
                        return;
                    }
                } catch (Exception unused) {
                    this.f208917p = -1;
                    Log.e("helpSurface", "eglCreateWindowSurface fail");
                    return;
                }
            }
            this.f208908g.eglQuerySurface(this.f208909h, this.f208911j, 12374, this.f208916o);
            this.f208908g.eglQuerySurface(this.f208909h, this.f208911j, 12375, this.f208915n);
            n8c.m158483a("helpSurface", "mEGLSurface width = " + this.f208915n[0] + ";mEGLSurface hight =" + this.f208916o[0]);
        } else {
            int[] iArr = this.f208902a;
            if ((iArr[1] != this.f208918q || iArr[3] != this.f208919r) && (eGLSurface = this.f208912k) != eGLSurface2) {
                this.f208908g.eglDestroySurface(this.f208909h, eGLSurface);
                this.f208912k = eGLSurface2;
            }
            if (this.f208912k == eGLSurface2) {
                int[] iArr2 = this.f208902a;
                iArr2[1] = this.f208918q;
                iArr2[3] = this.f208919r;
                try {
                    this.f208912k = this.f208908g.eglCreatePbufferSurface(this.f208909h, this.f208906e[0], iArr2);
                    m222866a("eglCreatePbufferSurface");
                    if (this.f208912k == null) {
                        this.f208917p = -1;
                        return;
                    }
                } catch (Exception unused2) {
                    this.f208917p = -1;
                    Log.e("helpSurface", "eglCreatePbufferSurface fail");
                    return;
                }
            }
        }
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
    }

    /* JADX INFO: renamed from: f */
    private void m222868f() {
        if (this.f208908g == null) {
            this.f208917p = -1;
            return;
        }
        m222866a("before makeCurrent");
        EGLSurface eGLSurface = this.f208911j;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f208916o[0] == 0 || this.f208915n[0] == 0 || this.f208908g.eglMakeCurrent(this.f208909h, eGLSurface, eGLSurface, this.f208910i)) {
            return;
        }
        this.f208917p = -1;
    }

    /* JADX INFO: renamed from: i */
    private void m222869i() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f208922u = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        try {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f208922u);
            this.f208913l = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.f208913l.setDefaultBufferSize(this.f208918q, this.f208919r);
            this.f208914m = new Surface(this.f208913l);
        } catch (Surface.OutOfResourcesException unused) {
            this.f208917p = -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public Surface m222870c() {
        return this.f208914m;
    }

    /* JADX INFO: renamed from: d */
    public SurfaceTexture m222871d() {
        return this.f208913l;
    }

    /* JADX INFO: renamed from: e */
    public int m222872e() {
        return this.f208922u;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m222873g() {
        try {
            Surface surface = this.f208914m;
            if (surface != null) {
                surface.release();
                this.f208914m = null;
            }
            EGL10 egl10 = this.f208908g;
            if (egl10 != null) {
                egl10.eglDestroySurface(this.f208909h, this.f208911j);
                this.f208908g.eglDestroySurface(this.f208909h, this.f208912k);
                if (this.f208908g.eglGetCurrentContext().equals(this.f208910i)) {
                    EGL10 egl11 = this.f208908g;
                    EGLDisplay eGLDisplay = this.f208909h;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                this.f208908g.eglDestroyContext(this.f208909h, this.f208910i);
                this.f208908g.eglTerminate(this.f208909h);
                this.f208908g = null;
            }
            this.f208909h = EGL10.EGL_NO_DISPLAY;
            this.f208910i = EGL10.EGL_NO_CONTEXT;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            this.f208911j = eGLSurface2;
            this.f208912k = eGLSurface2;
            this.f208908g = null;
            this.f208914m = null;
            this.f208913l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m222874h(MomoSurface momoSurface) {
        this.f208920s = momoSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        n8c.m158485c("helpSurface", "new frame available");
        try {
            MomoSurface momoSurface = this.f208920s;
            if (momoSurface == null || this.f208921t) {
                return;
            }
            momoSurface.m222479i1(this.f208923v, surfaceTexture, this.f208922u, null);
        } catch (Exception unused) {
            n8c.m158485c("helpSurface", "onFrameAvailable error");
        }
    }

    public helpSurface(SurfaceHolder surfaceHolder, int i, int i2) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f208911j = eGLSurface;
        this.f208912k = eGLSurface;
        this.f208915n = new int[1];
        this.f208916o = new int[1];
        this.f208917p = 0;
        this.f208922u = 0;
        this.f208923v = -1L;
        this.f208918q = i;
        this.f208919r = i2;
        this.f208921t = true;
        try {
            m222867b(surfaceHolder);
            m222868f();
            m222869i();
        } catch (IllegalArgumentException unused) {
            n8c.m158483a("helpSurface", "eglSetup exception");
        }
    }
}
