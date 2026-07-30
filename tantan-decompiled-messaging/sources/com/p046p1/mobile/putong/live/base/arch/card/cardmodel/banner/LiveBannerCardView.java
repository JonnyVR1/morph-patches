package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.banner.LiveBannerCardView;
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
import p149l.uep0;
import p149l.w9j;
import p149l.wur;
import p149l.xdl0;
import p149l.xps;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBannerCardView extends RatioLayout implements LoopViewPager.InterfaceC12480c, ViewPager.InterfaceC0716j {
    private c4g0 autoScrollSub;
    private ij4 cardContext;
    private wur cardData;
    private LoopViewPagerIndicator indicator;
    private LoopViewPager viewPager;

    public LiveBannerCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m67393d(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    private boolean m67395h() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || uep0.m193334u(this.viewPager, true) < 0.5f) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Boolean m67396k(Long l2) {
        return Boolean.valueOf(m67400f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m67397l(Long l2) {
        m67401g();
    }

    /* JADX INFO: renamed from: o */
    private void m67398o() {
        if (this.cardData.localAutoScroll) {
            mkd0.m154992z(this.autoScrollSub);
            if (this.viewPager != null) {
                m67399p();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m67399p() {
        mcr mcrVar = this.cardContext.f113496lp;
        if (mcrVar == null) {
            return;
        }
        this.autoScrollSub = mcrVar.duringCreated(C22306c.interval(8L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.xur
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194544a.m67396k((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.yur
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200118a.m67397l((Long) obj);
            }
        }, new e30() { // from class: l.zur
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveBannerCardView.m67393d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m67400f() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || uep0.m193334u(this.viewPager, true) < 0.1f) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final void m67401g() {
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.viewPager.m68804l0((this.viewPager.getIndicatorPosition() + 1) % this.viewPager.getIndicatorCount());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m67402i(wur.C20965a c20965a) {
        xps.m210534a(getContext(), c20965a.m205659a());
        LiveCardTracker.trackMc(c20965a.m205661c());
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12480c
    /* JADX INFO: renamed from: j */
    public void mo67403j(int i) {
        if (m67395h()) {
            m67406q();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m67404m() {
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
    public void m67405n(ij4 ij4Var, wur wurVar) {
        this.cardData = wurVar;
        this.viewPager = (LoopViewPager) findViewById(d5c0.f84515u0);
        this.indicator = (LoopViewPagerIndicator) findViewById(d5c0.f84444T);
        this.cardContext = ij4Var;
        C11426a c11426a = new C11426a(wurVar);
        c11426a.m67413v(new C11426a.a() { // from class: l.avr
            @Override // com.p046p1.mobile.putong.live.base.arch.card.cardmodel.banner.C11426a.a
            /* JADX INFO: renamed from: a */
            public final void mo67414a(wur.C20965a c20965a) {
                this.f71963a.m67402i(c20965a);
            }
        });
        this.viewPager.setAdapter(c11426a);
        this.viewPager.setPageShowListener(this);
        this.viewPager.m4185d(this);
        m67406q();
        int size = wurVar.m205655b().size();
        LoopViewPagerIndicator loopViewPagerIndicator = this.indicator;
        if (size < 2) {
            xdl0.m208344M(loopViewPagerIndicator, false);
            return;
        }
        xdl0.m208345M0(loopViewPagerIndicator, true);
        this.indicator.m68812e(this.viewPager, 0);
        m67398o();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m67398o();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
    }

    /* JADX INFO: renamed from: q */
    public final void m67406q() {
        int indicatorPosition;
        wur wurVar = this.cardData;
        if (wurVar == null || wurVar.m205655b() == null || (indicatorPosition = this.viewPager.getIndicatorPosition() + 1) < 1 || indicatorPosition > this.cardData.m205655b().size()) {
            return;
        }
        LiveCardTracker.trackMv(this.cardData.m205655b().get(this.viewPager.getIndicatorPosition()).m205661c());
    }

    public LiveBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
