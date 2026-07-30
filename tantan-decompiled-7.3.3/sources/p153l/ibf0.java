package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CallSuper;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.account.EmailVerifyDeviceIntroAct;
import com.p051p1.mobile.putong.account.p055ui.account.VerifyDeviceIntroAct;
import com.p051p1.mobile.putong.account.p055ui.accountai.new2021.view.NameView;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p137rx.C22421c;
import p153l.jbf0;

/* JADX INFO: loaded from: classes9.dex */
public class ibf0<T extends jbf0> extends ar2<T> {

    /* JADX INFO: renamed from: a */
    public int f114209a;

    /* JADX INFO: renamed from: b */
    public boolean f114210b;

    /* JADX INFO: renamed from: c */
    public long f114211c;

    /* JADX INFO: renamed from: d */
    public long f114212d;

    /* JADX INFO: renamed from: l.ibf0$a */
    public class DialogInterfaceOnDismissListenerC17692a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f114213a;

        public DialogInterfaceOnDismissListenerC17692a(l4g0 l4g0Var) {
            this.f114213a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f114213a);
        }
    }

    public ibf0(ner nerVar) {
        super(nerVar);
        this.f114211c = 604800L;
        this.f114212d = 864000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m139305A0(C4470c c4470c) {
        m139332s0();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m139314m0(SignInData signInData) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
        HashMap map = new HashMap();
        if (TEnum.equals(signInData.grantType, "email")) {
            map.put("Method used", "email");
        } else {
            map.put("Method used", "Phone");
        }
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m139318C0(uxj0 uxj0Var) {
        ((jbf0) this.viewModel).act().progressDismiss();
        ((jbf0) this.viewModel).act().hideInput();
        act().startActivity(C16330cp.m111719e(((jbf0) this.viewModel).f119872a));
        act().m51642n2();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m139319D0(y20 y20Var, Throwable th) {
        ((jbf0) this.viewModel).act().progressDismiss();
        if ((th instanceof ApiExcep.Client.NotFound) || (th instanceof ApiExcep.Client.Unauthorized) || ((th instanceof App.HandledGlobally) && (((App.HandledGlobally) th).getThrowable() instanceof ApiExcep.Client.Unauthorized))) {
            ike.m140276h().m140286m();
            ((jbf0) this.viewModel).act().startActivity(SplashProxyAct.m81288l(((jbf0) this.viewModel).act()));
        } else {
            bsj0.m106246D(th);
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(th);
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m139320E0() {
        ((jbf0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m139321F0(SignInData signInData, x20 x20Var, uxj0 uxj0Var) {
        if (TEnum.equals(signInData.grantType, SignInGrantType.password) && !TextUtils.isEmpty(signInData.password)) {
            qsf0.m177799d().m177801e().onNext(new Pair<>(signInData.username, signInData.password));
        }
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        m139331r0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m139322G0(y20 y20Var, SignInData signInData, Runnable runnable, boolean z, Throwable th) {
        TantanException.Client.AccountService accountService;
        int i;
        ((jbf0) this.viewModel).act().progressDismiss();
        boolean z2 = th instanceof TantanException.Client.AccountService;
        if (z2 && ((i = (accountService = (TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call("inActivated");
            }
            m139330q0(accountService.code == 40020, signInData, runnable, y20Var, th);
        } else if (z2 && ((TantanException.Client.AccountService) th).code == 40022) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call("newDevice");
            }
            ((jbf0) this.viewModel).act().hideInput();
            if (TEnum.equals(signInData.grantType, SignInGrantType.password) && !TextUtils.isEmpty(signInData.password)) {
                qsf0.m177799d().m177801e().onNext(new Pair<>(signInData.username, signInData.password));
            }
            if (!TEnum.equals(signInData.grantType, "email") || TextUtils.isEmpty(signInData.password)) {
                V v2 = this.viewModel;
                ((jbf0) v2).m144221f(VerifyDeviceIntroAct.m29393X1(((jbf0) v2).act(), signInData));
            } else {
                V v3 = this.viewModel;
                ((jbf0) v3).m144221f(EmailVerifyDeviceIntroAct.m29383X1(((jbf0) v3).act(), signInData));
            }
            bsj0.m106261S(((jbf0) this.viewModel).act());
        } else if (z2 && ((TantanException.Client.AccountService) th).code == 403001) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call("suspicious");
            }
        } else if (!ive0.m142292f() || Build.VERSION.SDK_INT < 27) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(th.toString());
            }
            if (NullChecker.m82486a(signInData.code) && signInData.code.intValue() == 86 && z2) {
                if (((TantanException.Client.AccountService) th).code != 40000) {
                    o1j0.m165637k(act().getString(R$string.f16970n0), true);
                } else {
                    bsj0.m106249G(th);
                }
            } else if (this instanceof sve) {
                ((sve) this).m188192w2(th);
            } else if (z) {
                bsj0.m106246D(th);
            } else if (z2) {
                int i2 = ((TantanException.Client.AccountService) th).code;
                ((jbf0) this.viewModel).m144218c(bsj0.m106276l(i2), i2);
            }
        } else {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call("");
            }
            if (NullChecker.m82486a(signInData.code) && signInData.code.intValue() == 86) {
                ((jbf0) this.viewModel).mo107593i(act().getString(R$string.f16970n0));
            } else {
                ((jbf0) this.viewModel).mo107593i(gsj0.m132060d(th));
            }
        }
        if (z2 && ((TantanException.Client.AccountService) th).code == 40012) {
            i4g0.m138526x("e_password_verifypage_wrong_tips", "p_sign_in_password_view");
        }
    }

    /* JADX INFO: renamed from: H0 */
    public void m139323H0(AccountTempApi.SignUpType signUpType, x20 x20Var, final y20<Throwable> y20Var) {
        ((jbf0) this.viewModel).act().progress(R$string.f16946j0, true);
        duringCreated((C22421c<T>) AccountModule.f16756c.m29294L0(signUpType)).subscribe(psd0.m173597H(new y20() { // from class: l.ebf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92922a.m139318C0((uxj0) obj);
            }
        }, new y20() { // from class: l.fbf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98094a.m139319D0(y20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I0 */
    public void m139324I0(SignInData signInData) {
        m139325J0(signInData, null, null);
    }

    /* JADX INFO: renamed from: J0 */
    public void m139325J0(SignInData signInData, x20 x20Var, y20<String> y20Var) {
        m139326L0(signInData, x20Var, y20Var, true);
    }

    /* JADX INFO: renamed from: L0 */
    public void m139326L0(SignInData signInData, x20 x20Var, y20<String> y20Var, boolean z) {
        m139327N0(signInData, x20Var, y20Var, z, true);
    }

    /* JADX INFO: renamed from: N0 */
    public void m139327N0(final SignInData signInData, final x20 x20Var, final y20<String> y20Var, boolean z, final boolean z2) {
        if (z) {
            ((jbf0) this.viewModel).act().progress(R$string.f16946j0, true);
        }
        final Runnable runnable = new Runnable() { // from class: l.bbf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75944a.m139320E0();
            }
        };
        AccountModule.f16756c.m29348o2(signInData, false, runnable).subscribe(psd0.m173600K(new y20() { // from class: l.cbf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80813a.m139321F0(signInData, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.dbf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87662a.m139322G0(y20Var, signInData, runnable, z2, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: O0 */
    public void m139328O0() {
        AccountModule.f16756c.m29330f1().subscribe(psd0.m173596G(new y20() { // from class: l.abf0
            @Override // p153l.y20
            public final void call(Object obj) {
                ike.m140276h().m140289p((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P0 */
    public void m139329P0(DetectRequest detectRequest, NameView nameView, AccountTempApi.SignUpType signUpType, x20 x20Var, y20<Throwable> y20Var) {
        m139323H0(signUpType, x20Var, y20Var);
    }

    @Override // p153l.ar2
    @CallSuper
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        if (hve0.m137321w()) {
            lifecycle().filter(new qcj() { // from class: l.waf0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f188119a.m139337z0((C4470c) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.zaf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203559a.m139305A0((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m139330q0(boolean z, final SignInData signInData, final Runnable runnable, final y20<String> y20Var, final Throwable th) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        ((jbf0) this.viewModel).act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.gbf0
            @Override // java.lang.Runnable
            public final void run() {
                this.f103464a.m139335x0(signInData, runnable, y20Var, th);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.hbf0
            @Override // java.lang.Runnable
            public final void run() {
                ibf0.m139314m0(signInData);
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC17692a(l4g0VarM204399c)).m21567z0();
    }

    /* JADX INFO: renamed from: r0 */
    public void m139331r0() {
        if (!hve0.m137321w() || lifecycle_() == C4470c.f16267i) {
            m139332s0();
        } else {
            this.f114210b = true;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m139332s0() {
        ((jbf0) this.viewModel).act().progressDismiss();
        ((jbf0) this.viewModel).act().hideInput();
        ((jbf0) this.viewModel).m144221f(C16330cp.m111719e(act()));
        ((jbf0) this.viewModel).act().m51642n2();
        bsj0.m106261S(((jbf0) this.viewModel).act());
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m139334u0(y20 y20Var, SignInData signInData, Throwable th, Throwable th2) {
        ((jbf0) this.viewModel).act().progressDismiss();
        if (!(th2 instanceof TantanException.Client.AccountService) || ((TantanException.Client.AccountService) th2).code != 40022) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(th.toString());
            }
            bsj0.m106246D(th2);
            return;
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call("newDevice");
        }
        if (!TEnum.equals(signInData.grantType, "email") || TextUtils.isEmpty(signInData.password)) {
            V v2 = this.viewModel;
            ((jbf0) v2).m144221f(VerifyDeviceIntroAct.m29393X1(((jbf0) v2).act(), signInData));
        } else {
            V v3 = this.viewModel;
            ((jbf0) v3).m144221f(EmailVerifyDeviceIntroAct.m29383X1(((jbf0) v3).act(), signInData));
        }
        bsj0.m106261S(act());
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m139335x0(final SignInData signInData, Runnable runnable, final y20 y20Var, final Throwable th) {
        ((jbf0) this.viewModel).act().progress(R$string.f16946j0);
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        AccountModule.f16756c.m29348o2(signInData, true, runnable).subscribe(psd0.m173600K(new y20() { // from class: l.xaf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193027a.m139336y0(signInData, (uxj0) obj);
            }
        }, new y20() { // from class: l.yaf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198179a.m139334u0(y20Var, signInData, th, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m139336y0(SignInData signInData, uxj0 uxj0Var) {
        tcn.m190486c();
        m139331r0();
        HashMap map = new HashMap();
        if (TEnum.equals(signInData.grantType, "email")) {
            map.put("Method used", "email");
        } else {
            map.put("Method used", "Phone");
        }
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ Boolean m139337z0(C4470c c4470c) {
        return Boolean.valueOf(this.f114210b && c4470c == C4470c.f16267i);
    }

    @Override // p153l.k3m
    public void destroy() {
    }

    @CallSuper
    /* JADX INFO: renamed from: t0 */
    public void m139333t0(Intent intent) {
    }
}
