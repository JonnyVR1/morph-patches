package p153l;

import android.content.Context;
import com.immomo.medialog.BatteryMetrics;

/* JADX INFO: loaded from: classes7.dex */
public class yt0 {

    /* JADX INFO: renamed from: d */
    private static volatile yt0 f201473d = null;

    /* JADX INFO: renamed from: e */
    public static int f201474e = 0;

    /* JADX INFO: renamed from: f */
    public static int f201475f = 1;

    /* JADX INFO: renamed from: g */
    public static int f201476g = 2;

    /* JADX INFO: renamed from: a */
    private boolean f201477a;

    /* JADX INFO: renamed from: b */
    private qp20 f201478b;

    /* JADX INFO: renamed from: c */
    private int f201479c = -1;

    private yt0() {
    }

    /* JADX INFO: renamed from: g */
    public static yt0 m217280g() {
        if (f201473d == null) {
            synchronized (yt0.class) {
                try {
                    if (f201473d == null) {
                        f201473d = new yt0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f201473d;
    }

    /* JADX INFO: renamed from: a */
    public int m217281a() {
        if (!this.f201477a) {
            return pgy.m172290h().m172296e();
        }
        qp20 qp20Var = this.f201478b;
        if (qp20Var != null) {
            return (int) qp20Var.m177399a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public String m217282b() {
        return BatteryMetrics.getInstance().getBatteryInfo();
    }

    /* JADX INFO: renamed from: c */
    public int m217283c() {
        return BatteryMetrics.getInstance().getBatteryRemin();
    }

    /* JADX INFO: renamed from: d */
    public String m217284d() {
        return BatteryMetrics.getInstance().getBatteryStatus();
    }

    /* JADX INFO: renamed from: e */
    public int m217285e() {
        if (!this.f201477a) {
            return pgy.m172290h().m172299l();
        }
        qp20 qp20Var = this.f201478b;
        if (qp20Var != null) {
            return (int) qp20Var.m177400b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int m217286f() {
        qp20 qp20Var;
        if (!this.f201477a || (qp20Var = this.f201478b) == null) {
            return 0;
        }
        return qp20Var.m177401c();
    }

    /* JADX INFO: renamed from: h */
    public String m217287h() {
        return BatteryMetrics.getInstance().getIpAddr();
    }

    /* JADX INFO: renamed from: i */
    public int m217288i() {
        if (!this.f201477a) {
            return kuf.m151515h().m151519i() / 5;
        }
        qp20 qp20Var = this.f201478b;
        if (qp20Var != null) {
            return qp20Var.m177404f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public int m217289j() {
        if (!this.f201477a) {
            return kuf.m151515h().m151519i();
        }
        qp20 qp20Var = this.f201478b;
        if (qp20Var != null) {
            return qp20Var.m177405g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public float m217290k() {
        qp20 qp20Var;
        if (!this.f201477a || (qp20Var = this.f201478b) == null) {
            return 0.0f;
        }
        return qp20Var.m177406h();
    }

    /* JADX INFO: renamed from: l */
    public int m217291l() {
        return BatteryMetrics.getInstance().getThermalOfBattery();
    }

    /* JADX INFO: renamed from: m */
    public int m217292m() {
        if (!this.f201477a) {
            return pgy.m172290h().m172298j();
        }
        qp20 qp20Var = this.f201478b;
        if (qp20Var != null) {
            return (int) qp20Var.m177407i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public long m217293n() {
        if (!this.f201477a) {
            return pgy.m172290h().m172300m();
        }
        qp20 qp20Var = this.f201478b;
        if (qp20Var != null) {
            return qp20Var.m177402d();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: o */
    public int m217294o() {
        if (!this.f201477a) {
            return pgy.m172290h().m172297i();
        }
        qp20 qp20Var = this.f201478b;
        if (qp20Var != null) {
            return qp20Var.m177403e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void m217295p(Context context, int i) {
        this.f201477a = csx.m112235R().m112285Q0();
        b7y.m102882c().m102888g("ApmManager", "enableApmPlugin:" + this.f201477a);
        if (this.f201477a) {
            if (this.f201478b == null) {
                this.f201478b = new qp20();
            }
            if (this.f201479c == -1) {
                b7y.m102882c().m102888g("ApmManager", "startTrace === " + i);
            }
            this.f201479c = i;
            this.f201478b.m177408j(context, new zt0(true, 10000L, true, true, true, true));
        } else if (i == f201474e || i == f201475f) {
            pgy.m172290h().m172301n(context);
            pgy.m172290h().m172302r();
        }
        try {
            BatteryMetrics.getInstance().init(context);
        } catch (Exception e) {
            b7y.m102882c().m102888g("BatteryMetrics", "init error: " + e);
        }
        if (this.f201477a || !csx.m112235R().m112290S0()) {
            return;
        }
        kuf.m151515h().m151520m();
    }

    /* JADX INFO: renamed from: q */
    public void m217296q(int i) {
        if (this.f201477a) {
            qp20 qp20Var = this.f201478b;
            if (qp20Var != null && this.f201479c == i) {
                qp20Var.m177409k();
                this.f201478b = null;
                this.f201479c = -1;
                b7y.m102882c().m102888g("ApmManager", "stopTrace === " + i);
            }
        } else {
            pgy.m172290h().m172303s();
        }
        try {
            BatteryMetrics.getInstance().uninit();
        } catch (Exception e) {
            b7y.m102882c().m102888g("BatteryMetrics", "uninit error: " + e);
        }
        if (this.f201477a || !csx.m112235R().m112290S0()) {
            return;
        }
        kuf.m151515h().m151521n();
    }
}
