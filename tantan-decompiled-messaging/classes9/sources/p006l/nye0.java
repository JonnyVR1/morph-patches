package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p1.mobile.putong.data.SignInData;
import l.cwf0;
import l.d30;
import l.e30;
import l.j760;
import l.jq2;
import l.mcr;
import l.vwb;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nye0 extends jye0<sye0> {

    /* JADX INFO: renamed from: f */
    public String f17927f;

    /* JADX INFO: renamed from: g */
    public d30 f17928g;

    public nye0(mcr mcrVar) {
        super(mcrVar);
        this.f17928g = new d30() { // from class: l.lye0
            public final void call() {
                this.f16713a.m20259x1();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public /* synthetic */ void m20259x1() {
        zvf0.u("e_quick_sign_confirm_button", ((sye0) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("phone_num", this.f17927f)});
        ((sye0) ((jq2) this).viewModel).m24400s(false);
        SignInData signInData = new SignInData();
        signInData.device = pk8.m21562M();
        m17872q1(signInData, new Runnable() { // from class: l.mye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17385a.m20261C1();
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public void m20260B1() {
        this.f17928g.call();
    }

    /* JADX INFO: renamed from: C1 */
    public void m20261C1() {
        ((sye0) ((jq2) this).viewModel).act().startActivity(PhoneNumberLoginOptAct.m578Y1(((sye0) ((jq2) this).viewModel).act()));
        zvf0.u("e_quick_sign_switch_button", ((sye0) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("phone_num", this.f17927f)});
    }

    @Override // p006l.b3f0
    /* JADX INFO: renamed from: a0 */
    public void mo12401a0() {
        super.mo12401a0();
        creates(new e30() { // from class: l.kye0
            public final void call(Object obj) {
                this.f16091a.m20263v1((Bundle) obj);
            }
        });
    }

    @Override // p006l.jye0
    /* JADX INFO: renamed from: g1 */
    public void mo17862g1(boolean z) {
        ((sye0) ((jq2) this).viewModel).m24400s(z);
    }

    /* JADX INFO: renamed from: u1 */
    public void m20262u1(String str) {
        this.f17927f = str;
        zvf0.A("e_quick_sign_confirm_button", ((sye0) ((jq2) this).viewModel).act().pageId(), new j760[]{vwb.Y("phone_num", str)});
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m20263v1(Bundle bundle) {
        ((sye0) ((jq2) this).viewModel).m24397A3(this.f17927f);
        ((sye0) ((jq2) this).viewModel).m24402y(this.f17927f);
    }

    /* JADX INFO: renamed from: z1 */
    public void m20264z1(cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("phone_num", this.f17927f);
            cwf0Var.o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // p006l.b3f0
    public void destroy() {
    }
}
