package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.verification.national.NationalIdAuthAct;
import p147v.VLinear;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class evk0 implements s7m<bvk0> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f93358a;

    /* JADX INFO: renamed from: b */
    public VLinear f93359b;

    /* JADX INFO: renamed from: c */
    public VLinear f93360c;

    /* JADX INFO: renamed from: d */
    public Act f93361d;

    /* JADX INFO: renamed from: e */
    public bvk0 f93362e;

    public evk0(Act act) {
        this.f93361d = act;
    }

    /* JADX INFO: renamed from: e */
    private void m118292e() {
        this.f93358a.setLeftIconAsBack(this.f93361d);
        this.f93358a.setTitle("选择身份认证方式");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m118293f(View view) {
        this.f93361d.startActivity(NationalIdAuthAct.m56073X1(this.f93361d, this.f93362e.f77470b, false));
        zvf0.m220396r("e_authentication_name", this.f93361d.pageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m118294i(View view) {
        qp4.m175805k(this.f93361d, this.f93362e.f77470b);
        zvf0.m220396r("e_authentication_ctid", this.f93361d.pageId());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f93361d;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f93361d;
    }

    /* JADX INFO: renamed from: c */
    public View m118295c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fvk0.m123339b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bvk0 bvk0Var) {
        this.f93362e = bvk0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m118295c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m118297r() {
        m118292e();
        xdl0.m208329E0(this.f93359b, new View.OnClickListener() { // from class: l.cvk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82666a.m118293f(view);
            }
        });
        xdl0.m208329E0(this.f93360c, new View.OnClickListener() { // from class: l.dvk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88068a.m118294i(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
