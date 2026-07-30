package p006l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.R$string;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import java.net.SocketTimeoutException;
import l.e30;
import l.i0g0;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gy50 extends jq2<ky50> {

    /* JADX INFO: renamed from: a */
    public String f13575a;

    /* JADX INFO: renamed from: b */
    public String f13576b;

    /* JADX INFO: renamed from: c */
    public int f13577c;

    /* JADX INFO: renamed from: d */
    public String f13578d;

    /* JADX INFO: renamed from: e */
    public String f13579e;

    /* JADX INFO: renamed from: f */
    public boolean f13580f;

    public gy50(mcr mcrVar) {
        super(mcrVar);
        this.f13580f = false;
    }

    /* JADX INFO: renamed from: i0 */
    private void m16012i0() {
        this.f13575a = act().getIntent().getStringExtra("extra_number");
        this.f13576b = act().getIntent().getStringExtra("extra_code");
        this.f13577c = act().getIntent().getIntExtra("extra_country_code", 0);
        this.f13578d = act().getIntent().getStringExtra("extra_mobile_number");
        this.f13579e = act().getIntent().getStringExtra("extra_action");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m16013m0(Bundle bundle) {
        ((ky50) ((jq2) this).viewModel).m18363r();
    }

    /* JADX INFO: renamed from: Z */
    public void m16014Z() {
        super.Z();
        m16012i0();
        creates(new e30() { // from class: l.dy50
            public final void call(Object obj) {
                this.f10645a.m16013m0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m16015h0() {
        if (this.f13580f) {
            return;
        }
        this.f13580f = true;
        ((ky50) ((jq2) this).viewModel).m18362l();
        final VerifyData verifyDataNew_ = VerifyData.new_();
        verifyDataNew_.language = i0g0.y();
        verifyDataNew_.countryCode = this.f13577c;
        verifyDataNew_.mobileNumber = this.f13578d;
        verifyDataNew_.code = 0;
        verifyDataNew_.verifyType = "up_link_sms";
        verifyDataNew_.action = VerifyReason.get(this.f13579e);
        verifyDataNew_.codeLength = 4;
        duringCreated(AccountModule.f26c.m165A2(verifyDataNew_)).subscribe(mkd0.H(new e30() { // from class: l.ey50
            public final void call(Object obj) {
                this.f11498a.m16017k0(verifyDataNew_, (roj0) obj);
            }
        }, new e30() { // from class: l.fy50
            public final void call(Object obj) {
                this.f12967a.m16018l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m16016j0(Throwable th) {
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
    public final /* synthetic */ void m16017k0(VerifyData verifyData, roj0 roj0Var) {
        this.f13580f = false;
        ((ky50) ((jq2) this).viewModel).m18360f();
        VerifyReason verifyReason = verifyData.action;
        String string = verifyReason != null ? verifyReason.toString() : this.f13579e;
        lsi0.y(App.e.getString(R$string.f282v0));
        Intent intent = new Intent();
        intent.putExtra("extra_result_action", string);
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m16018l0(Throwable th) {
        this.f13580f = false;
        ((ky50) ((jq2) this).viewModel).m18360f();
        th.getMessage();
        if (m16016j0(th)) {
            lsi0.y(App.e.getString(R$string.f287w0));
        } else {
            lsi0.y(App.e.getString(R$string.f277u0));
        }
        act().setResult(0);
        act().finish();
    }

    /* JADX INFO: renamed from: n0 */
    public void m16019n0() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f13575a));
        intent.putExtra("sms_body", this.f13576b);
        try {
            act().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            osi0.g("未找到可发送短信的应用");
        }
    }

    public void destroy() {
    }
}
