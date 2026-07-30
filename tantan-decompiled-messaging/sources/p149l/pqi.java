package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class pqi {

    /* JADX INFO: renamed from: a */
    public yqi f150788a;

    /* JADX INFO: renamed from: l.pqi$a */
    public class C19315a extends ouc0<lqi> {
        public C19315a(Act act) {
            super(act);
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(lqi lqiVar) {
            pqi.this.m170916g(lqiVar);
            if (m165983a() || lqiVar == null) {
                return;
            }
            if (lqiVar.m151023d().isPlaying()) {
                lqiVar.m151023d().mo108790b(true);
            }
            if (lqiVar.m151023d() != null) {
                lqiVar.m151023d().reset();
            }
            Object objM151024e = lqiVar.m151024e();
            if (objM151024e instanceof o91) {
                ((o91) objM151024e).exit();
            }
        }
    }

    /* JADX INFO: renamed from: l.pqi$b */
    public static final class C19316b {
        private static final pqi INSTANCE = new pqi();
    }

    /* JADX INFO: renamed from: d */
    public static pqi m170912d() {
        return C19316b.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m170913e() {
        return ypv.m215672k().m195714Q6();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m170914f() {
        Boolean bool = ypv.f199493a.m199374u().live.closeSmallWindow;
        return (!m170913e() || bool == null || bool.booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public void m170915c() {
        if (NullChecker.m81303a(this.f150788a)) {
            this.f150788a.m215736K0(true, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m170916g(lqi lqiVar) {
        lqiVar.m151027h(false);
        mqi.m155920c().m155924e(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m170917h(lqi lqiVar) {
        if (!ypv.f199493a.m199377v0()) {
            lqiVar.m151027h(false);
            return;
        }
        this.f150788a = new yqi();
        bri briVar = new bri();
        this.f150788a.m215737m(briVar);
        briVar.mo21065i1(this.f150788a);
        this.f150788a.m215742w(lqiVar);
        lqiVar.m151027h(true);
        this.f150788a.m215735G1();
    }

    /* JADX INFO: renamed from: i */
    public boolean m170918i(lqi lqiVar, Act act, boolean z) {
        if (lqiVar == null || lqiVar.m151024e() == null || lqiVar.m151024e().mo149813j() == null) {
            return false;
        }
        wuc0 wuc0Var = new wuc0(lqiVar, "live_float_window_has_request_permission" + ypv.f199493a.m199309D0());
        wuc0Var.m205614q(new e30() { // from class: l.oqi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145159a.m170917h((lqi) obj);
            }
        });
        wuc0Var.m205613p(new C19315a(act));
        return wuc0Var.m205612o(ypv.f199497e.getString(R$string.f46605C4), z, false, lqiVar.m151024e().mo97490p());
    }

    public pqi() {
    }
}
