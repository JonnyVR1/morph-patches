package p149l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.OriginalSMSConfirmAct;

/* JADX INFO: loaded from: classes9.dex */
public class yx50 extends jq2<by50> {

    /* JADX INFO: renamed from: a */
    public String f200567a;

    /* JADX INFO: renamed from: b */
    public String f200568b;

    /* JADX INFO: renamed from: c */
    public int f200569c;

    /* JADX INFO: renamed from: d */
    public String f200570d;

    /* JADX INFO: renamed from: e */
    public String f200571e;

    public yx50(mcr mcrVar) {
        super(mcrVar);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m216430f0();
        creates(new e30() { // from class: l.xx50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194813a.m216432h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m216430f0() {
        this.f200567a = act().getIntent().getStringExtra("extra_number");
        this.f200568b = act().getIntent().getStringExtra("extra_code");
        this.f200569c = act().getIntent().getIntExtra("extra_country_code", 0);
        this.f200570d = act().getIntent().getStringExtra("extra_mobile_number");
        this.f200571e = act().getIntent().getStringExtra("extra_action");
    }

    /* JADX INFO: renamed from: g0 */
    public void m216431g0() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f200567a));
        intent.putExtra("sms_body", this.f200568b);
        try {
            act().startActivityForResult(OriginalSMSConfirmAct.m28676Y1(act(), this.f200567a, this.f200568b, this.f200569c, this.f200570d, this.f200571e), 1001);
            act().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            osi0.m165783g("未找到可发送短信的应用");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m216432h0(Bundle bundle) {
        ((by50) this.viewModel).m104433r();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
