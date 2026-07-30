package p149l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.account.PhoneVerificationAct;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.SignInGrantType;
import com.p046p1.mobile.putong.data.SignUpData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class fu60 extends b3f0<qu60> {

    /* JADX INFO: renamed from: n */
    public static int f99308n;

    /* JADX INFO: renamed from: e */
    public VerifyReason f99309e;

    /* JADX INFO: renamed from: f */
    public SignInData f99310f;

    /* JADX INFO: renamed from: g */
    public SignUpData f99311g;

    /* JADX INFO: renamed from: h */
    public boolean f99312h;

    /* JADX INFO: renamed from: i */
    public boolean f99313i;

    /* JADX INFO: renamed from: j */
    public boolean f99314j;

    /* JADX INFO: renamed from: k */
    public boolean f99315k;

    /* JADX INFO: renamed from: l */
    public String f99316l;

    /* JADX INFO: renamed from: m */
    public int f99317m;

    public fu60(mcr mcrVar) {
        super(mcrVar);
        this.f99317m = 0;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m123138S0(Throwable th) {
    }

    /* JADX INFO: renamed from: f1 */
    private void m123145f1() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xt60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194354a.m123153i1((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m123146j1(Bundle bundle) {
        ((qu60) this.viewModel).m176553A(this.f99309e, this.f99310f, this.f99312h, this.f99313i, this.f99314j, this.f99316l);
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.wt60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187999a.m123146j1((Bundle) obj);
            }
        });
        m123145f1();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m123147b1() {
        return this.f99312h;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c1 */
    public String m123148c1(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.m79881b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: d1 */
    public void m123149d1() {
        if (!TEnum.equals(this.f99309e, VerifyReason.signin)) {
            ((qu60) this.viewModel).m176566O();
        }
        duringCreated(e51.m114749N(((PhoneVerificationAct) ((qu60) this.viewModel).f78941a).getLocalClassName(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.cu60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82529a.m123151g1((Long) obj);
            }
        }, new e30() { // from class: l.du60
            @Override // p149l.e30
            public final void call(Object obj) {
                fu60.m123138S0((Throwable) obj);
            }
        }, new d30() { // from class: l.eu60
            @Override // p149l.d30
            public final void call() {
                this.f93218a.m123152h1();
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m123150e1(VerifyReason verifyReason, SignInData signInData, SignUpData signUpData, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.f99309e = verifyReason;
        this.f99310f = signInData;
        this.f99311g = signUpData;
        this.f99312h = z;
        this.f99313i = z2;
        this.f99314j = z3;
        this.f99315k = z4;
        this.f99316l = str;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m123151g1(Long l2) {
        ((qu60) this.viewModel).m176568Q(l2.longValue());
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m123152h1() {
        ((qu60) this.viewModel).m176569R(this.f99309e);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m123153i1(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            ((qu60) this.viewModel).m176564M();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m123154k1(RiskVerification riskVerification) {
        if (TEnum.equals(this.f99309e, VerifyReason.signup)) {
            f99308n++;
        }
        ((qu60) this.viewModel).m176571T();
        m123149d1();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m123155l1(Throwable th) {
        ((qu60) this.viewModel).m176565N();
        ((qu60) this.viewModel).m176570S();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m198583c(act());
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 400146) {
            yij0.m214926D(th);
        } else if (TextUtils.isEmpty(th.getMessage())) {
            yij0.m214926D(th);
        } else {
            lsi0.m151580j(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m123156m1(VerifyData verifyData, roj0 roj0Var) {
        e51.m114746K(((PhoneVerificationAct) ((qu60) this.viewModel).f78941a).getLocalClassName());
        m123158o1(verifyData);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m123157n1(Throwable th) {
        this.f99317m++;
        ((PhoneVerificationAct) ((qu60) this.viewModel).f78941a).progressDismiss();
        yij0.m214926D(th);
        if (TEnum.equals(this.f99309e, VerifyReason.bind_mobile) && TextUtils.equals("bind_or_change_phone", this.f99316l)) {
            zvf0.m220371D("e_intl_account_add_phone_result", "p_account_and_security_view", j760.m140076a("add_result", "fail"));
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m123158o1(VerifyData verifyData) {
        if (TEnum.equals(this.f99309e, VerifyReason.signin)) {
            this.f99310f.code = Integer.valueOf(verifyData.code);
            this.f99310f.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            m100081I0(this.f99310f);
            return;
        }
        String string = this.f99309e.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                ((qu60) this.viewModel).m105019f(AccountModule.m28132H().toPassWordResetAct(((qu60) this.viewModel).f78941a, verifyData));
                break;
            case "change-phone":
                lsi0.m151594x(R$string.f16092K, false);
                break;
            case "bind_mobile":
                AccountModule.m28132H().refreshUser(AccountModule.f16037c.m28370z2());
                lsi0.m151595y(((qu60) this.viewModel).act().string(R$string.f16255n4));
                if (TextUtils.equals("bind_or_change_phone", this.f99316l)) {
                    zvf0.m220371D("e_intl_account_add_phone_result", "p_account_and_security_view", j760.m140076a("add_result", "success"));
                    break;
                }
                break;
        }
        ((PhoneVerificationAct) ((qu60) this.viewModel).f78941a).m66873d2();
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m123159p1(Menu menu) {
        if (this.f99312h) {
            return false;
        }
        menu.add(0, q4c0.f152588c0, 0, "跳过").setShowAsAction(2);
        return true;
    }

    /* JADX INFO: renamed from: q1 */
    public void m123160q1(VerifyData verifyData) {
        AccountModule.f16037c.m28324b2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.au60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71730a.m123154k1((RiskVerification) obj);
            }
        }, new e30() { // from class: l.bu60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77285a.m123155l1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r1 */
    public void m123161r1() {
        if (TEnum.equals(this.f99309e, VerifyReason.signin)) {
            ((qu60) this.viewModel).m176567P();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public List<Object> m123162s1() {
        return vwb.m200324f0(Reason.TYPE, this.f99309e.toString(), ag3.f69252a);
    }

    /* JADX INFO: renamed from: t1 */
    public void m123163t1(final VerifyData verifyData) {
        AccountModule.f16037c.m28270A2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.yt60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199890a.m123156m1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.zt60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204700a.m123157n1((Throwable) obj);
            }
        }, false));
    }
}
