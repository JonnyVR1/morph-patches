package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p153l.jbf0;

/* JADX INFO: loaded from: classes9.dex */
public class q6f0<T extends jbf0> extends ibf0<T> {

    /* JADX INFO: renamed from: e */
    public String f155809e;

    /* JADX INFO: renamed from: l.q6f0$a */
    public class DialogInterfaceOnDismissListenerC19531a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l4g0 f155810a;

        public DialogInterfaceOnDismissListenerC19531a(l4g0 l4g0Var) {
            this.f155810a = l4g0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            w1e.m204401e(this.f155810a);
        }
    }

    public q6f0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m175570V0() {
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m175571W0() {
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ C22421c m175573Y0(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16756c.m29348o2(signInData, true, new Runnable() { // from class: l.g6f0
            @Override // java.lang.Runnable
            public final void run() {
                q6f0.m175570V0();
            }
        });
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ C22421c m175576c1(SignInData signInData, MobileRespInfo mobileRespInfo) {
        signInData.grantType = mobileRespInfo.grantType;
        signInData.thirdPartyToken = mobileRespInfo.token;
        signInData.thirdPartyAccessCode = mobileRespInfo.accessCode;
        signInData.thirdPartyId = mobileRespInfo.openId;
        return AccountModule.f16756c.m29348o2(signInData, false, new Runnable() { // from class: l.n6f0
            @Override // java.lang.Runnable
            public final void run() {
                q6f0.m175571W0();
            }
        });
    }

    /* JADX INFO: renamed from: g1 */
    public void mo175580g1(boolean z) {
        throw null;
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m175581h1(SignInData signInData, Runnable runnable) {
        i4g0.m138520r("e_user_delete_account_withdraw_popup_confirm", "p_user_delete_account_withdraw_popup");
        m175589p1(signInData, runnable);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m175582i1(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            ((jbf0) this.viewModel).act().progressDismiss();
            o1j0.m165638l(((jbf0) this.viewModel).f119872a.getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m175583j1(uxj0 uxj0Var) {
        m175591r1();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f155809e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m175584k1(Runnable runnable, Throwable th) {
        ((jbf0) this.viewModel).act().progressDismiss();
        o1j0.m165638l(((jbf0) this.viewModel).f119872a.getResources().getString(R$string.f16794G2), false, true);
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m175585l1(Runnable runnable, MobileRespInfo mobileRespInfo) {
        if (mobileRespInfo.failed) {
            mo175580g1(true);
            ((jbf0) this.viewModel).act().progressDismiss();
            o1j0.m165638l(((jbf0) this.viewModel).f119872a.getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m175586m1(uxj0 uxj0Var) {
        AccountModule.f16756c.m29344m2(AccountTempApi.SignUpType.cosmos);
        m175591r1();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f155809e);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m175587n1(SignInData signInData, Runnable runnable, Throwable th) {
        int i;
        mo175580g1(true);
        ((jbf0) this.viewModel).act().progressDismiss();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((i = ((TantanException.Client.AccountService) th).code) == 40020 || i == 40091)) {
            m175588o1(i == 40020, signInData, runnable);
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 40016) {
            o1j0.m165638l(((jbf0) this.viewModel).f119872a.getResources().getString(R$string.f16794G2), false, true);
            if (NullChecker.m82486a(runnable)) {
                runnable.run();
                return;
            }
            return;
        }
        SignUpData signUpData = new SignUpData();
        if (TEnum.equals(signInData.grantType, SignInGrantType.cosmos)) {
            signUpData.signUpType = AccountTempApi.SignUpType.cosmos;
        }
        AccountModule.f16756c.m29336i2(signUpData);
        AccountModule.f16756c.m29324c1().phoneNumber = this.f155809e;
        ((jbf0) this.viewModel).act().startActivity(SignUpDetailsNewAct.m29496b2(((jbf0) this.viewModel).act(), signUpData));
        ((jbf0) this.viewModel).act().progressDismiss();
        ((jbf0) this.viewModel).act().m68056e2();
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f155809e);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m175588o1(boolean z, final SignInData signInData, final Runnable runnable) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_delete_account_withdraw_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        ((jbf0) this.viewModel).act().dialog().m21502E0(z ? R$string.f16869V2 : R$string.f16859T2).m21499D(z ? R$string.f16874W2 : R$string.f16864U2).m21555t0(R$string.f17031z, new Runnable() { // from class: l.l6f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f130252a.m175581h1(signInData, runnable);
            }
        }).m21541l0(R$string.f16897b, new Runnable() { // from class: l.m6f0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_user_delete_account_withdraw_popup_cancel", "p_user_delete_account_withdraw_popup");
            }
        }).m21525V(new DialogInterfaceOnDismissListenerC19531a(l4g0VarM204399c)).m21567z0();
    }

    /* JADX INFO: renamed from: p1 */
    public void m175589p1(final SignInData signInData, final Runnable runnable) {
        ((jbf0) this.viewModel).act().progress(R$string.f16946j0, true);
        ((jbf0) this.viewModel).act().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.o6f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145162a.m175582i1(runnable, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.p6f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.d6f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q6f0.m175573Y0(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(psd0.m173597H(new y20() { // from class: l.e6f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92273a.m175583j1((uxj0) obj);
            }
        }, new y20() { // from class: l.f6f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97399a.m175584k1(runnable, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q1 */
    public void m175590q1(final SignInData signInData, final Runnable runnable) {
        ((jbf0) this.viewModel).act().progress(R$string.f16946j0, true);
        ((jbf0) this.viewModel).act().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000).doOnNext(new y20() { // from class: l.c6f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79954a.m175585l1(runnable, (MobileRespInfo) obj);
            }
        }).filter(new qcj() { // from class: l.h6f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((MobileRespInfo) obj).failed);
            }
        }).flatMap(new qcj() { // from class: l.i6f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q6f0.m175576c1(signInData, (MobileRespInfo) obj);
            }
        }), false).subscribe(psd0.m173600K(new y20() { // from class: l.j6f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118560a.m175586m1((uxj0) obj);
            }
        }, new y20() { // from class: l.k6f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124172a.m175587n1(signInData, runnable, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r1 */
    public void m175591r1() {
        SignupStage signupStage = AccountModule.f16756c.m29311V0().mo107143b().signupStage;
        Intent intentM111720f = !TEnum.equals(signupStage, "unknown_") ? C16330cp.m111720f(act(), signupStage.toString()) : AccountModule.m29131H().toNewMainAct(act(), false, true);
        ((jbf0) this.viewModel).act().progressDismiss();
        ((jbf0) this.viewModel).act().startActivity(intentM111720f);
        ((jbf0) this.viewModel).act().m68056e2();
    }
}
