package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.ForgetPasswordData;
import com.p046p1.mobile.putong.data.VerifyData;

/* JADX INFO: loaded from: classes8.dex */
public class da60 extends jq2<ga60> {

    /* JADX INFO: renamed from: a */
    public VerifyData f85194a;

    public da60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m110572l0(Bundle bundle) {
        ((ga60) this.viewModel).m124932r();
        ((ga60) this.viewModel).m124931j().subscribe(mkd0.m154955G(new e30() { // from class: l.z960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202275a.m110574k0((CharSequence) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.y960
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196938a.m110572l0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m110573j0(VerifyData verifyData) {
        this.f85194a = verifyData;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m110574k0(CharSequence charSequence) {
        ((ga60) this.viewModel).m124930e(charSequence.toString().length() >= CoreModule.m29931H().mo28159N9());
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m110575m0() {
        ((ga60) this.viewModel).getAct().hideInput();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m110576n0(roj0 roj0Var) {
        CoreModule.m29931H().mo28166il("user.reset_password.signin");
        ((ga60) this.viewModel).getAct().progressDismiss();
        lsi0.m151563A(it6.m138181b(R$string.f27843e3, R$string.f27849f3), false);
        ((ga60) this.viewModel).getAct().startActivity(ura.m195053e().m195057d().mo33926th(act()));
        ((ga60) this.viewModel).getAct().lambda$debugItems$19();
        yij0.m214941S(((ga60) this.viewModel).getAct());
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m110577o0(Throwable th) {
        ((ga60) this.viewModel).getAct().progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: p0 */
    public void m110578p0(String str) {
        ((ga60) this.viewModel).getAct().progress(R$string.f27771R0);
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        VerifyData verifyData = this.f85194a;
        forgetPasswordData.code = verifyData.code;
        forgetPasswordData.countryCode = verifyData.countryCode;
        forgetPasswordData.mobileNumber = verifyData.mobileNumber;
        forgetPasswordData.new_ = str;
        CoreModule.m29931H().mo28152Em(forgetPasswordData, new Runnable() { // from class: l.aa60
            @Override // java.lang.Runnable
            public final void run() {
                this.f68277a.m110575m0();
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.ba60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74652a.m110576n0((roj0) obj);
            }
        }, new e30() { // from class: l.ca60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80007a.m110577o0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
