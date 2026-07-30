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
import p153l.t9c;
import tv.danmaku.ijk.media.streamer.MomoSurface;

/* JADX INFO: loaded from: classes3.dex */
public class helpSurface implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    int[] f209824a = {12375, 640, 12374, 352, 12344};

    /* JADX INFO: renamed from: b */
    int[] f209825b = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: c */
    int[] f209826c = {12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};

    /* JADX INFO: renamed from: d */
    int[] f209827d = {12440, 2, 12344};

    /* JADX INFO: renamed from: e */
    EGLConfig[] f209828e = null;

    /* JADX INFO: renamed from: f */
    int[] f209829f = null;

    /* JADX INFO: renamed from: g */
    private EGL10 f209830g = null;

    /* JADX INFO: renamed from: h */
    private EGLDisplay f209831h = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: i */
    private EGLContext f209832i = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: j */
    private EGLSurface f209833j;

    /* JADX INFO: renamed from: k */
    private EGLSurface f209834k;

    /* JADX INFO: renamed from: l */
    private SurfaceTexture f209835l;

    /* JADX INFO: renamed from: m */
    private Surface f209836m;

    /* JADX INFO: renamed from: n */
    private int[] f209837n;

    /* JADX INFO: renamed from: o */
    private int[] f209838o;

    /* JADX INFO: renamed from: p */
    private int f209839p;

    /* JADX INFO: renamed from: q */
    private int f209840q;

    /* JADX INFO: renamed from: r */
    private int f209841r;

    /* JADX INFO: renamed from: s */
    private MomoSurface f209842s;

    /* JADX INFO: renamed from: t */
    private boolean f209843t;

    /* JADX INFO: renamed from: u */
    int f209844u;

    /* JADX INFO: renamed from: v */
    long f209845v;

    public helpSurface(SurfaceHolder surfaceHolder, long j) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f209833j = eGLSurface;
        this.f209834k = eGLSurface;
        this.f209837n = new int[1];
        this.f209838o = new int[1];
        this.f209839p = 0;
        this.f209840q = 16;
        this.f209841r = 16;
        this.f209843t = false;
        this.f209844u = 0;
        this.f209845v = -1L;
        try {
            m224113b(surfaceHolder);
            m224114f();
            m224115i();
            this.f209845v = j;
        } catch (IllegalArgumentException unused) {
            t9c.m189743a("helpSurface", "eglSetup exception");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m224112a(String str) {
        while (true) {
            int iEglGetError = this.f209830g.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            t9c.m189745c("helpSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
        }
    }

    /* JADX INFO: renamed from: b */
    private void m224113b(Object obj) {
        EGLSurface eGLSurface;
        if (this.f209830g == null) {
            this.f209830g = (EGL10) EGLContext.getEGL();
        }
        if (this.f209831h == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f209830g.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f209831h = eGLDisplayEglGetDisplay;
            if (!this.f209830g.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f209839p = -1;
                return;
            }
        }
        if (this.f209828e == null) {
            this.f209828e = new EGLConfig[1];
        }
        if (this.f209829f == null) {
            this.f209829f = new int[1];
        }
        EGL10 egl10 = this.f209830g;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f209831h, this.f209826c, this.f209828e, 1, this.f209829f)) {
                this.f209839p = -1;
                return;
            }
        } else if (!egl10.eglChooseConfig(this.f209831h, this.f209825b, this.f209828e, 1, this.f209829f)) {
            this.f209839p = -1;
            return;
        }
        EGLContext eGLContext = this.f209832i;
        EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
        if (eGLContext == eGLContext2) {
            this.f209832i = this.f209830g.eglCreateContext(this.f209831h, this.f209828e[0], eGLContext2, this.f209827d);
            m224112a("eglCreateContext");
            if (this.f209832i == null) {
                this.f209839p = -1;
                return;
            }
        }
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (obj != null) {
            EGLSurface eGLSurface3 = this.f209833j;
            if (eGLSurface3 != eGLSurface2) {
                this.f209830g.eglDestroySurface(this.f209831h, eGLSurface3);
                this.f209833j = eGLSurface2;
            }
            if (this.f209833j == eGLSurface2) {
                try {
                    this.f209833j = this.f209830g.eglCreateWindowSurface(this.f209831h, this.f209828e[0], obj, null);
                    m224112a("eglCreateWindowSurface");
                    if (this.f209833j == null) {
                        this.f209839p = -1;
                        return;
                    }
                } catch (Exception unused) {
                    this.f209839p = -1;
                    Log.e("helpSurface", "eglCreateWindowSurface fail");
                    return;
                }
            }
            this.f209830g.eglQuerySurface(this.f209831h, this.f209833j, 12374, this.f209838o);
            this.f209830g.eglQuerySurface(this.f209831h, this.f209833j, 12375, this.f209837n);
            t9c.m189743a("helpSurface", "mEGLSurface width = " + this.f209837n[0] + ";mEGLSurface hight =" + this.f209838o[0]);
        } else {
            int[] iArr = this.f209824a;
            if ((iArr[1] != this.f209840q || iArr[3] != this.f209841r) && (eGLSurface = this.f209834k) != eGLSurface2) {
                this.f209830g.eglDestroySurface(this.f209831h, eGLSurface);
                this.f209834k = eGLSurface2;
            }
            if (this.f209834k == eGLSurface2) {
                int[] iArr2 = this.f209824a;
                iArr2[1] = this.f209840q;
                iArr2[3] = this.f209841r;
                try {
                    this.f209834k = this.f209830g.eglCreatePbufferSurface(this.f209831h, this.f209828e[0], iArr2);
                    m224112a("eglCreatePbufferSurface");
                    if (this.f209834k == null) {
                        this.f209839p = -1;
                        return;
                    }
                } catch (Exception unused2) {
                    this.f209839p = -1;
                    Log.e("helpSurface", "eglCreatePbufferSurface fail");
                    return;
                }
            }
        }
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
    }

    /* JADX INFO: renamed from: f */
    private void m224114f() {
        if (this.f209830g == null) {
            this.f209839p = -1;
            return;
        }
        m224112a("before makeCurrent");
        EGLSurface eGLSurface = this.f209833j;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f209838o[0] == 0 || this.f209837n[0] == 0 || this.f209830g.eglMakeCurrent(this.f209831h, eGLSurface, eGLSurface, this.f209832i)) {
            return;
        }
        this.f209839p = -1;
    }

    /* JADX INFO: renamed from: i */
    private void m224115i() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f209844u = i;
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        try {
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f209844u);
            this.f209835l = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            this.f209835l.setDefaultBufferSize(this.f209840q, this.f209841r);
            this.f209836m = new Surface(this.f209835l);
        } catch (Surface.OutOfResourcesException unused) {
            this.f209839p = -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public Surface m224116c() {
        return this.f209836m;
    }

    /* JADX INFO: renamed from: d */
    public SurfaceTexture m224117d() {
        return this.f209835l;
    }

    /* JADX INFO: renamed from: e */
    public int m224118e() {
        return this.f209844u;
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m224119g() {
        try {
            Surface surface = this.f209836m;
            if (surface != null) {
                surface.release();
                this.f209836m = null;
            }
            EGL10 egl10 = this.f209830g;
            if (egl10 != null) {
                egl10.eglDestroySurface(this.f209831h, this.f209833j);
                this.f209830g.eglDestroySurface(this.f209831h, this.f209834k);
                if (this.f209830g.eglGetCurrentContext().equals(this.f209832i)) {
                    EGL10 egl11 = this.f209830g;
                    EGLDisplay eGLDisplay = this.f209831h;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                this.f209830g.eglDestroyContext(this.f209831h, this.f209832i);
                this.f209830g.eglTerminate(this.f209831h);
                this.f209830g = null;
            }
            this.f209831h = EGL10.EGL_NO_DISPLAY;
            this.f209832i = EGL10.EGL_NO_CONTEXT;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            this.f209833j = eGLSurface2;
            this.f209834k = eGLSurface2;
            this.f209830g = null;
            this.f209836m = null;
            this.f209835l = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m224120h(MomoSurface momoSurface) {
        this.f209842s = momoSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        t9c.m189745c("helpSurface", "new frame available");
        try {
            MomoSurface momoSurface = this.f209842s;
            if (momoSurface == null || this.f209843t) {
                return;
            }
            momoSurface.m223725i1(this.f209845v, surfaceTexture, this.f209844u, null);
        } catch (Exception unused) {
            t9c.m189745c("helpSurface", "onFrameAvailable error");
        }
    }

    public helpSurface(SurfaceHolder surfaceHolder, int i, int i2) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f209833j = eGLSurface;
        this.f209834k = eGLSurface;
        this.f209837n = new int[1];
        this.f209838o = new int[1];
        this.f209839p = 0;
        this.f209844u = 0;
        this.f209845v = -1L;
        this.f209840q = i;
        this.f209841r = i2;
        this.f209843t = true;
        try {
            m224113b(surfaceHolder);
            m224114f();
            m224115i();
        } catch (IllegalArgumentException unused) {
            t9c.m189743a("helpSurface", "eglSetup exception");
        }
    }
}
