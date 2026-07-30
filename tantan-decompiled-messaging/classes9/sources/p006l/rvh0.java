package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.wallet.TanTanCoinCheckstandFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import l.ah60;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.s7m;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rvh0 extends jq2<svh0> {

    /* JADX INFO: renamed from: a */
    public TanTanCoinCheckstandFrag f20820a;

    public rvh0(mcr mcrVar, TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag) {
        super(mcrVar);
        this.f20820a = tanTanCoinCheckstandFrag;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m23331i0(xaj0 xaj0Var) {
        if (xaj0Var != null && ((Integer) xaj0Var.a).intValue() == 0) {
            ah60.K(PurchaseType.TYPE_INTL_TTT_COIN, "coin");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m23332j0(c cVar) {
        if (CoreModule.m1851K().xf()) {
            CoreModule.f1534c.f3562I0.m17378P3();
        } else {
            CoreModule.f1534c.f3559H0.m27536k5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m23333l0(Bundle bundle) {
        act().setTitle(R.string.ga);
    }

    /* JADX INFO: renamed from: Z */
    public void m23334Z() {
        super.Z();
        CoreModule.f1534c.f3559H0.m27536k5();
    }

    /* JADX INFO: renamed from: a0 */
    public void m23335a0() {
        super.a0();
        creates(new e30() { // from class: l.lvh0
            public final void call(Object obj) {
                this.f16676a.m23333l0((Bundle) obj);
            }
        });
        if (CoreModule.m1851K().xf()) {
            duringCreated(CoreModule.f1534c.f3562I0.m17375M3()).subscribe(mkd0.G(new e30() { // from class: l.mvh0
                public final void call(Object obj) {
                    this.f17313a.m23337m0((IntlCurrencyDiamond) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f1534c.f3559H0.m27524a5()).subscribe(mkd0.G(new e30() { // from class: l.nvh0
                public final void call(Object obj) {
                    this.f17893a.m23338n0((Coin) obj);
                }
            }));
        }
        lifecycle().filter(new w9j() { // from class: l.ovh0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.pvh0
            public final void call(Object obj) {
                rvh0.m23332j0((c) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3593S0.m6123v3()).subscribe(mkd0.G(new e30() { // from class: l.qvh0
            public final void call(Object obj) {
                rvh0.m23331i0((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m23336k0(boolean z) {
        ((svh0) ((jq2) this).viewModel).m24223r();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m23337m0(IntlCurrencyDiamond intlCurrencyDiamond) {
        long j = intlCurrencyDiamond.available;
        s7m s7mVar = ((jq2) this).viewModel;
        if (j > 999) {
            ((svh0) s7mVar).m24222j(40);
        } else {
            ((svh0) s7mVar).m24222j(48);
        }
        ((svh0) ((jq2) this).viewModel).m24220i(swh0.m24266U(intlCurrencyDiamond.available));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m23338n0(Coin coin) {
        long j = coin.available;
        s7m s7mVar = ((jq2) this).viewModel;
        if (j > 999) {
            ((svh0) s7mVar).m24222j(40);
        } else {
            ((svh0) s7mVar).m24222j(48);
        }
        ((svh0) ((jq2) this).viewModel).m24220i(swh0.m24266U(coin.available));
    }

    public void destroy() {
    }
}
