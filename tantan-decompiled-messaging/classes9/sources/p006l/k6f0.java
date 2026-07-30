package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.appsflyer.AppsFlyerLib;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.MobileRespInfo;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.StepSignupStage;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.d30;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.t100;
import l.v4e;
import l.vwb;
import l.w4e;
import l.w9j;
import l.x4e;
import l.yij0;
import l.zqx;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class k6f0 extends b3f0<f8f0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f15626e;

    /* JADX INFO: renamed from: f */
    public boolean f15627f;

    /* JADX INFO: renamed from: g */
    public d30 f15628g;

    /* JADX INFO: renamed from: l.k6f0$a */
    public class C0919a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f15629a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f15630b;

        public C0919a(kef0 kef0Var, boolean z) {
            this.f15629a = kef0Var;
            this.f15630b = z;
        }

        /* JADX INFO: renamed from: a */
        public void m17978a() {
            this.f15629a.m18114h("signup");
        }

        /* JADX INFO: renamed from: b */
        public void m17979b(boolean z) {
            if (this.f15630b) {
                ((f8f0) ((jq2) k6f0.this).viewModel).m15206q1();
            }
            this.f15629a.m18115i("signup", z);
        }

        /* JADX INFO: renamed from: c */
        public void m17980c() {
            this.f15629a.m18116j("signup");
        }
    }

    /* JADX INFO: renamed from: l.k6f0$b */
    public class C0920b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f15632a;

        public C0920b(kef0 kef0Var) {
            this.f15632a = kef0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m17981a() {
            this.f15632a.m18108b("signup");
        }

        /* JADX INFO: renamed from: b */
        public void m17982b() {
            this.f15632a.m18109c("signup");
        }

        /* JADX INFO: renamed from: c */
        public void m17983c() {
            this.f15632a.m18110d("signup");
        }
    }

    /* JADX INFO: renamed from: l.k6f0$c */
    public class C0921c implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f15634a;

        public C0921c(kef0 kef0Var) {
            this.f15634a = kef0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m17984a() {
            this.f15634a.m18111e("signup");
        }

        /* JADX INFO: renamed from: b */
        public void m17985b() {
            this.f15634a.m18112f("signup");
        }

        /* JADX INFO: renamed from: c */
        public void m17986c() {
            this.f15634a.m18113g("signup");
        }
    }

    public k6f0(mcr mcrVar) {
        super(mcrVar);
        this.f15627f = false;
        this.f15628g = new d30() { // from class: l.a6f0
            public final void call() {
                this.f8122a.m17961p1();
            }
        };
    }

    /* JADX INFO: renamed from: C1 */
    private void m17942C1(SignInGrantType signInGrantType) {
        final SignUpData signUpDataM220c1 = AccountModule.f26c.m220c1();
        signUpDataM220c1.signUpType = AccountTempApi.SignUpType.media;
        act().duringCreated(eje.m14578s(signUpDataM220c1, new Runnable() { // from class: l.g6f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13081a.m17963r1();
            }
        }, true, false, signInGrantType)).subscribe(mkd0.H(new e30() { // from class: l.h6f0
            public final void call(Object obj) {
                this.f13718a.m17964s1(signUpDataM220c1, (roj0) obj);
            }
        }, new e30() { // from class: l.i6f0
            public final void call(Object obj) {
                this.f14266a.m17965t1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    private void m17943D1() {
        if (AccountModule.f26c.m220c1().phoneNumber == null) {
            CrashHelper.c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((f8f0) ((jq2) this).viewModel).act().startActivity(PhoneNumberLoginOptAct.m578Y1(act()));
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ Boolean m17952a1(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m17953b1(Boolean bool) {
        a<Boolean> aVarMo57Xg = AccountModule.m26F().mo57Xg();
        lsi0.y("已识别好友邀请码");
        aVarMo57Xg.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d1 */
    private void m17955d1() {
        m17967z1();
    }

    /* JADX INFO: renamed from: e1 */
    private void m17956e1() {
        if (lifecycle_() == c.i) {
            m17943D1();
        }
    }

    /* JADX INFO: renamed from: l1 */
    private void m17957l1() {
        int iM16301a = C0811hp.m16301a();
        if (iM16301a > 0) {
            ((f8f0) ((jq2) this).viewModel).m15162E1(iM16301a + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m17958m1() {
        ((f8f0) ((jq2) this).viewModel).act().startActivityForResult(MediaPickerAct.X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropWidth(t100.A).withImageCropProportion(1.0f).build()).withFromType(3).build()), 66);
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m17959n1(Bundle bundle) {
        m17957l1();
        m17977v1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m17960o1(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f26c.m238l2(mobileRespInfo.token, mobileRespInfo.openId);
            m17942C1(mobileRespInfo.grantType);
        } else {
            this.f15627f = false;
            ((f8f0) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.C(R$string.f126T);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m17961p1() {
        this.f15627f = true;
        AccountModule.f26c.m231h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((f8f0) ((jq2) this).viewModel).act()));
        if (AccountModule.f26c.m220c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            act().duringCreated(ChinaMobileController.m1499b().m1506h(5000), false).subscribe(mkd0.G(new e30() { // from class: l.c6f0
                public final void call(Object obj) {
                    this.f9461a.m17960o1((MobileRespInfo) obj);
                }
            }));
        } else {
            m17942C1(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m17962q1(List list, SignupStage signupStage, roj0 roj0Var) {
        m17966x1(list, signupStage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m17963r1() {
        ((f8f0) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m17964s1(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m22159e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m22159e1("signup_female_hp", new Object[0]);
        }
        m17955d1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t1 */
    public /* synthetic */ void m17965t1(Throwable th) {
        this.f15627f = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((f8f0) ((jq2) this).viewModel).act().progressDismiss();
            m17956e1();
        } else {
            ((f8f0) ((jq2) this).viewModel).act().progressDismiss();
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m17966x1(List<StepSignupStage> list, SignupStage signupStage) {
        act().startActivity(C0811hp.m16307g(act(), list, signupStage));
        act().finish();
    }

    /* JADX INFO: renamed from: z1 */
    private void m17967z1() {
        ((f8f0) ((jq2) this).viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m27H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((f8f0) ((jq2) this).viewModel).act().startActivity(newMainAct);
        ((f8f0) ((jq2) this).viewModel).act().finish();
        yij0.S(((f8f0) ((jq2) this).viewModel).act());
    }

    /* JADX INFO: renamed from: B1 */
    public void m17968B1() {
        if (this.f15627f) {
            return;
        }
        act().progress("请稍等...");
        this.f15628g.call();
    }

    /* JADX INFO: renamed from: E1 */
    public void m17969E1(Gender gender) {
        this.f15626e.gender = gender;
        AccountModule.f26c.m227f2(gender);
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.b6f0
            public final void call(Object obj) {
                this.f8753a.m17959n1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public void m17970f1(boolean z, boolean z2) {
        kef0 kef0Var = new kef0();
        PermissionHelper.a aVarC = PermissionHelper.c();
        aVarC.r(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"});
        aVarC.w(false);
        aVarC.u(false);
        if (z2) {
            aVarC.j(true);
        } else {
            aVarC.j(false);
        }
        d30 d30Var = new d30() { // from class: l.j6f0
            public final void call() {
                this.f15040a.m17958m1();
            }
        };
        C0919a c0919a = new C0919a(kef0Var, z);
        C0920b c0920b = new C0920b(kef0Var);
        C0921c c0921c = new C0921c(kef0Var);
        if (zqx.k()) {
            new zqx().d(act(), (View) null, d30Var, (e30) null, c0921c, c0920b, c0919a);
        } else {
            aVarC.o(d30Var).p(c0919a).t(c0920b).v(c0921c).i(((f8f0) ((jq2) this).viewModel).act());
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m17971g1(boolean z) {
        ((f8f0) ((jq2) this).viewModel).m15204p1(this.f15626e, z);
    }

    /* JADX INFO: renamed from: h1 */
    public void m17972h1(SignUpData signUpData) {
        this.f15626e = signUpData;
        AccountModule.f26c.m232i2(signUpData);
    }

    /* JADX INFO: renamed from: i1 */
    public void m17973i1(boolean z) {
        ((f8f0) ((jq2) this).viewModel).m15209s1(z);
    }

    /* JADX INFO: renamed from: j1 */
    public void m17974j1(boolean z) {
        ((f8f0) ((jq2) this).viewModel).m15211t1(this.f15626e, z);
    }

    /* JADX INFO: renamed from: k1 */
    public void m17975k1(boolean z) {
        ((f8f0) ((jq2) this).viewModel).m15215v1(this.f15626e, z);
        duringCreated(AccountModule.m26F().mo57Xg()).filter(new w9j() { // from class: l.e6f0
            public final Object call(Object obj) {
                return k6f0.m17952a1((Boolean) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.f6f0
            public final void call(Object obj) {
                k6f0.m17953b1((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u1 */
    public void m17976u1() {
        m17977v1(true);
    }

    /* JADX INFO: renamed from: v1 */
    public void m17977v1(boolean z) {
        StepSignupStage stepSignupStageM16308h = C0811hp.m16308h();
        if (stepSignupStageM16308h == null) {
            ((f8f0) ((jq2) this).viewModel).act().hideInput();
            final SignupStage signupStage = SignupStage.get((String) eje.m14574h().f11185a.get());
            final ArrayList arrayListQ = vwb.Q((Collection) eje.m14574h().f11186b.get(), new r5f0());
            if (!NullChecker.c(signupStage, "account", CrashHelper.ReportLevel.p9) || !TEnum.equals(signupStage, "finished")) {
                m17966x1(arrayListQ, signupStage);
                return;
            }
            if (qib0.f19819q0.e() == null) {
                qib0.f19819q0.onNext(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            qib0.f19812j0.f.take(1).subscribe(mkd0.G(new e30() { // from class: l.d6f0
                public final void call(Object obj) {
                    this.f10033a.m17962q1(arrayListQ, signupStage, (roj0) obj);
                }
            }));
        }
        String string = stepSignupStageM16308h.toString();
        string.getClass();
        switch (string) {
            case "name-saved":
                m17975k1(z);
                break;
            case "gender-saved":
                m17973i1(z);
                break;
            case "picture-saved":
                m17974j1(z);
                break;
            case "birth-saved":
                m17971g1(z);
                break;
        }
    }
}
