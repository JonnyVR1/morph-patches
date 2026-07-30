package p153l;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.live.base.view.LoopViewPager;
import com.p051p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12709a;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareBannerView;
import com.p051p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class e2o extends d8o<IntlLiveSquareBannerView> implements ViewPager.InterfaceC0718j, LoopViewPager.InterfaceC12643c, ztf0, d6m {

    /* JADX INFO: renamed from: b */
    @NonNull
    public LiveSquareBannerBean f91802b;

    /* JADX INFO: renamed from: c */
    public C12709a.a f91803c;

    /* JADX INFO: renamed from: d */
    public LiveVPagerBaseFrag f91804d;

    /* JADX INFO: renamed from: e */
    public kcg0 f91805e;

    /* JADX INFO: renamed from: f */
    public LoopViewPager f91806f;

    /* JADX INFO: renamed from: g */
    public int f91807g;

    /* JADX INFO: renamed from: h */
    public int f91808h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f91809i = true;

    public e2o(int i, @NonNull LiveSquareBannerBean liveSquareBannerBean, LiveVPagerBaseFrag liveVPagerBaseFrag) {
        this.f91802b = liveSquareBannerBean;
        this.f91804d = liveVPagerBaseFrag;
        this.f91807g = i;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: F */
    public boolean mo96605F(j80 j80Var) {
        LoopViewPager loopViewPager = this.f91806f;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return true;
        }
        m119124W();
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public void m119118Q(final LiveBannerTabBean liveBannerTabBean) {
        i4g0.m138523u("e_live_banner", mo113885p(), pf60.m172085a("banner_id", this.f91802b.f47069id), pf60.m172085a("banner_type", liveBannerTabBean.bannerType), pf60.m172085a(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f91808h)), pf60.m172085a("sub_index", Integer.valueOf(jyb.m147476G(this.f91802b.tabs, new qcj() { // from class: l.d2o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveBannerTabBean) obj).equals(liveBannerTabBean));
            }
        }) + 1)));
    }

    /* JADX INFO: renamed from: R */
    public final boolean m119119R() {
        LoopViewPager loopViewPager = this.f91806f;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || ynp0.m216944u(this.f91806f, true) < 0.5f) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m119120S(LiveBannerTabBean liveBannerTabBean) {
        m119118Q(liveBannerTabBean);
        C12709a.a aVar = this.f91803c;
        if (aVar != null) {
            aVar.mo71254t3(liveBannerTabBean);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Boolean m119121T(Long l2) {
        LiveVPagerBaseFrag liveVPagerBaseFrag = this.f91804d;
        return liveVPagerBaseFrag instanceof LiveSquareBaseFrag ? Boolean.valueOf(liveVPagerBaseFrag.m72004Q4()) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m119122U(Long l2) {
        LoopViewPager loopViewPager = this.f91806f;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.f91806f.m69987l0((this.f91806f.getIndicatorPosition() + 1) % this.f91806f.getIndicatorCount());
    }

    /* JADX INFO: renamed from: W */
    public final void m119124W() {
        int indicatorPosition = this.f91806f.getIndicatorPosition() + 1;
        if (indicatorPosition < 1 || indicatorPosition > this.f91802b.tabs.size()) {
            return;
        }
        i4g0.m138492A("e_live_banner", mo113885p(), pf60.m172085a("banner_id", this.f91802b.f47069id), pf60.m172085a("banner_type", this.f91802b.tabs.get(this.f91806f.getIndicatorPosition()).bannerType), pf60.m172085a(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f91808h)), pf60.m172085a("sub_index", Integer.valueOf(indicatorPosition)));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo71749u(IntlLiveSquareBannerView intlLiveSquareBannerView) {
        super.mo71749u(intlLiveSquareBannerView);
        C12709a c12709a = new C12709a(this.f91802b);
        c12709a.m71362w(new C12709a.a() { // from class: l.z1o
            @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12709a.a
            /* JADX INFO: renamed from: t3 */
            public final void mo71254t3(LiveBannerTabBean liveBannerTabBean) {
                this.f202579a.m119120S(liveBannerTabBean);
            }
        });
        LoopViewPager loopViewPager = intlLiveSquareBannerView.f46670a;
        this.f91806f = loopViewPager;
        loopViewPager.setAdapter(c12709a);
        this.f91806f.setPageShowListener(this);
        this.f91806f.m4187d(this);
        int size = this.f91802b.tabs.size();
        LoopViewPagerIndicator loopViewPagerIndicator = intlLiveSquareBannerView.f46671b;
        if (size < 2) {
            bnl0.m105524M(loopViewPagerIndicator, false);
            return;
        }
        bnl0.m105525M0(loopViewPagerIndicator, true);
        intlLiveSquareBannerView.f46671b.m69995e(this.f91806f, 0);
        m119127Z();
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo72183w(IntlLiveSquareBannerView intlLiveSquareBannerView) {
        super.mo72183w(intlLiveSquareBannerView);
        psd0.m173633z(this.f91805e);
        LoopViewPager loopViewPager = this.f91806f;
        if (loopViewPager != null) {
            loopViewPager.m4177P(this);
            this.f91806f.setOnPageChangeListener(null);
            this.f91806f.setAdapter(null);
            this.f91806f = null;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m119127Z() {
        if (this.f91809i) {
            psd0.m173633z(this.f91805e);
            if (this.f91806f != null) {
                m119130c0();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m119128a0(C12709a.a aVar) {
        this.f91803c = aVar;
    }

    @Override // p153l.d6m
    /* JADX INFO: renamed from: b */
    public void mo71534b(RecyclerView.AbstractC0569e0 abstractC0569e0, StaggeredGridLayoutManager.C0595c c0595c) {
        c0595c.m3577i(true);
    }

    /* JADX INFO: renamed from: b0 */
    public void m119129b0(int i) {
        this.f91808h = i;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m119130c0() {
        this.f91805e = this.f91804d.duringCreated(C22421c.interval(8L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.a2o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f68014a.m119121T((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.b2o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74642a.m119122U((Long) obj);
            }
        }, new y20() { // from class: l.c2o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79506a.m119123V((Throwable) obj);
            }
        }));
    }

    @Override // p153l.d3q, p153l.ztf0
    public int getOrder() {
        return this.f91802b.rowIndex;
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12643c
    /* JADX INFO: renamed from: j */
    public void mo68586j(int i) {
        if (m119119R()) {
            m119124W();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193820T;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m119127Z();
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return this.f91807g;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m119123V(Throwable th) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
