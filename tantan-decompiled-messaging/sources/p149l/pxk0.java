package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.C4629a;
import com.p046p1.mobile.putong.account.p050ui.accountnew.PasswordResetNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.PhoneNumberInputAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.ConfirmCodeResponse;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.PhoneNumber;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class pxk0 extends b3f0<C4629a> {

    /* JADX INFO: renamed from: e */
    public VerifyReason f151694e;

    /* JADX INFO: renamed from: f */
    public int f151695f;

    /* JADX INFO: renamed from: g */
    public String f151696g;

    /* JADX INFO: renamed from: h */
    public String f151697h;

    /* JADX INFO: renamed from: i */
    public VerifyData f151698i;

    /* JADX INFO: renamed from: j */
    public boolean f151699j;

    /* JADX INFO: renamed from: k */
    public boolean f151700k;

    /* JADX INFO: renamed from: l */
    public String f151701l;

    /* JADX INFO: renamed from: m */
    public String f151702m;

    /* JADX INFO: renamed from: n */
    public Runnable f151703n;

    /* JADX INFO: renamed from: o */
    public d30 f151704o;

    public pxk0(mcr mcrVar) {
        super(mcrVar);
        this.f151698i = new VerifyData();
        this.f151703n = new Runnable() { // from class: l.uwk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178656a.m171856C1();
            }
        };
        this.f151704o = new d30() { // from class: l.fxk0
            @Override // p149l.d30
            public final void call() {
                this.f99775a.m171880D1();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public /* synthetic */ void m171856C1() {
        zvf0.m220396r("e_appeal_phone_number_verification_send", act().pageId());
        if (this.f151695f == 86 && this.f151700k) {
            VerifyReason verifyReason = VerifyReason.get(VerifyReason.signup_signin);
            this.f151694e = verifyReason;
            ((C4629a) this.viewModel).m28575e0(verifyReason);
            return;
        }
        ((C4629a) this.viewModel).m28554G();
        if (!TEnum.equals(this.f151694e, VerifyReason.signup) && !TEnum.equals(this.f151694e, VerifyReason.forgot_password)) {
            TEnum.equals(this.f151694e, VerifyReason.signin);
        }
        if (!TextUtils.isEmpty(this.f151701l)) {
            this.f151698i.captchaToken = this.f151701l;
        }
        if (!TextUtils.isEmpty(this.f151702m)) {
            this.f151698i.captchaValue = this.f151702m;
        }
        Objects.toString(this.f151694e);
        Objects.toString(this.f151698i.action);
        VerifyData verifyData = this.f151698i;
        int i = verifyData.countryCode;
        String str = verifyData.mobileNumber;
        AccountModule.f16037c.m28324b2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.mxk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136182a.m171909z1((RiskVerification) obj);
            }
        }, new e30() { // from class: l.nxk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141033a.m171879B1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m171862W0(Throwable th) {
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m171865a1(Throwable th) {
    }

    /* JADX INFO: renamed from: n1 */
    private void m171878n1() {
        this.f151701l = "";
        this.f151702m = "";
        VerifyData verifyData = this.f151698i;
        verifyData.captchaToken = "";
        verifyData.captchaValue = "";
        verifyData.captcha = null;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m171879B1(Throwable th) {
        th.getMessage();
        m171878n1();
        ((C4629a) this.viewModel).m28574d0(th, this.f151694e, this.f151696g);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m171880D1() {
        ((C4629a) this.viewModel).m28573c0(this.f151698i, this.f151694e, this.f151695f, this.f151696g, this.f151699j);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m171881E1() {
        e51.m114746K(m171901p1(this.f151694e));
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m171882F1(VerifyData verifyData, roj0 roj0Var) {
        Objects.toString(verifyData.action);
        ((C4629a) this.viewModel).m28582l0();
        if (TEnum.equals(this.f151694e, VerifyReason.forgot_password)) {
            act().startActivity(PasswordResetNewAct.m28489V1(act(), verifyData));
            act().m66873d2();
            return;
        }
        if (TEnum.equals(this.f151694e, VerifyReason.ban_appeal)) {
            PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
            phoneNumberNew_.countryCode = this.f151695f;
            phoneNumberNew_.number = this.f151696g;
            AccountModule.m28132H().verifyAppealIdentity(act(), phoneNumberNew_);
            return;
        }
        if (TEnum.equals(verifyData.action, VerifyReason.signup)) {
            m171897X1();
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(verifyData.code);
        signInData.verifyType = verifyData.verifyType;
        signInData.username = this.f151695f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f151696g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        m100082J0(signInData, new d30() { // from class: l.gxk0
            @Override // p149l.d30
            public final void call() {
                this.f104903a.m171881E1();
            }
        }, null);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m171883H1(Throwable th) {
        th.getMessage();
        ((C4629a) this.viewModel).m28574d0(th, this.f151694e, this.f151696g);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m171884I1(d30 d30Var, roj0 roj0Var) {
        ((C4629a) this.viewModel).m28582l0();
        d30Var.call();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m171885J1(Throwable th) {
        ((C4629a) this.viewModel).m28581k0(this.f151694e, this.f151698i, this.f151695f, this.f151696g, th);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m171886L1() {
        e51.m114746K(m171901p1(this.f151694e));
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m171887N1(ConfirmCodeResponse confirmCodeResponse) {
        if (confirmCodeResponse.action.equals(VerifyReason.signup)) {
            m171897X1();
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(((C4629a) this.viewModel).m28558K());
        signInData.username = this.f151695f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f151696g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        m100082J0(signInData, new d30() { // from class: l.cxk0
            @Override // p149l.d30
            public final void call() {
                this.f82879a.m171886L1();
            }
        }, null);
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m171888O1(Throwable th) {
        ((C4629a) this.viewModel).m28581k0(this.f151694e, this.f151698i, this.f151695f, this.f151696g, th);
    }

    /* JADX INFO: renamed from: P1 */
    public void m171889P1() {
        ((C4629a) this.viewModel).m28572b0(this.f151694e);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m171890Q1(Menu menu) {
        AccountModule.f16037c.m28298M1().mo95158b(act());
        if ((!TEnum.equals(this.f151694e, VerifyReason.signin) || this.f151699j) && !TEnum.equals(this.f151694e, VerifyReason.fix_verify_code_hack) && !TEnum.equals(this.f151694e, VerifyReason.signup_signin)) {
            return false;
        }
        ((C4629a) this.viewModel).m28552E(menu);
        return true;
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m171891R1(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            ((C4629a) this.viewModel).m28556I();
            return true;
        }
        if (menuItem.getItemId() != q4c0.f152606l0) {
            return false;
        }
        SignInData signInData = new SignInData();
        signInData.username = this.f151695f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + vwb.m200345q(this.f151696g);
        signInData.code = Integer.valueOf(this.f151695f);
        zvf0.m220399u("e_verification_code_bypassword_button", ((C4629a) this.viewModel).act().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, TextUtils.isEmpty(this.f151696g) ? "null" : this.f151696g));
        ((C4629a) this.viewModel).act().startActivity(PhoneNumberInputAct.m28491Z1(((C4629a) this.viewModel).act(), VerifyReason.get(VerifyReason.signin), signInData));
        ((C4629a) this.viewModel).act().m66873d2();
        return true;
    }

    /* JADX INFO: renamed from: S1 */
    public void m171892S1(cwf0 cwf0Var) {
        if (this.f151695f == 86) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        VerifyReason verifyReason = this.f151694e;
        String str = VerifyReason.signup;
        if (!TEnum.equals(verifyReason, VerifyReason.signup)) {
            VerifyReason verifyReason2 = this.f151694e;
            str = VerifyReason.signin;
            if (TEnum.equals(verifyReason2, VerifyReason.signin)) {
                if (this.f151699j) {
                    str = "new_device";
                }
            } else if (TEnum.equals(this.f151694e, VerifyReason.forgot_password)) {
                str = "reset_password";
            } else {
                str = TEnum.equals(this.f151694e, VerifyReason.ban_appeal) ? "appeal" : LiveRegionTag.others;
            }
        }
        try {
            jSONObject.put("verify_code_type", str);
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, this.f151696g);
            jSONObject.put("ban_type", (NullChecker.m81303a(qib0.f154713b0) && NullChecker.m81303a(qib0.f154713b0.f139231b) && NullChecker.m81303a(qib0.f154713b0.f139231b.me_())) ? qib0.f154713b0.f139231b.me_().banStatus.code : 0);
            cwf0Var.m109039o(jSONObject);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m171893T1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        Objects.toString(this.f151694e);
        duringCreated(AccountModule.f16037c.m28270A2(verifyData)).subscribe(mkd0.m154956H(new e30() { // from class: l.dxk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88308a.m171882F1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.exk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93677a.m171883H1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public void m171894U1(Bundle bundle) {
        bundle.putSerializable("REASON", this.f151694e);
        bundle.putInt("COUNTRY_CODE", this.f151695f);
        bundle.putString("PHONE_NUMBER", this.f151696g);
        bundle.putString("PASSWORD", this.f151697h);
        bundle.putBoolean("IS_NEW_DEVICE", this.f151699j);
    }

    /* JADX INFO: renamed from: V1 */
    public void m171895V1(Pair<String, String> pair) {
        this.f151701l = (String) pair.first;
        this.f151702m = (String) pair.second;
    }

    /* JADX INFO: renamed from: W1 */
    public void m171896W1(boolean z) {
        this.f151700k = z;
    }

    /* JADX INFO: renamed from: X1 */
    public void m171897X1() {
        ((C4629a) this.viewModel).act().startActivity(SignUpDetailsNewAct.m28498b2(((C4629a) this.viewModel).act(), this.f151698i, false, false));
        ((C4629a) this.viewModel).act().m66873d2();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX INFO: renamed from: Y1 */
    public void m171898Y1(final d30 d30Var) {
        boolean z;
        ((C4629a) this.viewModel).act().progress(R$string.f16227j0);
        if (TEnum.equals(this.f151694e, VerifyReason.ban_appeal)) {
            User userMe_ = AccountModule.m28132H().me_();
            CrashHelper.ReportLevel reportLevel = CrashHelper.ReportLevel.p9;
            if (NullChecker.m81305c(userMe_, SchemeKey.account, reportLevel) && NullChecker.m81305c(userMe_.settings, SchemeKey.account, reportLevel)) {
                PhoneNumber phoneNumber = userMe_.settings.phoneNumber;
                if (phoneNumber.countryCode == 0 || TextUtils.isEmpty(phoneNumber.number)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            String strPageId = ((C4629a) this.viewModel).act().pageId();
            n6j0.m158048b("e_p_appeal_verify_phonenumber_page_next", strPageId, n6j0.C18629a.m158055f("is_binding_phonenumber", z ? "1" : "0"), n6j0.C18629a.m158055f("is_checked", "" + ((C4629a) this.viewModel).f16487l.isChecked()));
        }
        AccountModule.f16037c.m28270A2(this.f151698i).subscribe(mkd0.m154959K(new e30() { // from class: l.axk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72191a.m171884I1(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.bxk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77801a.m171885J1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Z1 */
    public void m171899Z1() {
        ((C4629a) this.viewModel).act().progress(R$string.f16227j0);
        AccountModule.f16037c.m28281F2(this.f151698i).subscribe(mkd0.m154959K(new e30() { // from class: l.ywk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200513a.m171887N1((ConfirmCodeResponse) obj);
            }
        }, new e30() { // from class: l.zwk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205238a.m171888O1((Throwable) obj);
            }
        }, false));
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.hxk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109884a.m171907v1((C4319c) obj);
            }
        }));
        creates(new e30() { // from class: l.ixk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115375a.m171908x1((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.m198623e().f181687b).filter(new w9j() { // from class: l.jxk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.kxk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125140a.m171906u1((Captcha) obj);
            }
        }, new e30() { // from class: l.lxk0
            @Override // p149l.e30
            public final void call(Object obj) {
                pxk0.m171862W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o1 */
    public VerifyReason m171900o1() {
        return this.f151694e;
    }

    /* JADX INFO: renamed from: p1 */
    public String m171901p1(VerifyReason verifyReason) {
        StringBuilder sb = new StringBuilder();
        sb.append(((C4629a) this.viewModel).act().getLocalClassName());
        sb.append(verifyReason == null ? "" : verifyReason.toString());
        return sb.toString();
    }

    public String pageId() {
        Intent intent = act().getIntent();
        return (NullChecker.m81303a(intent) && TEnum.equals((VerifyReason) intent.getSerializableExtra("REASON"), VerifyReason.ban_appeal)) ? "p_appeal_verify_phonenumber" : "p_sign_in_verification_code_view";
    }

    /* JADX INFO: renamed from: q1 */
    public void m171902q1() {
        duringCreated(e51.m114749N(m171901p1(this.f151694e), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.vwk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183353a.m171904s1((Long) obj);
            }
        }, new e30() { // from class: l.wwk0
            @Override // p149l.e30
            public final void call(Object obj) {
                pxk0.m171865a1((Throwable) obj);
            }
        }, new d30() { // from class: l.xwk0
            @Override // p149l.d30
            public final void call() {
                this.f194742a.m171905t1();
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public void m171903r1(VerifyReason verifyReason, int i, String str, String str2, VerifyData verifyData, boolean z) {
        this.f151694e = verifyReason;
        this.f151695f = i;
        this.f151696g = str;
        this.f151697h = str2;
        this.f151698i = verifyData;
        this.f151699j = z;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m171904s1(Long l2) {
        ((C4629a) this.viewModel).m28579i0(l2.longValue());
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m171905t1() {
        ((C4629a) this.viewModel).m28577g0(this.f151696g);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m171906u1(Captcha captcha) {
        if (NullChecker.m81303a(captcha)) {
            this.f151698i.captcha = captcha;
            this.f151703n.run();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m171907v1(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            ((C4629a) this.viewModel).m28555H();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m171908x1(Bundle bundle) {
        ((C4629a) this.viewModel).m28557J(this.f151694e, this.f151695f, this.f151696g, this.f151698i, this.f151699j, this.f151697h);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m171909z1(RiskVerification riskVerification) {
        m171878n1();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (c5d0.m105290b(act(), riskVerification, this.f151698i, new c5d0.InterfaceC16073a() { // from class: l.oxk0
            @Override // p149l.c5d0.InterfaceC16073a
            /* JADX INFO: renamed from: a */
            public final void mo105292a(VerifyData verifyData) {
                this.f146220a.m171893T1(verifyData);
            }
        })) {
            return;
        }
        ((C4629a) this.viewModel).m28575e0(this.f151694e);
    }
}
