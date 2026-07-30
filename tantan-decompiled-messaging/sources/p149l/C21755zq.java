package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.profile.R$string;
import p147v.VButton_FakeShadow;

/* JADX INFO: renamed from: l.zq */
/* JADX INFO: loaded from: classes8.dex */
public class C21755zq implements s7m<C21473yq> {

    /* JADX INFO: renamed from: a */
    public TextView f204332a;

    /* JADX INFO: renamed from: b */
    public TextView f204333b;

    /* JADX INFO: renamed from: c */
    public TextView f204334c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f204335d;

    /* JADX INFO: renamed from: e */
    public C21473yq f204336e;

    /* JADX INFO: renamed from: f */
    public Act f204337f;

    public C21755zq(Act act) {
        this.f204337f = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f204337f;
    }

    /* JADX INFO: renamed from: a */
    public View m219814a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15695ar.m98367b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f204337f;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C21473yq c21473yq) {
        this.f204336e = c21473yq;
    }

    /* JADX INFO: renamed from: c */
    public void m219816c() {
        this.f204334c.setText(act().getString(R$string.f27781T0));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m219814a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m219817r() {
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().mo134136w(false);
        xdl0.m208329E0(this.f204335d, this.f204336e.m215691i0());
        xdl0.m208344M(this.f204334c, this.f204336e.f199512a);
        this.f204336e.m215692j0();
        if (ura.m195053e().m195057d().mo33948xi()) {
            this.f204332a.setText("已完成注销申请");
            this.f204333b.setText("探探将在15天内处理您的申请并删除您的所有数据。若您在15天内重新登录探探，则会默认取消您的注销申请。");
            this.f204335d.setText("完成并退出探探");
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
