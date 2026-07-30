package p006l;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.OriginalSMSConfirmAct;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import l.e30;
import l.jq2;
import l.mcr;
import l.osi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class yx50 extends jq2<by50> {

    /* JADX INFO: renamed from: a */
    public String f28461a;

    /* JADX INFO: renamed from: b */
    public String f28462b;

    /* JADX INFO: renamed from: c */
    public int f28463c;

    /* JADX INFO: renamed from: d */
    public String f28464d;

    /* JADX INFO: renamed from: e */
    public String f28465e;

    public yx50(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: Z */
    public void m28451Z() {
        super.Z();
        m28452f0();
        creates(new e30() { // from class: l.xx50
            public final void call(Object obj) {
                this.f27771a.m28454h0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public final void m28452f0() {
        this.f28461a = act().getIntent().getStringExtra("extra_number");
        this.f28462b = act().getIntent().getStringExtra("extra_code");
        this.f28463c = act().getIntent().getIntExtra("extra_country_code", 0);
        this.f28464d = act().getIntent().getStringExtra("extra_mobile_number");
        this.f28465e = act().getIntent().getStringExtra("extra_action");
    }

    /* JADX INFO: renamed from: g0 */
    public void m28453g0() {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + this.f28461a));
        intent.putExtra("sms_body", this.f28462b);
        try {
            act().startActivityForResult(OriginalSMSConfirmAct.m575Y1(act(), this.f28461a, this.f28462b, this.f28463c, this.f28464d, this.f28465e), AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYFACE);
            act().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            osi0.g("未找到可发送短信的应用");
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m28454h0(Bundle bundle) {
        ((by50) ((jq2) this).viewModel).m13035r();
    }

    public void destroy() {
    }
}
