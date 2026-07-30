package p006l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.sdk.app.AuthTask;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Wallet;
import com.p1.mobile.putong.core.data.WalletAccount;
import com.p1.mobile.putong.data.WithdrawAccount;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.s7m;
import l.vwb;
import l.w9j;
import l.x9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cnd0 extends jq2<hnd0> {
    public cnd0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m13532f0(Throwable th) {
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m13535i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m13541u0(Bundle bundle) {
        ((hnd0) ((jq2) this).viewModel).m16258r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public /* synthetic */ void m13542x0(Pair pair) {
        double d;
        Optional optional = (Optional) pair.second;
        if (!optional.isPresent() || TextUtils.isEmpty(((WalletAccount) optional.get()).balance)) {
            d = 0.0d;
        } else {
            WalletAccount walletAccount = (WalletAccount) optional.get();
            d = Double.parseDouble(walletAccount.balance);
            ((hnd0) ((jq2) this).viewModel).m16262w(walletAccount.id, walletAccount.balance);
            CoreModule.f1534c.f3559H0.m27542n5(walletAccount.id, "recharge");
        }
        Wallet wallet = (Wallet) pair.first;
        if (!NullChecker.a(wallet.withdrawAccounts) || vwb.J(wallet.withdrawAccounts)) {
            ((hnd0) ((jq2) this).viewModel).m16254m();
        } else {
            ((hnd0) ((jq2) this).viewModel).m16260u(((WithdrawAccount) wallet.withdrawAccounts.get(0)).name);
        }
        ((hnd0) ((jq2) this).viewModel).m16255n(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m13543y0(j760 j760Var) {
        if (NullChecker.a(j760Var.b)) {
            ((hnd0) ((jq2) this).viewModel).m16261v((List) j760Var.b);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m13544Z() {
        super.Z();
        CoreModule.f1534c.f3559H0.m27540m5();
    }

    /* JADX INFO: renamed from: a0 */
    public void m13545a0() {
        super.a0();
        CoreModule.f1534c.f3559H0.m27534j5();
        creates(new e30() { // from class: l.rmd0
            public final void call(Object obj) {
                this.f20633a.m13541u0((Bundle) obj);
            }
        });
        duringCreated(mkd0.r(CoreModule.f1534c.f3559H0.m27500D5(), CoreModule.f1534c.f3559H0.m27502E5(), new x9j() { // from class: l.tmd0
            public final Object call(Object obj, Object obj2) {
                return Pair.create((Wallet) obj, (Optional) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.umd0
            public final void call(Object obj) {
                this.f23642a.m13542x0((Pair) obj);
            }
        }, new e30() { // from class: l.vmd0
            public final void call(Object obj) {
                cnd0.m13535i0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f1534c.f3559H0.m27544o5()).filter(new w9j() { // from class: l.wmd0
            public final Object call(Object obj) {
                return Boolean.valueOf("recharge".equals(((j760) obj).a));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.xmd0
            public final void call(Object obj) {
                this.f27611a.m13543y0((j760) obj);
            }
        }, new e30() { // from class: l.ymd0
            public final void call(Object obj) {
                cnd0.m13532f0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o0 */
    public void m13546o0() {
        duringCreated(CoreModule.f1534c.f3559H0.m27533j4(new AuthTask(act()))).subscribe(mkd0.H(new e30() { // from class: l.bnd0
            public final void call(Object obj) {
                this.f9004a.m13548q0((j760) obj);
            }
        }, new e30() { // from class: l.smd0
            public final void call(Object obj) {
                this.f21428a.m13549r0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public void m13547p0(String str, String str2) {
        duringCreated(CoreModule.f1534c.f3559H0.m27494A5(str, str2)).subscribe(mkd0.H(new e30() { // from class: l.zmd0
            public final void call(Object obj) {
                this.f28824a.m13550s0((Optional) obj);
            }
        }, new e30() { // from class: l.and0
            public final void call(Object obj) {
                this.f8406a.m13551t0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m13548q0(j760 j760Var) {
        ((hnd0) ((jq2) this).viewModel).m16249i(j760Var);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m13549r0(Throwable th) {
        ((hnd0) ((jq2) this).viewModel).m16248f(th);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m13550s0(Optional optional) {
        boolean zIsPresent = optional.isPresent();
        s7m s7mVar = ((jq2) this).viewModel;
        if (zIsPresent) {
            ((hnd0) s7mVar).m16264y();
        } else {
            ((hnd0) s7mVar).m16263x(null);
        }
        CoreModule.f1534c.f3559H0.m27540m5();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m13551t0(Throwable th) {
        ((hnd0) ((jq2) this).viewModel).m16263x(th);
    }

    public void destroy() {
    }
}
