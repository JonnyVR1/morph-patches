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
public class z5f0 extends b3f0<saf0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f201796e;

    /* JADX INFO: renamed from: f */
    public boolean f201797f;

    /* JADX INFO: renamed from: g */
    public d30 f201798g;

    /* JADX INFO: renamed from: l.z5f0$a */
    public class C21637a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f201799a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f201800b;

        public C21637a(kef0 kef0Var, boolean z) {
            this.f201799a = kef0Var;
            this.f201800b = z;
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
            this.f201799a.m145779h(VerifyReason.signup);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            if (this.f201800b) {
                ((saf0) z5f0.this.viewModel).m183008O1(z5f0.this.f201796e);
            }
            this.f201799a.m145780i(VerifyReason.signup, z);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
            this.f201799a.m145781j(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.z5f0$b */
    public class C21638b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f201802a;

        public C21638b(kef0 kef0Var) {
            this.f201802a = kef0Var;
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
            this.f201802a.m145773b(VerifyReason.signup);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            this.f201802a.m145774c(VerifyReason.signup);
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
            this.f201802a.m145775d(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.z5f0$c */
    public class C21639c implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f201804a;

        public C21639c(kef0 kef0Var) {
            this.f201804a = kef0Var;
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
            this.f201804a.m145776e(VerifyReason.signup);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            this.f201804a.m145777f(VerifyReason.signup);
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
            this.f201804a.m145778g(VerifyReason.signup);
        }
    }

    public z5f0(mcr mcrVar) {
        super(mcrVar);
        this.f201797f = false;
        this.f201798g = new d30() { // from class: l.o5f0
            @Override // p149l.d30
            public final void call() {
                this.f141896a.m217312q1();
            }
        };
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m217300R0(Boolean bool) {
        C22392a<Boolean> c22392aMo28162Xg = AccountModule.m28131F().mo28162Xg();
        lsi0.m151595y("已识别好友邀请码");
        c22392aMo28162Xg.m132487l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Boolean m217306Y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m217311o1(Bundle bundle) {
        m217326m1();
        m217333v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m217312q1() {
        this.f201797f = true;
        AccountModule.f16037c.m28336h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((saf0) this.viewModel).act()));
        if (AccountModule.f16037c.m28325c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            act().duringCreated((C22306c) ChinaMobileController.m29593b().m29600h(5000), false).subscribe(mkd0.m154955G(new e30() { // from class: l.t5f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167824a.m217328p1((MobileRespInfo) obj);
                }
            }));
        } else {
            m217315C1(null);
        }
    }

    /* JADX INFO: renamed from: z1 */
    private void m217313z1() {
        ((saf0) this.viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m28132H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((saf0) this.viewModel).act().startActivity(newMainAct);
        ((saf0) this.viewModel).act().m66873d2();
        yij0.m214941S(((saf0) this.viewModel).act());
    }

    /* JADX INFO: renamed from: B1 */
    public void m217314B1() {
        if (this.f201797f) {
            return;
        }
        act().progress("请稍等...");
        this.f201798g.call();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m217315C1(SignInGrantType signInGrantType) {
        final SignUpData signUpDataM28325c1 = AccountModule.f16037c.m28325c1();
        signUpDataM28325c1.signUpType = AccountTempApi.SignUpType.media;
        act().duringCreated(eje.m116828s(signUpDataM28325c1, new Runnable() { // from class: l.u5f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f174704a.m217330s1();
            }
        }, true, false, signInGrantType)).subscribe(mkd0.m154956H(new e30() { // from class: l.v5f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180038a.m217331t1(signUpDataM28325c1, (roj0) obj);
            }
        }, new e30() { // from class: l.w5f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184675a.m217332u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public final void m217316D1() {
        if (AccountModule.f16037c.m28325c1().phoneNumber == null) {
            CrashHelper.m81296c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((saf0) this.viewModel).act().startActivity(PhoneNumberLoginOptAct.m28679Y1(act()));
    }

    /* JADX INFO: renamed from: E1 */
    public void m217317E1(Gender gender) {
        this.f201796e.gender = gender;
        AccountModule.f16037c.m28332f2(gender);
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.q5f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152761a.m217311o1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public final void m217318e1() {
        m217313z1();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m217319f1() {
        if (lifecycle_() == C4319c.f15548i) {
            m217316D1();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m217320g1(boolean z, boolean z2) {
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
        d30 d30Var = new d30() { // from class: l.p5f0
            @Override // p149l.d30
            public final void call() {
                this.f147296a.m217327n1();
            }
        };
        C21637a c21637a = new C21637a(kef0Var, z);
        C21638b c21638b = new C21638b(kef0Var);
        C21639c c21639c = new C21639c(kef0Var);
        if (zqx.m219898k()) {
            new zqx().m219899d(act(), null, d30Var, null, c21639c, c21638b, c21637a);
        } else {
            c13128aM79882c.m79897o(d30Var).m79898p(c21637a).m79902t(c21638b).m79904v(c21639c).m79891i(((saf0) this.viewModel).act());
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m217321h1() {
        ((saf0) this.viewModel).m183005M1(this.f201796e);
    }

    /* JADX INFO: renamed from: i1 */
    public void m217322i1(SignUpData signUpData) {
        this.f201796e = signUpData;
        AccountModule.f16037c.m28337i2(signUpData);
    }

    /* JADX INFO: renamed from: j1 */
    public void m217323j1() {
        ((saf0) this.viewModel).m183012Q1();
    }

    /* JADX INFO: renamed from: k1 */
    public void m217324k1() {
        ((saf0) this.viewModel).m183014R1(this.f201796e);
    }

    /* JADX INFO: renamed from: l1 */
    public void m217325l1() {
        ((saf0) this.viewModel).m183018T1(this.f201796e);
        duringCreated(AccountModule.m28131F().mo28162Xg()).filter(new w9j() { // from class: l.x5f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z5f0.m217306Y0((Boolean) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.y5f0
            @Override // p149l.e30
            public final void call(Object obj) {
                z5f0.m217300R0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m217326m1() {
        int iM132317a = C17367hp.m132317a();
        if (iM132317a > 0) {
            ((saf0) this.viewModel).m183031c2(iM132317a + 1);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m217327n1() {
        ((saf0) this.viewModel).act().startActivityForResult(MediaPickerAct.m78919X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropWidth(t100.f167226A).withImageCropProportion(1.0f).build()).withFromType(3).build()), 66);
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m217328p1(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f16037c.m28343l2(mobileRespInfo.token, mobileRespInfo.openId);
            m217315C1(mobileRespInfo.grantType);
        } else {
            this.f201797f = false;
            ((saf0) this.viewModel).act().progressDismiss();
            lsi0.m151565C(R$string.f16137T);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m217329r1(List list, SignupStage signupStage, roj0 roj0Var) {
        m217334x1(list, signupStage);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m217330s1() {
        ((saf0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m217331t1(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m174815e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m174815e1("signup_female_hp", new Object[0]);
        }
        m217318e1();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m217332u1(Throwable th) {
        this.f201797f = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((saf0) this.viewModel).act().progressDismiss();
            m217319f1();
        } else {
            ((saf0) this.viewModel).act().progressDismiss();
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m217333v1() {
        StepSignupStage stepSignupStageM132324h = C17367hp.m132324h();
        if (stepSignupStageM132324h == null) {
            ((saf0) this.viewModel).act().hideInput();
            final SignupStage signupStage = SignupStage.get(eje.m116824h().f91713a.get());
            final ArrayList arrayListM200303Q = vwb.m200303Q(eje.m116824h().f91714b.get(), new r5f0());
            if (!NullChecker.m81305c(signupStage, SchemeKey.account, CrashHelper.ReportLevel.p9) || !TEnum.equals(signupStage, "finished")) {
                m217334x1(arrayListM200303Q, signupStage);
                return;
            }
            if (qib0.f154728q0.m221515e() == null) {
                qib0.f154728q0.m132487l(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            qib0.f154721j0.f174912f.take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.s5f0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162547a.m217329r1(arrayListM200303Q, signupStage, (roj0) obj);
                }
            }));
        }
        String string = stepSignupStageM132324h.toString();
        string.getClass();
        switch (string) {
            case "name-saved":
                m217325l1();
                break;
            case "gender-saved":
                m217323j1();
                break;
            case "picture-saved":
                m217324k1();
                break;
            case "birth-saved":
                m217321h1();
                break;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m217334x1(List<StepSignupStage> list, SignupStage signupStage) {
        act().startActivity(C17367hp.m132323g(act(), list, signupStage));
        act().m66873d2();
    }
}
