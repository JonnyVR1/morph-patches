package p149l;

import android.os.SystemClock;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public class s3l0 {

    /* JADX INFO: renamed from: E */
    private float f162152E;

    /* JADX INFO: renamed from: c */
    private int f162156c;

    /* JADX INFO: renamed from: o */
    private hnf0 f162168o;

    /* JADX INFO: renamed from: p */
    fw00.InterfaceC16949r f162169p;

    /* JADX INFO: renamed from: a */
    private final int f162154a = 0;

    /* JADX INFO: renamed from: b */
    private final int f162155b = 1;

    /* JADX INFO: renamed from: d */
    private long f162157d = 0;

    /* JADX INFO: renamed from: e */
    private final int f162158e = 5;

    /* JADX INFO: renamed from: f */
    private final int f162159f = -1;

    /* JADX INFO: renamed from: g */
    private int f162160g = 0;

    /* JADX INFO: renamed from: h */
    private long f162161h = 0;

    /* JADX INFO: renamed from: i */
    private long f162162i = -1;

    /* JADX INFO: renamed from: j */
    protected long f162163j = 0;

    /* JADX INFO: renamed from: k */
    protected long f162164k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f162165l = false;

    /* JADX INFO: renamed from: m */
    private boolean f162166m = false;

    /* JADX INFO: renamed from: n */
    private boolean f162167n = false;

    /* JADX INFO: renamed from: q */
    protected C19843a f162170q = null;

    /* JADX INFO: renamed from: r */
    private LinkedList<Long> f162171r = new LinkedList<>();

    /* JADX INFO: renamed from: u */
    private int f162174u = 0;

    /* JADX INFO: renamed from: v */
    private int f162175v = -1;

    /* JADX INFO: renamed from: w */
    private int f162176w = 0;

    /* JADX INFO: renamed from: x */
    private int f162177x = -1;

    /* JADX INFO: renamed from: y */
    private int f162178y = 500;

    /* JADX INFO: renamed from: z */
    private long f162179z = 0;

    /* JADX INFO: renamed from: A */
    private int f162148A = 0;

    /* JADX INFO: renamed from: B */
    private int f162149B = 0;

    /* JADX INFO: renamed from: C */
    private int f162150C = 0;

    /* JADX INFO: renamed from: D */
    private int f162151D = 0;

    /* JADX INFO: renamed from: F */
    private float f162153F = 0.0f;

    /* JADX INFO: renamed from: s */
    private Object f162172s = new Object();

    /* JADX INFO: renamed from: t */
    private Object f162173t = new Object();

    /* JADX INFO: renamed from: l.s3l0$a */
    public class C19843a extends Thread {

        /* JADX INFO: renamed from: a */
        protected boolean f162180a;

        /* JADX INFO: renamed from: b */
        private Object f162181b;

        public C19843a(String str) {
            super(str);
            this.f162180a = false;
            this.f162181b = new Object();
        }

        /* JADX INFO: renamed from: a */
        public void m182195a() {
            this.f162180a = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            do {
                synchronized (this.f162181b) {
                    try {
                        this.f162181b.wait(5L);
                    } catch (Exception unused) {
                    }
                }
                if (s3l0.this.f162166m) {
                    synchronized (s3l0.this.f162172s) {
                        s3l0.this.f162171r.clear();
                    }
                    s3l0.this.f162166m = false;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (s3l0.this.f162156c == 1 && s3l0.this.f162157d != 0 && jUptimeMillis - s3l0.this.f162157d > 2000) {
                    MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer Force Reset");
                    s3l0.this.m182179t();
                    s3l0.this.f162157d = jUptimeMillis;
                }
                if (s3l0.this.f162175v == -1 || s3l0.this.f162174u < s3l0.this.f162175v) {
                    s3l0.this.m182166B();
                }
            } while (!this.f162180a);
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer ---render---");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:151:0x0220 A[Catch: all -> 0x0014, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000d, B:13:0x0017, B:14:0x0019, B:36:0x0061, B:38:0x0067, B:41:0x0076, B:43:0x007e, B:47:0x0087, B:49:0x008d, B:50:0x008f, B:52:0x0095, B:53:0x009b, B:59:0x00a7, B:63:0x00b5, B:65:0x00bb, B:66:0x00c1, B:68:0x00c5, B:69:0x00c9, B:71:0x00e2, B:72:0x00e6, B:104:0x0154, B:106:0x015a, B:109:0x0160, B:114:0x0174, B:113:0x0171, B:144:0x01e3, B:146:0x0202, B:148:0x0206, B:149:0x0212, B:151:0x0220, B:152:0x0222, B:155:0x022a, B:159:0x02b2, B:115:0x0183, B:75:0x00f2, B:77:0x0101, B:91:0x012c, B:97:0x013a, B:99:0x0146, B:94:0x0131, B:80:0x010d, B:83:0x0119, B:86:0x0122, B:117:0x0190, B:122:0x0199, B:123:0x01a4, B:141:0x01e0, B:62:0x00ad, B:163:0x02b6, B:153:0x0223, B:154:0x0229, B:15:0x001a, B:17:0x0023, B:19:0x0027, B:21:0x0030, B:24:0x0037, B:25:0x003e, B:26:0x0043, B:29:0x0046, B:31:0x004c, B:33:0x0052, B:35:0x0060), top: B:171:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x01c9 -> B:140:0x01df). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: B */
    public synchronized void m182166B() {
        int iM131920d;
        long jM131918b;
        boolean z;
        long jUptimeMillis;
        fw00.InterfaceC16949r interfaceC16949r;
        boolean z2;
        int i = this.f162175v;
        boolean z3 = true;
        if (i != -1 && this.f162174u >= i) {
            this.f162151D++;
            return;
        }
        synchronized (this.f162172s) {
            try {
                if (this.f162171r.size() == 0) {
                    if (this.f162167n) {
                        m182179t();
                        this.f162167n = false;
                        fw00.InterfaceC16949r interfaceC16949r2 = this.f162169p;
                        if (interfaceC16949r2 != null) {
                            interfaceC16949r2.mo123492a();
                        }
                        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer Range finish");
                    }
                    this.f162150C++;
                    return;
                }
                LinkedList<Long> linkedList = this.f162171r;
                long j = -1;
                long jLongValue = (linkedList == null || linkedList.size() <= 0) ? -1L : this.f162171r.pollFirst().longValue();
                hnf0 hnf0Var = this.f162168o;
                long j2 = 0;
                if (hnf0Var != null) {
                    hnf0Var.m131921e(null, 0, jLongValue);
                    iM131920d = this.f162168o.m131920d();
                    if (jLongValue == 0) {
                        iM131920d = 1;
                    }
                    jM131918b = this.f162168o.m131918b();
                    if (iM131920d < 0) {
                        this.f162169p.mo123493b(false);
                        return;
                    }
                } else {
                    iM131920d = 0;
                    jM131918b = jLongValue;
                }
                if (this.f162162i < 0) {
                    this.f162162i = jM131918b;
                }
                if (this.f162161h <= 0) {
                    this.f162161h = SystemClock.uptimeMillis();
                }
                try {
                    this.f162165l = false;
                    z = false;
                    while (true) {
                        if (iM131920d > 0) {
                            iM131920d--;
                        }
                        int i2 = iM131920d;
                        if (jLongValue == j2) {
                            try {
                                this.f162164k = j2;
                            } catch (Exception e) {
                                e = e;
                                MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer videoRefresh failed !!!" + e.toString());
                                e.printStackTrace();
                                if (!z) {
                                    interfaceC16949r.mo123493b(false);
                                    this.f162149B++;
                                }
                                jUptimeMillis = SystemClock.uptimeMillis();
                                if (jUptimeMillis - this.f162179z >= 2000) {
                                    synchronized (this.f162172s) {
                                        MDLog.m7395i("SeekDiag", "VCP state=" + this.f162156c + " draw=" + this.f162148A + " skip=" + this.f162149B + " empty=" + this.f162150C + " blocked=" + this.f162151D + " queue=" + this.f162171r.size() + " lostSteps=" + this.f162153F + " audioPts=" + this.f162163j + " videoPts=" + this.f162164k + " targetFC=" + this.f162175v + " renderFC=" + this.f162174u);
                                        this.f162179z = jUptimeMillis;
                                        this.f162148A = 0;
                                        this.f162149B = 0;
                                        this.f162150C = 0;
                                        this.f162151D = 0;
                                    }
                                }
                            }
                        } else {
                            this.f162164k = jM131918b - ((long) (hnf0.f108616k * i2));
                        }
                        fw00.InterfaceC16949r interfaceC16949r3 = this.f162169p;
                        long j3 = 1000;
                        if (interfaceC16949r3 != null) {
                            interfaceC16949r3.mo123494c(this.f162164k / 1000);
                        }
                        if (this.f162160g == 0) {
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            while (true) {
                                j3 = j3;
                                long jUptimeMillis3 = SystemClock.uptimeMillis() - this.f162161h;
                                z2 = z3;
                                long j4 = (this.f162164k - this.f162162i) / j3;
                                if (j4 - jUptimeMillis3 > j3) {
                                    this.f162162i = j;
                                    this.f162161h = j;
                                }
                                if (SystemClock.uptimeMillis() - jUptimeMillis2 >= 200) {
                                    break;
                                }
                                long j5 = this.f162164k - this.f162163j;
                                if (j5 < -400000) {
                                    this.f162153F = 3.0f;
                                } else if (j5 < -300000) {
                                    this.f162153F = 1.0f;
                                } else if (j5 < -200000) {
                                    this.f162153F = 0.5f;
                                    break;
                                } else if (j5 >= -50000) {
                                    this.f162153F = 0.0f;
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
                                    if (this.f162164k - this.f162163j <= 50000 || this.f162165l) {
                                        break;
                                        break;
                                    }
                                    z3 = z2;
                                }
                                j = -1;
                            }
                            if (m182182m()) {
                                this.f162149B++;
                            } else {
                                fw00.InterfaceC16949r interfaceC16949r4 = this.f162169p;
                                if (interfaceC16949r4 != null) {
                                    if (z) {
                                        interfaceC16949r4.mo123495d();
                                    } else {
                                        try {
                                            this.f162174u++;
                                            interfaceC16949r4.mo123493b(z2);
                                            z = true;
                                        } catch (Exception e3) {
                                            e = e3;
                                            z = true;
                                            MDLog.m7391e(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer videoRefresh failed !!!" + e.toString());
                                            e.printStackTrace();
                                        }
                                    }
                                    this.f162157d = SystemClock.uptimeMillis();
                                    this.f162148A++;
                                }
                            }
                        } else {
                            if (this.f162156c == 0) {
                                return;
                            }
                            m182167C(0, 5000);
                            m182167C(1, this.f162178y);
                            synchronized (this.f162173t) {
                                try {
                                    fw00.InterfaceC16949r interfaceC16949r5 = this.f162169p;
                                    if (interfaceC16949r5 != null) {
                                        if (z) {
                                            interfaceC16949r5.mo123495d();
                                        } else {
                                            try {
                                                this.f162174u++;
                                                this.f162176w++;
                                                interfaceC16949r5.mo123493b(true);
                                                z = true;
                                            } catch (Throwable th) {
                                                th = th;
                                                z = true;
                                                throw th;
                                            }
                                        }
                                        this.f162157d = SystemClock.uptimeMillis();
                                    }
                                    this.f162175v = this.f162174u;
                                    this.f162177x = this.f162176w;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                        if (i2 <= 0) {
                            break;
                        }
                        iM131920d = i2;
                        z3 = true;
                        j = -1;
                        j2 = 0;
                    }
                } catch (Exception e4) {
                    e = e4;
                    z = false;
                }
                if (!z && (interfaceC16949r = this.f162169p) != null) {
                    interfaceC16949r.mo123493b(false);
                    this.f162149B++;
                }
                jUptimeMillis = SystemClock.uptimeMillis();
                if (jUptimeMillis - this.f162179z >= 2000) {
                    synchronized (this.f162172s) {
                    }
                    MDLog.m7395i("SeekDiag", "VCP state=" + this.f162156c + " draw=" + this.f162148A + " skip=" + this.f162149B + " empty=" + this.f162150C + " blocked=" + this.f162151D + " queue=" + this.f162171r.size() + " lostSteps=" + this.f162153F + " audioPts=" + this.f162163j + " videoPts=" + this.f162164k + " targetFC=" + this.f162175v + " renderFC=" + this.f162174u);
                    this.f162179z = jUptimeMillis;
                    this.f162148A = 0;
                    this.f162149B = 0;
                    this.f162150C = 0;
                    this.f162151D = 0;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    private void m182167C(int i, int i2) {
        do {
            if (i == 0) {
                if (this.f162175v != this.f162174u) {
                    return;
                }
            } else if (this.f162177x != this.f162176w) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - this.f162157d > i2) {
                m182179t();
                this.f162157d = jUptimeMillis;
                StringBuilder sb = new StringBuilder("VideoControllerPlayer reset error, because:");
                sb.append(i == 0 ? "render" : "encoder");
                sb.append(" timeoutInMs:");
                sb.append(i2);
                MDLog.m7391e("VideoControllerPlayer", sb.toString());
                return;
            }
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                MDLog.printErrStackTrace("VideoControllerPlayer", e);
            }
            if (this.f162165l) {
                return;
            }
        } while (this.f162156c == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public synchronized void m182179t() {
        this.f162157d = 0L;
        this.f162162i = -1L;
        this.f162161h = 0L;
        this.f162163j = 0L;
        this.f162174u = 0;
        this.f162175v = -1;
        this.f162176w = 0;
        this.f162177x = -1;
    }

    /* JADX INFO: renamed from: A */
    public synchronized void m182180A() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer start !!!");
        if (this.f162170q == null) {
            C19843a c19843a = new C19843a("CodecPlayerThread");
            this.f162170q = c19843a;
            c19843a.start();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m182181l(long j) {
        synchronized (this.f162172s) {
            try {
                if (j == -1) {
                    this.f162167n = true;
                } else {
                    this.f162171r.offer(Long.valueOf(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m182182m() {
        float f = this.f162152E;
        if (f < 1.0f) {
            this.f162152E = f + this.f162153F;
            return false;
        }
        float f2 = f - 1.0f;
        this.f162152E = f2;
        if (f2 >= 1.0f) {
            return true;
        }
        this.f162152E = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m182183n() {
        try {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer clearCache !!!");
            hnf0 hnf0Var = this.f162168o;
            if (hnf0Var != null) {
                hnf0Var.mo131917a();
            }
            this.f162166m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m182184o() {
        if (this.f162160g == 1) {
            synchronized (this.f162173t) {
                this.f162177x = this.f162176w + 1;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m182185p() {
        synchronized (this.f162173t) {
            this.f162175v = this.f162174u + 1;
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m182186q() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer pause !!!");
        this.f162156c = 0;
        this.f162175v = this.f162174u;
    }

    /* JADX INFO: renamed from: r */
    public void m182187r() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer pause !!!");
        this.f162156c = 0;
        this.f162175v = this.f162174u;
    }

    /* JADX INFO: renamed from: s */
    public synchronized void m182188s() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer release !!!");
        this.f162156c = 0;
        synchronized (this.f162172s) {
            this.f162171r.clear();
        }
        this.f162169p = null;
        this.f162165l = true;
        C19843a c19843a = this.f162170q;
        if (c19843a != null) {
            c19843a.m182195a();
            this.f162170q = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m182189u() {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer resume !!!");
        this.f162156c = 1;
        m182179t();
    }

    /* JADX INFO: renamed from: v */
    public synchronized void m182190v(boolean z) {
        try {
            MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer seekResume !!!" + z);
            m182179t();
            if (z) {
                this.f162156c = 1;
            } else {
                this.f162156c = 0;
                this.f162175v = this.f162174u + 1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m182191w(long j) {
        this.f162163j = j;
    }

    /* JADX INFO: renamed from: x */
    public void m182192x(fw00.InterfaceC16949r interfaceC16949r) {
        this.f162169p = interfaceC16949r;
    }

    /* JADX INFO: renamed from: y */
    public void m182193y(int i) {
        MDLog.m7395i(MDLogTag.MOMENT_EDIT_TAG, "VideoControllerPlayer Set Render Model  " + i + "!!!");
        this.f162160g = i;
        this.f162167n = false;
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m182194z(hnf0 hnf0Var) {
        if (hnf0Var != null) {
            this.f162168o = hnf0Var;
        }
    }
}
