package p149l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes7.dex */
public class iqe {

    /* JADX INFO: renamed from: C */
    protected int f114468C;

    /* JADX INFO: renamed from: D */
    protected int f114469D;

    /* JADX INFO: renamed from: a */
    protected C17609b f114470a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC17608a f114471b;

    /* JADX INFO: renamed from: e */
    protected Object f114474e;

    /* JADX INFO: renamed from: i */
    private boolean f114478i;

    /* JADX INFO: renamed from: m */
    private boolean f114482m;

    /* JADX INFO: renamed from: n */
    protected String f114483n;

    /* JADX INFO: renamed from: o */
    protected Runnable f114484o;

    /* JADX INFO: renamed from: t */
    protected long f114489t;

    /* JADX INFO: renamed from: u */
    protected long f114490u;

    /* JADX INFO: renamed from: y */
    protected int f114494y;

    /* JADX INFO: renamed from: c */
    protected rie f114472c = null;

    /* JADX INFO: renamed from: d */
    protected rie f114473d = null;

    /* JADX INFO: renamed from: f */
    private final Object f114475f = new Object();

    /* JADX INFO: renamed from: g */
    private final Object f114476g = new Object();

    /* JADX INFO: renamed from: h */
    protected final Object f114477h = new Object();

    /* JADX INFO: renamed from: j */
    protected Boolean f114479j = Boolean.FALSE;

    /* JADX INFO: renamed from: k */
    protected boolean f114480k = false;

    /* JADX INFO: renamed from: l */
    protected int f114481l = 0;

    /* JADX INFO: renamed from: p */
    private boolean f114485p = false;

    /* JADX INFO: renamed from: q */
    private boolean f114486q = false;

    /* JADX INFO: renamed from: r */
    private boolean f114487r = false;

    /* JADX INFO: renamed from: s */
    protected boolean f114488s = false;

    /* JADX INFO: renamed from: v */
    protected long f114491v = 0;

    /* JADX INFO: renamed from: w */
    protected int f114492w = 0;

    /* JADX INFO: renamed from: x */
    protected int f114493x = 0;

    /* JADX INFO: renamed from: z */
    public int f114495z = 30;

    /* JADX INFO: renamed from: A */
    public int f114466A = 0;

    /* JADX INFO: renamed from: B */
    protected int f114467B = 0;

    /* JADX INFO: renamed from: l.iqe$a */
    public interface InterfaceC17608a {
        /* JADX INFO: renamed from: a */
        rie mo122704a();

        /* JADX INFO: renamed from: b */
        boolean mo122705b();

        /* JADX INFO: renamed from: c */
        void mo122706c();

        /* JADX INFO: renamed from: d */
        void mo122707d();

        /* JADX INFO: renamed from: e */
        void mo122708e(int i, int i2);

        /* JADX INFO: renamed from: f */
        void mo122709f(iqe iqeVar);

        /* JADX INFO: renamed from: g */
        void mo122710g(iqe iqeVar);

        /* JADX INFO: renamed from: h */
        void mo122711h(iqe iqeVar, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: i */
        void mo122712i(rie rieVar, iqe iqeVar);
    }

    /* JADX INFO: renamed from: l.iqe$b */
    public class C17609b extends Thread {

        /* JADX INFO: renamed from: a */
        protected final int f114496a;

        /* JADX INFO: renamed from: b */
        public boolean f114497b;

        public C17609b(String str) {
            super(str);
            this.f114496a = 100;
            this.f114497b = false;
        }

