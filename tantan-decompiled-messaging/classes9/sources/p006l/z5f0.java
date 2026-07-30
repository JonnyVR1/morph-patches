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
public class z5f0 extends b3f0<saf0> {

    /* JADX INFO: renamed from: e */
    public SignUpData f28638e;

    /* JADX INFO: renamed from: f */
    public boolean f28639f;

    /* JADX INFO: renamed from: g */
    public d30 f28640g;

    /* JADX INFO: renamed from: l.z5f0$a */
    public class C1512a implements v4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f28641a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f28642b;

        public C1512a(kef0 kef0Var, boolean z) {
            this.f28641a = kef0Var;
            this.f28642b = z;
        }

        /* JADX INFO: renamed from: a */
        public void m28606a() {
            this.f28641a.m18114h("signup");
        }

        /* JADX INFO: renamed from: b */
        public void m28607b(boolean z) {
            if (this.f28642b) {
                ((saf0) ((jq2) z5f0.this).viewModel).m23636O1(z5f0.this.f28638e);
            }
            this.f28641a.m18115i("signup", z);
        }

        /* JADX INFO: renamed from: c */
        public void m28608c() {
            this.f28641a.m18116j("signup");
        }
    }

    /* JADX INFO: renamed from: l.z5f0$b */
    public class C1513b implements w4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f28644a;

        public C1513b(kef0 kef0Var) {
            this.f28644a = kef0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m28609a() {
            this.f28644a.m18108b("signup");
        }

        /* JADX INFO: renamed from: b */
        public void m28610b() {
            this.f28644a.m18109c("signup");
        }

        /* JADX INFO: renamed from: c */
        public void m28611c() {
            this.f28644a.m18110d("signup");
        }
    }

    /* JADX INFO: renamed from: l.z5f0$c */
    public class C1514c implements x4e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ kef0 f28646a;

        public C1514c(kef0 kef0Var) {
            this.f28646a = kef0Var;
        }

        /* JADX INFO: renamed from: a */
        public void m28612a() {
            this.f28646a.m18111e("signup");
        }

        /* JADX INFO: renamed from: b */
        public void m28613b() {
            this.f28646a.m18112f("signup");
        }

        /* JADX INFO: renamed from: c */
        public void m28614c() {
            this.f28646a.m18113g("signup");
        }
    }

    public z5f0(mcr mcrVar) {
        super(mcrVar);
        this.f28639f = false;
        this.f28640g = new d30() { // from class: l.o5f0
            public final void call() {
                this.f18025a.m28583q1();
            }
        };
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m28571R0(Boolean bool) {
        a<Boolean> aVarMo57Xg = AccountModule.m26F().mo57Xg();
        lsi0.y("已识别好友邀请码");
        aVarMo57Xg.onNext(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Boolean m28577Y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m28582o1(Bundle bundle) {
        m28597m1();
        m28604v1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m28583q1() {
        this.f28639f = true;
        AccountModule.f26c.m231h2(AppsFlyerLib.getInstance().getAppsFlyerUID(((saf0) ((jq2) this).viewModel).act()));
        if (AccountModule.f26c.m220c1().signUpType == AccountTempApi.SignUpType.cosmos) {
            act().duringCreated(ChinaMobileController.m1499b().m1506h(5000), false).subscribe(mkd0.G(new e30() { // from class: l.t5f0
                public final void call(Object obj) {
                    this.f21894a.m28599p1((MobileRespInfo) obj);
                }
            }));
        } else {
            m28586C1(null);
        }
    }

    /* JADX INFO: renamed from: z1 */
    private void m28584z1() {
        ((saf0) ((jq2) this).viewModel).act().progressDismiss();
        Intent newMainAct = AccountModule.m27H().toNewMainAct(act(), true, false);
        newMainAct.putExtra("from_sign_up", true);
        ((saf0) ((jq2) this).viewModel).act().startActivity(newMainAct);
        ((saf0) ((jq2) this).viewModel).act().finish();
        yij0.S(((saf0) ((jq2) this).viewModel).act());
    }

    /* JADX INFO: renamed from: B1 */
    public void m28585B1() {
        if (this.f28639f) {
            return;
        }
        act().progress("请稍等...");
        this.f28640g.call();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m28586C1(SignInGrantType signInGrantType) {
        final SignUpData signUpDataM220c1 = AccountModule.f26c.m220c1();
        signUpDataM220c1.signUpType = AccountTempApi.SignUpType.media;
        act().duringCreated(eje.m14578s(signUpDataM220c1, new Runnable() { // from class: l.u5f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23372a.m28601s1();
            }
        }, true, false, signInGrantType)).subscribe(mkd0.H(new e30() { // from class: l.v5f0
            public final void call(Object obj) {
                this.f24158a.m28602t1(signUpDataM220c1, (roj0) obj);
            }
        }, new e30() { // from class: l.w5f0
            public final void call(Object obj) {
                this.f24996a.m28603u1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D1 */
    public final void m28587D1() {
        if (AccountModule.f26c.m220c1().phoneNumber == null) {
            CrashHelper.c(new Exception("mobileNumber == null in SignUpProfileImageOptAct on line 383"));
        }
        ((saf0) ((jq2) this).viewModel).act().startActivity(PhoneNumberLoginOptAct.m578Y1(act()));
    }

    /* JADX INFO: renamed from: E1 */
    public void m28588E1(Gender gender) {
        this.f28638e.gender = gender;
        AccountModule.f26c.m227f2(gender);
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.q5f0
            public final void call(Object obj) {
                this.f19643a.m28582o1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e1 */
    public final void m28589e1() {
        m28584z1();
    }

    /* JADX INFO: renamed from: f1 */
    public final void m28590f1() {
        if (lifecycle_() == c.i) {
            m28587D1();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public void m28591g1(boolean z, boolean z2) {
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
        d30 d30Var = new d30() { // from class: l.p5f0
            public final void call() {
                this.f18597a.m28598n1();
            }
        };
        C1512a c1512a = new C1512a(kef0Var, z);
        C1513b c1513b = new C1513b(kef0Var);
        C1514c c1514c = new C1514c(kef0Var);
        if (zqx.k()) {
            new zqx().d(act(), (View) null, d30Var, (e30) null, c1514c, c1513b, c1512a);
        } else {
            aVarC.o(d30Var).p(c1512a).t(c1513b).v(c1514c).i(((saf0) ((jq2) this).viewModel).act());
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m28592h1() {
        ((saf0) ((jq2) this).viewModel).m23633M1(this.f28638e);
    }

    /* JADX INFO: renamed from: i1 */
    public void m28593i1(SignUpData signUpData) {
        this.f28638e = signUpData;
        AccountModule.f26c.m232i2(signUpData);
    }

    /* JADX INFO: renamed from: j1 */
    public void m28594j1() {
        ((saf0) ((jq2) this).viewModel).m23640Q1();
    }

    /* JADX INFO: renamed from: k1 */
    public void m28595k1() {
        ((saf0) ((jq2) this).viewModel).m23642R1(this.f28638e);
    }

    /* JADX INFO: renamed from: l1 */
    public void m28596l1() {
        ((saf0) ((jq2) this).viewModel).m23646T1(this.f28638e);
        duringCreated(AccountModule.m26F().mo57Xg()).filter(new w9j() { // from class: l.x5f0
            public final Object call(Object obj) {
                return z5f0.m28577Y0((Boolean) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.y5f0
            public final void call(Object obj) {
                z5f0.m28571R0((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public final void m28597m1() {
        int iM16301a = C0811hp.m16301a();
        if (iM16301a > 0) {
            ((saf0) ((jq2) this).viewModel).m23659c2(iM16301a + 1);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m28598n1() {
        ((saf0) ((jq2) this).viewModel).act().startActivityForResult(MediaPickerAct.X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropWidth(t100.A).withImageCropProportion(1.0f).build()).withFromType(3).build()), 66);
        act().overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m28599p1(MobileRespInfo mobileRespInfo) {
        if (!mobileRespInfo.failed) {
            AccountModule.f26c.m238l2(mobileRespInfo.token, mobileRespInfo.openId);
            m28586C1(mobileRespInfo.grantType);
        } else {
            this.f28639f = false;
            ((saf0) ((jq2) this).viewModel).act().progressDismiss();
            lsi0.C(R$string.f126T);
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m28600r1(List list, SignupStage signupStage, roj0 roj0Var) {
        m28605x1(list, signupStage);
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m28601s1() {
        ((saf0) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m28602t1(SignUpData signUpData, roj0 roj0Var) {
        if (TEnum.equals(signUpData.gender, "male")) {
            qib0.m22159e1("signup_male_hp", new Object[0]);
        } else if (TEnum.equals(signUpData.gender, "female")) {
            qib0.m22159e1("signup_female_hp", new Object[0]);
        }
        m28589e1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m28603u1(Throwable th) {
        this.f28639f = false;
        if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
            ((saf0) ((jq2) this).viewModel).act().progressDismiss();
            m28590f1();
        } else {
            ((saf0) ((jq2) this).viewModel).act().progressDismiss();
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m28604v1() {
        StepSignupStage stepSignupStageM16308h = C0811hp.m16308h();
        if (stepSignupStageM16308h == null) {
            ((saf0) ((jq2) this).viewModel).act().hideInput();
            final SignupStage signupStage = SignupStage.get((String) eje.m14574h().f11185a.get());
            final ArrayList arrayListQ = vwb.Q((Collection) eje.m14574h().f11186b.get(), new r5f0());
            if (!NullChecker.c(signupStage, "account", CrashHelper.ReportLevel.p9) || !TEnum.equals(signupStage, "finished")) {
                m28605x1(arrayListQ, signupStage);
                return;
            }
            if (qib0.f19819q0.e() == null) {
                qib0.f19819q0.onNext(Long.valueOf(SystemClock.elapsedRealtime()));
            }
            qib0.f19812j0.f.take(1).subscribe(mkd0.G(new e30() { // from class: l.s5f0
                public final void call(Object obj) {
                    this.f21112a.m28600r1(arrayListQ, signupStage, (roj0) obj);
                }
            }));
        }
        String string = stepSignupStageM16308h.toString();
        string.getClass();
        switch (string) {
            case "name-saved":
                m28596l1();
                break;
            case "gender-saved":
                m28594j1();
                break;
            case "picture-saved":
                m28595k1();
                break;
            case "birth-saved":
                m28592h1();
                break;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m28605x1(List<StepSignupStage> list, SignupStage signupStage) {
        act().startActivity(C0811hp.m16307g(act(), list, signupStage));
        act().finish();
    }
}
