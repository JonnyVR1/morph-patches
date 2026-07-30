package p153l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes7.dex */
public class mre {

    /* JADX INFO: renamed from: C */
    protected int f138327C;

    /* JADX INFO: renamed from: D */
    protected int f138328D;

    /* JADX INFO: renamed from: a */
    protected C18688b f138329a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC18687a f138330b;

    /* JADX INFO: renamed from: e */
    protected Object f138333e;

    /* JADX INFO: renamed from: i */
    private boolean f138337i;

    /* JADX INFO: renamed from: m */
    private boolean f138341m;

    /* JADX INFO: renamed from: n */
    protected String f138342n;

    /* JADX INFO: renamed from: o */
    protected Runnable f138343o;

    /* JADX INFO: renamed from: t */
    protected long f138348t;

    /* JADX INFO: renamed from: u */
    protected long f138349u;

    /* JADX INFO: renamed from: y */
    protected int f138353y;

    /* JADX INFO: renamed from: c */
    protected vje f138331c = null;

    /* JADX INFO: renamed from: d */
    protected vje f138332d = null;

    /* JADX INFO: renamed from: f */
    private final Object f138334f = new Object();

    /* JADX INFO: renamed from: g */
    private final Object f138335g = new Object();

    /* JADX INFO: renamed from: h */
    protected final Object f138336h = new Object();

    /* JADX INFO: renamed from: j */
    protected Boolean f138338j = Boolean.FALSE;

    /* JADX INFO: renamed from: k */
    protected boolean f138339k = false;

    /* JADX INFO: renamed from: l */
    protected int f138340l = 0;

    /* JADX INFO: renamed from: p */
    private boolean f138344p = false;

    /* JADX INFO: renamed from: q */
    private boolean f138345q = false;

    /* JADX INFO: renamed from: r */
    private boolean f138346r = false;

    /* JADX INFO: renamed from: s */
    protected boolean f138347s = false;

    /* JADX INFO: renamed from: v */
    protected long f138350v = 0;

    /* JADX INFO: renamed from: w */
    protected int f138351w = 0;

    /* JADX INFO: renamed from: x */
    protected int f138352x = 0;

    /* JADX INFO: renamed from: z */
    public int f138354z = 30;

    /* JADX INFO: renamed from: A */
    public int f138325A = 0;

    /* JADX INFO: renamed from: B */
    protected int f138326B = 0;

    /* JADX INFO: renamed from: l.mre$a */
    public interface InterfaceC18687a {
        /* JADX INFO: renamed from: a */
        vje mo146712a();

        /* JADX INFO: renamed from: b */
        boolean mo146713b();

        /* JADX INFO: renamed from: c */
        void mo146714c();

        /* JADX INFO: renamed from: d */
        void mo146715d();

        /* JADX INFO: renamed from: e */
        void mo146716e(int i, int i2);

        /* JADX INFO: renamed from: f */
        void mo146717f(mre mreVar);

        /* JADX INFO: renamed from: g */
        void mo146718g(mre mreVar);

        /* JADX INFO: renamed from: h */
        void mo146719h(mre mreVar, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: i */
        void mo146720i(vje vjeVar, mre mreVar);
    }

    /* JADX INFO: renamed from: l.mre$b */
    public class C18688b extends Thread {

        /* JADX INFO: renamed from: a */
        protected final int f138355a;

        /* JADX INFO: renamed from: b */
        public boolean f138356b;

