package p006l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.SignUpDetailsNewAct;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.TtcAccountBindAct;
import com.p000p1.mobile.putong.api.api.AccountTempApi;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.Captcha;
import com.p1.mobile.putong.data.Device;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.i0g0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.px0;
import l.roj0;
import l.vjf0;
import l.w85;
import l.w9j;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class azk0 extends b3f0<qzk0> {

    /* JADX INFO: renamed from: e */
    public boolean f8628e;

    /* JADX INFO: renamed from: f */
    public int f8629f;

    /* JADX INFO: renamed from: g */
    public String f8630g;

    /* JADX INFO: renamed from: h */
    public int f8631h;

    public azk0(mcr mcrVar) {
        super(mcrVar);
        this.f8628e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public /* synthetic */ void m12363B1() {
        e51.K(((qzk0) ((jq2) this).viewModel).m22549F());
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Success");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public /* synthetic */ void m12364C1(String str) {
        this.f8628e = false;
        ((qzk0) ((jq2) this).viewModel).m22560Z();
        if (m12404o1()) {
            zvf0.x("e_code_wrong_tip", act().pageId());
        }
        if (TextUtils.equals(str, "inActivated")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("Method used", "Phone");
        map.put("Status", "Failure");
        map.put("Version", px0.b(App.e));
        w85.INSTANCE.m("Login", map);
    }

    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m12384l1(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public /* synthetic */ void m12385q1() {
        ((qzk0) ((jq2) this).viewModel).m22561r();
        if (e51.B(((qzk0) ((jq2) this).viewModel).m22549F())) {
            return;
        }
        m12397N1(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public /* synthetic */ void m12386r1(Bundle bundle) {
        e51.G(new Runnable() { // from class: l.uyk0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23818a.m12385q1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public /* synthetic */ void m12387s1(Captcha captcha) {
        if (NullChecker.a(captcha)) {
            m12397N1(captcha);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u1 */
    public /* synthetic */ void m12388u1(Throwable th) {
        th.getMessage();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m12402m1("show_captcha");
        } else if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m25823c(act());
        } else if (!((qzk0) ((jq2) this).viewModel).m22558X(th)) {
            C1478yf.m28232b(th);
        }
        ((qzk0) ((jq2) this).viewModel).m22560Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public /* synthetic */ void m12389z1(Throwable th) {
        this.f8628e = false;
        ((qzk0) ((jq2) this).viewModel).m22560Z();
        ((qzk0) ((jq2) this).viewModel).m22547C();
        yij0.D(th);
        HashMap map = new HashMap();
        map.put("Sign up status", "Phone number register fail");
        w85.INSTANCE.m("Sign Up", map);
    }

    /* JADX INFO: renamed from: D1 */
    public final /* synthetic */ void m12390D1(final VerifyData verifyData, roj0 roj0Var) {
        SignUpData signUpData = new SignUpData();
        signUpData.signUpType = AccountTempApi.SignUpType.phone;
        signUpData.countryCode = verifyData.countryCode;
        signUpData.code = verifyData.code;
        signUpData.phoneNumber = verifyData.mobileNumber;
        signUpData.action = verifyData.action.toString();
        AccountModule.f26c.m232i2(signUpData);
        if (TEnum.equals(verifyData.action, "pending")) {
            if (act() != null) {
                e51.K(((qzk0) ((jq2) this).viewModel).m22549F());
                TtcAccountBindAct.INSTANCE.m583a(act(), signUpData, verifyData);
                act().hideInput();
                act().finish();
            }
        } else if (TEnum.equals(verifyData.action, "signup") || TEnum.equals(verifyData.action, "ttt-signup")) {
            ((qzk0) ((jq2) this).viewModel).act().duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.nyk0
                public final void call(Object obj) {
                    this.f17939a.m12408x1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.oyk0
                public final void call(Object obj) {
                    this.f18499a.m12389z1((Throwable) obj);
                }
            }));
        } else {
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.username = this.f8629f + " " + this.f8630g;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m21563N();
            signInData.grantType = SignInGrantType.get("confirmation_code");
            act().hideInput();
            m12505J0(signInData, new d30() { // from class: l.pyk0
                public final void call() {
                    this.f19456a.m12363B1();
                }
            }, new e30() { // from class: l.qyk0
                public final void call(Object obj) {
                    this.f20163a.m12364C1((String) obj);
                }
            });
        }
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f8630g);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final /* synthetic */ void m12391E1() {
        e51.K(((qzk0) ((jq2) this).viewModel).m22549F());
        ((qzk0) ((jq2) this).viewModel).m22560Z();
    }

    /* JADX INFO: renamed from: F1 */
    public final /* synthetic */ void m12392F1(String str) {
        this.f8628e = false;
        ((qzk0) ((jq2) this).viewModel).m22560Z();
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ void m12393H1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((qzk0) ((jq2) this).viewModel).m22560Z();
        if (TEnum.equals(verifyData.action, "ttt-signup")) {
            m12511r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m394b2(((qzk0) ((jq2) this).viewModel).act(), verifyData, false, false));
        }
        act().finish();
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m12394I1(Throwable th) {
        this.f8628e = false;
        ((qzk0) ((jq2) this).viewModel).m22560Z();
        ((qzk0) ((jq2) this).viewModel).m22547C();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m12395J1() {
        e51.K(((qzk0) ((jq2) this).viewModel).m22549F());
        ((qzk0) ((jq2) this).viewModel).m22560Z();
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m12396L1(String str) {
        this.f8628e = false;
        ((qzk0) ((jq2) this).viewModel).m22560Z();
    }

    /* JADX INFO: renamed from: N1 */
    public void m12397N1(Captcha captcha) {
        if (TextUtils.isEmpty(this.f8630g)) {
            lsi0.h(R$string.f156Z);
            return;
        }
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.y();
        verifyDataNew_.action = VerifyReason.get("signup_signin");
        verifyDataNew_.countryCode = this.f8629f;
        verifyDataNew_.mobileNumber = this.f8630g;
        verifyDataNew_.codeLength = 4;
        if (NullChecker.a(captcha)) {
            verifyDataNew_.captcha = captcha;
        }
        ((qzk0) ((jq2) this).viewModel).m22559Y();
        Objects.toString(verifyDataNew_.action);
        AccountModule.f26c.m219b2(verifyDataNew_).subscribe(mkd0.K(new e30() { // from class: l.vyk0
            public final void call(Object obj) {
                this.f24543a.m12406t1(verifyDataNew_, (RiskVerification) obj);
            }
        }, new e30() { // from class: l.wyk0
            public final void call(Object obj) {
                this.f25501a.m12388u1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: O1 */
    public void m12398O1() {
        final VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get("signup_signin");
        verifyData.countryCode = this.f8629f;
        verifyData.mobileNumber = this.f8630g;
        verifyData.code = ((qzk0) ((jq2) this).viewModel).m22548E();
        verifyData.codeLength = 4;
        ((qzk0) ((jq2) this).viewModel).m22559Y();
        this.f8628e = true;
        AccountModule.f26c.m165A2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.hyk0
            public final void call(Object obj) {
                this.f14142a.m12390D1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.iyk0
            public final void call(Object obj) {
                this.f14881a.m12407v1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: P1 */
    public void m12399P1() {
        SignInData signInData = new SignInData();
        signInData.code = Integer.valueOf(((qzk0) ((jq2) this).viewModel).m22548E());
        signInData.username = this.f8629f + " " + this.f8630g;
        Device device = new Device();
        signInData.device = device;
        device.identifiers = pk8.m21563N();
        signInData.grantType = SignInGrantType.get("confirmation_code");
        this.f8628e = true;
        ((qzk0) ((jq2) this).viewModel).m22559Y();
        m12506L0(signInData, new d30() { // from class: l.yyk0
            public final void call() {
                this.f28503a.m12391E1();
            }
        }, new e30() { // from class: l.zyk0
            public final void call(Object obj) {
                this.f29042a.m12392F1((String) obj);
            }
        }, false);
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m12400Q1(final VerifyData verifyData) {
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
                e51.K(((qzk0) ((jq2) this).viewModel).m22549F());
                TtcAccountBindAct.INSTANCE.m583a(act(), signUpData, verifyData);
                act().hideInput();
                act().finish();
            }
        } else if (TEnum.equals(verifyData.action, "signup") || TEnum.equals(verifyData.action, "ttt-signup")) {
            ((qzk0) ((jq2) this).viewModel).m22559Y();
            ((qzk0) ((jq2) this).viewModel).act().duringCreated(eje.m14577r(signUpData, null, true)).subscribe(mkd0.H(new e30() { // from class: l.jyk0
                public final void call(Object obj) {
                    this.f15497a.m12393H1(verifyData, (roj0) obj);
                }
            }, new e30() { // from class: l.kyk0
                public final void call(Object obj) {
                    this.f16103a.m12394I1((Throwable) obj);
                }
            }));
        } else {
            ((qzk0) ((jq2) this).viewModel).m22559Y();
            SignInData signInData = new SignInData();
            signInData.code = Integer.valueOf(verifyData.code);
            signInData.verifyType = verifyData.verifyType;
            signInData.username = this.f8629f + " " + this.f8630g;
            Device device = new Device();
            signInData.device = device;
            device.identifiers = pk8.m21563N();
            signInData.grantType = SignInGrantType.get("confirmation_code");
            act().hideInput();
            m12505J0(signInData, new d30() { // from class: l.lyk0
                public final void call() {
                    this.f16715a.m12395J1();
                }
            }, new e30() { // from class: l.myk0
                public final void call(Object obj) {
                    this.f17399a.m12396L1((String) obj);
                }
            });
        }
        if (C0775gp.m15903j()) {
            al40.m11881e().m11886j(this.f8630g);
        }
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        this.f8629f = act().getIntent().getIntExtra("ccode", 86);
        this.f8630g = act().getIntent().getStringExtra("phone");
        this.f8631h = act().getIntent().getIntExtra("verify_type", 1);
        creates(new e30() { // from class: l.gyk0
            public final void call(Object obj) {
                this.f13590a.m12386r1((Bundle) obj);
            }
        });
        act().duringCreated(vjf0.e().b).filter(new w9j() { // from class: l.ryk0
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Captcha) obj).localExpired);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.syk0
            public final void call(Object obj) {
                this.f21767a.m12387s1((Captcha) obj);
            }
        }, new e30() { // from class: l.tyk0
            public final void call(Object obj) {
                azk0.m12384l1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m1 */
    public void m12402m1(String str) {
        Intent intent = new Intent();
        intent.putExtra("back_reason", str);
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: n1 */
    public boolean m12403n1() {
        return this.f8628e;
    }

    /* JADX INFO: renamed from: o1 */
    public boolean m12404o1() {
        return this.f8631h == 1;
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m12405p1() {
        return this.f8631h == 2;
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m12406t1(VerifyData verifyData, RiskVerification riskVerification) {
        if (riskVerification != null) {
            boolean z = riskVerification.required;
        }
        ((qzk0) ((jq2) this).viewModel).m22560Z();
        if (c5d0.m13183b(act(), riskVerification, verifyData, new c5d0.InterfaceC0598a() { // from class: l.xyk0
            @Override // p006l.c5d0.InterfaceC0598a
            /* JADX INFO: renamed from: a */
            public final void mo13185a(VerifyData verifyData2) {
                this.f27800a.m12400Q1(verifyData2);
            }
        })) {
            return;
        }
        ((qzk0) ((jq2) this).viewModel).m22557W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m12407v1(Throwable th) {
        this.f8628e = false;
        if (m12404o1()) {
            zvf0.x("e_code_wrong_tip", act().pageId());
        }
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403001) {
            m12402m1("show_captcha");
        } else if (!((qzk0) ((jq2) this).viewModel).m22558X(th)) {
            C1478yf.m28232b(th);
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 403001) {
            if (AccountModule.f26c.f322n) {
                HashMap map = new HashMap();
                map.put("Method used", "Phone");
                map.put("Status", "Failure");
                map.put("Version", px0.b(App.e));
                w85.INSTANCE.m("Login", map);
            } else {
                HashMap map2 = new HashMap();
                map2.put("Sign up status", "Phone number register fail");
                w85.INSTANCE.m("Sign Up", map2);
            }
        }
        ((qzk0) ((jq2) this).viewModel).m22560Z();
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m12408x1(VerifyData verifyData, roj0 roj0Var) {
        act().hideInput();
        ((qzk0) ((jq2) this).viewModel).m22560Z();
        if (TEnum.equals(verifyData.action, "ttt-signup")) {
            m12511r0();
        } else {
            act().startActivity(SignUpDetailsNewAct.m394b2(((qzk0) ((jq2) this).viewModel).act(), verifyData, false, false));
        }
        HashMap map = new HashMap();
        map.put("Sign up status", "Phone number register success");
        w85.INSTANCE.m("Sign Up", map);
        act().finish();
    }
}
