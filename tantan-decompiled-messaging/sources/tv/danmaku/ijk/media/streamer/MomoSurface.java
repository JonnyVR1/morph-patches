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
import p149l.cn40;
import p149l.etf;
import p149l.ig3;
import p149l.ldq0;
import p149l.mpd0;
import p149l.n8c;
import p149l.pjw;
import p149l.ts2;
import p149l.v1h0;
import tv.danmaku.ijk.media.source.AidSource;

/* JADX INFO: loaded from: classes3.dex */
public class MomoSurface {

    /* JADX INFO: renamed from: t0 */
    public static int f208452t0 = 20;

    /* JADX INFO: renamed from: A */
    private Surface f208453A;

    /* JADX INFO: renamed from: B */
    private Surface f208454B;

    /* JADX INFO: renamed from: C */
    private Surface f208455C;

    /* JADX INFO: renamed from: D */
    private ts2 f208456D;

    /* JADX INFO: renamed from: E */
    private etf f208457E;

    /* JADX INFO: renamed from: F */
    private Object f208458F;

    /* JADX INFO: renamed from: G */
    private Object f208459G;

    /* JADX INFO: renamed from: H */
    private volatile boolean f208460H;

    /* JADX INFO: renamed from: I */
    private Object f208461I;

    /* JADX INFO: renamed from: J */
    private Object f208462J;

    /* JADX INFO: renamed from: K */
    private TextureRender f208463K;

    /* JADX INFO: renamed from: L */
    private int f208464L;

    /* JADX INFO: renamed from: M */
    private int[] f208465M;

    /* JADX INFO: renamed from: N */
    private int[] f208466N;

    /* JADX INFO: renamed from: O */
    private int f208467O;

    /* JADX INFO: renamed from: P */
    private int f208468P;

    /* JADX INFO: renamed from: Q */
    private int f208469Q;

    /* JADX INFO: renamed from: R */
    private VideoQuality f208470R;

    /* JADX INFO: renamed from: S */
    private Bitmap f208471S;

    /* JADX INFO: renamed from: T */
    private long f208472T;

    /* JADX INFO: renamed from: U */
    private volatile int f208473U;

    /* JADX INFO: renamed from: V */
    private volatile int f208474V;

    /* JADX INFO: renamed from: W */
    private int[] f208475W;

    /* JADX INFO: renamed from: X */
    private volatile boolean f208476X;

    /* JADX INFO: renamed from: Y */
    private volatile boolean f208477Y;

    /* JADX INFO: renamed from: Z */
    private volatile boolean f208478Z;

    /* JADX INFO: renamed from: a0 */
    private volatile boolean f208480a0;

    /* JADX INFO: renamed from: b0 */
    private volatile boolean f208482b0;

    /* JADX INFO: renamed from: c0 */
    private volatile boolean f208484c0;

    /* JADX INFO: renamed from: d0 */
    private volatile boolean f208486d0;

    /* JADX INFO: renamed from: e0 */
    private volatile boolean f208488e0;

    /* JADX INFO: renamed from: f0 */
    private volatile boolean f208490f0;

    /* JADX INFO: renamed from: g0 */
    private volatile int f208492g0;

    /* JADX INFO: renamed from: h0 */
    private volatile boolean f208494h0;

    /* JADX INFO: renamed from: i0 */
    private RenderThread f208496i0;

    /* JADX INFO: renamed from: j0 */
    private volatile boolean f208498j0;

    /* JADX INFO: renamed from: k0 */
    private ByteBuffer f208500k0;

    /* JADX INFO: renamed from: l0 */
    private ByteBuffer f208502l0;

    /* JADX INFO: renamed from: m0 */
    private ByteBuffer f208504m0;

    /* JADX INFO: renamed from: n0 */
    private ByteBuffer f208506n0;

    /* JADX INFO: renamed from: o0 */
    private PostDrawImageCallback f208508o0;

    /* JADX INFO: renamed from: p0 */
    private SurfaceTexture f208510p0;

    /* JADX INFO: renamed from: q0 */
    private int f208512q0;

    /* JADX INFO: renamed from: r0 */
    private int f208514r0;

    /* JADX INFO: renamed from: s */
    private EGLSurface f208515s;

    /* JADX INFO: renamed from: s0 */
    private Bitmap f208516s0;

    /* JADX INFO: renamed from: t */
    private EGLSurface f208517t;

    /* JADX INFO: renamed from: u */
    private v1h0 f208518u;

    /* JADX INFO: renamed from: v */
    private v1h0 f208519v;

    /* JADX INFO: renamed from: w */
    private volatile boolean f208520w;

    /* JADX INFO: renamed from: x */
    private LinkedList<mpd0> f208521x;

    /* JADX INFO: renamed from: y */
    private Object f208522y;

    /* JADX INFO: renamed from: z */
    private SurfaceTexture f208523z;

    /* JADX INFO: renamed from: a */
    private final Lock f208479a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public int f208481b = 20;

    /* JADX INFO: renamed from: c */
    public int f208483c = 30;

    /* JADX INFO: renamed from: d */
    public boolean f208485d = true;

