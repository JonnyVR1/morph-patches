package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.verification.national.NationalIdAuthAct;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class k4l0 implements iam<h4l0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f123896a;

    /* JADX INFO: renamed from: b */
    public VLinear f123897b;

    /* JADX INFO: renamed from: c */
    public VLinear f123898c;

    /* JADX INFO: renamed from: d */
    public Act f123899d;

    /* JADX INFO: renamed from: e */
    public h4l0 f123900e;

    public k4l0(Act act) {
        this.f123899d = act;
    }

    /* JADX INFO: renamed from: e */
    private void m148253e() {
        this.f123896a.setLeftIconAsBack(this.f123899d);
        this.f123896a.setTitle("选择身份认证方式");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m148254f(View view) {
        this.f123899d.startActivity(NationalIdAuthAct.m57256Y1(this.f123899d, this.f123900e.f107816b, false));
        i4g0.m138520r("e_authentication_name", this.f123899d.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m148255i(View view) {
        pq4.m173303k(this.f123899d, this.f123900e.f107816b);
        i4g0.m138520r("e_authentication_ctid", this.f123899d.pageId());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f123899d;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f123899d;
    }

    /* JADX INFO: renamed from: c */
    public View m148256c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l4l0.m152789b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(h4l0 h4l0Var) {
        this.f123900e = h4l0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m148256c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m148258r() {
        m148253e();
        bnl0.m105509E0(this.f123897b, new View.OnClickListener() { // from class: l.i4l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112927a.m148254f(view);
            }
        });
        bnl0.m105509E0(this.f123898c, new View.OnClickListener() { // from class: l.j4l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118308a.m148255i(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
