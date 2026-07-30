package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.auth.api.credentials.Credential;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.PhoneNumberInputAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.PhoneNumberVerifyAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.VerifyCodeInputAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class iq60 extends b3f0<br60> {

    /* JADX INFO: renamed from: e */
    public VerifyReason f114423e;

    /* JADX INFO: renamed from: f */
    public SignInData f114424f;

    /* JADX INFO: renamed from: g */
    public String f114425g;

    /* JADX INFO: renamed from: h */
    public String f114426h;

    /* JADX INFO: renamed from: i */
    public String f114427i;

    /* JADX INFO: renamed from: j */
    public boolean f114428j;

    /* JADX INFO: renamed from: k */
    public String f114429k;

    /* JADX INFO: renamed from: l */
    public String f114430l;

    /* JADX INFO: renamed from: m */
    public dzv f114431m;

    /* JADX INFO: renamed from: n */
    public int f114432n;

    public iq60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m137633U0(Credential credential, String str) {
        if (TextUtils.equals(str, "inActivated") || TextUtils.equals(str, "newDevice")) {
            return;
        }
        hkf0.m131486d().m131487c(credential);
        lsi0.m151578h(R$string.f16126Q3);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m137651B1(Throwable th) {
        ((br60) this.viewModel).act().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m137652C1() {
        ((br60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m137653D1(String str) {
        ((br60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m137654E1(final VerifyData verifyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        signUpData.verifyType = verifyData.verifyType;
        AccountModule.f16037c.m28337i2(signUpData);
        Objects.toString(verifyData.action);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                ((br60) this.viewModel).act().progressDismiss();
                TtcAccountBindAct.INSTANCE.m28684a(act(), signUpData, verifyData);
                act().hideInput();
                act().m66873d2();
                return;
            }
            return;
        }
        if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            act().duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.vp60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182455a.m137692z1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.wp60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f187492a.m137651B1((Throwable) obj);
                }
            }));
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(verifyData.code);
        signInData.verifyType = verifyData.verifyType;
        signInData.username = ((br60) this.viewModel).m103497I() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f114426h;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        m100082J0(signInData, new d30() { // from class: l.xp60
            @Override // p149l.d30
            public final void call() {
                this.f193900a.m137652C1();
            }
        }, new e30() { // from class: l.zp60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204181a.m137653D1((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m137655F1(Throwable th) {
        th.getMessage();
        ((br60) this.viewModel).act().progressDismiss();
        C21383yf.m214461b(th);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m137656H1(VerifyData verifyData, RiskVerification riskVerification) {
        ((br60) this.viewModel).act().progressDismiss();
        m137659L1();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (c5d0.m105290b(act(), riskVerification, verifyData, new c5d0.InterfaceC16073a() { // from class: l.sp60
            @Override // p149l.c5d0.InterfaceC16073a
            /* JADX INFO: renamed from: a */
            public final void mo105292a(VerifyData verifyData2) {
                this.f165753a.m137669W1(verifyData2);
            }
        })) {
            return;
        }
        m137675c2();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m137657I1(Pair pair) {
        this.f114429k = (String) pair.first;
        this.f114430l = (String) pair.second;
        m137670X1();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m137658J1(Throwable th) {
        th.getMessage();
        ((br60) this.viewModel).act().progressDismiss();
        m137659L1();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            C21176xm.m210021n0(act(), new e30() { // from class: l.rp60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160480a.m137657I1((Pair) obj);
                }
            });
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m198583c(act());
        } else {
            C21383yf.m214461b(th);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m137660N1(Pair pair) {
        this.f114429k = (String) pair.first;
        this.f114430l = (String) pair.second;
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m137661O1(String str) {
        m137659L1();
        if (TextUtils.equals("suspicious", str)) {
            C21176xm.m210021n0(act(), new e30() { // from class: l.op60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144952a.m137660N1((Pair) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m137662P1(Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                m137674b2();
            } else {
                yij0.m214926D(th);
                this.f114432n++;
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            yij0.m214926D(th);
        }
        ((br60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m137663Q1(AccountErrorResponse accountErrorResponse) {
        ((br60) this.viewModel).act().startActivity(VerifyCodeInputAct.m28521Z1(((br60) this.viewModel).act(), VerifyReason.get(VerifyReason.signup), ((br60) this.viewModel).m103497I(), this.f114426h));
        ((br60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: R1 */
    public void m137664R1(int i, int i2, Intent intent) {
        if (TEnum.equals(this.f114423e, VerifyReason.signup)) {
            this.f114431m.mo28692a(((br60) this.viewModel).act(), i, i2, intent);
            hkf0.m131486d().m131489f(i, i2, intent, new e30() { // from class: l.np60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f139933a.m137691x1((Credential) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m137665S1() {
        if (TEnum.equals(this.f114423e, VerifyReason.ban_appeal)) {
            n6j0.m158048b("e_p_appeal_verify_phonenumber_page_back", ((br60) this.viewModel).act().pageId(), new n6j0.C18629a[0]);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public boolean m137666T1(Menu menu) {
        AccountModule.f16037c.m28298M1().mo95158b(act());
        if (TEnum.equals(this.f114423e, VerifyReason.signin)) {
            if (!AccountModule.f16040f.m101619m(String.valueOf(this.f114424f.code))) {
                return false;
            }
            menu.add(0, q4c0.f152562F, 0, R$string.f16265p2).setShowAsAction(2);
            return true;
        }
        if (!C17133gp.m127320k()) {
            return false;
        }
        menu.add(0, q4c0.f152566J, 0, "遇到问题？").setShowAsAction(2);
        return true;
    }

    /* JADX INFO: renamed from: U1 */
    public boolean m137667U1(MenuItem menuItem) {
        if (menuItem.getItemId() != q4c0.f152562F) {
            if (menuItem.getItemId() != q4c0.f152566J) {
                return false;
            }
            zvf0.m220396r("e_prelogin_mobile_num_page_feedback", pageId());
            act().startActivity(WebViewAct.m80165a2(act(), "帮助与反馈", a3e0.m94685a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
            return true;
        }
        zvf0.m220399u("e_password_verifypage_switch_button", pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f114426h));
        if (((br60) this.viewModel).m103497I() == 86) {
            m137675c2();
        } else {
            ((br60) this.viewModel).act().startActivity(VerifyCodeInputAct.m28523b2(((br60) this.viewModel).act(), VerifyReason.get(VerifyReason.signin), ((br60) this.viewModel).m103497I(), this.f114426h, false));
        }
        ((br60) this.viewModel).act().m66873d2();
        return true;
    }

    /* JADX INFO: renamed from: V1 */
    public void m137668V1(PhoneNumberInputAct phoneNumberInputAct, cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((br60) this.viewModel).act().pageId().equals("p_sign_in_password_view")) {
                jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, this.f114426h);
            } else if (((br60) this.viewModel).act().pageId().equals("p_sign_in_phone_number_view")) {
                jSONObject.put("phone_show_type", "SHORE_CUT_ACT".equals(this.f114425g) ? "switch_signin" : "direct_signin");
            }
            cwf0Var.m109039o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final void m137669W1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        act().progress(R$string.f16227j0);
        duringCreated(AccountModule.f16037c.m28270A2(verifyData)).subscribe(mkd0.m154956H(new e30() { // from class: l.tp60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171445a.m137654E1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.up60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177576a.m137655F1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X1 */
    public void m137670X1() {
        final VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.countryCode = ((br60) this.viewModel).m103497I();
        verifyData.mobileNumber = this.f114426h;
        verifyData.codeLength = 4;
        verifyData.action = VerifyReason.get(VerifyReason.signup_signin);
        if (!TextUtils.isEmpty(this.f114429k)) {
            verifyData.captchaToken = this.f114429k;
        }
        if (!TextUtils.isEmpty(this.f114430l)) {
            verifyData.captchaValue = this.f114430l;
        }
        Objects.toString(verifyData.action);
        AccountModule.f16037c.m28324b2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.pp60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150629a.m137656H1(verifyData, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.qp60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155677a.m137658J1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Y1 */
    public void m137671Y1(CharSequence charSequence) {
        this.f114427i = charSequence.toString();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m137672Z1() {
        ((br60) this.viewModel).act().startActivity(PhoneNumberVerifyAct.m28494V1(((br60) this.viewModel).act(), ((br60) this.viewModel).m103497I(), this.f114426h));
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.yp60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199399a.m137689u1((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.aq60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71133a.m137690v1((Bundle) obj);
            }
        });
        m137685q1();
    }

    /* JADX INFO: renamed from: a2 */
    public final void m137673a2(String str, String str2, e30<String> e30Var) {
        SignInData signInData = new SignInData();
        signInData.isSmartlock = true;
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        signInData.password = str2;
        signInData.username = str;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        m100082J0(signInData, null, e30Var);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m137674b2() {
        SignInData signInData = new SignInData();
        signInData.username = ((br60) this.viewModel).m103497I() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vwb.m200345q(this.f114426h);
        signInData.code = Integer.valueOf(((br60) this.viewModel).m103497I());
        act().startActivity(PhoneNumberInputAct.m28491Z1(((br60) this.viewModel).act(), VerifyReason.get(VerifyReason.signin), signInData));
    }

    /* JADX INFO: renamed from: c2 */
    public void m137675c2() {
        ((br60) this.viewModel).act().startActivity(VerifyCodeInputAct.m28521Z1(((br60) this.viewModel).act(), VerifyReason.get(VerifyReason.signup_signin), ((br60) this.viewModel).m103497I(), this.f114426h));
    }

    /* JADX INFO: renamed from: d2 */
    public void m137676d2() {
        zvf0.m220399u("e_password_verifypage_signin_button", ((br60) this.viewModel).act().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f114426h));
    }

    /* JADX INFO: renamed from: e2 */
    public List<Object> m137677e2() {
        VerifyReason verifyReason = this.f114423e;
        return vwb.m200324f0(Reason.TYPE, verifyReason == null ? "" : verifyReason.toString(), ag3.f69252a);
    }

    /* JADX INFO: renamed from: f2 */
    public void m137678f2(CharSequence charSequence) {
        if (this.f114428j && charSequence.length() > 0) {
            this.f114428j = false;
        }
        if ("p_sign_in_phone_number_view".equals(((br60) this.viewModel).act().pageId()) && charSequence.length() > 0) {
            xvf0.m211279a("e_phone_input", ((br60) this.viewModel).act().pageId(), getClass().getName(), new Object[0]);
        }
        String strM103499K = ((br60) this.viewModel).m103499K();
        this.f114426h = strM103499K;
        if (strM103499K == null) {
            CrashHelper.m81296c(new Exception("mobileNumber == null in PhoneNumberInputAct on line 368"));
        }
        ((br60) this.viewModel).m103524j0();
        if (((br60) this.viewModel).m103519f0() && this.f114426h.length() == 11 && m137682n1(this.f114426h)) {
            ((br60) this.viewModel).m103520g0();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m137679g2() {
        ((br60) this.viewModel).act().startActivity(VerifyCodeInputAct.m28521Z1(((br60) this.viewModel).act(), this.f114423e, ((br60) this.viewModel).m103497I(), this.f114426h));
    }

    /* JADX INFO: renamed from: h2 */
    public void m137680h2(boolean z) {
        if (!z) {
            this.f114432n++;
            return;
        }
        if (!TEnum.equals(this.f114423e, VerifyReason.signin)) {
            if (TEnum.equals(this.f114423e, VerifyReason.signup)) {
                zvf0.m220399u("e_phone_continue_button", ((br60) this.viewModel).act().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, ((br60) this.viewModel).m103498J()));
                m137681i2();
                return;
            } else {
                if (TEnum.equals(this.f114423e, VerifyReason.ban_appeal)) {
                    m137679g2();
                    return;
                }
                return;
            }
        }
        SignInData signInData = this.f114424f;
        signInData.password = this.f114427i;
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        this.f114424f.device = new Device();
        this.f114424f.device.identifiers = pk8.m169981N();
        if (!TextUtils.isEmpty(this.f114429k)) {
            this.f114424f.captchaToken = this.f114429k;
        }
        if (!TextUtils.isEmpty(this.f114430l)) {
            this.f114424f.captchaValue = this.f114430l;
        }
        m100082J0(this.f114424f, new d30() { // from class: l.eq60
            @Override // p149l.d30
            public final void call() {
                this.f92761a.m137659L1();
            }
        }, new e30() { // from class: l.fq60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98766a.m137661O1((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public final void m137681i2() {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = this.f114423e;
        verifyData.countryCode = ((br60) this.viewModel).m103497I();
        verifyData.mobileNumber = this.f114426h;
        ((br60) this.viewModel).act().progress(R$string.f16227j0);
        if (verifyData.countryCode == 86) {
            m137670X1();
        } else {
            AccountModule.f16037c.m28278E2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.gq60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f103887a.m137663Q1((AccountErrorResponse) obj);
                }
            }, new e30() { // from class: l.hq60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109034a.m137662P1((Throwable) obj);
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m137682n1(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!((br60) this.viewModel).m103519f0()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public final void m137659L1() {
        this.f114429k = "";
        this.f114430l = "";
        if (NullChecker.m81303a(this.f114424f)) {
            SignInData signInData = this.f114424f;
            signInData.captchaToken = "";
            signInData.captchaValue = "";
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m137684p1(VerifyReason verifyReason, SignInData signInData, String str) {
        this.f114423e = verifyReason;
        this.f114424f = signInData;
        this.f114425g = str;
    }

    public String pageId() {
        if (NullChecker.m81303a(this.f114423e) && TEnum.equals(this.f114423e, VerifyReason.ban_appeal)) {
            return "p_appeal_verify_phonenumber";
        }
        return NullChecker.m81303a(this.f114424f) ? "p_sign_in_password_view" : "p_sign_in_phone_number_view";
    }

    /* JADX INFO: renamed from: q1 */
    public void m137685q1() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.bq60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76756a.m137687s1((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public final void m137686r1() {
        this.f114431m = dzv.m114134c(((br60) this.viewModel).act());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m137687s1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((br60) this.viewModel).m103524j0();
        } else if (c4319c == C4319c.f15549j) {
            ((br60) this.viewModel).m103521h0();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m137688t1() {
        ((br60) this.viewModel).m103525k0();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m137689u1(Bundle bundle) {
        if (TEnum.equals(this.f114423e, VerifyReason.signup)) {
            e51.m114741F(act(), new Runnable() { // from class: l.dq60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87393a.m137688t1();
                }
            });
            m137686r1();
        }
        if (TEnum.equals(this.f114423e, VerifyReason.signup)) {
            this.f114428j = true;
        }
        ((br60) this.viewModel).m103523i0(this.f114423e, this.f114424f);
        ((br60) this.viewModel).m103500L(this.f114423e);
        ((br60) this.viewModel).m103501M(this.f114423e);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m137690v1(Bundle bundle) {
        if (TEnum.equals(this.f114423e, VerifyReason.signup)) {
            hkf0.m131486d().m131490g(act());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m137691x1(final Credential credential) {
        String strM12368J = credential.m12368J();
        if (!TextUtils.isEmpty(strM12368J) && strM12368J.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).length == 2) {
            m137673a2(credential.m12368J(), credential.getPassword(), new e30() { // from class: l.cq60
                @Override // p149l.e30
                public final void call(Object obj) {
                    iq60.m137633U0(credential, (String) obj);
                }
            });
        } else {
            hkf0.m131486d().m131487c(credential);
            lsi0.m151578h(R$string.f16126Q3);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m137692z1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((br60) this.viewModel).act().progressDismiss();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m100088r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m28498b2(((br60) this.viewModel).act(), verifyData, false, false));
        }
        act().m66873d2();
    }

    @Override // p149l.b3f0, p149l.q0m
    public void destroy() {
    }
}
