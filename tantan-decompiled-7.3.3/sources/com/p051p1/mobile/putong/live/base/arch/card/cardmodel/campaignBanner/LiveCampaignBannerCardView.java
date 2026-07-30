package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignBannerCardView;
import com.p051p1.mobile.putong.live.base.view.LoopViewPager;
import com.p051p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.hk4;
import p153l.jdc0;
import p153l.kcg0;
import p153l.ner;
import p153l.o3s;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.y20;
import p153l.ynp0;
import p153l.yrs;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCampaignBannerCardView extends RatioLayout implements LoopViewPager.InterfaceC12643c, ViewPager.InterfaceC0718j {
    private kcg0 autoScrollSub;
    private hk4 cardContext;
    private o3s cardData;
    private LoopViewPagerIndicator indicator;
    private LoopViewPager viewPager;

    public LiveCampaignBannerCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m68601e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    private boolean m68602f() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || ynp0.m216944u(this.viewPager, true) < 0.1f) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    private void m68603g() {
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.viewPager.m69987l0((this.viewPager.getIndicatorPosition() + 1) % this.viewPager.getIndicatorCount());
    }

    /* JADX INFO: renamed from: h */
    private boolean m68604h() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || ynp0.m216944u(this.viewPager, true) < 0.5f) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Boolean m68605k(Long l2) {
        return Boolean.valueOf(m68602f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m68606l(Long l2) {
        m68603g();
    }

    /* JADX INFO: renamed from: o */
    private void m68607o() {
        if (this.cardData.localAutoScroll) {
            psd0.m173633z(this.autoScrollSub);
            if (this.viewPager != null) {
                m68608p();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m68608p() {
        ner nerVar = this.cardContext.f110375lp;
        if (nerVar == null) {
            return;
        }
        this.autoScrollSub = nerVar.duringCreated(C22421c.interval(6L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.j3s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f118212a.m68605k((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.k3s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123770a.m68606l((Long) obj);
            }
        }, new y20() { // from class: l.l3s
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveCampaignBannerCardView.m68601e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    private void m68609q() {
        int indicatorPosition;
        o3s o3sVar = this.cardData;
        if (o3sVar == null || o3sVar.m165884a() == null || (indicatorPosition = this.viewPager.getIndicatorPosition() + 1) < 1 || indicatorPosition > this.cardData.m165884a().size()) {
            return;
        }
        LiveCardTracker.trackMv(this.cardData.m165884a().get(this.viewPager.getIndicatorPosition()).m165886b());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m68610i(o3s.C19019a c19019a) {
        yrs.m217233a(getContext(), c19019a.m165885a());
        LiveCardTracker.trackMc(c19019a.m165886b());
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12643c
    /* JADX INFO: renamed from: j */
    public void mo68586j(int i) {
        if (m68604h()) {
            m68609q();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m68611m() {
        psd0.m173633z(this.autoScrollSub);
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager != null) {
            loopViewPager.m4177P(this);
            this.viewPager.setOnPageChangeListener(null);
            this.viewPager.setAdapter(null);
            this.viewPager = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m68612n(hk4 hk4Var, o3s o3sVar) {
        this.cardData = o3sVar;
        LoopViewPager loopViewPager = (LoopViewPager) findViewById(jdc0.f120233u0);
        this.viewPager = loopViewPager;
        loopViewPager.setPageMargin(qa00.m175859d(10.0f));
        this.indicator = (LoopViewPagerIndicator) findViewById(jdc0.f120162T);
        this.cardContext = hk4Var;
        C11590a c11590a = new C11590a(o3sVar);
        c11590a.m68618v(new C11590a.a() { // from class: l.m3s
            @Override // com.p051p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.C11590a.a
            /* JADX INFO: renamed from: a */
            public final void mo68619a(o3s.C19019a c19019a) {
                this.f134702a.m68610i(c19019a);
            }
        });
        this.viewPager.setAdapter(c11590a);
        this.viewPager.setPageShowListener(this);
        this.viewPager.m4187d(this);
        m68609q();
        int size = o3sVar.m165884a().size();
        LoopViewPagerIndicator loopViewPagerIndicator = this.indicator;
        if (size < 2) {
            bnl0.m105524M(loopViewPagerIndicator, false);
            return;
        }
        bnl0.m105525M0(loopViewPagerIndicator, true);
        this.indicator.m69995e(this.viewPager, 0);
        m68607o();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m68607o();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
    }

    public LiveCampaignBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCampaignBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
