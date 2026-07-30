package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.member.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class v73 {

    /* JADX INFO: renamed from: l.v73$a */
    public static class C20591a {

        /* JADX INFO: renamed from: a */
        public Act f180287a;

        /* JADX INFO: renamed from: b */
        public boolean f180288b;

        /* JADX INFO: renamed from: c */
        public d30 f180289c;

        /* JADX INFO: renamed from: d */
        public boolean f180290d;

        /* JADX INFO: renamed from: e */
        public Privilege f180291e;

        /* JADX INFO: renamed from: f */
        public boolean f180292f;

        /* JADX INFO: renamed from: g */
        public d30 f180293g;

        /* JADX INFO: renamed from: h */
        public d30 f180294h;

        /* JADX INFO: renamed from: i */
        public d30 f180295i;

        public C20591a(Act act) {
            this.f180287a = act;
        }

        /* JADX INFO: renamed from: a */
        public C20591a m197326a(boolean z) {
            this.f180290d = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C20591a m197327b(Privilege privilege) {
            this.f180291e = privilege;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20591a m197328c(boolean z) {
            this.f180288b = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20591a m197329d(boolean z) {
            this.f180292f = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20591a m197330e(d30 d30Var) {
            this.f180294h = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C20591a m197331f(d30 d30Var) {
            this.f180293g = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C20591a m197332g(d30 d30Var) {
            this.f180295i = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20591a m197333h(d30 d30Var) {
            this.f180289c = d30Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m197312b(Act act, d30 d30Var, boolean z) {
        CoreModule.f17545c.f19576J0.m139278e4(true);
        m197320j(act, true, d30Var, z);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m197314d(boolean z, C20591a c20591a, roj0 roj0Var) {
        if (z) {
            if (CoreModule.m29932K().mo30835xf()) {
                CoreModule.f17545c.f19573I0.m140262P3();
            } else {
                CoreModule.f17545c.f19570H0.m210361k5();
            }
        }
        CoreModule.f17545c.f19576J0.f115743U.put(Long.valueOf(mqi0.m155944o()));
        if (NullChecker.m81303a(c20591a.f180289c)) {
            c20591a.f180289c.call();
        }
        d30 d30Var = c20591a.f180293g;
        if (d30Var != null) {
            d30Var.call();
        }
        CoreModule.f17545c.f19576J0.f115758j0.put(Boolean.TRUE);
        qib0.m174815e1("boost_consumed", new Object[0]);
        if (c20591a.f180291e == Privilege.minBoost) {
            CoreModule.f17545c.f19663m0.f19420i2.m132487l(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m197315e(final d30 d30Var, Act act) {
        if ((aa3.m95522f() ? CoreModule.m29935P().m94656g().mo35026Qk() : CoreModule.m29935P().m94656g().mo35037Xa()) > 0) {
            d30Var.call();
        } else {
            CoreModule.m29935P().m94656g().mo34996Bk(act, aa3.m95523g(act, true), new e30() { // from class: l.u73
                @Override // p149l.e30
                public final void call(Object obj) {
                    d30Var.call();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m197317g(C20591a c20591a, Throwable th) {
        CoreModule.f17545c.f19576J0.m139269V3();
        lsi0.m151584n(R$string.f20578F);
        d30 d30Var = c20591a.f180294h;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m197318h(Boolean bool) {
    }

    /* JADX INFO: renamed from: i */
    public static String m197319i(C20591a c20591a) {
        if (CoreModule.m29932K().mo30835xf()) {
            if (c20591a.f180291e == Privilege.minBoost) {
                return CoreModule.f17545c.f19573I0.m140273x3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
            }
            return (c20591a.f180290d && aa3.m95522f()) ? CoreModule.f17545c.f19573I0.m140274y3() : CoreModule.f17545c.f19573I0.m140273x3(SummarizedPrivilegesId.get("boost"));
        }
        if (c20591a.f180291e == Privilege.minBoost) {
            return CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
        }
        return (c20591a.f180290d && aa3.m95522f()) ? CoreModule.f17545c.f19570H0.m210378t4() : CoreModule.f17545c.f19570H0.m210376s4(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: j */
    public static void m197320j(Act act, boolean z, d30 d30Var, boolean z2) {
        m197321k(new C20591a(act).m197328c(z).m197333h(d30Var).m197326a(z2).m197327b(Privilege.boost));
    }

    /* JADX INFO: renamed from: k */
    public static void m197321k(@NonNull final C20591a c20591a) {
        final boolean z = c20591a.f180291e == Privilege.minBoost || CoreModule.m29935P().m94656g().mo35047at();
        c20591a.f180287a.duringCreated(CoreModule.f17545c.f19576J0.m139275b4(z, m197319i(c20591a), c20591a.f180291e, "", false, c20591a.f180292f)).subscribe(mkd0.m154956H(new e30() { // from class: l.r73
            @Override // p149l.e30
            public final void call(Object obj) {
                v73.m197314d(z, c20591a, (roj0) obj);
            }
        }, new e30() { // from class: l.s73
            @Override // p149l.e30
            public final void call(Object obj) {
                v73.m197317g(c20591a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m197322l(final Act act, final d30 d30Var, final v9j<Boolean> v9jVar) {
        CoreModule.f17545c.f19576J0.m139271X3();
        act.duringCreated(CoreModule.f17545c.f19576J0.m139280s3()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.n73
            @Override // p149l.e30
            public final void call(Object obj) {
                v73.m197325o(act, d30Var, v9jVar);
            }
        }, new e30() { // from class: l.o73
            @Override // p149l.e30
            public final void call(Object obj) {
                v73.m197325o(act, d30Var, v9jVar);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m197323m(Act act) {
        if (vwb.m200296J(CoreModule.m29935P().m94656g().mo34998Cd(ProductCategory.get("svip")))) {
            return true;
        }
        CoreModule.m29935P().m94656g().mo35081wm(act, new e30() { // from class: l.t73
            @Override // p149l.e30
            public final void call(Object obj) {
                v73.m197318h((Boolean) obj);
            }
        }, CoreModule.m29935P().m94656g().mo35028S7(true), w2b0.m201089c("p_promotion,callback", 2), null, null);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m197324n(final Act act, final boolean z, final d30 d30Var, boolean z2, String str) {
        qib0.m174815e1("boost_purchase_shown", new Object[0]);
        if (CoreModule.m29935P().m94651a().mo33507h5() && CoreModule.m29935P().m94651a().mo33573qt() && !xma.m210047L3()) {
            if (m197323m(act)) {
                CoreModule.m29935P().m94651a().mo33572qm(act, aa3.m95523g(act, z), Privilege.boost, null);
                return;
            }
            return;
        }
        if (((z && aa3.m95522f()) ? CoreModule.m29935P().m94656g().mo35026Qk() : CoreModule.m29935P().m94656g().mo35037Xa()) <= 0) {
            if (m197323m(act)) {
                CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
                if (TextUtils.isEmpty(str)) {
                    str = aa3.m95523g(act, z);
                }
                corePayInnerServiceM94656g.mo34996Bk(act, str, null);
                return;
            }
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33573qt() && CoreModule.m29935P().m94656g().mo35042Yl()) {
            m73.m153333m(act, d30Var, null, z);
            return;
        }
        if (CoreModule.f17545c.f19576J0.m139284x3() || z || z2 || CoreModule.m29935P().m94651a().mo33573qt()) {
            m197320j(act, false, d30Var, z);
        } else {
            m73.m153329i(act, new d30() { // from class: l.p73
                @Override // p149l.d30
                public final void call() {
                    v73.m197312b(act, d30Var, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m197325o(final Act act, final d30 d30Var, v9j<Boolean> v9jVar) {
        m73.m153336p(act, new d30() { // from class: l.q73
            @Override // p149l.d30
            public final void call() {
                v73.m197315e(d30Var, act);
            }
        }, v9jVar);
    }
}
