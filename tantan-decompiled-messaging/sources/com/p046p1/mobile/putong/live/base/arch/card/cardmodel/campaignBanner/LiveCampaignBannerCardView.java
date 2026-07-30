package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.LiveCampaignBannerCardView;
import com.p046p1.mobile.putong.live.base.view.LoopViewPager;
import com.p046p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.d5c0;
import p149l.e30;
import p149l.ffw;
import p149l.ij4;
import p149l.jo0;
import p149l.mcr;
import p149l.mkd0;
import p149l.n1s;
import p149l.t100;
import p149l.uep0;
import p149l.w9j;
import p149l.xdl0;
import p149l.xps;

/* JADX INFO: loaded from: classes13.dex */
public class LiveCampaignBannerCardView extends RatioLayout implements LoopViewPager.InterfaceC12480c, ViewPager.InterfaceC0716j {
    private c4g0 autoScrollSub;
    private ij4 cardContext;
    private n1s cardData;
    private LoopViewPagerIndicator indicator;
    private LoopViewPager viewPager;

    public LiveCampaignBannerCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m67418e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    private boolean m67419f() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || uep0.m193334u(this.viewPager, true) < 0.1f) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    private void m67420g() {
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.viewPager.m68804l0((this.viewPager.getIndicatorPosition() + 1) % this.viewPager.getIndicatorCount());
    }

    /* JADX INFO: renamed from: h */
    private boolean m67421h() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || uep0.m193334u(this.viewPager, true) < 0.5f) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Boolean m67422k(Long l2) {
        return Boolean.valueOf(m67419f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m67423l(Long l2) {
        m67420g();
    }

    /* JADX INFO: renamed from: o */
    private void m67424o() {
        if (this.cardData.localAutoScroll) {
            mkd0.m154992z(this.autoScrollSub);
            if (this.viewPager != null) {
                m67425p();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m67425p() {
        mcr mcrVar = this.cardContext.f113496lp;
        if (mcrVar == null) {
            return;
        }
        this.autoScrollSub = mcrVar.duringCreated(C22306c.interval(6L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.i1s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f110493a.m67422k((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.j1s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115837a.m67423l((Long) obj);
            }
        }, new e30() { // from class: l.k1s
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveCampaignBannerCardView.m67418e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    private void m67426q() {
        int indicatorPosition;
        n1s n1sVar = this.cardData;
        if (n1sVar == null || n1sVar.m157512a() == null || (indicatorPosition = this.viewPager.getIndicatorPosition() + 1) < 1 || indicatorPosition > this.cardData.m157512a().size()) {
            return;
        }
        LiveCardTracker.trackMv(this.cardData.m157512a().get(this.viewPager.getIndicatorPosition()).m157514b());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m67427i(n1s.C18603a c18603a) {
        xps.m210534a(getContext(), c18603a.m157513a());
        LiveCardTracker.trackMc(c18603a.m157514b());
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12480c
    /* JADX INFO: renamed from: j */
    public void mo67403j(int i) {
        if (m67421h()) {
            m67426q();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m67428m() {
        mkd0.m154992z(this.autoScrollSub);
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager != null) {
            loopViewPager.m4175P(this);
            this.viewPager.setOnPageChangeListener(null);
            this.viewPager.setAdapter(null);
            this.viewPager = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m67429n(ij4 ij4Var, n1s n1sVar) {
        this.cardData = n1sVar;
        LoopViewPager loopViewPager = (LoopViewPager) findViewById(d5c0.f84515u0);
        this.viewPager = loopViewPager;
        loopViewPager.setPageMargin(t100.m186890d(10.0f));
        this.indicator = (LoopViewPagerIndicator) findViewById(d5c0.f84444T);
        this.cardContext = ij4Var;
        C11427a c11427a = new C11427a(n1sVar);
        c11427a.m67435v(new C11427a.a() { // from class: l.l1s
            @Override // com.p046p1.mobile.putong.live.base.arch.card.cardmodel.campaignBanner.C11427a.a
            /* JADX INFO: renamed from: a */
            public final void mo67436a(n1s.C18603a c18603a) {
                this.f125680a.m67427i(c18603a);
            }
        });
        this.viewPager.setAdapter(c11427a);
        this.viewPager.setPageShowListener(this);
        this.viewPager.m4185d(this);
        m67426q();
        int size = n1sVar.m157512a().size();
        LoopViewPagerIndicator loopViewPagerIndicator = this.indicator;
        if (size < 2) {
            xdl0.m208344M(loopViewPagerIndicator, false);
            return;
        }
        xdl0.m208345M0(loopViewPagerIndicator, true);
        this.indicator.m68812e(this.viewPager, 0);
        m67424o();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m67424o();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
    }

    public LiveCampaignBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveCampaignBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
