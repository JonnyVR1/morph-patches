package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p004ui.verification.national.NationalIdAuthAct;
import com.p1.mobile.android.app.Act;
import l.fvk0;
import l.s7m;
import l.xdl0;
import l.zvf0;
import v.VLinear;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class evk0 implements s7m<bvk0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f11464a;

    /* JADX INFO: renamed from: b */
    public VLinear f11465b;

    /* JADX INFO: renamed from: c */
    public VLinear f11466c;

    /* JADX INFO: renamed from: d */
    public Act f11467d;

    /* JADX INFO: renamed from: e */
    public bvk0 f11468e;

    public evk0(Act act) {
        this.f11467d = act;
    }

    /* JADX INFO: renamed from: e */
    private void m14896e() {
        this.f11464a.setLeftIconAsBack(this.f11467d);
        this.f11464a.setTitle("选择身份认证方式");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m14897f(View view) {
        this.f11467d.startActivity(NationalIdAuthAct.m9498X1(this.f11467d, this.f11468e.f9110b, false));
        zvf0.r("e_authentication_name", this.f11467d.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m14898i(View view) {
        qp4.m22308k(this.f11467d, this.f11468e.f9110b);
        zvf0.r("e_authentication_ctid", this.f11467d.pageId());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14899C0() {
        return this.f11467d;
    }

    @Nullable
    public Act act() {
        return this.f11467d;
    }

    /* JADX INFO: renamed from: c */
    public View m14900c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fvk0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m14902i1(bvk0 bvk0Var) {
        this.f11468e = bvk0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14900c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m14903r() {
        m14896e();
        xdl0.E0(this.f11465b, new View.OnClickListener() { // from class: l.cvk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9877a.m14897f(view);
            }
        });
        xdl0.E0(this.f11466c, new View.OnClickListener() { // from class: l.dvk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10615a.m14898i(view);
            }
        });
    }

    public void destroy() {
    }
}
