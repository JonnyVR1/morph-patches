package p149l;

import android.content.Context;
import com.immomo.medialog.BatteryMetrics;

/* JADX INFO: loaded from: classes7.dex */
public class st0 {

    /* JADX INFO: renamed from: d */
    private static volatile st0 f166268d = null;

    /* JADX INFO: renamed from: e */
    public static int f166269e = 0;

    /* JADX INFO: renamed from: f */
    public static int f166270f = 1;

    /* JADX INFO: renamed from: g */
    public static int f166271g = 2;

    /* JADX INFO: renamed from: a */
    private boolean f166272a;

    /* JADX INFO: renamed from: b */
    private gh20 f166273b;

    /* JADX INFO: renamed from: c */
    private int f166274c = -1;

    private st0() {
    }

    /* JADX INFO: renamed from: g */
    public static st0 m185792g() {
        if (f166268d == null) {
            synchronized (st0.class) {
                try {
                    if (f166268d == null) {
                        f166268d = new st0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f166268d;
    }

    /* JADX INFO: renamed from: a */
    public int m185793a() {
        if (!this.f166272a) {
            return s7y.m182539h().m182545e();
        }
        gh20 gh20Var = this.f166273b;
        if (gh20Var != null) {
            return (int) gh20Var.m126135a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public String m185794b() {
        return BatteryMetrics.getInstance().getBatteryInfo();
    }

    /* JADX INFO: renamed from: c */
    public int m185795c() {
        return BatteryMetrics.getInstance().getBatteryRemin();
    }

    /* JADX INFO: renamed from: d */
    public String m185796d() {
        return BatteryMetrics.getInstance().getBatteryStatus();
    }

    /* JADX INFO: renamed from: e */
    public int m185797e() {
        if (!this.f166272a) {
            return s7y.m182539h().m182548l();
        }
        gh20 gh20Var = this.f166273b;
        if (gh20Var != null) {
            return (int) gh20Var.m126136b();
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int m185798f() {
        gh20 gh20Var;
        if (!this.f166272a || (gh20Var = this.f166273b) == null) {
            return 0;
        }
        return gh20Var.m126137c();
    }

    /* JADX INFO: renamed from: h */
    public String m185799h() {
        return BatteryMetrics.getInstance().getIpAddr();
    }

    /* JADX INFO: renamed from: i */
    public int m185800i() {
        if (!this.f166272a) {
            return wsf.m205486h().m205490i() / 5;
        }
        gh20 gh20Var = this.f166273b;
        if (gh20Var != null) {
            return gh20Var.m126140f();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public int m185801j() {
        if (!this.f166272a) {
            return wsf.m205486h().m205490i();
        }
        gh20 gh20Var = this.f166273b;
        if (gh20Var != null) {
            return gh20Var.m126141g();
        }
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public float m185802k() {
        gh20 gh20Var;
        if (!this.f166272a || (gh20Var = this.f166273b) == null) {
            return 0.0f;
        }
        return gh20Var.m126142h();
    }

    /* JADX INFO: renamed from: l */
    public int m185803l() {
        return BatteryMetrics.getInstance().getThermalOfBattery();
    }

    /* JADX INFO: renamed from: m */
    public int m185804m() {
        if (!this.f166272a) {
            return s7y.m182539h().m182547j();
        }
        gh20 gh20Var = this.f166273b;
        if (gh20Var != null) {
            return (int) gh20Var.m126143i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public long m185805n() {
        if (!this.f166272a) {
            return s7y.m182539h().m182549m();
        }
        gh20 gh20Var = this.f166273b;
        if (gh20Var != null) {
            return gh20Var.m126138d();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: o */
    public int m185806o() {
        if (!this.f166272a) {
            return s7y.m182539h().m182546i();
        }
        gh20 gh20Var = this.f166273b;
        if (gh20Var != null) {
            return gh20Var.m126139e();
        }
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void m185807p(Context context, int i) {
        this.f166272a = fjx.m121638R().m121688Q0();
        eyx.m118802c().m118808g("ApmManager", "enableApmPlugin:" + this.f166272a);
        if (this.f166272a) {
            if (this.f166273b == null) {
                this.f166273b = new gh20();
            }
            if (this.f166274c == -1) {
                eyx.m118802c().m118808g("ApmManager", "startTrace === " + i);
            }
            this.f166274c = i;
            this.f166273b.m126144j(context, new tt0(true, 10000L, true, true, true, true));
        } else if (i == f166269e || i == f166270f) {
            s7y.m182539h().m182550n(context);
            s7y.m182539h().m182551r();
        }
        try {
            BatteryMetrics.getInstance().init(context);
        } catch (Exception e) {
            eyx.m118802c().m118808g("BatteryMetrics", "init error: " + e);
        }
        if (this.f166272a || !fjx.m121638R().m121693S0()) {
            return;
        }
        wsf.m205486h().m205491m();
    }

    /* JADX INFO: renamed from: q */
    public void m185808q(int i) {
        if (this.f166272a) {
            gh20 gh20Var = this.f166273b;
            if (gh20Var != null && this.f166274c == i) {
                gh20Var.m126145k();
                this.f166273b = null;
                this.f166274c = -1;
                eyx.m118802c().m118808g("ApmManager", "stopTrace === " + i);
            }
        } else {
            s7y.m182539h().m182552s();
        }
        try {
            BatteryMetrics.getInstance().uninit();
        } catch (Exception e) {
            eyx.m118802c().m118808g("BatteryMetrics", "uninit error: " + e);
        }
        if (this.f166272a || !fjx.m121638R().m121693S0()) {
            return;
        }
        wsf.m205486h().m205492n();
    }
}