    /* JADX INFO: renamed from: e */
    long f208487e = 0;

    /* JADX INFO: renamed from: f */
    long f208489f = 0;

    /* JADX INFO: renamed from: g */
    long f208491g = 0;

    /* JADX INFO: renamed from: h */
    long f208493h = 0;

    /* JADX INFO: renamed from: i */
    int[] f208495i = {12375, 192, 12374, 320, 12344};

    /* JADX INFO: renamed from: j */
    int[] f208497j = {12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344};

    /* JADX INFO: renamed from: k */
    int[] f208499k = {12322, 8, 12323, 8, 12324, 8, 12339, 4, 12352, 4, 12344};

    /* JADX INFO: renamed from: l */
    int[] f208501l = {12440, 2, 12344};

    /* JADX INFO: renamed from: m */
    EGLConfig[] f208503m = null;

    /* JADX INFO: renamed from: n */
    int[] f208505n = null;

    /* JADX INFO: renamed from: o */
    FrameRateUpdateListener f208507o = null;

    /* JADX INFO: renamed from: p */
    private EGL10 f208509p = null;

    /* JADX INFO: renamed from: q */
    private EGLDisplay f208511q = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: r */
    private EGLContext f208513r = EGL10.EGL_NO_CONTEXT;

    public interface FrameRateUpdateListener {
    }

    public interface PostDrawImageCallback {
        /* JADX INFO: renamed from: a */
        void mo222494a(int i);
    }

    public class RenderThread extends Thread {

        /* JADX INFO: renamed from: a */
        final int f208525a;

        /* JADX INFO: renamed from: b */
        MomoSurface f208526b;

        /* JADX INFO: renamed from: c */
        long f208527c;

        /* JADX INFO: renamed from: d */
        long f208528d;

        /* JADX INFO: renamed from: e */
        long f208529e;

        /* JADX INFO: renamed from: f */
        int f208530f;

        /* JADX INFO: renamed from: g */
        int f208531g;

        /* JADX INFO: renamed from: h */
        volatile boolean f208532h;

