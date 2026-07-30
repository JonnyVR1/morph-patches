package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.account.p002ui.accountnew.VerifyCodeInputAct;
import com.p1.mobile.putong.data.SignInData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import l.e30;
import l.jq2;
import l.mcr;
import l.yij0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tzk0 extends jq2<vzk0> {

    /* JADX INFO: renamed from: a */
    public SignInData f22369a;

    public tzk0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m24869f0(Bundle bundle) {
        SignInData serializableExtra = ((vzk0) ((jq2) this).viewModel).act().getIntent().getSerializableExtra("signindata");
        this.f22369a = serializableExtra;
        ((vzk0) ((jq2) this).viewModel).m26080d(serializableExtra);
    }

    /* JADX INFO: renamed from: a0 */
    public void m24870a0() {
        creates(new e30() { // from class: l.szk0
            public final void call(Object obj) {
                this.f21781a.m24869f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m24871g0() {
        zvf0.r("e_new_device_passwordlogin_verify_send_button", "p_new_device_passwordlogin_verify_view");
        String[] strArrSplit = this.f22369a.username.split(" ");
        int i = Integer.parseInt(strArrSplit[0]);
        String str = strArrSplit[1];
        if (str == null) {
            CrashHelper.c(new Exception("mobileNumber == null in VerifyDeviceIntroPresenter on line 37"));
        }
        ((vzk0) ((jq2) this).viewModel).act().startActivity(VerifyCodeInputAct.m418a2(((vzk0) ((jq2) this).viewModel).act(), VerifyReason.get("signin"), i, str, this.f22369a.password, true));
        ((vzk0) ((jq2) this).viewModel).act().finish();
        yij0.S(((vzk0) ((jq2) this).viewModel).act());
    }

    public void destroy() {
    }
}
