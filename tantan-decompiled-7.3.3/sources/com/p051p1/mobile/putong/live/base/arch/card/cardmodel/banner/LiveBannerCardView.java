package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.banner.LiveBannerCardView;
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
import p153l.psd0;
import p153l.qcj;
import p153l.xwr;
import p153l.y20;
import p153l.ynp0;
import p153l.yrs;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBannerCardView extends RatioLayout implements LoopViewPager.InterfaceC12643c, ViewPager.InterfaceC0718j {
    private kcg0 autoScrollSub;
    private hk4 cardContext;
    private xwr cardData;
    private LoopViewPagerIndicator indicator;
    private LoopViewPager viewPager;

    public LiveBannerCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m68576d(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    private boolean m68578h() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || ynp0.m216944u(this.viewPager, true) < 0.5f) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ Boolean m68579k(Long l2) {
        return Boolean.valueOf(m68583f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m68580l(Long l2) {
        m68584g();
    }

    /* JADX INFO: renamed from: o */
    private void m68581o() {
        if (this.cardData.localAutoScroll) {
            psd0.m173633z(this.autoScrollSub);
            if (this.viewPager != null) {
                m68582p();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m68582p() {
        ner nerVar = this.cardContext.f110375lp;
        if (nerVar == null) {
            return;
        }
        this.autoScrollSub = nerVar.duringCreated(C22421c.interval(8L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.ywr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f201856a.m68579k((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.zwr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206369a.m68580l((Long) obj);
            }
        }, new y20() { // from class: l.axr
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveBannerCardView.m68576d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m68583f() {
        LoopViewPager loopViewPager = this.viewPager;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || ynp0.m216944u(this.viewPager, true) < 0.1f) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final void m68584g() {
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.viewPager.m69987l0((this.viewPager.getIndicatorPosition() + 1) % this.viewPager.getIndicatorCount());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m68585i(xwr.C21468a c21468a) {
        yrs.m217233a(getContext(), c21468a.m213427a());
        LiveCardTracker.trackMc(c21468a.m213429c());
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12643c
    /* JADX INFO: renamed from: j */
    public void mo68586j(int i) {
        if (m68578h()) {
            m68589q();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m68587m() {
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
    public void m68588n(hk4 hk4Var, xwr xwrVar) {
        this.cardData = xwrVar;
        this.viewPager = (LoopViewPager) findViewById(jdc0.f120233u0);
        this.indicator = (LoopViewPagerIndicator) findViewById(jdc0.f120162T);
        this.cardContext = hk4Var;
        C11589a c11589a = new C11589a(xwrVar);
        c11589a.m68596v(new C11589a.a() { // from class: l.bxr
            @Override // com.p051p1.mobile.putong.live.base.arch.card.cardmodel.banner.C11589a.a
            /* JADX INFO: renamed from: a */
            public final void mo68597a(xwr.C21468a c21468a) {
                this.f78905a.m68585i(c21468a);
            }
        });
        this.viewPager.setAdapter(c11589a);
        this.viewPager.setPageShowListener(this);
        this.viewPager.m4187d(this);
        m68589q();
        int size = xwrVar.m213423b().size();
        LoopViewPagerIndicator loopViewPagerIndicator = this.indicator;
        if (size < 2) {
            bnl0.m105524M(loopViewPagerIndicator, false);
            return;
        }
        bnl0.m105525M0(loopViewPagerIndicator, true);
        this.indicator.m69995e(this.viewPager, 0);
        m68581o();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m68581o();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
    }

    /* JADX INFO: renamed from: q */
    public final void m68589q() {
        int indicatorPosition;
        xwr xwrVar = this.cardData;
        if (xwrVar == null || xwrVar.m213423b() == null || (indicatorPosition = this.viewPager.getIndicatorPosition() + 1) < 1 || indicatorPosition > this.cardData.m213423b().size()) {
            return;
        }
        LiveCardTracker.trackMv(this.cardData.m213423b().get(this.viewPager.getIndicatorPosition()).m213429c());
    }

    public LiveBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveBannerCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
