package tv.danmaku.ijk.media.streamer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.view.Surface;
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
import l.etf;
import l.ig3;
import l.mpd0;
import l.n8c;
import l.pjw;
import p003l.cn40;
import p003l.ldq0;
import p003l.ts2;
import p003l.v1h0;
import tech.sud.gip.core.BuildConfig;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MomoSurface {

    /* JADX INFO: renamed from: t0 */
    public static int f12077t0 = 20;

    /* JADX INFO: renamed from: A */
    private Surface f12078A;

    /* JADX INFO: renamed from: B */
    private Surface f12079B;

    /* JADX INFO: renamed from: C */
    private Surface f12080C;

    /* JADX INFO: renamed from: D */
    private ts2 f12081D;

    /* JADX INFO: renamed from: E */
    private etf f12082E;

    /* JADX INFO: renamed from: F */
    private Object f12083F;

    /* JADX INFO: renamed from: G */
    private Object f12084G;

    /* JADX INFO: renamed from: H */
    private volatile boolean f12085H;

    /* JADX INFO: renamed from: I */
    private Object f12086I;

    /* JADX INFO: renamed from: J */
    private Object f12087J;

    /* JADX INFO: renamed from: K */
    private TextureRender f12088K;

    /* JADX INFO: renamed from: L */
    private int f12089L;

    /* JADX INFO: renamed from: M */
    private int[] f12090M;

    /* JADX INFO: renamed from: N */
    private int[] f12091N;

    /* JADX INFO: renamed from: O */
    private int f12092O;

    /* JADX INFO: renamed from: P */
    private int f12093P;

    /* JADX INFO: renamed from: Q */
    private int f12094Q;

    /* JADX INFO: renamed from: R */
    private VideoQuality f12095R;

    /* JADX INFO: renamed from: S */
    private Bitmap f12096S;

    /* JADX INFO: renamed from: T */
    private long f12097T;

    /* JADX INFO: renamed from: U */
    private volatile int f12098U;

    /* JADX INFO: renamed from: V */
    private volatile int f12099V;

    /* JADX INFO: renamed from: W */
    private int[] f12100W;

    /* JADX INFO: renamed from: X */
    private volatile boolean f12101X;

    /* JADX INFO: renamed from: Y */
    private volatile boolean f12102Y;

    /* JADX INFO: renamed from: Z */
    private volatile boolean f12103Z;

    /* JADX INFO: renamed from: a0 */
    private volatile boolean f12105a0;

    /* JADX INFO: renamed from: b0 */
    private volatile boolean f12107b0;

    /* JADX INFO: renamed from: c0 */
    private volatile boolean f12109c0;

    /* JADX INFO: renamed from: d0 */
    private volatile boolean f12111d0;

    /* JADX INFO: renamed from: e0 */
    private volatile boolean f12113e0;

    /* JADX INFO: renamed from: f0 */
    private volatile boolean f12115f0;

    /* JADX INFO: renamed from: g0 */
    private volatile int f12117g0;

    /* JADX INFO: renamed from: h0 */
    private volatile boolean f12119h0;

    /* JADX INFO: renamed from: i0 */
    private RenderThread f12121i0;

    /* JADX INFO: renamed from: j0 */
    private volatile boolean f12123j0;

    /* JADX INFO: renamed from: k0 */
    private ByteBuffer f12125k0;

    /* JADX INFO: renamed from: l0 */
    private ByteBuffer f12127l0;

    /* JADX INFO: renamed from: m0 */
    private ByteBuffer f12129m0;

    /* JADX INFO: renamed from: n0 */
    private ByteBuffer f12131n0;

    /* JADX INFO: renamed from: o0 */
    private PostDrawImageCallback f12133o0;

    /* JADX INFO: renamed from: p0 */
    private SurfaceTexture f12135p0;

    /* JADX INFO: renamed from: q0 */
    private int f12137q0;

    /* JADX INFO: renamed from: r0 */
    private int f12139r0;

    /* JADX INFO: renamed from: s */
    private EGLSurface f12140s;

    /* JADX INFO: renamed from: s0 */
    private Bitmap f12141s0;

    /* JADX INFO: renamed from: t */
    private EGLSurface f12142t;

    /* JADX INFO: renamed from: u */
    private v1h0 f12143u;

    /* JADX INFO: renamed from: v */
    private v1h0 f12144v;

    /* JADX INFO: renamed from: w */
    private volatile boolean f12145w;

    /* JADX INFO: renamed from: x */
    private LinkedList<mpd0> f12146x;

    /* JADX INFO: renamed from: y */
    private Object f12147y;

    /* JADX INFO: renamed from: z */
    private SurfaceTexture f12148z;

    /* JADX INFO: renamed from: a */
    private final Lock f12104a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public int f12106b = 20;

    /* JADX INFO: renamed from: c */
    public int f12108c = 30;

    /* JADX INFO: renamed from: d */
    public boolean f12110d = true;

    /* JADX INFO: renamed from: e */
    long f12112e = 0;

    /* JADX INFO: renamed from: f */
    long f12114f = 0;

    /* JADX INFO: renamed from: g */
    long f12116g = 0;

    /* JADX INFO: renamed from: h */
    long f12118h = 0;

    /* JADX INFO: renamed from: i */
    int[] f12120i = {12375, 192, 12374, 320, 12344};

    /* JADX INFO: renamed from: j */
    int[] f12122j = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: k */
    int[] f12124k = {12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};

    /* JADX INFO: renamed from: l */
    int[] f12126l = {12440, 2, 12344};

    /* JADX INFO: renamed from: m */
    EGLConfig[] f12128m = null;

    /* JADX INFO: renamed from: n */
    int[] f12130n = null;

    /* JADX INFO: renamed from: o */
    FrameRateUpdateListener f12132o = null;

    /* JADX INFO: renamed from: p */
    private EGL10 f12134p = null;

    /* JADX INFO: renamed from: q */
    private EGLDisplay f12136q = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: r */
    private EGLContext f12138r = EGL10.EGL_NO_CONTEXT;

    public interface FrameRateUpdateListener {
    }

    public interface PostDrawImageCallback {
        /* JADX INFO: renamed from: a */
        void mo10965a(int i);
    }

    public class RenderThread extends Thread {

        /* JADX INFO: renamed from: a */
        final int f12150a;

        /* JADX INFO: renamed from: b */
        MomoSurface f12151b;

        /* JADX INFO: renamed from: c */
        long f12152c;

        /* JADX INFO: renamed from: d */
        long f12153d;

        /* JADX INFO: renamed from: e */
        long f12154e;

        /* JADX INFO: renamed from: f */
        int f12155f;

        /* JADX INFO: renamed from: g */
        int f12156g;

        /* JADX INFO: renamed from: h */
        volatile boolean f12157h;

        public RenderThread(MomoSurface momoSurface, String str) {
            super(str);
            this.f12150a = 40;
            this.f12154e = 0L;
            this.f12155f = 0;
            this.f12156g = 0;
            this.f12157h = false;
            this.f12151b = momoSurface;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (MomoSurface.this.f12087J) {
                MomoSurface.this.f12087J.notifyAll();
            }
            do {
                synchronized (MomoSurface.this.f12086I) {
                    try {
                        if (MomoSurface.this.f12102Y) {
                            MomoSurface.this.m10875V();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            if (MomoSurface.this.f12140s != EGL10.EGL_NO_SURFACE) {
                                MomoSurface.this.f12134p.eglSwapBuffers(MomoSurface.this.f12136q, MomoSurface.this.f12140s);
                            }
                        }
                        if (MomoSurface.this.f12103Z) {
                            MomoSurface.this.m10864J0();
                        }
                        if (MomoSurface.this.f12105a0) {
                            MomoSurface momoSurface = MomoSurface.this;
                            momoSurface.m10878a0(momoSurface.f12079B);
                            this.f12157h = true;
                        }
                        if (MomoSurface.this.f12107b0) {
                            MomoSurface momoSurface2 = MomoSurface.this;
                            momoSurface2.m10876W(momoSurface2.f12080C);
                        }
                        if (MomoSurface.this.f12109c0) {
                            MomoSurface.this.m10859F0();
                            this.f12157h = false;
                        }
                        if (MomoSurface.this.f12111d0) {
                            MomoSurface.this.m10856D0();
                        }
                        MomoSurface.this.f12086I.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (MomoSurface.this.f12084G) {
                    if (!MomoSurface.this.f12085H) {
                        try {
                            MomoSurface.this.f12084G.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (MomoSurface.this.f12085H) {
                        if (MomoSurface.this.f12125k0 != null && MomoSurface.this.f12127l0 != null) {
                            MomoSurface.this.f12088K.m11249P(MomoSurface.this.f12125k0, MomoSurface.this.f12127l0);
                        }
                        if (MomoSurface.this.f12141s0 != null && !MomoSurface.this.f12141s0.isRecycled()) {
                            MomoSurface.this.f12088K.m11250Q(MomoSurface.this.f12141s0);
                        }
                        if (MomoSurface.this.f12135p0 != null && MomoSurface.this.f12137q0 != -1) {
                            MomoSurface.this.f12088K.m11251R(MomoSurface.this.f12135p0, MomoSurface.this.f12137q0);
                        }
                        if (MomoSurface.this.f12139r0 == 1 || MomoSurface.this.f12139r0 == 2) {
                            MomoSurface.this.f12101X = false;
                        }
                        MomoSurface.this.m10890i0();
                        MomoSurface.this.f12085H = false;
                        this.f12155f++;
                        long jNanoTime = System.nanoTime() / 1000;
                        this.f12152c = jNanoTime;
                        int i = this.f12155f;
                        if (i > 3) {
                            this.f12156g = (int) (((long) this.f12156g) + (jNanoTime - this.f12153d));
                            this.f12154e++;
                        }
                        if (i > 20) {
                            long j = ((long) this.f12156g) / this.f12154e;
                            if (j > 0) {
                                MomoSurface.this.f12106b = (int) ((1000000 / j) + 1);
                            }
                            MomoSurface momoSurface3 = MomoSurface.this;
                            int i2 = momoSurface3.f12106b;
                            if (i2 > 0) {
                                momoSurface3.f12108c = 1000 / i2;
                            }
                            n8c.c("MomoSurface", "Actual mRenderTime: " + MomoSurface.this.f12108c + ";RenderFRate:" + MomoSurface.this.f12106b);
                            this.f12154e = 0L;
                            this.f12153d = 0L;
                            this.f12152c = 0L;
                            this.f12156g = 0;
                            this.f12155f = 0;
                        }
                        this.f12153d = this.f12152c;
                    }
                }
            } while (!MomoSurface.this.f12123j0);
            if (MomoSurface.this.f12081D != null) {
                MomoSurface.this.f12081D.destroy();
                MomoSurface.this.f12081D = null;
            }
            if (MomoSurface.this.f12088K != null) {
                MomoSurface.this.f12088K.m11266y();
                MomoSurface.this.f12088K = null;
            }
            if (MomoSurface.this.f12125k0 != null) {
                MomoSurface.this.f12125k0.clear();
                MomoSurface.this.f12125k0 = null;
            }
            if (MomoSurface.this.f12127l0 != null) {
                MomoSurface.this.f12127l0.clear();
                MomoSurface.this.f12127l0 = null;
            }
            if (MomoSurface.this.f12129m0 != null) {
                MomoSurface.this.f12129m0.clear();
                MomoSurface.this.f12129m0 = null;
            }
            if (MomoSurface.this.f12131n0 != null) {
                MomoSurface.this.f12131n0.clear();
                MomoSurface.this.f12131n0 = null;
            }
            if (MomoSurface.this.f12134p != null) {
                MomoSurface.this.f12134p.eglDestroySurface(MomoSurface.this.f12136q, MomoSurface.this.f12140s);
                MomoSurface.this.f12134p.eglDestroySurface(MomoSurface.this.f12136q, MomoSurface.this.f12142t);
                if (MomoSurface.this.f12134p.eglGetCurrentContext().equals(MomoSurface.this.f12138r)) {
                    EGL10 egl10 = MomoSurface.this.f12134p;
                    EGLDisplay eGLDisplay = MomoSurface.this.f12136q;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                MomoSurface.this.f12134p.eglDestroyContext(MomoSurface.this.f12136q, MomoSurface.this.f12138r);
                MomoSurface.this.f12134p.eglTerminate(MomoSurface.this.f12136q);
                MomoSurface.this.f12134p = null;
            }
            MomoSurface.this.f12083F = null;
            synchronized (MomoSurface.this.f12086I) {
                MomoSurface.this.f12086I.notifyAll();
            }
        }
    }

    public MomoSurface(int i) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f12140s = eGLSurface;
        this.f12142t = eGLSurface;
        this.f12145w = false;
        this.f12146x = new LinkedList<>();
        this.f12147y = new Object();
        this.f12081D = null;
        this.f12082E = null;
        this.f12083F = null;
        this.f12084G = new Object();
        this.f12086I = new Object();
        this.f12087J = new Object();
        this.f12088K = null;
        this.f12089L = 1;
        this.f12090M = new int[1];
        this.f12091N = new int[1];
        this.f12092O = 0;
        this.f12093P = 352;
        this.f12094Q = 640;
        this.f12096S = null;
        this.f12097T = 0L;
        this.f12100W = new int[1];
        this.f12101X = false;
        this.f12102Y = true;
        this.f12103Z = false;
        this.f12105a0 = false;
        this.f12107b0 = false;
        this.f12109c0 = false;
        this.f12111d0 = false;
        this.f12113e0 = false;
        this.f12115f0 = false;
        this.f12117g0 = 20;
        this.f12119h0 = false;
        this.f12121i0 = new RenderThread(this, "ijkStrRender");
        this.f12123j0 = false;
        this.f12133o0 = null;
        this.f12135p0 = null;
        this.f12137q0 = 0;
        this.f12139r0 = 0;
        this.f12141s0 = null;
        synchronized (this.f12087J) {
            try {
                this.f12139r0 = i;
                try {
                    RenderThread renderThread = this.f12121i0;
                    if (renderThread != null) {
                        renderThread.start();
                    }
                    this.f12087J.wait();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f12101X = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m10852A0(mpd0 mpd0Var) {
        synchronized (this.f12147y) {
            try {
                this.f12146x.offerLast(mpd0Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m10856D0() {
        n8c.c("MomoSurface", "removeAttachedMediaCodecSurface_l");
        synchronized (this.f12086I) {
            try {
                v1h0 v1h0Var = this.f12144v;
                if (v1h0Var != null) {
                    v1h0Var.m8273d();
                    this.f12144v = null;
                }
                this.f12111d0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m10859F0() {
        n8c.c("MomoSurface", "removeMediaCodecSurface_l");
        synchronized (this.f12086I) {
            try {
                v1h0 v1h0Var = this.f12143u;
                if (v1h0Var != null) {
                    v1h0Var.m8273d();
                    this.f12143u = null;
                }
                this.f12109c0 = false;
                this.f12145w = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public void m10864J0() {
        ts2 ts2Var;
        TextureRender textureRender = this.f12088K;
        if (textureRender != null && (ts2Var = this.f12081D) != null) {
            textureRender.m11235B(ts2Var);
        }
        this.f12103Z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m10875V() {
        try {
            m10892j0(this.f12083F);
            if (this.f12083F == null) {
                m10911z0();
                this.f12101X = false;
            } else {
                m10909y0();
                this.f12101X = true;
            }
            m10879a1();
            this.f12102Y = false;
        } catch (IllegalArgumentException unused) {
            n8c.a("MomoSurface", "activiteSurface_l eglSetup exception");
            this.f12101X = false;
            m10922O0(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m10876W(Surface surface) {
        n8c.c("MomoSurface", "addAttachedMediaCodecSurface_l");
        synchronized (this.f12086I) {
            if (surface != null) {
                try {
                    this.f12144v = new v1h0(surface, 2, this.f12138r, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f12107b0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m10878a0(Surface surface) {
        n8c.c("MomoSurface", "addMediaCodecSurface_l");
        synchronized (this.f12086I) {
            try {
                if (surface != null) {
                    v1h0 v1h0Var = this.f12143u;
                    if (v1h0Var != null) {
                        v1h0Var.m8273d();
                        this.f12143u = null;
                    }
                    this.f12143u = new v1h0(surface, 2, this.f12138r, null);
                } else {
                    this.f12145w = true;
                }
                this.f12105a0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    private void m10879a1() {
        if (this.f12088K == null) {
            TextureRender textureRender = new TextureRender(new cn40(), this.f12095R, this.f12139r0);
            this.f12088K = textureRender;
            textureRender.m11247N();
            n8c.a("MomoSurface", "textureID=" + this.f12088K.m11265v());
            try {
                this.f12148z = this.f12088K.m11263t();
                this.f12078A = new Surface(this.f12148z);
            } catch (Surface.OutOfResourcesException unused) {
                this.f12092O = -1;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m10884e0(String str) {
        while (true) {
            int iEglGetError = this.f12134p.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            n8c.c("MomoSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            m10922O0(-1);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m10887g0() {
        synchronized (this.f12147y) {
            try {
                try {
                    Iterator<mpd0> it = this.f12146x.iterator();
                    while (it.hasNext()) {
                        it.next().f();
                        it.remove();
                    }
                    this.f12146x.clear();
                    this.f12146x = null;
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
    public void m10890i0() {
        if (this.f12101X) {
            m10909y0();
        } else {
            m10911z0();
        }
        if (this.f12088K == null) {
            return;
        }
        n8c.c("MomoSurface", " drawImage codec mEncoderFrameRate:" + this.f12117g0 + ", drop=" + this.f12119h0);
        this.f12116g = this.f12116g + 1;
        if (this.f12101X) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f12088K.m11261r();
            this.f12134p.eglSwapBuffers(this.f12136q, this.f12140s);
            if (this.f12116g < 20) {
                this.f12112e = (this.f12112e + System.currentTimeMillis()) - jCurrentTimeMillis;
            } else {
                this.f12112e = System.currentTimeMillis() - jCurrentTimeMillis;
                this.f12116g = 1L;
            }
            n8c.c("MomoSurface", " render to display use:" + (this.f12112e / this.f12116g));
        } else {
            this.f12088K.m11261r();
        }
        PostDrawImageCallback postDrawImageCallback = this.f12133o0;
        if (postDrawImageCallback != null) {
            postDrawImageCallback.mo10965a(this.f12088K.m11264u());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jCurrentTimeMillis2 - this.f12097T < 1000 / ((long) this.f12117g0)) {
            this.f12119h0 = true;
            return;
        }
        this.f12097T = System.currentTimeMillis();
        this.f12119h0 = false;
        this.f12118h++;
        if (this.f12143u != null) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (!this.f12119h0) {
                this.f12143u.m8272c();
                this.f12088K.m11260q();
                this.f12143u.m8274e();
            }
            n8c.c("MomoSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis3));
            n8c.c("MomoSurface", " render to codecSurface use:" + (this.f12114f / this.f12116g));
            if (this.f12116g == 1) {
                this.f12114f = System.currentTimeMillis() - jCurrentTimeMillis3;
            } else {
                this.f12114f = (this.f12114f + System.currentTimeMillis()) - jCurrentTimeMillis3;
            }
        }
        if (this.f12144v != null) {
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            if (!this.f12119h0) {
                this.f12144v.m8272c();
                this.f12088K.m11259p();
                this.f12144v.m8274e();
            }
            n8c.c("MomoSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis4));
            n8c.c("MomoSurface", " render to codecSurface use:" + (this.f12114f / this.f12116g));
            if (this.f12116g == 1) {
                this.f12114f = System.currentTimeMillis() - jCurrentTimeMillis4;
            } else {
                this.f12114f = (this.f12114f + System.currentTimeMillis()) - jCurrentTimeMillis4;
            }
        }
        f12077t0 = this.f12106b;
        if (this.f12145w && !this.f12119h0) {
            m10911z0();
            this.f12088K.m11262s();
        }
        n8c.c("MomoSurface", " draw and rend  use:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
    }

    /* JADX INFO: renamed from: j0 */
    private void m10892j0(Object obj) {
        EGLConfig eGLConfigM10945f0;
        if (this.f12134p == null) {
            this.f12134p = (EGL10) EGLContext.getEGL();
        }
        EGLSurface eGLSurface = this.f12140s;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f12134p.eglDestroySurface(this.f12136q, eGLSurface);
            this.f12134p.eglMakeCurrent(this.f12136q, eGLSurface2, eGLSurface2, eGLContext);
            this.f12140s = eGLSurface2;
        }
        if (this.f12136q == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f12134p.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f12136q = eGLDisplayEglGetDisplay;
            if (!this.f12134p.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f12092O = -1;
                return;
            }
        }
        if (this.f12128m == null) {
            this.f12128m = new EGLConfig[1];
        }
        if (this.f12130n == null) {
            this.f12130n = new int[1];
        }
        EGL10 egl10 = this.f12134p;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f12136q, this.f12124k, null, 0, this.f12130n)) {
                this.f12092O = -1;
                return;
            }
            int[] iArr = this.f12130n;
            int i = iArr[0];
            if (i <= 0) {
                ig3.a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                this.f12134p.eglChooseConfig(this.f12136q, this.f12124k, eGLConfigArr, i, iArr);
                eGLConfigM10945f0 = m10945f0(this.f12134p, this.f12136q, eGLConfigArr);
            }
        } else {
            if (!egl10.eglChooseConfig(this.f12136q, this.f12122j, null, 0, this.f12130n)) {
                this.f12092O = -1;
                return;
            }
            int[] iArr2 = this.f12130n;
            int i2 = iArr2[0];
            if (i2 <= 0) {
                ig3.a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
                this.f12134p.eglChooseConfig(this.f12136q, this.f12122j, eGLConfigArr2, i2, iArr2);
                eGLConfigM10945f0 = m10945f0(this.f12134p, this.f12136q, eGLConfigArr2);
            }
        }
        if (this.f12138r == eGLContext) {
            this.f12138r = this.f12134p.eglCreateContext(this.f12136q, eGLConfigM10945f0, eGLContext, this.f12126l);
            m10884e0("eglCreateContext");
            if (this.f12138r == null) {
                this.f12092O = -1;
                return;
            }
        }
        if (obj != null) {
            if (this.f12140s == eGLSurface2) {
                this.f12140s = this.f12134p.eglCreateWindowSurface(this.f12136q, eGLConfigM10945f0, obj, null);
                m10884e0("eglCreateWindowSurface");
                if (this.f12140s == null) {
                    this.f12092O = -1;
                    return;
                }
            }
            this.f12134p.eglQuerySurface(this.f12136q, this.f12140s, 12374, this.f12091N);
            this.f12134p.eglQuerySurface(this.f12136q, this.f12140s, 12375, this.f12090M);
            n8c.a("MomoSurface", "mEGLSurface width = " + this.f12090M[0] + ";mEGLSurface hight =" + this.f12091N[0]);
            return;
        }
        EGLSurface eGLSurface3 = this.f12142t;
        if (eGLSurface3 != eGLSurface2) {
            this.f12134p.eglDestroySurface(this.f12136q, eGLSurface3);
            this.f12142t = eGLSurface2;
        }
        int[] iArr3 = this.f12120i;
        iArr3[1] = this.f12093P;
        iArr3[3] = this.f12094Q;
        n8c.a("MomoSurface", "mEGLDumpSurface width = " + this.f12120i[1] + ";mEGLDumpSurface hight =" + this.f12120i[3]);
        if (this.f12142t == eGLSurface2) {
            this.f12142t = this.f12134p.eglCreatePbufferSurface(this.f12136q, eGLConfigM10945f0, this.f12120i);
            m10884e0("eglCreatePbufferSurface");
            if (this.f12142t == null) {
                this.f12092O = -1;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    private int m10894k0(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f12100W) ? this.f12100W[0] : i2;
    }

    /* JADX INFO: renamed from: y0 */
    private void m10909y0() {
        if (this.f12134p == null) {
            this.f12092O = -1;
            return;
        }
        m10884e0("before makeCurrent");
        EGLSurface eGLSurface = this.f12140s;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f12091N[0] == 0 || this.f12090M[0] == 0 || this.f12134p.eglMakeCurrent(this.f12136q, eGLSurface, eGLSurface, this.f12138r)) {
            return;
        }
        this.f12092O = -1;
    }

    /* JADX INFO: renamed from: z0 */
    private void m10911z0() {
        if (this.f12134p == null) {
            this.f12092O = -1;
            return;
        }
        m10884e0("before makeUnCurrent");
        EGLSurface eGLSurface = this.f12142t;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f12134p.eglMakeCurrent(this.f12136q, eGLSurface, eGLSurface, this.f12138r)) {
            return;
        }
        this.f12092O = -1;
    }

    /* JADX INFO: renamed from: B0 */
    public synchronized void m10912B0() {
        n8c.a("MomoSurface", BuildConfig.BUILD_TYPE);
        this.f12101X = false;
        try {
            if (this.f12121i0 != null) {
                this.f12123j0 = true;
                try {
                    this.f12121i0.join();
                } catch (InterruptedException unused) {
                    this.f12121i0.interrupt();
                }
                this.f12121i0 = null;
            }
            Surface surface = this.f12078A;
            if (surface != null) {
                surface.release();
                this.f12078A = null;
            }
        } catch (Error | Exception unused2) {
        }
        Bitmap bitmap = this.f12096S;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f12096S.recycle();
            this.f12096S = null;
        }
        this.f12148z = null;
        this.f12079B = null;
        this.f12145w = false;
        m10887g0();
        this.f12136q = EGL10.EGL_NO_DISPLAY;
        this.f12138r = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f12140s = eGLSurface;
        this.f12142t = eGLSurface;
        this.f12134p = null;
        this.f12082E = null;
    }

    /* JADX INFO: renamed from: C0 */
    public void m10913C0() {
        n8c.c("MomoSurface", "removeAttachedMediaCodecSurface");
        synchronized (this.f12086I) {
            try {
                this.f12111d0 = true;
                try {
                    this.f12086I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m10914E0() {
        n8c.c("MomoSurface", "removeMediaCodecSurface");
        synchronized (this.f12086I) {
            try {
                this.f12109c0 = true;
                try {
                    this.f12086I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m10915G0() {
        n8c.c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f12086I) {
            try {
                try {
                    this.f12088K.m11237D(null);
                    this.f12086I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: H0 */
    public synchronized void m10916H0(Context context, ts2 ts2Var) {
        try {
            if (ts2Var == this.f12082E) {
                return;
            }
            if (ts2Var instanceof etf) {
                this.f12082E = (etf) ts2Var;
            }
            m10941c1(context, ts2Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public synchronized void m10917I0(Context context, ts2 ts2Var) {
        this.f12082E = null;
        m10941c1(context, ts2Var);
    }

    /* JADX INFO: renamed from: K0 */
    public void m10918K0(int i) {
        this.f12089L = i;
    }

    /* JADX INFO: renamed from: L0 */
    public void m10919L0(int i) {
        if (this.f12088K != null) {
            this.f12139r0 = i;
            if (i != 0) {
                if (i == 2) {
                    this.f12135p0 = null;
                    this.f12137q0 = -1;
                }
                ByteBuffer byteBuffer = this.f12125k0;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    this.f12125k0 = null;
                }
                ByteBuffer byteBuffer2 = this.f12127l0;
                if (byteBuffer2 != null) {
                    byteBuffer2.clear();
                    this.f12127l0 = null;
                }
                ByteBuffer byteBuffer3 = this.f12129m0;
                if (byteBuffer3 != null) {
                    byteBuffer3.clear();
                    this.f12129m0 = null;
                }
                ByteBuffer byteBuffer4 = this.f12131n0;
                if (byteBuffer4 != null) {
                    byteBuffer4.clear();
                    this.f12131n0 = null;
                }
            }
            this.f12088K.m11236C(i);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m10920M0(int i, boolean z) {
        this.f12117g0 = i;
        if (this.f12117g0 > 30) {
            this.f12117g0 = 30;
        }
        if (this.f12117g0 <= 0) {
            this.f12117g0 = 20;
        }
        this.f12119h0 = z;
    }

    /* JADX INFO: renamed from: N0 */
    public void m10921N0(FrameRateUpdateListener frameRateUpdateListener) {
        this.f12132o = frameRateUpdateListener;
    }

    /* JADX INFO: renamed from: O0 */
    public void m10922O0(int i) {
        this.f12092O = i;
    }

    /* JADX INFO: renamed from: P0 */
    public void m10923P0(PostDrawImageCallback postDrawImageCallback) {
        this.f12133o0 = postDrawImageCallback;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m10924Q0(int i) {
        this.f12117g0 = i;
        if (this.f12117g0 > 30) {
            this.f12117g0 = 30;
        }
        if (this.f12117g0 <= 0) {
            this.f12117g0 = 20;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m10925R0(int i) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11238E(i);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m10926S0(VideoQuality videoQuality) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11239F(videoQuality);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m10927T0(long j, AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11240G(j, firstFrameDrawCallback);
        }
    }

    /* JADX INFO: renamed from: U */
    public synchronized void m10928U(Object obj) {
        this.f12092O = 0;
        n8c.a("MomoSurface", "activiteSurface" + obj);
        try {
            synchronized (this.f12086I) {
                try {
                    if (this.f12083F != obj || obj == null) {
                        this.f12102Y = true;
                    }
                    this.f12083F = obj;
                    this.f12086I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m10929U0(long j, boolean z) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11241H(j, z);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m10930V0(long j, boolean z) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11242I(j, z);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m10931W0(long j, int i, int i2, int i3, int i4, int i5) {
        n8c.c("MomoSurface", "----merge-momo-setSubVideoPos:" + j + "[" + i + "," + i2 + "," + i3 + "," + i4 + "]");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11243J(j, i, i2, i3, i4, i5);
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
        n8c.c("MomoSurface", "----merge-momo-setSubVideoPos:" + ((Object) sb));
    }

    /* JADX INFO: renamed from: X */
    public void m10932X(VideoQuality videoQuality) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11253j(videoQuality);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m10933X0(long j, int i, int i2, int i3, int i4) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11244K(j, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: Y */
    public synchronized void m10934Y(ts2 ts2Var) {
        synchronized (this.f12086I) {
            try {
                TextureRender textureRender = this.f12088K;
                if (textureRender != null) {
                    textureRender.m11254k(ts2Var);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m10935Y0(VideoQuality videoQuality) {
        this.f12095R = videoQuality;
    }

    /* JADX INFO: renamed from: Z */
    public void m10936Z(Surface surface) {
        n8c.c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f12086I) {
            try {
                if (this.f12079B == surface) {
                    return;
                }
                this.f12079B = surface;
                this.f12105a0 = true;
                try {
                    this.f12086I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m10937Z0(int i) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11245L(i);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m10938b0() {
        n8c.c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f12086I) {
            try {
                try {
                    this.f12145w = true;
                    this.f12088K.m11237D(new ldq0.InterfaceC0404a() { // from class: tv.danmaku.ijk.media.streamer.MomoSurface.1
                        @Override // p003l.ldq0.InterfaceC0404a
                        /* JADX INFO: renamed from: a */
                        public void mo6003a(ByteBuffer byteBuffer, long j) {
                            MomoSurface.this.m10852A0(new mpd0(byteBuffer, j / 1000, 0));
                        }
                    });
                    this.f12086I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m10939b1(long j, boolean z) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11246M(j, z);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m10940c0(ldq0.InterfaceC0404a interfaceC0404a) {
        n8c.c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f12086I) {
            try {
                try {
                    this.f12088K.m11237D(interfaceC0404a);
                    this.f12086I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m10941c1(Context context, ts2 ts2Var) {
        n8c.c("MomoSurface", "selectFilter" + ts2Var);
        if (ts2Var == this.f12081D) {
            return;
        }
        synchronized (this.f12086I) {
            try {
                try {
                    this.f12081D = ts2Var;
                    this.f12103Z = true;
                    this.f12086I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m10942d0(long j, int i, int i2) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11255l(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public mpd0 m10943d1() {
        mpd0 mpd0Var;
        synchronized (this.f12147y) {
            try {
                mpd0Var = null;
                if (this.f12146x != null && this.f12145w) {
                    try {
                        mpd0 mpd0VarPollLast = this.f12146x.pollLast();
                        Iterator<mpd0> it = this.f12146x.iterator();
                        while (it.hasNext()) {
                            it.next().f();
                            it.remove();
                        }
                        this.f12146x.clear();
                        mpd0Var = mpd0VarPollLast;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mpd0Var;
    }

    /* JADX INFO: renamed from: e1 */
    public void m10944e1(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        if (this.f12088K != null) {
            if (this.f12139r0 == 2) {
                this.f12085H = false;
            }
            this.f12088K.m11248O(i, i2, z, i3, i4, i5, i6, i7);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public EGLConfig m10945f0(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i = 0;
        while (i < length) {
            EGLConfig eGLConfig = eGLConfigArr[i];
            MomoSurface momoSurface = this;
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iM10894k0 = momoSurface.m10894k0(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iM10894k1 = momoSurface.m10894k0(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iM10894k0 >= 0 && iM10894k1 >= 0) {
                int iM10894k2 = momoSurface.m10894k0(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iM10894k3 = momoSurface.m10894k0(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iM10894k4 = momoSurface.m10894k0(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iM10894k5 = momoSurface.m10894k0(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iM10894k2 == 8 && iM10894k3 == 8 && iM10894k4 == 8 && iM10894k5 == 8) {
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
    public void m10946f1(int i, int i2, Bitmap bitmap, boolean z) {
        synchronized (this.f12084G) {
            try {
                if (bitmap == null) {
                    return;
                }
                this.f12098U = i;
                this.f12099V = i2;
                this.f12141s0 = bitmap;
                this.f12135p0 = null;
                this.f12137q0 = -1;
                this.f12085H = true;
                this.f12084G.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m10947g1(pjw pjwVar) {
        etf etfVar = this.f12082E;
        if (etfVar != null) {
            etfVar.setMMCVInfo(pjwVar);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m10948h0(float f, float f2, float f3, float f4, boolean z) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11257n(f, f2, f3, f4, z);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m10949h1(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        synchronized (this.f12084G) {
            try {
                if (!this.f12085H && surfaceTexture != null) {
                    this.f12098U = i2;
                    this.f12099V = i3;
                    this.f12135p0 = surfaceTexture;
                    this.f12137q0 = i;
                    Bitmap bitmap = this.f12141s0;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.f12141s0.recycle();
                        this.f12141s0 = null;
                    }
                    this.f12085H = true;
                    this.f12084G.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m10950i1(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        TextureRender textureRender = this.f12088K;
        if (textureRender != null) {
            textureRender.m11252T(j, surfaceTexture, i, bitmap);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m10951j1(Camera camera, byte[] bArr, int i, int i2, pjw pjwVar) {
        if (bArr == null || i <= 0 || i2 <= 0 || this.f12085H) {
            n8c.c("MomoSurface", "---------updateYUV:" + i + "," + i2 + "," + this.f12085H + "," + bArr);
            return;
        }
        synchronized (this.f12084G) {
            try {
                if (!this.f12085H && this.f12088K != null) {
                    if (this.f12098U != i || this.f12099V != i2) {
                        this.f12125k0 = null;
                        this.f12127l0 = null;
                        this.f12131n0 = null;
                        this.f12129m0 = null;
                    }
                    this.f12098U = i;
                    this.f12099V = i2;
                    if (this.f12125k0 == null) {
                        this.f12125k0 = ByteBuffer.allocateDirect(i * i2);
                    }
                    if (this.f12127l0 == null) {
                        this.f12127l0 = ByteBuffer.allocateDirect((i * i2) / 2);
                    }
                    this.f12125k0.clear();
                    this.f12127l0.clear();
                    this.f12125k0.position(0);
                    this.f12127l0.position(0);
                    int i3 = i * i2;
                    this.f12125k0.put(bArr, 0, i3);
                    this.f12127l0.put(bArr, i3, i3 / 2);
                    this.f12125k0.position(0);
                    this.f12127l0.position(0);
                    if (pjwVar != null) {
                        m10947g1(pjwVar);
                    }
                    this.f12085H = true;
                    this.f12084G.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public long m10952l0() {
        return this.f12118h;
    }

    /* JADX INFO: renamed from: m0 */
    public long m10953m0() {
        return 0L;
    }

    /* JADX INFO: renamed from: n0 */
    public EGLContext m10954n0() {
        return this.f12138r;
    }

    /* JADX INFO: renamed from: o0 */
    public long m10955o0() {
        return this.f12118h;
    }

    /* JADX INFO: renamed from: p0 */
    public long m10956p0() {
        return 0L;
    }

    /* JADX INFO: renamed from: q0 */
    public long m10957q0() {
        return this.f12118h;
    }

    /* JADX INFO: renamed from: r0 */
    public long m10958r0() {
        return this.f12108c;
    }

    /* JADX INFO: renamed from: s0 */
    public int m10959s0() {
        return this.f12092O;
    }

    /* JADX INFO: renamed from: t0 */
    public int m10960t0() {
        long j = this.f12116g;
        if (j != 0) {
            return (int) (this.f12114f / j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u0 */
    public int m10961u0() {
        long j = this.f12116g;
        if (j != 0) {
            return (int) (this.f12112e / j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public SurfaceTexture m10962v0() {
        return this.f12148z;
    }

    /* JADX INFO: renamed from: w0 */
    public long m10963w0() {
        return this.f12118h;
    }

    /* JADX INFO: renamed from: x0 */
    public int m10964x0() {
        return this.f12106b;
    }
}
