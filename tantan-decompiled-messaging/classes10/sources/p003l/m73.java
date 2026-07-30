package p003l;

import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class m73 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m7985a(d30 d30Var) {
        CoreModule.c.J0.a4(false);
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m7989e(Act act, d30 d30Var, boolean z) {
        CoreModule.c.J0.e4(true);
        CoreModule.P().g().to();
        x93.m10704e(act, true, d30Var, z);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7990f() {
        CoreModule.c.J0.a4(false);
        CoreModule.c.J0.W.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: g */
    public static void m7991g(Act act) {
        if (CoreModule.c.J0.S) {
            m7995k(act);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m7992h(Act act, final BoostViewContainer boostViewContainer, v9j<Boolean> v9jVar) {
        if (((Boolean) CoreModule.c.J0.W.get()).booleanValue()) {
            CoreModule.c.J0.W.put(Boolean.FALSE);
            boostViewContainer.e(act, new d30() { // from class: l.g73
                public final void call() {
                    boostViewContainer.g(true);
                }
            }, v9jVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7993i(Act act, d30 d30Var) {
        gzm.m6902b(act, d30Var);
    }

    /* JADX INFO: renamed from: j */
    public static void m7994j(Act act, float f, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        f73.m6423A(act, f, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: k */
    public static void m7995k(Act act) {
        m7996l(act, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m7996l(Act act, d30 d30Var) {
        if (CoreModule.c.J0.F3()) {
            CoreModule.c.J0.S = false;
            f73.m6424B(act);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m7997m(Act act, d30 d30Var, PurchaseType purchaseType, boolean z) {
        m7998n(act, d30Var, purchaseType, z, true);
    }

    /* JADX INFO: renamed from: n */
    public static void m7998n(final Act act, final d30 d30Var, PurchaseType purchaseType, final boolean z, boolean z2) {
        f73.m6426D(act, new d30() { // from class: l.i73
            public final void call() {
                m73.m7989e(act, d30Var, z);
            }
        }, purchaseType, z, z2);
    }

    /* JADX INFO: renamed from: o */
    public static void m7999o(Act act, final d30 d30Var, d30 d30Var2, PurchaseType purchaseType, final boolean z) {
        f73.m6427E(act, new d30() { // from class: l.h73
            public final void call() {
                CoreModule.c.K0.O3(d30Var, CoreModule.P().g().Cl(), !z);
            }
        }, d30Var2, purchaseType, z);
    }

    /* JADX INFO: renamed from: p */
    public static void m8000p(Act act, final d30 d30Var, v9j<Boolean> v9jVar) {
        if (NullChecker.a(v9jVar) && !((Boolean) v9jVar.call()).booleanValue()) {
            CoreModule.c.J0.W.put(Boolean.TRUE);
            return;
        }
        z93.m11374b(act, BoostViewContainer.class);
        if (CoreModule.c.J0.H3()) {
            return;
        }
        float fM5301b = aa3.m5301b();
        CoreModule.c.J0.a4(true);
        m7994j(act, fM5301b, new d30() { // from class: l.j73
            public final void call() {
                m73.m7990f();
            }
        }, new d30() { // from class: l.k73
            public final void call() {
                m73.m7985a(d30Var);
            }
        }, new d30() { // from class: l.l73
            public final void call() {
                CoreModule.c.J0.a4(false);
            }
        });
        if (c.f != act.lifecycle_() && Act.foreground_() == null) {
            CoreModule.P().a().in(fM5301b);
        }
        CoreModule.c.J0.Z3(false);
    }
}
