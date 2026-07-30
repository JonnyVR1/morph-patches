package p006l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.api.C0001a;
import com.p1.mobile.putong.data.ForgetPasswordData;
import com.p1.mobile.putong.data.VerifyData;
import l.d30;
import l.e30;
import l.it6;
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
public class s960 extends jq2<w960> {

    /* JADX INFO: renamed from: a */
    public VerifyData f21146a;

    /* JADX INFO: renamed from: b */
    public boolean f21147b;

    /* JADX INFO: renamed from: c */
    public Runnable f21148c;

    public s960(mcr mcrVar) {
        super(mcrVar);
        this.f21148c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m23532m0() {
        ((w960) ((jq2) this).viewModel).m26259m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m23533o0(Bundle bundle) {
        this.f21147b = true;
        if (Build.VERSION.SDK_INT >= 26 && "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G950F".equals(Build.MODEL)) {
            this.f21148c = new Runnable() { // from class: l.n960
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17540a.m23532m0();
                }
            };
            ((w960) ((jq2) this).viewModel).act().postDelayed(this.f21148c, 100L);
        }
        ((w960) ((jq2) this).viewModel).m26258l().subscribe(mkd0.G(new e30() { // from class: l.o960
            public final void call(Object obj) {
                this.f18078a.m23536n0((CharSequence) obj);
            }
        }));
        ((w960) ((jq2) this).viewModel).m26260r();
    }

    /* JADX INFO: renamed from: a0 */
    public void m23534a0() {
        creates(new e30() { // from class: l.l960
            public final void call(Object obj) {
                this.f16275a.m23533o0((Bundle) obj);
            }
        }, new d30() { // from class: l.m960
            public final void call() {
                this.f16867a.m23537p0();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m23535l0(VerifyData verifyData) {
        this.f21146a = verifyData;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m23536n0(CharSequence charSequence) {
        if (this.f21147b && charSequence.length() > 0) {
            this.f21147b = false;
        }
        ((w960) ((jq2) this).viewModel).m26255f(charSequence.toString().length() >= 6);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m23537p0() {
        ((w960) ((jq2) this).viewModel).act().removeCallbacks(this.f21148c);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m23538q0() {
        ((w960) ((jq2) this).viewModel).act().hideInput();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m23539r0(String str, roj0 roj0Var) {
        zvf0.D("e_signin_success", "", new j760[]{vwb.Y("signin_type", "reset_password"), vwb.Y("phone_num", this.f21146a.mobileNumber)});
        qib0.m22159e1("signin", new Object[0]);
        if (!TextUtils.isEmpty(this.f21146a.mobileNumber) && !TextUtils.isEmpty(str)) {
            hkf0.m16233d().m16235e().onNext(new Pair(TextUtils.concat(String.valueOf(this.f21146a.countryCode), " ", this.f21146a.mobileNumber).toString(), str));
        }
        AccountModule.f26c.m212X1("user.reset_password.signin");
        ((w960) ((jq2) this).viewModel).act().progressDismiss();
        lsi0.A(it6.b(R$string.f154Y2, R$string.f159Z2), false);
        Intent intentM16305e = C0811hp.m16305e(((w960) ((jq2) this).viewModel).act());
        act().startActivity(intentM16305e);
        ((w960) ((jq2) this).viewModel).act().startActivity(intentM16305e);
        ((w960) ((jq2) this).viewModel).act().finish();
        yij0.S(((w960) ((jq2) this).viewModel).act());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m23540s0(Throwable th) {
        ((w960) ((jq2) this).viewModel).act().progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: t0 */
    public void m23541t0(final String str) {
        ((w960) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        VerifyData verifyData = this.f21146a;
        forgetPasswordData.code = verifyData.code;
        forgetPasswordData.countryCode = verifyData.countryCode;
        forgetPasswordData.mobileNumber = verifyData.mobileNumber;
        forgetPasswordData.new_ = str;
        C0001a.m109U0(forgetPasswordData, new Runnable() { // from class: l.p960
            @Override // java.lang.Runnable
            public final void run() {
                this.f18634a.m23538q0();
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.q960
            public final void call(Object obj) {
                this.f19674a.m23539r0(str, (roj0) obj);
            }
        }, new e30() { // from class: l.r960
            public final void call(Object obj) {
                this.f20413a.m23540s0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
