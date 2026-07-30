package p153l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class l660 extends ar2<p660> {

    /* JADX INFO: renamed from: a */
    public String f130230a;

    /* JADX INFO: renamed from: b */
    public String f130231b;

    /* JADX INFO: renamed from: c */
    public int f130232c;

    /* JADX INFO: renamed from: d */
    public String f130233d;

    /* JADX INFO: renamed from: e */
    public String f130234e;

    /* JADX INFO: renamed from: f */
    public boolean f130235f;

    public l660(ner nerVar) {
        super(nerVar);
        this.f130235f = false;
    }

    /* JADX INFO: renamed from: i0 */
    private void m153051i0() {
        this.f130230a = act().getIntent().getStringExtra("extra_number");
        this.f130231b = act().getIntent().getStringExtra("extra_code");
        this.f130232c = act().getIntent().getIntExtra("extra_country_code", 0);
        this.f130233d = act().getIntent().getStringExtra("extra_mobile_number");
        this.f130234e = act().getIntent().getStringExtra("extra_action");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m153052m0(Bundle bundle) {
        ((p660) this.viewModel).m170735r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m153051i0();
        creates(new y20() { // from class: l.i660
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113146a.m153052m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m153053h0() {
        if (this.f130235f) {
            return;
        }
        this.f130235f = true;
        ((p660) this.viewModel).m170734l();
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = q8g0.m175820y();
        verifyDataNew_.countryCode = this.f130232c;
        verifyDataNew_.mobileNumber = this.f130233d;
        verifyDataNew_.code = 0;
        verifyDataNew_.verifyType = "up_link_sms";
        verifyDataNew_.action = VerifyReason.get(this.f130234e);
        verifyDataNew_.codeLength = 4;
        duringCreated(AccountModule.f16756c.m29269A2(verifyDataNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.j660
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118528a.m153055k0(verifyDataNew_, (uxj0) obj);
            }
        }, new y20() { // from class: l.k660
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124158a.m153056l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m153054j0(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            if (cause instanceof SocketTimeoutException) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m153055k0(VerifyData verifyData, uxj0 uxj0Var) {
        this.f130235f = false;
        ((p660) this.viewModel).m170733f();
        VerifyReason verifyReason = verifyData.action;
        String string = verifyReason != null ? verifyReason.toString() : this.f130234e;
        o1j0.m165651y(App.f16088e.getString(R$string.f17012v0));
        Intent intent = new Intent();
        intent.putExtra("extra_result_action", string);
        act().setResult(-1, intent);
        act().m45660g2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m153056l0(Throwable th) {
        this.f130235f = false;
        ((p660) this.viewModel).m170733f();
        th.getMessage();
        if (m153054j0(th)) {
            o1j0.m165651y(App.f16088e.getString(R$string.f17017w0));
        } else {
            o1j0.m165651y(App.f16088e.getString(R$string.f17007u0));
        }
        act().setResult(0);
        act().m45660g2();
    }

    /* JADX INFO: renamed from: n0 */
    public void m153057n0() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f130230a));
        intent.putExtra("sms_body", this.f130231b);
        try {
            act().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            r1j0.m179420g("未找到可发送短信的应用");
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