        public C18688b(String str) {
            super(str);
            this.f138355a = 100;
            this.f138356b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m159697a() {
            this.f138356b = true;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @RequiresApi(api = 17)
        public void run() {
            synchronized (mre.this.f138335g) {
                mre.this.f138337i = true;
                mre.this.f138335g.notifyAll();
            }
            do {
                synchronized (mre.this.f138336h) {
                    if (!mre.this.f138338j.booleanValue()) {
                        try {
                            mre.this.f138336h.wait(100L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (mre.this.f138338j.booleanValue()) {
                        mre mreVar = mre.this;
                        if (mreVar.f138333e == null || mreVar.f138331c == null) {
                            mreVar.f138338j = Boolean.TRUE;
                        } else {
                            mreVar.f138338j = Boolean.FALSE;
                        }
                        mreVar.m159691j();
                    }
                }
                if (this.f138356b) {
                    break;
                }
            } while (!isInterrupted());
            mre.this.m159685e();
            mre.this.m159686l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m159685e() {
        try {
            vje vjeVar = this.f138331c;
            if (vjeVar == null || this.f138333e == null) {
                return;
            }
            vjeVar.m201501e();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            this.f138331c.m201503g();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m159686l() {
        vje vjeVar = this.f138331c;
        if (vjeVar != null) {
            vjeVar.m201502f();
            this.f138331c = null;
        }
        InterfaceC18687a interfaceC18687a = this.f138330b;
        if (interfaceC18687a != null) {
            interfaceC18687a.mo146717f(this);
            this.f138330b = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m159687f() {
        C18688b c18688b = this.f138329a;
        if (c18688b != null) {
            this.f138338j = Boolean.FALSE;
            this.f138344p = false;
            this.f138339k = false;
            c18688b.m159697a();
            this.f138329a = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m159688g() {
        return this.f138342n;
    }

    /* JADX INFO: renamed from: h */
    public SurfaceTexture m159689h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return new SurfaceTexture(iArr[0]);
    }

    /* JADX INFO: renamed from: i */
    public void m159690i() {
        InterfaceC18687a interfaceC18687a = this.f138330b;
        if (interfaceC18687a != null && this.f138332d == null && this.f138331c == null) {
            this.f138332d = interfaceC18687a.mo146712a();
        }
        if (this.f138331c != null || this.f138332d == null) {
            return;
        }
        if (this.f138333e == null) {
            this.f138333e = m159689h();
        }
        try {
            vje vjeVar = new vje(this.f138330b.mo146713b());
            this.f138331c = vjeVar;
            vjeVar.m201498b(this.f138332d.f184378c, this.f138333e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        InterfaceC18687a interfaceC18687a2 = this.f138330b;
        if (interfaceC18687a2 != null) {
            interfaceC18687a2.mo146718g(this);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m159691j() {
        mre mreVar;
        boolean z;
        vje vjeVar;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Runnable runnable = this.f138343o;
            if (runnable != null) {
                runnable.run();
                this.f138343o = null;
            }
            if (this.f138341m && (vjeVar = this.f138332d) != null) {
                vjeVar.m201501e();
                this.f138330b.mo146720i(this.f138332d, this);
                this.f138332d.m201503g();
                return;
            }
            vje vjeVar2 = this.f138331c;
            if (vjeVar2 != null && this.f138333e != null) {
                int iM201500d = vjeVar2.m201500d();
                int iM201499c = this.f138331c.m201499c();
                int i = this.f138327C;
                if (!(iM201499c == i && iM201500d == this.f138328D) && i > 0) {
                    this.f138330b.mo146716e(iM201499c, iM201500d);
                    z = true;
                } else {
                    z = false;
                }
                this.f138327C = iM201499c;
                this.f138328D = iM201500d;
                if (this.f138330b != null) {
                    this.f138331c.m201501e();
                    this.f138330b.mo146720i(this.f138331c, this);
                    if (!this.f138346r) {
                        this.f138346r = true;
                    }
                    try {
                        this.f138331c.m201503g();
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    this.f138330b.mo146715d();
                }
            }
            if (this.f138340l == 1) {
                this.f138330b.mo146714c();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f138351w++;
            long jNanoTime = System.nanoTime() / 1000;
            this.f138348t = jNanoTime;
            int i2 = this.f138351w;
            if (i2 > 3) {
                this.f138352x = (int) (((long) this.f138352x) + (jNanoTime - this.f138349u));
                this.f138350v++;
            }
            if (i2 > 20) {
                long j = ((long) this.f138352x) / this.f138350v;
                if (j > 0) {
                    this.f138353y = (int) ((1000000 / j) + 1);
                }
                int i3 = this.f138353y;
                if (i3 > 0) {
                    this.f138354z = 1000 / i3;
                }
                this.f138350v = 0L;
                this.f138349u = 0L;
                this.f138348t = 0L;
                this.f138352x = 0;
                this.f138351w = 0;
            }
            this.f138349u = this.f138348t;
            InterfaceC18687a interfaceC18687a = this.f138330b;
            if (interfaceC18687a != null) {
                int i4 = (int) (jCurrentTimeMillis2 - jCurrentTimeMillis);
                mreVar = this;
                try {
                    interfaceC18687a.mo146719h(mreVar, this.f138353y, i4 < 0 ? 0 : i4, 0, this.f138325A);
                } catch (Throwable th) {
                    th = th;
                    mreVar.m159693m();
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            mreVar = this;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m159692k() {
        if (this.f138329a == null) {
            C18688b c18688b = new C18688b("EffectPipRender");
            this.f138329a = c18688b;
            c18688b.setPriority(10);
            this.f138329a.start();
        }
        synchronized (this.f138335g) {
            try {
                try {
                    boolean z = this.f138337i;
                    Object obj = this.f138335g;
                    if (z) {
                        obj.notifyAll();
                    } else {
                        obj.wait();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m159693m() {
        if (this.f138347s || this.f138338j.booleanValue()) {
            return;
        }
        synchronized (this.f138336h) {
            this.f138338j = Boolean.TRUE;
            this.f138336h.notifyAll();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m159694n(InterfaceC18687a interfaceC18687a) {
        this.f138330b = interfaceC18687a;
    }

    /* JADX INFO: renamed from: o */
    public void m159695o(String str) {
        this.f138342n = str;
    }

    /* JADX INFO: renamed from: p */
    public void m159696p(Object obj) {
        synchronized (this.f138335g) {
            this.f138333e = obj;
            m159690i();
            this.f138335g.notifyAll();
        }
    }
}
