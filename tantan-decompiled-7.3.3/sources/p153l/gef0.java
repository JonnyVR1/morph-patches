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
public class gef0 extends ibf0<zif0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f103822e;

    /* JADX INFO: renamed from: f */
    public boolean f103823f;

    /* JADX INFO: renamed from: g */
    public x20 f103824g;

    /* JADX INFO: renamed from: l.gef0$a */
    public class C17198a implements j6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rmf0 f103825a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f103826b;

        public C17198a(rmf0 rmf0Var, boolean z) {
            this.f103825a = rmf0Var;
            this.f103826b = z;
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
            this.f103825a.m182072h(VerifyReason.signup);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            if (this.f103826b) {
                ((zif0) gef0.this.viewModel).m219837O1(gef0.this.f103822e);
            }
            this.f103825a.m182073i(VerifyReason.signup, z);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
            this.f103825a.m182074j(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.gef0$b */
    public class C17199b implements k6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rmf0 f103828a;

        public C17199b(rmf0 rmf0Var) {
            this.f103828a = rmf0Var;
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
            this.f103828a.m182066b(VerifyReason.signup);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            this.f103828a.m182067c(VerifyReason.signup);
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
            this.f103828a.m182068d(VerifyReason.signup);
        }
    }

    /* JADX INFO: renamed from: l.gef0$c */
    public class C17200c implements l6e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rmf0 f103830a;

        public C17200c(rmf0 rmf0Var) {
            this.f103830a = rmf0Var;
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
            this.f103830a.m182069e(VerifyReason.signup);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            this.f103830a.m182070f(VerifyReason.signup);
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
            this.f103830a.m182071g(VerifyReason.signup);
        }
    }

    public gef0(ner nerVar) {
        super(nerVar);
        this.f103823f = false;
        this.f103824g = new x20() { // from class: l.vdf0
            @Override // p153l.x20
            public final void call() {
                this.f183591a.m129986q1();
            }
        };
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m129974R0(Boolean bool) {
        C22507a<Boolean> c22507aMo29161Xg = AccountModule.m29130F().mo29161Xg();
        o1j0.m165651y("已识别好友邀请码");
        c22507aMo29161Xg.m137019l(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Boolean m129980Y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m129985o1(Bundle bundle) {
        m130000m1();
        m130007v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m129986q1() {
        this.f103823f = true;
        AccountModule.f16756c.m29335h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((zif0) this.viewModel).act()));
        if (AccountModule.f16756c.m29324c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            act().duringCreated((C22421c) ChinaMobileController.m30591b().m30598h(5000), false).subscribe(psd0.m173596G(new y20() { // from class: l.aef0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f70790a.m130002p1((MobileRespInfo) obj);
                }
            }));
        } else {
            m129989C1(null);
        }
    }

    /* JADX INFO: renamed from: z1 */
    private void m129987z1() {
        ((zif0) this.viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m29131H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((zif0) this.viewModel).act().startActivity(newMainAct);
        ((zif0) this.viewModel).act().m68056e2();
        bsj0.m106261S(((zif0) this.viewModel).act());
    }

    /* JADX INFO: renamed from: B1 */
    public void m129988B1() {
        if (this.f103823f) {
            return;
        }
        act().progress("请稍等...");
        this.f103824g.call();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m129989C1(SignInGrantType signInGrantType) {
        final SignUpData signUpDataM29324c1 = AccountModule.f16756c.m29324c1();
        signUpDataM29324c1.signUpType = AccountTempApi.SignUpType.media;
        act().duringCreated(ike.m140280s(signUpDataM29324c1, new Runnable() { // from class: l.bef0
            @Override // java.lang.Runnable
            public final void run() {
                this.f76373a.m130004s1();
            }
        }, true, false, signInGrantType)).subscribe(psd0.m173597H(new y20() { // from class: l.cef0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81354a.m130005t1(signUpDataM29324c1, (uxj0) obj);
            }
        }, new y20() { // from class: l.def0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88023a.m130006u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public final void m129990D1() {
        if (AccountModule.f16756c.m29324c1().phoneNumber == null) {
            CrashHelper.m82479c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((zif0) this.viewModel).act().startActivity(PhoneNumberLoginOptAct.m29678Z1(act()));
    }

    /* JADX INFO: renamed from: E1 */
    public void m129991E1(Gender gender) {
        this.f103822e.gender = gender;
        AccountModule.f16756c.m29331f2(gender);
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.xdf0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193588a.m129985o1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public final void m129992e1() {
        m129987z1();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m129993f1() {
        if (lifecycle_() == C4470c.f16267i) {
            m129990D1();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m129994g1(boolean z, boolean z2) {
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
        x20 x20Var = new x20() { // from class: l.wdf0
            @Override // p153l.x20
            public final void call() {
                this.f188551a.m130001n1();
            }
        };
        C17198a c17198a = new C17198a(rmf0Var, z);
        C17199b c17199b = new C17199b(rmf0Var);
        C17200c c17200c = new C17200c(rmf0Var);
        if (wzx.m208784k()) {
            new wzx().m208785d(act(), null, x20Var, null, c17200c, c17199b, c17198a);
        } else {
            c13291aM81065c.m81080o(x20Var).m81081p(c17198a).m81085t(c17199b).m81087v(c17200c).m81074i(((zif0) this.viewModel).act());
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m129995h1() {
        ((zif0) this.viewModel).m219834M1(this.f103822e);
    }

    /* JADX INFO: renamed from: i1 */
    public void m129996i1(SignUpData signUpData) {
        this.f103822e = signUpData;
        AccountModule.f16756c.m29336i2(signUpData);
    }

    /* JADX INFO: renamed from: j1 */
    public void m129997j1() {
        ((zif0) this.viewModel).m219841Q1();
    }

    /* JADX INFO: renamed from: k1 */
    public void m129998k1() {
        ((zif0) this.viewModel).m219843R1(this.f103822e);
    }

    /* JADX INFO: renamed from: l1 */
    public void m129999l1() {
        ((zif0) this.viewModel).m219847T1(this.f103822e);
        duringCreated(AccountModule.m29130F().mo29161Xg()).filter(new qcj() { // from class: l.eef0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gef0.m129980Y0((Boolean) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.fef0
            @Override // p153l.y20
            public final void call(Object obj) {
                gef0.m129974R0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m130000m1() {
        int iM111715a = C16330cp.m111715a();
        if (iM111715a > 0) {
            ((zif0) this.viewModel).m219860c2(iM111715a + 1);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m130001n1() {
        ((zif0) this.viewModel).act().startActivityForResult(MediaPickerAct.m80102Y1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropWidth(qa00.f156288A).withImageCropProportion(1.0f).build()).withFromType(3).build()), 66);
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m130002p1(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f16756c.m29342l2(mobileRespInfo.token, mobileRespInfo.openId);
            m129989C1(mobileRespInfo.grantType);
        } else {
            this.f103823f = false;
            ((zif0) this.viewModel).act().progressDismiss();
            o1j0.m165621C(R$string.f16856T);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m130003r1(List list, SignupStage signupStage, uxj0 uxj0Var) {
        m130008x1(list, signupStage);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m130004s1() {
        ((zif0) this.viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m130005t1(SignUpData signUpData, uxj0 uxj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            uqb0.m197269e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            uqb0.m197269e1("signup_female_hp", new Object[0]);
        }
        m129992e1();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m130006u1(Throwable th) {
        this.f103823f = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((zif0) this.viewModel).act().progressDismiss();
            m129993f1();
        } else {
            ((zif0) this.viewModel).act().progressDismiss();
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m130007v1() {
        StepSignupStage stepSignupStageM111722h = C16330cp.m111722h();
        if (stepSignupStageM111722h == null) {
            ((zif0) this.viewModel).act().hideInput();
            final SignupStage signupStage = SignupStage.get(ike.m140276h().f115355a.get());
            final ArrayList arrayListM147486Q = jyb.m147486Q(ike.m140276h().f115356b.get(), new ydf0());
            if (!NullChecker.m82488c(signupStage, SchemeKey.account, CrashHelper.ReportLevel.p9) || !TEnum.equals(signupStage, "finished")) {
                m130008x1(arrayListM147486Q, signupStage);
                return;
            }
            if (uqb0.f180411q0.m222761e() == null) {
                uqb0.f180411q0.m137019l(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            uqb0.f180404j0.f88248f.take(1).subscribe(psd0.m173596G(new y20() { // from class: l.zdf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203874a.m130003r1(arrayListM147486Q, signupStage, (uxj0) obj);
                }
            }));
        }
        String string = stepSignupStageM111722h.toString();
        string.getClass();
        switch (string) {
            case "name-saved":
                m129999l1();
                break;
            case "gender-saved":
                m129997j1();
                break;
            case "picture-saved":
                m129998k1();
                break;
            case "birth-saved":
                m129995h1();
                break;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m130008x1(List<StepSignupStage> list, SignupStage signupStage) {
        act().startActivity(C16330cp.m111721g(act(), list, signupStage));
        act().m68056e2();
    }
}
