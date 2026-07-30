package p149l;

import android.os.Bundle;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.account.p050ui.accountnew.VerifyCodeInputAct;
import com.p046p1.mobile.putong.data.SignInData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class tzk0 extends jq2<vzk0> {

    /* JADX INFO: renamed from: a */
    public SignInData f172739a;

    public tzk0(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m191207f0(Bundle bundle) {
        SignInData signInData = (SignInData) ((vzk0) this.viewModel).getAct().getIntent().getSerializableExtra(SignInData.TYPE);
        this.f172739a = signInData;
        ((vzk0) this.viewModel).m200770d(signInData);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.szk0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167066a.m191207f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m191208g0() {
        zvf0.m220396r("e_new_device_passwordlogin_verify_send_button", "p_new_device_passwordlogin_verify_view");
        String[] strArrSplit = this.f172739a.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        int i = Integer.parseInt(strArrSplit[0]);
        String str = strArrSplit[1];
        if (str == null) {
            CrashHelper.m81296c(new Exception("mobileNumber == null in VerifyDeviceIntroPresenter on line 37"));
        }
        ((vzk0) this.viewModel).getAct().startActivity(VerifyCodeInputAct.m28522a2(((vzk0) this.viewModel).getAct(), VerifyReason.get(VerifyReason.signin), i, str, this.f172739a.password, true));
        ((vzk0) this.viewModel).getAct().lambda$debugItems$19();
        yij0.m214941S(((vzk0) this.viewModel).getAct());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
