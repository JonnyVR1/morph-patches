package p153l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.OriginalSMSConfirmAct;

/* JADX INFO: loaded from: classes9.dex */
public class d660 extends ar2<g660> {

    /* JADX INFO: renamed from: a */
    public String f85302a;

    /* JADX INFO: renamed from: b */
    public String f85303b;

    /* JADX INFO: renamed from: c */
    public int f85304c;

    /* JADX INFO: renamed from: d */
    public String f85305d;

    /* JADX INFO: renamed from: e */
    public String f85306e;

    public d660(ner nerVar) {
        super(nerVar);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        m114419f0();
        creates(new y20() { // from class: l.c660
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79941a.m114421h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m114419f0() {
        this.f85302a = act().getIntent().getStringExtra("extra_number");
        this.f85303b = act().getIntent().getStringExtra("extra_code");
        this.f85304c = act().getIntent().getIntExtra("extra_country_code", 0);
        this.f85305d = act().getIntent().getStringExtra("extra_mobile_number");
        this.f85306e = act().getIntent().getStringExtra("extra_action");
    }

    /* JADX INFO: renamed from: g0 */
    public void m114420g0() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f85302a));
        intent.putExtra("sms_body", this.f85303b);
        try {
            act().startActivityForResult(OriginalSMSConfirmAct.m29675Z1(act(), this.f85302a, this.f85303b, this.f85304c, this.f85305d, this.f85306e), 1001);
            act().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            r1j0.m179420g("未找到可发送短信的应用");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m114421h0(Bundle bundle) {
        ((g660) this.viewModel).m129097r();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
