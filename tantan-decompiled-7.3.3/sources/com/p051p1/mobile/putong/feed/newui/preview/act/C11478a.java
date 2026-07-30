package com.p051p1.mobile.putong.feed.newui.preview.act;

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
import java.util.ArrayList;
import p151v.VFrame;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.fresco.subscaleview.SubsamplingScaleImageView;
import p153l.a4h;
import p153l.bnl0;
import p153l.dg70;
import p153l.fg70;
import p153l.hdc0;
import p153l.iam;
import p153l.ixh;
import p153l.jxh;
import p153l.kxh;
import p153l.l51;
import p153l.qa00;
import p153l.wf70;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.a */
/* JADX INFO: loaded from: classes13.dex */
public class C11478a implements iam<dg70>, ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f43457a;

    /* JADX INFO: renamed from: b */
    public VPager f43458b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f43459c;

    /* JADX INFO: renamed from: d */
    public int f43460d = qa00.m175859d(8.0f);

    /* JADX INFO: renamed from: e */
    public dg70 f43461e;

    /* JADX INFO: renamed from: f */
    public Act f43462f;

    /* JADX INFO: renamed from: g */
    public wf70 f43463g;

    /* JADX INFO: renamed from: h */
    public kxh<ixh> f43464h;

    /* JADX INFO: renamed from: i */
    public ArrayList<Media> f43465i;

    /* JADX INFO: renamed from: j */
    public String f43466j;

    /* JADX INFO: renamed from: k */
    public int f43467k;

    /* JADX INFO: renamed from: l */
    public jxh f43468l;

    /* JADX INFO: renamed from: m */
    public ixh f43469m;

    /* JADX INFO: renamed from: n */
    public View f43470n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f43471a;

        /* JADX INFO: renamed from: b */
        public Act f43472b;

        /* JADX INFO: renamed from: c */
        public int f43473c = qa00.m175859d(8.0f);

        /* JADX INFO: renamed from: d */
        public kxh<ixh> f43474d;

        /* JADX INFO: renamed from: e */
        public jxh f43475e;

        /* JADX INFO: renamed from: a */
        public static a m66517a() {
            return new a();
        }

        /* JADX INFO: renamed from: b */
        public C11478a m66518b() {
            C11478a c11478a = new C11478a(this.f43472b);
            c11478a.m66515u(this.f43473c);
            c11478a.f43468l = this.f43475e;
            c11478a.f43464h = this.f43474d;
            c11478a.f43466j = this.f43471a;
            return c11478a;
        }

        /* JADX INFO: renamed from: c */
        public a m66519c(kxh<ixh> kxhVar) {
            this.f43474d = kxhVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m66520d(Act act) {
            this.f43472b = act;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m66521e(String str) {
            this.f43471a = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m66522f(jxh jxhVar) {
            this.f43475e = jxhVar;
            return this;
        }
    }

    public C11478a(Act act) {
        this.f43462f = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f43462f;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f43462f;
    }

    /* JADX INFO: renamed from: c */
    public View m66502c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fg70.m125492b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m66503d(View view) {
        ixh ixhVarM142522b = ixh.C17818a.m142521a().m142524d(this.f43466j).m142525e(this.f43461e.f88270e).m142526f(this.f43461e.f88269d).m142523c(this.f43461e.f88268c).m142522b();
        this.f43469m = ixhVarM142522b;
        this.f43464h.mo107411c(view, ixhVarM142522b);
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f43463g)) {
            this.f43463g.m206088e0();
        }
        if (NullChecker.m82486a(this.f43464h)) {
            this.f43464h.onDestroy();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dg70 dg70Var) {
        this.f43461e = dg70Var;
    }

    /* JADX INFO: renamed from: f */
    public void m66505f() {
        this.f43458b.setScrollble(false);
    }

    /* JADX INFO: renamed from: i */
    public View m66506i() {
        return this.f43458b.findViewWithTag(Integer.valueOf(this.f43461e.f88268c));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f43470n = m66502c(layoutInflater, viewGroup);
        if (NullChecker.m82486a(this.f43464h)) {
            m66503d(this.f43470n);
        }
        return this.f43470n;
    }

    /* JADX INFO: renamed from: j */
    public final wf70 m66507j() {
        wf70 wf70Var = new wf70(this.f43462f, this.f43465i, this.f43461e.f88270e);
        wf70Var.m206091h0(new a4h(this.f43462f));
        return wf70Var;
    }

    /* JADX INFO: renamed from: k */
    public void m66508k(int i, boolean z) {
        this.f43463g = m66507j();
        if (NullChecker.m82486a(this.f43468l)) {
            this.f43468l.mo107410b(this.f43463g);
        }
        m66510m(this.f43458b);
        m66509l(i, this.f43459c);
        m66512p(i);
        this.f43463g.m206090g0(this.f43468l);
        this.f43463g.m206093j0(this.f43461e.f88269d);
        if (NullChecker.m82486a(this.f43462f.getSupportActionBar())) {
            this.f43462f.getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m66509l(int i, VPagerCircleIndicator vPagerCircleIndicator) {
        vPagerCircleIndicator.m224389c(this.f43458b, i);
        vPagerCircleIndicator.setOnPageChangeListener(this);
        bnl0.m105525M0(vPagerCircleIndicator, true);
    }

    /* JADX INFO: renamed from: m */
    public void m66510m(VPager vPager) {
        bnl0.m105544a0(vPager);
        vPager.setAdapter(this.f43463g);
        vPager.setPageMargin(this.f43460d);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m66511n() {
        this.f43462f.m68056e2();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        if (NullChecker.m82486a(this.f43468l)) {
            this.f43468l.mo107413f(this.f43458b, this.f43467k, i);
        }
        this.f43461e.f88268c = i;
        if (NullChecker.m82486a(this.f43463g)) {
            this.f43463g.onPageSelected(i);
        }
        this.f43467k = i;
    }

    /* JADX INFO: renamed from: p */
    public void m66512p(int i) {
        if (i >= 0) {
            this.f43458b.setCurrentItem(i);
            this.f43463g.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m66513q() {
        View viewM66506i = m66506i();
        if (viewM66506i instanceof VFrame) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewM66506i.findViewById(hdc0.f108850L0);
            if (NullChecker.m82486a(subsamplingScaleImageView)) {
                subsamplingScaleImageView.setOnImageEventListener(null);
                subsamplingScaleImageView.setVisibility(8);
                ((VFrame) viewM66506i).removeView(subsamplingScaleImageView);
                l51.m152888H(this.f43462f, new Runnable() { // from class: l.eg70
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f93906a.m66511n();
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m66514s() {
        ixh ixhVar = this.f43469m;
        m66508k(ixhVar.f117408a, ixhVar.f117409b);
        this.f43469m.f117410c = this.f43461e.f88270e;
        if (NullChecker.m82486a(this.f43464h)) {
            this.f43464h.mo107415i(this.f43469m);
            this.f43464h.mo107409a(true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m66515u(int i) {
        this.f43460d = i;
    }

    /* JADX INFO: renamed from: v */
    public void m66516v(ArrayList<Media> arrayList) {
        this.f43465i = arrayList;
    }
}
