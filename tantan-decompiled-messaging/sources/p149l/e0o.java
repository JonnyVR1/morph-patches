package p149l;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.live.base.view.LoopViewPager;
import com.p046p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12546a;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareBannerView;
import com.p046p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class e0o extends d6o<IntlLiveSquareBannerView> implements ViewPager.InterfaceC0716j, LoopViewPager.InterfaceC12480c, qlf0, m3m {

    /* JADX INFO: renamed from: b */
    @NonNull
    public LiveSquareBannerBean f88656b;

    /* JADX INFO: renamed from: c */
    public C12546a.a f88657c;

    /* JADX INFO: renamed from: d */
    public LiveVPagerBaseFrag f88658d;

    /* JADX INFO: renamed from: e */
    public c4g0 f88659e;

    /* JADX INFO: renamed from: f */
    public LoopViewPager f88660f;

    /* JADX INFO: renamed from: g */
    public int f88661g;

    /* JADX INFO: renamed from: h */
    public int f88662h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f88663i = true;

    public e0o(int i, @NonNull LiveSquareBannerBean liveSquareBannerBean, LiveVPagerBaseFrag liveVPagerBaseFrag) {
        this.f88656b = liveSquareBannerBean;
        this.f88658d = liveVPagerBaseFrag;
        this.f88661g = i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: F */
    public boolean mo101239F(n80 n80Var) {
        LoopViewPager loopViewPager = this.f88660f;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return true;
        }
        m114308W();
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public void m114302Q(final LiveBannerTabBean liveBannerTabBean) {
        zvf0.m220399u("e_live_banner", mo109667p(), j760.m140076a("banner_id", this.f88656b.f46221id), j760.m140076a("banner_type", liveBannerTabBean.bannerType), j760.m140076a(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f88662h)), j760.m140076a("sub_index", Integer.valueOf(vwb.m200293G(this.f88656b.tabs, new w9j() { // from class: l.d0o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveBannerTabBean) obj).equals(liveBannerTabBean));
            }
        }) + 1)));
    }

    /* JADX INFO: renamed from: R */
    public final boolean m114303R() {
        LoopViewPager loopViewPager = this.f88660f;
        return (loopViewPager == null || loopViewPager.getAdapter() == null || uep0.m193334u(this.f88660f, true) < 0.5f) ? false : true;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m114304S(LiveBannerTabBean liveBannerTabBean) {
        m114302Q(liveBannerTabBean);
        C12546a.a aVar = this.f88657c;
        if (aVar != null) {
            aVar.mo70071t3(liveBannerTabBean);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Boolean m114305T(Long l2) {
        LiveVPagerBaseFrag liveVPagerBaseFrag = this.f88658d;
        return liveVPagerBaseFrag instanceof LiveSquareBaseFrag ? Boolean.valueOf(liveVPagerBaseFrag.m70821Q4()) : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m114306U(Long l2) {
        LoopViewPager loopViewPager = this.f88660f;
        if (loopViewPager == null || loopViewPager.getAdapter() == null) {
            return;
        }
        this.f88660f.m68804l0((this.f88660f.getIndicatorPosition() + 1) % this.f88660f.getIndicatorCount());
    }

    /* JADX INFO: renamed from: W */
    public final void m114308W() {
        int indicatorPosition = this.f88660f.getIndicatorPosition() + 1;
        if (indicatorPosition < 1 || indicatorPosition > this.f88656b.tabs.size()) {
            return;
        }
        zvf0.m220368A("e_live_banner", mo109667p(), j760.m140076a("banner_id", this.f88656b.f46221id), j760.m140076a("banner_type", this.f88656b.tabs.get(this.f88660f.getIndicatorPosition()).bannerType), j760.m140076a(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f88662h)), j760.m140076a("sub_index", Integer.valueOf(indicatorPosition)));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo70566u(IntlLiveSquareBannerView intlLiveSquareBannerView) {
        super.mo70566u(intlLiveSquareBannerView);
        C12546a c12546a = new C12546a(this.f88656b);
        c12546a.m70179w(new C12546a.a() { // from class: l.zzn
            @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12546a.a
            /* JADX INFO: renamed from: t3 */
            public final void mo70071t3(LiveBannerTabBean liveBannerTabBean) {
                this.f205810a.m114304S(liveBannerTabBean);
            }
        });
        LoopViewPager loopViewPager = intlLiveSquareBannerView.f45822a;
        this.f88660f = loopViewPager;
        loopViewPager.setAdapter(c12546a);
        this.f88660f.setPageShowListener(this);
        this.f88660f.m4185d(this);
        int size = this.f88656b.tabs.size();
        LoopViewPagerIndicator loopViewPagerIndicator = intlLiveSquareBannerView.f45823b;
        if (size < 2) {
            xdl0.m208344M(loopViewPagerIndicator, false);
            return;
        }
        xdl0.m208345M0(loopViewPagerIndicator, true);
        intlLiveSquareBannerView.f45823b.m68812e(this.f88660f, 0);
        m114311Z();
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo71000w(IntlLiveSquareBannerView intlLiveSquareBannerView) {
        super.mo71000w(intlLiveSquareBannerView);
        mkd0.m154992z(this.f88659e);
        LoopViewPager loopViewPager = this.f88660f;
        if (loopViewPager != null) {
            loopViewPager.m4175P(this);
            this.f88660f.setOnPageChangeListener(null);
            this.f88660f.setAdapter(null);
            this.f88660f = null;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m114311Z() {
        if (this.f88663i) {
            mkd0.m154992z(this.f88659e);
            if (this.f88660f != null) {
                m114314c0();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m114312a0(C12546a.a aVar) {
        this.f88657c = aVar;
    }

    @Override // p149l.m3m
    /* JADX INFO: renamed from: b */
    public void mo70351b(RecyclerView.AbstractC0566d0 abstractC0566d0, StaggeredGridLayoutManager.C0593c c0593c) {
        c0593c.m3576i(true);
    }

    /* JADX INFO: renamed from: b0 */
    public void m114313b0(int i) {
        this.f88662h = i;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m114314c0() {
        this.f88659e = this.f88658d.duringCreated(C22306c.interval(8L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.a0o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67058a.m114305T((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.b0o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72451a.m114306U((Long) obj);
            }
        }, new e30() { // from class: l.c0o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78161a.m114307V((Throwable) obj);
            }
        }));
    }

    @Override // p149l.d1q, p149l.qlf0
    public int getOrder() {
        return this.f88656b.rowIndex;
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12480c
    /* JADX INFO: renamed from: j */
    public void mo67403j(int i) {
        if (m114303R()) {
            m114308W();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162706T;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
        if (i == 1) {
            m114311Z();
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return this.f88661g;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m114307V(Throwable th) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
