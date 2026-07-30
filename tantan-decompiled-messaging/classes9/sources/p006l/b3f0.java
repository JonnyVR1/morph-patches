package p006l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.account.EmailVerifyDeviceIntroAct;
import com.p000p1.mobile.putong.account.p002ui.account.VerifyDeviceIntroAct;
import com.p000p1.mobile.putong.account.p002ui.accountai.new2021.view.NameView;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.ane0;
import l.bne0;
import l.cwf0;
import l.d30;
import l.e30;
import l.i0e;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.px0;
import l.roj0;
import l.s7m;
import l.tan;
import l.w85;
import l.w9j;
import l.yij0;
import l.zvf0;
import p006l.c3f0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class b3f0<T extends c3f0> extends jq2<T> {

    /* JADX INFO: renamed from: a */
    public int f8701a;

    /* JADX INFO: renamed from: b */
    public boolean f8702b;

    /* JADX INFO: renamed from: c */
    public long f8703c;

    /* JADX INFO: renamed from: d */
    public long f8704d;

    /* JADX INFO: renamed from: l.b3f0$a */
    public class DialogInterfaceOnDismissListenerC0546a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f8705a;

        public DialogInterfaceOnDismissListenerC0546a(cwf0 cwf0Var) {
            this.f8705a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f8705a);
        }
    }

    public b3f0(mcr mcrVar) {
        super(mcrVar);
        this.f8703c = 604800L;
        this.f8704d = 864000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m12485A0(c cVar) {
        m12512s0();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m12494m0(SignInData signInData) {
        zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        HashMap map = new HashMap();
        if (TEnum.equals(signInData.grantType, "email")) {
            map.put("Method used", "email");
        } else {
            map.put("Method used", "Phone");
        }
        map.put("Status", "Failure");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m12498C0(roj0 roj0Var) {
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        ((c3f0) ((jq2) this).viewModel).act().hideInput();
        act().startActivity(C0811hp.m16305e(((c3f0) ((jq2) this).viewModel).f9323a));
        act().finish();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m12499D0(e30 e30Var, Throwable th) {
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            eje.m14574h().m14584m();
            ((c3f0) ((jq2) this).viewModel).act().startActivity(SplashProxyAct.l(((c3f0) ((jq2) this).viewModel).act()));
        } else {
            yij0.D(th);
            if (NullChecker.a(e30Var)) {
                e30Var.call(th);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m12500E0() {
        ((c3f0) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m12501F0(SignInData signInData, d30 d30Var, roj0 roj0Var) {
        if (TEnum.equals(signInData.grantType, "password") && !TextUtils.isEmpty(signInData.password)) {
            hkf0.m16233d().m16235e().onNext(new Pair(signInData.username, signInData.password));
        }
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        m12511r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m12502G0(e30 e30Var, SignInData signInData, Runnable runnable, boolean z, Throwable th) {
        TantanException.Client.AccountService accountService;
        int i;
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        boolean z2 = th instanceof TantanException.Client.AccountService;
        if (z2 && ((i = (accountService = (TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            if (NullChecker.a(e30Var)) {
                e30Var.call("inActivated");
            }
            m12510q0(accountService.code == 40020, signInData, runnable, e30Var, th);
        } else if (z2 && ((TantanException.Client.AccountService) th).code == 40022) {
            if (NullChecker.a(e30Var)) {
                e30Var.call("newDevice");
            }
            ((c3f0) ((jq2) this).viewModel).act().hideInput();
            if (TEnum.equals(signInData.grantType, "password") && !TextUtils.isEmpty(signInData.password)) {
                hkf0.m16233d().m16235e().onNext(new Pair(signInData.username, signInData.password));
            }
            if (!TEnum.equals(signInData.grantType, "email") || TextUtils.isEmpty(signInData.password)) {
                s7m s7mVar = ((jq2) this).viewModel;
                ((c3f0) s7mVar).m13097f(VerifyDeviceIntroAct.m290V1(((c3f0) s7mVar).act(), signInData));
            } else {
                s7m s7mVar2 = ((jq2) this).viewModel;
                ((c3f0) s7mVar2).m13097f(EmailVerifyDeviceIntroAct.m280V1(((c3f0) s7mVar2).act(), signInData));
            }
            yij0.S(((c3f0) ((jq2) this).viewModel).act());
        } else if (z2 && ((TantanException.Client.AccountService) th).code == 403001) {
            if (NullChecker.a(e30Var)) {
                e30Var.call("suspicious");
            }
        } else if (!bne0.f() || Build.VERSION.SDK_INT < 27) {
            if (NullChecker.a(e30Var)) {
                e30Var.call(th.toString());
            }
            if (NullChecker.a(signInData.code) && signInData.code.intValue() == 86 && z2) {
                if (((TantanException.Client.AccountService) th).code != 40000) {
                    lsi0.k(act().getString(R$string.f240n0), true);
                } else {
                    yij0.G(th);
                }
            } else if (this instanceof oue) {
                ((oue) this).m20822w2(th);
            } else if (z) {
                yij0.D(th);
            } else if (z2) {
                int i2 = ((TantanException.Client.AccountService) th).code;
                ((c3f0) ((jq2) this).viewModel).m13094c(yij0.l(i2), i2);
            }
        } else {
            if (NullChecker.a(e30Var)) {
                e30Var.call("");
            }
            if (NullChecker.a(signInData.code) && signInData.code.intValue() == 86) {
                ((c3f0) ((jq2) this).viewModel).mo12892i(act().getString(R$string.f240n0));
            } else {
                ((c3f0) ((jq2) this).viewModel).mo12892i(djj0.m14046d(th));
            }
        }
        if (z2 && ((TantanException.Client.AccountService) th).code == 40012) {
            zvf0.x("e_password_verifypage_wrong_tips", "p_sign_in_password_view");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m12503H0(AccountTempApi.SignUpType signUpType, d30 d30Var, final e30<Throwable> e30Var) {
        ((c3f0) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        duringCreated(AccountModule.f26c.m190L0(signUpType)).subscribe(mkd0.H(new e30() { // from class: l.x2f0
            public final void call(Object obj) {
                this.f27330a.m12498C0((roj0) obj);
            }
        }, new e30() { // from class: l.y2f0
            public final void call(Object obj) {
                this.f27942a.m12499D0(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public void m12504I0(SignInData signInData) {
        m12505J0(signInData, null, null);
    }

    /* JADX INFO: renamed from: J0 */
    public void m12505J0(SignInData signInData, d30 d30Var, e30<String> e30Var) {
        m12506L0(signInData, d30Var, e30Var, true);
    }

    /* JADX INFO: renamed from: L0 */
    public void m12506L0(SignInData signInData, d30 d30Var, e30<String> e30Var, boolean z) {
        m12507N0(signInData, d30Var, e30Var, z, true);
    }

    /* JADX INFO: renamed from: N0 */
    public void m12507N0(final SignInData signInData, final d30 d30Var, final e30<String> e30Var, boolean z, final boolean z2) {
        if (z) {
            ((c3f0) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        }
        final Runnable runnable = new Runnable() { // from class: l.u2f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f22444a.m12500E0();
            }
        };
        AccountModule.f26c.m244o2(signInData, false, runnable).subscribe(mkd0.K(new e30() { // from class: l.v2f0
            public final void call(Object obj) {
                this.f24100a.m12501F0(signInData, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.w2f0
            public final void call(Object obj) {
                this.f24888a.m12502G0(e30Var, signInData, runnable, z2, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: O0 */
    public void m12508O0() {
        AccountModule.f26c.m226f1().subscribe(mkd0.G(new e30() { // from class: l.t2f0
            public final void call(Object obj) {
                eje.m14574h().m14587p((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public void m12509P0(DetectRequest detectRequest, NameView nameView, AccountTempApi.SignUpType signUpType, d30 d30Var, e30<Throwable> e30Var) {
        m12503H0(signUpType, d30Var, e30Var);
    }

    @CallSuper
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        if (ane0.w()) {
            lifecycle().filter(new w9j() { // from class: l.p2f0
                public final Object call(Object obj) {
                    return this.f18568a.m12517z0((c) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.s2f0
                public final void call(Object obj) {
                    this.f20987a.m12485A0((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m12510q0(boolean z, final SignInData signInData, final Runnable runnable, final e30<String> e30Var, final Throwable th) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        ((c3f0) ((jq2) this).viewModel).act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.z2f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f28595a.m12515x0(signInData, runnable, e30Var, th);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.a3f0
            @Override // java.lang.Runnable
            public final void run() {
                b3f0.m12494m0(signInData);
            }
        }).V(new DialogInterfaceOnDismissListenerC0546a(cwf0VarC)).z0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m12511r0() {
        if (!ane0.w() || lifecycle_() == c.i) {
            m12512s0();
        } else {
            this.f8702b = true;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m12512s0() {
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        ((c3f0) ((jq2) this).viewModel).act().hideInput();
        ((c3f0) ((jq2) this).viewModel).m13097f(C0811hp.m16305e(act()));
        ((c3f0) ((jq2) this).viewModel).act().finish();
        yij0.S(((c3f0) ((jq2) this).viewModel).act());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m12514u0(e30 e30Var, SignInData signInData, Throwable th, Throwable th2) {
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        if (!(th2 instanceof TantanException.Client.AccountService) || ((TantanException.Client.AccountService) th2).code != 40022) {
            if (NullChecker.a(e30Var)) {
                e30Var.call(th.toString());
            }
            yij0.D(th2);
            return;
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call("newDevice");
        }
        if (!TEnum.equals(signInData.grantType, "email") || TextUtils.isEmpty(signInData.password)) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((c3f0) s7mVar).m13097f(VerifyDeviceIntroAct.m290V1(((c3f0) s7mVar).act(), signInData));
        } else {
            s7m s7mVar2 = ((jq2) this).viewModel;
            ((c3f0) s7mVar2).m13097f(EmailVerifyDeviceIntroAct.m280V1(((c3f0) s7mVar2).act(), signInData));
        }
        yij0.S(act());
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m12515x0(final SignInData signInData, Runnable runnable, final e30 e30Var, final Throwable th) {
        ((c3f0) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        AccountModule.f26c.m244o2(signInData, true, runnable).subscribe(mkd0.K(new e30() { // from class: l.q2f0
            public final void call(Object obj) {
                this.f19541a.m12516y0(signInData, (roj0) obj);
            }
        }, new e30() { // from class: l.r2f0
            public final void call(Object obj) {
                this.f20272a.m12514u0(e30Var, signInData, th, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m12516y0(SignInData signInData, roj0 roj0Var) {
        tan.c();
        m12511r0();
        HashMap map = new HashMap();
        if (TEnum.equals(signInData.grantType, "email")) {
            map.put("Method used", "email");
        } else {
            map.put("Method used", "Phone");
        }
        map.put("Status", "Success");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ Boolean m12517z0(c cVar) {
        return Boolean.valueOf(this.f8702b && cVar == c.i);
    }

    public void destroy() {
    }

    @CallSuper
    /* JADX INFO: renamed from: t0 */
    public void m12513t0(Intent intent) {
    }
}
