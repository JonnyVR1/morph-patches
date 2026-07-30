package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.appsflyer.AppsFlyerLib;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.MobileRespInfo;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class ref0 extends ibf0<mgf0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f162635e;

    /* JADX INFO: renamed from: f */
    public boolean f162636f;

    /* JADX INFO: renamed from: g */
    public x20 f162637g;

    /* JADX INFO: renamed from: l.ref0$a */
    public class C19814a implements j6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rmf0 f162638a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f162639b;

        public C19814a(rmf0 rmf0Var, boolean z) {
            this.f162638a = rmf0Var;
            this.f162639b = z;
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
            this.f162638a.m182072h(VerifyReason.signup);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            if (this.f162639b) {
                ((mgf0) ref0.this.viewModel).m158315q1();
            }
            this.f162638a.m182073i(VerifyReason.signup, z);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
            this.f162638a.m182074j(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.ref0$b */
    public class C19815b implements k6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rmf0 f162641a;

        public C19815b(rmf0 rmf0Var) {
            this.f162641a = rmf0Var;
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
            this.f162641a.m182066b(VerifyReason.signup);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            this.f162641a.m182067c(VerifyReason.signup);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
            this.f162641a.m182068d(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.ref0$c */
    public class C19816c implements l6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rmf0 f162643a;

        public C19816c(rmf0 rmf0Var) {
            this.f162643a = rmf0Var;
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
            this.f162643a.m182069e(VerifyReason.signup);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            this.f162643a.m182070f(VerifyReason.signup);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
            this.f162643a.m182071g(VerifyReason.signup);
        }
    }

    public ref0(ner nerVar) {
        super(nerVar);
        this.f162636f = false;
        this.f162637g = new x20() { // from class: l.hef0
            @Override // p153l.x20
            public final void call() {
                this.f109148a.m181006p1();
            }
        };
    }

    /* JADX INFO: renamed from: C1 */
    private void m180987C1(SignInGrantType signInGrantType) {
        final SignUpData signUpDataM29324c1 = AccountModule.f16756c.m29324c1();
        signUpDataM29324c1.signUpType = AccountTempApi.SignUpType.media;
        act().duringCreated(ike.m140280s(signUpDataM29324c1, new Runnable() { // from class: l.nef0
            @Override // java.lang.Runnable
            public final void run() {
                this.f141646a.m181008r1();
            }
        }, true, false, signInGrantType)).subscribe(psd0.m173597H(new y20() { // from class: l.oef0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146988a.m181009s1(signUpDataM29324c1, (uxj0) obj);
            }
        }, new y20() { // from class: l.pef0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152066a.m181010t1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    private void m180988D1() {
        if (AccountModule.f16756c.m29324c1().phoneNumber == null) {
            CrashHelper.m82479c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((mgf0) this.viewModel).act().startActivity(PhoneNumberLoginOptAct.m29678Z1(act()));
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Boolean m180997a1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m180998b1(Boolean bool) {
        C22507a<Boolean> c22507aMo29161Xg = AccountModule.m29130F().mo29161Xg();
        o1j0.m165651y("已识别好友邀请码");
        c22507aMo29161Xg.m137019l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d1 */
    private void m181000d1() {
        m181012z1();
    }

    /* JADX INFO: renamed from: e1 */
    private void m181001e1() {
        if (lifecycle_() == C4470c.f16267i) {
            m180988D1();
        }
    }

    /* JADX INFO: renamed from: l1 */
    private void m181002l1() {
        int iM111715a = C16330cp.m111715a();
        if (iM111715a > 0) {
            ((mgf0) this.viewModel).m158271E1(iM111715a + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m181003m1() {
        ((mgf0) this.viewModel).act().startActivityForResult(MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropWidth(qa00.f156288A).withImageCropProportion(1.0f).build()).withFromType(3).build()), 66);
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m181004n1(Bundle bundle) {
        m181002l1();
        m181022v1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m181005o1(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f16756c.m29342l2(mobileRespInfo.token, mobileRespInfo.openId);
            m180987C1(mobileRespInfo.grantType);
        } else {
            this.f162636f = false;
            ((mgf0) this.viewModel).act().progressDismiss();
            o1j0.m165621C(R$string.f16856T);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m181006p1() {
        this.f162636f = true;
        AccountModule.f16756c.m29335h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((mgf0) this.viewModel).act()));
        if (AccountModule.f16756c.m29324c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            act().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000), false).subscribe(psd0.m173596G(new y20() { // from class: l.jef0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120484a.m181005o1((MobileRespInfo) obj);
                }
            }));
        } else {
            m180987C1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m181007q1(List list, SignupStage signupStage, uxj0 uxj0Var) {
        m181011x1(list, signupStage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m181008r1() {
        ((mgf0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m181009s1(SignUpData signUpData, uxj0 uxj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            uqb0.m197269e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            uqb0.m197269e1("signup_female_hp", new Object[0]);
        }
        m181000d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m181010t1(Throwable th) {
        this.f162636f = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((mgf0) this.viewModel).act().progressDismiss();
            m181001e1();
        } else {
            ((mgf0) this.viewModel).act().progressDismiss();
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m181011x1(List<StepSignupStage> list, SignupStage signupStage) {
        act().startActivity(C16330cp.m111721g(act(), list, signupStage));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: z1 */
    private void m181012z1() {
        ((mgf0) this.viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m29131H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((mgf0) this.viewModel).act().startActivity(newMainAct);
        ((mgf0) this.viewModel).act().m68056e2();
        bsj0.m106261S(((mgf0) this.viewModel).act());
    }

    /* JADX INFO: renamed from: B1 */
    public void m181013B1() {
        if (this.f162636f) {
            return;
        }
        act().progress("请稍等...");
        this.f162637g.call();
    }

    /* JADX INFO: renamed from: E1 */
    public void m181014E1(Gender gender) {
        this.f162635e.gender = gender;
        AccountModule.f16756c.m29331f2(gender);
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ief0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114576a.m181004n1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public void m181015f1(boolean z, boolean z2) {
        rmf0 rmf0Var = new rmf0();
        PermissionHelper.C13291a c13291aM81065c = PermissionHelper.m81065c();
        c13291aM81065c.m81083r("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE");
        c13291aM81065c.m81088w(false);
        c13291aM81065c.m81086u(false);
        if (z2) {
            c13291aM81065c.m81075j(true);
        } else {
            c13291aM81065c.m81075j(false);
        }
        x20 x20Var = new x20() { // from class: l.qef0
            @Override // p153l.x20
            public final void call() {
                this.f157172a.m181003m1();
            }
        };
        C19814a c19814a = new C19814a(rmf0Var, z);
        C19815b c19815b = new C19815b(rmf0Var);
        C19816c c19816c = new C19816c(rmf0Var);
        if (wzx.m208784k()) {
            new wzx().m208785d(act(), null, x20Var, null, c19816c, c19815b, c19814a);
        } else {
            c13291aM81065c.m81080o(x20Var).m81081p(c19814a).m81085t(c19815b).m81087v(c19816c).m81074i(((mgf0) this.viewModel).act());
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m181016g1(boolean z) {
        ((mgf0) this.viewModel).m158313p1(this.f162635e, z);
    }

    /* JADX INFO: renamed from: h1 */
    public void m181017h1(SignUpData signUpData) {
        this.f162635e = signUpData;
        AccountModule.f16756c.m29336i2(signUpData);
    }

    /* JADX INFO: renamed from: i1 */
    public void m181018i1(boolean z) {
        ((mgf0) this.viewModel).m158318s1(z);
    }

    /* JADX INFO: renamed from: j1 */
    public void m181019j1(boolean z) {
        ((mgf0) this.viewModel).m158320t1(this.f162635e, z);
    }

    /* JADX INFO: renamed from: k1 */
    public void m181020k1(boolean z) {
        ((mgf0) this.viewModel).m158324v1(this.f162635e, z);
        duringCreated(AccountModule.m29130F().mo29161Xg()).filter(new qcj() { // from class: l.lef0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ref0.m180997a1((Boolean) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.mef0
            @Override // p153l.y20
            public final void call(Object obj) {
                ref0.m180998b1((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public void m181021u1() {
        m181022v1(true);
    }

    /* JADX INFO: renamed from: v1 */
    public void m181022v1(boolean z) {
        StepSignupStage stepSignupStageM111722h = C16330cp.m111722h();
        if (stepSignupStageM111722h == null) {
            ((mgf0) this.viewModel).act().hideInput();
            final SignupStage signupStage = SignupStage.get(ike.m140276h().f115355a.get());
            final ArrayList arrayListM147486Q = jyb.m147486Q(ike.m140276h().f115356b.get(), new ydf0());
            if (!NullChecker.m82488c(signupStage, SchemeKey.account, CrashHelper.ReportLevel.p9) || !TEnum.equals(signupStage, "finished")) {
                m181011x1(arrayListM147486Q, signupStage);
                return;
            }
            if (uqb0.f180411q0.m222761e() == null) {
                uqb0.f180411q0.m137019l(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            uqb0.f180404j0.f88248f.take(1).subscribe(psd0.m173596G(new y20() { // from class: l.kef0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f126180a.m181007q1(arrayListM147486Q, signupStage, (uxj0) obj);
                }
            }));
        }
        String string = stepSignupStageM111722h.toString();
        string.getClass();
        switch (string) {
            case "name-saved":
                m181020k1(z);
                break;
            case "gender-saved":
                m181018i1(z);
                break;
            case "picture-saved":
                m181019j1(z);
                break;
            case "birth-saved":
                m181016g1(z);
                break;
        }
    }
}
