package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.auth.api.credentials.Credential;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.PhoneNumberInputAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.PhoneNumberVerifyAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.VerifyCodeInputAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import l.a3e0;
import l.ag3;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.i0g0;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.xvf0;
import l.yij0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iq60 extends b3f0<br60> {

    /* JADX INFO: renamed from: e */
    public VerifyReason f14675e;

    /* JADX INFO: renamed from: f */
    public SignInData f14676f;

    /* JADX INFO: renamed from: g */
    public String f14677g;

    /* JADX INFO: renamed from: h */
    public String f14678h;

    /* JADX INFO: renamed from: i */
    public String f14679i;

    /* JADX INFO: renamed from: j */
    public boolean f14680j;

    /* JADX INFO: renamed from: k */
    public String f14681k;

    /* JADX INFO: renamed from: l */
    public String f14682l;

    /* JADX INFO: renamed from: m */
    public dzv f14683m;

    /* JADX INFO: renamed from: n */
    public int f14684n;

    public iq60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m16821U0(Credential credential, String str) {
        if (TextUtils.equals(str, "inActivated") || TextUtils.equals(str, "newDevice")) {
            return;
        }
        hkf0.m16233d().m16234c(credential);
        lsi0.h(R$string.f115Q3);
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m16839B1(Throwable th) {
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m16840C1() {
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m16841D1(String str) {
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m16842E1(final VerifyData verifyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        signUpData.verifyType = verifyData.verifyType;
        AccountModule.f26c.m232i2(signUpData);
        Objects.toString(verifyData.action);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                ((br60) ((jq2) this).viewModel).act().progressDismiss();
                TtcAccountBindAct.INSTANCE.m583a(act(), signUpData, verifyData);
                act().hideInput();
                act().finish();
                return;
            }
            return;
        }
        if (TEnum.equals(verifyData.action, "signup") || TEnum.equals(verifyData.action, "ttt-signup")) {
            act().duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.vp60
                public final void call(Object obj) {
                    this.f24404a.m16880z1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.wp60
                public final void call(Object obj) {
                    this.f25274a.m16839B1((Throwable) obj);
                }
            }));
            return;
        }
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(verifyData.code);
        signInData.verifyType = verifyData.verifyType;
        signInData.username = ((br60) ((jq2) this).viewModel).m12867I() + " " + this.f14678h;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        signInData.grantType = SignInGrantType.get("confirmation_code");
        m12505J0(signInData, new d30() { // from class: l.xp60
            public final void call() {
                this.f27669a.m16840C1();
            }
        }, new e30() { // from class: l.zp60
            public final void call(Object obj) {
                this.f28871a.m16841D1((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m16843F1(Throwable th) {
        th.getMessage();
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
        C1478yf.m28232b(th);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m16844H1(VerifyData verifyData, RiskVerification riskVerification) {
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
        m16847L1();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (c5d0.m13183b(act(), riskVerification, verifyData, new c5d0.InterfaceC0598a() { // from class: l.sp60
            @Override // p006l.c5d0.InterfaceC0598a
            /* JADX INFO: renamed from: a */
            public final void mo13185a(VerifyData verifyData2) {
                this.f21557a.m16857W1(verifyData2);
            }
        })) {
            return;
        }
        m16863c2();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m16845I1(Pair pair) {
        this.f14681k = (String) pair.first;
        this.f14682l = (String) pair.second;
        m16858X1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m16846J1(Throwable th) {
        th.getMessage();
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
        m16847L1();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            C1444xm.m27328n0(act(), new e30() { // from class: l.rp60
                public final void call(Object obj) {
                    this.f20670a.m16845I1((Pair) obj);
                }
            });
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m25823c(act());
        } else {
            C1478yf.m28232b(th);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m16848N1(Pair pair) {
        this.f14681k = (String) pair.first;
        this.f14682l = (String) pair.second;
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m16849O1(String str) {
        m16847L1();
        if (TextUtils.equals("suspicious", str)) {
            C1444xm.m27328n0(act(), new e30() { // from class: l.op60
                public final void call(Object obj) {
                    this.f18311a.m16848N1((Pair) obj);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m16850P1(Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                m16862b2();
            } else {
                yij0.D(th);
                this.f14684n++;
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            yij0.D(th);
        }
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m16851Q1(AccountErrorResponse accountErrorResponse) {
        ((br60) ((jq2) this).viewModel).act().startActivity(VerifyCodeInputAct.m417Z1(((br60) ((jq2) this).viewModel).act(), VerifyReason.get("signup"), ((br60) ((jq2) this).viewModel).m12867I(), this.f14678h));
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: R1 */
    public void m16852R1(int i, int i2, Intent intent) {
        if (TEnum.equals(this.f14675e, "signup")) {
            this.f14683m.mo591a(((br60) ((jq2) this).viewModel).act(), i, i2, intent);
            hkf0.m16233d().m16236f(i, i2, intent, new e30() { // from class: l.np60
                public final void call(Object obj) {
                    this.f17787a.m16879x1((Credential) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m16853S1() {
        if (TEnum.equals(this.f14675e, "ban-appeal")) {
            n6j0.m19689b("e_p_appeal_verify_phonenumber_page_back", ((br60) ((jq2) this).viewModel).act().pageId(), new n6j0.C1041a[0]);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public boolean m16854T1(Menu menu) {
        AccountModule.f26c.m193M1().mo11760b(act());
        if (TEnum.equals(this.f14675e, "signin")) {
            if (!AccountModule.f29f.m12622m(String.valueOf(this.f14676f.code))) {
                return false;
            }
            menu.add(0, q4c0.f19572F, 0, R$string.f254p2).setShowAsAction(2);
            return true;
        }
        if (!C0775gp.m15904k()) {
            return false;
        }
        menu.add(0, q4c0.f19576J, 0, "遇到问题？").setShowAsAction(2);
        return true;
    }

    /* JADX INFO: renamed from: U1 */
    public boolean m16855U1(MenuItem menuItem) {
        if (menuItem.getItemId() != q4c0.f19572F) {
            if (menuItem.getItemId() != q4c0.f19576J) {
                return false;
            }
            zvf0.r("e_prelogin_mobile_num_page_feedback", pageId());
            act().startActivity(WebViewAct.a2(act(), "帮助与反馈", a3e0.a("https://feedback.tantanapp.com/feedback-mobile/pre-login"), true));
            return true;
        }
        zvf0.u("e_password_verifypage_switch_button", pageId(), new j760[]{vwb.Y("phone_num", this.f14678h)});
        if (((br60) ((jq2) this).viewModel).m12867I() == 86) {
            m16863c2();
        } else {
            ((br60) ((jq2) this).viewModel).act().startActivity(VerifyCodeInputAct.m419b2(((br60) ((jq2) this).viewModel).act(), VerifyReason.get("signin"), ((br60) ((jq2) this).viewModel).m12867I(), this.f14678h, false));
        }
        ((br60) ((jq2) this).viewModel).act().finish();
        return true;
    }

    /* JADX INFO: renamed from: V1 */
    public void m16856V1(PhoneNumberInputAct phoneNumberInputAct, cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((br60) ((jq2) this).viewModel).act().pageId().equals("p_sign_in_password_view")) {
                jSONObject.put("phone_num", this.f14678h);
            } else if (((br60) ((jq2) this).viewModel).act().pageId().equals("p_sign_in_phone_number_view")) {
                jSONObject.put("phone_show_type", "SHORE_CUT_ACT".equals(this.f14677g) ? "switch_signin" : "direct_signin");
            }
            cwf0Var.o(jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: W1 */
    public final void m16857W1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        act().progress(R$string.f216j0);
        duringCreated(AccountModule.f26c.m165A2(verifyData)).subscribe(mkd0.H(new e30() { // from class: l.tp60
            public final void call(Object obj) {
                this.f22223a.m16842E1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.up60
            public final void call(Object obj) {
                this.f23691a.m16843F1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X1 */
    public void m16858X1() {
        final VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.countryCode = ((br60) ((jq2) this).viewModel).m12867I();
        verifyData.mobileNumber = this.f14678h;
        verifyData.codeLength = 4;
        verifyData.action = VerifyReason.get("signup_signin");
        if (!TextUtils.isEmpty(this.f14681k)) {
            verifyData.captchaToken = this.f14681k;
        }
        if (!TextUtils.isEmpty(this.f14682l)) {
            verifyData.captchaValue = this.f14682l;
        }
        Objects.toString(verifyData.action);
        AccountModule.f26c.m219b2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.pp60
            public final void call(Object obj) {
                this.f19254a.m16844H1(verifyData, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.qp60
            public final void call(Object obj) {
                this.f19964a.m16846J1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: Y1 */
    public void m16859Y1(CharSequence charSequence) {
        this.f14679i = charSequence.toString();
    }

    /* JADX INFO: renamed from: Z1 */
    public void m16860Z1() {
        ((br60) ((jq2) this).viewModel).act().startActivity(PhoneNumberVerifyAct.m390V1(((br60) ((jq2) this).viewModel).act(), ((br60) ((jq2) this).viewModel).m12867I(), this.f14678h));
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.yp60
            public final void call(Object obj) {
                this.f28332a.m16877u1((Bundle) obj);
            }
        });
        creates(new e30() { // from class: l.aq60
            public final void call(Object obj) {
                this.f8440a.m16878v1((Bundle) obj);
            }
        });
        m16873q1();
    }

    /* JADX INFO: renamed from: a2 */
    public final void m16861a2(String str, String str2, e30<String> e30Var) {
        SignInData signInData = new SignInData();
        signInData.isSmartlock = true;
        signInData.grantType = SignInGrantType.get("password");
        signInData.password = str2;
        signInData.username = str;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        m12505J0(signInData, null, e30Var);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m16862b2() {
        SignInData signInData = new SignInData();
        signInData.username = ((br60) ((jq2) this).viewModel).m12867I() + " " + vwb.q(this.f14678h);
        signInData.code = Integer.valueOf(((br60) ((jq2) this).viewModel).m12867I());
        act().startActivity(PhoneNumberInputAct.m387Z1(((br60) ((jq2) this).viewModel).act(), VerifyReason.get("signin"), signInData));
    }

    /* JADX INFO: renamed from: c2 */
    public void m16863c2() {
        ((br60) ((jq2) this).viewModel).act().startActivity(VerifyCodeInputAct.m417Z1(((br60) ((jq2) this).viewModel).act(), VerifyReason.get("signup_signin"), ((br60) ((jq2) this).viewModel).m12867I(), this.f14678h));
    }

    /* JADX INFO: renamed from: d2 */
    public void m16864d2() {
        zvf0.u("e_password_verifypage_signin_button", ((br60) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("phone_num", this.f14678h)});
    }

    /* JADX INFO: renamed from: e2 */
    public List<Object> m16865e2() {
        VerifyReason verifyReason = this.f14675e;
        return vwb.f0(new Object[]{"reason", verifyReason == null ? "" : verifyReason.toString(), ag3.a});
    }

    /* JADX INFO: renamed from: f2 */
    public void m16866f2(CharSequence charSequence) {
        if (this.f14680j && charSequence.length() > 0) {
            this.f14680j = false;
        }
        if ("p_sign_in_phone_number_view".equals(((br60) ((jq2) this).viewModel).act().pageId()) && charSequence.length() > 0) {
            xvf0.a("e_phone_input", ((br60) ((jq2) this).viewModel).act().pageId(), getClass().getName(), new Object[0]);
        }
        String strM12869K = ((br60) ((jq2) this).viewModel).m12869K();
        this.f14678h = strM12869K;
        if (strM12869K == null) {
            CrashHelper.c(new Exception("mobileNumber == null in PhoneNumberInputAct on line 368"));
        }
        ((br60) ((jq2) this).viewModel).m12894j0();
        if (((br60) ((jq2) this).viewModel).m12889f0() && this.f14678h.length() == 11 && m16870n1(this.f14678h)) {
            ((br60) ((jq2) this).viewModel).m12890g0();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m16867g2() {
        ((br60) ((jq2) this).viewModel).act().startActivity(VerifyCodeInputAct.m417Z1(((br60) ((jq2) this).viewModel).act(), this.f14675e, ((br60) ((jq2) this).viewModel).m12867I(), this.f14678h));
    }

    /* JADX INFO: renamed from: h2 */
    public void m16868h2(boolean z) {
        if (!z) {
            this.f14684n++;
            return;
        }
        if (!TEnum.equals(this.f14675e, "signin")) {
            if (TEnum.equals(this.f14675e, "signup")) {
                zvf0.u("e_phone_continue_button", ((br60) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("phone_num", ((br60) ((jq2) this).viewModel).m12868J())});
                m16869i2();
                return;
            } else {
                if (TEnum.equals(this.f14675e, "ban-appeal")) {
                    m16867g2();
                    return;
                }
                return;
            }
        }
        SignInData signInData = this.f14676f;
        signInData.password = this.f14679i;
        signInData.grantType = SignInGrantType.get("password");
        this.f14676f.device = new Device();
        this.f14676f.device.identifiers = pk8.m21563N();
        if (!TextUtils.isEmpty(this.f14681k)) {
            this.f14676f.captchaToken = this.f14681k;
        }
        if (!TextUtils.isEmpty(this.f14682l)) {
            this.f14676f.captchaValue = this.f14682l;
        }
        m12505J0(this.f14676f, new d30() { // from class: l.eq60
            public final void call() {
                this.f11396a.m16847L1();
            }
        }, new e30() { // from class: l.fq60
            public final void call(Object obj) {
                this.f12851a.m16849O1((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public final void m16869i2() {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = this.f14675e;
        verifyData.countryCode = ((br60) ((jq2) this).viewModel).m12867I();
        verifyData.mobileNumber = this.f14678h;
        ((br60) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        if (verifyData.countryCode == 86) {
            m16858X1();
        } else {
            AccountModule.f26c.m173E2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.gq60
                public final void call(Object obj) {
                    this.f13436a.m16851Q1((AccountErrorResponse) obj);
                }
            }, new e30() { // from class: l.hq60
                public final void call(Object obj) {
                    this.f14014a.m16850P1((Throwable) obj);
                }
            }, false));
        }
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m16870n1(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!((br60) ((jq2) this).viewModel).m12889f0()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
    public final void m16847L1() {
        this.f14681k = "";
        this.f14682l = "";
        if (NullChecker.a(this.f14676f)) {
            SignInData signInData = this.f14676f;
            signInData.captchaToken = "";
            signInData.captchaValue = "";
        }
    }

    /* JADX INFO: renamed from: p1 */
    public void m16872p1(VerifyReason verifyReason, SignInData signInData, String str) {
        this.f14675e = verifyReason;
        this.f14676f = signInData;
        this.f14677g = str;
    }

    public String pageId() {
        if (NullChecker.a(this.f14675e) && TEnum.equals(this.f14675e, "ban-appeal")) {
            return "p_appeal_verify_phonenumber";
        }
        return NullChecker.a(this.f14676f) ? "p_sign_in_password_view" : "p_sign_in_phone_number_view";
    }

    /* JADX INFO: renamed from: q1 */
    public void m16873q1() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.bq60
            public final void call(Object obj) {
                this.f9031a.m16875s1((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r1 */
    public final void m16874r1() {
        this.f14683m = dzv.m14322c(((br60) ((jq2) this).viewModel).act());
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m16875s1(c cVar) {
        if (cVar == c.i) {
            ((br60) ((jq2) this).viewModel).m12894j0();
        } else if (cVar == c.j) {
            ((br60) ((jq2) this).viewModel).m12891h0();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m16876t1() {
        ((br60) ((jq2) this).viewModel).m12895k0();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m16877u1(Bundle bundle) {
        if (TEnum.equals(this.f14675e, "signup")) {
            e51.F(act(), new Runnable() { // from class: l.dq60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10522a.m16876t1();
                }
            });
            m16874r1();
        }
        if (TEnum.equals(this.f14675e, "signup")) {
            this.f14680j = true;
        }
        ((br60) ((jq2) this).viewModel).m12893i0(this.f14675e, this.f14676f);
        ((br60) ((jq2) this).viewModel).m12870L(this.f14675e);
        ((br60) ((jq2) this).viewModel).m12871M(this.f14675e);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m16878v1(Bundle bundle) {
        if (TEnum.equals(this.f14675e, "signup")) {
            hkf0.m16233d().m16237g(act());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m16879x1(final Credential credential) {
        String strJ = credential.J();
        if (!TextUtils.isEmpty(strJ) && strJ.split(" ").length == 2) {
            m16861a2(credential.J(), credential.getPassword(), new e30() { // from class: l.cq60
                public final void call(Object obj) {
                    iq60.m16821U0(credential, (String) obj);
                }
            });
        } else {
            hkf0.m16233d().m16234c(credential);
            lsi0.h(R$string.f115Q3);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m16880z1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((br60) ((jq2) this).viewModel).act().progressDismiss();
        if (TEnum.equals(verifyData.action, "ttt-signup")) {
            m12511r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m394b2(((br60) ((jq2) this).viewModel).act(), verifyData, false, false));
        }
        act().finish();
    }

    @Override // p006l.b3f0
    public void destroy() {
    }
}
