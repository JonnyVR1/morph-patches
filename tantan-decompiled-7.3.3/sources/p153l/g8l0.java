package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class g8l0 extends ibf0<w8l0> {

    /* JADX INFO: renamed from: e */
    public boolean f102694e;

    /* JADX INFO: renamed from: f */
    public int f102695f;

    /* JADX INFO: renamed from: g */
    public String f102696g;

    /* JADX INFO: renamed from: h */
    public int f102697h;

    public g8l0(ner nerVar) {
        super(nerVar);
        this.f102694e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public /* synthetic */ void m129409B1() {
        l51.m152891K(((w8l0) this.viewModel).m205447F());
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public /* synthetic */ void m129410C1(String str) {
        this.f102694e = false;
        ((w8l0) this.viewModel).m205458Z();
        if (m129449o1()) {
            i4g0.m138526x("e_code_wrong_tip", act().pageId());
        }
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m129430l1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m129431q1() {
        ((w8l0) this.viewModel).m205459r();
        if (l51.m152882B(((w8l0) this.viewModel).m205447F())) {
            return;
        }
        m129443N1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m129432r1(Bundle bundle) {
        l51.m152887G(new Runnable() { // from class: l.a8l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68932a.m129431q1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m129433s1(Captcha captcha) {
        if (NullChecker.m82486a(captcha)) {
            m129443N1(captcha);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m129434u1(Throwable th) {
        th.getMessage();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m129447m1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            olj.INSTANCE.m168130c(act());
        } else if (!((w8l0) this.viewModel).m205456X(th)) {
            C20299tf.m190906b(th);
        }
        ((w8l0) this.viewModel).m205458Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public /* synthetic */ void m129435z1(Throwable th) {
        this.f102694e = false;
        ((w8l0) this.viewModel).m205458Z();
        ((w8l0) this.viewModel).m205445C();
        bsj0.m106246D(th);
        HashMap map = new HashMap();
        map.put("Sign up status", "Phone number register fail");
        x95.INSTANCE.m209793m("Sign Up", map);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m129436D1(final VerifyData verifyData, uxj0 uxj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        AccountModule.f16756c.m29336i2(signUpData);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                l51.m152891K(((w8l0) this.viewModel).m205447F());
                TtcAccountBindAct.INSTANCE.m29683a(act(), signUpData, verifyData);
                act().hideInput();
                act().m48999H2();
            }
        } else if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            ((w8l0) this.viewModel).act().duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.t7l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172454a.m129453x1(verifyData, (uxj0) obj);
                }
            }, new y20() { // from class: l.u7l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177924a.m129435z1((Throwable) obj);
                }
            }));
        } else {
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.username = this.f102695f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f102696g;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = tl8.m191617N();
            signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            act().hideInput();
            m139325J0(signInData, new x20() { // from class: l.v7l0
                @Override // p153l.x20
                public final void call() {
                    this.f182783a.m129409B1();
                }
            }, new y20() { // from class: l.w7l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187769a.m129410C1((String) obj);
                }
            });
        }
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f102696g);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m129437E1() {
        l51.m152891K(((w8l0) this.viewModel).m205447F());
        ((w8l0) this.viewModel).m205458Z();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m129438F1(String str) {
        this.f102694e = false;
        ((w8l0) this.viewModel).m205458Z();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m129439H1(VerifyData verifyData, uxj0 uxj0Var) {
        act().hideInput();
        ((w8l0) this.viewModel).m205458Z();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m139331r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m29497c2(((w8l0) this.viewModel).act(), verifyData, false, false));
        }
        act().m48999H2();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m129440I1(Throwable th) {
        this.f102694e = false;
        ((w8l0) this.viewModel).m205458Z();
        ((w8l0) this.viewModel).m205445C();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m129441J1() {
        l51.m152891K(((w8l0) this.viewModel).m205447F());
        ((w8l0) this.viewModel).m205458Z();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m129442L1(String str) {
        this.f102694e = false;
        ((w8l0) this.viewModel).m205458Z();
    }

    /* JADX INFO: renamed from: N1 */
    public void m129443N1(Captcha captcha) {
        if (TextUtils.isEmpty(this.f102696g)) {
            o1j0.m165634h(R$string.f16886Z);
            return;
        }
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = q8g0.m175820y();
        verifyDataNew_.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyDataNew_.countryCode = this.f102695f;
        verifyDataNew_.mobileNumber = this.f102696g;
        verifyDataNew_.codeLength = 4;
        if (NullChecker.m82486a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((w8l0) this.viewModel).m205457Y();
        Objects.toString(verifyDataNew_.action);
        AccountModule.f16756c.m29323b2(verifyDataNew_).subscribe(psd0.m173600K(new y20() { // from class: l.b8l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75442a.m129451t1(verifyDataNew_, (RiskVerification) obj);
            }
        }, new y20() { // from class: l.c8l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80222a.m129434u1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: O1 */
    public void m129444O1() {
        final VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyData.countryCode = this.f102695f;
        verifyData.mobileNumber = this.f102696g;
        verifyData.code = ((w8l0) this.viewModel).m205446E();
        verifyData.codeLength = 4;
        ((w8l0) this.viewModel).m205457Y();
        this.f102694e = true;
        AccountModule.f16756c.m29269A2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.n7l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140611a.m129436D1(verifyData, (uxj0) obj);
            }
        }, new y20() { // from class: l.o7l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145281a.m129452v1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: P1 */
    public void m129445P1() {
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(((w8l0) this.viewModel).m205446E());
        signInData.username = this.f102695f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f102696g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        this.f102694e = true;
        ((w8l0) this.viewModel).m205457Y();
        m139326L0(signInData, new x20() { // from class: l.e8l0
            @Override // p153l.x20
            public final void call() {
                this.f92549a.m129437E1();
            }
        }, new y20() { // from class: l.f8l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97747a.m129438F1((String) obj);
            }
        }, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m129446Q1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        signUpData.verifyType = verifyData.verifyType;
        AccountModule.f16756c.m29336i2(signUpData);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                l51.m152891K(((w8l0) this.viewModel).m205447F());
                TtcAccountBindAct.INSTANCE.m29683a(act(), signUpData, verifyData);
                act().hideInput();
                act().m48999H2();
            }
        } else if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            ((w8l0) this.viewModel).m205457Y();
            ((w8l0) this.viewModel).act().duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.p7l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150948a.m129439H1(verifyData, (uxj0) obj);
                }
            }, new y20() { // from class: l.q7l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155971a.m129440I1((Throwable) obj);
                }
            }));
        } else {
            ((w8l0) this.viewModel).m205457Y();
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.verifyType = verifyData.verifyType;
            signInData.username = this.f102695f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f102696g;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = tl8.m191617N();
            signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            act().hideInput();
            m139325J0(signInData, new x20() { // from class: l.r7l0
                @Override // p153l.x20
                public final void call() {
                    this.f161623a.m129441J1();
                }
            }, new y20() { // from class: l.s7l0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f166699a.m129442L1((String) obj);
                }
            });
        }
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(this.f102696g);
        }
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        this.f102695f = act().getIntent().getIntExtra("ccode", 86);
        this.f102696g = act().getIntent().getStringExtra("phone");
        this.f102697h = act().getIntent().getIntExtra("verify_type", 1);
        creates(new y20() { // from class: l.m7l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135088a.m129432r1((Bundle) obj);
            }
        });
        act().duringCreated(esf0.m122324e().f95596b).filter(new qcj() { // from class: l.x7l0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.y7l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197788a.m129433s1((Captcha) obj);
            }
        }, new y20() { // from class: l.z7l0
            @Override // p153l.y20
            public final void call(Object obj) {
                g8l0.m129430l1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public void m129447m1(String str) {
        Intent intent = new Intent();
        intent.putExtra("back_reason", str);
        act().setResult(-1, intent);
        act().m48999H2();
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m129448n1() {
        return this.f102694e;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m129449o1() {
        return this.f102697h == 1;
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m129450p1() {
        return this.f102697h == 2;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m129451t1(VerifyData verifyData, RiskVerification riskVerification) {
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        ((w8l0) this.viewModel).m205458Z();
        if (fdd0.m125084b(act(), riskVerification, verifyData, new fdd0.InterfaceC16952a() { // from class: l.d8l0
            @Override // p153l.fdd0.InterfaceC16952a
            /* JADX INFO: renamed from: a */
            public final void mo114913a(VerifyData verifyData2) {
                this.f85652a.m129446Q1(verifyData2);
            }
        })) {
            return;
        }
        ((w8l0) this.viewModel).m205455W();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m129452v1(Throwable th) {
        this.f102694e = false;
        if (m129449o1()) {
            i4g0.m138526x("e_code_wrong_tip", act().pageId());
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m129447m1("show_captcha");
        } else if (!((w8l0) this.viewModel).m205456X(th)) {
            C20299tf.m190906b(th);
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 403001) {
            if (AccountModule.f16756c.f17052n) {
                HashMap map = new HashMap();
                map.put("Method used", "Phone");
                map.put("Status", "Failure");
                map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
                x95.INSTANCE.m209793m("Login", map);
            } else {
                HashMap map2 = new HashMap();
                map2.put("Sign up status", "Phone number register fail");
                x95.INSTANCE.m209793m("Sign Up", map2);
            }
        }
        ((w8l0) this.viewModel).m205458Z();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m129453x1(VerifyData verifyData, uxj0 uxj0Var) {
        act().hideInput();
        ((w8l0) this.viewModel).m205458Z();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m139331r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m29497c2(((w8l0) this.viewModel).act(), verifyData, false, false));
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Phone number register success");
        x95.INSTANCE.m209793m("Sign Up", map);
        act().m48999H2();
    }
}
