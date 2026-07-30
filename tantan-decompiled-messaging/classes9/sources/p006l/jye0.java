package p006l;

import android.content.DialogInterface;
import android.content.Intent;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.data.AuthData;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e30;
import l.i0e;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.w9j;
import l.zvf0;
import p006l.c3f0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jye0<T extends c3f0> extends b3f0<T> {

    /* JADX INFO: renamed from: e */
    public String f15493e;

    /* JADX INFO: renamed from: l.jye0$a */
    public class DialogInterfaceOnDismissListenerC0908a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f15494a;

        public DialogInterfaceOnDismissListenerC0908a(cwf0 cwf0Var) {
            this.f15494a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.e(this.f15494a);
        }
    }

    public jye0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m17852V0() {
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m17853W0() {
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ c m17855Y0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f26c.m244o2(signInData, true, new Runnable() { // from class: l.zxe0
            @Override // java.lang.Runnable
            public final void run() {
                jye0.m17852V0();
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ c m17858c1(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f26c.m244o2(signInData, false, new Runnable() { // from class: l.gye0
            @Override // java.lang.Runnable
            public final void run() {
                jye0.m17853W0();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public void mo17862g1(boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m17863h1(SignInData signInData, Runnable runnable) {
        zvf0.r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m17871p1(signInData, runnable);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m17864i1(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.l(((c3f0) ((jq2) this).viewModel).f9323a.getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m17865j1(roj0 roj0Var) {
        m17873r1();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f15493e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m17866k1(Runnable runnable, Throwable th) {
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        lsi0.l(((c3f0) ((jq2) this).viewModel).f9323a.getResources().getString(R$string.f64G2), false, true);
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m17867l1(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            mo17862g1(true);
            ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.l(((c3f0) ((jq2) this).viewModel).f9323a.getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m17868m1(roj0 roj0Var) {
        AccountModule.f26c.m240m2(AccountTempApi.SignUpType.cosmos);
        m17873r1();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f15493e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m17869n1(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        mo17862g1(true);
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m17870o1(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            lsi0.l(((c3f0) ((jq2) this).viewModel).f9323a.getResources().getString(R$string.f64G2), false, true);
            if (NullChecker.a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        SignUpData signUpData = new SignUpData();
        if (TEnum.equals(signInData.grantType, "cosmos")) {
            signUpData.signUpType = AccountTempApi.SignUpType.cosmos;
        }
        AccountModule.f26c.m232i2(signUpData);
        AccountModule.f26c.m220c1().phoneNumber = this.f15493e;
        ((c3f0) ((jq2) this).viewModel).act().startActivity(SignUpDetailsNewAct.m393a2(((c3f0) ((jq2) this).viewModel).act(), signUpData));
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        ((c3f0) ((jq2) this).viewModel).act().finish();
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f15493e);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m17870o1(boolean z, final SignInData signInData, final Runnable runnable) {
        cwf0 cwf0VarC = i0e.c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        ((c3f0) ((jq2) this).viewModel).act().dialog().E0(z ? R$string.f139V2 : R$string.f129T2).D(z ? R$string.f144W2 : R$string.f134U2).t0(R$string.f301z, new Runnable() { // from class: l.eye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11509a.m17863h1(signInData, runnable);
            }
        }).l0(R$string.f167b, new Runnable() { // from class: l.fye0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).V(new DialogInterfaceOnDismissListenerC0908a(cwf0VarC)).z0();
    }

    /* JADX INFO: renamed from: p1 */
    public void m17871p1(final SignInData signInData, final Runnable runnable) {
        ((c3f0) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        ((c3f0) ((jq2) this).viewModel).act().duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.hye0
            public final void call(Object obj) {
                this.f14135a.m17864i1(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.iye0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.wxe0
            public final Object call(Object obj) {
                return jye0.m17855Y0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.H(new e30() { // from class: l.xxe0
            public final void call(Object obj) {
                this.f27776a.m17865j1((roj0) obj);
            }
        }, new e30() { // from class: l.yxe0
            public final void call(Object obj) {
                this.f28474a.m17866k1(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public void m17872q1(final SignInData signInData, final Runnable runnable) {
        ((c3f0) ((jq2) this).viewModel).act().progress(R$string.f216j0, true);
        ((c3f0) ((jq2) this).viewModel).act().duringCreated(ChinaMobileController.m1499b().m1506h(5000).doOnNext(new e30() { // from class: l.vxe0
            public final void call(Object obj) {
                this.f24521a.m17867l1(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.aye0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.bye0
            public final Object call(Object obj) {
                return jye0.m17858c1(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.K(new e30() { // from class: l.cye0
            public final void call(Object obj) {
                this.f9930a.m17868m1((roj0) obj);
            }
        }, new e30() { // from class: l.dye0
            public final void call(Object obj) {
                this.f10652a.m17869n1(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r1 */
    public void m17873r1() {
        SignupStage signupStage = ((AuthData) AccountModule.f26c.m207V0().b()).signupStage;
        Intent intentM16306f = !TEnum.equals(signupStage, "unknown_") ? C0811hp.m16306f(act(), signupStage.toString()) : AccountModule.m27H().toNewMainAct(act(), false, true);
        ((c3f0) ((jq2) this).viewModel).act().progressDismiss();
        ((c3f0) ((jq2) this).viewModel).act().startActivity(intentM16306f);
        ((c3f0) ((jq2) this).viewModel).act().finish();
    }
}
