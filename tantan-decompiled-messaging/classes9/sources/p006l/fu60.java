package p006l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.account.PhoneVerificationAct;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.SignInGrantType;
import com.p1.mobile.putong.data.SignUpData;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import java.util.List;
import l.ag3;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fu60 extends b3f0<qu60> {

    /* JADX INFO: renamed from: n */
    public static int f12910n;

    /* JADX INFO: renamed from: e */
    public VerifyReason f12911e;

    /* JADX INFO: renamed from: f */
    public SignInData f12912f;

    /* JADX INFO: renamed from: g */
    public SignUpData f12913g;

    /* JADX INFO: renamed from: h */
    public boolean f12914h;

    /* JADX INFO: renamed from: i */
    public boolean f12915i;

    /* JADX INFO: renamed from: j */
    public boolean f12916j;

    /* JADX INFO: renamed from: k */
    public boolean f12917k;

    /* JADX INFO: renamed from: l */
    public String f12918l;

    /* JADX INFO: renamed from: m */
    public int f12919m;

    public fu60(mcr mcrVar) {
        super(mcrVar);
        this.f12919m = 0;
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m15474S0(Throwable th) {
    }

    /* JADX INFO: renamed from: f1 */
    private void m15481f1() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.xt60
            public final void call(Object obj) {
                this.f27715a.m15489i1((c) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public /* synthetic */ void m15482j1(Bundle bundle) {
        ((qu60) ((jq2) this).viewModel).m22394A(this.f12911e, this.f12912f, this.f12914h, this.f12915i, this.f12916j, this.f12918l);
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.wt60
            public final void call(Object obj) {
                this.f25396a.m15482j1((Bundle) obj);
            }
        });
        m15481f1();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m15483b1() {
        return this.f12914h;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c1 */
    public String m15484c1(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: d1 */
    public void m15485d1() {
        if (!TEnum.equals(this.f12911e, "signin")) {
            ((qu60) ((jq2) this).viewModel).m22407O();
        }
        duringCreated(e51.N(((PhoneVerificationAct) ((qu60) ((jq2) this).viewModel).f9323a).getLocalClassName(), 60)).subscribe(mkd0.I(new e30() { // from class: l.cu60
            public final void call(Object obj) {
                this.f9846a.m15487g1((Long) obj);
            }
        }, new e30() { // from class: l.du60
            public final void call(Object obj) {
                fu60.m15474S0((Throwable) obj);
            }
        }, new d30() { // from class: l.eu60
            public final void call() {
                this.f11451a.m15488h1();
            }
        }));
    }

    /* JADX INFO: renamed from: e1 */
    public void m15486e1(VerifyReason verifyReason, SignInData signInData, SignUpData signUpData, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.f12911e = verifyReason;
        this.f12912f = signInData;
        this.f12913g = signUpData;
        this.f12914h = z;
        this.f12915i = z2;
        this.f12916j = z3;
        this.f12917k = z4;
        this.f12918l = str;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m15487g1(Long l2) {
        ((qu60) ((jq2) this).viewModel).m22409Q(l2.longValue());
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m15488h1() {
        ((qu60) ((jq2) this).viewModel).m22410R(this.f12911e);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m15489i1(c cVar) {
        if (cVar == c.j) {
            ((qu60) ((jq2) this).viewModel).m22405M();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m15490k1(RiskVerification riskVerification) {
        if (TEnum.equals(this.f12911e, "signup")) {
            f12910n++;
        }
        ((qu60) ((jq2) this).viewModel).m22412T();
        m15485d1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m15491l1(Throwable th) {
        ((qu60) ((jq2) this).viewModel).m22406N();
        ((qu60) ((jq2) this).viewModel).m22411S();
        boolean z = th instanceof TantanException.Client.AccountService;
        if (z && ((TantanException.Client.AccountService) th).code == 403003) {
            vij.INSTANCE.m25823c(act());
            return;
        }
        if (!z || ((TantanException.Client.AccountService) th).code != 400146) {
            yij0.D(th);
        } else if (TextUtils.isEmpty(th.getMessage())) {
            yij0.D(th);
        } else {
            lsi0.j(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m15492m1(VerifyData verifyData, roj0 roj0Var) {
        e51.K(((PhoneVerificationAct) ((qu60) ((jq2) this).viewModel).f9323a).getLocalClassName());
        m15494o1(verifyData);
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m15493n1(Throwable th) {
        this.f12919m++;
        ((PhoneVerificationAct) ((qu60) ((jq2) this).viewModel).f9323a).progressDismiss();
        yij0.D(th);
        if (TEnum.equals(this.f12911e, "bind_mobile") && TextUtils.equals("bind_or_change_phone", this.f12918l)) {
            zvf0.D("e_intl_account_add_phone_result", "p_account_and_security_view", new j760[]{j760.a("add_result", "fail")});
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void m15494o1(VerifyData verifyData) {
        if (TEnum.equals(this.f12911e, "signin")) {
            this.f12912f.code = Integer.valueOf(verifyData.code);
            this.f12912f.grantType = SignInGrantType.get("confirmation_code");
            m12504I0(this.f12912f);
            return;
        }
        String string = this.f12911e.toString();
        string.getClass();
        switch (string) {
            case "forgot-password":
                ((qu60) ((jq2) this).viewModel).m13097f(AccountModule.m27H().toPassWordResetAct(((qu60) ((jq2) this).viewModel).f9323a, verifyData));
                break;
            case "change-phone":
                lsi0.x(R$string.f81K, false);
                break;
            case "bind_mobile":
                AccountModule.m27H().refreshUser(AccountModule.f26c.m265z2());
                lsi0.y(((qu60) ((jq2) this).viewModel).act().string(R$string.f244n4));
                if (TextUtils.equals("bind_or_change_phone", this.f12918l)) {
                    zvf0.D("e_intl_account_add_phone_result", "p_account_and_security_view", new j760[]{j760.a("add_result", "success")});
                    break;
                }
                break;
        }
        ((PhoneVerificationAct) ((qu60) ((jq2) this).viewModel).f9323a).finish();
    }

    /* JADX INFO: renamed from: p1 */
    public boolean m15495p1(Menu menu) {
        if (this.f12914h) {
            return false;
        }
        menu.add(0, q4c0.f19598c0, 0, "跳过").setShowAsAction(2);
        return true;
    }

    /* JADX INFO: renamed from: q1 */
    public void m15496q1(VerifyData verifyData) {
        AccountModule.f26c.m219b2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.au60
            public final void call(Object obj) {
                this.f8527a.m15490k1((RiskVerification) obj);
            }
        }, new e30() { // from class: l.bu60
            public final void call(Object obj) {
                this.f9090a.m15491l1((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: r1 */
    public void m15497r1() {
        if (TEnum.equals(this.f12911e, "signin")) {
            ((qu60) ((jq2) this).viewModel).m22408P();
        }
    }

    /* JADX INFO: renamed from: s1 */
    public List<Object> m15498s1() {
        return vwb.f0(new Object[]{"reason", this.f12911e.toString(), ag3.a});
    }

    /* JADX INFO: renamed from: t1 */
    public void m15499t1(final VerifyData verifyData) {
        AccountModule.f26c.m165A2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.yt60
            public final void call(Object obj) {
                this.f28380a.m15492m1(verifyData, (roj0) obj);
            }
        }, new e30() { // from class: l.zt60
            public final void call(Object obj) {
                this.f28969a.m15493n1((Throwable) obj);
            }
        }, false));
    }
}
