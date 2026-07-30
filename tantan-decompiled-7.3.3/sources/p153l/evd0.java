package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.sdk.app.AuthTask;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Wallet;
import com.p051p1.mobile.putong.core.data.WalletAccount;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class evd0 extends ar2<jvd0> {
    public evd0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m122779f0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m122782i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m122788u0(Bundle bundle) {
        ((jvd0) this.viewModel).m147026r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m122789x0(Pair pair) {
        double d;
        Optional optional = (Optional) pair.second;
        if (!optional.isPresent() || TextUtils.isEmpty(((WalletAccount) optional.get()).balance)) {
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            WalletAccount walletAccount = (WalletAccount) optional.get();
            d = Double.parseDouble(walletAccount.balance);
            ((jvd0) this.viewModel).m147030w(walletAccount.f21274id, walletAccount.balance);
            CoreModule.f18264c.f20312H0.m155455n5(walletAccount.f21274id, "recharge");
        }
        Wallet wallet = (Wallet) pair.first;
        if (!NullChecker.m82486a(wallet.withdrawAccounts) || jyb.m147479J(wallet.withdrawAccounts)) {
            ((jvd0) this.viewModel).m147022m();
        } else {
            ((jvd0) this.viewModel).m147028u(wallet.withdrawAccounts.get(0).name);
        }
        ((jvd0) this.viewModel).m147023n(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m122790y0(pf60 pf60Var) {
        if (NullChecker.m82486a(pf60Var.f152157b)) {
            ((jvd0) this.viewModel).m147029v((List) pf60Var.f152157b);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        CoreModule.f18264c.f20312H0.m155453m5();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        CoreModule.f18264c.f20312H0.m155447j5();
        creates(new y20() { // from class: l.tud0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176183a.m122788u0((Bundle) obj);
            }
        });
        duringCreated(psd0.m173625r(CoreModule.f18264c.f20312H0.m155413D5(), CoreModule.f18264c.f20312H0.m155415E5(), new rcj() { // from class: l.vud0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Pair.create((Wallet) obj, (Optional) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.wud0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190854a.m122789x0((Pair) obj);
            }
        }, new y20() { // from class: l.xud0
            @Override // p153l.y20
            public final void call(Object obj) {
                evd0.m122782i0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20312H0.m155457o5()).filter(new qcj() { // from class: l.yud0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("recharge".equals(((pf60) obj).f152156a));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.zud0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206113a.m122790y0((pf60) obj);
            }
        }, new y20() { // from class: l.avd0
            @Override // p153l.y20
            public final void call(Object obj) {
                evd0.m122779f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m122791o0() {
        duringCreated(CoreModule.f18264c.f20312H0.m155446j4(new AuthTask(act()))).subscribe(psd0.m173597H(new y20() { // from class: l.dvd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90923a.m122793q0((pf60) obj);
            }
        }, new y20() { // from class: l.uud0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181055a.m122794r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m122792p0(String str, String str2) {
        duringCreated(CoreModule.f18264c.f20312H0.m155407A5(str, str2)).subscribe(psd0.m173597H(new y20() { // from class: l.bvd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78586a.m122795s0((Optional) obj);
            }
        }, new y20() { // from class: l.cvd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83982a.m122796t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m122793q0(pf60 pf60Var) {
        ((jvd0) this.viewModel).m147018i(pf60Var);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m122794r0(Throwable th) {
        ((jvd0) this.viewModel).m147017f(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m122795s0(Optional optional) {
        boolean zIsPresent = optional.isPresent();
        V v2 = this.viewModel;
        if (zIsPresent) {
            ((jvd0) v2).m147032y();
        } else {
            ((jvd0) v2).m147031x(null);
        }
        CoreModule.f18264c.f20312H0.m155453m5();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m122796t0(Throwable th) {
        ((jvd0) this.viewModel).m147031x(th);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
