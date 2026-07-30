package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class lti {

    /* JADX INFO: renamed from: a */
    public uti f133547a;

    /* JADX INFO: renamed from: l.lti$a */
    public class C18460a extends r2d0<hti> {
        public C18460a(Act act) {
            super(act);
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void call(hti htiVar) {
            lti.this.m155793g(htiVar);
            if (m179536a() || htiVar == null) {
                return;
            }
            if (htiVar.m137079d().isPlaying()) {
                htiVar.m137079d().mo178522b(true);
            }
            if (htiVar.m137079d() != null) {
                htiVar.m137079d().reset();
            }
            Object objM137080e = htiVar.m137080e();
            if (objM137080e instanceof v91) {
                ((v91) objM137080e).exit();
            }
        }
    }

    /* JADX INFO: renamed from: l.lti$b */
    public static final class C18461b {
        private static final lti INSTANCE = new lti();
    }

    /* JADX INFO: renamed from: d */
    public static lti m155789d() {
        return C18461b.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m155790e() {
        return zrv.m221193k().m203501Q6();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m155791f() {
        Boolean bool = zrv.f205799a.m207696u().live.closeSmallWindow;
        return (!m155790e() || bool == null || bool.booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public void m155792c() {
        if (NullChecker.m82486a(this.f133547a)) {
            this.f133547a.m198053K0(true, true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m155793g(hti htiVar) {
        htiVar.m137083h(false);
        iti.m142051c().m142055e(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m155794h(hti htiVar) {
        if (!zrv.f205799a.m207699v0()) {
            htiVar.m137083h(false);
            return;
        }
        this.f133547a = new uti();
        xti xtiVar = new xti();
        this.f133547a.m198054m(xtiVar);
        xtiVar.mo22064i1(this.f133547a);
        this.f133547a.m198059w(htiVar);
        htiVar.m137083h(true);
        this.f133547a.m198052G1();
    }

    /* JADX INFO: renamed from: i */
    public boolean m155795i(hti htiVar, Act act, boolean z) {
        if (htiVar == null || htiVar.m137080e() == null || htiVar.m137080e().mo183435j() == null) {
            return false;
        }
        z2d0 z2d0Var = new z2d0(htiVar, "live_float_window_has_request_permission" + zrv.f205799a.m207631D0());
        z2d0Var.m218414q(new y20() { // from class: l.kti
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128703a.m155794h((hti) obj);
            }
        });
        z2d0Var.m218413p(new C18460a(act));
        return z2d0Var.m218412o(zrv.f205803e.getString(R$string.f47453C4), z, false, htiVar.m137080e().mo118373p());
    }

    public lti() {
    }
}
