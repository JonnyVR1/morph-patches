package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class azk0 extends b3f0<qzk0> {

    /* JADX INFO: renamed from: e */
    public boolean f72360e;

    /* JADX INFO: renamed from: f */
    public int f72361f;

    /* JADX INFO: renamed from: g */
    public String f72362g;

    /* JADX INFO: renamed from: h */
    public int f72363h;

    public azk0(mcr mcrVar) {
        super(mcrVar);
        this.f72360e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public /* synthetic */ void m99670B1() {
        e51.m114746K(((qzk0) this.viewModel).m177260F());
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public /* synthetic */ void m99671C1(String str) {
        this.f72360e = false;
        ((qzk0) this.viewModel).m177271Z();
        if (m99710o1()) {
            zvf0.m220402x("e_code_wrong_tip", act().pageId());
        }
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m99691l1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m99692q1() {
        ((qzk0) this.viewModel).m177272r();
        if (e51.m114737B(((qzk0) this.viewModel).m177260F())) {
            return;
        }
        m99704N1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m99693r1(Bundle bundle) {
        e51.m114742G(new Runnable() { // from class: l.uyk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178872a.m99692q1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m99694s1(Captcha captcha) {
        if (NullChecker.m81303a(captcha)) {
            m99704N1(captcha);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m99695u1(Throwable th) {
        th.getMessage();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m99708m1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m198583c(act());
        } else if (!((qzk0) this.viewModel).m177269X(th)) {
            C21383yf.m214461b(th);
        }
        ((qzk0) this.viewModel).m177271Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public /* synthetic */ void m99696z1(Throwable th) {
        this.f72360e = false;
        ((qzk0) this.viewModel).m177271Z();
        ((qzk0) this.viewModel).m177258C();
        yij0.m214926D(th);
        HashMap map = new HashMap();
        map.put("Sign up status", "Phone number register fail");
        w85.INSTANCE.m202145m("Sign Up", map);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m99697D1(final VerifyData verifyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        AccountModule.f16037c.m28337i2(signUpData);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                e51.m114746K(((qzk0) this.viewModel).m177260F());
                TtcAccountBindAct.INSTANCE.m28684a(act(), signUpData, verifyData);
                act().hideInput();
                act().m47815F2();
            }
        } else if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            ((qzk0) this.viewModel).act().duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.nyk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f141132a.m99714x1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.oyk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146333a.m99696z1((Throwable) obj);
                }
            }));
        } else {
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.username = this.f72361f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f72362g;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m169981N();
            signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            act().hideInput();
            m100082J0(signInData, new d30() { // from class: l.pyk0
                @Override // p149l.d30
                public final void call() {
                    this.f151861a.m99670B1();
                }
            }, new e30() { // from class: l.qyk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156936a.m99671C1((String) obj);
                }
            });
        }
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f72362g);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m99698E1() {
        e51.m114746K(((qzk0) this.viewModel).m177260F());
        ((qzk0) this.viewModel).m177271Z();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m99699F1(String str) {
        this.f72360e = false;
        ((qzk0) this.viewModel).m177271Z();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m99700H1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((qzk0) this.viewModel).m177271Z();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m100088r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m28498b2(((qzk0) this.viewModel).act(), verifyData, false, false));
        }
        act().m47815F2();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m99701I1(Throwable th) {
        this.f72360e = false;
        ((qzk0) this.viewModel).m177271Z();
        ((qzk0) this.viewModel).m177258C();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m99702J1() {
        e51.m114746K(((qzk0) this.viewModel).m177260F());
        ((qzk0) this.viewModel).m177271Z();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m99703L1(String str) {
        this.f72360e = false;
        ((qzk0) this.viewModel).m177271Z();
    }

    /* JADX INFO: renamed from: N1 */
    public void m99704N1(Captcha captcha) {
        if (TextUtils.isEmpty(this.f72362g)) {
            lsi0.m151578h(R$string.f16167Z);
            return;
        }
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.m133885y();
        verifyDataNew_.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyDataNew_.countryCode = this.f72361f;
        verifyDataNew_.mobileNumber = this.f72362g;
        verifyDataNew_.codeLength = 4;
        if (NullChecker.m81303a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((qzk0) this.viewModel).m177270Y();
        Objects.toString(verifyDataNew_.action);
        AccountModule.f16037c.m28324b2(verifyDataNew_).subscribe(mkd0.m154959K(new e30() { // from class: l.vyk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183539a.m99712t1(verifyDataNew_, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.wyk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188576a.m99695u1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: O1 */
    public void m99705O1() {
        final VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyData.countryCode = this.f72361f;
        verifyData.mobileNumber = this.f72362g;
        verifyData.code = ((qzk0) this.viewModel).m177259E();
        verifyData.codeLength = 4;
        ((qzk0) this.viewModel).m177270Y();
        this.f72360e = true;
        AccountModule.f16037c.m28270A2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.hyk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110124a.m99697D1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.iyk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115462a.m99713v1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: P1 */
    public void m99706P1() {
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(((qzk0) this.viewModel).m177259E());
        signInData.username = this.f72361f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f72362g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m169981N();
        signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
        this.f72360e = true;
        ((qzk0) this.viewModel).m177270Y();
        m100083L0(signInData, new d30() { // from class: l.yyk0
            @Override // p149l.d30
            public final void call() {
                this.f200778a.m99698E1();
            }
        }, new e30() { // from class: l.zyk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205697a.m99699F1((String) obj);
            }
        }, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m99707Q1(final VerifyData verifyData) {
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
                e51.m114746K(((qzk0) this.viewModel).m177260F());
                TtcAccountBindAct.INSTANCE.m28684a(act(), signUpData, verifyData);
                act().hideInput();
                act().m47815F2();
            }
        } else if (TEnum.equals(verifyData.action, VerifyReason.signup) || TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            ((qzk0) this.viewModel).m177270Y();
            ((qzk0) this.viewModel).act().duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.jyk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120313a.m99700H1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.kyk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f125315a.m99701I1((Throwable) obj);
                }
            }));
        } else {
            ((qzk0) this.viewModel).m177270Y();
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.verifyType = verifyData.verifyType;
            signInData.username = this.f72361f + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f72362g;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m169981N();
            signInData.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            act().hideInput();
            m100082J0(signInData, new d30() { // from class: l.lyk0
                @Override // p149l.d30
                public final void call() {
                    this.f130580a.m99702J1();
                }
            }, new e30() { // from class: l.myk0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136318a.m99703L1((String) obj);
                }
            });
        }
        if (C17133gp.m127319j()) {
            al40.m97271e().m97276j(this.f72362g);
        }
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.f72361f = act().getIntent().getIntExtra("ccode", 86);
        this.f72362g = act().getIntent().getStringExtra("phone");
        this.f72363h = act().getIntent().getIntExtra("verify_type", 1);
        creates(new e30() { // from class: l.gyk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105021a.m99693r1((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.m198623e().f181687b).filter(new w9j() { // from class: l.ryk0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.syk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166966a.m99694s1((Captcha) obj);
            }
        }, new e30() { // from class: l.tyk0
            @Override // p149l.e30
            public final void call(Object obj) {
                azk0.m99691l1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public void m99708m1(String str) {
        Intent intent = new Intent();
        intent.putExtra("back_reason", str);
        act().setResult(-1, intent);
        act().m47815F2();
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m99709n1() {
        return this.f72360e;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m99710o1() {
        return this.f72363h == 1;
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m99711p1() {
        return this.f72363h == 2;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m99712t1(VerifyData verifyData, RiskVerification riskVerification) {
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        ((qzk0) this.viewModel).m177271Z();
        if (c5d0.m105290b(act(), riskVerification, verifyData, new c5d0.InterfaceC16073a() { // from class: l.xyk0
            @Override // p149l.c5d0.InterfaceC16073a
            /* JADX INFO: renamed from: a */
            public final void mo105292a(VerifyData verifyData2) {
                this.f195091a.m99707Q1(verifyData2);
            }
        })) {
            return;
        }
        ((qzk0) this.viewModel).m177268W();
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m99713v1(Throwable th) {
        this.f72360e = false;
        if (m99710o1()) {
            zvf0.m220402x("e_code_wrong_tip", act().pageId());
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m99708m1("show_captcha");
        } else if (!((qzk0) this.viewModel).m177269X(th)) {
            C21383yf.m214461b(th);
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 403001) {
            if (AccountModule.f16037c.f16333n) {
                HashMap map = new HashMap();
                map.put("Method used", "Phone");
                map.put("Status", "Failure");
                map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
                w85.INSTANCE.m202145m("Login", map);
            } else {
                HashMap map2 = new HashMap();
                map2.put("Sign up status", "Phone number register fail");
                w85.INSTANCE.m202145m("Sign Up", map2);
            }
        }
        ((qzk0) this.viewModel).m177271Z();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m99714x1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((qzk0) this.viewModel).m177271Z();
        if (TEnum.equals(verifyData.action, VerifyReason.ttt_signup)) {
            m100088r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m28498b2(((qzk0) this.viewModel).act(), verifyData, false, false));
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Phone number register success");
        w85.INSTANCE.m202145m("Sign Up", map);
        act().m47815F2();
    }
}
