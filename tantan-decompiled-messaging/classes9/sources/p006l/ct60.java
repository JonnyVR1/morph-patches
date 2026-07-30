package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.VerifyCodeInputAct;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.AccountErrorResponse;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import java.util.regex.Pattern;
import l.e30;
import l.i0g0;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ct60 extends jq2<ft60> {

    /* JADX INFO: renamed from: a */
    public int f9833a;

    /* JADX INFO: renamed from: b */
    public String f9834b;

    public ct60(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m13632i0(Bundle bundle) {
        ((ft60) ((jq2) this).viewModel).m15471r();
        ((ft60) ((jq2) this).viewModel).m15470j(this.f9833a, this.f9834b);
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m13633l0() {
        return ((ft60) ((jq2) this).viewModel).m15468e() == 86;
    }

    /* JADX INFO: renamed from: Z */
    public void m13634Z() {
        super.Z();
        this.f9833a = act().getIntent().getIntExtra("c_code_extra", -1);
        this.f9834b = act().getIntent().getStringExtra("number_extra");
    }

    /* JADX INFO: renamed from: a0 */
    public void m13635a0() {
        super.a0();
        creates(new e30() { // from class: l.zs60
            public final void call(Object obj) {
                this.f28952a.m13632i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m13636h0(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!m13633l0()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m13637j0(String str, AccountErrorResponse accountErrorResponse) {
        ((ft60) ((jq2) this).viewModel).act().startActivity(VerifyCodeInputAct.m417Z1(((ft60) ((jq2) this).viewModel).act(), VerifyReason.get("signup"), ((ft60) ((jq2) this).viewModel).m15468e(), str));
        ((ft60) ((jq2) this).viewModel).act().progressDismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m13638k0(String str, Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                act().startActivity(VerifyCodeInputAct.m417Z1(act(), VerifyReason.get("forgot-password"), ((ft60) ((jq2) this).viewModel).m15468e(), str));
            } else {
                yij0.D(th);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            yij0.D(th);
        }
        ((ft60) ((jq2) this).viewModel).act().progressDismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public void m13639m0(final String str) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get("signup");
        verifyData.countryCode = ((ft60) ((jq2) this).viewModel).m15468e();
        verifyData.mobileNumber = str;
        ((ft60) ((jq2) this).viewModel).act().progress(R$string.f216j0);
        AccountModule.f26c.m173E2(verifyData).subscribe(mkd0.K(new e30() { // from class: l.at60
            public final void call(Object obj) {
                this.f8505a.m13637j0(str, (AccountErrorResponse) obj);
            }
        }, new e30() { // from class: l.bt60
            public final void call(Object obj) {
                this.f9074a.m13638k0(str, (Throwable) obj);
            }
        }, false));
    }

    public void destroy() {
    }
}
