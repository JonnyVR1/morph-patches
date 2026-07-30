package p153l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.api.C4726a;
import com.p051p1.mobile.putong.data.ForgetPasswordData;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;

/* JADX INFO: loaded from: classes9.dex */
public class xh60 extends ar2<bi60> {

    /* JADX INFO: renamed from: a */
    public VerifyData f194277a;

    /* JADX INFO: renamed from: b */
    public boolean f194278b;

    /* JADX INFO: renamed from: c */
    public Runnable f194279c;

    public xh60(ner nerVar) {
        super(nerVar);
        this.f194279c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m211013m0() {
        ((bi60) this.viewModel).m104421m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m211014o0(Bundle bundle) {
        this.f194278b = true;
        if (Build.VERSION.SDK_INT >= 26 && "samsung".equalsIgnoreCase(Build.BRAND) && "SM-G950F".equals(Build.MODEL)) {
            this.f194279c = new Runnable() { // from class: l.sh60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f168599a.m211013m0();
                }
            };
            ((bi60) this.viewModel).getAct().postDelayed(this.f194279c, 100L);
        }
        ((bi60) this.viewModel).m104420l().subscribe(psd0.m173596G(new y20() { // from class: l.th60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174281a.m211016n0((CharSequence) obj);
            }
        }));
        ((bi60) this.viewModel).m104422r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.qh60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157507a.m211014o0((Bundle) obj);
            }
        }, new x20() { // from class: l.rh60
            @Override // p153l.x20
            public final void call() {
                this.f163077a.m211017p0();
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public void m211015l0(VerifyData verifyData) {
        this.f194277a = verifyData;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m211016n0(CharSequence charSequence) {
        if (this.f194278b && charSequence.length() > 0) {
            this.f194278b = false;
        }
        ((bi60) this.viewModel).m104418f(charSequence.toString().length() >= 6);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m211017p0() {
        ((bi60) this.viewModel).getAct().removeCallbacks(this.f194279c);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m211018q0() {
        ((bi60) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m211019r0(String str, uxj0 uxj0Var) {
        i4g0.m138495D("e_signin_success", "", jyb.m147494Y("signin_type", "reset_password"), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f194277a.mobileNumber));
        uqb0.m197269e1(VerifyReason.signin, new Object[0]);
        if (!TextUtils.isEmpty(this.f194277a.mobileNumber) && !TextUtils.isEmpty(str)) {
            qsf0.m177799d().m177801e().onNext(new Pair<>(TextUtils.concat(String.valueOf(this.f194277a.countryCode), MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, this.f194277a.mobileNumber).toString(), str));
        }
        AccountModule.f16756c.m29316X1("user.reset_password.signin");
        ((bi60) this.viewModel).getAct().progressDismiss();
        o1j0.m165619A(lu6.m155846b(R$string.f16884Y2, R$string.f16889Z2), false);
        Intent intentM111719e = C16330cp.m111719e(((bi60) this.viewModel).getAct());
        act().startActivity(intentM111719e);
        ((bi60) this.viewModel).getAct().startActivity(intentM111719e);
        ((bi60) this.viewModel).getAct().m68056e2();
        bsj0.m106261S(((bi60) this.viewModel).getAct());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m211020s0(Throwable th) {
        ((bi60) this.viewModel).getAct().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: t0 */
    public void m211021t0(final String str) {
        ((bi60) this.viewModel).getAct().progress(R$string.f16946j0);
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        VerifyData verifyData = this.f194277a;
        forgetPasswordData.code = verifyData.code;
        forgetPasswordData.countryCode = verifyData.countryCode;
        forgetPasswordData.mobileNumber = verifyData.mobileNumber;
        forgetPasswordData.new_ = str;
        C4726a.m29213U0(forgetPasswordData, new Runnable() { // from class: l.uh60
            @Override // java.lang.Runnable
            public final void run() {
                this.f178996a.m211018q0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.vh60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184078a.m211019r0(str, (uxj0) obj);
            }
        }, new y20() { // from class: l.wh60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189087a.m211020s0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
