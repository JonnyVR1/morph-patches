package p153l;

import android.os.Bundle;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.account.p055ui.accountnew.VerifyCodeInputAct;
import com.p051p1.mobile.putong.data.SignInData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes9.dex */
public class z8l0 extends ar2<b9l0> {

    /* JADX INFO: renamed from: a */
    public SignInData f203398a;

    public z8l0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public /* synthetic */ void m219010f0(Bundle bundle) {
        SignInData signInData = (SignInData) ((b9l0) this.viewModel).getAct().getIntent().getSerializableExtra(SignInData.TYPE);
        this.f203398a = signInData;
        ((b9l0) this.viewModel).m103113d(signInData);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.y8l0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198013a.m219010f0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public void m219011g0() {
        i4g0.m138520r("e_new_device_passwordlogin_verify_send_button", "p_new_device_passwordlogin_verify_view");
        String[] strArrSplit = this.f203398a.username.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        int i = Integer.parseInt(strArrSplit[0]);
        String str = strArrSplit[1];
        if (str == null) {
            CrashHelper.m82479c(new Exception("mobileNumber == null in VerifyDeviceIntroPresenter on line 37"));
        }
        ((b9l0) this.viewModel).getAct().startActivity(VerifyCodeInputAct.m29521b2(((b9l0) this.viewModel).getAct(), VerifyReason.get(VerifyReason.signin), i, str, this.f203398a.password, true));
        ((b9l0) this.viewModel).getAct().lambda$debugItems$19();
        bsj0.m106261S(((b9l0) this.viewModel).getAct());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
