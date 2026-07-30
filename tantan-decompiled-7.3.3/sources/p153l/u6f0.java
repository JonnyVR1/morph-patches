package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.PhoneNumberLoginOptAct;
import com.p051p1.mobile.putong.data.SignInData;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class u6f0 extends q6f0<z6f0> {

    /* JADX INFO: renamed from: f */
    public String f177768f;

    /* JADX INFO: renamed from: g */
    public x20 f177769g;

    public u6f0(ner nerVar) {
        super(nerVar);
        this.f177769g = new x20() { // from class: l.s6f0
            @Override // p153l.x20
            public final void call() {
                this.f166564a.m194687x1();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public /* synthetic */ void m194687x1() {
        i4g0.m138523u("e_quick_sign_confirm_button", ((z6f0) this.viewModel).act().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f177768f));
        ((z6f0) this.viewModel).m218797s(false);
        SignInData signInData = new SignInData();
        signInData.device = tl8.m191616M();
        m175590q1(signInData, new Runnable() { // from class: l.t6f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172337a.m194689C1();
            }
        });
    }

    /* JADX INFO: renamed from: B1 */
    public void m194688B1() {
        this.f177769g.call();
    }

    /* JADX INFO: renamed from: C1 */
    public void m194689C1() {
        ((z6f0) this.viewModel).act().startActivity(PhoneNumberLoginOptAct.m29678Z1(((z6f0) this.viewModel).act()));
        i4g0.m138523u("e_quick_sign_switch_button", ((z6f0) this.viewModel).act().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, this.f177768f));
    }

    @Override // p153l.ibf0, p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.r6f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161467a.m194691v1((Bundle) obj);
            }
        });
    }

    @Override // p153l.q6f0
    /* JADX INFO: renamed from: g1 */
    public void mo175580g1(boolean z) {
        ((z6f0) this.viewModel).m218797s(z);
    }

    /* JADX INFO: renamed from: u1 */
    public void m194690u1(String str) {
        this.f177768f = str;
        i4g0.m138492A("e_quick_sign_confirm_button", ((z6f0) this.viewModel).act().pageId(), jyb.m147494Y(Oauth2AccessToken.KEY_PHONE_NUM, str));
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m194691v1(Bundle bundle) {
        ((z6f0) this.viewModel).m218794A3(this.f177768f);
        ((z6f0) this.viewModel).m218799y(this.f177768f);
    }

    /* JADX INFO: renamed from: z1 */
    public void m194692z1(l4g0 l4g0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Oauth2AccessToken.KEY_PHONE_NUM, this.f177768f);
            l4g0Var.m152780o(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // p153l.ibf0, p153l.k3m
    public void destroy() {
    }
}
