package tv.danmaku.ijk.media.streamer;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.immomo.mediacore.strinf.VideoQuality;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import l.ig3;
import l.n8c;
import p003l.cn40;
import p003l.ts2;
import p003l.v1h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ScreenSurface implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    private Object f12203A;

    /* JADX INFO: renamed from: B */
    private Object f12204B;

    /* JADX INFO: renamed from: C */
    private ScreenRender f12205C;

    /* JADX INFO: renamed from: D */
    private int[] f12206D;

    /* JADX INFO: renamed from: E */
    private int[] f12207E;

    /* JADX INFO: renamed from: F */
    private int f12208F;

    /* JADX INFO: renamed from: G */
    private int f12209G;

    /* JADX INFO: renamed from: H */
    private int f12210H;

    /* JADX INFO: renamed from: I */
    private VideoQuality f12211I;

    /* JADX INFO: renamed from: J */
    private long f12212J;

    /* JADX INFO: renamed from: K */
    private int[] f12213K;

    /* JADX INFO: renamed from: L */
    private volatile boolean f12214L;

    /* JADX INFO: renamed from: M */
    private volatile boolean f12215M;

    /* JADX INFO: renamed from: N */
    private volatile boolean f12216N;

    /* JADX INFO: renamed from: O */
    private volatile boolean f12217O;

    /* JADX INFO: renamed from: P */
    private volatile boolean f12218P;

    /* JADX INFO: renamed from: Q */
    private volatile int f12219Q;

    /* JADX INFO: renamed from: R */
    private volatile boolean f12220R;

    /* JADX INFO: renamed from: S */
    private volatile boolean f12221S;

    /* JADX INFO: renamed from: T */
    private PointF f12222T;

    /* JADX INFO: renamed from: a */
    public int f12223a;

    /* JADX INFO: renamed from: b */
    public int f12224b;

    /* JADX INFO: renamed from: c */
    long f12225c;

    /* JADX INFO: renamed from: d */
    long f12226d;

    /* JADX INFO: renamed from: e */
    long f12227e;

    /* JADX INFO: renamed from: f */
    long f12228f;

    /* JADX INFO: renamed from: g */
    int[] f12229g;

    /* JADX INFO: renamed from: h */
    int[] f12230h;

    /* JADX INFO: renamed from: i */
    int[] f12231i;

    /* JADX INFO: renamed from: j */
    int[] f12232j;

    /* JADX INFO: renamed from: k */
    EGLConfig[] f12233k;

    /* JADX INFO: renamed from: l */
    int[] f12234l;

    /* JADX INFO: renamed from: m */
    private EGL10 f12235m;

    /* JADX INFO: renamed from: n */
    private EGLDisplay f12236n;

    /* JADX INFO: renamed from: o */
    private EGLContext f12237o;

    /* JADX INFO: renamed from: p */
    private EGLSurface f12238p;

    /* JADX INFO: renamed from: q */
    private EGLSurface f12239q;

    /* JADX INFO: renamed from: r */
    private v1h0 f12240r;

    /* JADX INFO: renamed from: s */
    private volatile boolean f12241s;

    /* JADX INFO: renamed from: t */
    private SurfaceTexture f12242t;

    /* JADX INFO: renamed from: u */
    private Surface f12243u;

    /* JADX INFO: renamed from: v */
    private Surface f12244v;

    /* JADX INFO: renamed from: w */
    private ts2 f12245w;

    /* JADX INFO: renamed from: x */
    private Object f12246x;

    /* JADX INFO: renamed from: y */
    private Object f12247y;

    /* JADX INFO: renamed from: z */
    private volatile boolean f12248z;

    public interface FrameRateUpdateListener {
    }

    public interface PostDrawImageCallback {
    }

    public class RenderThread extends Thread {

        /* JADX INFO: renamed from: a */
        long f12249a;

        /* JADX INFO: renamed from: b */
        long f12250b;

        /* JADX INFO: renamed from: c */
        long f12251c;

        /* JADX INFO: renamed from: d */
        int f12252d;

        /* JADX INFO: renamed from: e */
        int f12253e;

        /* JADX INFO: renamed from: f */
        volatile boolean f12254f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ScreenSurface f12255g;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this.f12255g.f12204B) {
                this.f12255g.f12204B.notifyAll();
            }
            do {
                synchronized (this.f12255g.f12203A) {
                    try {
                        if (this.f12255g.f12215M) {
                            this.f12255g.m11001B();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            if (this.f12255g.f12238p != EGL10.EGL_NO_SURFACE) {
                                this.f12255g.f12235m.eglSwapBuffers(this.f12255g.f12236n, this.f12255g.f12238p);
                            }
                        }
                        if (this.f12255g.f12216N) {
                            this.f12255g.m11010L();
                        }
                        if (this.f12255g.f12217O) {
                            ScreenSurface screenSurface = this.f12255g;
                            screenSurface.m11002C(screenSurface.f12244v);
                            this.f12254f = true;
                        }
                        if (this.f12255g.f12218P) {
                            this.f12255g.m11009K();
                            this.f12254f = false;
                        }
                        this.f12255g.f12203A.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (this.f12255g.f12247y) {
                    if (!this.f12255g.f12248z) {
                        try {
                            this.f12255g.f12247y.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (this.f12255g.f12248z) {
                        this.f12255g.m11004F();
                        this.f12255g.f12248z = false;
                        this.f12252d++;
                        long jNanoTime = System.nanoTime() / 1000;
                        this.f12249a = jNanoTime;
                        int i = this.f12252d;
                        if (i > 3) {
                            this.f12253e = (int) (((long) this.f12253e) + (jNanoTime - this.f12250b));
                            this.f12251c++;
                        }
                        if (i > 20) {
                            long j = ((long) this.f12253e) / this.f12251c;
                            if (j > 0) {
                                this.f12255g.f12223a = (int) ((1000000 / j) + 1);
                            }
                            ScreenSurface screenSurface2 = this.f12255g;
                            int i2 = screenSurface2.f12223a;
                            if (i2 > 0) {
                                screenSurface2.f12224b = 1000 / i2;
                            }
                            n8c.c("ScreenSurface", "Actual mRenderTime: " + this.f12255g.f12224b);
                            this.f12251c = 0L;
                            this.f12250b = 0L;
                            this.f12249a = 0L;
                            this.f12253e = 0;
                            this.f12252d = 0;
                        }
                        this.f12250b = this.f12249a;
                    }
                }
            } while (!this.f12255g.f12221S);
            if (this.f12255g.f12245w != null) {
                this.f12255g.f12245w.destroy();
                this.f12255g.f12245w = null;
            }
            if (this.f12255g.f12205C != null) {
                this.f12255g.f12205C.m10998x();
                this.f12255g.f12205C = null;
            }
            if (this.f12255g.f12235m != null) {
                this.f12255g.f12235m.eglDestroySurface(this.f12255g.f12236n, this.f12255g.f12238p);
                this.f12255g.f12235m.eglDestroySurface(this.f12255g.f12236n, this.f12255g.f12239q);
                if (this.f12255g.f12235m.eglGetCurrentContext().equals(this.f12255g.f12237o)) {
                    EGL10 egl10 = this.f12255g.f12235m;
                    EGLDisplay eGLDisplay = this.f12255g.f12236n;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                this.f12255g.f12235m.eglDestroyContext(this.f12255g.f12236n, this.f12255g.f12237o);
                this.f12255g.f12235m.eglTerminate(this.f12255g.f12236n);
                this.f12255g.f12235m = null;
            }
            this.f12255g.f12246x = null;
            synchronized (this.f12255g.f12203A) {
                this.f12255g.f12203A.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m11001B() {
        try {
            m11005G(this.f12246x);
            if (this.f12246x == null) {
                m11008J();
                this.f12214L = false;
            } else {
                m11007I();
                this.f12214L = true;
            }
            m11011N();
            this.f12215M = false;
        } catch (IllegalArgumentException unused) {
            n8c.a("ScreenSurface", "activiteSurface_l eglSetup exception");
            this.f12214L = false;
            m11039M(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m11002C(Surface surface) {
        n8c.c("ScreenSurface", "addMediaCodecSurface_l");
        synchronized (this.f12203A) {
            try {
                if (surface != null) {
                    this.f12240r = new v1h0(surface, 2, this.f12237o, null);
                } else {
                    this.f12241s = true;
                }
                this.f12217O = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private void m11003D(String str) {
        while (true) {
            int iEglGetError = this.f12235m.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            n8c.c("ScreenSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            m11039M(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m11004F() {
        if (this.f12214L) {
            m11007I();
        } else {
            m11008J();
        }
        if (this.f12205C == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f12212J < 1000 / ((long) this.f12219Q)) {
            this.f12220R = true;
        } else {
            this.f12212J = System.currentTimeMillis();
            this.f12220R = false;
            n8c.c("ScreenSurface", " drawImage codec:");
        }
        this.f12227e++;
        if (this.f12214L) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ScreenRender screenRender = this.f12205C;
            screenRender.m10993q(screenRender.m10997u(), this.f12242t);
            this.f12235m.eglSwapBuffers(this.f12236n, this.f12238p);
            if (this.f12227e < 20) {
                this.f12225c = (this.f12225c + System.currentTimeMillis()) - jCurrentTimeMillis2;
            } else {
                this.f12225c = System.currentTimeMillis() - jCurrentTimeMillis2;
                this.f12227e = 1L;
            }
            n8c.c("ScreenSurface", " render to display use:" + (this.f12225c / this.f12227e));
            this.f12228f = this.f12228f + 1;
        } else {
            ScreenRender screenRender2 = this.f12205C;
            screenRender2.m10993q(screenRender2.m10997u(), this.f12242t);
        }
        if (this.f12240r != null) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (!this.f12220R) {
                this.f12240r.m8272c();
                this.f12205C.m10995s();
                this.f12240r.m8274e();
            }
            n8c.c("ScreenSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis3));
            n8c.c("ScreenSurface", " render to codecSurface use:" + (this.f12226d / this.f12227e));
            if (this.f12227e == 1) {
                this.f12226d = System.currentTimeMillis() - jCurrentTimeMillis3;
            } else {
                this.f12226d = (this.f12226d + System.currentTimeMillis()) - jCurrentTimeMillis3;
            }
        }
        if (this.f12241s && !this.f12220R) {
            m11008J();
            this.f12205C.m10994r();
        }
        n8c.c("ScreenSurface", " draw and rend  use:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: G */
    private void m11005G(Object obj) {
        EGLConfig eGLConfigM11038E;
        if (this.f12235m == null) {
            this.f12235m = (EGL10) EGLContext.getEGL();
        }
        EGLSurface eGLSurface = this.f12238p;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f12235m.eglDestroySurface(this.f12236n, eGLSurface);
            this.f12235m.eglMakeCurrent(this.f12236n, eGLSurface2, eGLSurface2, eGLContext);
            this.f12238p = eGLSurface2;
        }
        if (this.f12236n == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f12235m.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f12236n = eGLDisplayEglGetDisplay;
            if (!this.f12235m.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f12208F = -1;
                return;
            }
        }
        if (this.f12233k == null) {
            this.f12233k = new EGLConfig[1];
        }
        if (this.f12234l == null) {
            this.f12234l = new int[1];
        }
        EGL10 egl10 = this.f12235m;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f12236n, this.f12231i, null, 0, this.f12234l)) {
                this.f12208F = -1;
                return;
            }
            int[] iArr = this.f12234l;
            int i = iArr[0];
            if (i <= 0) {
                ig3.a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                this.f12235m.eglChooseConfig(this.f12236n, this.f12231i, eGLConfigArr, i, iArr);
                eGLConfigM11038E = m11038E(this.f12235m, this.f12236n, eGLConfigArr);
            }
        } else {
            if (!egl10.eglChooseConfig(this.f12236n, this.f12230h, null, 0, this.f12234l)) {
                this.f12208F = -1;
                return;
            }
            int[] iArr2 = this.f12234l;
            int i2 = iArr2[0];
            if (i2 <= 0) {
                ig3.a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
                this.f12235m.eglChooseConfig(this.f12236n, this.f12230h, eGLConfigArr2, i2, iArr2);
                eGLConfigM11038E = m11038E(this.f12235m, this.f12236n, eGLConfigArr2);
            }
        }
        if (this.f12237o == eGLContext) {
            this.f12237o = this.f12235m.eglCreateContext(this.f12236n, eGLConfigM11038E, eGLContext, this.f12232j);
            m11003D("eglCreateContext");
            if (this.f12237o == null) {
                this.f12208F = -1;
                return;
            }
        }
        if (obj != null) {
            if (this.f12238p == eGLSurface2) {
                this.f12238p = this.f12235m.eglCreateWindowSurface(this.f12236n, eGLConfigM11038E, obj, null);
                m11003D("eglCreateWindowSurface");
                if (this.f12238p == null) {
                    this.f12208F = -1;
                    return;
                }
            }
            this.f12235m.eglQuerySurface(this.f12236n, this.f12238p, 12374, this.f12207E);
            this.f12235m.eglQuerySurface(this.f12236n, this.f12238p, 12375, this.f12206D);
            n8c.a("ScreenSurface", "mEGLSurface width = " + this.f12206D[0] + ";mEGLSurface hight =" + this.f12207E[0]);
            return;
        }
        EGLSurface eGLSurface3 = this.f12239q;
        if (eGLSurface3 != eGLSurface2) {
            this.f12235m.eglDestroySurface(this.f12236n, eGLSurface3);
            this.f12239q = eGLSurface2;
        }
        int[] iArr3 = this.f12229g;
        iArr3[1] = this.f12209G;
        iArr3[3] = this.f12210H;
        n8c.a("ScreenSurface", "mEGLDumpSurface width = " + this.f12229g[1] + ";mEGLDumpSurface hight =" + this.f12229g[3]);
        if (this.f12239q == eGLSurface2) {
            this.f12239q = this.f12235m.eglCreatePbufferSurface(this.f12236n, eGLConfigM11038E, this.f12229g);
            m11003D("eglCreatePbufferSurface");
            if (this.f12239q == null) {
                this.f12208F = -1;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private int m11006H(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f12213K) ? this.f12213K[0] : i2;
    }

    /* JADX INFO: renamed from: I */
    private void m11007I() {
        if (this.f12235m == null) {
            this.f12208F = -1;
            return;
        }
        m11003D("before makeCurrent");
        EGLSurface eGLSurface = this.f12238p;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f12207E[0] == 0 || this.f12206D[0] == 0 || this.f12235m.eglMakeCurrent(this.f12236n, eGLSurface, eGLSurface, this.f12237o)) {
            return;
        }
        this.f12208F = -1;
    }

    /* JADX INFO: renamed from: J */
    private void m11008J() {
        if (this.f12235m == null) {
            this.f12208F = -1;
            return;
        }
        m11003D("before makeUnCurrent");
        EGLSurface eGLSurface = this.f12239q;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f12235m.eglMakeCurrent(this.f12236n, eGLSurface, eGLSurface, this.f12237o)) {
            return;
        }
        this.f12208F = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m11009K() {
        n8c.c("ScreenSurface", "removeMediaCodecSurface_l");
        synchronized (this.f12203A) {
            try {
                v1h0 v1h0Var = this.f12240r;
                if (v1h0Var != null) {
                    v1h0Var.m8273d();
                    this.f12240r = null;
                }
                this.f12218P = false;
                this.f12241s = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m11010L() {
        ts2 ts2Var;
        ScreenRender screenRender = this.f12205C;
        if (screenRender != null && (ts2Var = this.f12245w) != null) {
            screenRender.m10999z(ts2Var);
        }
        this.f12216N = false;
    }

    /* JADX INFO: renamed from: N */
    private void m11011N() {
        if (this.f12205C == null) {
            ScreenRender screenRender = new ScreenRender(new cn40(), this.f12211I);
            this.f12205C = screenRender;
            screenRender.m10990B();
            this.f12205C.m10989A(this.f12222T);
            n8c.a("ScreenSurface", "textureID=" + this.f12205C.m10997u());
            try {
                SurfaceTexture surfaceTextureM10996t = this.f12205C.m10996t();
                this.f12242t = surfaceTextureM10996t;
                surfaceTextureM10996t.setDefaultBufferSize(this.f12209G, this.f12210H);
                this.f12242t.setOnFrameAvailableListener(this);
                this.f12243u = new Surface(this.f12242t);
            } catch (Surface.OutOfResourcesException unused) {
                this.f12208F = -1;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public EGLConfig m11038E(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i = 0;
        while (i < length) {
            EGLConfig eGLConfig = eGLConfigArr[i];
            ScreenSurface screenSurface = this;
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iM11006H = screenSurface.m11006H(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iM11006H2 = screenSurface.m11006H(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iM11006H >= 0 && iM11006H2 >= 0) {
                int iM11006H3 = screenSurface.m11006H(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iM11006H4 = screenSurface.m11006H(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iM11006H5 = screenSurface.m11006H(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iM11006H6 = screenSurface.m11006H(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iM11006H3 == 8 && iM11006H4 == 8 && iM11006H5 == 8 && iM11006H6 == 8) {
                    return eGLConfig;
                }
            }
            i++;
            this = screenSurface;
            egl10 = egl11;
            eGLDisplay = eGLDisplay2;
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public void m11039M(int i) {
        this.f12208F = i;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        n8c.c("ScreenSurface", "new frame available");
        synchronized (this.f12247y) {
            this.f12248z = true;
            this.f12247y.notifyAll();
        }
    }
}
