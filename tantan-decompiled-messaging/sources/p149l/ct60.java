package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.VerifyCodeInputAct;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.AccountErrorResponse;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class ct60 extends jq2<ft60> {

    /* JADX INFO: renamed from: a */
    public int f82457a;

    /* JADX INFO: renamed from: b */
    public String f82458b;

    public ct60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m108661i0(Bundle bundle) {
        ((ft60) this.viewModel).m123028r();
        ((ft60) this.viewModel).m123027j(this.f82457a, this.f82458b);
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m108662l0() {
        return ((ft60) this.viewModel).m123026e() == 86;
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        this.f82457a = act().getIntent().getIntExtra("c_code_extra", -1);
        this.f82458b = act().getIntent().getStringExtra("number_extra");
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.zs60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204569a.m108661i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m108663h0(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!m108662l0()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m108664j0(String str, AccountErrorResponse accountErrorResponse) {
        ((ft60) this.viewModel).getAct().startActivity(VerifyCodeInputAct.m28521Z1(((ft60) this.viewModel).getAct(), VerifyReason.get(VerifyReason.signup), ((ft60) this.viewModel).m123026e(), str));
        ((ft60) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m108665k0(String str, Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                act().startActivity(VerifyCodeInputAct.m28521Z1(act(), VerifyReason.get(VerifyReason.forgot_password), ((ft60) this.viewModel).m123026e(), str));
            } else {
                yij0.m214926D(th);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            yij0.m214926D(th);
        }
        ((ft60) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public void m108666m0(final String str) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.signup);
        verifyData.countryCode = ((ft60) this.viewModel).m123026e();
        verifyData.mobileNumber = str;
        ((ft60) this.viewModel).getAct().progress(R$string.f16227j0);
        AccountModule.f16037c.m28278E2(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.at60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71585a.m108664j0(str, (AccountErrorResponse) obj);
            }
        }, new e30() { // from class: l.bt60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77183a.m108665k0(str, (Throwable) obj);
            }
        }, false));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
