package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.auth.api.credentials.Credential;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.PhoneNumberInputAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.PhoneNumberVerifyAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.VerifyCodeInputAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class oy60 extends ibf0<hz60> {

    /* JADX INFO: renamed from: e */
    public VerifyReason f149744e;

    /* JADX INFO: renamed from: f */
    public SignInData f149745f;

    /* JADX INFO: renamed from: g */
    public String f149746g;

    /* JADX INFO: renamed from: h */
    public String f149747h;

    /* JADX INFO: renamed from: i */
    public String f149748i;

    /* JADX INFO: renamed from: j */
    public boolean f149749j;

    /* JADX INFO: renamed from: k */
    public String f149750k;

    /* JADX INFO: renamed from: l */
    public String f149751l;

    /* JADX INFO: renamed from: m */
    public b1w f149752m;

    /* JADX INFO: renamed from: n */
    public int f149753n;

    public oy60(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m169772U0(Credential credential, String str) {
        if (TextUtils.equals(str, "inActivated") || TextUtils.equals(str, "newDevice")) {
            return;
        }
        qsf0.m177799d().m177800c(credential);
        o1j0.m165634h(R$string.f16845Q3);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m169790B1(Throwable th) {
        ((hz60) this.viewModel).act().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m169791C1() {
        ((hz60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m169792D1(String str) {
        ((hz60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m169793E1(final VerifyData verifyData, uxj0 uxj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        signUpData.verifyType = verifyData.verifyType;
        AccountModule.f16756c.m29336i2(signUpData);
        Objects.toString(verifyData.action);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                ((hz60) this.viewModel).act().progressDismiss();
                TtcAccountBindAct.INSTANCE.m29683a(act(), signUpData, verifyData);
                act().hideInput();
                act().m68056e2();
                return;
            }
            return;
        }
        if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            act().duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.by60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f78989a.m169831z1(verifyData, (uxj0) obj);
                }
            }, new y20() { // from class: l.cy60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84301a.m169790B1((Throwable) obj);
                }
            }));
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(verifyData.code);
        signInData.verifyType = verifyData.verifyType;
        signInData.username = ((hz60) this.viewModel).m137855I() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f149747h;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        m139325J0(signInData, new x20() { // from class: l.dy60
            @Override // p153l.x20
            public final void call() {
                this.f91138a.m169791C1();
            }
        }, new y20() { // from class: l.fy60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101343a.m169792D1((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m169794F1(Throwable th) {
        th.getMessage();
        ((hz60) this.viewModel).act().progressDismiss();
        C20299tf.m190906b(th);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m169795H1(VerifyData verifyData, RiskVerification riskVerification) {
        ((hz60) this.viewModel).act().progressDismiss();
        m169798L1();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (fdd0.m125084b(act(), riskVerification, verifyData, new fdd0.InterfaceC16952a() { // from class: l.yx60
            @Override // p153l.fdd0.InterfaceC16952a
            /* JADX INFO: renamed from: a */
            public final void mo114913a(VerifyData verifyData2) {
                this.f201934a.m169808W1(verifyData2);
            }
        })) {
            return;
        }
        m169814c2();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m169796I1(Pair pair) {
        this.f149750k = (String) pair.first;
        this.f149751l = (String) pair.second;
        m169809X1();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m169797J1(Throwable th) {
        th.getMessage();
        ((hz60) this.viewModel).act().progressDismiss();
        m169798L1();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            C20102sm.m186706n0(act(), new y20() { // from class: l.xx60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f196608a.m169796I1((Pair) obj);
                }
            });
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            olj.INSTANCE.m168130c(act());
        } else {
            C20299tf.m190906b(th);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m169799N1(Pair pair) {
        this.f149750k = (String) pair.first;
        this.f149751l = (String) pair.second;
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m169800O1(String str) {
        m169798L1();
        if (TextUtils.equals("suspicious", str)) {
            C20102sm.m186706n0(act(), new y20() { // from class: l.ux60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f181349a.m169799N1((Pair) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m169801P1(Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                m169813b2();
            } else {
                bsj0.m106246D(th);
                this.f149753n++;
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            bsj0.m106246D(th);
        }
        ((hz60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m169802Q1(AccountErrorResponse accountErrorResponse) {
        ((hz60) this.viewModel).act().startActivity(VerifyCodeInputAct.m29520a2(((hz60) this.viewModel).act(), VerifyReason.get(VerifyReason.signup), ((hz60) this.viewModel).m137855I(), this.f149747h));
        ((hz60) this.viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: R1 */
    public void m169803R1(int i, int i2, Intent intent) {
        if (TEnum.equals(this.f149744e, VerifyReason.signup)) {
            this.f149752m.mo29691a(((hz60) this.viewModel).act(), i, i2, intent);
            qsf0.m177799d().m177802f(i, i2, intent, new y20() { // from class: l.tx60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f176525a.m169830x1((Credential) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m169804S1() {
        if (TEnum.equals(this.f149744e, VerifyReason.ban_appeal)) {
            rfj0.m181214b("e_p_appeal_verify_phonenumber_page_back", ((hz60) this.viewModel).act().pageId(), new rfj0.C19825a[0]);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public boolean m169805T1(Menu menu) {
        AccountModule.f16756c.m29297M1().mo120707b(act());
        if (TEnum.equals(this.f149744e, VerifyReason.signin)) {
            if (!AccountModule.f16759f.m206042m(String.valueOf(this.f149745f.code))) {
                return false;
            }
            menu.add(0, wcc0.f188410F, 0, R$string.f16984p2).setShowAsAction(2);
            return true;
        }
        if (!C16074bp.m105756k()) {
            return false;
        }
        menu.add(0, wcc0.f188414J, 0, "遇到问题？").setShowAsAction(2);
        return true;
    }

    /* JADX INFO: renamed from: U1 */
    public boolean m169806U1(MenuItem menuItem) {
        if (menuItem.getItemId() != wcc0.f188410F) {
            if (menuItem.getItemId() != wcc0.f188414J) {
                return false;
            }
            i4g0.m138520r("e_prelogin_mobile_num_page_feedback", pageId());
            act().startActivity(WebViewAct.m81348b2(act(), "帮助与反馈", ebe0.m120159a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
            return true;
        }
        i4g0.m138523u("e_password_verifypage_switch_button", pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f149747h));
        if (((hz60) this.viewModel).m137855I() == 86) {
            m169814c2();
        } else {
            ((hz60) this.viewModel).act().startActivity(VerifyCodeInputAct.m29522c2(((hz60) this.viewModel).act(), VerifyReason.get(VerifyReason.signin), ((hz60) this.viewModel).m137855I(), this.f149747h, false));
        }
        ((hz60) this.viewModel).act().m68056e2();
        return true;
    }

    /* JADX INFO: renamed from: V1 */
    public void m169807V1(PhoneNumberInputAct phoneNumberInputAct, l4g0 l4g0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((hz60) this.viewModel).act().pageId().equals("p_sign_in_password_view")) {
                jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, this.f149747h);
            } else if (((hz60) this.viewModel).act().pageId().equals("p_sign_in_phone_number_view")) {
                jSONObject.put("phone_show_type", "SHORE_CUT_ACT".equals(this.f149746g) ? "switch_signin" : "direct_signin");
            }
            l4g0Var.m152780o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final void m169808W1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        act().progress(R$string.f16946j0);
        duringCreated(AccountModule.f16756c.m29269A2(verifyData)).subscribe(psd0.m173597H(new y20() { // from class: l.zx60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206441a.m169793E1(verifyData, (uxj0) obj);
            }
        }, new y20() { // from class: l.ay60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73948a.m169794F1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X1 */
    public void m169809X1() {
        final VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.countryCode = ((hz60) this.viewModel).m137855I();
        verifyData.mobileNumber = this.f149747h;
        verifyData.codeLength = 4;
        verifyData.action = VerifyReason.get(VerifyReason.signup_signin);
        if (!TextUtils.isEmpty(this.f149750k)) {
            verifyData.captchaToken = this.f149750k;
        }
        if (!TextUtils.isEmpty(this.f149751l)) {
            verifyData.captchaValue = this.f149751l;
        }
        Objects.toString(verifyData.action);
        AccountModule.f16756c.m29323b2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.vx60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186238a.m169795H1(verifyData, (RiskVerification) obj);
            }
        }, new y20() { // from class: l.wx60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191373a.m169797J1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Y1 */
    public void m169810Y1(CharSequence charSequence) {
        this.f149748i = charSequence.toString();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m169811Z1() {
        ((hz60) this.viewModel).act().startActivity(PhoneNumberVerifyAct.m29493X1(((hz60) this.viewModel).act(), ((hz60) this.viewModel).m137855I(), this.f149747h));
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.ey60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96402a.m169828u1((Bundle) obj);
            }
        });
        creates(new y20() { // from class: l.gy60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107034a.m169829v1((Bundle) obj);
            }
        });
        m169824q1();
    }

    /* JADX INFO: renamed from: a2 */
    public final void m169812a2(String str, String str2, y20<String> y20Var) {
        SignInData signInData = new SignInData();
        signInData.isSmartlock = true;
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        signInData.password = str2;
        signInData.username = str;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        m139325J0(signInData, null, y20Var);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m169813b2() {
        SignInData signInData = new SignInData();
        signInData.username = ((hz60) this.viewModel).m137855I() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + jyb.m147528q(this.f149747h);
        signInData.code = Integer.valueOf(((hz60) this.viewModel).m137855I());
        act().startActivity(PhoneNumberInputAct.m29490a2(((hz60) this.viewModel).act(), VerifyReason.get(VerifyReason.signin), signInData));
    }

    /* JADX INFO: renamed from: c2 */
    public void m169814c2() {
        ((hz60) this.viewModel).act().startActivity(VerifyCodeInputAct.m29520a2(((hz60) this.viewModel).act(), VerifyReason.get(VerifyReason.signup_signin), ((hz60) this.viewModel).m137855I(), this.f149747h));
    }

    /* JADX INFO: renamed from: d2 */
    public void m169815d2() {
        i4g0.m138523u("e_password_verifypage_signin_button", ((hz60) this.viewModel).act().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f149747h));
    }

    /* JADX INFO: renamed from: e2 */
    public List<Object> m169816e2() {
        VerifyReason verifyReason = this.f149744e;
        return jyb.m147507f0(Reason.TYPE, verifyReason == null ? "" : verifyReason.toString(), og3.f147186a);
    }

    /* JADX INFO: renamed from: f2 */
    public void m169817f2(CharSequence charSequence) {
        if (this.f149749j && charSequence.length() > 0) {
            this.f149749j = false;
        }
        if ("p_sign_in_phone_number_view".equals(((hz60) this.viewModel).act().pageId()) && charSequence.length() > 0) {
            g4g0.m128878a("e_phone_input", ((hz60) this.viewModel).act().pageId(), getClass().getName(), new Object[0]);
        }
        String strM137857K = ((hz60) this.viewModel).m137857K();
        this.f149747h = strM137857K;
        if (strM137857K == null) {
            CrashHelper.m82479c(new Exception("mobileNumber == null in PhoneNumberInputAct on line 368"));
        }
        ((hz60) this.viewModel).m137881j0();
        if (((hz60) this.viewModel).m137877f0() && this.f149747h.length() == 11 && m169821n1(this.f149747h)) {
            ((hz60) this.viewModel).m137878g0();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m169818g2() {
        ((hz60) this.viewModel).act().startActivity(VerifyCodeInputAct.m29520a2(((hz60) this.viewModel).act(), this.f149744e, ((hz60) this.viewModel).m137855I(), this.f149747h));
    }

    /* JADX INFO: renamed from: h2 */
    public void m169819h2(boolean z) {
        if (!z) {
            this.f149753n++;
            return;
        }
        if (!TEnum.equals(this.f149744e, VerifyReason.signin)) {
            if (TEnum.equals(this.f149744e, VerifyReason.signup)) {
                i4g0.m138523u("e_phone_continue_button", ((hz60) this.viewModel).act().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, ((hz60) this.viewModel).m137856J()));
                m169820i2();
                return;
            } else {
                if (TEnum.equals(this.f149744e, VerifyReason.ban_appeal)) {
                    m169818g2();
                    return;
                }
                return;
            }
        }
        SignInData signInData = this.f149745f;
        signInData.password = this.f149748i;
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        this.f149745f.device = new Device();
        this.f149745f.device.identifiers = tl8.m191617N();
        if (!TextUtils.isEmpty(this.f149750k)) {
            this.f149745f.captchaToken = this.f149750k;
        }
        if (!TextUtils.isEmpty(this.f149751l)) {
            this.f149745f.captchaValue = this.f149751l;
        }
        m139325J0(this.f149745f, new x20() { // from class: l.ky60
            @Override // p153l.x20
            public final void call() {
                this.f129286a.m169798L1();
            }
        }, new y20() { // from class: l.ly60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134032a.m169800O1((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public final void m169820i2() {
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = this.f149744e;
        verifyData.countryCode = ((hz60) this.viewModel).m137855I();
        verifyData.mobileNumber = this.f149747h;
        ((hz60) this.viewModel).act().progress(R$string.f16946j0);
        if (verifyData.countryCode == 86) {
            m169809X1();
        } else {
            AccountModule.f16756c.m29277E2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.my60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139317a.m169802Q1((AccountErrorResponse) obj);
                }
            }, new y20() { // from class: l.ny60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144291a.m169801P1((Throwable) obj);
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m169821n1(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!((hz60) this.viewModel).m137877f0()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public final void m169798L1() {
        this.f149750k = "";
        this.f149751l = "";
        if (NullChecker.m82486a(this.f149745f)) {
            SignInData signInData = this.f149745f;
            signInData.captchaToken = "";
            signInData.captchaValue = "";
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m169823p1(VerifyReason verifyReason, SignInData signInData, String str) {
        this.f149744e = verifyReason;
        this.f149745f = signInData;
        this.f149746g = str;
    }

    public String pageId() {
        if (NullChecker.m82486a(this.f149744e) && TEnum.equals(this.f149744e, VerifyReason.ban_appeal)) {
            return "p_appeal_verify_phonenumber";
        }
        return NullChecker.m82486a(this.f149745f) ? "p_sign_in_password_view" : "p_sign_in_phone_number_view";
    }

    /* JADX INFO: renamed from: q1 */
    public void m169824q1() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.hy60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112100a.m169826s1((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public final void m169825r1() {
        this.f149752m = b1w.m101505c(((hz60) this.viewModel).act());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m169826s1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((hz60) this.viewModel).m137881j0();
        } else if (c4470c == C4470c.f16268j) {
            ((hz60) this.viewModel).m137879h0();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m169827t1() {
        ((hz60) this.viewModel).m137882k0();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m169828u1(Bundle bundle) {
        if (TEnum.equals(this.f149744e, VerifyReason.signup)) {
            l51.m152886F(act(), new Runnable() { // from class: l.jy60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123111a.m169827t1();
                }
            });
            m169825r1();
        }
        if (TEnum.equals(this.f149744e, VerifyReason.signup)) {
            this.f149749j = true;
        }
        ((hz60) this.viewModel).m137880i0(this.f149744e, this.f149745f);
        ((hz60) this.viewModel).m137858L(this.f149744e);
        ((hz60) this.viewModel).m137859M(this.f149744e);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m169829v1(Bundle bundle) {
        if (TEnum.equals(this.f149744e, VerifyReason.signup)) {
            qsf0.m177799d().m177803g(act());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m169830x1(final Credential credential) {
        String strM12422J = credential.m12422J();
        if (!TextUtils.isEmpty(strM12422J) && strM12422J.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).length == 2) {
            m169812a2(credential.m12422J(), credential.getPassword(), new y20() { // from class: l.iy60
                @Override // p153l.y20
                public final void call(Object obj) {
                    oy60.m169772U0(credential, (String) obj);
                }
            });
        } else {
            qsf0.m177799d().m177800c(credential);
            o1j0.m165634h(R$string.f16845Q3);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m169831z1(VerifyData verifyData, uxj0 uxj0Var) {
        act().hideInput();
        ((hz60) this.viewModel).act().progressDismiss();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m139331r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m29497c2(((hz60) this.viewModel).act(), verifyData, false, false));
        }
        act().m68056e2();
    }

    @Override // p153l.ibf0, p153l.k3m
    public void destroy() {
    }
}
