package com.p046p1.mobile.putong.live.livingroom.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.live.base.data.BLiveBannerTab;
import com.p046p1.mobile.putong.live.base.view.LoopViewPager;
import com.p046p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p046p1.mobile.putong.live.livingroom.view.banner.LiveBannerView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.e30;
import p149l.ffw;
import p149l.g5c0;
import p149l.jo0;
import p149l.mcr;
import p149l.mkd0;
import p149l.t6c0;
import p149l.uep0;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveBannerView extends FrameLayout implements LoopViewPager.InterfaceC12480c, ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public c4g0 f52105a;

    /* JADX INFO: renamed from: b */
    public LoopViewPager f52106b;

    /* JADX INFO: renamed from: c */
    public LoopViewPagerIndicator f52107c;

    /* JADX INFO: renamed from: d */
    public mcr f52108d;

    public LiveBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(t6c0.f168440n, (ViewGroup) this, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76665a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m76668d(e30 e30Var, BLiveBannerTab bLiveBannerTab) {
        if (e30Var != null) {
            e30Var.call(bLiveBannerTab);
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m76669e() {
        LoopViewPager loopViewPager = this.f52106b;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || uep0.m193334u(this.f52106b, true) < 0.1f) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    private void m76670f() {
        LoopViewPager loopViewPager = this.f52106b;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.f52106b.m68804l0((this.f52106b.getIndicatorPosition() + 1) % this.f52106b.getIndicatorCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ Boolean m76671g(Long l2) {
        return Boolean.valueOf(m76669e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m76672h(Long l2) {
        m76670f();
    }

    /* JADX INFO: renamed from: l */
    private void m76673l() {
        mkd0.m154992z(this.f52105a);
        if (this.f52106b != null) {
            m76674m();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m76674m() {
        this.f52105a = this.f52108d.duringCreated(C22306c.interval(4L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.cvr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f82671a.m76671g((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.dvr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88093a.m76672h((Long) obj);
            }
        }, new e30() { // from class: l.evr
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveBannerView.m76665a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m76675i() {
        mkd0.m154992z(this.f52105a);
        LoopViewPager loopViewPager = this.f52106b;
        if (loopViewPager != null) {
            loopViewPager.m4175P(this);
            this.f52106b.setOnPageChangeListener(null);
            this.f52106b.setAdapter(null);
            this.f52106b = null;
        }
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12480c
    /* JADX INFO: renamed from: j */
    public void mo67403j(int i) {
    }

    /* JADX INFO: renamed from: k */
    public void m76676k(mcr mcrVar, List<BLiveBannerTab> list, final e30<BLiveBannerTab> e30Var) {
        this.f52108d = mcrVar;
        this.f52106b = (LoopViewPager) findViewById(g5c0.f100643A4);
        this.f52107c = (LoopViewPagerIndicator) findViewById(g5c0.f100722J2);
        C12945a c12945a = new C12945a(list, true);
        c12945a.m76681v(new C12945a.a() { // from class: l.fvr
            @Override // com.p046p1.mobile.putong.live.livingroom.view.banner.C12945a.a
            /* JADX INFO: renamed from: a */
            public final void mo76682a(BLiveBannerTab bLiveBannerTab) {
                LiveBannerView.m76668d(e30Var, bLiveBannerTab);
            }
        });
        this.f52106b.setAdapter(c12945a);
        this.f52106b.setPageShowListener(this);
        this.f52106b.m4185d(this);
        int size = list.size();
        LoopViewPagerIndicator loopViewPagerIndicator = this.f52107c;
        if (size < 2) {
            xdl0.m208344M(loopViewPagerIndicator, false);
            return;
        }
        xdl0.m208345M0(loopViewPagerIndicator, true);
        this.f52107c.m68812e(this.f52106b, 0);
        m76673l();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m76673l();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
    }

    public LiveBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveBannerView(@NonNull Context context) {
        this(context, null);
    }
}
