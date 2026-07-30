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
import p149l.cn40;
import p149l.ig3;
import p149l.n8c;
import p149l.ts2;
import p149l.v1h0;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenSurface implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    private Object f208578A;

    /* JADX INFO: renamed from: B */
    private Object f208579B;

    /* JADX INFO: renamed from: C */
    private ScreenRender f208580C;

    /* JADX INFO: renamed from: D */
    private int[] f208581D;

    /* JADX INFO: renamed from: E */
    private int[] f208582E;

    /* JADX INFO: renamed from: F */
    private int f208583F;

    /* JADX INFO: renamed from: G */
    private int f208584G;

    /* JADX INFO: renamed from: H */
    private int f208585H;

    /* JADX INFO: renamed from: I */
    private VideoQuality f208586I;

    /* JADX INFO: renamed from: J */
    private long f208587J;

    /* JADX INFO: renamed from: K */
    private int[] f208588K;

    /* JADX INFO: renamed from: L */
    private volatile boolean f208589L;

    /* JADX INFO: renamed from: M */
    private volatile boolean f208590M;

    /* JADX INFO: renamed from: N */
    private volatile boolean f208591N;

    /* JADX INFO: renamed from: O */
    private volatile boolean f208592O;

    /* JADX INFO: renamed from: P */
    private volatile boolean f208593P;

    /* JADX INFO: renamed from: Q */
    private volatile int f208594Q;

    /* JADX INFO: renamed from: R */
    private volatile boolean f208595R;

    /* JADX INFO: renamed from: S */
    private volatile boolean f208596S;

    /* JADX INFO: renamed from: T */
    private PointF f208597T;

    /* JADX INFO: renamed from: a */
    public int f208598a;

    /* JADX INFO: renamed from: b */
    public int f208599b;

    /* JADX INFO: renamed from: c */
    long f208600c;

    /* JADX INFO: renamed from: d */
    long f208601d;

    /* JADX INFO: renamed from: e */
    long f208602e;

    /* JADX INFO: renamed from: f */
    long f208603f;

    /* JADX INFO: renamed from: g */
    int[] f208604g;

    /* JADX INFO: renamed from: h */
    int[] f208605h;

    /* JADX INFO: renamed from: i */
    int[] f208606i;

    /* JADX INFO: renamed from: j */
    int[] f208607j;

    /* JADX INFO: renamed from: k */
    EGLConfig[] f208608k;

    /* JADX INFO: renamed from: l */
    int[] f208609l;

    /* JADX INFO: renamed from: m */
    private EGL10 f208610m;

    /* JADX INFO: renamed from: n */
    private EGLDisplay f208611n;

    /* JADX INFO: renamed from: o */
    private EGLContext f208612o;

    /* JADX INFO: renamed from: p */
    private EGLSurface f208613p;

    /* JADX INFO: renamed from: q */
    private EGLSurface f208614q;

    /* JADX INFO: renamed from: r */
    private v1h0 f208615r;

    /* JADX INFO: renamed from: s */
    private volatile boolean f208616s;

    /* JADX INFO: renamed from: t */
    private SurfaceTexture f208617t;

    /* JADX INFO: renamed from: u */
    private Surface f208618u;

    /* JADX INFO: renamed from: v */
    private Surface f208619v;

    /* JADX INFO: renamed from: w */
    private ts2 f208620w;

    /* JADX INFO: renamed from: x */
    private Object f208621x;

    /* JADX INFO: renamed from: y */
    private Object f208622y;

    /* JADX INFO: renamed from: z */
    private volatile boolean f208623z;

    public interface FrameRateUpdateListener {
    }

    public interface PostDrawImageCallback {
    }

    public class RenderThread extends Thread {

        /* JADX INFO: renamed from: a */
        long f208624a;

        /* JADX INFO: renamed from: b */
        long f208625b;

        /* JADX INFO: renamed from: c */
        long f208626c;

        /* JADX INFO: renamed from: d */
        int f208627d;

        /* JADX INFO: renamed from: e */
        int f208628e;

        /* JADX INFO: renamed from: f */
        volatile boolean f208629f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ScreenSurface f208630g;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this.f208630g.f208579B) {
                this.f208630g.f208579B.notifyAll();
            }
            do {
                synchronized (this.f208630g.f208578A) {
                    try {
                        if (this.f208630g.f208590M) {
                            this.f208630g.m222530B();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            if (this.f208630g.f208613p != EGL10.EGL_NO_SURFACE) {
                                this.f208630g.f208610m.eglSwapBuffers(this.f208630g.f208611n, this.f208630g.f208613p);
                            }
                        }
                        if (this.f208630g.f208591N) {
                            this.f208630g.m222539L();
                        }
                        if (this.f208630g.f208592O) {
                            ScreenSurface screenSurface = this.f208630g;
                            screenSurface.m222531C(screenSurface.f208619v);
                            this.f208629f = true;
                        }
                        if (this.f208630g.f208593P) {
                            this.f208630g.m222538K();
                            this.f208629f = false;
                        }
                        this.f208630g.f208578A.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (this.f208630g.f208622y) {
                    if (!this.f208630g.f208623z) {
                        try {
                            this.f208630g.f208622y.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (this.f208630g.f208623z) {
                        this.f208630g.m222533F();
                        this.f208630g.f208623z = false;
                        this.f208627d++;
                        long jNanoTime = System.nanoTime() / 1000;
                        this.f208624a = jNanoTime;
                        int i = this.f208627d;
                        if (i > 3) {
                            this.f208628e = (int) (((long) this.f208628e) + (jNanoTime - this.f208625b));
                            this.f208626c++;
                        }
                        if (i > 20) {
                            long j = ((long) this.f208628e) / this.f208626c;
                            if (j > 0) {
                                this.f208630g.f208598a = (int) ((1000000 / j) + 1);
                            }
                            ScreenSurface screenSurface2 = this.f208630g;
                            int i2 = screenSurface2.f208598a;
                            if (i2 > 0) {
                                screenSurface2.f208599b = 1000 / i2;
                            }
                            n8c.m158485c("ScreenSurface", "Actual mRenderTime: " + this.f208630g.f208599b);
                            this.f208626c = 0L;
                            this.f208625b = 0L;
                            this.f208624a = 0L;
                            this.f208628e = 0;
                            this.f208627d = 0;
                        }
                        this.f208625b = this.f208624a;
                    }
                }
            } while (!this.f208630g.f208596S);
            if (this.f208630g.f208620w != null) {
                this.f208630g.f208620w.destroy();
                this.f208630g.f208620w = null;
            }
            if (this.f208630g.f208580C != null) {
                this.f208630g.f208580C.m222527x();
                this.f208630g.f208580C = null;
            }
            if (this.f208630g.f208610m != null) {
                this.f208630g.f208610m.eglDestroySurface(this.f208630g.f208611n, this.f208630g.f208613p);
                this.f208630g.f208610m.eglDestroySurface(this.f208630g.f208611n, this.f208630g.f208614q);
                if (this.f208630g.f208610m.eglGetCurrentContext().equals(this.f208630g.f208612o)) {
                    EGL10 egl10 = this.f208630g.f208610m;
                    EGLDisplay eGLDisplay = this.f208630g.f208611n;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                this.f208630g.f208610m.eglDestroyContext(this.f208630g.f208611n, this.f208630g.f208612o);
                this.f208630g.f208610m.eglTerminate(this.f208630g.f208611n);
                this.f208630g.f208610m = null;
            }
            this.f208630g.f208621x = null;
            synchronized (this.f208630g.f208578A) {
                this.f208630g.f208578A.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m222530B() {
        try {
            m222534G(this.f208621x);
            if (this.f208621x == null) {
                m222537J();
                this.f208589L = false;
            } else {
                m222536I();
                this.f208589L = true;
            }
            m222540N();
            this.f208590M = false;
        } catch (IllegalArgumentException unused) {
            n8c.m158483a("ScreenSurface", "activiteSurface_l eglSetup exception");
            this.f208589L = false;
            m222568M(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m222531C(Surface surface) {
        n8c.m158485c("ScreenSurface", "addMediaCodecSurface_l");
        synchronized (this.f208578A) {
            try {
                if (surface != null) {
                    this.f208615r = new v1h0(surface, 2, this.f208612o, null);
                } else {
                    this.f208616s = true;
                }
                this.f208592O = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private void m222532D(String str) {
        while (true) {
            int iEglGetError = this.f208610m.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            n8c.m158485c("ScreenSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            m222568M(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m222533F() {
        if (this.f208589L) {
            m222536I();
        } else {
            m222537J();
        }
        if (this.f208580C == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f208587J < 1000 / ((long) this.f208594Q)) {
            this.f208595R = true;
        } else {
            this.f208587J = System.currentTimeMillis();
            this.f208595R = false;
            n8c.m158485c("ScreenSurface", " drawImage codec:");
        }
        this.f208602e++;
        if (this.f208589L) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ScreenRender screenRender = this.f208580C;
            screenRender.m222522q(screenRender.m222526u(), this.f208617t);
            this.f208610m.eglSwapBuffers(this.f208611n, this.f208613p);
            if (this.f208602e < 20) {
                this.f208600c = (this.f208600c + System.currentTimeMillis()) - jCurrentTimeMillis2;
            } else {
                this.f208600c = System.currentTimeMillis() - jCurrentTimeMillis2;
                this.f208602e = 1L;
            }
            n8c.m158485c("ScreenSurface", " render to display use:" + (this.f208600c / this.f208602e));
            this.f208603f = this.f208603f + 1;
        } else {
            ScreenRender screenRender2 = this.f208580C;
            screenRender2.m222522q(screenRender2.m222526u(), this.f208617t);
        }
        if (this.f208615r != null) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (!this.f208595R) {
                this.f208615r.m196639c();
                this.f208580C.m222524s();
                this.f208615r.m196641e();
            }
            n8c.m158485c("ScreenSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis3));
            n8c.m158485c("ScreenSurface", " render to codecSurface use:" + (this.f208601d / this.f208602e));
            if (this.f208602e == 1) {
                this.f208601d = System.currentTimeMillis() - jCurrentTimeMillis3;
            } else {
                this.f208601d = (this.f208601d + System.currentTimeMillis()) - jCurrentTimeMillis3;
            }
        }
        if (this.f208616s && !this.f208595R) {
            m222537J();
            this.f208580C.m222523r();
        }
        n8c.m158485c("ScreenSurface", " draw and rend  use:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: G */
    private void m222534G(Object obj) {
        EGLConfig eGLConfigM222567E;
        if (this.f208610m == null) {
            this.f208610m = (EGL10) EGLContext.getEGL();
        }
        EGLSurface eGLSurface = this.f208613p;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f208610m.eglDestroySurface(this.f208611n, eGLSurface);
            this.f208610m.eglMakeCurrent(this.f208611n, eGLSurface2, eGLSurface2, eGLContext);
            this.f208613p = eGLSurface2;
        }
        if (this.f208611n == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f208610m.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f208611n = eGLDisplayEglGetDisplay;
            if (!this.f208610m.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f208583F = -1;
                return;
            }
        }
        if (this.f208608k == null) {
            this.f208608k = new EGLConfig[1];
        }
        if (this.f208609l == null) {
            this.f208609l = new int[1];
        }
        EGL10 egl10 = this.f208610m;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f208611n, this.f208606i, null, 0, this.f208609l)) {
                this.f208583F = -1;
                return;
            }
            int[] iArr = this.f208609l;
            int i = iArr[0];
            if (i <= 0) {
                ig3.m135964a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                this.f208610m.eglChooseConfig(this.f208611n, this.f208606i, eGLConfigArr, i, iArr);
                eGLConfigM222567E = m222567E(this.f208610m, this.f208611n, eGLConfigArr);
            }
        } else {
            if (!egl10.eglChooseConfig(this.f208611n, this.f208605h, null, 0, this.f208609l)) {
                this.f208583F = -1;
                return;
            }
            int[] iArr2 = this.f208609l;
            int i2 = iArr2[0];
            if (i2 <= 0) {
                ig3.m135964a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
                this.f208610m.eglChooseConfig(this.f208611n, this.f208605h, eGLConfigArr2, i2, iArr2);
                eGLConfigM222567E = m222567E(this.f208610m, this.f208611n, eGLConfigArr2);
            }
        }
        if (this.f208612o == eGLContext) {
            this.f208612o = this.f208610m.eglCreateContext(this.f208611n, eGLConfigM222567E, eGLContext, this.f208607j);
            m222532D("eglCreateContext");
            if (this.f208612o == null) {
                this.f208583F = -1;
                return;
            }
        }
        if (obj != null) {
            if (this.f208613p == eGLSurface2) {
                this.f208613p = this.f208610m.eglCreateWindowSurface(this.f208611n, eGLConfigM222567E, obj, null);
                m222532D("eglCreateWindowSurface");
                if (this.f208613p == null) {
                    this.f208583F = -1;
                    return;
                }
            }
            this.f208610m.eglQuerySurface(this.f208611n, this.f208613p, 12374, this.f208582E);
            this.f208610m.eglQuerySurface(this.f208611n, this.f208613p, 12375, this.f208581D);
            n8c.m158483a("ScreenSurface", "mEGLSurface width = " + this.f208581D[0] + ";mEGLSurface hight =" + this.f208582E[0]);
            return;
        }
        EGLSurface eGLSurface3 = this.f208614q;
        if (eGLSurface3 != eGLSurface2) {
            this.f208610m.eglDestroySurface(this.f208611n, eGLSurface3);
            this.f208614q = eGLSurface2;
        }
        int[] iArr3 = this.f208604g;
        iArr3[1] = this.f208584G;
        iArr3[3] = this.f208585H;
        n8c.m158483a("ScreenSurface", "mEGLDumpSurface width = " + this.f208604g[1] + ";mEGLDumpSurface hight =" + this.f208604g[3]);
        if (this.f208614q == eGLSurface2) {
            this.f208614q = this.f208610m.eglCreatePbufferSurface(this.f208611n, eGLConfigM222567E, this.f208604g);
            m222532D("eglCreatePbufferSurface");
            if (this.f208614q == null) {
                this.f208583F = -1;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private int m222535H(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f208588K) ? this.f208588K[0] : i2;
    }

    /* JADX INFO: renamed from: I */
    private void m222536I() {
        if (this.f208610m == null) {
            this.f208583F = -1;
            return;
        }
        m222532D("before makeCurrent");
        EGLSurface eGLSurface = this.f208613p;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f208582E[0] == 0 || this.f208581D[0] == 0 || this.f208610m.eglMakeCurrent(this.f208611n, eGLSurface, eGLSurface, this.f208612o)) {
            return;
        }
        this.f208583F = -1;
    }

    /* JADX INFO: renamed from: J */
    private void m222537J() {
        if (this.f208610m == null) {
            this.f208583F = -1;
            return;
        }
        m222532D("before makeUnCurrent");
        EGLSurface eGLSurface = this.f208614q;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f208610m.eglMakeCurrent(this.f208611n, eGLSurface, eGLSurface, this.f208612o)) {
            return;
        }
        this.f208583F = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m222538K() {
        n8c.m158485c("ScreenSurface", "removeMediaCodecSurface_l");
        synchronized (this.f208578A) {
            try {
                v1h0 v1h0Var = this.f208615r;
                if (v1h0Var != null) {
                    v1h0Var.m196640d();
                    this.f208615r = null;
                }
                this.f208593P = false;
                this.f208616s = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m222539L() {
        ts2 ts2Var;
        ScreenRender screenRender = this.f208580C;
        if (screenRender != null && (ts2Var = this.f208620w) != null) {
            screenRender.m222528z(ts2Var);
        }
        this.f208591N = false;
    }

    /* JADX INFO: renamed from: N */
    private void m222540N() {
        if (this.f208580C == null) {
            ScreenRender screenRender = new ScreenRender(new cn40(), this.f208586I);
            this.f208580C = screenRender;
            screenRender.m222519B();
            this.f208580C.m222518A(this.f208597T);
            n8c.m158483a("ScreenSurface", "textureID=" + this.f208580C.m222526u());
            try {
                SurfaceTexture surfaceTextureM222525t = this.f208580C.m222525t();
                this.f208617t = surfaceTextureM222525t;
                surfaceTextureM222525t.setDefaultBufferSize(this.f208584G, this.f208585H);
                this.f208617t.setOnFrameAvailableListener(this);
                this.f208618u = new Surface(this.f208617t);
            } catch (Surface.OutOfResourcesException unused) {
                this.f208583F = -1;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public EGLConfig m222567E(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i = 0;
        while (i < length) {
            EGLConfig eGLConfig = eGLConfigArr[i];
            ScreenSurface screenSurface = this;
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iM222535H = screenSurface.m222535H(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iM222535H2 = screenSurface.m222535H(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iM222535H >= 0 && iM222535H2 >= 0) {
                int iM222535H3 = screenSurface.m222535H(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iM222535H4 = screenSurface.m222535H(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iM222535H5 = screenSurface.m222535H(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iM222535H6 = screenSurface.m222535H(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iM222535H3 == 8 && iM222535H4 == 8 && iM222535H5 == 8 && iM222535H6 == 8) {
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
    public void m222568M(int i) {
        this.f208583F = i;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        n8c.m158485c("ScreenSurface", "new frame available");
        synchronized (this.f208622y) {
            this.f208623z = true;
            this.f208622y.notifyAll();
        }
    }
}
