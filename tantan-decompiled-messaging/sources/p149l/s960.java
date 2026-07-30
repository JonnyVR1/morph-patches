package p149l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.api.C4575a;
import com.p046p1.mobile.putong.data.ForgetPasswordData;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* JADX INFO: loaded from: classes9.dex */
public class s960 extends jq2<w960> {

    /* JADX INFO: renamed from: a */
    public VerifyData f163150a;

    /* JADX INFO: renamed from: b */
    public boolean f163151b;

    /* JADX INFO: renamed from: c */
    public Runnable f163152c;

    public s960(mcr mcrVar) {
        super(mcrVar);
        this.f163152c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m182711m0() {
        ((w960) this.viewModel).m202246m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m182712o0(Bundle bundle) {
        this.f163151b = true;
        if (Build.VERSION.SDK_INT >= 26 && "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G950F".equals(Build.MODEL)) {
            this.f163152c = new Runnable() { // from class: l.n960
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137726a.m182711m0();
                }
            };
            ((w960) this.viewModel).getAct().postDelayed(this.f163152c, 100L);
        }
        ((w960) this.viewModel).m202245l().subscribe(mkd0.m154955G(new e30() { // from class: l.o960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142694a.m182714n0((CharSequence) obj);
            }
        }));
        ((w960) this.viewModel).m202247r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.l960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126921a.m182712o0((Bundle) obj);
            }
        }, new d30() { // from class: l.m960
            @Override // p149l.d30
            public final void call() {
                this.f132679a.m182715p0();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m182713l0(VerifyData verifyData) {
        this.f163150a = verifyData;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m182714n0(CharSequence charSequence) {
        if (this.f163151b && charSequence.length() > 0) {
            this.f163151b = false;
        }
        ((w960) this.viewModel).m202243f(charSequence.toString().length() >= 6);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m182715p0() {
        ((w960) this.viewModel).getAct().removeCallbacks(this.f163152c);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m182716q0() {
        ((w960) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m182717r0(String str, roj0 roj0Var) {
        zvf0.m220371D("e_signin_success", "", vwb.m200311Y("signin_type", "reset_password"), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f163150a.mobileNumber));
        qib0.m174815e1(VerifyReason.signin, new Object[0]);
        if (!TextUtils.isEmpty(this.f163150a.mobileNumber) && !TextUtils.isEmpty(str)) {
            hkf0.m131486d().m131488e().onNext(new Pair<>(TextUtils.concat(String.valueOf(this.f163150a.countryCode), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, this.f163150a.mobileNumber).toString(), str));
        }
        AccountModule.f16037c.m28317X1("user.reset_password.signin");
        ((w960) this.viewModel).getAct().progressDismiss();
        lsi0.m151563A(it6.m138181b(R$string.f16165Y2, R$string.f16170Z2), false);
        Intent intentM132321e = C17367hp.m132321e(((w960) this.viewModel).getAct());
        act().startActivity(intentM132321e);
        ((w960) this.viewModel).getAct().startActivity(intentM132321e);
        ((w960) this.viewModel).getAct().m66873d2();
        yij0.m214941S(((w960) this.viewModel).getAct());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m182718s0(Throwable th) {
        ((w960) this.viewModel).getAct().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: t0 */
    public void m182719t0(final String str) {
        ((w960) this.viewModel).getAct().progress(R$string.f16227j0);
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        VerifyData verifyData = this.f163150a;
        forgetPasswordData.code = verifyData.code;
        forgetPasswordData.countryCode = verifyData.countryCode;
        forgetPasswordData.mobileNumber = verifyData.mobileNumber;
        forgetPasswordData.new_ = str;
        C4575a.m28214U0(forgetPasswordData, new Runnable() { // from class: l.p960
            @Override // java.lang.Runnable
            public final void run() {
                this.f147675a.m182716q0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.q960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153372a.m182717r0(str, (roj0) obj);
            }
        }, new e30() { // from class: l.r960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158280a.m182718s0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
