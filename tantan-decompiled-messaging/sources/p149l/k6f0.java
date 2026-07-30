package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.appsflyer.AppsFlyerLib;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.MobileRespInfo;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.StepSignupStage;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class k6f0 extends b3f0<f8f0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f121455e;

    /* JADX INFO: renamed from: f */
    public boolean f121456f;

    /* JADX INFO: renamed from: g */
    public d30 f121457g;

    /* JADX INFO: renamed from: l.k6f0$a */
    public class C17933a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f121458a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f121459b;

        public C17933a(kef0 kef0Var, boolean z) {
            this.f121458a = kef0Var;
            this.f121459b = z;
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
            this.f121458a.m145779h(VerifyReason.signup);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            if (this.f121459b) {
                ((f8f0) k6f0.this.viewModel).m120007q1();
            }
            this.f121458a.m145780i(VerifyReason.signup, z);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
            this.f121458a.m145781j(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.k6f0$b */
    public class C17934b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f121461a;

        public C17934b(kef0 kef0Var) {
            this.f121461a = kef0Var;
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
            this.f121461a.m145773b(VerifyReason.signup);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            this.f121461a.m145774c(VerifyReason.signup);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
            this.f121461a.m145775d(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.k6f0$c */
    public class C17935c implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f121463a;

        public C17935c(kef0 kef0Var) {
            this.f121463a = kef0Var;
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
            this.f121463a.m145776e(VerifyReason.signup);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            this.f121463a.m145777f(VerifyReason.signup);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
            this.f121463a.m145778g(VerifyReason.signup);
        }
    }

    public k6f0(mcr mcrVar) {
        super(mcrVar);
        this.f121456f = false;
        this.f121457g = new d30() { // from class: l.a6f0
            @Override // p149l.d30
            public final void call() {
                this.f67757a.m144606p1();
            }
        };
    }

    /* JADX INFO: renamed from: C1 */
    private void m144587C1(SignInGrantType signInGrantType) {
        final SignUpData signUpDataM28325c1 = AccountModule.f16037c.m28325c1();
        signUpDataM28325c1.signUpType = AccountTempApi.SignUpType.media;
        act().duringCreated(eje.m116828s(signUpDataM28325c1, new Runnable() { // from class: l.g6f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101261a.m144608r1();
            }
        }, true, false, signInGrantType)).subscribe(mkd0.m154956H(new e30() { // from class: l.h6f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106053a.m144609s1(signUpDataM28325c1, (roj0) obj);
            }
        }, new e30() { // from class: l.i6f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111737a.m144610t1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    private void m144588D1() {
        if (AccountModule.f16037c.m28325c1().phoneNumber == null) {
            CrashHelper.m81296c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((f8f0) this.viewModel).act().startActivity(PhoneNumberLoginOptAct.m28679Y1(act()));
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Boolean m144597a1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m144598b1(Boolean bool) {
        C22392a<Boolean> c22392aMo28162Xg = AccountModule.m28131F().mo28162Xg();
        lsi0.m151595y("已识别好友邀请码");
        c22392aMo28162Xg.m132487l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d1 */
    private void m144600d1() {
        m144612z1();
    }

    /* JADX INFO: renamed from: e1 */
    private void m144601e1() {
        if (lifecycle_() == C4319c.f15548i) {
            m144588D1();
        }
    }

    /* JADX INFO: renamed from: l1 */
    private void m144602l1() {
        int iM132317a = C17367hp.m132317a();
        if (iM132317a > 0) {
            ((f8f0) this.viewModel).m119963E1(iM132317a + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m144603m1() {
        ((f8f0) this.viewModel).act().startActivityForResult(MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropWidth(t100.f167226A).withImageCropProportion(1.0f).build()).withFromType(3).build()), 66);
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m144604n1(Bundle bundle) {
        m144602l1();
        m144622v1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m144605o1(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f16037c.m28343l2(mobileRespInfo.token, mobileRespInfo.openId);
            m144587C1(mobileRespInfo.grantType);
        } else {
            this.f121456f = false;
            ((f8f0) this.viewModel).act().progressDismiss();
            lsi0.m151565C(R$string.f16137T);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m144606p1() {
        this.f121456f = true;
        AccountModule.f16037c.m28336h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((f8f0) this.viewModel).act()));
        if (AccountModule.f16037c.m28325c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            act().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000), false).subscribe(mkd0.m154955G(new e30() { // from class: l.c6f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79541a.m144605o1((MobileRespInfo) obj);
                }
            }));
        } else {
            m144587C1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m144607q1(List list, SignupStage signupStage, roj0 roj0Var) {
        m144611x1(list, signupStage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m144608r1() {
        ((f8f0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m144609s1(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m174815e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m174815e1("signup_female_hp", new Object[0]);
        }
        m144600d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m144610t1(Throwable th) {
        this.f121456f = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((f8f0) this.viewModel).act().progressDismiss();
            m144601e1();
        } else {
            ((f8f0) this.viewModel).act().progressDismiss();
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m144611x1(List<StepSignupStage> list, SignupStage signupStage) {
        act().startActivity(C17367hp.m132323g(act(), list, signupStage));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: z1 */
    private void m144612z1() {
        ((f8f0) this.viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m28132H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((f8f0) this.viewModel).act().startActivity(newMainAct);
        ((f8f0) this.viewModel).act().m66873d2();
        yij0.m214941S(((f8f0) this.viewModel).act());
    }

    /* JADX INFO: renamed from: B1 */
    public void m144613B1() {
        if (this.f121456f) {
            return;
        }
        act().progress("请稍等...");
        this.f121457g.call();
    }

    /* JADX INFO: renamed from: E1 */
    public void m144614E1(Gender gender) {
        this.f121455e.gender = gender;
        AccountModule.f16037c.m28332f2(gender);
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.b6f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73805a.m144604n1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public void m144615f1(boolean z, boolean z2) {
        kef0 kef0Var = new kef0();
        PermissionHelper.C13128a c13128aM79882c = PermissionHelper.m79882c();
        c13128aM79882c.m79900r("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE");
        c13128aM79882c.m79905w(false);
        c13128aM79882c.m79903u(false);
        if (z2) {
            c13128aM79882c.m79892j(true);
        } else {
            c13128aM79882c.m79892j(false);
        }
        d30 d30Var = new d30() { // from class: l.j6f0
            @Override // p149l.d30
            public final void call() {
                this.f116467a.m144603m1();
            }
        };
        C17933a c17933a = new C17933a(kef0Var, z);
        C17934b c17934b = new C17934b(kef0Var);
        C17935c c17935c = new C17935c(kef0Var);
        if (zqx.m219898k()) {
            new zqx().m219899d(act(), null, d30Var, null, c17935c, c17934b, c17933a);
        } else {
            c13128aM79882c.m79897o(d30Var).m79898p(c17933a).m79902t(c17934b).m79904v(c17935c).m79891i(((f8f0) this.viewModel).act());
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m144616g1(boolean z) {
        ((f8f0) this.viewModel).m120005p1(this.f121455e, z);
    }

    /* JADX INFO: renamed from: h1 */
    public void m144617h1(SignUpData signUpData) {
        this.f121455e = signUpData;
        AccountModule.f16037c.m28337i2(signUpData);
    }

    /* JADX INFO: renamed from: i1 */
    public void m144618i1(boolean z) {
        ((f8f0) this.viewModel).m120010s1(z);
    }

    /* JADX INFO: renamed from: j1 */
    public void m144619j1(boolean z) {
        ((f8f0) this.viewModel).m120012t1(this.f121455e, z);
    }

    /* JADX INFO: renamed from: k1 */
    public void m144620k1(boolean z) {
        ((f8f0) this.viewModel).m120016v1(this.f121455e, z);
        duringCreated(AccountModule.m28131F().mo28162Xg()).filter(new w9j() { // from class: l.e6f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return k6f0.m144597a1((Boolean) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.f6f0
            @Override // p149l.e30
            public final void call(Object obj) {
                k6f0.m144598b1((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public void m144621u1() {
        m144622v1(true);
    }

    /* JADX INFO: renamed from: v1 */
    public void m144622v1(boolean z) {
        StepSignupStage stepSignupStageM132324h = C17367hp.m132324h();
        if (stepSignupStageM132324h == null) {
            ((f8f0) this.viewModel).act().hideInput();
            final SignupStage signupStage = SignupStage.get(eje.m116824h().f91713a.get());
            final ArrayList arrayListM200303Q = vwb.m200303Q(eje.m116824h().f91714b.get(), new r5f0());
            if (!NullChecker.m81305c(signupStage, SchemeKey.account, CrashHelper.ReportLevel.p9) || !TEnum.equals(signupStage, "finished")) {
                m144611x1(arrayListM200303Q, signupStage);
                return;
            }
            if (qib0.f154728q0.m221515e() == null) {
                qib0.f154728q0.m132487l(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            qib0.f154721j0.f174912f.take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.d6f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f84620a.m144607q1(arrayListM200303Q, signupStage, (roj0) obj);
                }
            }));
        }
        String string = stepSignupStageM132324h.toString();
        string.getClass();
        switch (string) {
            case "name-saved":
                m144620k1(z);
                break;
            case "gender-saved":
                m144618i1(z);
                break;
            case "picture-saved":
                m144619j1(z);
                break;
            case "birth-saved":
                m144616g1(z);
                break;
        }
    }
}
