package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.member.R$string;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class k83 {

    /* JADX INFO: renamed from: l.k83$a */
    public static class C18118a {

        /* JADX INFO: renamed from: a */
        public Act f124351a;

        /* JADX INFO: renamed from: b */
        public boolean f124352b;

        /* JADX INFO: renamed from: c */
        public x20 f124353c;

        /* JADX INFO: renamed from: d */
        public boolean f124354d;

        /* JADX INFO: renamed from: e */
        public Privilege f124355e;

        /* JADX INFO: renamed from: f */
        public boolean f124356f;

        /* JADX INFO: renamed from: g */
        public x20 f124357g;

        /* JADX INFO: renamed from: h */
        public x20 f124358h;

        /* JADX INFO: renamed from: i */
        public x20 f124359i;

        public C18118a(Act act) {
            this.f124351a = act;
        }

        /* JADX INFO: renamed from: a */
        public C18118a m148678a(boolean z) {
            this.f124354d = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C18118a m148679b(Privilege privilege) {
            this.f124355e = privilege;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18118a m148680c(boolean z) {
            this.f124352b = z;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18118a m148681d(boolean z) {
            this.f124356f = z;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C18118a m148682e(x20 x20Var) {
            this.f124358h = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C18118a m148683f(x20 x20Var) {
            this.f124357g = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C18118a m148684g(x20 x20Var) {
            this.f124359i = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C18118a m148685h(x20 x20Var) {
            this.f124353c = x20Var;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m148664b(Act act, x20 x20Var, boolean z) {
        CoreModule.f18264c.f20318J0.m156790e4(true);
        m148672j(act, true, x20Var, z);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m148666d(boolean z, C18118a c18118a, uxj0 uxj0Var) {
        if (z) {
            if (CoreModule.m30930K().mo31838xf()) {
                CoreModule.f18264c.f20315I0.m144059P3();
            } else {
                CoreModule.f18264c.f20312H0.m155449k5();
            }
        }
        CoreModule.f18264c.f20318J0.f134505U.put(Long.valueOf(pzi0.m174454o()));
        if (NullChecker.m82486a(c18118a.f124353c)) {
            c18118a.f124353c.call();
        }
        x20 x20Var = c18118a.f124357g;
        if (x20Var != null) {
            x20Var.call();
        }
        CoreModule.f18264c.f20318J0.f134520j0.put(Boolean.TRUE);
        uqb0.m197269e1("boost_consumed", new Object[0]);
        if (c18118a.f124355e == Privilege.minBoost) {
            CoreModule.f18264c.f20405m0.f20162i2.m137019l(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m148667e(final x20 x20Var, Act act) {
        if ((pa3.m171412f() ? CoreModule.m30933P().m143410g().mo36029Qk() : CoreModule.m30933P().m143410g().mo36040Xa()) > 0) {
            x20Var.call();
        } else {
            CoreModule.m30933P().m143410g().mo35999Bk(act, pa3.m171413g(act, true), new y20() { // from class: l.j83
                @Override // p153l.y20
                public final void call(Object obj) {
                    x20Var.call();
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m148669g(C18118a c18118a, Throwable th) {
        CoreModule.f18264c.f20318J0.m156781V3();
        o1j0.m165640n(R$string.f21320F);
        x20 x20Var = c18118a.f124358h;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m148670h(Boolean bool) {
    }

    /* JADX INFO: renamed from: i */
    public static String m148671i(C18118a c18118a) {
        if (CoreModule.m30930K().mo31838xf()) {
            if (c18118a.f124355e == Privilege.minBoost) {
                return CoreModule.f18264c.f20315I0.m144070x3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
            }
            return (c18118a.f124354d && pa3.m171412f()) ? CoreModule.f18264c.f20315I0.m144071y3() : CoreModule.f18264c.f20315I0.m144070x3(SummarizedPrivilegesId.get("boost"));
        }
        if (c18118a.f124355e == Privilege.minBoost) {
            return CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get(SummarizedPrivilegesId.minBoost));
        }
        return (c18118a.f124354d && pa3.m171412f()) ? CoreModule.f18264c.f20312H0.m155466t4() : CoreModule.f18264c.f20312H0.m155464s4(SummarizedPrivilegesId.get("boost"));
    }

    /* JADX INFO: renamed from: j */
    public static void m148672j(Act act, boolean z, x20 x20Var, boolean z2) {
        m148673k(new C18118a(act).m148680c(z).m148685h(x20Var).m148678a(z2).m148679b(Privilege.boost));
    }

    /* JADX INFO: renamed from: k */
    public static void m148673k(@NonNull final C18118a c18118a) {
        final boolean z = c18118a.f124355e == Privilege.minBoost || CoreModule.m30933P().m143410g().mo36050at();
        c18118a.f124351a.duringCreated(CoreModule.f18264c.f20318J0.m156787b4(z, m148671i(c18118a), c18118a.f124355e, "", false, c18118a.f124356f)).subscribe(psd0.m173597H(new y20() { // from class: l.g83
            @Override // p153l.y20
            public final void call(Object obj) {
                k83.m148666d(z, c18118a, (uxj0) obj);
            }
        }, new y20() { // from class: l.h83
            @Override // p153l.y20
            public final void call(Object obj) {
                k83.m148669g(c18118a, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l */
    public static void m148674l(final Act act, final x20 x20Var, final pcj<Boolean> pcjVar) {
        CoreModule.f18264c.f20318J0.m156783X3();
        act.duringCreated(CoreModule.f18264c.f20318J0.m156792s3()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.c83
            @Override // p153l.y20
            public final void call(Object obj) {
                k83.m148677o(act, x20Var, pcjVar);
            }
        }, new y20() { // from class: l.d83
            @Override // p153l.y20
            public final void call(Object obj) {
                k83.m148677o(act, x20Var, pcjVar);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m148675m(Act act) {
        if (jyb.m147479J(CoreModule.m30933P().m143410g().mo36001Cd(ProductCategory.get("svip")))) {
            return true;
        }
        CoreModule.m30933P().m143410g().mo36084wm(act, new y20() { // from class: l.i83
            @Override // p153l.y20
            public final void call(Object obj) {
                k83.m148670h((Boolean) obj);
            }
        }, CoreModule.m30933P().m143410g().mo36031S7(true), abb0.m96736c("p_promotion,callback", 2), null, null);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m148676n(final Act act, final boolean z, final x20 x20Var, boolean z2, String str) {
        uqb0.m197269e1("boost_purchase_shown", new Object[0]);
        if (CoreModule.m30933P().m143405a().mo34510h5() && CoreModule.m30933P().m143405a().mo34576qt() && !joa.m146361M3()) {
            if (m148675m(act)) {
                CoreModule.m30933P().m143405a().mo34575qm(act, pa3.m171413g(act, z), Privilege.boost, null);
                return;
            }
            return;
        }
        if (((z && pa3.m171412f()) ? CoreModule.m30933P().m143410g().mo36029Qk() : CoreModule.m30933P().m143410g().mo36040Xa()) <= 0) {
            if (m148675m(act)) {
                CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
                if (TextUtils.isEmpty(str)) {
                    str = pa3.m171413g(act, z);
                }
                corePayInnerServiceM143410g.mo35999Bk(act, str, null);
                return;
            }
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34576qt() && CoreModule.m30933P().m143410g().mo36045Yl()) {
            b83.m102911m(act, x20Var, null, z);
            return;
        }
        if (CoreModule.f18264c.f20318J0.m156796x3() || z || z2 || CoreModule.m30933P().m143405a().mo34576qt()) {
            m148672j(act, false, x20Var, z);
        } else {
            b83.m102907i(act, new x20() { // from class: l.e83
                @Override // p153l.x20
                public final void call() {
                    k83.m148664b(act, x20Var, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m148677o(final Act act, final x20 x20Var, pcj<Boolean> pcjVar) {
        b83.m102914p(act, new x20() { // from class: l.f83
            @Override // p153l.x20
            public final void call() {
                k83.m148667e(x20Var, act);
            }
        }, pcjVar);
    }
}
