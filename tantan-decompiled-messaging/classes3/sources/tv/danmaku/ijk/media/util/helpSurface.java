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
import l.n8c;
import tv.danmaku.ijk.media.streamer.MomoSurface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class helpSurface implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    int[] f12527a = {12375, 640, 12374, 352, 12344};

    /* JADX INFO: renamed from: b */
    int[] f12528b = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: c */
    int[] f12529c = {12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};

    /* JADX INFO: renamed from: d */
    int[] f12530d = {12440, 2, 12344};

    /* JADX INFO: renamed from: e */
    EGLConfig[] f12531e = null;

    /* JADX INFO: renamed from: f */
    int[] f12532f = null;

    /* JADX INFO: renamed from: g */
    private EGL10 f12533g = null;

    /* JADX INFO: renamed from: h */
    private EGLDisplay f12534h = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: i */
    private EGLContext f12535i = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: j */
    private EGLSurface f12536j;

    /* JADX INFO: renamed from: k */
    private EGLSurface f12537k;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f12538l;

    /* JADX INFO: renamed from: m */
    private Surface f12539m;

    /* JADX INFO: renamed from: n */
    private int[] f12540n;

    /* JADX INFO: renamed from: o */
    private int[] f12541o;

    /* JADX INFO: renamed from: p */
    private int f12542p;

    /* JADX INFO: renamed from: q */
    private int f12543q;

    /* JADX INFO: renamed from: r */
    private int f12544r;

    /* JADX INFO: renamed from: s */
    private MomoSurface f12545s;

    /* JADX INFO: renamed from: t */
    private boolean f12546t;

    /* JADX INFO: renamed from: u */
    int f12547u;

    /* JADX INFO: renamed from: v */
    long f12548v;

    public helpSurface(SurfaceHolder surfaceHolder, long j) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f12536j = eGLSurface;
        this.f12537k = eGLSurface;
        this.f12540n = new int[1];
        this.f12541o = new int[1];
        this.f12542p = 0;
        this.f12543q = 16;
        this.f12544r = 16;
        this.f12546t = false;
        this.f12547u = 0;
        this.f12548v = -1L;
        try {
            m11338b(surfaceHolder);
            m11339f();
            m11340i();
            this.f12548v = j;
        } catch (IllegalArgumentException unused) {
            n8c.a("helpSurface", "eglSetup exception");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m11337a(String str) {
        while (true) {
            int iEglGetError = this.f12533g.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            n8c.c("helpSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m11338b(Object obj) {
        EGLSurface eGLSurface;
        if (this.f12533g == null) {
            this.f12533g = (EGL10) EGLContext.getEGL();
        }
        if (this.f12534h == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f12533g.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f12534h = eGLDisplayEglGetDisplay;
            if (!this.f12533g.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f12542p = -1;
                return;
            }
        }
        if (this.f12531e == null) {
            this.f12531e = new EGLConfig[1];
        }
        if (this.f12532f == null) {
            this.f12532f = new int[1];
        }
        EGL10 egl10 = this.f12533g;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f12534h, this.f12529c, this.f12531e, 1, this.f12532f)) {
                this.f12542p = -1;
                return;
            }
        } else if (!egl10.eglChooseConfig(this.f12534h, this.f12528b, this.f12531e, 1, this.f12532f)) {
            this.f12542p = -1;
            return;
        }
        EGLContext eGLContext = this.f12535i;
        EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        if (eGLContext == eGLContext2) {
            this.f12535i = this.f12533g.eglCreateContext(this.f12534h, this.f12531e[0], eGLContext2, this.f12530d);
            m11337a("eglCreateContext");
            if (this.f12535i == null) {
                this.f12542p = -1;
                return;
            }
        }
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (obj != null) {
            EGLSurface eGLSurface3 = this.f12536j;
            if (eGLSurface3 != eGLSurface2) {
                this.f12533g.eglDestroySurface(this.f12534h, eGLSurface3);
                this.f12536j = eGLSurface2;
            }
            if (this.f12536j == eGLSurface2) {
                try {
                    this.f12536j = this.f12533g.eglCreateWindowSurface(this.f12534h, this.f12531e[0], obj, null);
                    m11337a("eglCreateWindowSurface");
                    if (this.f12536j == null) {
                        this.f12542p = -1;
                        return;
                    }
                } catch (Exception unused) {
                    this.f12542p = -1;
                    Log.e("helpSurface", "eglCreateWindowSurface fail");
                    return;
                }
            }
            this.f12533g.eglQuerySurface(this.f12534h, this.f12536j, 12374, this.f12541o);
            this.f12533g.eglQuerySurface(this.f12534h, this.f12536j, 12375, this.f12540n);
            n8c.a("helpSurface", "mEGLSurface width = " + this.f12540n[0] + ";mEGLSurface hight =" + this.f12541o[0]);
        } else {
            int[] iArr = this.f12527a;
            if ((iArr[1] != this.f12543q || iArr[3] != this.f12544r) && (eGLSurface = this.f12537k) != eGLSurface2) {
                this.f12533g.eglDestroySurface(this.f12534h, eGLSurface);
                this.f12537k = eGLSurface2;
            }
            if (this.f12537k == eGLSurface2) {
                int[] iArr2 = this.f12527a;
                iArr2[1] = this.f12543q;
                iArr2[3] = this.f12544r;
                try {
                    this.f12537k = this.f12533g.eglCreatePbufferSurface(this.f12534h, this.f12531e[0], iArr2);
                    m11337a("eglCreatePbufferSurface");
                    if (this.f12537k == null) {
                        this.f12542p = -1;
                        return;
                    }
                } catch (Exception unused2) {
                    this.f12542p = -1;
                    Log.e("helpSurface", "eglCreatePbufferSurface fail");
                    return;
                }
            }
        }
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
    }

    /* JADX INFO: renamed from: f */
    private void m11339f() {
        if (this.f12533g == null) {
            this.f12542p = -1;
            return;
        }
        m11337a("before makeCurrent");
        EGLSurface eGLSurface = this.f12536j;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f12541o[0] == 0 || this.f12540n[0] == 0 || this.f12533g.eglMakeCurrent(this.f12534h, eGLSurface, eGLSurface, this.f12535i)) {
            return;
        }
        this.f12542p = -1;
    }

    /* JADX INFO: renamed from: i */
    private void m11340i() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f12547u = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        try {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12547u);
            this.f12538l = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.f12538l.setDefaultBufferSize(this.f12543q, this.f12544r);
            this.f12539m = new Surface(this.f12538l);
        } catch (Surface.OutOfResourcesException unused) {
            this.f12542p = -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public Surface m11341c() {
        return this.f12539m;
    }

    /* JADX INFO: renamed from: d */
    public SurfaceTexture m11342d() {
        return this.f12538l;
    }

    /* JADX INFO: renamed from: e */
    public int m11343e() {
        return this.f12547u;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m11344g() {
        try {
            Surface surface = this.f12539m;
            if (surface != null) {
                surface.release();
                this.f12539m = null;
            }
            EGL10 egl10 = this.f12533g;
            if (egl10 != null) {
                egl10.eglDestroySurface(this.f12534h, this.f12536j);
                this.f12533g.eglDestroySurface(this.f12534h, this.f12537k);
                if (this.f12533g.eglGetCurrentContext().equals(this.f12535i)) {
                    EGL10 egl11 = this.f12533g;
                    EGLDisplay eGLDisplay = this.f12534h;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                this.f12533g.eglDestroyContext(this.f12534h, this.f12535i);
                this.f12533g.eglTerminate(this.f12534h);
                this.f12533g = null;
            }
            this.f12534h = EGL10.EGL_NO_DISPLAY;
            this.f12535i = EGL10.EGL_NO_CONTEXT;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            this.f12536j = eGLSurface2;
            this.f12537k = eGLSurface2;
            this.f12533g = null;
            this.f12539m = null;
            this.f12538l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m11345h(MomoSurface momoSurface) {
        this.f12545s = momoSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        n8c.c("helpSurface", "new frame available");
        try {
            MomoSurface momoSurface = this.f12545s;
            if (momoSurface == null || this.f12546t) {
                return;
            }
            momoSurface.m10950i1(this.f12548v, surfaceTexture, this.f12547u, null);
        } catch (Exception unused) {
            n8c.c("helpSurface", "onFrameAvailable error");
        }
    }

    public helpSurface(SurfaceHolder surfaceHolder, int i, int i2) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f12536j = eGLSurface;
        this.f12537k = eGLSurface;
        this.f12540n = new int[1];
        this.f12541o = new int[1];
        this.f12542p = 0;
        this.f12547u = 0;
        this.f12548v = -1L;
        this.f12543q = i;
        this.f12544r = i2;
        this.f12546t = true;
        try {
            m11338b(surfaceHolder);
            m11339f();
            m11340i();
        } catch (IllegalArgumentException unused) {
            n8c.a("helpSurface", "eglSetup exception");
        }
    }
}
