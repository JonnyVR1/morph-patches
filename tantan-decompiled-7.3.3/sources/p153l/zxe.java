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
public class zxe implements iam<xxe> {

    /* JADX INFO: renamed from: a */
    public VText f206454a;

    /* JADX INFO: renamed from: b */
    public VButton_FakeShadow f206455b;

    /* JADX INFO: renamed from: c */
    public final PutongAct f206456c;

    /* JADX INFO: renamed from: d */
    public xxe f206457d;

    public zxe(PutongAct putongAct) {
        this.f206456c = putongAct;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f206456c;
    }

    @Override // p153l.iam
    public Act act() {
        return this.f206456c;
    }

    /* JADX INFO: renamed from: b */
    public View m221986b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aye.m100873b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xxe xxeVar) {
        this.f206457d = xxeVar;
    }

    /* JADX INFO: renamed from: d */
    public void m221988d(SignInData signInData) {
        act().hackCenterTitle = true;
        act().setTitle(R$string.f16944i4);
        act().getSupportActionBar().mo102169B(bbc0.f75830P1);
        bnl0.m105509E0(this.f206455b, new View.OnClickListener() { // from class: l.yxe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201962a.m221989e(view);
            }
        });
        String str = signInData.username;
        this.f206454a.setText(hmj0.m135865a(getContext(), R$string.f16938h4, q8g0.m175796b0(str, jyb.m147507f0(str), -570425344, lyh0.m156283c(2))));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m221989e(View view) {
        this.f206457d.m213523g0();
    }

    /* JADX INFO: renamed from: f */
    public void m221990f() {
        bsj0.m106260R(this.f206456c);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m221986b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
