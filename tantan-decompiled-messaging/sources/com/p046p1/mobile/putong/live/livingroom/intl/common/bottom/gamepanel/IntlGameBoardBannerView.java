package com.p046p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Banners;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.view.LoopViewPager;
import com.p046p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import com.p046p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardBannerView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.e30;
import p149l.ffw;
import p149l.g5c0;
import p149l.hgn;
import p149l.jo0;
import p149l.kgn;
import p149l.mkd0;
import p149l.uep0;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ1\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardBannerView;", "Lcom/p1/mobile/putong/live/base/view/RatioLayout;", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager$c;", "Landroidx/viewpager/widget/ViewPager$j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", RXScreenCaptureService.KEY_INDEX, "()V", "k", "onFinishInflate", "", "Ll/hgn;", "rawBanners", "Lkotlin/Function1;", "onBannerClick", "f", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", BLiveStormDanmakuGiftResourceType.f44444l, "state", "onPageScrollStateChanged", "(I)V", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "onPageSelected", "dataPosition", "j", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager;", "pager", "h", "(Lcom/p1/mobile/putong/live/base/view/LoopViewPager;)V", "", "g", "(Lcom/p1/mobile/putong/live/base/view/LoopViewPager;)Z", "a", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager;", "viewPager", "Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;", "b", "Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;", "indicator", "Ll/c4g0;", "c", "Ll/c4g0;", "autoScrollSub", Constants.INAPP_DATA_TAG, "Ljava/util/List;", Banners.TYPE, "e", "Z", "enableAutoScroll", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlGameBoardBannerView extends RatioLayout implements LoopViewPager.InterfaceC12480c, ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public LoopViewPager viewPager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public LoopViewPagerIndicator indicator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public c4g0 autoScrollSub;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<? extends hgn> banners;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean enableAutoScroll;

    public /* synthetic */ IntlGameBoardBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m75224b(IntlGameBoardBannerView intlGameBoardBannerView, LoopViewPager loopViewPager, Long l2) {
        return Boolean.valueOf(intlGameBoardBannerView.m75231g(loopViewPager));
    }

    /* JADX INFO: renamed from: c */
    public static void m75225c(IntlGameBoardBannerView intlGameBoardBannerView, LoopViewPager loopViewPager, Long l2) {
        intlGameBoardBannerView.m75232h(loopViewPager);
    }

    /* JADX INFO: renamed from: d */
    public static void m75226d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m75227e(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    private final void m75228i() {
        if (this.enableAutoScroll) {
            m75229k();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m75229k() {
        final LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null) {
            return;
        }
        mkd0.m154992z(this.autoScrollSub);
        C22306c<Long> c22306cObserveOn = C22306c.interval(8L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a());
        final Function1 function1 = new Function1() { // from class: l.lgn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlGameBoardBannerView.m75224b(this.f128005a, loopViewPager, (Long) obj);
            }
        };
        this.autoScrollSub = c22306cObserveOn.filter(new w9j() { // from class: l.mgn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlGameBoardBannerView.m75227e(function1, obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.ngn
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlGameBoardBannerView.m75225c(this.f138888a, loopViewPager, (Long) obj);
            }
        }, new e30() { // from class: l.ogn
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlGameBoardBannerView.m75226d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m75230f(@Nullable List<? extends hgn> rawBanners, @NotNull Function1<? super hgn, Unit> onBannerClick) {
        onBannerClick.getClass();
        if (rawBanners == null) {
            rawBanners = CollectionsKt.emptyList();
        }
        this.banners = rawBanners;
        if (rawBanners.isEmpty()) {
            m75233l();
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208345M0(this, true);
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null) {
            return;
        }
        loopViewPager.setAdapter(new kgn(this.banners, onBannerClick));
        loopViewPager.setPageShowListener(this);
        loopViewPager.m4185d(this);
        boolean z = this.banners.size() >= 2;
        this.enableAutoScroll = z;
        LoopViewPagerIndicator loopViewPagerIndicator = this.indicator;
        if (!z) {
            xdl0.m208344M(loopViewPagerIndicator, false);
            return;
        }
        xdl0.m208345M0(loopViewPagerIndicator, true);
        LoopViewPagerIndicator loopViewPagerIndicator2 = this.indicator;
        if (loopViewPagerIndicator2 != null) {
            loopViewPagerIndicator2.m68812e(loopViewPager, 0);
        }
        m75228i();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m75231g(LoopViewPager pager) {
        return pager.getAdapter() != null && uep0.m193334u(pager, true) >= 0.1f;
    }

    /* JADX INFO: renamed from: h */
    public final void m75232h(LoopViewPager pager) {
        if (pager.getAdapter() == null) {
            return;
        }
        int indicatorPosition = pager.getIndicatorPosition();
        int indicatorCount = pager.getIndicatorCount();
        if (indicatorCount <= 0) {
            return;
        }
        pager.m68804l0((indicatorPosition + 1) % indicatorCount);
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12480c
    /* JADX INFO: renamed from: j */
    public void mo67403j(int dataPosition) {
    }

    /* JADX INFO: renamed from: l */
    public final void m75233l() {
        mkd0.m154992z(this.autoScrollSub);
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager != null) {
            loopViewPager.m4175P(this);
            loopViewPager.setOnPageChangeListener(null);
            loopViewPager.setPageShowListener(null);
            loopViewPager.setAdapter(null);
        }
        this.banners = CollectionsKt.emptyList();
        this.enableAutoScroll = false;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.viewPager = (LoopViewPager) findViewById(g5c0.f100692G);
        this.indicator = (LoopViewPagerIndicator) findViewById(g5c0.f100683F);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int state) {
        if (state == 1) {
            m75228i();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int position) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlGameBoardBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlGameBoardBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.banners = CollectionsKt.emptyList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlGameBoardBannerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
