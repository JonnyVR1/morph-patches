package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.VerifyReason;

/* JADX INFO: loaded from: classes9.dex */
public class twe extends jq2<vwe> {

    /* JADX INFO: renamed from: a */
    public SignInData f172388a;

    public twe(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m190851f0(Bundle bundle) {
        SignInData signInData = (SignInData) ((vwe) this.viewModel).getAct().getIntent().getSerializableExtra(SignInData.TYPE);
        this.f172388a = signInData;
        ((vwe) this.viewModel).m200363d(signInData);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.swe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166658a.m190851f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m190852g0() {
        zvf0.m220396r("e_new_device_passwordlogin_verify_send_button", "p_new_device_passwordlogin_verify_view");
        ((vwe) this.viewModel).getAct().startActivity(EmailVerifyCodeAct.m28668Y1(((vwe) this.viewModel).getAct(), this.f172388a.username, 2, VerifyReason.get(VerifyReason.signin), ""));
        ((vwe) this.viewModel).getAct().lambda$debugItems$19();
        yij0.m214941S(((vwe) this.viewModel).getAct());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