        public RenderThread(MomoSurface momoSurface, String str) {
            super(str);
            this.f208525a = 40;
            this.f208529e = 0L;
            this.f208530f = 0;
            this.f208531g = 0;
            this.f208532h = false;
            this.f208526b = momoSurface;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (MomoSurface.this.f208462J) {
                MomoSurface.this.f208462J.notifyAll();
            }
            do {
                synchronized (MomoSurface.this.f208461I) {
                    try {
                        if (MomoSurface.this.f208477Y) {
                            MomoSurface.this.m222404V();
                            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                            if (MomoSurface.this.f208515s != EGL10.EGL_NO_SURFACE) {
                                MomoSurface.this.f208509p.eglSwapBuffers(MomoSurface.this.f208511q, MomoSurface.this.f208515s);
                            }
                        }
                        if (MomoSurface.this.f208478Z) {
                            MomoSurface.this.m222393J0();
                        }
                        if (MomoSurface.this.f208480a0) {
                            MomoSurface momoSurface = MomoSurface.this;
                            momoSurface.m222407a0(momoSurface.f208454B);
                            this.f208532h = true;
                        }
                        if (MomoSurface.this.f208482b0) {
                            MomoSurface momoSurface2 = MomoSurface.this;
                            momoSurface2.m222405W(momoSurface2.f208455C);
                        }
                        if (MomoSurface.this.f208484c0) {
                            MomoSurface.this.m222388F0();
                            this.f208532h = false;
                        }
                        if (MomoSurface.this.f208486d0) {
                            MomoSurface.this.m222385D0();
                        }
                        MomoSurface.this.f208461I.notifyAll();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (MomoSurface.this.f208459G) {
                    if (!MomoSurface.this.f208460H) {
                        try {
                            MomoSurface.this.f208459G.wait(40L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    if (MomoSurface.this.f208460H) {
                        if (MomoSurface.this.f208500k0 != null && MomoSurface.this.f208502l0 != null) {
                            MomoSurface.this.f208463K.m222778P(MomoSurface.this.f208500k0, MomoSurface.this.f208502l0);
                        }
                        if (MomoSurface.this.f208516s0 != null && !MomoSurface.this.f208516s0.isRecycled()) {
                            MomoSurface.this.f208463K.m222779Q(MomoSurface.this.f208516s0);
                        }
                        if (MomoSurface.this.f208510p0 != null && MomoSurface.this.f208512q0 != -1) {
                            MomoSurface.this.f208463K.m222780R(MomoSurface.this.f208510p0, MomoSurface.this.f208512q0);
                        }
                        if (MomoSurface.this.f208514r0 == 1 || MomoSurface.this.f208514r0 == 2) {
                            MomoSurface.this.f208476X = false;
                        }
                        MomoSurface.this.m222419i0();
                        MomoSurface.this.f208460H = false;
                        this.f208530f++;
                        long jNanoTime = System.nanoTime() / 1000;
                        this.f208527c = jNanoTime;
                        int i = this.f208530f;
                        if (i > 3) {
                            this.f208531g = (int) (((long) this.f208531g) + (jNanoTime - this.f208528d));
                            this.f208529e++;
                        }
                        if (i > 20) {
                            long j = ((long) this.f208531g) / this.f208529e;
                            if (j > 0) {
                                MomoSurface.this.f208481b = (int) ((1000000 / j) + 1);
                            }
                            MomoSurface momoSurface3 = MomoSurface.this;
                            int i2 = momoSurface3.f208481b;
                            if (i2 > 0) {
                                momoSurface3.f208483c = 1000 / i2;
                            }
                            n8c.m158485c("MomoSurface", "Actual mRenderTime: " + MomoSurface.this.f208483c + ";RenderFRate:" + MomoSurface.this.f208481b);
                            this.f208529e = 0L;
                            this.f208528d = 0L;
                            this.f208527c = 0L;
                            this.f208531g = 0;
                            this.f208530f = 0;
                        }
                        this.f208528d = this.f208527c;
                    }
                }
            } while (!MomoSurface.this.f208498j0);
            if (MomoSurface.this.f208456D != null) {
                MomoSurface.this.f208456D.destroy();
                MomoSurface.this.f208456D = null;
            }
            if (MomoSurface.this.f208463K != null) {
                MomoSurface.this.f208463K.m222795y();
                MomoSurface.this.f208463K = null;
            }
            if (MomoSurface.this.f208500k0 != null) {
                MomoSurface.this.f208500k0.clear();
                MomoSurface.this.f208500k0 = null;
            }
            if (MomoSurface.this.f208502l0 != null) {
                MomoSurface.this.f208502l0.clear();
                MomoSurface.this.f208502l0 = null;
            }
            if (MomoSurface.this.f208504m0 != null) {
                MomoSurface.this.f208504m0.clear();
                MomoSurface.this.f208504m0 = null;
            }
            if (MomoSurface.this.f208506n0 != null) {
                MomoSurface.this.f208506n0.clear();
                MomoSurface.this.f208506n0 = null;
            }
            if (MomoSurface.this.f208509p != null) {
                MomoSurface.this.f208509p.eglDestroySurface(MomoSurface.this.f208511q, MomoSurface.this.f208515s);
                MomoSurface.this.f208509p.eglDestroySurface(MomoSurface.this.f208511q, MomoSurface.this.f208517t);
                if (MomoSurface.this.f208509p.eglGetCurrentContext().equals(MomoSurface.this.f208513r)) {
                    EGL10 egl10 = MomoSurface.this.f208509p;
                    EGLDisplay eGLDisplay = MomoSurface.this.f208511q;
                    EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                    egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                }
                MomoSurface.this.f208509p.eglDestroyContext(MomoSurface.this.f208511q, MomoSurface.this.f208513r);
                MomoSurface.this.f208509p.eglTerminate(MomoSurface.this.f208511q);
                MomoSurface.this.f208509p = null;
            }
            MomoSurface.this.f208458F = null;
            synchronized (MomoSurface.this.f208461I) {
                MomoSurface.this.f208461I.notifyAll();
            }
        }
    }

    public MomoSurface(int i) {
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f208515s = eGLSurface;
        this.f208517t = eGLSurface;
        this.f208520w = false;
        this.f208521x = new LinkedList<>();
        this.f208522y = new Object();
        this.f208456D = null;
        this.f208457E = null;
        this.f208458F = null;
        this.f208459G = new Object();
        this.f208461I = new Object();
        this.f208462J = new Object();
        this.f208463K = null;
        this.f208464L = 1;
        this.f208465M = new int[1];
        this.f208466N = new int[1];
        this.f208467O = 0;
        this.f208468P = 352;
        this.f208469Q = 640;
        this.f208471S = null;
        this.f208472T = 0L;
        this.f208475W = new int[1];
        this.f208476X = false;
        this.f208477Y = true;
        this.f208478Z = false;
        this.f208480a0 = false;
        this.f208482b0 = false;
        this.f208484c0 = false;
        this.f208486d0 = false;
        this.f208488e0 = false;
        this.f208490f0 = false;
        this.f208492g0 = 20;
        this.f208494h0 = false;
        this.f208496i0 = new RenderThread(this, "ijkStrRender");
        this.f208498j0 = false;
        this.f208508o0 = null;
        this.f208510p0 = null;
        this.f208512q0 = 0;
        this.f208514r0 = 0;
        this.f208516s0 = null;
        synchronized (this.f208462J) {
            try {
                this.f208514r0 = i;
                try {
                    RenderThread renderThread = this.f208496i0;
                    if (renderThread != null) {
                        renderThread.start();
                    }
                    this.f208462J.wait();
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f208476X = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public void m222381A0(mpd0 mpd0Var) {
        synchronized (this.f208522y) {
            try {
                this.f208521x.offerLast(mpd0Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public void m222385D0() {
        n8c.m158485c("MomoSurface", "removeAttachedMediaCodecSurface_l");
        synchronized (this.f208461I) {
            try {
                v1h0 v1h0Var = this.f208519v;
                if (v1h0Var != null) {
                    v1h0Var.m196640d();
                    this.f208519v = null;
                }
                this.f208486d0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public void m222388F0() {
        n8c.m158485c("MomoSurface", "removeMediaCodecSurface_l");
        synchronized (this.f208461I) {
            try {
                v1h0 v1h0Var = this.f208518u;
                if (v1h0Var != null) {
                    v1h0Var.m196640d();
                    this.f208518u = null;
                }
                this.f208484c0 = false;
                this.f208520w = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public void m222393J0() {
        ts2 ts2Var;
        TextureRender textureRender = this.f208463K;
        if (textureRender != null && (ts2Var = this.f208456D) != null) {
            textureRender.m222764B(ts2Var);
        }
        this.f208478Z = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m222404V() {
        try {
            m222421j0(this.f208458F);
            if (this.f208458F == null) {
                m222440z0();
                this.f208476X = false;
            } else {
                m222438y0();
                this.f208476X = true;
            }
            m222408a1();
            this.f208477Y = false;
        } catch (IllegalArgumentException unused) {
            n8c.m158483a("MomoSurface", "activiteSurface_l eglSetup exception");
            this.f208476X = false;
            m222451O0(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public void m222405W(Surface surface) {
        n8c.m158485c("MomoSurface", "addAttachedMediaCodecSurface_l");
        synchronized (this.f208461I) {
            if (surface != null) {
                try {
                    this.f208519v = new v1h0(surface, 2, this.f208513r, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f208482b0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public void m222407a0(Surface surface) {
        n8c.m158485c("MomoSurface", "addMediaCodecSurface_l");
        synchronized (this.f208461I) {
            try {
                if (surface != null) {
                    v1h0 v1h0Var = this.f208518u;
                    if (v1h0Var != null) {
                        v1h0Var.m196640d();
                        this.f208518u = null;
                    }
                    this.f208518u = new v1h0(surface, 2, this.f208513r, null);
                } else {
                    this.f208520w = true;
                }
                this.f208480a0 = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a1 */
    private void m222408a1() {
        if (this.f208463K == null) {
            TextureRender textureRender = new TextureRender(new cn40(), this.f208470R, this.f208514r0);
            this.f208463K = textureRender;
            textureRender.m222776N();
            n8c.m158483a("MomoSurface", "textureID=" + this.f208463K.m222794v());
            try {
                this.f208523z = this.f208463K.m222792t();
                this.f208453A = new Surface(this.f208523z);
            } catch (Surface.OutOfResourcesException unused) {
                this.f208467O = -1;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    private void m222413e0(String str) {
        while (true) {
            int iEglGetError = this.f208509p.eglGetError();
            if (iEglGetError == 12288) {
                return;
            }
            n8c.m158485c("MomoSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            m222451O0(-1);
        }
    }

    /* JADX INFO: renamed from: g0 */
    private void m222416g0() {
        synchronized (this.f208522y) {
            try {
                try {
                    Iterator<mpd0> it = this.f208521x.iterator();
                    while (it.hasNext()) {
                        it.next().m155803f();
                        it.remove();
                    }
                    this.f208521x.clear();
                    this.f208521x = null;
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
    public void m222419i0() {
        if (this.f208476X) {
            m222438y0();
        } else {
            m222440z0();
        }
        if (this.f208463K == null) {
            return;
        }
        n8c.m158485c("MomoSurface", " drawImage codec mEncoderFrameRate:" + this.f208492g0 + ", drop=" + this.f208494h0);
        this.f208491g = this.f208491g + 1;
        if (this.f208476X) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f208463K.m222790r();
            this.f208509p.eglSwapBuffers(this.f208511q, this.f208515s);
            if (this.f208491g < 20) {
                this.f208487e = (this.f208487e + System.currentTimeMillis()) - jCurrentTimeMillis;
            } else {
                this.f208487e = System.currentTimeMillis() - jCurrentTimeMillis;
                this.f208491g = 1L;
            }
            n8c.m158485c("MomoSurface", " render to display use:" + (this.f208487e / this.f208491g));
        } else {
            this.f208463K.m222790r();
        }
        PostDrawImageCallback postDrawImageCallback = this.f208508o0;
        if (postDrawImageCallback != null) {
            postDrawImageCallback.mo222494a(this.f208463K.m222793u());
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jCurrentTimeMillis2 - this.f208472T < 1000 / ((long) this.f208492g0)) {
            this.f208494h0 = true;
            return;
        }
        this.f208472T = System.currentTimeMillis();
        this.f208494h0 = false;
        this.f208493h++;
        if (this.f208518u != null) {
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            if (!this.f208494h0) {
                this.f208518u.m196639c();
                this.f208463K.m222789q();
                this.f208518u.m196641e();
            }
            n8c.m158485c("MomoSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis3));
            n8c.m158485c("MomoSurface", " render to codecSurface use:" + (this.f208489f / this.f208491g));
            if (this.f208491g == 1) {
                this.f208489f = System.currentTimeMillis() - jCurrentTimeMillis3;
            } else {
                this.f208489f = (this.f208489f + System.currentTimeMillis()) - jCurrentTimeMillis3;
            }
        }
        if (this.f208519v != null) {
            long jCurrentTimeMillis4 = System.currentTimeMillis();
            if (!this.f208494h0) {
                this.f208519v.m196639c();
                this.f208463K.m222788p();
                this.f208519v.m196641e();
            }
            n8c.m158485c("MomoSurface", " render to codecSurface use:" + (System.currentTimeMillis() - jCurrentTimeMillis4));
            n8c.m158485c("MomoSurface", " render to codecSurface use:" + (this.f208489f / this.f208491g));
            if (this.f208491g == 1) {
                this.f208489f = System.currentTimeMillis() - jCurrentTimeMillis4;
            } else {
                this.f208489f = (this.f208489f + System.currentTimeMillis()) - jCurrentTimeMillis4;
            }
        }
        f208452t0 = this.f208481b;
        if (this.f208520w && !this.f208494h0) {
            m222440z0();
            this.f208463K.m222791s();
        }
        n8c.m158485c("MomoSurface", " draw and rend  use:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
    }

    /* JADX INFO: renamed from: j0 */
    private void m222421j0(Object obj) {
        EGLConfig eGLConfigM222474f0;
        if (this.f208509p == null) {
            this.f208509p = (EGL10) EGLContext.getEGL();
        }
        EGLSurface eGLSurface = this.f208515s;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            this.f208509p.eglDestroySurface(this.f208511q, eGLSurface);
            this.f208509p.eglMakeCurrent(this.f208511q, eGLSurface2, eGLSurface2, eGLContext);
            this.f208515s = eGLSurface2;
        }
        if (this.f208511q == EGL10.EGL_NO_DISPLAY) {
            EGLDisplay eGLDisplayEglGetDisplay = this.f208509p.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f208511q = eGLDisplayEglGetDisplay;
            if (!this.f208509p.eglInitialize(eGLDisplayEglGetDisplay, null)) {
                this.f208467O = -1;
                return;
            }
        }
        if (this.f208503m == null) {
            this.f208503m = new EGLConfig[1];
        }
        if (this.f208505n == null) {
            this.f208505n = new int[1];
        }
        EGL10 egl10 = this.f208509p;
        if (obj != null) {
            if (!egl10.eglChooseConfig(this.f208511q, this.f208499k, null, 0, this.f208505n)) {
                this.f208467O = -1;
                return;
            }
            int[] iArr = this.f208505n;
            int i = iArr[0];
            if (i <= 0) {
                ig3.m135964a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr = new EGLConfig[i];
                this.f208509p.eglChooseConfig(this.f208511q, this.f208499k, eGLConfigArr, i, iArr);
                eGLConfigM222474f0 = m222474f0(this.f208509p, this.f208511q, eGLConfigArr);
            }
        } else {
            if (!egl10.eglChooseConfig(this.f208511q, this.f208497j, null, 0, this.f208505n)) {
                this.f208467O = -1;
                return;
            }
            int[] iArr2 = this.f208505n;
            int i2 = iArr2[0];
            if (i2 <= 0) {
                ig3.m135964a("No configs match configSpec");
                return;
            } else {
                EGLConfig[] eGLConfigArr2 = new EGLConfig[i2];
                this.f208509p.eglChooseConfig(this.f208511q, this.f208497j, eGLConfigArr2, i2, iArr2);
                eGLConfigM222474f0 = m222474f0(this.f208509p, this.f208511q, eGLConfigArr2);
            }
        }
        if (this.f208513r == eGLContext) {
            this.f208513r = this.f208509p.eglCreateContext(this.f208511q, eGLConfigM222474f0, eGLContext, this.f208501l);
            m222413e0("eglCreateContext");
            if (this.f208513r == null) {
                this.f208467O = -1;
                return;
            }
        }
        if (obj != null) {
            if (this.f208515s == eGLSurface2) {
                this.f208515s = this.f208509p.eglCreateWindowSurface(this.f208511q, eGLConfigM222474f0, obj, null);
                m222413e0("eglCreateWindowSurface");
                if (this.f208515s == null) {
                    this.f208467O = -1;
                    return;
                }
            }
            this.f208509p.eglQuerySurface(this.f208511q, this.f208515s, 12374, this.f208466N);
            this.f208509p.eglQuerySurface(this.f208511q, this.f208515s, 12375, this.f208465M);
            n8c.m158483a("MomoSurface", "mEGLSurface width = " + this.f208465M[0] + ";mEGLSurface hight =" + this.f208466N[0]);
            return;
        }
        EGLSurface eGLSurface3 = this.f208517t;
        if (eGLSurface3 != eGLSurface2) {
            this.f208509p.eglDestroySurface(this.f208511q, eGLSurface3);
            this.f208517t = eGLSurface2;
        }
        int[] iArr3 = this.f208495i;
        iArr3[1] = this.f208468P;
        iArr3[3] = this.f208469Q;
        n8c.m158483a("MomoSurface", "mEGLDumpSurface width = " + this.f208495i[1] + ";mEGLDumpSurface hight =" + this.f208495i[3]);
        if (this.f208517t == eGLSurface2) {
            this.f208517t = this.f208509p.eglCreatePbufferSurface(this.f208511q, eGLConfigM222474f0, this.f208495i);
            m222413e0("eglCreatePbufferSurface");
            if (this.f208517t == null) {
                this.f208467O = -1;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    private int m222423k0(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f208475W) ? this.f208475W[0] : i2;
    }

    /* JADX INFO: renamed from: y0 */
    private void m222438y0() {
        if (this.f208509p == null) {
            this.f208467O = -1;
            return;
        }
        m222413e0("before makeCurrent");
        EGLSurface eGLSurface = this.f208515s;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f208466N[0] == 0 || this.f208465M[0] == 0 || this.f208509p.eglMakeCurrent(this.f208511q, eGLSurface, eGLSurface, this.f208513r)) {
            return;
        }
        this.f208467O = -1;
    }

    /* JADX INFO: renamed from: z0 */
    private void m222440z0() {
        if (this.f208509p == null) {
            this.f208467O = -1;
            return;
        }
        m222413e0("before makeUnCurrent");
        EGLSurface eGLSurface = this.f208517t;
        if (eGLSurface == EGL10.EGL_NO_SURFACE || this.f208509p.eglMakeCurrent(this.f208511q, eGLSurface, eGLSurface, this.f208513r)) {
            return;
        }
        this.f208467O = -1;
    }

    /* JADX INFO: renamed from: B0 */
    public synchronized void m222441B0() {
        n8c.m158483a("MomoSurface", "release");
        this.f208476X = false;
        try {
            if (this.f208496i0 != null) {
                this.f208498j0 = true;
                try {
                    this.f208496i0.join();
                } catch (InterruptedException unused) {
                    this.f208496i0.interrupt();
                }
                this.f208496i0 = null;
            }
            Surface surface = this.f208453A;
            if (surface != null) {
                surface.release();
                this.f208453A = null;
            }
        } catch (Error | Exception unused2) {
        }
        Bitmap bitmap = this.f208471S;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f208471S.recycle();
            this.f208471S = null;
        }
        this.f208523z = null;
        this.f208454B = null;
        this.f208520w = false;
        m222416g0();
        this.f208511q = EGL10.EGL_NO_DISPLAY;
        this.f208513r = EGL10.EGL_NO_CONTEXT;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        this.f208515s = eGLSurface;
        this.f208517t = eGLSurface;
        this.f208509p = null;
        this.f208457E = null;
    }

    /* JADX INFO: renamed from: C0 */
    public void m222442C0() {
        n8c.m158485c("MomoSurface", "removeAttachedMediaCodecSurface");
        synchronized (this.f208461I) {
            try {
                this.f208486d0 = true;
                try {
                    this.f208461I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m222443E0() {
        n8c.m158485c("MomoSurface", "removeMediaCodecSurface");
        synchronized (this.f208461I) {
            try {
                this.f208484c0 = true;
                try {
                    this.f208461I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m222444G0() {
        n8c.m158485c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f208461I) {
            try {
                try {
                    this.f208463K.m222766D(null);
                    this.f208461I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public synchronized void m222445H0(Context context, ts2 ts2Var) {
        try {
            if (ts2Var == this.f208457E) {
                return;
            }
            if (ts2Var instanceof etf) {
                this.f208457E = (etf) ts2Var;
            }
            m222470c1(context, ts2Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public synchronized void m222446I0(Context context, ts2 ts2Var) {
        this.f208457E = null;
        m222470c1(context, ts2Var);
    }

    /* JADX INFO: renamed from: K0 */
    public void m222447K0(int i) {
        this.f208464L = i;
    }

    /* JADX INFO: renamed from: L0 */
    public void m222448L0(int i) {
        if (this.f208463K != null) {
            this.f208514r0 = i;
            if (i != 0) {
                if (i == 2) {
                    this.f208510p0 = null;
                    this.f208512q0 = -1;
                }
                ByteBuffer byteBuffer = this.f208500k0;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    this.f208500k0 = null;
                }
                ByteBuffer byteBuffer2 = this.f208502l0;
                if (byteBuffer2 != null) {
                    byteBuffer2.clear();
                    this.f208502l0 = null;
                }
                ByteBuffer byteBuffer3 = this.f208504m0;
                if (byteBuffer3 != null) {
                    byteBuffer3.clear();
                    this.f208504m0 = null;
                }
                ByteBuffer byteBuffer4 = this.f208506n0;
                if (byteBuffer4 != null) {
                    byteBuffer4.clear();
                    this.f208506n0 = null;
                }
            }
            this.f208463K.m222765C(i);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m222449M0(int i, boolean z) {
        this.f208492g0 = i;
        if (this.f208492g0 > 30) {
            this.f208492g0 = 30;
        }
        if (this.f208492g0 <= 0) {
            this.f208492g0 = 20;
        }
        this.f208494h0 = z;
    }

    /* JADX INFO: renamed from: N0 */
    public void m222450N0(FrameRateUpdateListener frameRateUpdateListener) {
        this.f208507o = frameRateUpdateListener;
    }

    /* JADX INFO: renamed from: O0 */
    public void m222451O0(int i) {
        this.f208467O = i;
    }

    /* JADX INFO: renamed from: P0 */
    public void m222452P0(PostDrawImageCallback postDrawImageCallback) {
        this.f208508o0 = postDrawImageCallback;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m222453Q0(int i) {
        this.f208492g0 = i;
        if (this.f208492g0 > 30) {
            this.f208492g0 = 30;
        }
        if (this.f208492g0 <= 0) {
            this.f208492g0 = 20;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m222454R0(int i) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222767E(i);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m222455S0(VideoQuality videoQuality) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222768F(videoQuality);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public void m222456T0(long j, AidSource.FirstFrameDrawCallback firstFrameDrawCallback) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222769G(j, firstFrameDrawCallback);
        }
    }

    /* JADX INFO: renamed from: U */
    public synchronized void m222457U(Object obj) {
        this.f208467O = 0;
        n8c.m158483a("MomoSurface", "activiteSurface" + obj);
        try {
            synchronized (this.f208461I) {
                try {
                    if (this.f208458F != obj || obj == null) {
                        this.f208477Y = true;
                    }
                    this.f208458F = obj;
                    this.f208461I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public void m222458U0(long j, boolean z) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222770H(j, z);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m222459V0(long j, boolean z) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222771I(j, z);
        }
    }

    /* JADX INFO: renamed from: W0 */
    public void m222460W0(long j, int i, int i2, int i3, int i4, int i5) {
        n8c.m158485c("MomoSurface", "----merge-momo-setSubVideoPos:" + j + "[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + Constants.AES_SUFFIX);
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222772J(j, i, i2, i3, i4, i5);
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
        n8c.m158485c("MomoSurface", "----merge-momo-setSubVideoPos:" + ((Object) sb));
    }

    /* JADX INFO: renamed from: X */
    public void m222461X(VideoQuality videoQuality) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222782j(videoQuality);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m222462X0(long j, int i, int i2, int i3, int i4) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222773K(j, i, i2, i3, i4);
        }
    }

    /* JADX INFO: renamed from: Y */
    public synchronized void m222463Y(ts2 ts2Var) {
        synchronized (this.f208461I) {
            try {
                TextureRender textureRender = this.f208463K;
                if (textureRender != null) {
                    textureRender.m222783k(ts2Var);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void m222464Y0(VideoQuality videoQuality) {
        this.f208470R = videoQuality;
    }

    /* JADX INFO: renamed from: Z */
    public void m222465Z(Surface surface) {
        n8c.m158485c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f208461I) {
            try {
                if (this.f208454B == surface) {
                    return;
                }
                this.f208454B = surface;
                this.f208480a0 = true;
                try {
                    this.f208461I.wait(3000L);
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public void m222466Z0(int i) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222774L(i);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m222467b0() {
        n8c.m158485c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f208461I) {
            try {
                try {
                    this.f208520w = true;
                    this.f208463K.m222766D(new ldq0.InterfaceC18199a() { // from class: tv.danmaku.ijk.media.streamer.MomoSurface.1
                        @Override // p149l.ldq0.InterfaceC18199a
                        /* JADX INFO: renamed from: a */
                        public void mo149469a(ByteBuffer byteBuffer, long j) {
                            MomoSurface.this.m222381A0(new mpd0(byteBuffer, j / 1000, 0));
                        }
                    });
                    this.f208461I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public void m222468b1(long j, boolean z) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222775M(j, z);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m222469c0(ldq0.InterfaceC18199a interfaceC18199a) {
        n8c.m158485c("MomoSurface", "addMediaCodecSurface");
        synchronized (this.f208461I) {
            try {
                try {
                    this.f208463K.m222766D(interfaceC18199a);
                    this.f208461I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m222470c1(Context context, ts2 ts2Var) {
        n8c.m158485c("MomoSurface", "selectFilter" + ts2Var);
        if (ts2Var == this.f208456D) {
            return;
        }
        synchronized (this.f208461I) {
            try {
                try {
                    this.f208456D = ts2Var;
                    this.f208478Z = true;
                    this.f208461I.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m222471d0(long j, int i, int i2) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222784l(j, i, i2);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public mpd0 m222472d1() {
        mpd0 mpd0Var;
        synchronized (this.f208522y) {
            try {
                mpd0Var = null;
                if (this.f208521x != null && this.f208520w) {
                    try {
                        mpd0 mpd0VarPollLast = this.f208521x.pollLast();
                        Iterator<mpd0> it = this.f208521x.iterator();
                        while (it.hasNext()) {
                            it.next().m155803f();
                            it.remove();
                        }
                        this.f208521x.clear();
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
    public void m222473e1(int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7) {
        if (this.f208463K != null) {
            if (this.f208514r0 == 2) {
                this.f208460H = false;
            }
            this.f208463K.m222777O(i, i2, z, i3, i4, i5, i6, i7);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public EGLConfig m222474f0(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        int length = eGLConfigArr.length;
        int i = 0;
        while (i < length) {
            EGLConfig eGLConfig = eGLConfigArr[i];
            MomoSurface momoSurface = this;
            EGL10 egl11 = egl10;
            EGLDisplay eGLDisplay2 = eGLDisplay;
            int iM222423k0 = momoSurface.m222423k0(egl11, eGLDisplay2, eGLConfig, 12325, 0);
            int iM222423k1 = momoSurface.m222423k0(egl11, eGLDisplay2, eGLConfig, 12326, 0);
            if (iM222423k0 >= 0 && iM222423k1 >= 0) {
                int iM222423k2 = momoSurface.m222423k0(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                int iM222423k3 = momoSurface.m222423k0(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                int iM222423k4 = momoSurface.m222423k0(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                int iM222423k5 = momoSurface.m222423k0(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                if (iM222423k2 == 8 && iM222423k3 == 8 && iM222423k4 == 8 && iM222423k5 == 8) {
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
    public void m222475f1(int i, int i2, Bitmap bitmap, boolean z) {
        synchronized (this.f208459G) {
            try {
                if (bitmap == null) {
                    return;
                }
                this.f208473U = i;
                this.f208474V = i2;
                this.f208516s0 = bitmap;
                this.f208510p0 = null;
                this.f208512q0 = -1;
                this.f208460H = true;
                this.f208459G.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m222476g1(pjw pjwVar) {
        etf etfVar = this.f208457E;
        if (etfVar != null) {
            etfVar.setMMCVInfo(pjwVar);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m222477h0(float f, float f2, float f3, float f4, boolean z) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222786n(f, f2, f3, f4, z);
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m222478h1(SurfaceTexture surfaceTexture, int i, int i2, int i3) {
        synchronized (this.f208459G) {
            try {
                if (!this.f208460H && surfaceTexture != null) {
                    this.f208473U = i2;
                    this.f208474V = i3;
                    this.f208510p0 = surfaceTexture;
                    this.f208512q0 = i;
                    Bitmap bitmap = this.f208516s0;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.f208516s0.recycle();
                        this.f208516s0 = null;
                    }
                    this.f208460H = true;
                    this.f208459G.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m222479i1(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        TextureRender textureRender = this.f208463K;
        if (textureRender != null) {
            textureRender.m222781T(j, surfaceTexture, i, bitmap);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m222480j1(Camera camera, byte[] bArr, int i, int i2, pjw pjwVar) {
        if (bArr == null || i <= 0 || i2 <= 0 || this.f208460H) {
            n8c.m158485c("MomoSurface", "---------updateYUV:" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + this.f208460H + Constants.SEPARATOR_COMMA + bArr);
            return;
        }
        synchronized (this.f208459G) {
            try {
                if (!this.f208460H && this.f208463K != null) {
                    if (this.f208473U != i || this.f208474V != i2) {
                        this.f208500k0 = null;
                        this.f208502l0 = null;
                        this.f208506n0 = null;
                        this.f208504m0 = null;
                    }
                    this.f208473U = i;
                    this.f208474V = i2;
                    if (this.f208500k0 == null) {
                        this.f208500k0 = ByteBuffer.allocateDirect(i * i2);
                    }
                    if (this.f208502l0 == null) {
                        this.f208502l0 = ByteBuffer.allocateDirect((i * i2) / 2);
                    }
                    this.f208500k0.clear();
                    this.f208502l0.clear();
                    this.f208500k0.position(0);
                    this.f208502l0.position(0);
                    int i3 = i * i2;
                    this.f208500k0.put(bArr, 0, i3);
                    this.f208502l0.put(bArr, i3, i3 / 2);
                    this.f208500k0.position(0);
                    this.f208502l0.position(0);
                    if (pjwVar != null) {
                        m222476g1(pjwVar);
                    }
                    this.f208460H = true;
                    this.f208459G.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public long m222481l0() {
        return this.f208493h;
    }

    /* JADX INFO: renamed from: m0 */
    public long m222482m0() {
        return 0L;
    }

    /* JADX INFO: renamed from: n0 */
    public EGLContext m222483n0() {
        return this.f208513r;
    }

    /* JADX INFO: renamed from: o0 */
    public long m222484o0() {
        return this.f208493h;
    }

    /* JADX INFO: renamed from: p0 */
    public long m222485p0() {
        return 0L;
    }

    /* JADX INFO: renamed from: q0 */
    public long m222486q0() {
        return this.f208493h;
    }

    /* JADX INFO: renamed from: r0 */
    public long m222487r0() {
        return this.f208483c;
    }

    /* JADX INFO: renamed from: s0 */
    public int m222488s0() {
        return this.f208467O;
    }

    /* JADX INFO: renamed from: t0 */
    public int m222489t0() {
        long j = this.f208491g;
        if (j != 0) {
            return (int) (this.f208489f / j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: u0 */
    public int m222490u0() {
        long j = this.f208491g;
        if (j != 0) {
            return (int) (this.f208487e / j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: v0 */
    public SurfaceTexture m222491v0() {
        return this.f208523z;
    }

    /* JADX INFO: renamed from: w0 */
    public long m222492w0() {
        return this.f208493h;
    }

    /* JADX INFO: renamed from: x0 */
    public int m222493x0() {
        return this.f208481b;
    }
}
