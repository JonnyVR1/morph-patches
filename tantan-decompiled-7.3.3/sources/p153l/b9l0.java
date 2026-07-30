package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.SignInData;
import p151v.VButton_FakeShadow;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class b9l0 implements iam<z8l0> {

    /* JADX INFO: renamed from: a */
    public VText f75591a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f75592b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f75593c;

    /* JADX INFO: renamed from: d */
    public z8l0 f75594d;

    public b9l0(PutongAct putongAct) {
        this.f75593c = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m103110e(View view) {
        this.f75594d.m219011g0();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f75593c;
    }

    @Override // p153l.iam
    public Act act() {
        return this.f75593c;
    }

    /* JADX INFO: renamed from: b */
    public View m103111b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c9l0.m108446b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z8l0 z8l0Var) {
        this.f75594d = z8l0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m103113d(SignInData signInData) {
        act().hackCenterTitle = true;
        act().setTitle(R$string.f16932g4);
        act().getSupportActionBar().mo102169B(bbc0.f75830P1);
        bnl0.m105509E0(this.f75592b, new View.OnClickListener() { // from class: l.a9l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69055a.m103110e(view);
            }
        });
        String strM106289y = bsj0.m106289y(signInData.username);
        this.f75591a.setText(hmj0.m135865a(getContext(), R$string.f16914d4, q8g0.m175796b0(strM106289y, jyb.m147507f0(strM106289y), -570425344, lyh0.m156283c(2))));
    }

    /* JADX INFO: renamed from: f */
    public void m103114f() {
        bsj0.m106260R(this.f75593c);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103111b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
