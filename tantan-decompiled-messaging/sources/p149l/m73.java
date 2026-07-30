package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class m73 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m153321a(d30 d30Var) {
        CoreModule.f17545c.f19576J0.m139274a4(false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m153325e(Act act, d30 d30Var, boolean z) {
        CoreModule.f17545c.f19576J0.m139278e4(true);
        CoreModule.m29935P().m94656g().mo35077to();
        x93.m207469e(act, true, d30Var, z);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m153326f() {
        CoreModule.f17545c.f19576J0.m139274a4(false);
        CoreModule.f17545c.f19576J0.f115745W.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static void m153327g(Act act) {
        if (CoreModule.f17545c.f19576J0.f115741S) {
            m153331k(act);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m153328h(Act act, final BoostViewContainer boostViewContainer, v9j<Boolean> v9jVar) {
        if (CoreModule.f17545c.f19576J0.f115745W.get().booleanValue()) {
            CoreModule.f17545c.f19576J0.f115745W.put(Boolean.FALSE);
            boostViewContainer.m43694e(act, new d30() { // from class: l.g73
                @Override // p149l.d30
                public final void call() {
                    boostViewContainer.m43696g(true);
                }
            }, v9jVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m153329i(Act act, d30 d30Var) {
        gzm.m128875b(act, d30Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m153330j(Act act, float f, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        f73.m119726A(act, f, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: k */
    public static void m153331k(Act act) {
        m153332l(act, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m153332l(Act act, d30 d30Var) {
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            CoreModule.f17545c.f19576J0.f115741S = false;
            f73.m119727B(act);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m153333m(Act act, d30 d30Var, PurchaseType purchaseType, boolean z) {
        m153334n(act, d30Var, purchaseType, z, true);
    }

    /* JADX INFO: renamed from: n */
    public static void m153334n(final Act act, final d30 d30Var, PurchaseType purchaseType, final boolean z, boolean z2) {
        f73.m119729D(act, new d30() { // from class: l.i73
            @Override // p149l.d30
            public final void call() {
                m73.m153325e(act, d30Var, z);
            }
        }, purchaseType, z, z2);
    }

    /* JADX INFO: renamed from: o */
    public static void m153335o(Act act, final d30 d30Var, d30 d30Var2, PurchaseType purchaseType, final boolean z) {
        f73.m119730E(act, new d30() { // from class: l.h73
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19579K0.m176980O3(d30Var, CoreModule.m29935P().m94656g().mo35001Cl(), !z);
            }
        }, d30Var2, purchaseType, z);
    }

    /* JADX INFO: renamed from: p */
    public static void m153336p(Act act, final d30 d30Var, v9j<Boolean> v9jVar) {
        if (NullChecker.m81303a(v9jVar) && !v9jVar.call().booleanValue()) {
            CoreModule.f17545c.f19576J0.f115745W.put(Boolean.TRUE);
            return;
        }
        z93.m217659b(act, BoostViewContainer.class);
        if (CoreModule.f17545c.f19576J0.m139256H3()) {
            return;
        }
        float fM95518b = aa3.m95518b();
        CoreModule.f17545c.f19576J0.m139274a4(true);
        m153330j(act, fM95518b, new d30() { // from class: l.j73
            @Override // p149l.d30
            public final void call() {
                m73.m153326f();
            }
        }, new d30() { // from class: l.k73
            @Override // p149l.d30
            public final void call() {
                m73.m153321a(d30Var);
            }
        }, new d30() { // from class: l.l73
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19576J0.m139274a4(false);
            }
        });
        if (C4319c.f15545f != act.lifecycle_() && Act.foreground_() == null) {
            CoreModule.m29935P().m94651a().mo33523in(fM95518b);
        }
        CoreModule.f17545c.f19576J0.m139273Z3(false);
    }
}
