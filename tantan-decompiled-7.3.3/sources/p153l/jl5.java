package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VPager;

/* JADX INFO: loaded from: classes3.dex */
public class jl5 implements iam<il5>, ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f121467a;

    /* JADX INFO: renamed from: b */
    public VPager f121468b;

    /* JADX INFO: renamed from: c */
    public Act f121469c;

    /* JADX INFO: renamed from: d */
    public il5 f121470d;

    /* JADX INFO: renamed from: e */
    public ys80<Media> f121471e;

    /* JADX INFO: renamed from: f */
    public dl5 f121472f;

    /* JADX INFO: renamed from: g */
    public pq80 f121473g;

    /* JADX INFO: renamed from: h */
    public List<Media> f121474h;

    /* JADX INFO: renamed from: i */
    public int f121475i;

    public jl5(Act act) {
        this.f121469c = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f121469c;
    }

    /* JADX INFO: renamed from: a */
    public View m145940a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kl5.m150353b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f121469c;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(il5 il5Var) {
        this.f121470d = il5Var;
    }

    /* JADX INFO: renamed from: c */
    public void m145942c(int i) {
        dl5 dl5Var = new dl5(this.f121469c, this.f121474h);
        this.f121472f = dl5Var;
        dl5Var.m116737x(new sae(this.f121469c));
        if (NullChecker.m82486a(this.f121473g)) {
            this.f121473g.mo173326b(this.f121472f);
        }
        m145943d();
        m145944e(i);
        this.f121472f.m116731N(this.f121473g);
        this.f121472f.m116733P(this.f121470d.f115528d);
        if (NullChecker.m82486a(this.f121469c.getSupportActionBar())) {
            this.f121469c.getSupportActionBar().mo102186m();
        }
        if (i == 0) {
            onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m145943d() {
        bnl0.m105544a0(this.f121468b);
        this.f121468b.setPageMargin(qa00.f156321h);
        this.f121468b.setAdapter(this.f121472f);
        this.f121468b.m4187d(this);
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f121472f)) {
            this.f121472f.m116730M();
        }
        if (NullChecker.m82486a(this.f121471e)) {
            this.f121471e.onDestroy();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m145944e(int i) {
        if (i >= 0) {
            this.f121468b.setCurrentItem(i);
            this.f121472f.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m145945f(ys80<Media> ys80Var) {
        this.f121471e = ys80Var;
    }

    /* JADX INFO: renamed from: i */
    public void m145946i(pq80 pq80Var) {
        this.f121473g = pq80Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM145940a = m145940a(layoutInflater, viewGroup);
        if (NullChecker.m82486a(this.f121471e)) {
            this.f121471e.mo173442c(viewM145940a, this.f121470d.m140586i0());
        }
        return viewM145940a;
    }

    /* JADX INFO: renamed from: j */
    public void m145947j(List<Media> list) {
        this.f121474h = list;
    }

    /* JADX INFO: renamed from: k */
    public void m145948k() {
        if (NullChecker.m82486a(this.f121472f)) {
            this.f121472f.m116736S();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        if (NullChecker.m82486a(this.f121473g)) {
            this.f121473g.mo173329f(this.f121468b, this.f121475i, i);
        }
        this.f121470d.f115527c = i;
        if (NullChecker.m82486a(this.f121472f)) {
            this.f121472f.onPageSelected(i);
        }
        this.f121475i = i;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
