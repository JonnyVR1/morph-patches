package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p149l.c3f0;

/* JADX INFO: loaded from: classes9.dex */
public class jye0<T extends c3f0> extends b3f0<T> {

    /* JADX INFO: renamed from: e */
    public String f120301e;

    /* JADX INFO: renamed from: l.jye0$a */
    public class DialogInterfaceOnDismissListenerC17892a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ cwf0 f120302a;

        public DialogInterfaceOnDismissListenerC17892a(cwf0 cwf0Var) {
            this.f120302a = cwf0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            i0e.m133796e(this.f120302a);
        }
    }

    public jye0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m143847V0() {
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m143848W0() {
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ C22306c m143850Y0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16037c.m28349o2(signInData, true, new Runnable() { // from class: l.zxe0
            @Override // java.lang.Runnable
            public final void run() {
                jye0.m143847V0();
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ C22306c m143853c1(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16037c.m28349o2(signInData, false, new Runnable() { // from class: l.gye0
            @Override // java.lang.Runnable
            public final void run() {
                jye0.m143848W0();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public void mo143857g1(boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m143858h1(SignInData signInData, Runnable runnable) {
        zvf0.m220396r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m143866p1(signInData, runnable);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m143859i1(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((c3f0) this.viewModel).act().progressDismiss();
            lsi0.m151582l(((c3f0) this.viewModel).f78941a.getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m143860j1(roj0 roj0Var) {
        m143868r1();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f120301e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m143861k1(Runnable runnable, Throwable th) {
        ((c3f0) this.viewModel).act().progressDismiss();
        lsi0.m151582l(((c3f0) this.viewModel).f78941a.getResources().getString(R$string.f16075G2), false, true);
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m143862l1(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            mo143857g1(true);
            ((c3f0) this.viewModel).act().progressDismiss();
            lsi0.m151582l(((c3f0) this.viewModel).f78941a.getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m143863m1(roj0 roj0Var) {
        AccountModule.f16037c.m28345m2(AccountTempApi.SignUpType.cosmos);
        m143868r1();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f120301e);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m143864n1(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        mo143857g1(true);
        ((c3f0) this.viewModel).act().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m143865o1(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            lsi0.m151582l(((c3f0) this.viewModel).f78941a.getResources().getString(R$string.f16075G2), false, true);
            if (NullChecker.m81303a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        SignUpData signUpData = new SignUpData();
        if (TEnum.equals(signInData.grantType, SignInGrantType.cosmos)) {
            signUpData.signUpType = AccountTempApi.SignUpType.cosmos;
        }
        AccountModule.f16037c.m28337i2(signUpData);
        AccountModule.f16037c.m28325c1().phoneNumber = this.f120301e;
        ((c3f0) this.viewModel).act().startActivity(SignUpDetailsNewAct.m28497a2(((c3f0) this.viewModel).act(), signUpData));
        ((c3f0) this.viewModel).act().progressDismiss();
        ((c3f0) this.viewModel).act().m66873d2();
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f120301e);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m143865o1(boolean z, final SignInData signInData, final Runnable runnable) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        ((c3f0) this.viewModel).act().dialog().m20503E0(z ? R$string.f16150V2 : R$string.f16140T2).m20500D(z ? R$string.f16155W2 : R$string.f16145U2).m20556t0(R$string.f16312z, new Runnable() { // from class: l.eye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f93742a.m143858h1(signInData, runnable);
            }
        }).m20542l0(R$string.f16178b, new Runnable() { // from class: l.fye0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).m20526V(new DialogInterfaceOnDismissListenerC17892a(cwf0VarM133794c)).m20568z0();
    }

    /* JADX INFO: renamed from: p1 */
    public void m143866p1(final SignInData signInData, final Runnable runnable) {
        ((c3f0) this.viewModel).act().progress(R$string.f16227j0, true);
        ((c3f0) this.viewModel).act().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.hye0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110104a.m143859i1(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.iye0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.wxe0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jye0.m143850Y0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.m154956H(new e30() { // from class: l.xxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194860a.m143860j1((roj0) obj);
            }
        }, new e30() { // from class: l.yxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200595a.m143861k1(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public void m143867q1(final SignInData signInData, final Runnable runnable) {
        ((c3f0) this.viewModel).act().progress(R$string.f16227j0, true);
        ((c3f0) this.viewModel).act().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000).doOnNext(new e30() { // from class: l.vxe0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183444a.m143862l1(runnable, (MobileRespInfo) obj);
            }
        }).filter(new w9j() { // from class: l.aye0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new w9j() { // from class: l.bye0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return jye0.m143853c1(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(mkd0.m154959K(new e30() { // from class: l.cye0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82981a.m143863m1((roj0) obj);
            }
        }, new e30() { // from class: l.dye0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88382a.m143864n1(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r1 */
    public void m143868r1() {
        SignupStage signupStage = AccountModule.f16037c.m28312V0().mo108248b().signupStage;
        Intent intentM132322f = !TEnum.equals(signupStage, "unknown_") ? C17367hp.m132322f(act(), signupStage.toString()) : AccountModule.m28132H().toNewMainAct(act(), false, true);
        ((c3f0) this.viewModel).act().progressDismiss();
        ((c3f0) this.viewModel).act().startActivity(intentM132322f);
        ((c3f0) this.viewModel).act().m66873d2();
    }
}
