package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coin;
import com.p046p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p046p1.mobile.putong.data.AuthData;

/* JADX INFO: loaded from: classes9.dex */
public class wxh0 extends jq2<yxh0> {

    /* JADX INFO: renamed from: a */
    public final String f188482a;

    /* JADX INFO: renamed from: b */
    public String f188483b;

    public wxh0(mcr mcrVar) {
        super(mcrVar);
        this.f188482a = xh5.m208767o("/monetization/international/#/co_recharge?from=");
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m205988g0(C4319c c4319c) {
        if (CoreModule.m29932K().mo30835xf()) {
            CoreModule.f17545c.f19573I0.m140262P3();
        } else {
            CoreModule.f17545c.f19570H0.m210361k5();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m205992k0(xaj0 xaj0Var) {
        if (xaj0Var != null && ((Integer) xaj0Var.f191751a).intValue() == 0) {
            if (CoreModule.m29932K().mo30835xf()) {
                CoreModule.f17545c.f19573I0.m140262P3();
            } else {
                CoreModule.f17545c.f19570H0.m210361k5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m205994n0(Bundle bundle) {
        ((yxh0) this.viewModel).m216449r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m205995o0(IntlCurrencyDiamond intlCurrencyDiamond) {
        long j = intlCurrencyDiamond.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((yxh0) v2).m216443e(40);
        } else {
            ((yxh0) v2).m216443e(48);
        }
        ((yxh0) this.viewModel).m216442d(swh0.m186215U(intlCurrencyDiamond.available));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m205996p0(Coin coin) {
        long j = coin.available;
        V v2 = this.viewModel;
        if (j > 999) {
            ((yxh0) v2).m216443e(40);
        } else {
            ((yxh0) v2).m216443e(48);
        }
        ((yxh0) this.viewModel).m216442d(swh0.m186215U(coin.available));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19570H0.m210361k5();
        if (CoreModule.m29935P().m94651a().mo33507h5()) {
            CoreModule.f17545c.f19570H0.m210365m5();
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.oxh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146213a.m205994n0((Bundle) obj);
            }
        });
        if (CoreModule.m29932K().mo30835xf()) {
            duringCreated(CoreModule.f17545c.f19573I0.m140259M3()).subscribe(mkd0.m154955G(new e30() { // from class: l.pxh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f151684a.m205995o0((IntlCurrencyDiamond) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f17545c.f19570H0.m210349a5()).subscribe(mkd0.m154955G(new e30() { // from class: l.qxh0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156844a.m205996p0((Coin) obj);
                }
            }));
        }
        lifecycle().filter(new w9j() { // from class: l.rxh0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.sxh0
            @Override // p149l.e30
            public final void call(Object obj) {
                wxh0.m205988g0((C4319c) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19604S0.m34186v3()).subscribe(mkd0.m154955G(new e30() { // from class: l.txh0
            @Override // p149l.e30
            public final void call(Object obj) {
                wxh0.m205992k0((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public String m205997m0() {
        return TextUtils.concat(this.f188482a, this.f188483b).toString();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m205998q0(AuthData authData) {
        ((yxh0) this.viewModel).m216448m(authData);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m205999r0(Throwable th) {
        ((yxh0) this.viewModel).m216447l();
    }

    /* JADX INFO: renamed from: s0 */
    public void m206000s0() {
        duringCreated(qib0.f154713b0.f139230a.accessOutterToken()).subscribe(mkd0.m154956H(new e30() { // from class: l.uxh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178740a.m205998q0((AuthData) obj);
            }
        }, new e30() { // from class: l.vxh0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183456a.m205999r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m206001t0(String str) {
        this.f188483b = str;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
