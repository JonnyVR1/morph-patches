package p149l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public class gy50 extends jq2<ky50> {

    /* JADX INFO: renamed from: a */
    public String f104965a;

    /* JADX INFO: renamed from: b */
    public String f104966b;

    /* JADX INFO: renamed from: c */
    public int f104967c;

    /* JADX INFO: renamed from: d */
    public String f104968d;

    /* JADX INFO: renamed from: e */
    public String f104969e;

    /* JADX INFO: renamed from: f */
    public boolean f104970f;

    public gy50(mcr mcrVar) {
        super(mcrVar);
        this.f104970f = false;
    }

    /* JADX INFO: renamed from: i0 */
    private void m128679i0() {
        this.f104965a = act().getIntent().getStringExtra("extra_number");
        this.f104966b = act().getIntent().getStringExtra("extra_code");
        this.f104967c = act().getIntent().getIntExtra("extra_country_code", 0);
        this.f104968d = act().getIntent().getStringExtra("extra_mobile_number");
        this.f104969e = act().getIntent().getStringExtra("extra_action");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m128680m0(Bundle bundle) {
        ((ky50) this.viewModel).m147832r();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m128679i0();
        creates(new e30() { // from class: l.dy50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88348a.m128680m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m128681h0() {
        if (this.f104970f) {
            return;
        }
        this.f104970f = true;
        ((ky50) this.viewModel).m147831l();
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.m133885y();
        verifyDataNew_.countryCode = this.f104967c;
        verifyDataNew_.mobileNumber = this.f104968d;
        verifyDataNew_.code = 0;
        verifyDataNew_.verifyType = "up_link_sms";
        verifyDataNew_.action = VerifyReason.get(this.f104969e);
        verifyDataNew_.codeLength = 4;
        duringCreated(AccountModule.f16037c.m28270A2(verifyDataNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.ey50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93724a.m128683k0(verifyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.fy50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99833a.m128684l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m128682j0(Throwable th) {
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
    public final /* synthetic */ void m128683k0(VerifyData verifyData, roj0 roj0Var) {
        this.f104970f = false;
        ((ky50) this.viewModel).m147830f();
        VerifyReason verifyReason = verifyData.action;
        String string = verifyReason != null ? verifyReason.toString() : this.f104969e;
        lsi0.m151595y(App.f15369e.getString(R$string.f16293v0));
        Intent intent = new Intent();
        intent.putExtra("extra_result_action", string);
        act().setResult(-1, intent);
        act().m44477e2();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m128684l0(Throwable th) {
        this.f104970f = false;
        ((ky50) this.viewModel).m147830f();
        th.getMessage();
        if (m128682j0(th)) {
            lsi0.m151595y(App.f15369e.getString(R$string.f16298w0));
        } else {
            lsi0.m151595y(App.f15369e.getString(R$string.f16288u0));
        }
        act().setResult(0);
        act().m44477e2();
    }

    /* JADX INFO: renamed from: n0 */
    public void m128685n0() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f104965a));
        intent.putExtra("sms_body", this.f104966b);
        try {
            act().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            osi0.m165783g("未找到可发送短信的应用");
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
