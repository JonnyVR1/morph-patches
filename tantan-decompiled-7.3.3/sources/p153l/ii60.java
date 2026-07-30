package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.ForgetPasswordData;
import com.p051p1.mobile.putong.data.VerifyData;

/* JADX INFO: loaded from: classes9.dex */
public class ii60 extends ar2<li60> {

    /* JADX INFO: renamed from: a */
    public VerifyData f115054a;

    public ii60(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m140055l0(Bundle bundle) {
        ((li60) this.viewModel).m154305r();
        ((li60) this.viewModel).m154304j().subscribe(psd0.m173596G(new y20() { // from class: l.ei60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94111a.m140057k0((CharSequence) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.di60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88590a.m140055l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m140056j0(VerifyData verifyData) {
        this.f115054a = verifyData;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m140057k0(CharSequence charSequence) {
        ((li60) this.viewModel).m154303e(charSequence.toString().length() >= CoreModule.m30929H().mo29158N9());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m140058m0() {
        ((li60) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m140059n0(uxj0 uxj0Var) {
        CoreModule.m30929H().mo29165il("user.reset_password.signin");
        ((li60) this.viewModel).getAct().progressDismiss();
        o1j0.m165619A(lu6.m155846b(R$string.f28691e3, R$string.f28697f3), false);
        ((li60) this.viewModel).getAct().startActivity(gta.m132210e().m132214d().mo34929th(act()));
        ((li60) this.viewModel).getAct().lambda$debugItems$19();
        bsj0.m106261S(((li60) this.viewModel).getAct());
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m140060o0(Throwable th) {
        ((li60) this.viewModel).getAct().progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: p0 */
    public void m140061p0(String str) {
        ((li60) this.viewModel).getAct().progress(R$string.f28619R0);
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        VerifyData verifyData = this.f115054a;
        forgetPasswordData.code = verifyData.code;
        forgetPasswordData.countryCode = verifyData.countryCode;
        forgetPasswordData.mobileNumber = verifyData.mobileNumber;
        forgetPasswordData.new_ = str;
        CoreModule.m30929H().mo29151Em(forgetPasswordData, new Runnable() { // from class: l.fi60
            @Override // java.lang.Runnable
            public final void run() {
                this.f99155a.m140058m0();
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.gi60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104205a.m140059n0((uxj0) obj);
            }
        }, new y20() { // from class: l.hi60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109989a.m140060o0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
