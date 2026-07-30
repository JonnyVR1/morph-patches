package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.api.C4576b;
import com.p046p1.mobile.putong.account.p050ui.accountnew.SignUpDetailsNewAct;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p046p1.mobile.putong.api.api.AccountTempApi;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Captcha;
import com.p046p1.mobile.putong.data.Device;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.SignupStage;
import com.p046p1.mobile.putong.data.StepSignupStage;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyDataV2;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class cwe extends b3f0<qwe> {

    /* JADX INFO: renamed from: e */
    public boolean f82777e;

    /* JADX INFO: renamed from: f */
    public String f82778f;

    /* JADX INFO: renamed from: g */
    public int f82779g;

    /* JADX INFO: renamed from: h */
    public VerifyReason f82780h;

    /* JADX INFO: renamed from: i */
    public String f82781i;

    public cwe(mcr mcrVar) {
        super(mcrVar);
        this.f82777e = false;
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m108993R0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m109005l1() {
        ((qwe) this.viewModel).m176821r();
        if (e51.m114737B(((qwe) this.viewModel).m176807B())) {
            return;
        }
        m109022x1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m109006m1(Bundle bundle) {
        e51.m114742G(new Runnable() { // from class: l.wve
            @Override // java.lang.Runnable
            public final void run() {
                this.f188235a.m109005l1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public /* synthetic */ void m109007n1(Captcha captcha) {
        if (NullChecker.m81303a(captcha)) {
            m109022x1(captcha);
        }
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        this.f82778f = act().getIntent().getStringExtra("email");
        this.f82779g = act().getIntent().getIntExtra("verify_type", 1);
        creates(new e30() { // from class: l.pve
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151446a.m109006m1((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.m198623e().f181687b).filter(new w9j() { // from class: l.tve
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.uve
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178528a.m109007n1((Captcha) obj);
            }
        }, new e30() { // from class: l.vve
            @Override // p149l.e30
            public final void call(Object obj) {
                cwe.m108993R0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f1 */
    public void m109008f1(String str) {
        Intent intent = new Intent();
        intent.putExtra("back_reason", str);
        act().setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: g1 */
    public void m109009g1(VerifyReason verifyReason, String str) {
        this.f82780h = verifyReason;
        this.f82781i = str;
    }

    /* JADX INFO: renamed from: h1 */
    public boolean m109010h1() {
        return this.f82777e;
    }

    /* JADX INFO: renamed from: i1 */
    public boolean m109011i1() {
        return VerifyReason.get(VerifyReason.signup_signin).equals(this.f82780h);
    }

    /* JADX INFO: renamed from: j1 */
    public boolean m109012j1() {
        return this.f82779g == 1;
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m109013k1() {
        return this.f82779g == 2;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m109014o1(VerifyData verifyData, roj0 roj0Var) {
        ((qwe) this.viewModel).m176817Q();
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m109015p1(Throwable th) {
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m109008f1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            zvf0.m220402x("e_intl_email_verification_risk_graph", act().pageId());
            vij.INSTANCE.m198584d("email", act());
        } else if (!((qwe) this.viewModel).m176818R(th)) {
            C21383yf.m214461b(th);
        }
        ((qwe) this.viewModel).m176820T();
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m109016q1(VerifyDataV2 verifyDataV2, Throwable th) {
        this.f82777e = false;
        if (m109012j1()) {
            zvf0.m220402x("e_intl_email_verification_code_error", act().pageId());
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m109008f1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 400149) {
            osi0.m165782f(R$string.f16180b1);
        } else if (((qwe) this.viewModel).m176818R(th)) {
            HashMap map = new HashMap();
            map.put("Sign up status", "Email register fail");
            w85.INSTANCE.m202145m("Sign Up", map);
        } else {
            C21383yf.m214461b(th);
            HashMap map2 = new HashMap();
            map2.put("Sign up status", "Email register fail");
            w85.INSTANCE.m202145m("Sign Up", map2);
        }
        ((qwe) this.viewModel).m176820T();
        if (TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) || TEnum.equals(verifyDataV2.action, VerifyReason.change_email)) {
            zvf0.m220371D(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "e_account_add_email_code_done" : "e_account_replace_email_code_done", ((qwe) this.viewModel).act().pageId(), j760.m140076a(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "add_result" : "replace_result", "fail"));
            if (TextUtils.equals(this.f82781i, "bind_or_change_email") && TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
                zvf0.m220371D("e_intl_account_add_email_result", "p_account_and_security_view", j760.m140076a("add_result", "fail"));
            }
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m109017r1(VerifyDataV2 verifyDataV2, SignUpData signUpData, roj0 roj0Var) {
        act().hideInput();
        ((qwe) this.viewModel).m176820T();
        if (TEnum.equals(verifyDataV2.action, VerifyReason.ttt_signup)) {
            m100088r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m28497a2(((qwe) this.viewModel).act(), signUpData));
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register success");
        w85.INSTANCE.m202145m("Sign Up", map);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m109018s1(Throwable th) {
        this.f82777e = false;
        ((qwe) this.viewModel).m176820T();
        ((qwe) this.viewModel).m176823z();
        yij0.m214926D(th);
        HashMap map = new HashMap();
        map.put("Sign up status", "Email register fail");
        w85.INSTANCE.m202145m("Sign Up", map);
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m109019t1() {
        e51.m114746K(((qwe) this.viewModel).m176807B());
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Success");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m109020u1(String str) {
        this.f82777e = false;
        ((qwe) this.viewModel).m176820T();
        if (m109012j1()) {
            zvf0.m220402x("e_intl_email_verification_code_error", act().pageId());
        }
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Method used", "email");
        map.put("Status", "Failure");
        map.put(Constants.CLTAP_APP_VERSION, px0.m171778b(App.f15369e));
        w85.INSTANCE.m202145m("Login", map);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m109021v1(final VerifyDataV2 verifyDataV2, roj0 roj0Var) {
        final SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.email;
        signUpData.email = verifyDataV2.email;
        signUpData.code = verifyDataV2.code;
        signUpData.phoneNumber = verifyDataV2.mobileNumber;
        signUpData.action = verifyDataV2.action.toString();
        AccountModule.f16037c.m28337i2(signUpData);
        if (TEnum.equals(verifyDataV2.action, "pending")) {
            if (act() != null) {
                e51.m114746K(((qwe) this.viewModel).m176807B());
                TtcAccountBindAct.INSTANCE.m28684a(act(), signUpData, VerifyDataV2.v2ConvertV1(verifyDataV2));
                act().hideInput();
                act().m66873d2();
            }
        } else if (TEnum.equals(verifyDataV2.action, VerifyReason.signup) || TEnum.equals(verifyDataV2.action, VerifyReason.ttt_signup)) {
            ((qwe) this.viewModel).act().duringCreated(eje.m116827r(signUpData, null, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.bwe
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77612a.m109017r1(verifyDataV2, signUpData, (roj0) obj);
                }
            }, new e30() { // from class: l.qve
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156600a.m109018s1((Throwable) obj);
                }
            }));
        } else if (TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) || TEnum.equals(verifyDataV2.action, VerifyReason.change_email)) {
            osi0.m165782f(R$string.f16143U0);
            act().hideInput();
            if ("home".equals(this.f82781i) && TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
                act().startActivity(AccountModule.m28132H().toNewMainAct(act(), false, true));
                act().m66873d2();
            } else if ("messageDeeplink".equals(this.f82781i)) {
                Intent intentStartMessagesAct = AccountModule.m28132H().startMessagesAct(act(), User.ID_TEAM_ACCOUNT, false, false);
                intentStartMessagesAct.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                act().startActivity(intentStartMessagesAct);
            } else if ("bind_or_change_email".equals(this.f82781i)) {
                qib0.f154713b0.f139231b.mo30729Us(act());
            } else if ("google_login_verify_email".equals(this.f82781i)) {
                eje.m116824h().m116829f(SignupStage.get("verified"), StepSignupStage.get(StepSignupStage.google_email_saved));
                Intent intentM132321e = C17367hp.m132321e(act());
                intentM132321e.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
                act().startActivity(intentM132321e);
            } else {
                act().startActivity(AccountModule.m28132H().toNewMainAct(act(), false, true));
                act().m66873d2();
            }
            zvf0.m220371D(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "e_account_add_email_code_done" : "e_account_replace_email_code_done", ((qwe) this.viewModel).act().pageId(), j760.m140076a(TEnum.equals(verifyDataV2.action, VerifyReason.bind_email) ? "add_result" : "replace_result", "success"));
            if (TextUtils.equals(this.f82781i, "bind_or_change_email") && TEnum.equals(verifyDataV2.action, VerifyReason.bind_email)) {
                zvf0.m220371D("e_intl_account_add_email_result", "p_account_and_security_view", j760.m140076a("add_result", "success"));
            }
        } else {
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyDataV2.code);
            signInData.username = this.f82778f;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m169981N();
            signInData.grantType = SignInGrantType.get("email");
            act().hideInput();
            m100082J0(signInData, new d30() { // from class: l.rve
                @Override // p149l.d30
                public final void call() {
                    this.f161194a.m109019t1();
                }
            }, new e30() { // from class: l.sve
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166560a.m109020u1((String) obj);
                }
            });
        }
        C17133gp.m127319j();
    }

    /* JADX INFO: renamed from: x1 */
    public void m109022x1(Captcha captcha) {
        if (TextUtils.isEmpty(this.f82778f)) {
            lsi0.m151578h(R$string.f16229j2);
            return;
        }
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.m133885y();
        verifyDataNew_.action = VerifyReason.get(VerifyReason.signup_signin);
        verifyDataNew_.email = this.f82778f;
        verifyDataNew_.codeLength = 4;
        if (NullChecker.m81303a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((qwe) this.viewModel).m176819S();
        AccountModule.f16038d.m200248I(verifyDataNew_).compose(C4576b.m28376f()).subscribe(mkd0.m154959K(new e30() { // from class: l.xve
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194600a.m109014o1(verifyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.yve
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200249a.m109015p1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: z1 */
    public void m109023z1() {
        final VerifyDataV2 verifyDataV2 = new VerifyDataV2();
        verifyDataV2.language = i0g0.m133885y();
        verifyDataV2.action = this.f82780h;
        verifyDataV2.email = this.f82778f;
        verifyDataV2.code = ((qwe) this.viewModel).m176806A();
        verifyDataV2.codeLength = 4;
        ((qwe) this.viewModel).m176819S();
        this.f82777e = true;
        AccountModule.f16037c.m28297M0(verifyDataV2).subscribe(mkd0.m154959K(new e30() { // from class: l.zve
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204993a.m109021v1(verifyDataV2, (roj0) obj);
            }
        }, new e30() { // from class: l.awe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72035a.m109016q1(verifyDataV2, (Throwable) obj);
            }
        }, false));
    }
}
