package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.EmailVerifyCodeAct;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.VerifyReason;
import l.e30;
import l.jq2;
import l.mcr;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class twe extends jq2<vwe> {

    /* JADX INFO: renamed from: a */
    public SignInData f22310a;

    public twe(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m24840f0(Bundle bundle) {
        SignInData serializableExtra = ((vwe) ((jq2) this).viewModel).act().getIntent().getSerializableExtra("signindata");
        this.f22310a = serializableExtra;
        ((vwe) ((jq2) this).viewModel).m25953d(serializableExtra);
    }

    /* JADX INFO: renamed from: a0 */
    public void m24841a0() {
        creates(new e30() { // from class: l.swe
            public final void call(Object obj) {
                this.f21703a.m24840f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m24842g0() {
        zvf0.r("e_new_device_passwordlogin_verify_send_button", "p_new_device_passwordlogin_verify_view");
        ((vwe) ((jq2) this).viewModel).act().startActivity(EmailVerifyCodeAct.m567Y1(((vwe) ((jq2) this).viewModel).act(), this.f22310a.username, 2, VerifyReason.get("signin"), ""));
        ((vwe) ((jq2) this).viewModel).act().finish();
        yij0.S(((vwe) ((jq2) this).viewModel).act());
    }

    public void destroy() {
    }
}
