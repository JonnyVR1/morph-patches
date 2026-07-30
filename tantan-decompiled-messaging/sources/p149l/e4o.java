package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class e4o implements s7m<d4o> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f89299a;

    /* JADX INFO: renamed from: b */
    public VFrame f89300b;

    /* JADX INFO: renamed from: c */
    public View f89301c;

    /* JADX INFO: renamed from: d */
    public TabLayout f89302d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f89303e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f89304f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f89305g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f89306h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f89307i;

    /* JADX INFO: renamed from: j */
    public VText f89308j;

    /* JADX INFO: renamed from: k */
    public View f89309k;

    /* JADX INFO: renamed from: l */
    public VFrame f89310l;

    /* JADX INFO: renamed from: m */
    public NoSaveStateViewPager f89311m;

    /* JADX INFO: renamed from: n */
    public View f89312n;

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return xdl0.m208328E(this.f89310l);
    }

    /* JADX INFO: renamed from: a */
    public View m114699a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f4o.m119355b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public void m114701c(Act act) {
        this.f89305g.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(38.0f), t100.m186890d(38.0f)));
        this.f89307i.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(38.0f), t100.m186890d(38.0f)));
        this.f89304f.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(38.0f), t100.m186890d(38.0f)));
        xdl0.m208359W(this.f89305g, 0);
        xdl0.m208359W(this.f89307i, 0);
        xdl0.m208358V(this.f89305g, 0);
        xdl0.m208358V(this.f89307i, 0);
        xdl0.m208358V(this.f89304f, 0);
        this.f89304f.setPadding(t100.m186890d(6.0f), t100.m186890d(5.0f), t100.m186890d(6.0f), t100.m186890d(5.0f));
        this.f89305g.setPadding(t100.m186890d(6.0f), t100.m186890d(5.0f), t100.m186890d(6.0f), t100.m186890d(5.0f));
        this.f89307i.setPadding(t100.m186890d(6.0f), t100.m186890d(5.0f), t100.m186890d(6.0f), t100.m186890d(5.0f));
        this.f89305g.setBackgroundResource(h3c0.f105651a);
        this.f89307i.setBackgroundResource(h3c0.f105651a);
        this.f89306h.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(38.0f), t100.m186890d(38.0f)));
        xdl0.m208359W(this.f89306h, 0);
        xdl0.m208358V(this.f89306h, 0);
        this.f89306h.setPadding(t100.m186890d(6.0f), t100.m186890d(5.0f), t100.m186890d(6.0f), t100.m186890d(5.0f));
        this.f89306h.setBackgroundResource(h3c0.f105651a);
        ViewGroup.LayoutParams layoutParams = this.f89310l.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = t100.m186890d(44.0f);
            this.f89310l.setLayoutParams(layoutParams);
        }
        xdl0.m208362Z(this.f89300b, this.f89310l);
        xdl0.m208344M(this.f89301c, false);
        xdl0.m208360X(this.f89310l, ((ViewGroup.MarginLayoutParams) this.f89310l.getLayoutParams()).topMargin + t100.m186890d(6.0f));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m114699a(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d4o d4oVar) {
    }
}
