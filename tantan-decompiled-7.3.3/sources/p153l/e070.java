package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.data.CaptchaData;
import com.p051p1.mobile.putong.account.p055ui.accountnew.PhoneNumberVerifyAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.SignUpDetailsNewAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.VerifyCodeAct;
import com.p051p1.mobile.putong.api.api.AccountTempApi;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.Captcha;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class e070 extends ibf0<c170> {

    /* JADX INFO: renamed from: e */
    public String f91425e;

    /* JADX INFO: renamed from: f */
    public CaptchaData f91426f;

    public e070(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public void m118788I1(final VerifyData verifyData) {
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
                l51.m152891K(((c170) this.viewModel).m107584S());
                TtcAccountBindAct.INSTANCE.m29683a(act(), signUpData, verifyData);
                act().hideInput();
                act().m68056e2();
            }
        } else if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            ((c170) this.viewModel).m107575J0();
            act().duringCreated(ike.m140279r(signUpData, null, true)).subscribe(psd0.m173597H(new y20() { // from class: l.mz60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f139480a.m118828t1(verifyData, (uxj0) obj);
                }
            }, new y20() { // from class: l.nz60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144409a.m118829u1((Throwable) obj);
                }
            }));
        } else {
            ((c170) this.viewModel).m107575J0();
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.verifyType = verifyData.verifyType;
            signInData.username = ((c170) this.viewModel).m107581P() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((c170) this.viewModel).m107583R();
            Device device = new Device();
            signInData.device = device;
            device.identifiers = tl8.m191617N();
            signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            m139325J0(signInData, new x20() { // from class: l.oz60
                @Override // p153l.x20
                public final void call() {
                    this.f149843a.m118830v1();
                }
            }, new y20() { // from class: l.pz60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f154722a.m118831x1((String) obj);
                }
            });
        }
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(((c170) this.viewModel).m107583R());
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m118800d1(x20 x20Var, Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                AccountModule.f16756c.f17052n = true;
                x20Var.call();
                return;
            }
            AccountModule.f16756c.f17052n = false;
            bsj0.m106246D(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Phone number register fail");
            x95.INSTANCE.m209793m("Sign Up", map);
        } catch (Exception e) {
            AccountModule.f16756c.f17052n = false;
            CrashHelper.m82479c(e);
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m118801e1(x20 x20Var, AccountErrorResponse accountErrorResponse) {
        x20Var.call();
        AccountModule.f16756c.f17052n = false;
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m118808l1(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ void m118809m1(Throwable th) {
    }

    /* JADX INFO: renamed from: n1 */
    public static boolean m118810n1(String str, boolean z) {
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
    public /* synthetic */ void m118811p1() {
        ((c170) this.viewModel).m107599r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m118812q1(Bundle bundle) {
        l51.m152887G(new Runnable() { // from class: l.b070
            @Override // java.lang.Runnable
            public final void run() {
                this.f74251a.m118811p1();
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public final /* synthetic */ void m118813B1(Throwable th) {
        th.getMessage();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m118820L1();
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            olj.INSTANCE.m168130c(act());
        } else if (!((c170) this.viewModel).m107572G0(th, "send_code")) {
            C20299tf.m190906b(th);
            HashMap map = new HashMap();
            map.put("Sign up status", "Phone number register fail");
            x95.INSTANCE.m209793m("Sign Up", map);
        }
        ((c170) this.viewModel).m107576K0();
    }

    /* JADX INFO: renamed from: C1 */
    public final /* synthetic */ void m118814C1(CaptchaData captchaData) {
        this.f91426f = captchaData;
        ((c170) this.viewModel).m107571E0(captchaData);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ boolean m118815D1(int i, int i2, Intent intent) {
        if (i2 != -1 || !intent.hasExtra("back_reason")) {
            return false;
        }
        String stringExtra = intent.getStringExtra("back_reason");
        this.f91425e = stringExtra;
        if ("show_captcha".equals(stringExtra)) {
            m118820L1();
            return true;
        }
        if ("change_number".equals(this.f91425e) || !"password_login".equals(this.f91425e)) {
            return true;
        }
        ((c170) this.viewModel).m107573H0();
        return true;
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m118816E1() {
        act().startActivityForResult(VerifyCodeAct.m29684Z1(act(), ((c170) this.viewModel).m107581P(), ((c170) this.viewModel).m107583R(), 1), new C4468a.a() { // from class: l.qz60
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f160222a.m118815D1(i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m118817F1() {
        ((c170) this.viewModel).m107576K0();
        act().progressDismiss();
        l51.m152891K(((c170) this.viewModel).m107584S());
        if (C16074bp.m105755j()) {
            ot40.m169071e().m169076j(((c170) this.viewModel).m107583R());
        }
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m118818H1(String str) {
        act().progressDismiss();
        if (!"newDevice".equals(str)) {
            i4g0.m138526x("e_password_verifypage_wrong_tips", act().pageId());
        }
        if (TextUtils.equals("suspicious", str)) {
            m118820L1();
        }
        ((c170) this.viewModel).m107579M0();
        HashMap map = new HashMap();
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        map.put("Method used", "Phone");
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, wx0.m208362b(App.f16088e));
        x95.INSTANCE.m209793m("Login", map);
    }

    /* JADX INFO: renamed from: J1 */
    public void m118819J1(Captcha captcha) {
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = q8g0.m175820y();
        verifyDataNew_.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyDataNew_.countryCode = ((c170) this.viewModel).m107581P();
        verifyDataNew_.mobileNumber = ((c170) this.viewModel).m107583R();
        verifyDataNew_.codeLength = 4;
        if (((c170) this.viewModel).m107589Y() && NullChecker.m82486a(this.f91426f)) {
            V v2 = this.viewModel;
            if (((c170) v2).f79344F) {
                verifyDataNew_.captchaToken = this.f91426f.token;
                verifyDataNew_.captchaValue = ((c170) v2).m107580O();
            }
        }
        if (NullChecker.m82486a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((c170) this.viewModel).m107575J0();
        Objects.toString(verifyDataNew_.action);
        AccountModule.f16756c.m29323b2(verifyDataNew_).subscribe(psd0.m173600K(new y20() { // from class: l.zz60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206675a.m118832z1(verifyDataNew_, (RiskVerification) obj);
            }
        }, new y20() { // from class: l.a070
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67693a.m118813B1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: L1 */
    public void m118820L1() {
        duringCreated(AccountModule.f16756c.m29313W0()).subscribe(psd0.m173597H(new y20() { // from class: l.c070
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79232a.m118814C1((CaptchaData) obj);
            }
        }, new y20() { // from class: l.d070
            @Override // p153l.y20
            public final void call(Object obj) {
                e070.m118808l1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N1 */
    public void m118821N1() {
        ((c170) this.viewModel).act().startActivity(PhoneNumberVerifyAct.m29493X1(((c170) this.viewModel).act(), ((c170) this.viewModel).m107581P(), ((c170) this.viewModel).m107583R()));
    }

    /* JADX INFO: renamed from: O1 */
    public void m118822O1() {
        l51.m152887G(new Runnable() { // from class: l.lz60
            @Override // java.lang.Runnable
            public final void run() {
                this.f134159a.m118816E1();
            }
        });
    }

    /* JADX INFO: renamed from: P1 */
    public void m118823P1() {
        SignInData signInData = new SignInData();
        signInData.username = ((c170) this.viewModel).m107581P() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((c170) this.viewModel).m107583R();
        signInData.password = ((c170) this.viewModel).m107582Q();
        signInData.grantType = SignInGrantType.get(SignInGrantType.password);
        Device device = new Device();
        signInData.device = device;
        device.identifiers = tl8.m191617N();
        ((c170) this.viewModel).m107575J0();
        act().progress(R$string.f16946j0);
        m139326L0(signInData, new x20() { // from class: l.rz60
            @Override // p153l.x20
            public final void call() {
                this.f165494a.m118817F1();
            }
        }, new y20() { // from class: l.sz60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171360a.m118818H1((String) obj);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m118824Q1(int i, String str, x20 x20Var, final x20 x20Var2) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.signup);
        verifyData.countryCode = i;
        verifyData.mobileNumber = str;
        verifyData.codeLength = 4;
        duringCreated(AccountModule.f16756c.m29277E2(verifyData)).subscribe(psd0.m173600K(new y20() { // from class: l.tz60
            @Override // p153l.y20
            public final void call(Object obj) {
                e070.m118801e1(x20Var2, (AccountErrorResponse) obj);
            }
        }, new y20() { // from class: l.vz60
            @Override // p153l.y20
            public final void call(Object obj) {
                e070.m118800d1(x20Var2, (Throwable) obj);
            }
        }, false));
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.jz60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123233a.m118812q1((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.uz60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181704a.m118826r1((C4470c) obj);
            }
        }));
        act().duringCreated(esf0.m122324e().f95596b).filter(new qcj() { // from class: l.wz60
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.xz60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196838a.m118827s1((Captcha) obj);
            }
        }, new y20() { // from class: l.yz60
            @Override // p153l.y20
            public final void call(Object obj) {
                e070.m118809m1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m118825o1() {
        return "verify_code_login".equals(this.f91425e);
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m118826r1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            ((c170) this.viewModel).m107578L0();
        } else if (c4470c == C4470c.f16268j) {
            ((c170) this.viewModel).m107570B0();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m118827s1(Captcha captcha) {
        if (NullChecker.m82486a(captcha)) {
            m118819J1(captcha);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m118828t1(VerifyData verifyData, uxj0 uxj0Var) {
        act().hideInput();
        ((c170) this.viewModel).m107576K0();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m139331r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m29497c2(((c170) this.viewModel).act(), verifyData, false, false));
        }
        act().m68056e2();
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m118829u1(Throwable th) {
        ((c170) this.viewModel).m107576K0();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m118830v1() {
        ((c170) this.viewModel).m107576K0();
        l51.m152891K(((c170) this.viewModel).m107584S());
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m118831x1(String str) {
        ((c170) this.viewModel).m107576K0();
    }

    /* JADX INFO: renamed from: z1 */
    public final /* synthetic */ void m118832z1(VerifyData verifyData, RiskVerification riskVerification) {
        ((c170) this.viewModel).m107576K0();
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        if (fdd0.m125084b(act(), riskVerification, verifyData, new fdd0.InterfaceC16952a() { // from class: l.kz60
            @Override // p153l.fdd0.InterfaceC16952a
            /* JADX INFO: renamed from: a */
            public final void mo114913a(VerifyData verifyData2) {
                this.f129387a.m118788I1(verifyData2);
            }
        })) {
            return;
        }
        ((c170) this.viewModel).m107605x0();
    }
}
