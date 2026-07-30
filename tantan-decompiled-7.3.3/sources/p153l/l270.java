package p153l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.account.PhoneVerificationAct;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.SignInGrantType;
import com.p051p1.mobile.putong.data.SignUpData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class l270 extends ibf0<w270> {

    /* JADX INFO: renamed from: n */
    public static int f129745n;

    /* JADX INFO: renamed from: e */
    public VerifyReason f129746e;

    /* JADX INFO: renamed from: f */
    public SignInData f129747f;

    /* JADX INFO: renamed from: g */
    public SignUpData f129748g;

    /* JADX INFO: renamed from: h */
    public boolean f129749h;

    /* JADX INFO: renamed from: i */
    public boolean f129750i;

    /* JADX INFO: renamed from: j */
    public boolean f129751j;

    /* JADX INFO: renamed from: k */
    public boolean f129752k;

    /* JADX INFO: renamed from: l */
    public String f129753l;

    /* JADX INFO: renamed from: m */
    public int f129754m;

    public l270(ner nerVar) {
        super(nerVar);
        this.f129754m = 0;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m152572S0(Throwable th) {
    }

    /* JADX INFO: renamed from: f1 */
    private void m152579f1() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.d270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84759a.m152587i1((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m152580j1(Bundle bundle) {
        ((w270) this.viewModel).m204552A(this.f129746e, this.f129747f, this.f129749h, this.f129750i, this.f129751j, this.f129753l);
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.c270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79453a.m152580j1((Bundle) obj);
            }
        });
        m152579f1();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m152581b1() {
        return this.f129749h;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c1 */
    public String m152582c1(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.m81064b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: d1 */
    public void m152583d1() {
        if (!TEnum.equals(this.f129746e, VerifyReason.signin)) {
            ((w270) this.viewModel).m204565O();
        }
        duringCreated(l51.m152894N(((PhoneVerificationAct) ((w270) this.viewModel).f119872a).getLocalClassName(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.i270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112587a.m152585g1((Long) obj);
            }
        }, new y20() { // from class: l.j270
            @Override // p153l.y20
            public final void call(Object obj) {
                l270.m152572S0((Throwable) obj);
            }
        }, new x20() { // from class: l.k270
            @Override // p153l.x20
            public final void call() {
                this.f123578a.m152586h1();
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m152584e1(VerifyReason verifyReason, SignInData signInData, SignUpData signUpData, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.f129746e = verifyReason;
        this.f129747f = signInData;
        this.f129748g = signUpData;
        this.f129749h = z;
        this.f129750i = z2;
        this.f129751j = z3;
        this.f129752k = z4;
        this.f129753l = str;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m152585g1(Long l2) {
        ((w270) this.viewModel).m204567Q(l2.longValue());
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m152586h1() {
        ((w270) this.viewModel).m204568R(this.f129746e);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m152587i1(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            ((w270) this.viewModel).m204563M();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m152588k1(RiskVerification riskVerification) {
        if (TEnum.equals(this.f129746e, VerifyReason.signup)) {
            f129745n++;
        }
        ((w270) this.viewModel).m204570T();
        m152583d1();
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m152589l1(Throwable th) {
        ((w270) this.viewModel).m204564N();
        ((w270) this.viewModel).m204569S();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            olj.INSTANCE.m168130c(act());
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 400146) {
            bsj0.m106246D(th);
        } else if (TextUtils.isEmpty(th.getMessage())) {
            bsj0.m106246D(th);
        } else {
            o1j0.m165636j(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m152590m1(VerifyData verifyData, uxj0 uxj0Var) {
        l51.m152891K(((PhoneVerificationAct) ((w270) this.viewModel).f119872a).getLocalClassName());
        m152592o1(verifyData);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m152591n1(Throwable th) {
        this.f129754m++;
        ((PhoneVerificationAct) ((w270) this.viewModel).f119872a).progressDismiss();
        bsj0.m106246D(th);
        if (TEnum.equals(this.f129746e, VerifyReason.bind_mobile) && TextUtils.equals("bind_or_change_phone", this.f129753l)) {
            i4g0.m138495D("e_intl_account_add_phone_result", "p_account_and_security_view", pf60.m172085a("add_result", "fail"));
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m152592o1(VerifyData verifyData) {
        if (TEnum.equals(this.f129746e, VerifyReason.signin)) {
            this.f129747f.code = Integer.valueOf(verifyData.code);
            this.f129747f.grantType = SignInGrantType.get(SignInGrantType.confirmation_code);
            m139324I0(this.f129747f);
            return;
        }
        String string = this.f129746e.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                ((w270) this.viewModel).m144221f(AccountModule.m29131H().toPassWordResetAct(((w270) this.viewModel).f119872a, verifyData));
                break;
            case "change-phone":
                o1j0.m165650x(R$string.f16811K, false);
                break;
            case "bind_mobile":
                AccountModule.m29131H().refreshUser(AccountModule.f16756c.m29369z2());
                o1j0.m165651y(((w270) this.viewModel).act().string(R$string.f16974n4));
                if (TextUtils.equals("bind_or_change_phone", this.f129753l)) {
                    i4g0.m138495D("e_intl_account_add_phone_result", "p_account_and_security_view", pf60.m172085a("add_result", "success"));
                    break;
                }
                break;
        }
        ((PhoneVerificationAct) ((w270) this.viewModel).f119872a).m68056e2();
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m152593p1(Menu menu) {
        if (this.f129749h) {
            return false;
        }
        menu.add(0, wcc0.f188436c0, 0, "跳过").setShowAsAction(2);
        return true;
    }

    /* JADX INFO: renamed from: q1 */
    public void m152594q1(VerifyData verifyData) {
        AccountModule.f16756c.m29323b2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.g270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101811a.m152588k1((RiskVerification) obj);
            }
        }, new y20() { // from class: l.h270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107526a.m152589l1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r1 */
    public void m152595r1() {
        if (TEnum.equals(this.f129746e, VerifyReason.signin)) {
            ((w270) this.viewModel).m204566P();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public List<Object> m152596s1() {
        return jyb.m147507f0(Reason.TYPE, this.f129746e.toString(), og3.f147186a);
    }

    /* JADX INFO: renamed from: t1 */
    public void m152597t1(final VerifyData verifyData) {
        AccountModule.f16756c.m29269A2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.e270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91707a.m152590m1(verifyData, (uxj0) obj);
            }
        }, new y20() { // from class: l.f270
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96859a.m152591n1((Throwable) obj);
            }
        }, false));
    }
}
