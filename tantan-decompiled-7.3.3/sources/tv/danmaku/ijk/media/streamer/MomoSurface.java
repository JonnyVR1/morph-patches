package tv.danmaku.ijk.media.streamer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.view.Surface;
import com.clevertap.android.sdk.Constants;
import com.immomo.mediacore.strinf.VideoQuality;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import p153l.dah0;
import p153l.jt2;
import p153l.omw;
import p153l.oxd0;
import p153l.qmq0;
import p153l.qv40;
import p153l.suf;
import p153l.t9c;
import p153l.wg3;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class MomoSurface {

    /* JADX INFO: renamed from: t0 */
    public static int f209374t0 = 20;

    /* JADX INFO: renamed from: A */
    private Surface f209375A;

    /* JADX INFO: renamed from: B */
    private Surface f209376B;

    /* JADX INFO: renamed from: C */
    private Surface f209377C;

    /* JADX INFO: renamed from: D */
    private jt2 f209378D;

    /* JADX INFO: renamed from: E */
    private suf f209379E;

    /* JADX INFO: renamed from: F */
    private Object f209380F;

    /* JADX INFO: renamed from: G */
    private Object f209381G;

    /* JADX INFO: renamed from: H */
    private volatile boolean f209382H;

    /* JADX INFO: renamed from: I */
    private Object f209383I;

    /* JADX INFO: renamed from: J */
    private Object f209384J;

    /* JADX INFO: renamed from: K */
    private TextureRender f209385K;

    /* JADX INFO: renamed from: L */
    private int f209386L;

    /* JADX INFO: renamed from: M */
    private int[] f209387M;

    /* JADX INFO: renamed from: N */
    private int[] f209388N;

    /* JADX INFO: renamed from: O */
    private int f209389O;

    /* JADX INFO: renamed from: P */
    private int f209390P;

    /* JADX INFO: renamed from: Q */
    private int f209391Q;

    /* JADX INFO: renamed from: R */
    private VideoQuality f209392R;

    /* JADX INFO: renamed from: S */
    private Bitmap f209393S;

    /* JADX INFO: renamed from: T */
    private long f209394T;

    /* JADX INFO: renamed from: U */
    private volatile int f209395U;

    /* JADX INFO: renamed from: V */
    private volatile int f209396V;

    /* JADX INFO: renamed from: W */
    private int[] f209397W;

    /* JADX INFO: renamed from: X */
    private volatile boolean f209398X;

    /* JADX INFO: renamed from: Y */
    private volatile boolean f209399Y;

    /* JADX INFO: renamed from: Z */
    private volatile boolean f209400Z;

    /* JADX INFO: renamed from: a0 */
    private volatile boolean f209402a0;

    /* JADX INFO: renamed from: b0 */
    private volatile boolean f209404b0;

    /* JADX INFO: renamed from: c0 */
    private volatile boolean f209406c0;

    /* JADX INFO: renamed from: d0 */
    private volatile boolean f209408d0;

    /* JADX INFO: renamed from: e0 */
    private volatile boolean f209410e0;

    /* JADX INFO: renamed from: f0 */
    private volatile boolean f209412f0;

    /* JADX INFO: renamed from: g0 */
    private volatile int f209414g0;

    /* JADX INFO: renamed from: h0 */
    private volatile boolean f209416h0;

    /* JADX INFO: renamed from: i0 */
    private RenderThread f209418i0;

    /* JADX INFO: renamed from: j0 */
    private volatile boolean f209420j0;

    /* JADX INFO: renamed from: k0 */
    private ByteBuffer f209422k0;

    /* JADX INFO: renamed from: l0 */
    private ByteBuffer f209424l0;

    /* JADX INFO: renamed from: m0 */
    private ByteBuffer f209426m0;

    /* JADX INFO: renamed from: n0 */
    private ByteBuffer f209428n0;

    /* JADX INFO: renamed from: o0 */
    private PostDrawImageCallback f209430o0;

    /* JADX INFO: renamed from: p0 */
    private SurfaceTexture f209432p0;

    /* JADX INFO: renamed from: q0 */
    private int f209434q0;

    /* JADX INFO: renamed from: r0 */
    private int f209436r0;

    /* JADX INFO: renamed from: s */
    private EGLSurface f209437s;

    /* JADX INFO: renamed from: s0 */
    private Bitmap f209438s0;

    /* JADX INFO: renamed from: t */
    private EGLSurface f209439t;

    /* JADX INFO: renamed from: u */
    private dah0 f209440u;

    /* JADX INFO: renamed from: v */
    private dah0 f209441v;

    /* JADX INFO: renamed from: w */
    private volatile boolean f209442w;

    /* JADX INFO: renamed from: x */
    private LinkedList<oxd0> f209443x;

    /* JADX INFO: renamed from: y */
    private Object f209444y;

    /* JADX INFO: renamed from: z */
    private SurfaceTexture f209445z;

    /* JADX INFO: renamed from: a */
    private final Lock f209401a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public int f209403b = 20;

    /* JADX INFO: renamed from: c */
    public int f209405c = 30;

    /* JADX INFO: renamed from: d */
    public boolean f209407d = true;

    /* JADX INFO: renamed from: e */
    long f209409e = 0;

    /* JADX INFO: renamed from: f */
    long f209411f = 0;

    /* JADX INFO: renamed from: g */
    long f209413g = 0;

    /* JADX INFO: renamed from: h */
    long f209415h = 0;

    /* JADX INFO: renamed from: i */
    int[] f209417i = {12375, 192, 12374, 320, 12344};

    /* JADX INFO: renamed from: j */
    int[] f209419j = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: k */
    int[] f209421k = {12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};

    /* JADX INFO: renamed from: l */
    int[] f209423l = {12440, 2, 12344};

    /* JADX INFO: renamed from: m */
    EGLConfig[] f209425m = null;

    /* JADX INFO: renamed from: n */
    int[] f209427n = null;

    /* JADX INFO: renamed from: o */
    FrameRateUpdateListener f209429o = null;

    /* JADX INFO: renamed from: p */
    private EGL10 f209431p = null;

    /* JADX INFO: renamed from: q */
    private EGLDisplay f209433q = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: r */
    private EGLContext f209435r = EGL10.EGL_NO_CONTEXT;

    public interface FrameRateUpdateListener {
    }

    public interface PostDrawImageCallback {
        /* JADX INFO: renamed from: a */
        void mo223740a(int i);
    }

    public class RenderThread extends Thread {

        /* JADX INFO: renamed from: a */
        final int f209447a;

        /* JADX INFO: renamed from: b */
        MomoSurface f209448b;

        /* JADX INFO: renamed from: c */
        long f209449c;

        /* JADX INFO: renamed from: d */
        long f209450d;

        /* JADX INFO: renamed from: e */
        long f209451e;

        /* JADX INFO: renamed from: f */
        int f209452f;

        /* JADX INFO: renamed from: g */
        int f209453g;

        /* JADX INFO: renamed from: h */
        volatile boolean f209454h;

        public RenderThread(MomoSurface momoSurface, String str) {
            super(str);
            this.f209447a = 40;
            this.f209451e = 0L;
            this.f209452f = 0;
            this.f209453g = 0;
            this.f209454h = false;
            this.f209448b = momoSurface;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (MomoSurface.this.f209384J) {
                MomoSurface.this.f209384J.notifyAll();
            }
            do {
                synchronized (MomoSurface.this.f209383I) {
                    try {
                        if (MomoSurface.this.f209399Y) {
                            MomoSurface.this.m223650V();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            if (MomoSurface.this.f209437s != EGL10.EGL_NO_SURFACE) {
                                MomoSurface.this.f209431p.eglSwapBuffers(MomoSurface.this.f209433q, MomoSurface.this.f209437s);
                            }
                        }
                        if (MomoSurface.this.f209400Z) {
                            MomoSurface.this.m223639J0();
                        }
                        if (MomoSurface.this.f209402a0) {
                            MomoSurface momoSurface = MomoSurface.this;
                            momoSurface.m223653a0(momoSurface.f209376B);
                            this.f209454h = true;
                        }
                        if (MomoSurface.this.f209404b0) {
                            MomoSurface momoSurface2 = MomoSurface.this;
                            momoSurface2.m223651W(momoSurface2.f209377C);
                        }
                        if (MomoSurface.this.f209406c0) {
                            MomoSurface.this.m223634F0();
                            this.f209454h = false;
                        }
                        if (MomoSurface.this.f209408d0) {
                            MomoSurface.this.m223631D0();
                        }
                        MomoSurface.this.f209383I.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (MomoSurface.this.f209381G) {
                    if (!MomoSurface.this.f209382H) {
                        try {
                            MomoSurface.this.f209381G.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (MomoSurface.this.f209382H) {
                        if (MomoSurface.this.f209422k0 != null && MomoSurface.this.f209424l0 != null) {
                            MomoSurface.this.f209385K.m224024P(MomoSurface.this.f209422k0, MomoSurface.this.f209424l0);
                        }
                        if (MomoSurface.this.f209438s0 != null && !MomoSurface.this.f209438s0.isRecycled()) {
                            MomoSurface.this.f209385K.m224025Q(MomoSurface.this.f209438s0);
                        }
                        if (MomoSurface.this.f209432p0 != null && MomoSurface.this.f209434q0 != -1) {
                            MomoSurface.this.f209385K.m224026R(MomoSurface.this.f209432p0, MomoSurface.this.f209434q0);
                        }
                        if (MomoSurface.this.f209436r0 == 1 || MomoSurface.this.f209436r0 == 2) {
                            MomoSurface.this.f209398X = false;
                        }
                        MomoSurface.this.m223665i0();
                        MomoSurface.this.f209382H = false;
                        this.f209452f++;
                        long jNanoTime = System.nanoTime() / 1000;
                        this.f209449c = jNanoTime;
                        int i = this.f209452f;
                        if (i > 3) {
                            this.f209453g = (int) (((long) this.f209453g) + (jNanoTime - this.f209450d));
                            this.f209451e++;
                        }
                        if (i > 20) {
                            long j = ((long) this.f209453g) / this.f209451e;
                            if (j > 0) {
                                MomoSurface.this.f209403b = (int) ((1000000 / j) + 1);
                            }
                            MomoSurface momoSurface3 = MomoSurface.this;
                            int i2 = momoSurface3.f209403b;
                            if (i2 > 0) {
                                momoSurface3.f209405c = 1000 / i2;
                            }
                            t9c.m189745c("MomoSurface", "Actual mRenderTime: " + MomoSurface.this.f209405c + ";RenderFRate:" + MomoSurface.this.f209403b);
                            this.f209451e = 0L;
                            this.f209450d = 0L;
                            this.f209449c = 0L;
                            this.f209453g = 0;
                            this.f209452f = 0;
                        }
                        this.f209450d = this.f209449c;
                    }
                }
            } while (!MomoSurface.this.f209420j0);
            if (MomoSurface.this.f209378D != null) {
                MomoSurface.this.f209378D.destroy();
                MomoSurface.this.f209378D = null;
            }
            if (MomoSurface.this.f209385K != null) {
                MomoSurface.this.f209385K.m224041y();
                MomoSurface.this.f209385K = null;
            }
            if (MomoSurface.this.f209422k0 != null) {
                MomoSurface.this.f209422k0.clear();
                MomoSurface.this.f209422k0 = null;
            }
            if (MomoSurface.this.f209424l0 != null) {
                MomoSurface.this.f209424l0.clear();
                MomoSurface.this.f209424l0 = null;
            }
            if (MomoSurface.this.f209426m0 != null) {
                MomoSurface.this.f209426m0.clear();
                MomoSurface.this.f209426m0 = null;
            }
            if (MomoSurface.this.f209428n0 != null) {
                MomoSurface.this.f209428n0.clear();
                MomoSurface.this.f209428n0 = null;
            }
            if (MomoSurface.this.f209431p != null) {
                MomoSurface.this.f209431p.eglDestroySurface(MomoSurface.this.f209433q, MomoSurface.this.f209437s);
                MomoSurface.this.f209431p.eglDestroySurface(MomoSurface.this.f209433q, MomoSurface.this.f209439t);
                if (MomoSurface.this.f209431p.eglGetCurrentContext().equals(MomoSurface.this.f209435r)) {
                    EGL10 egl10 = MomoSurface.this.f209431p;
                    EGLDisplay eGLDisplay = MomoSurface.this.f209433q;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                MomoSurface.this.f209431p.eglDestroyContext(MomoSurface.this.f209433q, MomoSurface.this.f209435r);
                MomoSurface.this.f209431p.eglTerminate(MomoSurface.this.f209433q);
                MomoSurface.this.f209431p = null;
            }
            MomoSurface.this.f209380F = null;
            synchronized (MomoSurface.this.f209383I) {
                MomoSurface.this.f209383I.notifyAll();
            }
        }
    }

    public MomoSurface(int i) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f209437s = eGLSurface;
        this.f209439t = eGLSurface;
        this.f209442w = false;
        this.f209443x = new LinkedList<>();
        this.f209444y = new Object();
        this.f209378D = null;
        this.f209379E = null;
        this.f209380F = null;
        this.f209381G = new Object();
        this.f209383I = new Object();
        this.f209384J = new Object();
        this.f209385K = null;
        this.f209386L = 1;
        this.f209387M = new int[1];
        this.f209388N = new int[1];
        this.f209389O = 0;
        this.f209390P = 352;
        this.f209391Q = 640;
        this.f209393S = null;
        this.f209394T = 0L;
        this.f209397W = new int[1];
        this.f209398X = false;
        this.f209399Y = true;
        this.f209400Z = false;
        this.f209402a0 = false;
        this.f209404b0 = false;
        this.f209406c0 = false;
        this.f209408d0 = false;
        this.f209410e0 = false;
        this.f209412f0 = false;
        this.f209414g0 = 20;
        this.f209416h0 = false;
        this.f209418i0 = new RenderThread(this, "ijkStrRender");
        this.f209420j0 = false;
        this.f209430o0 = null;
        this.f209432p0 = null;
        this.f209434q0 = 0;
        this.f209436r0 = 0;
        this.f209438s0 = null;
        synchronized (this.f209384J) {
            try {
                this.f209436r0 = i;
                try {
                    RenderThread renderThread = this.f209418i0;
                    if (renderThread != null) {
                        renderThread.start();
                    }
                    this.f209384J.wait();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f209398X = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m223627A0(oxd0 oxd0Var) {
        synchronized (this.f209444y) {
            try {
                this.f209443x.offerLast(oxd0Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m223631D0() {
        t9c.m189745c("MomoSurface", "removeAttachedMediaCodecSurface_l");
        synchronized (this.f209383I) {
            try {
                dah0 dah0Var = this.f209441v;
                if (dah0Var != null) {
                    dah0Var.m115121d();
                    this.f209441v = null;
                }
                this.f209408d0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m223634F0() {
        t9c.m189745c("MomoSurface", "removeMediaCodecSurface_l");
        synchronized (this.f209383I) {
            try {
                dah0 dah0Var = this.f209440u;
                if (dah0Var != null) {
                    dah0Var.m115121d();
                    this.f209440u = null;
                }
                this.f209406c0 = false;
                this.f209442w = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public void m223639J0() {
        jt2 jt2Var;
        TextureRender textureRender = this.f209385K;
        if (textureRender != null && (jt2Var = this.f209378D) != null) {
            textureRender.m224010B(jt2Var);
        }
        this.f209400Z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m223650V() {
        try {
            m223667j0(this.f209380F);
            if (this.f209380F == null) {
                m223686z0();
                this.f209398X = false;
            } else {
                m223684y0();
                this.f209398X = true;
            }
            m223654a1();
            this.f209399Y = false;
        } catch (IllegalArgumentException unused) {
            t9c.m189743a("MomoSurface", "activiteSurface_l eglSetup exception");
            this.f209398X = false;
            m223697O0(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m223651W(Surface surface) {
        t9c.m189745c("MomoSurface", "addAttachedMediaCodecSurface_l");
        synchronized (this.f209383I) {
            if (surface != null) {
                try {
                    this.f209441v = new dah0(surface, 2, this.f209435r, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f209404b0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m223653a0(Surface surface) {
        t9c.m189745c("MomoSurface", "addMediaCodecSurface_l");
        synchronized (this.f209383I) {
            try {
                if (surface != null) {
                    dah0 dah0Var = this.f209440u;
                    if (dah0Var != null) {
                        dah0Var.m115121d();
                        this.f209440u = null;
                    }
                    this.f209440u = new dah0(surface, 2, this.f209435r, null);
                } else {
                    this.f209442w = true;
                }
                this.f209402a0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    private void m223654a1() {
        if (this.f209385K == null) {
            TextureRender textureRender = new TextureRender(new qv40(), this.f209392R, this.f209436r0);
            this.f209385K = textureRender;
            textureRender.m224022N();
            t9c.m189743a("MomoSurface", "textureID=" + this.f209385K.m224040v());
            try {
                this.f209445z = this.f209385K.m224038t();
                this.f209375A = new Surface(this.f209445z);
            } catch (Surface.OutOfResourcesException unused) {
                this.f209389O = -1;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m223659e0(String str) {
        while (true) {
            int iEglGetError = this.f209431p.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            t9c.m189745c("MomoSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            m223697O0(-1);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m223662g0() {
        synchronized (this.f209444y) {
            try {
                try {
                    Iterator<oxd0> it = this.f209443x.iterator();
                    while (it.hasNext()) {
                        it.next().m169690f();
                        it.remove();
                    }
                    this.f209443x.clear();
                    this.f209443x = null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public void m223665i0() {
        if (this.f209398X) {
            m223684y0();
        } else {
            m223686z0();
        }
        if (this.f209385K == null) {
            return;
        }
        t9c.m189745c("MomoSurface", " drawImage codec mEncoderFrameRate:" + this.f209414g0 + ", drop=" + this.f209416h0);
        this.f209413g = this.f209413g + 1;
        if (this.f209398X) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f209385K.m224036r();
            this.f209431p.eglSwapBuffers(this.f209433q, this.f209437s);
            if (this.f209413g < 20) {
                this.f209409e = (this.f209409e + System.currentTimeMillis()) - jCurrentTimeMillis;
            } else {
                this.f209409e = System.currentTimeMillis() - jCurrentTimeMillis;
                this.f209413g = 1L;
            }
            t9c.m189745c("MomoSurface", " render to display use:" + (this.f209409e / this.f209413g));
        } else {
            this.f209385K.m224036r();
        }
        PostDrawImageCallback postDrawImageCallback = this.f209430o0;
        if (postDrawImageCallback != null) {
            postDrawImageCallback.mo223740a(this.f209385K.m224039u());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jCurrentTimeMillis2 - this.f209394T < 1000 / ((long) this.f209414g0)) {
            this.f209416h0 = true;
            return;
        }
        this.f209394T = System.currentTimeMillis();
        this.f209416h0 = false;
        this.f209415h++;
        if (this.f209440u != null) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (!this.f209416h0) {
                this.f209440u.m115120c();
                this.f209385K.m224035q();
                this.f209440u.m115122e();
            }
            t9c.m189745c("MomoSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis3));
            t9c.m189745c("MomoSurface", " render to codecSurface use:" + (this.f209411f / this.f209413g));
            if (this.f209413g == 1) {
                this.f209411f = System.currentTimeMillis() - jCurrentTimeMillis3;
            } else {
                this.f209411f = (this.f209411f + System.currentTimeMillis()) - jCurrentTimeMillis3;
            }
        }
        if (this.f209441v != null) {
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            if (!this.f209416h0) {
                this.f209441v.m115120c();
                this.f209385K.m224034p();
                this.f209441v.m115122e();
            }
            t9c.m189745c("MomoSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis4));
            t9c.m189745c("MomoSurface", " render to codecSurface use:" + (this.f209411f / this.f209413g));
            if (this.f209413g == 1) {
                this.f209411f = System.currentTimeMillis() - jCurrentTimeMillis4;
            } else {
                this.f209411f = (this.f209411f + System.currentTimeMillis()) - jCurrentTimeMillis4;
            }
        }
        f209374t0 = this.f209403b;
        if (this.f209442w && !this.f209416h0) {
            m223686z0();
            this.f209385K.m224037s();
        }
        t9c.m189745c("MomoSurface", " draw and rend  use:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
    }

    /* JADX INFO: renamed from: j0 */
    private void m223667j0(Object obj) {
        EGLConfig eGLConfigM223720f0;
        if (this.f209431p == null) {
            this.f209431p = (EGL10) EGLContext.getEGL();
        }
        EGLSurface eGLSurface = this.f209437s;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f209431p.eglDestroySurface(this.f209433q, eGLSurface);
            this.f209431p.eglMakeCurrent(this.f209433q, eGLSurface2, eGLSurface2, eGLContext);
            this.f209437s = eGLSurface2;
        }
        if (this.f209433q == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f209431p.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f209433q = eGLDisplayEglGetDisplay;
            if (!this.f209431p.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f209389O = -1;
                return;
            }
        }
        if (this.f209425m == null) {
            this.f209425m = new EGLConfig[1];
        }
        if (this.f209427n == null) {
            this.f209427n = new int[1];
        }
        EGL10 egl10 = this.f209431p;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f209433q, this.f209421k, null, 0, this.f209427n)) {
                this.f209389O = -1;
                return;
            }
            int[] iArr = this.f209427n;
            int i = iArr[0];
            if (i <= 0) {
                wg3.m206174a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                this.f209431p.eglChooseConfig(this.f209433q, this.f209421k, eGLConfigArr, i, iArr);
                eGLConfigM223720f0 = m223720f0(this.f209431p, this.f209433q, eGLConfigArr);
            }
        } else {
            if (!egl10.eglChooseConfig(this.f209433q, this.f209419j, null, 0, this.f209427n)) {
                this.f209389O = -1;
                return;
            }
            int[] iArr2 = this.f209427n;
            int i2 = iArr2[0];
            if (i2 <= 0) {
                wg3.m206174a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
                this.f209431p.eglChooseConfig(this.f209433q, this.f209419j, eGLConfigArr2, i2, iArr2);
                eGLConfigM223720f0 = m223720f0(this.f209431p, this.f209433q, eGLConfigArr2);
            }
        }
        if (this.f209435r == eGLContext) {
            this.f209435r = this.f209431p.eglCreateContext(this.f209433q, eGLConfigM223720f0, eGLContext, this.f209423l);
            m223659e0("eglCreateContext");
            if (this.f209435r == null) {
                this.f209389O = -1;
                return;
            }
        }
        if (obj != null) {
            if (this.f209437s == eGLSurface2) {
                this.f209437s = this.f209431p.eglCreateWindowSurface(this.f209433q, eGLConfigM223720f0, obj, null);
                m223659e0("eglCreateWindowSurface");
                if (this.f209437s == null) {
                    this.f209389O = -1;
                    return;
                }
            }
            this.f209431p.eglQuerySurface(this.f209433q, this.f209437s, 12374, this.f209388N);
            this.f209431p.eglQuerySurface(this.f209433q, this.f209437s, 12375, this.f209387M);
            t9c.m189743a("MomoSurface", "mEGLSurface width = " + this.f209387M[0] + ";mEGLSurface hight =" + this.f209388N[0]);
            return;
        }
        EGLSurface eGLSurface3 = this.f209439t;
        if (eGLSurface3 != eGLSurface2) {
            this.f209431p.eglDestroySurface(this.f209433q, eGLSurface3);
            this.f209439t = eGLSurface2;
        }
        int[] iArr3 = this.f209417i;
        iArr3[1] = this.f209390P;
        iArr3[3] = this.f209391Q;
        t9c.m189743a("MomoSurface", "mEGLDumpSurface width = " + this.f209417i[1] + ";mEGLDumpSurface hight =" + this.f209417i[3]);
        if (this.f209439t == eGLSurface2) {
            this.f209439t = this.f209431p.eglCreatePbufferSurface(this.f209433q, eGLConfigM223720f0, this.f209417i);
            m223659e0("eglCreatePbufferSurface");
            if (this.f209439t == null) {
                this.f209389O = -1;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    private int m223669k0(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f209397W) ? this.f209397W[0] : i2;
    }

    /* JADX INFO: renamed from: y0 */
    private void m223684y0() {
        if (this.f209431p == null) {
            this.f209389O = -1;
            return;
        }
        m223659e0("before makeCurrent");
        EGLSurface eGLSurface = this.f209437s;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f209388N[0] == 0 || this.f209387M[0] == 0 || this.f209431p.eglMakeCurrent(this.f209433q, eGLSurface, eGLSurface, this.f209435r)) {
            return;
        }
        this.f209389O = -1;
    }

    /* JADX INFO: renamed from: z0 */
    private void m223686z0() {
        if (this.f209431p == null) {
            this.f209389O = -1;
            return;
        }
        m223659e0("before makeUnCurrent");
        EGLSurface eGLSurface = this.f209439t;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f209431p.eglMakeCurrent(this.f209433q, eGLSurface, eGLSurface, this.f209435r)) {
            return;
        }
        this.f209389O = -1;
    }

    /* JADX INFO: renamed from: B0 */
    public synchronized void m223687B0() {
        t9c.m189743a("MomoSurface", "release");
        this.f209398X = false;
        try {
            if (this.f209418i0 != null) {
                this.f209420j0 = true;
                try {
                    this.f209418i0.join();
                } catch (InterruptedException unused) {
                    this.f209418i0.interrupt();
                }
                this.f209418i0 = null;
            }
            Surface surface = this.f209375A;
            if (surface != null) {
                surface.release();
                this.f209375A = null;
            }
        } catch (Error | Exception unused2) {
        }
        Bitmap bitmap = this.f209393S;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f209393S.recycle();
            this.f209393S = null;
        }
        this.f209445z = null;
        this.f209376B = null;
        this.f209442w = false;
        m223662g0();
        this.f209433q = EGL10.EGL_NO_DISPLAY;
        this.f209435r = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f209437s = eGLSurface;
        this.f209439t = eGLSurface;
        this.f209431p = null;
        this.f209379E = null;
    }

    /* JADX INFO: renamed from: C0 */
    public void m223688C0() {
        t9c.m189745c("MomoSurface", "removeAttachedMediaCodecSurface");
        synchronized (this.f209383I) {
            try {
                this.f209408d0 = true;
                try {
                    this.f209383I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m223689E0() {
        t9c.m189745c("MomoSurface", "removeMediaCodecSurface");
        synchronized (this.f209383I) {
            try {
                this.f209406c0 = true;
                try {
                    this.f209383I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m223690G0() {
        t9c.m189745c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f209383I) {
            try {
                try {
                    this.f209385K.m224012D(null);
                    this.f209383I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public synchronized void m223691H0(Context context, jt2 jt2Var) {
        try {
            if (jt2Var == this.f209379E) {
                return;
            }
            if (jt2Var instanceof suf) {
                this.f209379E = (suf) jt2Var;
            }
            m223716c1(context, jt2Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public synchronized void m223692I0(Context context, jt2 jt2Var) {
        this.f209379E = null;
        m223716c1(context, jt2Var);
    }

    /* JADX INFO: renamed from: K0 */
    public void m223693K0(int i) {
        this.f209386L = i;
    }

    /* JADX INFO: renamed from: L0 */
    public void m223694L0(int i) {
        if (this.f209385K != null) {
            this.f209436r0 = i;
            if (i != 0) {
                if (i == 2) {
                    this.f209432p0 = null;
                    this.f209434q0 = -1;
                }
                ByteBuffer byteBuffer = this.f209422k0;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    this.f209422k0 = null;
                }
                ByteBuffer byteBuffer2 = this.f209424l0;
                if (byteBuffer2 != null) {
                    byteBuffer2.clear();
                    this.f209424l0 = null;
                }
                ByteBuffer byteBuffer3 = this.f209426m0;
                if (byteBuffer3 != null) {
                    byteBuffer3.clear();
                    this.f209426m0 = null;
                }
                ByteBuffer byteBuffer4 = this.f209428n0;
                if (byteBuffer4 != null) {
                    byteBuffer4.clear();
                    this.f209428n0 = null;
                }
            }
            this.f209385K.m224011C(i);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m223695M0(int i, boolean z) {
        this.f209414g0 = i;
        if (this.f209414g0 > 30) {
            this.f209414g0 = 30;
        }
        if (this.f209414g0 <= 0) {
            this.f209414g0 = 20;
        }
        this.f209416h0 = z;
    }

    /* JADX INFO: renamed from: N0 */
    public void m223696N0(FrameRateUpdateListener frameRateUpdateListener) {
        this.f209429o = frameRateUpdateListener;
    }

    /* JADX INFO: renamed from: O0 */
    public void m223697O0(int i) {
        this.f209389O = i;
    }

    /* JADX INFO: renamed from: P0 */
    public void m223698P0(PostDrawImageCallback postDrawImageCallback) {
        this.f209430o0 = postDrawImageCallback;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m223699Q0(int i) {
        this.f209414g0 = i;
        if (this.f209414g0 > 30) {
            this.f209414g0 = 30;
        }
        if (this.f209414g0 <= 0) {
            this.f209414g0 = 20;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m223700R0(int i) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224013E(i);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m223701S0(VideoQuality videoQuality) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224014F(videoQuality);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m223702T0(long j, AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224015G(j, firstFrameDrawCallback);
        }
    }

    /* JADX INFO: renamed from: U */
    public synchronized void m223703U(Object obj) {
        this.f209389O = 0;
        t9c.m189743a("MomoSurface", "activiteSurface" + obj);
        try {
            synchronized (this.f209383I) {
                try {
                    if (this.f209380F != obj || obj == null) {
                        this.f209399Y = true;
                    }
                    this.f209380F = obj;
                    this.f209383I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m223704U0(long j, boolean z) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224016H(j, z);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m223705V0(long j, boolean z) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224017I(j, z);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m223706W0(long j, int i, int i2, int i3, int i4, int i5) {
        t9c.m189745c("MomoSurface", "----merge-momo-setSubVideoPos:" + j + "[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + Constants.AES_SUFFIX);
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224018J(j, i, i2, i3, i4, i5);
        }
        StringBuilder sb = new StringBuilder();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.getClassName());
                sb.append("(");
                sb.append(stackTraceElement.getFileName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                sb.append(")\n");
            }
        }
        t9c.m189745c("MomoSurface", "----merge-momo-setSubVideoPos:" + ((Object) sb));
    }

    /* JADX INFO: renamed from: X */
    public void m223707X(VideoQuality videoQuality) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224028j(videoQuality);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m223708X0(long j, int i, int i2, int i3, int i4) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224019K(j, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: Y */
    public synchronized void m223709Y(jt2 jt2Var) {
        synchronized (this.f209383I) {
            try {
                TextureRender textureRender = this.f209385K;
                if (textureRender != null) {
                    textureRender.m224029k(jt2Var);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m223710Y0(VideoQuality videoQuality) {
        this.f209392R = videoQuality;
    }

    /* JADX INFO: renamed from: Z */
    public void m223711Z(Surface surface) {
        t9c.m189745c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f209383I) {
            try {
                if (this.f209376B == surface) {
                    return;
                }
                this.f209376B = surface;
                this.f209402a0 = true;
                try {
                    this.f209383I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m223712Z0(int i) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224020L(i);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m223713b0() {
        t9c.m189745c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f209383I) {
            try {
                try {
                    this.f209442w = true;
                    this.f209385K.m224012D(new qmq0.InterfaceC19603a() { // from class: tv.danmaku.ijk.media.streamer.MomoSurface.1
                        @Override // p153l.qmq0.InterfaceC19603a
                        /* JADX INFO: renamed from: a */
                        public void mo128845a(ByteBuffer byteBuffer, long j) {
                            MomoSurface.this.m223627A0(new oxd0(byteBuffer, j / 1000, 0));
                        }
                    });
                    this.f209383I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m223714b1(long j, boolean z) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224021M(j, z);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m223715c0(qmq0.InterfaceC19603a interfaceC19603a) {
        t9c.m189745c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f209383I) {
            try {
                try {
                    this.f209385K.m224012D(interfaceC19603a);
                    this.f209383I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m223716c1(Context context, jt2 jt2Var) {
        t9c.m189745c("MomoSurface", "selectFilter" + jt2Var);
        if (jt2Var == this.f209378D) {
            return;
        }
        synchronized (this.f209383I) {
            try {
                try {
                    this.f209378D = jt2Var;
                    this.f209400Z = true;
                    this.f209383I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m223717d0(long j, int i, int i2) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224030l(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public oxd0 m223718d1() {
        oxd0 oxd0Var;
        synchronized (this.f209444y) {
            try {
                oxd0Var = null;
                if (this.f209443x != null && this.f209442w) {
                    try {
                        oxd0 oxd0VarPollLast = this.f209443x.pollLast();
                        Iterator<oxd0> it = this.f209443x.iterator();
                        while (it.hasNext()) {
                            it.next().m169690f();
                            it.remove();
                        }
                        this.f209443x.clear();
                        oxd0Var = oxd0VarPollLast;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return oxd0Var;
    }

    /* JADX INFO: renamed from: e1 */
    public void m223719e1(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        if (this.f209385K != null) {
            if (this.f209436r0 == 2) {
                this.f209382H = false;
            }
            this.f209385K.m224023O(i, i2, z, i3, i4, i5, i6, i7);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public EGLConfig m223720f0(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i = 0;
        while (i < length) {
            EGLConfig eGLConfig = eGLConfigArr[i];
            MomoSurface momoSurface = this;
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iM223669k0 = momoSurface.m223669k0(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iM223669k1 = momoSurface.m223669k0(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iM223669k0 >= 0 && iM223669k1 >= 0) {
                int iM223669k2 = momoSurface.m223669k0(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iM223669k3 = momoSurface.m223669k0(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iM223669k4 = momoSurface.m223669k0(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iM223669k5 = momoSurface.m223669k0(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iM223669k2 == 8 && iM223669k3 == 8 && iM223669k4 == 8 && iM223669k5 == 8) {
                    return eGLConfig;
                }
            }
            i++;
            this = momoSurface;
            egl10 = egl11;
            eGLDisplay = eGLDisplay2;
        }
        return null;
    }

    /* JADX INFO: renamed from: f1 */
    public void m223721f1(int i, int i2, Bitmap bitmap, boolean z) {
        synchronized (this.f209381G) {
            try {
                if (bitmap == null) {
                    return;
                }
                this.f209395U = i;
                this.f209396V = i2;
                this.f209438s0 = bitmap;
                this.f209432p0 = null;
                this.f209434q0 = -1;
                this.f209382H = true;
                this.f209381G.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m223722g1(omw omwVar) {
        suf sufVar = this.f209379E;
        if (sufVar != null) {
            sufVar.setMMCVInfo(omwVar);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m223723h0(float f, float f2, float f3, float f4, boolean z) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224032n(f, f2, f3, f4, z);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m223724h1(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        synchronized (this.f209381G) {
            try {
                if (!this.f209382H && surfaceTexture != null) {
                    this.f209395U = i2;
                    this.f209396V = i3;
                    this.f209432p0 = surfaceTexture;
                    this.f209434q0 = i;
                    Bitmap bitmap = this.f209438s0;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.f209438s0.recycle();
                        this.f209438s0 = null;
                    }
                    this.f209382H = true;
                    this.f209381G.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m223725i1(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        TextureRender textureRender = this.f209385K;
        if (textureRender != null) {
            textureRender.m224027T(j, surfaceTexture, i, bitmap);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m223726j1(Camera camera, byte[] bArr, int i, int i2, omw omwVar) {
        if (bArr == null || i <= 0 || i2 <= 0 || this.f209382H) {
            t9c.m189745c("MomoSurface", "---------updateYUV:" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + this.f209382H + Constants.SEPARATOR_COMMA + bArr);
            return;
        }
        synchronized (this.f209381G) {
            try {
                if (!this.f209382H && this.f209385K != null) {
                    if (this.f209395U != i || this.f209396V != i2) {
                        this.f209422k0 = null;
                        this.f209424l0 = null;
                        this.f209428n0 = null;
                        this.f209426m0 = null;
                    }
                    this.f209395U = i;
                    this.f209396V = i2;
                    if (this.f209422k0 == null) {
                        this.f209422k0 = ByteBuffer.allocateDirect(i * i2);
                    }
                    if (this.f209424l0 == null) {
                        this.f209424l0 = ByteBuffer.allocateDirect((i * i2) / 2);
                    }
                    this.f209422k0.clear();
                    this.f209424l0.clear();
                    this.f209422k0.position(0);
                    this.f209424l0.position(0);
                    int i3 = i * i2;
                    this.f209422k0.put(bArr, 0, i3);
                    this.f209424l0.put(bArr, i3, i3 / 2);
                    this.f209422k0.position(0);
                    this.f209424l0.position(0);
                    if (omwVar != null) {
                        m223722g1(omwVar);
                    }
                    this.f209382H = true;
                    this.f209381G.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public long m223727l0() {
        return this.f209415h;
    }

    /* JADX INFO: renamed from: m0 */
    public long m223728m0() {
        return 0L;
    }

    /* JADX INFO: renamed from: n0 */
    public EGLContext m223729n0() {
        return this.f209435r;
    }

    /* JADX INFO: renamed from: o0 */
    public long m223730o0() {
        return this.f209415h;
    }

    /* JADX INFO: renamed from: p0 */
    public long m223731p0() {
        return 0L;
    }

    /* JADX INFO: renamed from: q0 */
    public long m223732q0() {
        return this.f209415h;
    }

    /* JADX INFO: renamed from: r0 */
    public long m223733r0() {
        return this.f209405c;
    }

    /* JADX INFO: renamed from: s0 */
    public int m223734s0() {
        return this.f209389O;
    }

    /* JADX INFO: renamed from: t0 */
    public int m223735t0() {
        long j = this.f209413g;
        if (j != 0) {
            return (int) (this.f209411f / j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u0 */
    public int m223736u0() {
        long j = this.f209413g;
        if (j != 0) {
            return (int) (this.f209409e / j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public SurfaceTexture m223737v0() {
        return this.f209445z;
    }

    /* JADX INFO: renamed from: w0 */
    public long m223738w0() {
        return this.f209415h;
    }

    /* JADX INFO: renamed from: x0 */
    public int m223739x0() {
        return this.f209403b;
    }
}
