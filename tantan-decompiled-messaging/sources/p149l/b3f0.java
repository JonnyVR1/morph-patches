package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.account.EmailVerifyDeviceIntroAct;
import com.p046p1.mobile.putong.account.p050ui.account.VerifyDeviceIntroAct;
import com.p046p1.mobile.putong.account.p050ui.accountai.new2021.view.NameView;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p133rx.C22306c;
import p149l.c3f0;

/* JADX INFO: loaded from: classes9.dex */
public class b3f0<T extends c3f0> extends jq2<T> {

    /* JADX INFO: renamed from: a */
    public int f73209a;

    /* JADX INFO: renamed from: b */
    public boolean f73210b;

    /* JADX INFO: renamed from: c */
    public long f73211c;

    /* JADX INFO: renamed from: d */
    public long f73212d;

    /* JADX INFO: renamed from: l.b3f0$a */
    public class DialogInterfaceOnDismissListenerC15788a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f73213a;

        public DialogInterfaceOnDismissListenerC15788a(cwf0 cwf0Var) {
            this.f73213a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f73213a);
        }
    }

    public b3f0(mcr mcrVar) {
        super(mcrVar);
        this.f73211c = 604800L;
        this.f73212d = 864000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m100062A0(C4319c c4319c) {
        m100089s0();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m100071m0(SignInData signInData) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        HashMap map = new HashMap();
        if (TEnum.equals(signInData.grantType, "email")) {
            map.put("Method used", "email");
        } else {
            map.put("Method used", "Phone");
        }
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m100075C0(roj0 roj0Var) {
        ((c3f0) this.viewModel).act().progressDismiss();
        ((c3f0) this.viewModel).act().hideInput();
        act().startActivity(C17367hp.m132321e(((c3f0) this.viewModel).f78941a));
        act().m50458m2();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m100076D0(e30 e30Var, Throwable th) {
        ((c3f0) this.viewModel).act().progressDismiss();
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            eje.m116824h().m116834m();
            ((c3f0) this.viewModel).act().startActivity(SplashProxyAct.m80105l(((c3f0) this.viewModel).act()));
        } else {
            yij0.m214926D(th);
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(th);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m100077E0() {
        ((c3f0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m100078F0(SignInData signInData, d30 d30Var, roj0 roj0Var) {
        if (TEnum.equals(signInData.grantType, SignInGrantType.password) && !TextUtils.isEmpty(signInData.password)) {
            hkf0.m131486d().m131488e().onNext(new Pair<>(signInData.username, signInData.password));
        }
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        m100088r0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m100079G0(e30 e30Var, SignInData signInData, Runnable runnable, boolean z, Throwable th) {
        TantanException.Client.AccountService accountService;
        int i;
        ((c3f0) this.viewModel).act().progressDismiss();
        boolean z2 = th instanceof TantanException.Client.AccountService;
        if (z2 && ((i = (accountService = (TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call("inActivated");
            }
            m100087q0(accountService.code == 40020, signInData, runnable, e30Var, th);
        } else if (z2 && ((TantanException.Client.AccountService) th).code == 40022) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call("newDevice");
            }
            ((c3f0) this.viewModel).act().hideInput();
            if (TEnum.equals(signInData.grantType, SignInGrantType.password) && !TextUtils.isEmpty(signInData.password)) {
                hkf0.m131486d().m131488e().onNext(new Pair<>(signInData.username, signInData.password));
            }
            if (!TEnum.equals(signInData.grantType, "email") || TextUtils.isEmpty(signInData.password)) {
                V v2 = this.viewModel;
                ((c3f0) v2).m105019f(VerifyDeviceIntroAct.m28394V1(((c3f0) v2).act(), signInData));
            } else {
                V v3 = this.viewModel;
                ((c3f0) v3).m105019f(EmailVerifyDeviceIntroAct.m28384V1(((c3f0) v3).act(), signInData));
            }
            yij0.m214941S(((c3f0) this.viewModel).act());
        } else if (z2 && ((TantanException.Client.AccountService) th).code == 403001) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call("suspicious");
            }
        } else if (!bne0.m102777f() || Build.VERSION.SDK_INT < 27) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(th.toString());
            }
            if (NullChecker.m81303a(signInData.code) && signInData.code.intValue() == 86 && z2) {
                if (((TantanException.Client.AccountService) th).code != 40000) {
                    lsi0.m151581k(act().getString(R$string.f16251n0), true);
                } else {
                    yij0.m214929G(th);
                }
            } else if (this instanceof oue) {
                ((oue) this).m166063w2(th);
            } else if (z) {
                yij0.m214926D(th);
            } else if (z2) {
                int i2 = ((TantanException.Client.AccountService) th).code;
                ((c3f0) this.viewModel).m105016c(yij0.m214956l(i2), i2);
            }
        } else {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call("");
            }
            if (NullChecker.m81303a(signInData.code) && signInData.code.intValue() == 86) {
                ((c3f0) this.viewModel).mo103522i(act().getString(R$string.f16251n0));
            } else {
                ((c3f0) this.viewModel).mo103522i(djj0.m112083d(th));
            }
        }
        if (z2 && ((TantanException.Client.AccountService) th).code == 40012) {
            zvf0.m220402x("e_password_verifypage_wrong_tips", "p_sign_in_password_view");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m100080H0(AccountTempApi.SignUpType signUpType, d30 d30Var, final e30<Throwable> e30Var) {
        ((c3f0) this.viewModel).act().progress(R$string.f16227j0, true);
        duringCreated((C22306c<T>) AccountModule.f16037c.m28295L0(signUpType)).subscribe(mkd0.m154956H(new e30() { // from class: l.x2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f190800a.m100075C0((roj0) obj);
            }
        }, new e30() { // from class: l.y2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195608a.m100076D0(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public void m100081I0(SignInData signInData) {
        m100082J0(signInData, null, null);
    }

    /* JADX INFO: renamed from: J0 */
    public void m100082J0(SignInData signInData, d30 d30Var, e30<String> e30Var) {
        m100083L0(signInData, d30Var, e30Var, true);
    }

    /* JADX INFO: renamed from: L0 */
    public void m100083L0(SignInData signInData, d30 d30Var, e30<String> e30Var, boolean z) {
        m100084N0(signInData, d30Var, e30Var, z, true);
    }

    /* JADX INFO: renamed from: N0 */
    public void m100084N0(final SignInData signInData, final d30 d30Var, final e30<String> e30Var, boolean z, final boolean z2) {
        if (z) {
            ((c3f0) this.viewModel).act().progress(R$string.f16227j0, true);
        }
        final Runnable runnable = new Runnable() { // from class: l.u2f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f173484a.m100077E0();
            }
        };
        AccountModule.f16037c.m28349o2(signInData, false, runnable).subscribe(mkd0.m154959K(new e30() { // from class: l.v2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179543a.m100078F0(signInData, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.w2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184235a.m100079G0(e30Var, signInData, runnable, z2, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: O0 */
    public void m100085O0() {
        AccountModule.f16037c.m28331f1().subscribe(mkd0.m154955G(new e30() { // from class: l.t2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                eje.m116824h().m116837p((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public void m100086P0(DetectRequest detectRequest, NameView nameView, AccountTempApi.SignUpType signUpType, d30 d30Var, e30<Throwable> e30Var) {
        m100080H0(signUpType, d30Var, e30Var);
    }

    @Override // p149l.jq2
    @CallSuper
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        if (ane0.m97751w()) {
            lifecycle().filter(new w9j() { // from class: l.p2f0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f146856a.m100094z0((C4319c) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.s2f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f161976a.m100062A0((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m100087q0(boolean z, final SignInData signInData, final Runnable runnable, final e30<String> e30Var, final Throwable th) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        ((c3f0) this.viewModel).act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.z2f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201227a.m100092x0(signInData, runnable, e30Var, th);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.a3f0
            @Override // java.lang.Runnable
            public final void run() {
                b3f0.m100071m0(signInData);
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC15788a(cwf0VarM133794c)).m20568z0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m100088r0() {
        if (!ane0.m97751w() || lifecycle_() == C4319c.f15548i) {
            m100089s0();
        } else {
            this.f73210b = true;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m100089s0() {
        ((c3f0) this.viewModel).act().progressDismiss();
        ((c3f0) this.viewModel).act().hideInput();
        ((c3f0) this.viewModel).m105019f(C17367hp.m132321e(act()));
        ((c3f0) this.viewModel).act().m50458m2();
        yij0.m214941S(((c3f0) this.viewModel).act());
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m100091u0(e30 e30Var, SignInData signInData, Throwable th, Throwable th2) {
        ((c3f0) this.viewModel).act().progressDismiss();
        if (!(th2 instanceof TantanException.Client.AccountService) || ((TantanException.Client.AccountService) th2).code != 40022) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(th.toString());
            }
            yij0.m214926D(th2);
            return;
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call("newDevice");
        }
        if (!TEnum.equals(signInData.grantType, "email") || TextUtils.isEmpty(signInData.password)) {
            V v2 = this.viewModel;
            ((c3f0) v2).m105019f(VerifyDeviceIntroAct.m28394V1(((c3f0) v2).act(), signInData));
        } else {
            V v3 = this.viewModel;
            ((c3f0) v3).m105019f(EmailVerifyDeviceIntroAct.m28384V1(((c3f0) v3).act(), signInData));
        }
        yij0.m214941S(act());
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m100092x0(final SignInData signInData, Runnable runnable, final e30 e30Var, final Throwable th) {
        ((c3f0) this.viewModel).act().progress(R$string.f16227j0);
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        AccountModule.f16037c.m28349o2(signInData, true, runnable).subscribe(mkd0.m154959K(new e30() { // from class: l.q2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152260a.m100093y0(signInData, (roj0) obj);
            }
        }, new e30() { // from class: l.r2f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157406a.m100091u0(e30Var, signInData, th, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m100093y0(SignInData signInData, roj0 roj0Var) {
        tan.m187742c();
        m100088r0();
        HashMap map = new HashMap();
        if (TEnum.equals(signInData.grantType, "email")) {
            map.put("Method used", "email");
        } else {
            map.put("Method used", "Phone");
        }
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ Boolean m100094z0(C4319c c4319c) {
        return Boolean.valueOf(this.f73210b && c4319c == C4319c.f15548i);
    }

    @Override // p149l.q0m
    public void destroy() {
    }

    @CallSuper
    /* JADX INFO: renamed from: t0 */
    public void m100090t0(Intent intent) {
    }
}
