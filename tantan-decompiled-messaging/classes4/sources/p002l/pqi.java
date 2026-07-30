package p002l;

import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pqi {

    /* JADX INFO: renamed from: a */
    public yqi f17617a;

    /* JADX INFO: renamed from: l.pqi$a */
    public class C0759a extends ouc0<lqi> {
        public C0759a(Act act) {
            super(act);
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(lqi lqiVar) {
            pqi.this.m20638g(lqiVar);
            if (m19756a() || lqiVar == null) {
                return;
            }
            if (lqiVar.m17379d().isPlaying()) {
                lqiVar.m17379d().b(true);
            }
            if (lqiVar.m17379d() != null) {
                lqiVar.m17379d().reset();
            }
            Object objM17380e = lqiVar.m17380e();
            if (objM17380e instanceof o91) {
                ((o91) objM17380e).exit();
            }
        }
    }

    /* JADX INFO: renamed from: l.pqi$b */
    public static final class C0760b {
        private static final pqi INSTANCE = new pqi();
    }

    /* JADX INFO: renamed from: d */
    public static pqi m20634d() {
        return C0760b.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m20635e() {
        return ypv.k().Q6();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m20636f() {
        Boolean bool = ypv.a.u().live.closeSmallWindow;
        return (!m20635e() || bool == null || bool.booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public void m20637c() {
        if (NullChecker.a(this.f17617a)) {
            this.f17617a.m26901K0(true, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m20638g(lqi lqiVar) {
        lqiVar.m17383h(false);
        mqi.m18135c().m18139e(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m20639h(lqi lqiVar) {
        if (!ypv.a.v0()) {
            lqiVar.m17383h(false);
            return;
        }
        this.f17617a = new yqi();
        bri briVar = new bri();
        this.f17617a.m26902m(briVar);
        briVar.m10568i1(this.f17617a);
        this.f17617a.m26907w(lqiVar);
        lqiVar.m17383h(true);
        this.f17617a.m26900G1();
    }

    /* JADX INFO: renamed from: i */
    public boolean m20640i(lqi lqiVar, Act act, boolean z) {
        if (lqiVar == null || lqiVar.m17380e() == null || lqiVar.m17380e().m17234j() == null) {
            return false;
        }
        wuc0 wuc0Var = new wuc0(lqiVar, "live_float_window_has_request_permission" + ypv.a.D0());
        wuc0Var.m25501q(new e30() { // from class: l.oqi
            public final void call(Object obj) {
                this.f16750a.m20639h((lqi) obj);
            }
        });
        wuc0Var.m25500p(new C0759a(act));
        return wuc0Var.m25499o(ypv.e.getString(R$string.f2647C4), z, false, lqiVar.m17380e().mo9893p());
    }

    public pqi() {
    }
}
