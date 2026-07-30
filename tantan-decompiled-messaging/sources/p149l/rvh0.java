package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.wallet.TanTanCoinCheckstandFrag;
import com.p046p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class rvh0 extends jq2<svh0> {

    /* JADX INFO: renamed from: a */
    public TanTanCoinCheckstandFrag f161204a;

    public rvh0(mcr mcrVar, TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag) {
        super(mcrVar);
        this.f161204a = tanTanCoinCheckstandFrag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m181284i0(xaj0 xaj0Var) {
        if (xaj0Var != null && ((Integer) xaj0Var.f191751a).intValue() == 0) {
            ah60.m96376K(PurchaseType.TYPE_INTL_TTT_COIN, "coin");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m181285j0(C4319c c4319c) {
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140262P3();
        } else {
            CoreModule.f17545c.f19570H0.m210361k5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m181286l0(Bundle bundle) {
        act().setTitle(R$string.f27459ga);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19570H0.m210361k5();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.lvh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130165a.m181286l0((Bundle) obj);
            }
        });
        if (CoreModule.m29932K().mo30835xf()) {
            duringCreated(CoreModule.f17545c.f19573I0.m140259M3()).subscribe(mkd0.m154955G(new e30() { // from class: l.mvh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135902a.m181288m0((IntlCurrencyDiamond) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f17545c.f19570H0.m210349a5()).subscribe(mkd0.m154955G(new e30() { // from class: l.nvh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f140741a.m181289n0((Coin) obj);
                }
            }));
        }
        lifecycle().filter(new w9j() { // from class: l.ovh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.pvh0
            @Override // p149l.e30
            public final void call(Object obj) {
                rvh0.m181285j0((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19604S0.m34186v3()).subscribe(mkd0.m154955G(new e30() { // from class: l.qvh0
            @Override // p149l.e30
            public final void call(Object obj) {
                rvh0.m181284i0((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m181287k0(boolean z) {
        ((svh0) this.viewModel).m186091r();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m181288m0(IntlCurrencyDiamond intlCurrencyDiamond) {
        long j = intlCurrencyDiamond.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((svh0) v2).m186090j(40);
        } else {
            ((svh0) v2).m186090j(48);
        }
        ((svh0) this.viewModel).m186089i(swh0.m186215U(intlCurrencyDiamond.available));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m181289n0(Coin coin) {
        long j = coin.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((svh0) v2).m186090j(40);
        } else {
            ((svh0) v2).m186090j(48);
        }
        ((svh0) this.viewModel).m186089i(swh0.m186215U(coin.available));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
