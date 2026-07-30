package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.C4780a;
import com.p051p1.mobile.putong.account.p055ui.accountnew.PasswordResetNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.PhoneNumberInputAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.ConfirmCodeResponse;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.PhoneNumber;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class v6l0 extends ibf0<C4780a> {

    /* JADX INFO: renamed from: e */
    public VerifyReason f182659e;

    /* JADX INFO: renamed from: f */
    public int f182660f;

    /* JADX INFO: renamed from: g */
    public String f182661g;

    /* JADX INFO: renamed from: h */
    public String f182662h;

    /* JADX INFO: renamed from: i */
    public VerifyData f182663i;

    /* JADX INFO: renamed from: j */
    public boolean f182664j;

    /* JADX INFO: renamed from: k */
    public boolean f182665k;

    /* JADX INFO: renamed from: l */
    public String f182666l;

    /* JADX INFO: renamed from: m */
    public String f182667m;

    /* JADX INFO: renamed from: n */
    public Runnable f182668n;

    /* JADX INFO: renamed from: o */
    public x20 f182669o;

    public v6l0(ner nerVar) {
        super(nerVar);
        this.f182663i = new VerifyData();
        this.f182668n = new Runnable() { // from class: l.a6l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f68738a.m200077C1();
            }
        };
        this.f182669o = new x20() { // from class: l.l6l0
            @Override // p153l.x20
            public final void call() {
                this.f130267a.m200101D1();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public /* synthetic */ void m200077C1() {
        i4g0.m138520r("e_appeal_phone_number_verification_send", act().pageId());
        if (this.f182660f == 86 && this.f182665k) {
            VerifyReason verifyReason = VerifyReason.get(VerifyReason.signup_signin);
            this.f182659e = verifyReason;
            ((C4780a) this.viewModel).m29574e0(verifyReason);
            return;
        }
        ((C4780a) this.viewModel).m29553G();
        if (!TEnum.equals(this.f182659e, VerifyReason.signup) && !TEnum.equals(this.f182659e, VerifyReason.forgot_password)) {
            TEnum.equals(this.f182659e, VerifyReason.signin);
        }
        if (!TextUtils.isEmpty(this.f182666l)) {
            this.f182663i.captchaToken = this.f182666l;
        }
        if (!TextUtils.isEmpty(this.f182667m)) {
            this.f182663i.captchaValue = this.f182667m;
        }
        Objects.toString(this.f182659e);
        Objects.toString(this.f182663i.action);
        VerifyData verifyData = this.f182663i;
        int i = verifyData.countryCode;
        String str = verifyData.mobileNumber;
        AccountModule.f16756c.m29323b2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.s6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166585a.m200130z1((RiskVerification) obj);
            }
        }, new y20() { // from class: l.t6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172351a.m200100B1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m200083W0(Throwable th) {
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m200086a1(Throwable th) {
    }

    /* JADX INFO: renamed from: n1 */
    private void m200099n1() {
        this.f182666l = "";
        this.f182667m = "";
        VerifyData verifyData = this.f182663i;
        verifyData.captchaToken = "";
        verifyData.captchaValue = "";
        verifyData.captcha = null;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m200100B1(Throwable th) {
        th.getMessage();
        m200099n1();
        ((C4780a) this.viewModel).m29573d0(th, this.f182659e, this.f182661g);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m200101D1() {
        ((C4780a) this.viewModel).m29572c0(this.f182663i, this.f182659e, this.f182660f, this.f182661g, this.f182664j);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m200102E1() {
        l51.m152891K(m200122p1(this.f182659e));
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m200103F1(VerifyData verifyData, uxj0 uxj0Var) {
        Objects.toString(verifyData.action);
        ((C4780a) this.viewModel).m29581l0();
        if (TEnum.equals(this.f182659e, VerifyReason.forgot_password)) {
            act().startActivity(PasswordResetNewAct.m29488X1(act(), verifyData));
            act().m68056e2();
            return;
        }
        if (TEnum.equals(this.f182659e, VerifyReason.ban_appeal)) {
            PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
            phoneNumberNew_.countryCode = this.f182660f;
            phoneNumberNew_.number = this.f182661g;
            AccountModule.m29131H().verifyAppealIdentity(act(), phoneNumberNew_);
            return;
        }
        if (TEnum.equals(verifyData.action, VerifyReason.signup)) {
            m200118X1();
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(verifyData.code);
        signInData.verifyType = verifyData.verifyType;
        signInData.username = this.f182660f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f182661g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        m139325J0(signInData, new x20() { // from class: l.m6l0
            @Override // p153l.x20
            public final void call() {
                this.f135014a.m200102E1();
            }
        }, null);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m200104H1(Throwable th) {
        th.getMessage();
        ((C4780a) this.viewModel).m29573d0(th, this.f182659e, this.f182661g);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m200105I1(x20 x20Var, uxj0 uxj0Var) {
        ((C4780a) this.viewModel).m29581l0();
        x20Var.call();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m200106J1(Throwable th) {
        ((C4780a) this.viewModel).m29580k0(this.f182659e, this.f182663i, this.f182660f, this.f182661g, th);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m200107L1() {
        l51.m152891K(m200122p1(this.f182659e));
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m200108N1(ConfirmCodeResponse confirmCodeResponse) {
        if (confirmCodeResponse.action.equals(VerifyReason.signup)) {
            m200118X1();
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(((C4780a) this.viewModel).m29557K());
        signInData.username = this.f182660f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f182661g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        m139325J0(signInData, new x20() { // from class: l.i6l0
            @Override // p153l.x20
            public final void call() {
                this.f113176a.m200107L1();
            }
        }, null);
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m200109O1(Throwable th) {
        ((C4780a) this.viewModel).m29580k0(this.f182659e, this.f182663i, this.f182660f, this.f182661g, th);
    }

    /* JADX INFO: renamed from: P1 */
    public void m200110P1() {
        ((C4780a) this.viewModel).m29571b0(this.f182659e);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m200111Q1(Menu menu) {
        AccountModule.f16756c.m29297M1().mo120707b(act());
        if ((!TEnum.equals(this.f182659e, VerifyReason.signin) || this.f182664j) && !TEnum.equals(this.f182659e, VerifyReason.fix_verify_code_hack) && !TEnum.equals(this.f182659e, VerifyReason.signup_signin)) {
            return false;
        }
        ((C4780a) this.viewModel).m29551E(menu);
        return true;
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m200112R1(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            ((C4780a) this.viewModel).m29555I();
            return true;
        }
        if (menuItem.getItemId() != wcc0.f188454l0) {
            return false;
        }
        SignInData signInData = new SignInData();
        signInData.username = this.f182660f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + jyb.m147528q(this.f182661g);
        signInData.code = Integer.valueOf(this.f182660f);
        i4g0.m138523u("e_verification_code_bypassword_button", ((C4780a) this.viewModel).act().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, TextUtils.isEmpty(this.f182661g) ? "null" : this.f182661g));
        ((C4780a) this.viewModel).act().startActivity(PhoneNumberInputAct.m29490a2(((C4780a) this.viewModel).act(), VerifyReason.get(VerifyReason.signin), signInData));
        ((C4780a) this.viewModel).act().m68056e2();
        return true;
    }

    /* JADX INFO: renamed from: S1 */
    public void m200113S1(l4g0 l4g0Var) {
        if (this.f182660f == 86) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        VerifyReason verifyReason = this.f182659e;
        String str = VerifyReason.signup;
        if (!TEnum.equals(verifyReason, VerifyReason.signup)) {
            VerifyReason verifyReason2 = this.f182659e;
            str = VerifyReason.signin;
            if (TEnum.equals(verifyReason2, VerifyReason.signin)) {
                if (this.f182664j) {
                    str = "new_device";
                }
            } else if (TEnum.equals(this.f182659e, VerifyReason.forgot_password)) {
                str = "reset_password";
            } else {
                str = TEnum.equals(this.f182659e, VerifyReason.ban_appeal) ? "appeal" : LiveRegionTag.others;
            }
        }
        try {
            jSONObject.put("verify_code_type", str);
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, this.f182661g);
            jSONObject.put("ban_type", (NullChecker.m82486a(uqb0.f180396b0) && NullChecker.m82486a(uqb0.f180396b0.f170325b) && NullChecker.m82486a(uqb0.f180396b0.f170325b.me_())) ? uqb0.f180396b0.f170325b.me_().banStatus.code : 0);
            l4g0Var.m152780o(jSONObject);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m200114T1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        Objects.toString(this.f182659e);
        duringCreated(AccountModule.f16756c.m29269A2(verifyData)).subscribe(psd0.m173597H(new y20() { // from class: l.j6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118568a.m200103F1(verifyData, (uxj0) obj);
            }
        }, new y20() { // from class: l.k6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124188a.m200104H1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public void m200115U1(Bundle bundle) {
        bundle.putSerializable("REASON", this.f182659e);
        bundle.putInt("COUNTRY_CODE", this.f182660f);
        bundle.putString("PHONE_NUMBER", this.f182661g);
        bundle.putString("PASSWORD", this.f182662h);
        bundle.putBoolean("IS_NEW_DEVICE", this.f182664j);
    }

    /* JADX INFO: renamed from: V1 */
    public void m200116V1(Pair<String, String> pair) {
        this.f182666l = (String) pair.first;
        this.f182667m = (String) pair.second;
    }

    /* JADX INFO: renamed from: W1 */
    public void m200117W1(boolean z) {
        this.f182665k = z;
    }

    /* JADX INFO: renamed from: X1 */
    public void m200118X1() {
        ((C4780a) this.viewModel).act().startActivity(SignUpDetailsNewAct.m29497c2(((C4780a) this.viewModel).act(), this.f182663i, false, false));
        ((C4780a) this.viewModel).act().m68056e2();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX INFO: renamed from: Y1 */
    public void m200119Y1(final x20 x20Var) {
        boolean z;
        ((C4780a) this.viewModel).act().progress(R$string.f16946j0);
        if (TEnum.equals(this.f182659e, VerifyReason.ban_appeal)) {
            User userMe_ = AccountModule.m29131H().me_();
            CrashHelper.ReportLevel reportLevel = CrashHelper.ReportLevel.p9;
            if (NullChecker.m82488c(userMe_, SchemeKey.account, reportLevel) && NullChecker.m82488c(userMe_.settings, SchemeKey.account, reportLevel)) {
                PhoneNumber phoneNumber = userMe_.settings.phoneNumber;
                if (phoneNumber.countryCode == 0 || TextUtils.isEmpty(phoneNumber.number)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            String strPageId = ((C4780a) this.viewModel).act().pageId();
            rfj0.m181214b("e_p_appeal_verify_phonenumber_page_next", strPageId, rfj0.C19825a.m181221f("is_binding_phonenumber", z ? "1" : "0"), rfj0.C19825a.m181221f("is_checked", "" + ((C4780a) this.viewModel).f17206l.isChecked()));
        }
        AccountModule.f16756c.m29269A2(this.f182663i).subscribe(psd0.m173600K(new y20() { // from class: l.g6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102467a.m200105I1(x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.h6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108037a.m200106J1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Z1 */
    public void m200120Z1() {
        ((C4780a) this.viewModel).act().progress(R$string.f16946j0);
        AccountModule.f16756c.m29280F2(this.f182663i).subscribe(psd0.m173600K(new y20() { // from class: l.e6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92289a.m200108N1((ConfirmCodeResponse) obj);
            }
        }, new y20() { // from class: l.f6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97413a.m200109O1((Throwable) obj);
            }
        }, false));
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.n6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140474a.m200128v1((C4470c) obj);
            }
        }));
        creates(new y20() { // from class: l.o6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145191a.m200129x1((Bundle) obj);
            }
        });
        act().duringCreated(esf0.m122324e().f95596b).filter(new qcj() { // from class: l.p6l0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.q6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155822a.m200127u1((Captcha) obj);
            }
        }, new y20() { // from class: l.r6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                v6l0.m200083W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o1 */
    public VerifyReason m200121o1() {
        return this.f182659e;
    }

    /* JADX INFO: renamed from: p1 */
    public String m200122p1(VerifyReason verifyReason) {
        StringBuilder sb = new StringBuilder();
        sb.append(((C4780a) this.viewModel).act().getLocalClassName());
        sb.append(verifyReason == null ? "" : verifyReason.toString());
        return sb.toString();
    }

    public String pageId() {
        Intent intent = act().getIntent();
        return (NullChecker.m82486a(intent) && TEnum.equals((VerifyReason) intent.getSerializableExtra("REASON"), VerifyReason.ban_appeal)) ? "p_appeal_verify_phonenumber" : "p_sign_in_verification_code_view";
    }

    /* JADX INFO: renamed from: q1 */
    public void m200123q1() {
        duringCreated(l51.m152894N(m200122p1(this.f182659e), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.b6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75198a.m200125s1((Long) obj);
            }
        }, new y20() { // from class: l.c6l0
            @Override // p153l.y20
            public final void call(Object obj) {
                v6l0.m200086a1((Throwable) obj);
            }
        }, new x20() { // from class: l.d6l0
            @Override // p153l.x20
            public final void call() {
                this.f85384a.m200126t1();
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public void m200124r1(VerifyReason verifyReason, int i, String str, String str2, VerifyData verifyData, boolean z) {
        this.f182659e = verifyReason;
        this.f182660f = i;
        this.f182661g = str;
        this.f182662h = str2;
        this.f182663i = verifyData;
        this.f182664j = z;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m200125s1(Long l2) {
        ((C4780a) this.viewModel).m29578i0(l2.longValue());
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m200126t1() {
        ((C4780a) this.viewModel).m29576g0(this.f182661g);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m200127u1(Captcha captcha) {
        if (NullChecker.m82486a(captcha)) {
            this.f182663i.captcha = captcha;
            this.f182668n.run();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m200128v1(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            ((C4780a) this.viewModel).m29554H();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m200129x1(Bundle bundle) {
        ((C4780a) this.viewModel).m29556J(this.f182659e, this.f182660f, this.f182661g, this.f182663i, this.f182664j, this.f182662h);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m200130z1(RiskVerification riskVerification) {
        m200099n1();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (fdd0.m125084b(act(), riskVerification, this.f182663i, new fdd0.InterfaceC16952a() { // from class: l.u6l0
            @Override // p153l.fdd0.InterfaceC16952a
            /* JADX INFO: renamed from: a */
            public final void mo114913a(VerifyData verifyData) {
                this.f177793a.m200114T1(verifyData);
            }
        })) {
            return;
        }
        ((C4780a) this.viewModel).m29574e0(this.f182659e);
    }
}
