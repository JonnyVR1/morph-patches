package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p046p1.mobile.putong.data.SignInData;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class nye0 extends jye0<sye0> {

    /* JADX INFO: renamed from: f */
    public String f141102f;

    /* JADX INFO: renamed from: g */
    public d30 f141103g;

    public nye0(mcr mcrVar) {
        super(mcrVar);
        this.f141103g = new d30() { // from class: l.lye0
            @Override // p149l.d30
            public final void call() {
                this.f130561a.m161994x1();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public /* synthetic */ void m161994x1() {
        zvf0.m220399u("e_quick_sign_confirm_button", ((sye0) this.viewModel).act().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f141102f));
        ((sye0) this.viewModel).m186668s(false);
        SignInData signInData = new SignInData();
        signInData.device = pk8.m169980M();
        m143867q1(signInData, new Runnable() { // from class: l.mye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f136292a.m161996C1();
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public void m161995B1() {
        this.f141103g.call();
    }

    /* JADX INFO: renamed from: C1 */
    public void m161996C1() {
        ((sye0) this.viewModel).act().startActivity(PhoneNumberLoginOptAct.m28679Y1(((sye0) this.viewModel).act()));
        zvf0.m220399u("e_quick_sign_switch_button", ((sye0) this.viewModel).act().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f141102f));
    }

    @Override // p149l.b3f0, p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.kye0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125291a.m161998v1((Bundle) obj);
            }
        });
    }

    @Override // p149l.jye0
    /* JADX INFO: renamed from: g1 */
    public void mo143857g1(boolean z) {
        ((sye0) this.viewModel).m186668s(z);
    }

    /* JADX INFO: renamed from: u1 */
    public void m161997u1(String str) {
        this.f141102f = str;
        zvf0.m220368A("e_quick_sign_confirm_button", ((sye0) this.viewModel).act().pageId(), vwb.m200311Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m161998v1(Bundle bundle) {
        ((sye0) this.viewModel).m186665A3(this.f141102f);
        ((sye0) this.viewModel).m186670y(this.f141102f);
    }

    /* JADX INFO: renamed from: z1 */
    public void m161999z1(cwf0 cwf0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, this.f141102f);
            cwf0Var.m109039o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // p149l.b3f0, p149l.q0m
    public void destroy() {
    }
}
