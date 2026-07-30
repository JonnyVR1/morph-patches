package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.profile.R$string;
import p151v.VButton_FakeShadow;

/* JADX INFO: renamed from: l.uq */
/* JADX INFO: loaded from: classes9.dex */
public class C20620uq implements iam<C20377tq> {

    /* JADX INFO: renamed from: a */
    public TextView f180335a;

    /* JADX INFO: renamed from: b */
    public TextView f180336b;

    /* JADX INFO: renamed from: c */
    public TextView f180337c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f180338d;

    /* JADX INFO: renamed from: e */
    public C20377tq f180339e;

    /* JADX INFO: renamed from: f */
    public Act f180340f;

    public C20620uq(Act act) {
        this.f180340f = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f180340f;
    }

    /* JADX INFO: renamed from: a */
    public View m197194a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C20900vq.m202351b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f180340f;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C20377tq c20377tq) {
        this.f180339e = c20377tq;
    }

    /* JADX INFO: renamed from: c */
    public void m197196c() {
        this.f180337c.setText(act().getString(R$string.f28629T0));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m197194a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m197197r() {
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().mo102196w(false);
        bnl0.m105509E0(this.f180338d, this.f180339e.m192226i0());
        bnl0.m105524M(this.f180337c, this.f180339e.f175668a);
        this.f180339e.m192227j0();
        if (gta.m132210e().m132214d().mo34951xi()) {
            this.f180335a.setText("已完成注销申请");
            this.f180336b.setText("探探将在15天内处理您的申请并删除您的所有数据。若您在15天内重新登录探探，则会默认取消您的注销申请。");
            this.f180338d.setText("完成并退出探探");
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
