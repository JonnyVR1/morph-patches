package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VPager;

/* JADX INFO: loaded from: classes3.dex */
public class ik5 implements s7m<hk5>, ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f113631a;

    /* JADX INFO: renamed from: b */
    public VPager f113632b;

    /* JADX INFO: renamed from: c */
    public Act f113633c;

    /* JADX INFO: renamed from: d */
    public hk5 f113634d;

    /* JADX INFO: renamed from: e */
    public uk80<Media> f113635e;

    /* JADX INFO: renamed from: f */
    public ck5 f113636f;

    /* JADX INFO: renamed from: g */
    public li80 f113637g;

    /* JADX INFO: renamed from: h */
    public List<Media> f113638h;

    /* JADX INFO: renamed from: i */
    public int f113639i;

    public ik5(Act act) {
        this.f113633c = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f113633c;
    }

    /* JADX INFO: renamed from: a */
    public View m136765a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jk5.m141826b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f113633c;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hk5 hk5Var) {
        this.f113634d = hk5Var;
    }

    /* JADX INFO: renamed from: c */
    public void m136767c(int i) {
        ck5 ck5Var = new ck5(this.f113633c, this.f113638h);
        this.f113636f = ck5Var;
        ck5Var.m107384x(new o9e(this.f113633c));
        if (NullChecker.m81303a(this.f113637g)) {
            this.f113637g.mo149880b(this.f113636f);
        }
        m136768d();
        m136769e(i);
        this.f113636f.m107378N(this.f113637g);
        this.f113636f.m107380P(this.f113634d.f108156d);
        if (NullChecker.m81303a(this.f113633c.getSupportActionBar())) {
            this.f113633c.getSupportActionBar().mo134126m();
        }
        if (i == 0) {
            onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m136768d() {
        xdl0.m208364a0(this.f113632b);
        this.f113632b.setPageMargin(t100.f167259h);
        this.f113632b.setAdapter(this.f113636f);
        this.f113632b.m4185d(this);
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f113636f)) {
            this.f113636f.m107377M();
        }
        if (NullChecker.m81303a(this.f113635e)) {
            this.f113635e.onDestroy();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m136769e(int i) {
        if (i >= 0) {
            this.f113632b.setCurrentItem(i);
            this.f113636f.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m136770f(uk80<Media> uk80Var) {
        this.f113635e = uk80Var;
    }

    /* JADX INFO: renamed from: i */
    public void m136771i(li80 li80Var) {
        this.f113637g = li80Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM136765a = m136765a(layoutInflater, viewGroup);
        if (NullChecker.m81303a(this.f113635e)) {
            this.f113635e.mo194148c(viewM136765a, this.f113634d.m131456i0());
        }
        return viewM136765a;
    }

    /* JADX INFO: renamed from: j */
    public void m136772j(List<Media> list) {
        this.f113638h = list;
    }

    /* JADX INFO: renamed from: k */
    public void m136773k() {
        if (NullChecker.m81303a(this.f113636f)) {
            this.f113636f.m107383S();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        if (NullChecker.m81303a(this.f113637g)) {
            this.f113637g.mo149883f(this.f113632b, this.f113639i, i);
        }
        this.f113634d.f108155c = i;
        if (NullChecker.m81303a(this.f113636f)) {
            this.f113636f.onPageSelected(i);
        }
        this.f113639i = i;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
