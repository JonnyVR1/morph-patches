package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import l.mqi0;
import l.nt30;
import l.ok3;
import l.tpd0;
import l.vwb;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gzc0 extends ogl0 {

    /* JADX INFO: renamed from: h */
    public static gzc0 f13604h;

    /* JADX INFO: renamed from: b */
    public final zpd0 f13605b;

    /* JADX INFO: renamed from: c */
    public final tpd0 f13606c;

    /* JADX INFO: renamed from: d */
    public final zpd0 f13607d;

    /* JADX INFO: renamed from: e */
    public long f13608e;

    /* JADX INFO: renamed from: f */
    public boolean f13609f;

    /* JADX INFO: renamed from: g */
    public boolean f13610g;

    public gzc0() {
        zpd0 zpd0Var = new zpd0("last_likers_req_time" + CoreModule.m1850H().userId(), 0L);
        this.f13605b = zpd0Var;
        this.f13606c = new tpd0("offline_dialog_show_time" + CoreModule.m1850H().userId(), 0);
        this.f13607d = new zpd0("offline_like_dialog_last_time" + CoreModule.m1850H().userId(), 0L);
        this.f13608e = ((Long) zpd0Var.get()).longValue();
    }

    /* JADX INFO: renamed from: c0 */
    public static gzc0 m16022c0() {
        if (f13604h == null) {
            synchronized (gzc0.class) {
                try {
                    if (f13604h == null) {
                        f13604h = new gzc0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13604h;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m16023d0(CoreLikers.LikersTriggerBy likersTriggerBy) {
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m16024e0() {
        f13604h = null;
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m16025f0() {
        if (ogl0.m20617F()) {
            return m16026g0();
        }
        m16022c0().f13609f = true;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public static boolean m16026g0() {
        m16022c0().f13609f = true;
        return false;
    }

    /* JADX INFO: renamed from: h0 */
    public static void m16027h0(nt30 nt30Var) {
        CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
        NewMainAct newMainActT4 = nt30Var.T4();
        if (NullChecker.a(newMainActT4) && NullChecker.a(c0145aM2399r5) && !vwb.J(c0145aM2399r5.f3261d)) {
            m16022c0().f13609f = true;
            m16022c0().f13610g = true;
            nt30.X0 = false;
            nt30Var.t5();
            ok3.J(newMainActT4, c0145aM2399r5.f3260c, c0145aM2399r5);
            if (mqi0.D(((Long) m16022c0().f13607d.get()).longValue())) {
                m16022c0().f13606c.a(1);
            } else {
                m16022c0().f13606c.put(1);
            }
            m16022c0().f13607d.put(Long.valueOf(mqi0.o()));
        }
    }
}
