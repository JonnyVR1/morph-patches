package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.Coin;
import com.p1.mobile.putong.core.data.IntlCurrencyDiamond;
import com.p1.mobile.putong.data.AuthData;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.s7m;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wxh0 extends jq2<yxh0> {

    /* JADX INFO: renamed from: a */
    public final String f25487a;

    /* JADX INFO: renamed from: b */
    public String f25488b;

    public wxh0(mcr mcrVar) {
        super(mcrVar);
        this.f25487a = xh5.m27256o("/monetization/international/#/co_recharge?from=");
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m26862g0(c cVar) {
        if (CoreModule.m1851K().xf()) {
            CoreModule.f1534c.f3562I0.m17378P3();
        } else {
            CoreModule.f1534c.f3559H0.m27536k5();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m26866k0(xaj0 xaj0Var) {
        if (xaj0Var != null && ((Integer) xaj0Var.a).intValue() == 0) {
            if (CoreModule.m1851K().xf()) {
                CoreModule.f1534c.f3562I0.m17378P3();
            } else {
                CoreModule.f1534c.f3559H0.m27536k5();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m26868n0(Bundle bundle) {
        ((yxh0) ((jq2) this).viewModel).m28470r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m26869o0(IntlCurrencyDiamond intlCurrencyDiamond) {
        long j = intlCurrencyDiamond.available;
        s7m s7mVar = ((jq2) this).viewModel;
        if (j > 999) {
            ((yxh0) s7mVar).m28463e(40);
        } else {
            ((yxh0) s7mVar).m28463e(48);
        }
        ((yxh0) ((jq2) this).viewModel).m28462d(swh0.m24266U(intlCurrencyDiamond.available));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m26870p0(Coin coin) {
        long j = coin.available;
        s7m s7mVar = ((jq2) this).viewModel;
        if (j > 999) {
            ((yxh0) s7mVar).m28463e(40);
        } else {
            ((yxh0) s7mVar).m28463e(48);
        }
        ((yxh0) ((jq2) this).viewModel).m28462d(swh0.m24266U(coin.available));
    }

    /* JADX INFO: renamed from: Z */
    public void m26871Z() {
        super.Z();
        CoreModule.f1534c.f3559H0.m27536k5();
        if (CoreModule.m1854P().m11706a().m5444h5()) {
            CoreModule.f1534c.f3559H0.m27540m5();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m26872a0() {
        super.a0();
        creates(new e30() { // from class: l.oxh0
            public final void call(Object obj) {
                this.f18475a.m26868n0((Bundle) obj);
            }
        });
        if (CoreModule.m1851K().xf()) {
            duringCreated(CoreModule.f1534c.f3562I0.m17375M3()).subscribe(mkd0.G(new e30() { // from class: l.pxh0
                public final void call(Object obj) {
                    this.f19416a.m26869o0((IntlCurrencyDiamond) obj);
                }
            }));
        } else {
            duringCreated(CoreModule.f1534c.f3559H0.m27524a5()).subscribe(mkd0.G(new e30() { // from class: l.qxh0
                public final void call(Object obj) {
                    this.f20141a.m26870p0((Coin) obj);
                }
            }));
        }
        lifecycle().filter(new w9j() { // from class: l.rxh0
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.sxh0
            public final void call(Object obj) {
                wxh0.m26862g0((c) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3593S0.m6123v3()).subscribe(mkd0.G(new e30() { // from class: l.txh0
            public final void call(Object obj) {
                wxh0.m26866k0((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public String m26873m0() {
        return TextUtils.concat(this.f25487a, this.f25488b).toString();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m26874q0(AuthData authData) {
        ((yxh0) ((jq2) this).viewModel).m28469m(authData);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m26875r0(Throwable th) {
        ((yxh0) ((jq2) this).viewModel).m28468l();
    }

    /* JADX INFO: renamed from: s0 */
    public void m26876s0() {
        duringCreated(qib0.f19804b0.f17706a.accessOutterToken()).subscribe(mkd0.H(new e30() { // from class: l.uxh0
            public final void call(Object obj) {
                this.f23795a.m26874q0((AuthData) obj);
            }
        }, new e30() { // from class: l.vxh0
            public final void call(Object obj) {
                this.f24523a.m26875r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m26877t0(String str) {
        this.f25488b = str;
    }

    public void destroy() {
    }
}
