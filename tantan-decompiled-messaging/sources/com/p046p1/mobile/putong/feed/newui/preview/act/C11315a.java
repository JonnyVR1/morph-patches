package com.p046p1.mobile.putong.feed.newui.preview.act;

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
import java.util.ArrayList;
import p147v.VFrame;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.fresco.subscaleview.SubsamplingScaleImageView;
import p149l.b5c0;
import p149l.e51;
import p149l.l2h;
import p149l.q770;
import p149l.s7m;
import p149l.t100;
import p149l.tvh;
import p149l.uvh;
import p149l.vvh;
import p149l.x770;
import p149l.xdl0;
import p149l.z770;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.a */
/* JADX INFO: loaded from: classes12.dex */
public class C11315a implements s7m<x770>, ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f42609a;

    /* JADX INFO: renamed from: b */
    public VPager f42610b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f42611c;

    /* JADX INFO: renamed from: d */
    public int f42612d = t100.m186890d(8.0f);

    /* JADX INFO: renamed from: e */
    public x770 f42613e;

    /* JADX INFO: renamed from: f */
    public Act f42614f;

    /* JADX INFO: renamed from: g */
    public q770 f42615g;

    /* JADX INFO: renamed from: h */
    public vvh<tvh> f42616h;

    /* JADX INFO: renamed from: i */
    public ArrayList<Media> f42617i;

    /* JADX INFO: renamed from: j */
    public String f42618j;

    /* JADX INFO: renamed from: k */
    public int f42619k;

    /* JADX INFO: renamed from: l */
    public uvh f42620l;

    /* JADX INFO: renamed from: m */
    public tvh f42621m;

    /* JADX INFO: renamed from: n */
    public View f42622n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f42623a;

        /* JADX INFO: renamed from: b */
        public Act f42624b;

        /* JADX INFO: renamed from: c */
        public int f42625c = t100.m186890d(8.0f);

        /* JADX INFO: renamed from: d */
        public vvh<tvh> f42626d;

        /* JADX INFO: renamed from: e */
        public uvh f42627e;

        /* JADX INFO: renamed from: a */
        public static a m65334a() {
            return new a();
        }

        /* JADX INFO: renamed from: b */
        public C11315a m65335b() {
            C11315a c11315a = new C11315a(this.f42624b);
            c11315a.m65332u(this.f42625c);
            c11315a.f42620l = this.f42627e;
            c11315a.f42616h = this.f42626d;
            c11315a.f42618j = this.f42623a;
            return c11315a;
        }

        /* JADX INFO: renamed from: c */
        public a m65336c(vvh<tvh> vvhVar) {
            this.f42626d = vvhVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m65337d(Act act) {
            this.f42624b = act;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m65338e(String str) {
            this.f42623a = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m65339f(uvh uvhVar) {
            this.f42627e = uvhVar;
            return this;
        }
    }

    public C11315a(Act act) {
        this.f42614f = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f42614f;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f42614f;
    }

    /* JADX INFO: renamed from: c */
    public View m65319c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z770.m217449b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m65320d(View view) {
        tvh tvhVarM190742b = tvh.C20295a.m190741a().m190744d(this.f42618j).m190745e(this.f42613e.f191324e).m190746f(this.f42613e.f191323d).m190743c(this.f42613e.f191322c).m190742b();
        this.f42621m = tvhVarM190742b;
        this.f42616h.mo142719c(view, tvhVarM190742b);
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f42615g)) {
            this.f42615g.m173225e0();
        }
        if (NullChecker.m81303a(this.f42616h)) {
            this.f42616h.onDestroy();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x770 x770Var) {
        this.f42613e = x770Var;
    }

    /* JADX INFO: renamed from: f */
    public void m65322f() {
        this.f42610b.setScrollble(false);
    }

    /* JADX INFO: renamed from: i */
    public View m65323i() {
        return this.f42610b.findViewWithTag(Integer.valueOf(this.f42613e.f191322c));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f42622n = m65319c(layoutInflater, viewGroup);
        if (NullChecker.m81303a(this.f42616h)) {
            m65320d(this.f42622n);
        }
        return this.f42622n;
    }

    /* JADX INFO: renamed from: j */
    public final q770 m65324j() {
        q770 q770Var = new q770(this.f42614f, this.f42617i, this.f42613e.f191324e);
        q770Var.m173228h0(new l2h(this.f42614f));
        return q770Var;
    }

    /* JADX INFO: renamed from: k */
    public void m65325k(int i, boolean z) {
        this.f42615g = m65324j();
        if (NullChecker.m81303a(this.f42620l)) {
            this.f42620l.mo142717b(this.f42615g);
        }
        m65327m(this.f42610b);
        m65326l(i, this.f42611c);
        m65329p(i);
        this.f42615g.m173227g0(this.f42620l);
        this.f42615g.m173230j0(this.f42613e.f191323d);
        if (NullChecker.m81303a(this.f42614f.getSupportActionBar())) {
            this.f42614f.getSupportActionBar().mo134126m();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m65326l(int i, VPagerCircleIndicator vPagerCircleIndicator) {
        vPagerCircleIndicator.m223143c(this.f42610b, i);
        vPagerCircleIndicator.setOnPageChangeListener(this);
        xdl0.m208345M0(vPagerCircleIndicator, true);
    }

    /* JADX INFO: renamed from: m */
    public void m65327m(VPager vPager) {
        xdl0.m208364a0(vPager);
        vPager.setAdapter(this.f42615g);
        vPager.setPageMargin(this.f42612d);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m65328n() {
        this.f42614f.m66873d2();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        if (NullChecker.m81303a(this.f42620l)) {
            this.f42620l.mo142208f(this.f42610b, this.f42619k, i);
        }
        this.f42613e.f191322c = i;
        if (NullChecker.m81303a(this.f42615g)) {
            this.f42615g.onPageSelected(i);
        }
        this.f42619k = i;
    }

    /* JADX INFO: renamed from: p */
    public void m65329p(int i) {
        if (i >= 0) {
            this.f42610b.setCurrentItem(i);
            this.f42615g.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m65330q() {
        View viewM65323i = m65323i();
        if (viewM65323i instanceof VFrame) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) viewM65323i.findViewById(b5c0.f73497L0);
            if (NullChecker.m81303a(subsamplingScaleImageView)) {
                subsamplingScaleImageView.setOnImageEventListener(null);
                subsamplingScaleImageView.setVisibility(8);
                ((VFrame) viewM65323i).removeView(subsamplingScaleImageView);
                e51.m114743H(this.f42614f, new Runnable() { // from class: l.y770
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f196684a.m65328n();
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m65331s() {
        tvh tvhVar = this.f42621m;
        m65325k(tvhVar.f172286a, tvhVar.f172287b);
        this.f42621m.f172288c = this.f42613e.f191324e;
        if (NullChecker.m81303a(this.f42616h)) {
            this.f42616h.mo142725i(this.f42621m);
            this.f42616h.mo142715a(true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m65332u(int i) {
        this.f42612d = i;
    }

    /* JADX INFO: renamed from: v */
    public void m65333v(ArrayList<Media> arrayList) {
        this.f42617i = arrayList;
    }
}
