package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class b83 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m102899a(x20 x20Var) {
        CoreModule.f18264c.f20318J0.m156786a4(false);
        x20Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m102903e(Act act, x20 x20Var, boolean z) {
        CoreModule.f18264c.f20318J0.m156790e4(true);
        CoreModule.m30933P().m143410g().mo36080to();
        ma3.m157622e(act, true, x20Var, z);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m102904f() {
        CoreModule.f18264c.f20318J0.m156786a4(false);
        CoreModule.f18264c.f20318J0.f134507W.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static void m102905g(Act act) {
        if (CoreModule.f18264c.f20318J0.f134503S) {
            m102909k(act);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m102906h(Act act, final BoostViewContainer boostViewContainer, pcj<Boolean> pcjVar) {
        if (CoreModule.f18264c.f20318J0.f134507W.get().booleanValue()) {
            CoreModule.f18264c.f20318J0.f134507W.put(Boolean.FALSE);
            boostViewContainer.m44880e(act, new x20() { // from class: l.v73
                @Override // p153l.x20
                public final void call() {
                    boostViewContainer.m44882g(true);
                }
            }, pcjVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m102907i(Act act, x20 x20Var) {
        g1n.m128514b(act, x20Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m102908j(Act act, float f, x20 x20Var, x20 x20Var2, x20 x20Var3) {
        u73.m194803A(act, f, x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: k */
    public static void m102909k(Act act) {
        m102910l(act, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m102910l(Act act, x20 x20Var) {
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            CoreModule.f18264c.f20318J0.f134503S = false;
            u73.m194804B(act);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m102911m(Act act, x20 x20Var, PurchaseType purchaseType, boolean z) {
        m102912n(act, x20Var, purchaseType, z, true);
    }

    /* JADX INFO: renamed from: n */
    public static void m102912n(final Act act, final x20 x20Var, PurchaseType purchaseType, final boolean z, boolean z2) {
        u73.m194806D(act, new x20() { // from class: l.x73
            @Override // p153l.x20
            public final void call() {
                b83.m102903e(act, x20Var, z);
            }
        }, purchaseType, z, z2);
    }

    /* JADX INFO: renamed from: o */
    public static void m102913o(Act act, final x20 x20Var, x20 x20Var2, PurchaseType purchaseType, final boolean z) {
        u73.m194807E(act, new x20() { // from class: l.w73
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20321K0.m113307O3(x20Var, CoreModule.m30933P().m143410g().mo36004Cl(), !z);
            }
        }, x20Var2, purchaseType, z);
    }

    /* JADX INFO: renamed from: p */
    public static void m102914p(Act act, final x20 x20Var, pcj<Boolean> pcjVar) {
        if (NullChecker.m82486a(pcjVar) && !pcjVar.call().booleanValue()) {
            CoreModule.f18264c.f20318J0.f134507W.put(Boolean.TRUE);
            return;
        }
        oa3.m166820b(act, BoostViewContainer.class);
        if (CoreModule.f18264c.f20318J0.m156768H3()) {
            return;
        }
        float fM171408b = pa3.m171408b();
        CoreModule.f18264c.f20318J0.m156786a4(true);
        m102908j(act, fM171408b, new x20() { // from class: l.y73
            @Override // p153l.x20
            public final void call() {
                b83.m102904f();
            }
        }, new x20() { // from class: l.z73
            @Override // p153l.x20
            public final void call() {
                b83.m102899a(x20Var);
            }
        }, new x20() { // from class: l.a83
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20318J0.m156786a4(false);
            }
        });
        if (C4470c.f16264f != act.lifecycle_() && Act.foreground_() == null) {
            CoreModule.m30933P().m143405a().mo34526in(fM171408b);
        }
        CoreModule.f18264c.f20318J0.m156785Z3(false);
    }
}
