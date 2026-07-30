package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.data.CaptchaData;
import com.p046p1.mobile.putong.account.p050ui.accountnew.PhoneNumberVerifyAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.VerifyCodeAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class yr60 extends b3f0<ws60> {

    /* JADX INFO: renamed from: e */
    public String f199639e;

    /* JADX INFO: renamed from: f */
    public CaptchaData f199640f;

    public yr60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public void m215784I1(final VerifyData verifyData) {
        String str = verifyData.verifyType;
        Objects.toString(verifyData.action);
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        signUpData.verifyType = verifyData.verifyType;
        AccountModule.f16037c.m28337i2(signUpData);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                e51.m114746K(((ws60) this.viewModel).m205449S());
                TtcAccountBindAct.INSTANCE.m28684a(act(), signUpData, verifyData);
                act().hideInput();
                act().m66873d2();
            }
        } else if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            ((ws60) this.viewModel).m205440J0();
            act().duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.gr60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104032a.m215824t1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.hr60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109184a.m215825u1((Throwable) obj);
                }
            }));
        } else {
            ((ws60) this.viewModel).m205440J0();
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.verifyType = verifyData.verifyType;
            signInData.username = ((ws60) this.viewModel).m205446P() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((ws60) this.viewModel).m205448R();
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m169981N();
            signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            m100082J0(signInData, new d30() { // from class: l.ir60
                @Override // p149l.d30
                public final void call() {
                    this.f114590a.m215826v1();
                }
            }, new e30() { // from class: l.jr60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119381a.m215827x1((String) obj);
                }
            });
        }
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(((ws60) this.viewModel).m205448R());
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m215796d1(d30 d30Var, Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                AccountModule.f16037c.f16333n = true;
                d30Var.call();
                return;
            }
            AccountModule.f16037c.f16333n = false;
            yij0.m214926D(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Phone number register fail");
            w85.INSTANCE.m202145m("Sign Up", map);
        } catch (Exception e) {
            AccountModule.f16037c.f16333n = false;
            CrashHelper.m81296c(e);
            yij0.m214926D(th);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m215797e1(d30 d30Var, AccountErrorResponse accountErrorResponse) {
        d30Var.call();
        AccountModule.f16037c.f16333n = false;
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m215804l1(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m215805m1(Throwable th) {
    }

    /* JADX INFO: renamed from: n1 */
    public static boolean m215806n1(String str, boolean z) {
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
    public /* synthetic */ void m215807p1() {
        ((ws60) this.viewModel).m205463r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m215808q1(Bundle bundle) {
        e51.m114742G(new Runnable() { // from class: l.vr60
            @Override // java.lang.Runnable
            public final void run() {
                this.f182701a.m215807p1();
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m215809B1(Throwable th) {
        th.getMessage();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m215816L1();
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m198583c(act());
        } else if (!((ws60) this.viewModel).m205437G0(th, "send_code")) {
            C21383yf.m214461b(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Phone number register fail");
            w85.INSTANCE.m202145m("Sign Up", map);
        }
        ((ws60) this.viewModel).m205441K0();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m215810C1(CaptchaData captchaData) {
        this.f199640f = captchaData;
        ((ws60) this.viewModel).m205436E0(captchaData);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ boolean m215811D1(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("back_reason")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("back_reason");
        this.f199639e = stringExtra;
        if ("show_captcha".equals(stringExtra)) {
            m215816L1();
            return true;
        }
        if ("change_number".equals(this.f199639e) || !"password_login".equals(this.f199639e)) {
            return true;
        }
        ((ws60) this.viewModel).m205438H0();
        return true;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m215812E1() {
        act().startActivityForResult(VerifyCodeAct.m28685Y1(act(), ((ws60) this.viewModel).m205446P(), ((ws60) this.viewModel).m205448R(), 1), new C4317a.a() { // from class: l.kr60
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f124324a.m215811D1(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m215813F1() {
        ((ws60) this.viewModel).m205441K0();
        act().progressDismiss();
        e51.m114746K(((ws60) this.viewModel).m205449S());
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(((ws60) this.viewModel).m205448R());
        }
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m215814H1(String str) {
        act().progressDismiss();
        if (!"newDevice".equals(str)) {
            zvf0.m220402x("e_password_verifypage_wrong_tips", act().pageId());
        }
        if (TextUtils.equals("suspicious", str)) {
            m215816L1();
        }
        ((ws60) this.viewModel).m205444M0();
        HashMap map = new HashMap();
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        map.put("Method used", "Phone");
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: J1 */
    public void m215815J1(Captcha captcha) {
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.m133885y();
        verifyDataNew_.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyDataNew_.countryCode = ((ws60) this.viewModel).m205446P();
        verifyDataNew_.mobileNumber = ((ws60) this.viewModel).m205448R();
        verifyDataNew_.codeLength = 4;
        if (((ws60) this.viewModel).m205454Y() && NullChecker.m81303a(this.f199640f)) {
            V v2 = this.viewModel;
            if (((ws60) v2).f187874F) {
                verifyDataNew_.captchaToken = this.f199640f.token;
                verifyDataNew_.captchaValue = ((ws60) v2).m205445O();
            }
        }
        if (NullChecker.m81303a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((ws60) this.viewModel).m205440J0();
        Objects.toString(verifyDataNew_.action);
        AccountModule.f16037c.m28324b2(verifyDataNew_).subscribe(mkd0.m154959K(new e30() { // from class: l.tr60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171791a.m215828z1(verifyDataNew_, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.ur60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177809a.m215809B1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: L1 */
    public void m215816L1() {
        duringCreated(AccountModule.f16037c.m28314W0()).subscribe(mkd0.m154956H(new e30() { // from class: l.wr60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187768a.m215810C1((CaptchaData) obj);
            }
        }, new e30() { // from class: l.xr60
            @Override // p149l.e30
            public final void call(Object obj) {
                yr60.m215804l1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N1 */
    public void m215817N1() {
        ((ws60) this.viewModel).act().startActivity(PhoneNumberVerifyAct.m28494V1(((ws60) this.viewModel).act(), ((ws60) this.viewModel).m205446P(), ((ws60) this.viewModel).m205448R()));
    }

    /* JADX INFO: renamed from: O1 */
    public void m215818O1() {
        e51.m114742G(new Runnable() { // from class: l.fr60
            @Override // java.lang.Runnable
            public final void run() {
                this.f98895a.m215812E1();
            }
        });
    }

    /* JADX INFO: renamed from: P1 */
    public void m215819P1() {
        SignInData signInData = new SignInData();
        signInData.username = ((ws60) this.viewModel).m205446P() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((ws60) this.viewModel).m205448R();
        signInData.password = ((ws60) this.viewModel).m205447Q();
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        ((ws60) this.viewModel).m205440J0();
        act().progress(R$string.f16227j0);
        m100083L0(signInData, new d30() { // from class: l.lr60
            @Override // p149l.d30
            public final void call() {
                this.f129465a.m215813F1();
            }
        }, new e30() { // from class: l.mr60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135336a.m215814H1((String) obj);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m215820Q1(int i, String str, d30 d30Var, final d30 d30Var2) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.signup);
        verifyData.countryCode = i;
        verifyData.mobileNumber = str;
        verifyData.codeLength = 4;
        duringCreated(AccountModule.f16037c.m28278E2(verifyData)).subscribe(mkd0.m154959K(new e30() { // from class: l.nr60
            @Override // p149l.e30
            public final void call(Object obj) {
                yr60.m215797e1(d30Var2, (AccountErrorResponse) obj);
            }
        }, new e30() { // from class: l.pr60
            @Override // p149l.e30
            public final void call(Object obj) {
                yr60.m215796d1(d30Var2, (Throwable) obj);
            }
        }, false));
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.dr60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87587a.m215808q1((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.or60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145236a.m215822r1((C4319c) obj);
            }
        }));
        act().duringCreated(vjf0.m198623e().f181687b).filter(new w9j() { // from class: l.qr60
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.rr60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160726a.m215823s1((Captcha) obj);
            }
        }, new e30() { // from class: l.sr60
            @Override // p149l.e30
            public final void call(Object obj) {
                yr60.m215805m1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m215821o1() {
        return "verify_code_login".equals(this.f199639e);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m215822r1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            ((ws60) this.viewModel).m205443L0();
        } else if (c4319c == C4319c.f15549j) {
            ((ws60) this.viewModel).m205435B0();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m215823s1(Captcha captcha) {
        if (NullChecker.m81303a(captcha)) {
            m215815J1(captcha);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m215824t1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((ws60) this.viewModel).m205441K0();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m100088r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m28498b2(((ws60) this.viewModel).act(), verifyData, false, false));
        }
        act().m66873d2();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m215825u1(Throwable th) {
        ((ws60) this.viewModel).m205441K0();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m215826v1() {
        ((ws60) this.viewModel).m205441K0();
        e51.m114746K(((ws60) this.viewModel).m205449S());
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m215827x1(String str) {
        ((ws60) this.viewModel).m205441K0();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m215828z1(VerifyData verifyData, RiskVerification riskVerification) {
        ((ws60) this.viewModel).m205441K0();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (c5d0.m105290b(act(), riskVerification, verifyData, new c5d0.InterfaceC16073a() { // from class: l.er60
            @Override // p149l.c5d0.InterfaceC16073a
            /* JADX INFO: renamed from: a */
            public final void mo105292a(VerifyData verifyData2) {
                this.f92886a.m215784I1(verifyData2);
            }
        })) {
            return;
        }
        ((ws60) this.viewModel).m205469x0();
    }
}
