package p153l;

import android.os.SystemClock;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public class xcl0 {

    /* JADX INFO: renamed from: E */
    private float f193321E;

    /* JADX INFO: renamed from: c */
    private int f193325c;

    /* JADX INFO: renamed from: o */
    private qvf0 f193337o;

    /* JADX INFO: renamed from: p */
    n410.InterfaceC18792r f193338p;

    /* JADX INFO: renamed from: a */
    private final int f193323a = 0;

    /* JADX INFO: renamed from: b */
    private final int f193324b = 1;

    /* JADX INFO: renamed from: d */
    private long f193326d = 0;

    /* JADX INFO: renamed from: e */
    private final int f193327e = 5;

    /* JADX INFO: renamed from: f */
    private final int f193328f = -1;

    /* JADX INFO: renamed from: g */
    private int f193329g = 0;

    /* JADX INFO: renamed from: h */
    private long f193330h = 0;

    /* JADX INFO: renamed from: i */
    private long f193331i = -1;

    /* JADX INFO: renamed from: j */
    protected long f193332j = 0;

    /* JADX INFO: renamed from: k */
    protected long f193333k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f193334l = false;

    /* JADX INFO: renamed from: m */
    private boolean f193335m = false;

    /* JADX INFO: renamed from: n */
    private boolean f193336n = false;

    /* JADX INFO: renamed from: q */
    protected C21280a f193339q = null;

    /* JADX INFO: renamed from: r */
    private LinkedList<Long> f193340r = new LinkedList<>();

    /* JADX INFO: renamed from: u */
    private int f193343u = 0;

    /* JADX INFO: renamed from: v */
    private int f193344v = -1;

    /* JADX INFO: renamed from: w */
    private int f193345w = 0;

    /* JADX INFO: renamed from: x */
    private int f193346x = -1;

    /* JADX INFO: renamed from: y */
    private int f193347y = 500;

    /* JADX INFO: renamed from: z */
    private long f193348z = 0;

    /* JADX INFO: renamed from: A */
    private int f193317A = 0;

    /* JADX INFO: renamed from: B */
    private int f193318B = 0;

    /* JADX INFO: renamed from: C */
    private int f193319C = 0;

    /* JADX INFO: renamed from: D */
    private int f193320D = 0;

    /* JADX INFO: renamed from: F */
    private float f193322F = 0.0f;

    /* JADX INFO: renamed from: s */
    private Object f193341s = new Object();

    /* JADX INFO: renamed from: t */
    private Object f193342t = new Object();

    /* JADX INFO: renamed from: l.xcl0$a */
    public class C21280a extends Thread {

        /* JADX INFO: renamed from: a */
        protected boolean f193349a;

        /* JADX INFO: renamed from: b */
        private Object f193350b;

        public C21280a(String str) {
            super(str);
            this.f193349a = false;
            this.f193350b = new Object();
        }

        /* JADX INFO: renamed from: a */
        public void m210183a() {
            this.f193349a = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            do {
                synchronized (this.f193350b) {
                    try {
                        this.f193350b.wait(5L);
                    } catch (Exception unused) {
                    }
                }
                if (xcl0.this.f193335m) {
                    synchronized (xcl0.this.f193341s) {
                        xcl0.this.f193340r.clear();
                    }
                    xcl0.this.f193335m = false;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (xcl0.this.f193325c == 1 && xcl0.this.f193326d != 0 && jUptimeMillis - xcl0.this.f193326d > 2000) {
                    MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer Force Reset");
                    xcl0.this.m210167t();
                    xcl0.this.f193326d = jUptimeMillis;
                }
                if (xcl0.this.f193344v == -1 || xcl0.this.f193343u < xcl0.this.f193344v) {
                    xcl0.this.m210154B();
                }
            } while (!this.f193349a);
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer ---render---");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:151:0x0220 A[Catch: all -> 0x0014, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:13:0x0017, B:14:0x0019, B:36:0x0061, B:38:0x0067, B:41:0x0076, B:43:0x007e, B:47:0x0087, B:49:0x008d, B:50:0x008f, B:52:0x0095, B:53:0x009b, B:59:0x00a7, B:63:0x00b5, B:65:0x00bb, B:66:0x00c1, B:68:0x00c5, B:69:0x00c9, B:71:0x00e2, B:72:0x00e6, B:104:0x0154, B:106:0x015a, B:109:0x0160, B:114:0x0174, B:113:0x0171, B:144:0x01e3, B:146:0x0202, B:148:0x0206, B:149:0x0212, B:151:0x0220, B:152:0x0222, B:155:0x022a, B:159:0x02b2, B:115:0x0183, B:75:0x00f2, B:77:0x0101, B:91:0x012c, B:97:0x013a, B:99:0x0146, B:94:0x0131, B:80:0x010d, B:83:0x0119, B:86:0x0122, B:117:0x0190, B:122:0x0199, B:123:0x01a4, B:141:0x01e0, B:62:0x00ad, B:163:0x02b6, B:153:0x0223, B:154:0x0229, B:15:0x001a, B:17:0x0023, B:19:0x0027, B:21:0x0030, B:24:0x0037, B:25:0x003e, B:26:0x0043, B:29:0x0046, B:31:0x004c, B:33:0x0052, B:35:0x0060), top: B:171:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x01c9 -> B:140:0x01df). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: B */
    public synchronized void m210154B() {
        int iM178286d;
        long jM178284b;
        boolean z;
        long jUptimeMillis;
        n410.InterfaceC18792r interfaceC18792r;
        boolean z2;
        int i = this.f193344v;
        boolean z3 = true;
        if (i != -1 && this.f193343u >= i) {
            this.f193320D++;
            return;
        }
        synchronized (this.f193341s) {
            try {
                if (this.f193340r.size() == 0) {
                    if (this.f193336n) {
                        m210167t();
                        this.f193336n = false;
                        n410.InterfaceC18792r interfaceC18792r2 = this.f193338p;
                        if (interfaceC18792r2 != null) {
                            interfaceC18792r2.mo161505a();
                        }
                        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer Range finish");
                    }
                    this.f193319C++;
                    return;
                }
                LinkedList<Long> linkedList = this.f193340r;
                long j = -1;
                long jLongValue = (linkedList == null || linkedList.size() <= 0) ? -1L : this.f193340r.pollFirst().longValue();
                qvf0 qvf0Var = this.f193337o;
                long j2 = 0;
                if (qvf0Var != null) {
                    qvf0Var.m178287e(null, 0, jLongValue);
                    iM178286d = this.f193337o.m178286d();
                    if (jLongValue == 0) {
                        iM178286d = 1;
                    }
                    jM178284b = this.f193337o.m178284b();
                    if (iM178286d < 0) {
                        this.f193338p.mo161506b(false);
                        return;
                    }
                } else {
                    iM178286d = 0;
                    jM178284b = jLongValue;
                }
                if (this.f193331i < 0) {
                    this.f193331i = jM178284b;
                }
                if (this.f193330h <= 0) {
                    this.f193330h = SystemClock.uptimeMillis();
                }
                try {
                    this.f193334l = false;
                    z = false;
                    while (true) {
                        if (iM178286d > 0) {
                            iM178286d--;
                        }
                        int i2 = iM178286d;
                        if (jLongValue == j2) {
                            try {
                                this.f193333k = j2;
                            } catch (Exception e) {
                                e = e;
                                MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer videoRefresh failed !!!" + e.toString());
                                e.printStackTrace();
                                if (!z) {
                                    interfaceC18792r.mo161506b(false);
                                    this.f193318B++;
                                }
                                jUptimeMillis = SystemClock.uptimeMillis();
                                if (jUptimeMillis - this.f193348z >= 2000) {
                                    synchronized (this.f193341s) {
                                        MDLog.m7449i("SeekDiag", "VCP state=" + this.f193325c + " draw=" + this.f193317A + " skip=" + this.f193318B + " empty=" + this.f193319C + " blocked=" + this.f193320D + " queue=" + this.f193340r.size() + " lostSteps=" + this.f193322F + " audioPts=" + this.f193332j + " videoPts=" + this.f193333k + " targetFC=" + this.f193344v + " renderFC=" + this.f193343u);
                                        this.f193348z = jUptimeMillis;
                                        this.f193317A = 0;
                                        this.f193318B = 0;
                                        this.f193319C = 0;
                                        this.f193320D = 0;
                                    }
                                }
                            }
                        } else {
                            this.f193333k = jM178284b - ((long) (qvf0.f159746k * i2));
                        }
                        n410.InterfaceC18792r interfaceC18792r3 = this.f193338p;
                        long j3 = 1000;
                        if (interfaceC18792r3 != null) {
                            interfaceC18792r3.mo161507c(this.f193333k / 1000);
                        }
                        if (this.f193329g == 0) {
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            while (true) {
                                j3 = j3;
                                long jUptimeMillis3 = SystemClock.uptimeMillis() - this.f193330h;
                                z2 = z3;
                                long j4 = (this.f193333k - this.f193331i) / j3;
                                if (j4 - jUptimeMillis3 > j3) {
                                    this.f193331i = j;
                                    this.f193330h = j;
                                }
                                if (SystemClock.uptimeMillis() - jUptimeMillis2 >= 200) {
                                    break;
                                }
                                long j5 = this.f193333k - this.f193332j;
                                if (j5 < -400000) {
                                    this.f193322F = 3.0f;
                                } else if (j5 < -300000) {
                                    this.f193322F = 1.0f;
                                } else if (j5 < -200000) {
                                    this.f193322F = 0.5f;
                                    break;
                                } else if (j5 >= -50000) {
                                    this.f193322F = 0.0f;
                                }
                                if (j5 < -50000) {
                                    break;
                                }
                                try {
                                    Thread.sleep(5L);
                                } catch (InterruptedException e2) {
                                    MDLog.printErrStackTrace("VideoControllerPlayer", e2);
                                }
                                if (jUptimeMillis3 < j4) {
                                    z3 = true;
                                } else {
                                    if (this.f193333k - this.f193332j <= 50000 || this.f193334l) {
                                        break;
                                        break;
                                    }
                                    z3 = z2;
                                }
                                j = -1;
                            }
                            if (m210170m()) {
                                this.f193318B++;
                            } else {
                                n410.InterfaceC18792r interfaceC18792r4 = this.f193338p;
                                if (interfaceC18792r4 != null) {
                                    if (z) {
                                        interfaceC18792r4.mo161508d();
                                    } else {
                                        try {
                                            this.f193343u++;
                                            interfaceC18792r4.mo161506b(z2);
                                            z = true;
                                        } catch (Exception e3) {
                                            e = e3;
                                            z = true;
                                            MDLog.m7445e(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer videoRefresh failed !!!" + e.toString());
                                            e.printStackTrace();
                                        }
                                    }
                                    this.f193326d = SystemClock.uptimeMillis();
                                    this.f193317A++;
                                }
                            }
                        } else {
                            if (this.f193325c == 0) {
                                return;
                            }
                            m210155C(0, 5000);
                            m210155C(1, this.f193347y);
                            synchronized (this.f193342t) {
                                try {
                                    n410.InterfaceC18792r interfaceC18792r5 = this.f193338p;
                                    if (interfaceC18792r5 != null) {
                                        if (z) {
                                            interfaceC18792r5.mo161508d();
                                        } else {
                                            try {
                                                this.f193343u++;
                                                this.f193345w++;
                                                interfaceC18792r5.mo161506b(true);
                                                z = true;
                                            } catch (Throwable th) {
                                                th = th;
                                                z = true;
                                                throw th;
                                            }
                                        }
                                        this.f193326d = SystemClock.uptimeMillis();
                                    }
                                    this.f193344v = this.f193343u;
                                    this.f193346x = this.f193345w;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                        if (i2 <= 0) {
                            break;
                        }
                        iM178286d = i2;
                        z3 = true;
                        j = -1;
                        j2 = 0;
                    }
                } catch (Exception e4) {
                    e = e4;
                    z = false;
                }
                if (!z && (interfaceC18792r = this.f193338p) != null) {
                    interfaceC18792r.mo161506b(false);
                    this.f193318B++;
                }
                jUptimeMillis = SystemClock.uptimeMillis();
                if (jUptimeMillis - this.f193348z >= 2000) {
                    synchronized (this.f193341s) {
                    }
                    MDLog.m7449i("SeekDiag", "VCP state=" + this.f193325c + " draw=" + this.f193317A + " skip=" + this.f193318B + " empty=" + this.f193319C + " blocked=" + this.f193320D + " queue=" + this.f193340r.size() + " lostSteps=" + this.f193322F + " audioPts=" + this.f193332j + " videoPts=" + this.f193333k + " targetFC=" + this.f193344v + " renderFC=" + this.f193343u);
                    this.f193348z = jUptimeMillis;
                    this.f193317A = 0;
                    this.f193318B = 0;
                    this.f193319C = 0;
                    this.f193320D = 0;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    private void m210155C(int i, int i2) {
        do {
            if (i == 0) {
                if (this.f193344v != this.f193343u) {
                    return;
                }
            } else if (this.f193346x != this.f193345w) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.f193326d > i2) {
                m210167t();
                this.f193326d = jUptimeMillis;
                StringBuilder sb = new StringBuilder("VideoControllerPlayer reset error, because:");
                sb.append(i == 0 ? "render" : "encoder");
                sb.append(" timeoutInMs:");
                sb.append(i2);
                MDLog.m7445e("VideoControllerPlayer", sb.toString());
                return;
            }
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                MDLog.printErrStackTrace("VideoControllerPlayer", e);
            }
            if (this.f193334l) {
                return;
            }
        } while (this.f193325c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public synchronized void m210167t() {
        this.f193326d = 0L;
        this.f193331i = -1L;
        this.f193330h = 0L;
        this.f193332j = 0L;
        this.f193343u = 0;
        this.f193344v = -1;
        this.f193345w = 0;
        this.f193346x = -1;
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m210168A() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer start !!!");
        if (this.f193339q == null) {
            C21280a c21280a = new C21280a("CodecPlayerThread");
            this.f193339q = c21280a;
            c21280a.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m210169l(long j) {
        synchronized (this.f193341s) {
            try {
                if (j == -1) {
                    this.f193336n = true;
                } else {
                    this.f193340r.offer(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m210170m() {
        float f = this.f193321E;
        if (f < 1.0f) {
            this.f193321E = f + this.f193322F;
            return false;
        }
        float f2 = f - 1.0f;
        this.f193321E = f2;
        if (f2 >= 1.0f) {
            return true;
        }
        this.f193321E = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m210171n() {
        try {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer clearCache !!!");
            qvf0 qvf0Var = this.f193337o;
            if (qvf0Var != null) {
                qvf0Var.mo178283a();
            }
            this.f193335m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m210172o() {
        if (this.f193329g == 1) {
            synchronized (this.f193342t) {
                this.f193346x = this.f193345w + 1;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m210173p() {
        synchronized (this.f193342t) {
            this.f193344v = this.f193343u + 1;
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m210174q() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer pause !!!");
        this.f193325c = 0;
        this.f193344v = this.f193343u;
    }

    /* JADX INFO: renamed from: r */
    public void m210175r() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer pause !!!");
        this.f193325c = 0;
        this.f193344v = this.f193343u;
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m210176s() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer release !!!");
        this.f193325c = 0;
        synchronized (this.f193341s) {
            this.f193340r.clear();
        }
        this.f193338p = null;
        this.f193334l = true;
        C21280a c21280a = this.f193339q;
        if (c21280a != null) {
            c21280a.m210183a();
            this.f193339q = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m210177u() {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer resume !!!");
        this.f193325c = 1;
        m210167t();
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m210178v(boolean z) {
        try {
            MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer seekResume !!!" + z);
            m210167t();
            if (z) {
                this.f193325c = 1;
            } else {
                this.f193325c = 0;
                this.f193344v = this.f193343u + 1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m210179w(long j) {
        this.f193332j = j;
    }

    /* JADX INFO: renamed from: x */
    public void m210180x(n410.InterfaceC18792r interfaceC18792r) {
        this.f193338p = interfaceC18792r;
    }

    /* JADX INFO: renamed from: y */
    public void m210181y(int i) {
        MDLog.m7449i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer Set Render Model  " + i + "!!!");
        this.f193329g = i;
        this.f193336n = false;
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m210182z(qvf0 qvf0Var) {
        if (qvf0Var != null) {
            this.f193337o = qvf0Var;
        }
    }
}
