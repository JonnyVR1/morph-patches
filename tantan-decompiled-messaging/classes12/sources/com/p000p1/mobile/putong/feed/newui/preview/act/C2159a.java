package com.p000p1.mobile.putong.feed.newui.preview.act;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.Media;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e51;
import l.s7m;
import l.t100;
import l.xdl0;
import p007l.b5c0;
import p007l.l2h;
import p007l.q770;
import p007l.tvh;
import p007l.uvh;
import p007l.vvh;
import p007l.x770;
import p007l.z770;
import v.VFrame;
import v.VPager;
import v.VPagerCircleIndicator;
import v.fresco.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2159a implements s7m<x770>, ViewPager.j {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4070a;

    /* JADX INFO: renamed from: b */
    public VPager f4071b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f4072c;

    /* JADX INFO: renamed from: d */
    public int f4073d = t100.d(8.0f);

    /* JADX INFO: renamed from: e */
    public x770 f4074e;

    /* JADX INFO: renamed from: f */
    public Act f4075f;

    /* JADX INFO: renamed from: g */
    public q770 f4076g;

    /* JADX INFO: renamed from: h */
    public vvh<tvh> f4077h;

    /* JADX INFO: renamed from: i */
    public ArrayList<Media> f4078i;

    /* JADX INFO: renamed from: j */
    public String f4079j;

    /* JADX INFO: renamed from: k */
    public int f4080k;

    /* JADX INFO: renamed from: l */
    public uvh f4081l;

    /* JADX INFO: renamed from: m */
    public tvh f4082m;

    /* JADX INFO: renamed from: n */
    public View f4083n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.preview.act.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f4084a;

        /* JADX INFO: renamed from: b */
        public Act f4085b;

        /* JADX INFO: renamed from: c */
        public int f4086c = t100.d(8.0f);

        /* JADX INFO: renamed from: d */
        public vvh<tvh> f4087d;

        /* JADX INFO: renamed from: e */
        public uvh f4088e;

        /* JADX INFO: renamed from: a */
        public static a m6437a() {
            return new a();
        }

        /* JADX INFO: renamed from: b */
        public C2159a m6438b() {
            C2159a c2159a = new C2159a(this.f4085b);
            c2159a.m6435u(this.f4086c);
            c2159a.f4081l = this.f4088e;
            c2159a.f4077h = this.f4087d;
            c2159a.f4079j = this.f4084a;
            return c2159a;
        }

        /* JADX INFO: renamed from: c */
        public a m6439c(vvh<tvh> vvhVar) {
            this.f4087d = vvhVar;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m6440d(Act act) {
            this.f4085b = act;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m6441e(String str) {
            this.f4084a = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public a m6442f(uvh uvhVar) {
            this.f4088e = uvhVar;
            return this;
        }
    }

    public C2159a(Act act) {
        this.f4075f = act;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6420C0() {
        return this.f4075f;
    }

    @Nullable
    public Act act() {
        return this.f4075f;
    }

    /* JADX INFO: renamed from: c */
    public View m6421c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z770.m17244b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m6422d(View view) {
        tvh tvhVarM14667b = tvh.C2502a.m14666a().m14669d(this.f4079j).m14670e(this.f4074e.f14788e).m14671f(this.f4074e.f14787d).m14668c(this.f4074e.f14786c).m14667b();
        this.f4082m = tvhVarM14667b;
        this.f4077h.mo11302c(view, tvhVarM14667b);
    }

    public void destroy() {
        if (NullChecker.a(this.f4076g)) {
            this.f4076g.m13469e0();
        }
        if (NullChecker.a(this.f4077h)) {
            this.f4077h.onDestroy();
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m6426i1(x770 x770Var) {
        this.f4074e = x770Var;
    }

    /* JADX INFO: renamed from: f */
    public void m6424f() {
        this.f4071b.setScrollble(false);
    }

    /* JADX INFO: renamed from: i */
    public View m6425i() {
        return this.f4071b.findViewWithTag(Integer.valueOf(this.f4074e.f14786c));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f4083n = m6421c(layoutInflater, viewGroup);
        if (NullChecker.a(this.f4077h)) {
            m6422d(this.f4083n);
        }
        return this.f4083n;
    }

    /* JADX INFO: renamed from: j */
    public final q770 m6427j() {
        q770 q770Var = new q770(this.f4075f, this.f4078i, this.f4074e.f14788e);
        q770Var.m13472h0(new l2h(this.f4075f));
        return q770Var;
    }

    /* JADX INFO: renamed from: k */
    public void m6428k(int i, boolean z) {
        this.f4076g = m6427j();
        if (NullChecker.a(this.f4081l)) {
            this.f4081l.mo11300b(this.f4076g);
        }
        m6430m(this.f4071b);
        m6429l(i, this.f4072c);
        m6432p(i);
        this.f4076g.m13471g0(this.f4081l);
        this.f4076g.m13474j0(this.f4074e.f14787d);
        if (NullChecker.a(this.f4075f.getSupportActionBar())) {
            this.f4075f.getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m6429l(int i, VPagerCircleIndicator vPagerCircleIndicator) {
        vPagerCircleIndicator.c(this.f4071b, i);
        vPagerCircleIndicator.setOnPageChangeListener(this);
        xdl0.M0(vPagerCircleIndicator, true);
    }

    /* JADX INFO: renamed from: m */
    public void m6430m(VPager vPager) {
        xdl0.a0(vPager);
        vPager.setAdapter(this.f4076g);
        vPager.setPageMargin(this.f4073d);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m6431n() {
        this.f4075f.finish();
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        if (NullChecker.a(this.f4081l)) {
            this.f4081l.mo11226f(this.f4071b, this.f4080k, i);
        }
        this.f4074e.f14786c = i;
        if (NullChecker.a(this.f4076g)) {
            this.f4076g.onPageSelected(i);
        }
        this.f4080k = i;
    }

    /* JADX INFO: renamed from: p */
    public void m6432p(int i) {
        if (i >= 0) {
            this.f4071b.setCurrentItem(i);
            this.f4076g.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m6433q() {
        VFrame vFrameM6425i = m6425i();
        if (vFrameM6425i instanceof VFrame) {
            View view = (SubsamplingScaleImageView) vFrameM6425i.findViewById(b5c0.f5978L0);
            if (NullChecker.a(view)) {
                view.setOnImageEventListener((SubsamplingScaleImageView.h) null);
                view.setVisibility(8);
                vFrameM6425i.removeView(view);
                e51.H(this.f4075f, new Runnable() { // from class: l.y770
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15284a.m6431n();
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m6434s() {
        tvh tvhVar = this.f4082m;
        m6428k(tvhVar.f13431a, tvhVar.f13432b);
        this.f4082m.f13433c = this.f4074e.f14788e;
        if (NullChecker.a(this.f4077h)) {
            this.f4077h.mo11309i(this.f4082m);
            this.f4077h.mo11298a(true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m6435u(int i) {
        this.f4073d = i;
    }

    /* JADX INFO: renamed from: v */
    public void m6436v(ArrayList<Media> arrayList) {
        this.f4078i = arrayList;
    }
}
