package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.api.C4727b;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.SignupStage;
import com.p051p1.mobile.putong.data.StepSignupStage;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyDataV2;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class gxe extends ibf0<uxe> {

    /* JADX INFO: renamed from: e */
    public boolean f106933e;

    /* JADX INFO: renamed from: f */
    public String f106934f;

    /* JADX INFO: renamed from: g */
    public int f106935g;

    /* JADX INFO: renamed from: h */
    public VerifyReason f106936h;

    /* JADX INFO: renamed from: i */
    public String f106937i;

    public gxe(ner nerVar) {
        super(nerVar);
        this.f106933e = false;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m132831R0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m132843l1() {
        ((uxe) this.viewModel).m198454r();
        if (l51.m152882B(((uxe) this.viewModel).m198440B())) {
            return;
        }
        m132860x1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m132844m1(Bundle bundle) {
        l51.m152887G(new Runnable() { // from class: l.axe
            @Override // java.lang.Runnable
            public final void run() {
                this.f73843a.m132843l1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m132845n1(Captcha captcha) {
        if (NullChecker.m82486a(captcha)) {
            m132860x1(captcha);
        }
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.f106934f = act().getIntent().getStringExtra("email");
        this.f106935g = act().getIntent().getIntExtra("verify_type", 1);
        creates(new y20() { // from class: l.twe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176392a.m132844m1((Bundle) obj);
            }
        });
        act().duringCreated(esf0.m122324e().f95596b).filter(new qcj() { // from class: l.xwe
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ywe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201823a.m132845n1((Captcha) obj);
            }
        }, new y20() { // from class: l.zwe
            @Override // p153l.y20
            public final void call(Object obj) {
                gxe.m132831R0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public void m132846f1(String str) {
        Intent intent = new Intent();
        intent.putExtra("back_reason", str);
        act().setResult(-1, intent);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: g1 */
    public void m132847g1(VerifyReason verifyReason, String str) {
        this.f106936h = verifyReason;
        this.f106937i = str;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m132848h1() {
        return this.f106933e;
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m132849i1() {
        return VerifyReason.get(VerifyReason.signup_signin).equals(this.f106936h);
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m132850j1() {
        return this.f106935g == 1;
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m132851k1() {
        return this.f106935g == 2;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m132852o1(VerifyData verifyData, uxj0 uxj0Var) {
        ((uxe) this.viewModel).m198450Q();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m132853p1(Throwable th) {
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m132846f1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            i4g0.m138526x("e_intl_email_verification_risk_graph", act().pageId());
            olj.INSTANCE.m168131d("email", act());
        } else if (!((uxe) this.viewModel).m198451R(th)) {
            C20299tf.m190906b(th);
        }
        ((uxe) this.viewModel).m198453T();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m132854q1(VerifyDataV2 verifyDataV2, Throwable th) {
        this.f106933e = false;
        if (m132850j1()) {
            i4g0.m138526x("e_intl_email_verification_code_error", act().pageId());
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m132846f1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 400149) {
            r1j0.m179419f(R$string.f16899b1);
        } else if (((uxe) this.viewModel).m198451R(th)) {
            HashMap map = new HashMap();
            map.put("Sign up status", "Email register fail");
            x95.INSTANCE.m209793m("Sign Up", map);
        } else {
            C20299tf.m190906b(th);
            HashMap map2 = new HashMap();
            map2.put("Sign up status", "Email register fail");
            x95.INSTANCE.m209793m("Sign Up", map2);
        }
        ((uxe) this.viewModel).m198453T();
        if (TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) || TEnum.equals(verifyDataV2.action, VerifyReason.change_email)) {
            i4g0.m138495D(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "e_account_add_email_code_done" : "e_account_replace_email_code_done", ((uxe) this.viewModel).act().pageId(), pf60.m172085a(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "add_result" : "replace_result", "fail"));
            if (TextUtils.equals(this.f106937i, "bind_or_change_email") && TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
                i4g0.m138495D("e_intl_account_add_email_result", "p_account_and_security_view", pf60.m172085a("add_result", "fail"));
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m132855r1(VerifyDataV2 verifyDataV2, SignUpData signUpData, uxj0 uxj0Var) {
        act().hideInput();
        ((uxe) this.viewModel).m198453T();
        if (TEnum.equals(verifyDataV2.action, VerifyReason.ttt_signup)) {
            m139331r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m29496b2(((uxe) this.viewModel).act(), signUpData));
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register success");
        x95.INSTANCE.m209793m("Sign Up", map);
        act().m68056e2();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m132856s1(Throwable th) {
        this.f106933e = false;
        ((uxe) this.viewModel).m198453T();
        ((uxe) this.viewModel).m198456z();
        bsj0.m106246D(th);
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register fail");
        x95.INSTANCE.m209793m("Sign Up", map);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m132857t1() {
        l51.m152891K(((uxe) this.viewModel).m198440B());
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m132858u1(String str) {
        this.f106933e = false;
        ((uxe) this.viewModel).m198453T();
        if (m132850j1()) {
            i4g0.m138526x("e_intl_email_verification_code_error", act().pageId());
        }
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m132859v1(final VerifyDataV2 verifyDataV2, uxj0 uxj0Var) {
        final SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.email;
        signUpData.email = verifyDataV2.email;
        signUpData.code = verifyDataV2.code;
        signUpData.phoneNumber = verifyDataV2.mobileNumber;
        signUpData.action = verifyDataV2.action.toString();
        AccountModule.f16756c.m29336i2(signUpData);
        if (TEnum.equals(verifyDataV2.action, "pending")) {
            if (act() != null) {
                l51.m152891K(((uxe) this.viewModel).m198440B());
                TtcAccountBindAct.INSTANCE.m29683a(act(), signUpData, VerifyDataV2.v2ConvertV1(verifyDataV2));
                act().hideInput();
                act().m68056e2();
            }
        } else if (TEnum.equals(verifyDataV2.action, VerifyReason.signup) || TEnum.equals(verifyDataV2.action, VerifyReason.ttt_signup)) {
            ((uxe) this.viewModel).act().duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.fxe
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f101255a.m132855r1(verifyDataV2, signUpData, (uxj0) obj);
                }
            }, new y20() { // from class: l.uwe
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181257a.m132856s1((Throwable) obj);
                }
            }));
        } else if (TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) || TEnum.equals(verifyDataV2.action, VerifyReason.change_email)) {
            r1j0.m179419f(R$string.f16862U0);
            act().hideInput();
            if ("home".equals(this.f106937i) && TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
                act().startActivity(AccountModule.m29131H().toNewMainAct(act(), false, true));
                act().m68056e2();
            } else if ("messageDeeplink".equals(this.f106937i)) {
                Intent intentStartMessagesAct = AccountModule.m29131H().startMessagesAct(act(), User.ID_TEAM_ACCOUNT, false, false);
                intentStartMessagesAct.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                act().startActivity(intentStartMessagesAct);
            } else if ("bind_or_change_email".equals(this.f106937i)) {
                uqb0.f180396b0.f170325b.mo31732Us(act());
            } else if ("google_login_verify_email".equals(this.f106937i)) {
                ike.m140276h().m140281f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.google_email_saved));
                Intent intentM111719e = C16330cp.m111719e(act());
                intentM111719e.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                act().startActivity(intentM111719e);
            } else {
                act().startActivity(AccountModule.m29131H().toNewMainAct(act(), false, true));
                act().m68056e2();
            }
            i4g0.m138495D(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "e_account_add_email_code_done" : "e_account_replace_email_code_done", ((uxe) this.viewModel).act().pageId(), pf60.m172085a(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "add_result" : "replace_result", "success"));
            if (TextUtils.equals(this.f106937i, "bind_or_change_email") && TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
                i4g0.m138495D("e_intl_account_add_email_result", "p_account_and_security_view", pf60.m172085a("add_result", "success"));
            }
        } else {
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyDataV2.code);
            signInData.username = this.f106934f;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = tl8.m191617N();
            signInData.grantType = SignInGrantType.get("email");
            act().hideInput();
            m139325J0(signInData, new x20() { // from class: l.vwe
                @Override // p153l.x20
                public final void call() {
                    this.f186131a.m132857t1();
                }
            }, new y20() { // from class: l.wwe
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f191263a.m132858u1((String) obj);
                }
            });
        }
        C16074bp.m105755j();
    }

    /* JADX INFO: renamed from: x1 */
    public void m132860x1(Captcha captcha) {
        if (TextUtils.isEmpty(this.f106934f)) {
            o1j0.m165634h(R$string.f16948j2);
            return;
        }
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = q8g0.m175820y();
        verifyDataNew_.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyDataNew_.email = this.f106934f;
        verifyDataNew_.codeLength = 4;
        if (NullChecker.m82486a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((uxe) this.viewModel).m198452S();
        AccountModule.f16757d.m174018I(verifyDataNew_).compose(C4727b.m29375f()).subscribe(psd0.m173600K(new y20() { // from class: l.bxe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78863a.m132852o1(verifyDataNew_, (uxj0) obj);
            }
        }, new y20() { // from class: l.cxe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84212a.m132853p1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: z1 */
    public void m132861z1() {
        final VerifyDataV2 verifyDataV2 = new VerifyDataV2();
        verifyDataV2.language = q8g0.m175820y();
        verifyDataV2.action = this.f106936h;
        verifyDataV2.email = this.f106934f;
        verifyDataV2.code = ((uxe) this.viewModel).m198439A();
        verifyDataV2.codeLength = 4;
        ((uxe) this.viewModel).m198452S();
        this.f106933e = true;
        AccountModule.f16756c.m29296M0(verifyDataV2).subscribe(psd0.m173600K(new y20() { // from class: l.dxe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91085a.m132859v1(verifyDataV2, (uxj0) obj);
            }
        }, new y20() { // from class: l.exe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96283a.m132854q1(verifyDataV2, (Throwable) obj);
            }
        }, false));
    }
}
