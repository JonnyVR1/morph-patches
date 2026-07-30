package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.C0055a;
import com.p000p1.mobile.putong.account.p002ui.accountnew.PasswordResetNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.PhoneNumberInputAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.ConfirmCodeResponse;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.PhoneNumber;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vjf0;
import l.vwb;
import l.w9j;
import l.zvf0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pxk0 extends b3f0<C0055a> {

    /* JADX INFO: renamed from: e */
    public VerifyReason f19418e;

    /* JADX INFO: renamed from: f */
    public int f19419f;

    /* JADX INFO: renamed from: g */
    public String f19420g;

    /* JADX INFO: renamed from: h */
    public String f19421h;

    /* JADX INFO: renamed from: i */
    public VerifyData f19422i;

    /* JADX INFO: renamed from: j */
    public boolean f19423j;

    /* JADX INFO: renamed from: k */
    public boolean f19424k;

    /* JADX INFO: renamed from: l */
    public String f19425l;

    /* JADX INFO: renamed from: m */
    public String f19426m;

    /* JADX INFO: renamed from: n */
    public Runnable f19427n;

    /* JADX INFO: renamed from: o */
    public d30 f19428o;

    public pxk0(mcr mcrVar) {
        super(mcrVar);
        this.f19422i = new VerifyData();
        this.f19427n = new Runnable() { // from class: l.uwk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23784a.m21775C1();
            }
        };
        this.f19428o = new d30() { // from class: l.fxk0
            public final void call() {
                this.f12964a.m21799D1();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public /* synthetic */ void m21775C1() {
        zvf0.r("e_appeal_phone_number_verification_send", act().pageId());
        if (this.f19419f == 86 && this.f19424k) {
            VerifyReason verifyReason = VerifyReason.get("signup_signin");
            this.f19418e = verifyReason;
            ((C0055a) ((jq2) this).viewModel).m471e0(verifyReason);
            return;
        }
        ((C0055a) ((jq2) this).viewModel).m450G();
        if (!TEnum.equals(this.f19418e, "signup") && !TEnum.equals(this.f19418e, "forgot-password")) {
            TEnum.equals(this.f19418e, "signin");
        }
        if (!TextUtils.isEmpty(this.f19425l)) {
            this.f19422i.captchaToken = this.f19425l;
        }
        if (!TextUtils.isEmpty(this.f19426m)) {
            this.f19422i.captchaValue = this.f19426m;
        }
        Objects.toString(this.f19418e);
        Objects.toString(this.f19422i.action);
        VerifyData verifyData = this.f19422i;
        int i = verifyData.countryCode;
        String str = verifyData.mobileNumber;
        AccountModule.f26c.m219b2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.mxk0
            public final void call(Object obj) {
                this.f17356a.m21828z1((RiskVerification) obj);
            }
        }, new e30() { // from class: l.nxk0
            public final void call(Object obj) {
                this.f17917a.m21798B1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m21781W0(Throwable th) {
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m21784a1(Throwable th) {
    }

    /* JADX INFO: renamed from: n1 */
    private void m21797n1() {
        this.f19425l = "";
        this.f19426m = "";
        VerifyData verifyData = this.f19422i;
        verifyData.captchaToken = "";
        verifyData.captchaValue = "";
        verifyData.captcha = null;
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m21798B1(Throwable th) {
        th.getMessage();
        m21797n1();
        ((C0055a) ((jq2) this).viewModel).m470d0(th, this.f19418e, this.f19420g);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m21799D1() {
        ((C0055a) ((jq2) this).viewModel).m469c0(this.f19422i, this.f19418e, this.f19419f, this.f19420g, this.f19423j);
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m21800E1() {
        e51.K(m21820p1(this.f19418e));
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m21801F1(VerifyData verifyData, roj0 roj0Var) {
        Objects.toString(verifyData.action);
        ((C0055a) ((jq2) this).viewModel).m479l0();
        if (TEnum.equals(this.f19418e, "forgot-password")) {
            act().startActivity(PasswordResetNewAct.m385V1(act(), verifyData));
            act().finish();
            return;
        }
        if (TEnum.equals(this.f19418e, "ban-appeal")) {
            PhoneNumber phoneNumberNew_ = PhoneNumber.new_();
            phoneNumberNew_.countryCode = this.f19419f;
            phoneNumberNew_.number = this.f19420g;
            AccountModule.m27H().verifyAppealIdentity(act(), phoneNumberNew_);
            return;
        }
        if (TEnum.equals(verifyData.action, "signup")) {
            m21816X1();
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(verifyData.code);
        signInData.verifyType = verifyData.verifyType;
        signInData.username = this.f19419f + " " + this.f19420g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        signInData.grantType = SignInGrantType.get("confirmation_code");
        m12505J0(signInData, new d30() { // from class: l.gxk0
            public final void call() {
                this.f13564a.m21800E1();
            }
        }, null);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m21802H1(Throwable th) {
        th.getMessage();
        ((C0055a) ((jq2) this).viewModel).m470d0(th, this.f19418e, this.f19420g);
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m21803I1(d30 d30Var, roj0 roj0Var) {
        ((C0055a) ((jq2) this).viewModel).m479l0();
        d30Var.call();
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m21804J1(Throwable th) {
        ((C0055a) ((jq2) this).viewModel).m478k0(this.f19418e, this.f19422i, this.f19419f, this.f19420g, th);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m21805L1() {
        e51.K(m21820p1(this.f19418e));
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m21806N1(ConfirmCodeResponse confirmCodeResponse) {
        if (confirmCodeResponse.action.equals("signup")) {
            m21816X1();
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(((C0055a) ((jq2) this).viewModel).m454K());
        signInData.username = this.f19419f + " " + this.f19420g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        signInData.grantType = SignInGrantType.get("confirmation_code");
        m12505J0(signInData, new d30() { // from class: l.cxk0
            public final void call() {
                this.f9905a.m21805L1();
            }
        }, null);
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m21807O1(Throwable th) {
        ((C0055a) ((jq2) this).viewModel).m478k0(this.f19418e, this.f19422i, this.f19419f, this.f19420g, th);
    }

    /* JADX INFO: renamed from: P1 */
    public void m21808P1() {
        ((C0055a) ((jq2) this).viewModel).m468b0(this.f19418e);
    }

    /* JADX INFO: renamed from: Q1 */
    public boolean m21809Q1(Menu menu) {
        AccountModule.f26c.m193M1().mo11760b(act());
        if ((!TEnum.equals(this.f19418e, "signin") || this.f19423j) && !TEnum.equals(this.f19418e, "fix_verify_code_hack") && !TEnum.equals(this.f19418e, "signup_signin")) {
            return false;
        }
        ((C0055a) ((jq2) this).viewModel).m448E(menu);
        return true;
    }

    /* JADX INFO: renamed from: R1 */
    public boolean m21810R1(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            ((C0055a) ((jq2) this).viewModel).m452I();
            return true;
        }
        if (menuItem.getItemId() != q4c0.f19616l0) {
            return false;
        }
        SignInData signInData = new SignInData();
        signInData.username = this.f19419f + " " + vwb.q(this.f19420g);
        signInData.code = Integer.valueOf(this.f19419f);
        zvf0.u("e_verification_code_bypassword_button", ((C0055a) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("phone_num", TextUtils.isEmpty(this.f19420g) ? "null" : this.f19420g)});
        ((C0055a) ((jq2) this).viewModel).act().startActivity(PhoneNumberInputAct.m387Z1(((C0055a) ((jq2) this).viewModel).act(), VerifyReason.get("signin"), signInData));
        ((C0055a) ((jq2) this).viewModel).act().finish();
        return true;
    }

    /* JADX INFO: renamed from: S1 */
    public void m21811S1(cwf0 cwf0Var) {
        if (this.f19419f == 86) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String str = "signup";
        if (!TEnum.equals(this.f19418e, "signup")) {
            str = "signin";
            if (TEnum.equals(this.f19418e, "signin")) {
                if (this.f19423j) {
                    str = "new_device";
                }
            } else if (TEnum.equals(this.f19418e, "forgot-password")) {
                str = "reset_password";
            } else {
                str = TEnum.equals(this.f19418e, "ban-appeal") ? "appeal" : "others";
            }
        }
        try {
            jSONObject.put("verify_code_type", str);
            jSONObject.put("phone_num", this.f19420g);
            jSONObject.put("ban_type", (NullChecker.a(qib0.f19804b0) && NullChecker.a(qib0.f19804b0.f17707b) && NullChecker.a(qib0.f19804b0.f17707b.me_())) ? qib0.f19804b0.f17707b.me_().banStatus.code : 0);
            cwf0Var.o(jSONObject);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m21812T1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        Objects.toString(this.f19418e);
        duringCreated(AccountModule.f26c.m165A2(verifyData)).subscribe(mkd0.H(new e30() { // from class: l.dxk0
            public final void call(Object obj) {
                this.f10642a.m21801F1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.exk0
            public final void call(Object obj) {
                this.f11495a.m21802H1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U1 */
    public void m21813U1(Bundle bundle) {
        bundle.putSerializable("REASON", this.f19418e);
        bundle.putInt("COUNTRY_CODE", this.f19419f);
        bundle.putString("PHONE_NUMBER", this.f19420g);
        bundle.putString("PASSWORD", this.f19421h);
        bundle.putBoolean("IS_NEW_DEVICE", this.f19423j);
    }

    /* JADX INFO: renamed from: V1 */
    public void m21814V1(Pair<String, String> pair) {
        this.f19425l = (String) pair.first;
        this.f19426m = (String) pair.second;
    }

    /* JADX INFO: renamed from: W1 */
    public void m21815W1(boolean z) {
        this.f19424k = z;
    }

    /* JADX INFO: renamed from: X1 */
    public void m21816X1() {
        ((C0055a) ((jq2) this).viewModel).act().startActivity(SignUpDetailsNewAct.m394b2(((C0055a) ((jq2) this).viewModel).act(), this.f19422i, false, false));
        ((C0055a) ((jq2) this).viewModel).act().finish();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX INFO: renamed from: Y1 */
    public void m21817Y1(final d30 d30Var) {
        boolean z;
        ((C0055a) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        if (TEnum.equals(this.f19418e, "ban-appeal")) {
            User userMe_ = AccountModule.m27H().me_();
            CrashHelper.ReportLevel reportLevel = CrashHelper.ReportLevel.p9;
            if (NullChecker.c(userMe_, "account", reportLevel) && NullChecker.c(userMe_.settings, "account", reportLevel)) {
                PhoneNumber phoneNumber = userMe_.settings.phoneNumber;
                if (phoneNumber.countryCode == 0 || TextUtils.isEmpty(phoneNumber.number)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            String strPageId = ((C0055a) ((jq2) this).viewModel).act().pageId();
            n6j0.m19689b("e_p_appeal_verify_phonenumber_page_next", strPageId, n6j0.C1041a.m19696f("is_binding_phonenumber", z ? "1" : "0"), n6j0.C1041a.m19696f("is_checked", "" + ((C0055a) ((jq2) this).viewModel).f476l.isChecked()));
        }
        AccountModule.f26c.m165A2(this.f19422i).subscribe(mkd0.K(new e30() { // from class: l.axk0
            public final void call(Object obj) {
                this.f8589a.m21803I1(d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.bxk0
            public final void call(Object obj) {
                this.f9205a.m21804J1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Z1 */
    public void m21818Z1() {
        ((C0055a) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        AccountModule.f26c.m176F2(this.f19422i).subscribe(mkd0.K(new e30() { // from class: l.ywk0
            public final void call(Object obj) {
                this.f28457a.m21806N1((ConfirmCodeResponse) obj);
            }
        }, new e30() { // from class: l.zwk0
            public final void call(Object obj) {
                this.f29009a.m21807O1((Throwable) obj);
            }
        }, false));
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.hxk0
            public final void call(Object obj) {
                this.f14120a.m21826v1((c) obj);
            }
        }));
        creates(new e30() { // from class: l.ixk0
            public final void call(Object obj) {
                this.f14864a.m21827x1((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.e().b).filter(new w9j() { // from class: l.jxk0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.kxk0
            public final void call(Object obj) {
                this.f16069a.m21825u1((Captcha) obj);
            }
        }, new e30() { // from class: l.lxk0
            public final void call(Object obj) {
                pxk0.m21781W0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o1 */
    public VerifyReason m21819o1() {
        return this.f19418e;
    }

    /* JADX INFO: renamed from: p1 */
    public String m21820p1(VerifyReason verifyReason) {
        StringBuilder sb = new StringBuilder();
        sb.append(((C0055a) ((jq2) this).viewModel).act().getLocalClassName());
        sb.append(verifyReason == null ? "" : verifyReason.toString());
        return sb.toString();
    }

    public String pageId() {
        Intent intent = act().getIntent();
        return (NullChecker.a(intent) && TEnum.equals(intent.getSerializableExtra("REASON"), "ban-appeal")) ? "p_appeal_verify_phonenumber" : "p_sign_in_verification_code_view";
    }

    /* JADX INFO: renamed from: q1 */
    public void m21821q1() {
        duringCreated(e51.N(m21820p1(this.f19418e), 60)).subscribe(mkd0.I(new e30() { // from class: l.vwk0
            public final void call(Object obj) {
                this.f24508a.m21823s1((Long) obj);
            }
        }, new e30() { // from class: l.wwk0
            public final void call(Object obj) {
                pxk0.m21784a1((Throwable) obj);
            }
        }, new d30() { // from class: l.xwk0
            public final void call() {
                this.f27765a.m21824t1();
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public void m21822r1(VerifyReason verifyReason, int i, String str, String str2, VerifyData verifyData, boolean z) {
        this.f19418e = verifyReason;
        this.f19419f = i;
        this.f19420g = str;
        this.f19421h = str2;
        this.f19422i = verifyData;
        this.f19423j = z;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m21823s1(Long l2) {
        ((C0055a) ((jq2) this).viewModel).m475i0(l2.longValue());
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m21824t1() {
        ((C0055a) ((jq2) this).viewModel).m473g0(this.f19420g);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m21825u1(Captcha captcha) {
        if (NullChecker.a(captcha)) {
            this.f19422i.captcha = captcha;
            this.f19427n.run();
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m21826v1(c cVar) {
        if (cVar == c.j) {
            ((C0055a) ((jq2) this).viewModel).m451H();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m21827x1(Bundle bundle) {
        ((C0055a) ((jq2) this).viewModel).m453J(this.f19418e, this.f19419f, this.f19420g, this.f19422i, this.f19423j, this.f19421h);
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m21828z1(RiskVerification riskVerification) {
        m21797n1();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (c5d0.m13183b(act(), riskVerification, this.f19422i, new c5d0.InterfaceC0598a() { // from class: l.oxk0
            @Override // p006l.c5d0.InterfaceC0598a
            /* JADX INFO: renamed from: a */
            public final void mo13185a(VerifyData verifyData) {
                this.f18478a.m21812T1(verifyData);
            }
        })) {
            return;
        }
        ((C0055a) ((jq2) this).viewModel).m471e0(this.f19418e);
    }
}
