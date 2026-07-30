package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.api.C0002b;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.SignupStage;
import com.p1.mobile.putong.data.StepSignupStage;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyDataV2;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.d30;
import l.e30;
import l.e51;
import l.i0g0;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.px0;
import l.roj0;
import l.vjf0;
import l.w85;
import l.w9j;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class cwe extends b3f0<qwe> {

    /* JADX INFO: renamed from: e */
    public boolean f9886e;

    /* JADX INFO: renamed from: f */
    public String f9887f;

    /* JADX INFO: renamed from: g */
    public int f9888g;

    /* JADX INFO: renamed from: h */
    public VerifyReason f9889h;

    /* JADX INFO: renamed from: i */
    public String f9890i;

    public cwe(mcr mcrVar) {
        super(mcrVar);
        this.f9886e = false;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m13650R0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m13662l1() {
        ((qwe) ((jq2) this).viewModel).m22461r();
        if (e51.B(((qwe) ((jq2) this).viewModel).m22447B())) {
            return;
        }
        m13679x1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m13663m1(Bundle bundle) {
        e51.G(new Runnable() { // from class: l.wve
            @Override // java.lang.Runnable
            public final void run() {
                this.f25428a.m13662l1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m13664n1(Captcha captcha) {
        if (NullChecker.a(captcha)) {
            m13679x1(captcha);
        }
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        this.f9887f = act().getIntent().getStringExtra("email");
        this.f9888g = act().getIntent().getIntExtra("verify_type", 1);
        creates(new e30() { // from class: l.pve
            public final void call(Object obj) {
                this.f19382a.m13663m1((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.e().b).filter(new w9j() { // from class: l.tve
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.uve
            public final void call(Object obj) {
                this.f23769a.m13664n1((Captcha) obj);
            }
        }, new e30() { // from class: l.vve
            public final void call(Object obj) {
                cwe.m13650R0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public void m13665f1(String str) {
        Intent intent = new Intent();
        intent.putExtra("back_reason", str);
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: g1 */
    public void m13666g1(VerifyReason verifyReason, String str) {
        this.f9889h = verifyReason;
        this.f9890i = str;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m13667h1() {
        return this.f9886e;
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m13668i1() {
        return VerifyReason.get("signup_signin").equals(this.f9889h);
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m13669j1() {
        return this.f9888g == 1;
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m13670k1() {
        return this.f9888g == 2;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m13671o1(VerifyData verifyData, roj0 roj0Var) {
        ((qwe) ((jq2) this).viewModel).m22457Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m13672p1(Throwable th) {
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m13665f1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            zvf0.x("e_intl_email_verification_risk_graph", act().pageId());
            vij.INSTANCE.m25824d("email", act());
        } else if (!((qwe) ((jq2) this).viewModel).m22458R(th)) {
            C1478yf.m28232b(th);
        }
        ((qwe) ((jq2) this).viewModel).m22460T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m13673q1(VerifyDataV2 verifyDataV2, Throwable th) {
        this.f9886e = false;
        if (m13669j1()) {
            zvf0.x("e_intl_email_verification_code_error", act().pageId());
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m13665f1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 400149) {
            osi0.f(R$string.f169b1);
        } else if (((qwe) ((jq2) this).viewModel).m22458R(th)) {
            HashMap map = new HashMap();
            map.put("Sign up status", "Email register fail");
            w85.INSTANCE.m("Sign Up", map);
        } else {
            C1478yf.m28232b(th);
            HashMap map2 = new HashMap();
            map2.put("Sign up status", "Email register fail");
            w85.INSTANCE.m("Sign Up", map2);
        }
        ((qwe) ((jq2) this).viewModel).m22460T();
        if (TEnum.equals(verifyDataV2.action, "bind-email") || TEnum.equals(verifyDataV2.action, "change-email")) {
            zvf0.D(TEnum.equals(verifyDataV2.action, "bind-email") ? "e_account_add_email_code_done" : "e_account_replace_email_code_done", ((qwe) ((jq2) this).viewModel).act().pageId(), new j760[]{j760.a(TEnum.equals(verifyDataV2.action, "bind-email") ? "add_result" : "replace_result", "fail")});
            if (TextUtils.equals(this.f9890i, "bind_or_change_email") && TEnum.equals(verifyDataV2.action, "bind-email")) {
                zvf0.D("e_intl_account_add_email_result", "p_account_and_security_view", new j760[]{j760.a("add_result", "fail")});
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m13674r1(VerifyDataV2 verifyDataV2, SignUpData signUpData, roj0 roj0Var) {
        act().hideInput();
        ((qwe) ((jq2) this).viewModel).m22460T();
        if (TEnum.equals(verifyDataV2.action, "ttt-signup")) {
            m12511r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m393a2(((qwe) ((jq2) this).viewModel).act(), signUpData));
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register success");
        w85.INSTANCE.m("Sign Up", map);
        act().finish();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m13675s1(Throwable th) {
        this.f9886e = false;
        ((qwe) ((jq2) this).viewModel).m22460T();
        ((qwe) ((jq2) this).viewModel).m22463z();
        yij0.D(th);
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register fail");
        w85.INSTANCE.m("Sign Up", map);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m13676t1() {
        e51.K(((qwe) ((jq2) this).viewModel).m22447B());
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Success");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m13677u1(String str) {
        this.f9886e = false;
        ((qwe) ((jq2) this).viewModel).m22460T();
        if (m13669j1()) {
            zvf0.x("e_intl_email_verification_code_error", act().pageId());
        }
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Failure");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m13678v1(final VerifyDataV2 verifyDataV2, roj0 roj0Var) {
        final SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.email;
        signUpData.email = verifyDataV2.email;
        signUpData.code = verifyDataV2.code;
        signUpData.phoneNumber = verifyDataV2.mobileNumber;
        signUpData.action = verifyDataV2.action.toString();
        AccountModule.f26c.m232i2(signUpData);
        if (TEnum.equals(verifyDataV2.action, "pending")) {
            if (act() != null) {
                e51.K(((qwe) ((jq2) this).viewModel).m22447B());
                TtcAccountBindAct.INSTANCE.m583a(act(), signUpData, VerifyDataV2.v2ConvertV1(verifyDataV2));
                act().hideInput();
                act().finish();
            }
        } else if (TEnum.equals(verifyDataV2.action, "signup") || TEnum.equals(verifyDataV2.action, "ttt-signup")) {
            ((qwe) ((jq2) this).viewModel).act().duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.bwe
                public final void call(Object obj) {
                    this.f9135a.m13674r1(verifyDataV2, signUpData, (roj0) obj);
                }
            }, new e30() { // from class: l.qve
                public final void call(Object obj) {
                    this.f20094a.m13675s1((Throwable) obj);
                }
            }));
        } else if (TEnum.equals(verifyDataV2.action, "bind-email") || TEnum.equals(verifyDataV2.action, "change-email")) {
            osi0.f(R$string.f132U0);
            act().hideInput();
            if ("home".equals(this.f9890i) && TEnum.equals(verifyDataV2.action, "bind-email")) {
                act().startActivity(AccountModule.m27H().toNewMainAct(act(), false, true));
                act().finish();
            } else if ("messageDeeplink".equals(this.f9890i)) {
                Intent intentStartMessagesAct = AccountModule.m27H().startMessagesAct(act(), "-1", false, false);
                intentStartMessagesAct.addFlags(67108864);
                act().startActivity(intentStartMessagesAct);
            } else if ("bind_or_change_email".equals(this.f9890i)) {
                qib0.f19804b0.f17707b.Us(act());
            } else if ("google_login_verify_email".equals(this.f9890i)) {
                eje.m14574h().m14579f(SignupStage.get("verified"), StepSignupStage.get("google-email-saved"));
                Intent intentM16305e = C0811hp.m16305e(act());
                intentM16305e.addFlags(67108864);
                act().startActivity(intentM16305e);
            } else {
                act().startActivity(AccountModule.m27H().toNewMainAct(act(), false, true));
                act().finish();
            }
            zvf0.D(TEnum.equals(verifyDataV2.action, "bind-email") ? "e_account_add_email_code_done" : "e_account_replace_email_code_done", ((qwe) ((jq2) this).viewModel).act().pageId(), new j760[]{j760.a(TEnum.equals(verifyDataV2.action, "bind-email") ? "add_result" : "replace_result", "success")});
            if (TextUtils.equals(this.f9890i, "bind_or_change_email") && TEnum.equals(verifyDataV2.action, "bind-email")) {
                zvf0.D("e_intl_account_add_email_result", "p_account_and_security_view", new j760[]{j760.a("add_result", "success")});
            }
        } else {
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyDataV2.code);
            signInData.username = this.f9887f;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m21563N();
            signInData.grantType = SignInGrantType.get("email");
            act().hideInput();
            m12505J0(signInData, new d30() { // from class: l.rve
                public final void call() {
                    this.f20819a.m13676t1();
                }
            }, new e30() { // from class: l.sve
                public final void call(Object obj) {
                    this.f21686a.m13677u1((String) obj);
                }
            });
        }
        C0775gp.m15903j();
    }

    /* JADX INFO: renamed from: x1 */
    public void m13679x1(Captcha captcha) {
        if (TextUtils.isEmpty(this.f9887f)) {
            lsi0.h(R$string.f218j2);
            return;
        }
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.y();
        verifyDataNew_.action = VerifyReason.get("signup_signin");
        verifyDataNew_.email = this.f9887f;
        verifyDataNew_.codeLength = 4;
        if (NullChecker.a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((qwe) ((jq2) this).viewModel).m22459S();
        AccountModule.f27d.m25929I(verifyDataNew_).compose(C0002b.m271f()).subscribe(mkd0.K(new e30() { // from class: l.xve
            public final void call(Object obj) {
                this.f27739a.m13671o1(verifyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.yve
            public final void call(Object obj) {
                this.f28422a.m13672p1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: z1 */
    public void m13680z1() {
        final VerifyDataV2 verifyDataV2 = new VerifyDataV2();
        verifyDataV2.language = i0g0.y();
        verifyDataV2.action = this.f9889h;
        verifyDataV2.email = this.f9887f;
        verifyDataV2.code = ((qwe) ((jq2) this).viewModel).m22446A();
        verifyDataV2.codeLength = 4;
        ((qwe) ((jq2) this).viewModel).m22459S();
        this.f9886e = true;
        AccountModule.f26c.m192M0(verifyDataV2).subscribe(mkd0.K(new e30() { // from class: l.zve
            public final void call(Object obj) {
                this.f28999a.m13678v1(verifyDataV2, (roj0) obj);
            }
        }, new e30() { // from class: l.awe
            public final void call(Object obj) {
                this.f8572a.m13673q1(verifyDataV2, (Throwable) obj);
            }
        }, false));
    }
}