        /* JADX INFO: renamed from: a */
        public void m137756a() {
            this.f114497b = true;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @RequiresApi(api = 17)
        public void run() {
            synchronized (iqe.this.f114476g) {
                iqe.this.f114478i = true;
                iqe.this.f114476g.notifyAll();
            }
            do {
                synchronized (iqe.this.f114477h) {
                    if (!iqe.this.f114479j.booleanValue()) {
                        try {
                            iqe.this.f114477h.wait(100L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (iqe.this.f114479j.booleanValue()) {
                        iqe iqeVar = iqe.this;
                        if (iqeVar.f114474e == null || iqeVar.f114472c == null) {
                            iqeVar.f114479j = Boolean.TRUE;
                        } else {
                            iqeVar.f114479j = Boolean.FALSE;
                        }
                        iqeVar.m137750j();
                    }
                }
                if (this.f114497b) {
                    break;
                }
            } while (!isInterrupted());
            iqe.this.m137744e();
            iqe.this.m137745l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m137744e() {
        try {
            rie rieVar = this.f114472c;
            if (rieVar == null || this.f114474e == null) {
                return;
            }
            rieVar.m179500e();
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            this.f114472c.m179502g();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m137745l() {
        rie rieVar = this.f114472c;
        if (rieVar != null) {
            rieVar.m179501f();
            this.f114472c = null;
        }
        InterfaceC17608a interfaceC17608a = this.f114471b;
        if (interfaceC17608a != null) {
            interfaceC17608a.mo122709f(this);
            this.f114471b = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m137746f() {
        C17609b c17609b = this.f114470a;
        if (c17609b != null) {
            this.f114479j = Boolean.FALSE;
            this.f114485p = false;
            this.f114480k = false;
            c17609b.m137756a();
            this.f114470a = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public String m137747g() {
        return this.f114483n;
    }

    /* JADX INFO: renamed from: h */
    public SurfaceTexture m137748h() {
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
    public void m137749i() {
        InterfaceC17608a interfaceC17608a = this.f114471b;
        if (interfaceC17608a != null && this.f114473d == null && this.f114472c == null) {
            this.f114473d = interfaceC17608a.mo122704a();
        }
        if (this.f114472c != null || this.f114473d == null) {
            return;
        }
        if (this.f114474e == null) {
            this.f114474e = m137748h();
        }
        try {
            rie rieVar = new rie(this.f114471b.mo122705b());
            this.f114472c = rieVar;
            rieVar.m179497b(this.f114473d.f159542c, this.f114474e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        InterfaceC17608a interfaceC17608a2 = this.f114471b;
        if (interfaceC17608a2 != null) {
            interfaceC17608a2.mo122710g(this);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m137750j() {
        iqe iqeVar;
        boolean z;
        rie rieVar;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Runnable runnable = this.f114484o;
            if (runnable != null) {
                runnable.run();
                this.f114484o = null;
            }
            if (this.f114482m && (rieVar = this.f114473d) != null) {
                rieVar.m179500e();
                this.f114471b.mo122712i(this.f114473d, this);
                this.f114473d.m179502g();
                return;
            }
            rie rieVar2 = this.f114472c;
            if (rieVar2 != null && this.f114474e != null) {
                int iM179499d = rieVar2.m179499d();
                int iM179498c = this.f114472c.m179498c();
                int i = this.f114468C;
                if (!(iM179498c == i && iM179499d == this.f114469D) && i > 0) {
                    this.f114471b.mo122708e(iM179498c, iM179499d);
                    z = true;
                } else {
                    z = false;
                }
                this.f114468C = iM179498c;
                this.f114469D = iM179499d;
                if (this.f114471b != null) {
                    this.f114472c.m179500e();
                    this.f114471b.mo122712i(this.f114472c, this);
                    if (!this.f114487r) {
                        this.f114487r = true;
                    }
                    try {
                        this.f114472c.m179502g();
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    this.f114471b.mo122707d();
                }
            }
            if (this.f114481l == 1) {
                this.f114471b.mo122706c();
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f114492w++;
            long jNanoTime = System.nanoTime() / 1000;
            this.f114489t = jNanoTime;
            int i2 = this.f114492w;
            if (i2 > 3) {
                this.f114493x = (int) (((long) this.f114493x) + (jNanoTime - this.f114490u));
                this.f114491v++;
            }
            if (i2 > 20) {
                long j = ((long) this.f114493x) / this.f114491v;
                if (j > 0) {
                    this.f114494y = (int) ((1000000 / j) + 1);
                }
                int i3 = this.f114494y;
                if (i3 > 0) {
                    this.f114495z = 1000 / i3;
                }
                this.f114491v = 0L;
                this.f114490u = 0L;
                this.f114489t = 0L;
                this.f114493x = 0;
                this.f114492w = 0;
            }
            this.f114490u = this.f114489t;
            InterfaceC17608a interfaceC17608a = this.f114471b;
            if (interfaceC17608a != null) {
                int i4 = (int) (jCurrentTimeMillis2 - jCurrentTimeMillis);
                iqeVar = this;
                try {
                    interfaceC17608a.mo122711h(iqeVar, this.f114494y, i4 < 0 ? 0 : i4, 0, this.f114466A);
                } catch (Throwable th) {
                    th = th;
                    iqeVar.m137752m();
                    th.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            th = th2;
            iqeVar = this;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m137751k() {
        if (this.f114470a == null) {
            C17609b c17609b = new C17609b("EffectPipRender");
            this.f114470a = c17609b;
            c17609b.setPriority(10);
            this.f114470a.start();
        }
        synchronized (this.f114476g) {
            try {
                try {
                    boolean z = this.f114478i;
                    Object obj = this.f114476g;
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
    public void m137752m() {
        if (this.f114488s || this.f114479j.booleanValue()) {
            return;
        }
        synchronized (this.f114477h) {
            this.f114479j = Boolean.TRUE;
            this.f114477h.notifyAll();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m137753n(InterfaceC17608a interfaceC17608a) {
        this.f114471b = interfaceC17608a;
    }

    /* JADX INFO: renamed from: o */
    public void m137754o(String str) {
        this.f114483n = str;
    }

    /* JADX INFO: renamed from: p */
    public void m137755p(Object obj) {
        synchronized (this.f114476g) {
            this.f114474e = obj;
            m137749i();
            this.f114476g.notifyAll();
        }
    }
}
