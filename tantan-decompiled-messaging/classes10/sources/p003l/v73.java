package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w2b0;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v73 {

    /* JADX INFO: renamed from: l.v73$a */
    public static class C3448a {

        /* JADX INFO: renamed from: a */
        public Act f7899a;

        /* JADX INFO: renamed from: b */
        public boolean f7900b;

        /* JADX INFO: renamed from: c */
        public d30 f7901c;

        /* JADX INFO: renamed from: d */
        public boolean f7902d;

        /* JADX INFO: renamed from: e */
        public Privilege f7903e;

        /* JADX INFO: renamed from: f */
        public boolean f7904f;

        /* JADX INFO: renamed from: g */
        public d30 f7905g;

        /* JADX INFO: renamed from: h */
        public d30 f7906h;

        /* JADX INFO: renamed from: i */
        public d30 f7907i;

        public C3448a(Act act) {
            this.f7899a = act;
        }

        /* JADX INFO: renamed from: a */
        public C3448a m9859a(boolean z) {
            this.f7902d = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C3448a m9860b(Privilege privilege) {
            this.f7903e = privilege;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3448a m9861c(boolean z) {
            this.f7900b = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C3448a m9862d(boolean z) {
            this.f7904f = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C3448a m9863e(d30 d30Var) {
            this.f7906h = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C3448a m9864f(d30 d30Var) {
            this.f7905g = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C3448a m9865g(d30 d30Var) {
            this.f7907i = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C3448a m9866h(d30 d30Var) {
            this.f7901c = d30Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9845b(Act act, d30 d30Var, boolean z) {
        CoreModule.c.J0.e4(true);
        m9853j(act, true, d30Var, z);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9847d(boolean z, C3448a c3448a, roj0 roj0Var) {
        if (z) {
            if (CoreModule.K().m5233xf()) {
                CoreModule.c.I0.P3();
            } else {
                CoreModule.c.H0.k5();
            }
        }
        CoreModule.c.J0.U.put(Long.valueOf(mqi0.o()));
        if (NullChecker.a(c3448a.f7901c)) {
            c3448a.f7901c.call();
        }
        d30 d30Var = c3448a.f7905g;
        if (d30Var != null) {
            d30Var.call();
        }
        CoreModule.c.J0.j0.put(Boolean.TRUE);
        qib0.e1("boost_consumed", new Object[0]);
        if (c3448a.f7903e == Privilege.minBoost) {
            CoreModule.c.m0.i2.onNext(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m9848e(final d30 d30Var, Act act) {
        if ((aa3.m5305f() ? CoreModule.P().g().Qk() : CoreModule.P().g().Xa()) > 0) {
            d30Var.call();
        } else {
            CoreModule.P().g().Bk(act, aa3.m5306g(act, true), new e30() { // from class: l.u73
                public final void call(Object obj) {
                    d30Var.call();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m9850g(C3448a c3448a, Throwable th) {
        CoreModule.c.J0.V3();
        lsi0.n(R$string.f240F);
        d30 d30Var = c3448a.f7906h;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m9851h(Boolean bool) {
    }

    /* JADX INFO: renamed from: i */
    public static String m9852i(C3448a c3448a) {
        if (CoreModule.K().m5233xf()) {
            if (c3448a.f7903e == Privilege.minBoost) {
                return CoreModule.c.I0.x3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
            }
            return (c3448a.f7902d && aa3.m5305f()) ? CoreModule.c.I0.y3() : CoreModule.c.I0.x3(SummarizedPrivilegesId.get("boost"));
        }
        if (c3448a.f7903e == Privilege.minBoost) {
            return CoreModule.c.H0.s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
        }
        return (c3448a.f7902d && aa3.m5305f()) ? CoreModule.c.H0.t4() : CoreModule.c.H0.s4(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: j */
    public static void m9853j(Act act, boolean z, d30 d30Var, boolean z2) {
        m9854k(new C3448a(act).m9861c(z).m9866h(d30Var).m9859a(z2).m9860b(Privilege.boost));
    }

    /* JADX INFO: renamed from: k */
    public static void m9854k(@NonNull final C3448a c3448a) {
        final boolean z = c3448a.f7903e == Privilege.minBoost || CoreModule.P().g().at();
        c3448a.f7899a.duringCreated(CoreModule.c.J0.b4(z, m9852i(c3448a), c3448a.f7903e, "", false, c3448a.f7904f)).subscribe(mkd0.H(new e30() { // from class: l.r73
            public final void call(Object obj) {
                v73.m9847d(z, c3448a, (roj0) obj);
            }
        }, new e30() { // from class: l.s73
            public final void call(Object obj) {
                v73.m9850g(c3448a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m9855l(final Act act, final d30 d30Var, final v9j<Boolean> v9jVar) {
        CoreModule.c.J0.X3();
        act.duringCreated(CoreModule.c.J0.s3()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.n73
            public final void call(Object obj) {
                v73.m9858o(act, d30Var, v9jVar);
            }
        }, new e30() { // from class: l.o73
            public final void call(Object obj) {
                v73.m9858o(act, d30Var, v9jVar);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m9856m(Act act) {
        if (vwb.J(CoreModule.P().g().Cd(ProductCategory.get("svip")))) {
            return true;
        }
        CoreModule.P().g().wm(act, new e30() { // from class: l.t73
            public final void call(Object obj) {
                v73.m9851h((Boolean) obj);
            }
        }, CoreModule.P().g().S7(true), w2b0.c("p_promotion,callback", 2), (PayMethod) null, (Object) null);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m9857n(final Act act, final boolean z, final d30 d30Var, boolean z2, String str) {
        qib0.e1("boost_purchase_shown", new Object[0]);
        if (CoreModule.P().a().h5() && CoreModule.P().a().qt() && !xma.L3()) {
            if (m9856m(act)) {
                CoreModule.P().a().qm(act, aa3.m5306g(act, z), Privilege.boost, (e30) null);
                return;
            }
            return;
        }
        if (((z && aa3.m5305f()) ? CoreModule.P().g().Qk() : CoreModule.P().g().Xa()) <= 0) {
            if (m9856m(act)) {
                CorePayInnerService corePayInnerServiceG = CoreModule.P().g();
                if (TextUtils.isEmpty(str)) {
                    str = aa3.m5306g(act, z);
                }
                corePayInnerServiceG.Bk(act, str, (e30) null);
                return;
            }
            return;
        }
        if (CoreModule.P().a().qt() && CoreModule.P().g().Yl()) {
            m73.m7997m(act, d30Var, null, z);
            return;
        }
        if (CoreModule.c.J0.x3() || z || z2 || CoreModule.P().a().qt()) {
            m9853j(act, false, d30Var, z);
        } else {
            m73.m7993i(act, new d30() { // from class: l.p73
                public final void call() {
                    v73.m9845b(act, d30Var, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m9858o(final Act act, final d30 d30Var, v9j<Boolean> v9jVar) {
        m73.m8000p(act, new d30() { // from class: l.q73
            public final void call() {
                v73.m9848e(d30Var, act);
            }
        }, v9jVar);
    }
}
