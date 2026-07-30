package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.VerifyCodeInputAct;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.AccountErrorResponse;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.CrashHelper;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class i170 extends ar2<l170> {

    /* JADX INFO: renamed from: a */
    public int f112493a;

    /* JADX INFO: renamed from: b */
    public String f112494b;

    public i170(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public /* synthetic */ void m138082i0(Bundle bundle) {
        ((l170) this.viewModel).m152465r();
        ((l170) this.viewModel).m152464j(this.f112493a, this.f112494b);
    }

    /* JADX INFO: renamed from: l0 */
    private boolean m138083l0() {
        return ((l170) this.viewModel).m152463e() == 86;
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        this.f112493a = act().getIntent().getIntExtra("c_code_extra", -1);
        this.f112494b = act().getIntent().getStringExtra("number_extra");
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.f170
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96770a.m138082i0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m138084h0(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (!m138083l0()) {
            return Pattern.compile("^[0-9]*$").matcher(str).matches();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("^1[0-9]{10}$").matcher(str).matches();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m138085j0(String str, AccountErrorResponse accountErrorResponse) {
        ((l170) this.viewModel).getAct().startActivity(VerifyCodeInputAct.m29520a2(((l170) this.viewModel).getAct(), VerifyReason.get(VerifyReason.signup), ((l170) this.viewModel).m152463e(), str));
        ((l170) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m138086k0(String str, Throwable th) {
        try {
            if ((th instanceof TantanException.Client.AccountService) && ((TantanException.Client.AccountService) th).code == 40011) {
                act().startActivity(VerifyCodeInputAct.m29520a2(act(), VerifyReason.get(VerifyReason.forgot_password), ((l170) this.viewModel).m152463e(), str));
            } else {
                bsj0.m106246D(th);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            bsj0.m106246D(th);
        }
        ((l170) this.viewModel).getAct().progressDismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public void m138087m0(final String str) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.signup);
        verifyData.countryCode = ((l170) this.viewModel).m152463e();
        verifyData.mobileNumber = str;
        ((l170) this.viewModel).getAct().progress(R$string.f16946j0);
        AccountModule.f16756c.m29277E2(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.g170
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101724a.m138085j0(str, (AccountErrorResponse) obj);
            }
        }, new y20() { // from class: l.h170
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107412a.m138086k0(str, (Throwable) obj);
            }
        }, false));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
