package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.VerifyReason;

/* JADX INFO: loaded from: classes9.dex */
public class xxe extends ar2<zxe> {

    /* JADX INFO: renamed from: a */
    public SignInData f196631a;

    public xxe(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m213522f0(Bundle bundle) {
        SignInData signInData = (SignInData) ((zxe) this.viewModel).getAct().getIntent().getSerializableExtra(SignInData.TYPE);
        this.f196631a = signInData;
        ((zxe) this.viewModel).m221988d(signInData);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.wxe
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191485a.m213522f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m213523g0() {
        i4g0.m138520r("e_new_device_passwordlogin_verify_send_button", "p_new_device_passwordlogin_verify_view");
        ((zxe) this.viewModel).getAct().startActivity(EmailVerifyCodeAct.m29667Z1(((zxe) this.viewModel).getAct(), this.f196631a.username, 2, VerifyReason.get(VerifyReason.signin), ""));
        ((zxe) this.viewModel).getAct().lambda$debugItems$19();
        bsj0.m106261S(((zxe) this.viewModel).getAct());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
