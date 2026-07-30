package com.p051p1.mobile.putong.live.livingroom.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.live.base.data.BLiveBannerTab;
import com.p051p1.mobile.putong.live.base.view.LoopViewPager;
import com.p051p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p051p1.mobile.putong.live.livingroom.view.banner.LiveBannerView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.kcg0;
import p153l.mdc0;
import p153l.ner;
import p153l.psd0;
import p153l.qcj;
import p153l.y20;
import p153l.yec0;
import p153l.ynp0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveBannerView extends FrameLayout implements LoopViewPager.InterfaceC12643c, ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public kcg0 f52953a;

    /* JADX INFO: renamed from: b */
    public LoopViewPager f52954b;

    /* JADX INFO: renamed from: c */
    public LoopViewPagerIndicator f52955c;

    /* JADX INFO: renamed from: d */
    public ner f52956d;

    public LiveBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(yec0.f199172n, (ViewGroup) this, true);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77848a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m77851d(y20 y20Var, BLiveBannerTab bLiveBannerTab) {
        if (y20Var != null) {
            y20Var.call(bLiveBannerTab);
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m77852e() {
        LoopViewPager loopViewPager = this.f52954b;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || ynp0.m216944u(this.f52954b, true) < 0.1f) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    private void m77853f() {
        LoopViewPager loopViewPager = this.f52954b;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.f52954b.m69987l0((this.f52954b.getIndicatorPosition() + 1) % this.f52954b.getIndicatorCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ Boolean m77854g(Long l2) {
        return Boolean.valueOf(m77852e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m77855h(Long l2) {
        m77853f();
    }

    /* JADX INFO: renamed from: l */
    private void m77856l() {
        psd0.m173633z(this.f52953a);
        if (this.f52954b != null) {
            m77857m();
        }
    }

    /* JADX INFO: renamed from: m */
    private void m77857m() {
        this.f52953a = this.f52956d.duringCreated(C22421c.interval(4L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.dxr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f91103a.m77854g((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.exr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96326a.m77855h((Long) obj);
            }
        }, new y20() { // from class: l.fxr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveBannerView.m77848a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m77858i() {
        psd0.m173633z(this.f52953a);
        LoopViewPager loopViewPager = this.f52954b;
        if (loopViewPager != null) {
            loopViewPager.m4177P(this);
            this.f52954b.setOnPageChangeListener(null);
            this.f52954b.setAdapter(null);
            this.f52954b = null;
        }
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12643c
    /* JADX INFO: renamed from: j */
    public void mo68586j(int i) {
    }

    /* JADX INFO: renamed from: k */
    public void m77859k(ner nerVar, List<BLiveBannerTab> list, final y20<BLiveBannerTab> y20Var) {
        this.f52956d = nerVar;
        this.f52954b = (LoopViewPager) findViewById(mdc0.f135888A4);
        this.f52955c = (LoopViewPagerIndicator) findViewById(mdc0.f135967J2);
        C13108a c13108a = new C13108a(list, true);
        c13108a.m77864v(new C13108a.a() { // from class: l.gxr
            @Override // com.p051p1.mobile.putong.live.livingroom.view.banner.C13108a.a
            /* JADX INFO: renamed from: a */
            public final void mo77865a(BLiveBannerTab bLiveBannerTab) {
                LiveBannerView.m77851d(y20Var, bLiveBannerTab);
            }
        });
        this.f52954b.setAdapter(c13108a);
        this.f52954b.setPageShowListener(this);
        this.f52954b.m4187d(this);
        int size = list.size();
        LoopViewPagerIndicator loopViewPagerIndicator = this.f52955c;
        if (size < 2) {
            bnl0.m105524M(loopViewPagerIndicator, false);
            return;
        }
        bnl0.m105525M0(loopViewPagerIndicator, true);
        this.f52955c.m69995e(this.f52954b, 0);
        m77856l();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m77856l();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
    }

    public LiveBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveBannerView(@NonNull Context context) {
        this(context, null);
    }
}
