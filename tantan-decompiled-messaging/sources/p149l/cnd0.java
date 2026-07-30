package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.sdk.app.AuthTask;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Wallet;
import com.p046p1.mobile.putong.core.data.WalletAccount;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class cnd0 extends jq2<hnd0> {
    public cnd0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m107760f0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m107763i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m107769u0(Bundle bundle) {
        ((hnd0) this.viewModel).m131904r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m107770x0(Pair pair) {
        double d;
        Optional optional = (Optional) pair.second;
        if (!optional.isPresent() || TextUtils.isEmpty(((WalletAccount) optional.get()).balance)) {
            d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            WalletAccount walletAccount = (WalletAccount) optional.get();
            d = Double.parseDouble(walletAccount.balance);
            ((hnd0) this.viewModel).m131908w(walletAccount.f20532id, walletAccount.balance);
            CoreModule.f17545c.f19570H0.m210367n5(walletAccount.f20532id, "recharge");
        }
        Wallet wallet = (Wallet) pair.first;
        if (!NullChecker.m81303a(wallet.withdrawAccounts) || vwb.m200296J(wallet.withdrawAccounts)) {
            ((hnd0) this.viewModel).m131900m();
        } else {
            ((hnd0) this.viewModel).m131906u(wallet.withdrawAccounts.get(0).name);
        }
        ((hnd0) this.viewModel).m131901n(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m107771y0(j760 j760Var) {
        if (NullChecker.m81303a(j760Var.f116565b)) {
            ((hnd0) this.viewModel).m131907v((List) j760Var.f116565b);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        CoreModule.f17545c.f19570H0.m210365m5();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        CoreModule.f17545c.f19570H0.m210359j5();
        creates(new e30() { // from class: l.rmd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160087a.m107769u0((Bundle) obj);
            }
        });
        duringCreated(mkd0.m154984r(CoreModule.f17545c.f19570H0.m210325D5(), CoreModule.f17545c.f19570H0.m210327E5(), new x9j() { // from class: l.tmd0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Pair.create((Wallet) obj, (Optional) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.umd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177222a.m107770x0((Pair) obj);
            }
        }, new e30() { // from class: l.vmd0
            @Override // p149l.e30
            public final void call(Object obj) {
                cnd0.m107763i0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19570H0.m210369o5()).filter(new w9j() { // from class: l.wmd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("recharge".equals(((j760) obj).f116564a));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.xmd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193547a.m107771y0((j760) obj);
            }
        }, new e30() { // from class: l.ymd0
            @Override // p149l.e30
            public final void call(Object obj) {
                cnd0.m107760f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m107772o0() {
        duringCreated(CoreModule.f17545c.f19570H0.m210358j4(new AuthTask(act()))).subscribe(mkd0.m154956H(new e30() { // from class: l.bnd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76392a.m107774q0((j760) obj);
            }
        }, new e30() { // from class: l.smd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165337a.m107775r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m107773p0(String str, String str2) {
        duringCreated(CoreModule.f17545c.f19570H0.m210319A5(str, str2)).subscribe(mkd0.m154956H(new e30() { // from class: l.zmd0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203706a.m107776s0((Optional) obj);
            }
        }, new e30() { // from class: l.and0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70730a.m107777t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m107774q0(j760 j760Var) {
        ((hnd0) this.viewModel).m131896i(j760Var);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m107775r0(Throwable th) {
        ((hnd0) this.viewModel).m131895f(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m107776s0(Optional optional) {
        boolean zIsPresent = optional.isPresent();
        V v2 = this.viewModel;
        if (zIsPresent) {
            ((hnd0) v2).m131910y();
        } else {
            ((hnd0) v2).m131909x(null);
        }
        CoreModule.f17545c.f19570H0.m210365m5();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m107777t0(Throwable th) {
        ((hnd0) this.viewModel).m131909x(th);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
