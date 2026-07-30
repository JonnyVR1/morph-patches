package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.wallet.TanTanCoinCheckstandFrag;
import com.p051p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes12.dex */
public class z3i0 extends ar2<a4i0> {

    /* JADX INFO: renamed from: a */
    public TanTanCoinCheckstandFrag f202831a;

    public z3i0(ner nerVar, TanTanCoinCheckstandFrag tanTanCoinCheckstandFrag) {
        super(nerVar);
        this.f202831a = tanTanCoinCheckstandFrag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m218475i0(bkj0 bkj0Var) {
        if (bkj0Var != null && ((Integer) bkj0Var.f77081a).intValue() == 0) {
            fp60.m126549K(PurchaseType.TYPE_INTL_TTT_COIN, "coin");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m218476j0(C4470c c4470c) {
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3();
        } else {
            CoreModule.f18264c.f20312H0.m155449k5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m218477l0(Bundle bundle) {
        act().setTitle(R$string.f28307ga);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20312H0.m155449k5();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.t3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171924a.m218477l0((Bundle) obj);
            }
        });
        if (CoreModule.m30930K().mo31838xf()) {
            duringCreated(CoreModule.f18264c.f20315I0.m144056M3()).subscribe(psd0.m173596G(new y20() { // from class: l.u3i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177346a.m218479m0((IntlCurrencyDiamond) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f18264c.f20312H0.m155437a5()).subscribe(psd0.m173596G(new y20() { // from class: l.v3i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182212a.m218480n0((Coin) obj);
                }
            }));
        }
        lifecycle().filter(new qcj() { // from class: l.w3i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.x3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                z3i0.m218476j0((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20346S0.m35189v3()).subscribe(psd0.m173596G(new y20() { // from class: l.y3i0
            @Override // p153l.y20
            public final void call(Object obj) {
                z3i0.m218475i0((bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k0 */
    public void m218478k0(boolean z) {
        ((a4i0) this.viewModel).m95941r();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m218479m0(IntlCurrencyDiamond intlCurrencyDiamond) {
        long j = intlCurrencyDiamond.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((a4i0) v2).m95940j(40);
        } else {
            ((a4i0) v2).m95940j(48);
        }
        ((a4i0) this.viewModel).m95939i(a5i0.m96120U(intlCurrencyDiamond.available));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m218480n0(Coin coin) {
        long j = coin.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((a4i0) v2).m95940j(40);
        } else {
            ((a4i0) v2).m95940j(48);
        }
        ((a4i0) this.viewModel).m95939i(a5i0.m96120U(coin.available));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
