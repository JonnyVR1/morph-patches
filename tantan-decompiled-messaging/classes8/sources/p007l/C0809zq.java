package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.profile.R;
import l.ar;
import l.ura;
import l.xdl0;
import v.VButton_FakeShadow;

/* JADX INFO: renamed from: l.zq */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0809zq implements s7m<C0799yq> {

    /* JADX INFO: renamed from: a */
    public TextView f5522a;

    /* JADX INFO: renamed from: b */
    public TextView f5523b;

    /* JADX INFO: renamed from: c */
    public TextView f5524c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f5525d;

    /* JADX INFO: renamed from: e */
    public C0799yq f5526e;

    /* JADX INFO: renamed from: f */
    public Act f5527f;

    public C0809zq(Act act) {
        this.f5527f = act;
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f5527f;
    }

    /* JADX INFO: renamed from: a */
    public View m12033a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ar.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    @Nullable
    public Act act() {
        return this.f5527f;
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(C0799yq c0799yq) {
        this.f5526e = c0799yq;
    }

    /* JADX INFO: renamed from: c */
    public void m12035c() {
        this.f5524c.setText(act().getString(R.string.T0));
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12033a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m12036r() {
        act().setSwipeBackEnable(false);
        act().getSupportActionBar().w(false);
        xdl0.E0(this.f5525d, this.f5526e.m11956i0());
        xdl0.M(this.f5524c, this.f5526e.f5459a);
        this.f5526e.m11957j0();
        if (ura.e().d().xi()) {
            this.f5522a.setText("已完成注销申请");
            this.f5523b.setText("探探将在15天内处理您的申请并删除您的所有数据。若您在15天内重新登录探探，则会默认取消您的注销申请。");
            this.f5525d.setText("完成并退出探探");
        }
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
