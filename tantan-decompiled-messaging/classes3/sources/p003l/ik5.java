package p003l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.jk5;
import l.s7m;
import l.t100;
import l.xdl0;
import p028v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ik5 implements s7m<hk5>, ViewPager.j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4417a;

    /* JADX INFO: renamed from: b */
    public VPager f4418b;

    /* JADX INFO: renamed from: c */
    public Act f4419c;

    /* JADX INFO: renamed from: d */
    public hk5 f4420d;

    /* JADX INFO: renamed from: e */
    public uk80<Media> f4421e;

    /* JADX INFO: renamed from: f */
    public ck5 f4422f;

    /* JADX INFO: renamed from: g */
    public li80 f4423g;

    /* JADX INFO: renamed from: h */
    public List<Media> f4424h;

    /* JADX INFO: renamed from: i */
    public int f4425i;

    public ik5(Act act) {
        this.f4419c = act;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5133C0() {
        return this.f4419c;
    }

    /* JADX INFO: renamed from: a */
    public View m5134a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jk5.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    public Act act() {
        return this.f4419c;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m5141i1(hk5 hk5Var) {
        this.f4420d = hk5Var;
    }

    /* JADX INFO: renamed from: c */
    public void m5136c(int i) {
        ck5 ck5Var = new ck5(this.f4419c, this.f4424h);
        this.f4422f = ck5Var;
        ck5Var.m3368x(new o9e(this.f4419c));
        if (NullChecker.a(this.f4423g)) {
            this.f4423g.mo6026b(this.f4422f);
        }
        m5137d();
        m5138e(i);
        this.f4422f.m3362N(this.f4423g);
        this.f4422f.m3364P(this.f4420d.f4218d);
        if (NullChecker.a(this.f4419c.getSupportActionBar())) {
            this.f4419c.getSupportActionBar().m();
        }
        if (i == 0) {
            onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m5137d() {
        xdl0.a0(this.f4418b);
        this.f4418b.setPageMargin(t100.h);
        this.f4418b.setAdapter(this.f4422f);
        this.f4418b.d(this);
    }

    public void destroy() {
        if (NullChecker.a(this.f4422f)) {
            this.f4422f.m3361M();
        }
        if (NullChecker.a(this.f4421e)) {
            this.f4421e.onDestroy();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m5138e(int i) {
        if (i >= 0) {
            this.f4418b.setCurrentItem(i);
            this.f4422f.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5139f(uk80<Media> uk80Var) {
        this.f4421e = uk80Var;
    }

    /* JADX INFO: renamed from: i */
    public void m5140i(li80 li80Var) {
        this.f4423g = li80Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM5134a = m5134a(layoutInflater, viewGroup);
        if (NullChecker.a(this.f4421e)) {
            this.f4421e.mo8154c(viewM5134a, this.f4420d.m4978i0());
        }
        return viewM5134a;
    }

    /* JADX INFO: renamed from: j */
    public void m5142j(List<Media> list) {
        this.f4424h = list;
    }

    /* JADX INFO: renamed from: k */
    public void m5143k() {
        if (NullChecker.a(this.f4422f)) {
            this.f4422f.m3367S();
        }
    }

    public void onPageSelected(int i) {
        if (NullChecker.a(this.f4423g)) {
            this.f4423g.mo6029f(this.f4418b, this.f4425i, i);
        }
        this.f4420d.f4217c = i;
        if (NullChecker.a(this.f4422f)) {
            this.f4422f.onPageSelected(i);
        }
        this.f4425i = i;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }
}
