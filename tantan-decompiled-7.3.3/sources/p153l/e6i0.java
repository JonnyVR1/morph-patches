package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coin;
import com.p051p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p051p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes12.dex */
public class e6i0 extends ar2<g6i0> {

    /* JADX INFO: renamed from: a */
    public final String f92280a;

    /* JADX INFO: renamed from: b */
    public String f92281b;

    public e6i0(ner nerVar) {
        super(nerVar);
        this.f92280a = xi5.m211113o("/monetization/international/#/co_recharge?from=");
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m119584g0(C4470c c4470c) {
        if (CoreModule.m30930K().mo31838xf()) {
            CoreModule.f18264c.f20315I0.m144059P3();
        } else {
            CoreModule.f18264c.f20312H0.m155449k5();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m119588k0(bkj0 bkj0Var) {
        if (bkj0Var != null && ((Integer) bkj0Var.f77081a).intValue() == 0) {
            if (CoreModule.m30930K().mo31838xf()) {
                CoreModule.f18264c.f20315I0.m144059P3();
            } else {
                CoreModule.f18264c.f20312H0.m155449k5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m119590n0(Bundle bundle) {
        ((g6i0) this.viewModel).m129264r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m119591o0(IntlCurrencyDiamond intlCurrencyDiamond) {
        long j = intlCurrencyDiamond.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((g6i0) v2).m129258e(40);
        } else {
            ((g6i0) v2).m129258e(48);
        }
        ((g6i0) this.viewModel).m129257d(a5i0.m96120U(intlCurrencyDiamond.available));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m119592p0(Coin coin) {
        long j = coin.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((g6i0) v2).m129258e(40);
        } else {
            ((g6i0) v2).m129258e(48);
        }
        ((g6i0) this.viewModel).m129257d(a5i0.m96120U(coin.available));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20312H0.m155449k5();
        if (CoreModule.m30933P().m143405a().mo34510h5()) {
            CoreModule.f18264c.f20312H0.m155453m5();
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.w5i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187519a.m119590n0((Bundle) obj);
            }
        });
        if (CoreModule.m30930K().mo31838xf()) {
            duringCreated(CoreModule.f18264c.f20315I0.m144056M3()).subscribe(psd0.m173596G(new y20() { // from class: l.x5i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192499a.m119591o0((IntlCurrencyDiamond) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f18264c.f20312H0.m155437a5()).subscribe(psd0.m173596G(new y20() { // from class: l.y5i0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197562a.m119592p0((Coin) obj);
                }
            }));
        }
        lifecycle().filter(new qcj() { // from class: l.z5i0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.a6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                e6i0.m119584g0((C4470c) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20346S0.m35189v3()).subscribe(psd0.m173596G(new y20() { // from class: l.b6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                e6i0.m119588k0((bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public String m119593m0() {
        return TextUtils.concat(this.f92280a, this.f92281b).toString();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m119594q0(AuthData authData) {
        ((g6i0) this.viewModel).m129263m(authData);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m119595r0(Throwable th) {
        ((g6i0) this.viewModel).m129262l();
    }

    /* JADX INFO: renamed from: s0 */
    public void m119596s0() {
        duringCreated(uqb0.f180396b0.f170324a.accessOutterToken()).subscribe(psd0.m173597H(new y20() { // from class: l.c6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79973a.m119594q0((AuthData) obj);
            }
        }, new y20() { // from class: l.d6i0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85329a.m119595r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m119597t0(String str) {
        this.f92281b = str;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
