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
import p153l.dah0;
import p153l.jt2;
import p153l.qv40;
import p153l.t9c;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenSurface implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: A */
    private Object f209500A;

    /* JADX INFO: renamed from: B */
    private Object f209501B;

    /* JADX INFO: renamed from: C */
    private ScreenRender f209502C;

    /* JADX INFO: renamed from: D */
    private int[] f209503D;

    /* JADX INFO: renamed from: E */
    private int[] f209504E;

    /* JADX INFO: renamed from: F */
    private int f209505F;

    /* JADX INFO: renamed from: G */
    private int f209506G;

    /* JADX INFO: renamed from: H */
    private int f209507H;

    /* JADX INFO: renamed from: I */
    private VideoQuality f209508I;

    /* JADX INFO: renamed from: J */
    private long f209509J;

    /* JADX INFO: renamed from: K */
    private int[] f209510K;

    /* JADX INFO: renamed from: L */
    private volatile boolean f209511L;

    /* JADX INFO: renamed from: M */
    private volatile boolean f209512M;

    /* JADX INFO: renamed from: N */
    private volatile boolean f209513N;

    /* JADX INFO: renamed from: O */
    private volatile boolean f209514O;

    /* JADX INFO: renamed from: P */
    private volatile boolean f209515P;

    /* JADX INFO: renamed from: Q */
    private volatile int f209516Q;

    /* JADX INFO: renamed from: R */
    private volatile boolean f209517R;

    /* JADX INFO: renamed from: S */
    private volatile boolean f209518S;

    /* JADX INFO: renamed from: T */
    private PointF f209519T;

    /* JADX INFO: renamed from: a */
    public int f209520a;

    /* JADX INFO: renamed from: b */
    public int f209521b;

    /* JADX INFO: renamed from: c */
    long f209522c;

    /* JADX INFO: renamed from: d */
    long f209523d;

    /* JADX INFO: renamed from: e */
    long f209524e;

    /* JADX INFO: renamed from: f */
    long f209525f;

    /* JADX INFO: renamed from: g */
    int[] f209526g;

    /* JADX INFO: renamed from: h */
    int[] f209527h;

    /* JADX INFO: renamed from: i */
    int[] f209528i;

    /* JADX INFO: renamed from: j */
    int[] f209529j;

    /* JADX INFO: renamed from: k */
    EGLConfig[] f209530k;

    /* JADX INFO: renamed from: l */
    int[] f209531l;

    /* JADX INFO: renamed from: m */
    private EGL10 f209532m;

    /* JADX INFO: renamed from: n */
    private EGLDisplay f209533n;

    /* JADX INFO: renamed from: o */
    private EGLContext f209534o;

    /* JADX INFO: renamed from: p */
    private EGLSurface f209535p;

    /* JADX INFO: renamed from: q */
    private EGLSurface f209536q;

    /* JADX INFO: renamed from: r */
    private dah0 f209537r;

    /* JADX INFO: renamed from: s */
    private volatile boolean f209538s;

    /* JADX INFO: renamed from: t */
    private SurfaceTexture f209539t;

    /* JADX INFO: renamed from: u */
    private Surface f209540u;

    /* JADX INFO: renamed from: v */
    private Surface f209541v;

    /* JADX INFO: renamed from: w */
    private jt2 f209542w;

    /* JADX INFO: renamed from: x */
    private Object f209543x;

    /* JADX INFO: renamed from: y */
    private Object f209544y;

    /* JADX INFO: renamed from: z */
    private volatile boolean f209545z;

    public interface FrameRateUpdateListener {
    }

    public interface PostDrawImageCallback {
    }

    public class RenderThread extends Thread {

        /* JADX INFO: renamed from: a */
        long f209546a;

        /* JADX INFO: renamed from: b */
        long f209547b;

        /* JADX INFO: renamed from: c */
        long f209548c;

        /* JADX INFO: renamed from: d */
        int f209549d;

        /* JADX INFO: renamed from: e */
        int f209550e;

        /* JADX INFO: renamed from: f */
        volatile boolean f209551f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ScreenSurface f209552g;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (this.f209552g.f209501B) {
                this.f209552g.f209501B.notifyAll();
            }
            do {
                synchronized (this.f209552g.f209500A) {
                    try {
                        if (this.f209552g.f209512M) {
                            this.f209552g.m223776B();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            if (this.f209552g.f209535p != EGL10.EGL_NO_SURFACE) {
                                this.f209552g.f209532m.eglSwapBuffers(this.f209552g.f209533n, this.f209552g.f209535p);
                            }
                        }
                        if (this.f209552g.f209513N) {
                            this.f209552g.m223785L();
                        }
                        if (this.f209552g.f209514O) {
                            ScreenSurface screenSurface = this.f209552g;
                            screenSurface.m223777C(screenSurface.f209541v);
                            this.f209551f = true;
                        }
                        if (this.f209552g.f209515P) {
                            this.f209552g.m223784K();
                            this.f209551f = false;
                        }
                        this.f209552g.f209500A.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (this.f209552g.f209544y) {
                    if (!this.f209552g.f209545z) {
                        try {
                            this.f209552g.f209544y.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (this.f209552g.f209545z) {
                        this.f209552g.m223779F();
                        this.f209552g.f209545z = false;
                        this.f209549d++;
                        long jNanoTime = System.nanoTime() / 1000;
                        this.f209546a = jNanoTime;
                        int i = this.f209549d;
                        if (i > 3) {
                            this.f209550e = (int) (((long) this.f209550e) + (jNanoTime - this.f209547b));
                            this.f209548c++;
                        }
                        if (i > 20) {
                            long j = ((long) this.f209550e) / this.f209548c;
                            if (j > 0) {
                                this.f209552g.f209520a = (int) ((1000000 / j) + 1);
                            }
                            ScreenSurface screenSurface2 = this.f209552g;
                            int i2 = screenSurface2.f209520a;
                            if (i2 > 0) {
                                screenSurface2.f209521b = 1000 / i2;
                            }
                            t9c.m189745c("ScreenSurface", "Actual mRenderTime: " + this.f209552g.f209521b);
                            this.f209548c = 0L;
                            this.f209547b = 0L;
                            this.f209546a = 0L;
                            this.f209550e = 0;
                            this.f209549d = 0;
                        }
                        this.f209547b = this.f209546a;
                    }
                }
            } while (!this.f209552g.f209518S);
            if (this.f209552g.f209542w != null) {
                this.f209552g.f209542w.destroy();
                this.f209552g.f209542w = null;
            }
            if (this.f209552g.f209502C != null) {
                this.f209552g.f209502C.m223773x();
                this.f209552g.f209502C = null;
            }
            if (this.f209552g.f209532m != null) {
                this.f209552g.f209532m.eglDestroySurface(this.f209552g.f209533n, this.f209552g.f209535p);
                this.f209552g.f209532m.eglDestroySurface(this.f209552g.f209533n, this.f209552g.f209536q);
                if (this.f209552g.f209532m.eglGetCurrentContext().equals(this.f209552g.f209534o)) {
                    EGL10 egl10 = this.f209552g.f209532m;
                    EGLDisplay eGLDisplay = this.f209552g.f209533n;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                this.f209552g.f209532m.eglDestroyContext(this.f209552g.f209533n, this.f209552g.f209534o);
                this.f209552g.f209532m.eglTerminate(this.f209552g.f209533n);
                this.f209552g.f209532m = null;
            }
            this.f209552g.f209543x = null;
            synchronized (this.f209552g.f209500A) {
                this.f209552g.f209500A.notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m223776B() {
        try {
            m223780G(this.f209543x);
            if (this.f209543x == null) {
                m223783J();
                this.f209511L = false;
            } else {
                m223782I();
                this.f209511L = true;
            }
            m223786N();
            this.f209512M = false;
        } catch (IllegalArgumentException unused) {
            t9c.m189743a("ScreenSurface", "activiteSurface_l eglSetup exception");
            this.f209511L = false;
            m223814M(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public void m223777C(Surface surface) {
        t9c.m189745c("ScreenSurface", "addMediaCodecSurface_l");
        synchronized (this.f209500A) {
            try {
                if (surface != null) {
                    this.f209537r = new dah0(surface, 2, this.f209534o, null);
                } else {
                    this.f209538s = true;
                }
                this.f209514O = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: D */
    private void m223778D(String str) {
        while (true) {
            int iEglGetError = this.f209532m.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            t9c.m189745c("ScreenSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            m223814M(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public void m223779F() {
        if (this.f209511L) {
            m223782I();
        } else {
            m223783J();
        }
        if (this.f209502C == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f209509J < 1000 / ((long) this.f209516Q)) {
            this.f209517R = true;
        } else {
            this.f209509J = System.currentTimeMillis();
            this.f209517R = false;
            t9c.m189745c("ScreenSurface", " drawImage codec:");
        }
        this.f209524e++;
        if (this.f209511L) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            ScreenRender screenRender = this.f209502C;
            screenRender.m223768q(screenRender.m223772u(), this.f209539t);
            this.f209532m.eglSwapBuffers(this.f209533n, this.f209535p);
            if (this.f209524e < 20) {
                this.f209522c = (this.f209522c + System.currentTimeMillis()) - jCurrentTimeMillis2;
            } else {
                this.f209522c = System.currentTimeMillis() - jCurrentTimeMillis2;
                this.f209524e = 1L;
            }
            t9c.m189745c("ScreenSurface", " render to display use:" + (this.f209522c / this.f209524e));
            this.f209525f = this.f209525f + 1;
        } else {
            ScreenRender screenRender2 = this.f209502C;
            screenRender2.m223768q(screenRender2.m223772u(), this.f209539t);
        }
        if (this.f209537r != null) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (!this.f209517R) {
                this.f209537r.m115120c();
                this.f209502C.m223770s();
                this.f209537r.m115122e();
            }
            t9c.m189745c("ScreenSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis3));
            t9c.m189745c("ScreenSurface", " render to codecSurface use:" + (this.f209523d / this.f209524e));
            if (this.f209524e == 1) {
                this.f209523d = System.currentTimeMillis() - jCurrentTimeMillis3;
            } else {
                this.f209523d = (this.f209523d + System.currentTimeMillis()) - jCurrentTimeMillis3;
            }
        }
        if (this.f209538s && !this.f209517R) {
            m223783J();
            this.f209502C.m223769r();
        }
        t9c.m189745c("ScreenSurface", " draw and rend  use:" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    /* JADX INFO: renamed from: G */
    private void m223780G(Object obj) {
        EGLConfig eGLConfigM223813E;
        if (this.f209532m == null) {
            this.f209532m = (EGL10) EGLContext.getEGL();
        }
        EGLSurface eGLSurface = this.f209535p;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f209532m.eglDestroySurface(this.f209533n, eGLSurface);
            this.f209532m.eglMakeCurrent(this.f209533n, eGLSurface2, eGLSurface2, eGLContext);
            this.f209535p = eGLSurface2;
        }
        if (this.f209533n == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f209532m.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f209533n = eGLDisplayEglGetDisplay;
            if (!this.f209532m.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f209505F = -1;
                return;
            }
        }
        if (this.f209530k == null) {
            this.f209530k = new EGLConfig[1];
        }
        if (this.f209531l == null) {
            this.f209531l = new int[1];
        }
        EGL10 egl10 = this.f209532m;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f209533n, this.f209528i, null, 0, this.f209531l)) {
                this.f209505F = -1;
                return;
            }
            int[] iArr = this.f209531l;
            int i = iArr[0];
            if (i <= 0) {
                wg3.m206174a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                this.f209532m.eglChooseConfig(this.f209533n, this.f209528i, eGLConfigArr, i, iArr);
                eGLConfigM223813E = m223813E(this.f209532m, this.f209533n, eGLConfigArr);
            }
        } else {
            if (!egl10.eglChooseConfig(this.f209533n, this.f209527h, null, 0, this.f209531l)) {
                this.f209505F = -1;
                return;
            }
            int[] iArr2 = this.f209531l;
            int i2 = iArr2[0];
            if (i2 <= 0) {
                wg3.m206174a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
                this.f209532m.eglChooseConfig(this.f209533n, this.f209527h, eGLConfigArr2, i2, iArr2);
                eGLConfigM223813E = m223813E(this.f209532m, this.f209533n, eGLConfigArr2);
            }
        }
        if (this.f209534o == eGLContext) {
            this.f209534o = this.f209532m.eglCreateContext(this.f209533n, eGLConfigM223813E, eGLContext, this.f209529j);
            m223778D("eglCreateContext");
            if (this.f209534o == null) {
                this.f209505F = -1;
                return;
            }
        }
        if (obj != null) {
            if (this.f209535p == eGLSurface2) {
                this.f209535p = this.f209532m.eglCreateWindowSurface(this.f209533n, eGLConfigM223813E, obj, null);
                m223778D("eglCreateWindowSurface");
                if (this.f209535p == null) {
                    this.f209505F = -1;
                    return;
                }
            }
            this.f209532m.eglQuerySurface(this.f209533n, this.f209535p, 12374, this.f209504E);
            this.f209532m.eglQuerySurface(this.f209533n, this.f209535p, 12375, this.f209503D);
            t9c.m189743a("ScreenSurface", "mEGLSurface width = " + this.f209503D[0] + ";mEGLSurface hight =" + this.f209504E[0]);
            return;
        }
        EGLSurface eGLSurface3 = this.f209536q;
        if (eGLSurface3 != eGLSurface2) {
            this.f209532m.eglDestroySurface(this.f209533n, eGLSurface3);
            this.f209536q = eGLSurface2;
        }
        int[] iArr3 = this.f209526g;
        iArr3[1] = this.f209506G;
        iArr3[3] = this.f209507H;
        t9c.m189743a("ScreenSurface", "mEGLDumpSurface width = " + this.f209526g[1] + ";mEGLDumpSurface hight =" + this.f209526g[3]);
        if (this.f209536q == eGLSurface2) {
            this.f209536q = this.f209532m.eglCreatePbufferSurface(this.f209533n, eGLConfigM223813E, this.f209526g);
            m223778D("eglCreatePbufferSurface");
            if (this.f209536q == null) {
                this.f209505F = -1;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    private int m223781H(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f209510K) ? this.f209510K[0] : i2;
    }

    /* JADX INFO: renamed from: I */
    private void m223782I() {
        if (this.f209532m == null) {
            this.f209505F = -1;
            return;
        }
        m223778D("before makeCurrent");
        EGLSurface eGLSurface = this.f209535p;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f209504E[0] == 0 || this.f209503D[0] == 0 || this.f209532m.eglMakeCurrent(this.f209533n, eGLSurface, eGLSurface, this.f209534o)) {
            return;
        }
        this.f209505F = -1;
    }

    /* JADX INFO: renamed from: J */
    private void m223783J() {
        if (this.f209532m == null) {
            this.f209505F = -1;
            return;
        }
        m223778D("before makeUnCurrent");
        EGLSurface eGLSurface = this.f209536q;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f209532m.eglMakeCurrent(this.f209533n, eGLSurface, eGLSurface, this.f209534o)) {
            return;
        }
        this.f209505F = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m223784K() {
        t9c.m189745c("ScreenSurface", "removeMediaCodecSurface_l");
        synchronized (this.f209500A) {
            try {
                dah0 dah0Var = this.f209537r;
                if (dah0Var != null) {
                    dah0Var.m115121d();
                    this.f209537r = null;
                }
                this.f209515P = false;
                this.f209538s = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m223785L() {
        jt2 jt2Var;
        ScreenRender screenRender = this.f209502C;
        if (screenRender != null && (jt2Var = this.f209542w) != null) {
            screenRender.m223774z(jt2Var);
        }
        this.f209513N = false;
    }

    /* JADX INFO: renamed from: N */
    private void m223786N() {
        if (this.f209502C == null) {
            ScreenRender screenRender = new ScreenRender(new qv40(), this.f209508I);
            this.f209502C = screenRender;
            screenRender.m223765B();
            this.f209502C.m223764A(this.f209519T);
            t9c.m189743a("ScreenSurface", "textureID=" + this.f209502C.m223772u());
            try {
                SurfaceTexture surfaceTextureM223771t = this.f209502C.m223771t();
                this.f209539t = surfaceTextureM223771t;
                surfaceTextureM223771t.setDefaultBufferSize(this.f209506G, this.f209507H);
                this.f209539t.setOnFrameAvailableListener(this);
                this.f209540u = new Surface(this.f209539t);
            } catch (Surface.OutOfResourcesException unused) {
                this.f209505F = -1;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public EGLConfig m223813E(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i = 0;
        while (i < length) {
            EGLConfig eGLConfig = eGLConfigArr[i];
            ScreenSurface screenSurface = this;
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iM223781H = screenSurface.m223781H(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iM223781H2 = screenSurface.m223781H(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iM223781H >= 0 && iM223781H2 >= 0) {
                int iM223781H3 = screenSurface.m223781H(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iM223781H4 = screenSurface.m223781H(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iM223781H5 = screenSurface.m223781H(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iM223781H6 = screenSurface.m223781H(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iM223781H3 == 8 && iM223781H4 == 8 && iM223781H5 == 8 && iM223781H6 == 8) {
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
    public void m223814M(int i) {
        this.f209505F = i;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        t9c.m189745c("ScreenSurface", "new frame available");
        synchronized (this.f209544y) {
            this.f209545z = true;
            this.f209544y.notifyAll();
        }
    }
}
