package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.data.CaptchaData;
import com.p000p1.mobile.putong.account.p002ui.accountnew.PhoneNumberVerifyAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.VerifyCodeAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.a;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Pattern;
import l.d30;
import l.e30;
import l.e51;
import l.i0g0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.px0;
import l.roj0;
import l.s7m;
import l.vjf0;
import l.w85;
import l.w9j;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yr60 extends b3f0<ws60> {

    /* JADX INFO: renamed from: e */
    public String f28349e;

    /* JADX INFO: renamed from: f */
    public CaptchaData f28350f;

    public yr60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public void m28325I1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        signUpData.verifyType = verifyData.verifyType;
        AccountModule.f26c.m232i2(signUpData);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                e51.K(((ws60) ((jq2) this).viewModel).m26741S());
                TtcAccountBindAct.INSTANCE.m583a(act(), signUpData, verifyData);
                act().hideInput();
                act().finish();
            }
        } else if (TEnum.equals(verifyData.action, "signup") || TEnum.equals(verifyData.action, "ttt-signup")) {
            ((ws60) ((jq2) this).viewModel).m26732J0();
            act().duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.gr60
                public final void call(Object obj) {
                    this.f13453a.m28365t1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.hr60
                public final void call(Object obj) {
                    this.f14025a.m28366u1((Throwable) obj);
                }
            }));
        } else {
            ((ws60) ((jq2) this).viewModel).m26732J0();
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.verifyType = verifyData.verifyType;
            signInData.username = ((ws60) ((jq2) this).viewModel).m26738P() + " " + ((ws60) ((jq2) this).viewModel).m26740R();
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m21563N();
            signInData.grantType = SignInGrantType.get("confirmation_code");
            m12505J0(signInData, new d30() { // from class: l.ir60
                public final void call() {
                    this.f14713a.m28367v1();
                }
            }, new e30() { // from class: l.jr60
                public final void call(Object obj) {
                    this.f15360a.m28368x1((String) obj);
                }
            });
        }
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(((ws60) ((jq2) this).viewModel).m26740R());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m28337d1(d30 d30Var, Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                AccountModule.f26c.f322n = true;
                d30Var.call();
                return;
            }
            AccountModule.f26c.f322n = false;
            yij0.D(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Phone number register fail");
            w85.INSTANCE.m("Sign Up", map);
        } catch (Exception e) {
            AccountModule.f26c.f322n = false;
            CrashHelper.c(e);
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m28338e1(d30 d30Var, AccountErrorResponse accountErrorResponse) {
        d30Var.call();
        AccountModule.f26c.f322n = false;
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m28345l1(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m28346m1(Throwable th) {
    }

    /* JADX INFO: renamed from: n1 */
    public static boolean m28347n1(String str, boolean z) {
        if (str.length() < 3) {
            return false;
        }
        if (!z) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m28348p1() {
        ((ws60) ((jq2) this).viewModel).m26755r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m28349q1(Bundle bundle) {
        e51.G(new Runnable() { // from class: l.vr60
            @Override // java.lang.Runnable
            public final void run() {
                this.f24425a.m28348p1();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m28350B1(Throwable th) {
        th.getMessage();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m28357L1();
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m25823c(act());
        } else if (!((ws60) ((jq2) this).viewModel).m26729G0(th, "send_code")) {
            C1478yf.m28232b(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Phone number register fail");
            w85.INSTANCE.m("Sign Up", map);
        }
        ((ws60) ((jq2) this).viewModel).m26733K0();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m28351C1(CaptchaData captchaData) {
        this.f28350f = captchaData;
        ((ws60) ((jq2) this).viewModel).m26728E0(captchaData);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ boolean m28352D1(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("back_reason")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("back_reason");
        this.f28349e = stringExtra;
        if ("show_captcha".equals(stringExtra)) {
            m28357L1();
            return true;
        }
        if ("change_number".equals(this.f28349e) || !"password_login".equals(this.f28349e)) {
            return true;
        }
        ((ws60) ((jq2) this).viewModel).m26730H0();
        return true;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m28353E1() {
        act().startActivityForResult(VerifyCodeAct.m584Y1(act(), ((ws60) ((jq2) this).viewModel).m26738P(), ((ws60) ((jq2) this).viewModel).m26740R(), 1), new a.a() { // from class: l.kr60
            /* JADX INFO: renamed from: a */
            public final boolean m18258a(int i, int i2, Intent intent) {
                return this.f15967a.m28352D1(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m28354F1() {
        ((ws60) ((jq2) this).viewModel).m26733K0();
        act().progressDismiss();
        e51.K(((ws60) ((jq2) this).viewModel).m26741S());
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(((ws60) ((jq2) this).viewModel).m26740R());
        }
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Success");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m28355H1(String str) {
        act().progressDismiss();
        if (!"newDevice".equals(str)) {
            zvf0.x("e_password_verifypage_wrong_tips", act().pageId());
        }
        if (TextUtils.equals("suspicious", str)) {
            m28357L1();
        }
        ((ws60) ((jq2) this).viewModel).m26736M0();
        HashMap map = new HashMap();
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        map.put("Method used", "Phone");
        map.put("Status", "Failure");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: J1 */
    public void m28356J1(Captcha captcha) {
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.y();
        verifyDataNew_.action = VerifyReason.get("signup_signin");
        verifyDataNew_.countryCode = ((ws60) ((jq2) this).viewModel).m26738P();
        verifyDataNew_.mobileNumber = ((ws60) ((jq2) this).viewModel).m26740R();
        verifyDataNew_.codeLength = 4;
        if (((ws60) ((jq2) this).viewModel).m26746Y() && NullChecker.a(this.f28350f)) {
            s7m s7mVar = ((jq2) this).viewModel;
            if (((ws60) s7mVar).f25347F) {
                verifyDataNew_.captchaToken = this.f28350f.token;
                verifyDataNew_.captchaValue = ((ws60) s7mVar).m26737O();
            }
        }
        if (NullChecker.a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((ws60) ((jq2) this).viewModel).m26732J0();
        Objects.toString(verifyDataNew_.action);
        AccountModule.f26c.m219b2(verifyDataNew_).subscribe(mkd0.K(new e30() { // from class: l.tr60
            public final void call(Object obj) {
                this.f22241a.m28369z1(verifyDataNew_, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.ur60
            public final void call(Object obj) {
                this.f23714a.m28350B1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: L1 */
    public void m28357L1() {
        duringCreated(AccountModule.f26c.m209W0()).subscribe(mkd0.H(new e30() { // from class: l.wr60
            public final void call(Object obj) {
                this.f25324a.m28351C1((CaptchaData) obj);
            }
        }, new e30() { // from class: l.xr60
            public final void call(Object obj) {
                yr60.m28345l1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N1 */
    public void m28358N1() {
        ((ws60) ((jq2) this).viewModel).act().startActivity(PhoneNumberVerifyAct.m390V1(((ws60) ((jq2) this).viewModel).act(), ((ws60) ((jq2) this).viewModel).m26738P(), ((ws60) ((jq2) this).viewModel).m26740R()));
    }

    /* JADX INFO: renamed from: O1 */
    public void m28359O1() {
        e51.G(new Runnable() { // from class: l.fr60
            @Override // java.lang.Runnable
            public final void run() {
                this.f12869a.m28353E1();
            }
        });
    }

    /* JADX INFO: renamed from: P1 */
    public void m28360P1() {
        SignInData signInData = new SignInData();
        signInData.username = ((ws60) ((jq2) this).viewModel).m26738P() + " " + ((ws60) ((jq2) this).viewModel).m26740R();
        signInData.password = ((ws60) ((jq2) this).viewModel).m26739Q();
        signInData.grantType = SignInGrantType.get("password");
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        ((ws60) ((jq2) this).viewModel).m26732J0();
        act().progress(R$string.f216j0);
        m12506L0(signInData, new d30() { // from class: l.lr60
            public final void call() {
                this.f16585a.m28354F1();
            }
        }, new e30() { // from class: l.mr60
            public final void call(Object obj) {
                this.f17196a.m28355H1((String) obj);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m28361Q1(int i, String str, d30 d30Var, final d30 d30Var2) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get("signup");
        verifyData.countryCode = i;
        verifyData.mobileNumber = str;
        verifyData.codeLength = 4;
        duringCreated(AccountModule.f26c.m173E2(verifyData)).subscribe(mkd0.K(new e30() { // from class: l.nr60
            public final void call(Object obj) {
                yr60.m28338e1(d30Var2, (AccountErrorResponse) obj);
            }
        }, new e30() { // from class: l.pr60
            public final void call(Object obj) {
                yr60.m28337d1(d30Var2, (Throwable) obj);
            }
        }, false));
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.dr60
            public final void call(Object obj) {
                this.f10535a.m28349q1((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.or60
            public final void call(Object obj) {
                this.f18345a.m28363r1((c) obj);
            }
        }));
        act().duringCreated(vjf0.e().b).filter(new w9j() { // from class: l.qr60
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.rr60
            public final void call(Object obj) {
                this.f20685a.m28364s1((Captcha) obj);
            }
        }, new e30() { // from class: l.sr60
            public final void call(Object obj) {
                yr60.m28346m1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m28362o1() {
        return "verify_code_login".equals(this.f28349e);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m28363r1(c cVar) {
        if (cVar == c.i) {
            ((ws60) ((jq2) this).viewModel).m26735L0();
        } else if (cVar == c.j) {
            ((ws60) ((jq2) this).viewModel).m26727B0();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m28364s1(Captcha captcha) {
        if (NullChecker.a(captcha)) {
            m28356J1(captcha);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m28365t1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((ws60) ((jq2) this).viewModel).m26733K0();
        if (TEnum.equals(verifyData.action, "ttt-signup")) {
            m12511r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m394b2(((ws60) ((jq2) this).viewModel).act(), verifyData, false, false));
        }
        act().finish();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m28366u1(Throwable th) {
        ((ws60) ((jq2) this).viewModel).m26733K0();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m28367v1() {
        ((ws60) ((jq2) this).viewModel).m26733K0();
        e51.K(((ws60) ((jq2) this).viewModel).m26741S());
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m28368x1(String str) {
        ((ws60) ((jq2) this).viewModel).m26733K0();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m28369z1(VerifyData verifyData, RiskVerification riskVerification) {
        ((ws60) ((jq2) this).viewModel).m26733K0();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (c5d0.m13183b(act(), riskVerification, verifyData, new c5d0.InterfaceC0598a() { // from class: l.er60
            @Override // p006l.c5d0.InterfaceC0598a
            /* JADX INFO: renamed from: a */
            public final void mo13185a(VerifyData verifyData2) {
                this.f11409a.m28325I1(verifyData2);
            }
        })) {
            return;
        }
        ((ws60) ((jq2) this).viewModel).m26761x0();
    }
}
