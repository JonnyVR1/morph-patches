package com.p051p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Banners;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.view.LoopViewPager;
import com.p051p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import com.p051p1.mobile.putong.live.livingroom.intl.common.bottom.gamepanel.IntlGameBoardBannerView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p137rx.C22421c;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.hin;
import p153l.kcg0;
import p153l.kin;
import p153l.mdc0;
import p153l.psd0;
import p153l.qcj;
import p153l.y20;
import p153l.ynp0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ1\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u001bJ\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/intl/common/bottom/gamepanel/IntlGameBoardBannerView;", "Lcom/p1/mobile/putong/live/base/view/RatioLayout;", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager$c;", "Landroidx/viewpager/widget/ViewPager$j;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", RXScreenCaptureService.KEY_INDEX, "()V", "k", "onFinishInflate", "", "Ll/hin;", "rawBanners", "Lkotlin/Function1;", "onBannerClick", "f", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", BLiveStormDanmakuGiftResourceType.f45292l, "state", "onPageScrollStateChanged", "(I)V", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "(IFI)V", "onPageSelected", "dataPosition", "j", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager;", "pager", "h", "(Lcom/p1/mobile/putong/live/base/view/LoopViewPager;)V", "", "g", "(Lcom/p1/mobile/putong/live/base/view/LoopViewPager;)Z", "a", "Lcom/p1/mobile/putong/live/base/view/LoopViewPager;", "viewPager", "Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;", "b", "Lcom/p1/mobile/putong/live/base/view/LoopViewPagerIndicator;", "indicator", "Ll/kcg0;", "c", "Ll/kcg0;", "autoScrollSub", Constants.INAPP_DATA_TAG, "Ljava/util/List;", Banners.TYPE, "e", "Z", "enableAutoScroll", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlGameBoardBannerView extends RatioLayout implements LoopViewPager.InterfaceC12643c, ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public LoopViewPager viewPager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public LoopViewPagerIndicator indicator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public kcg0 autoScrollSub;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<? extends hin> banners;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean enableAutoScroll;

    public /* synthetic */ IntlGameBoardBannerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m76407b(IntlGameBoardBannerView intlGameBoardBannerView, LoopViewPager loopViewPager, Long l2) {
        return Boolean.valueOf(intlGameBoardBannerView.m76414g(loopViewPager));
    }

    /* JADX INFO: renamed from: c */
    public static void m76408c(IntlGameBoardBannerView intlGameBoardBannerView, LoopViewPager loopViewPager, Long l2) {
        intlGameBoardBannerView.m76415h(loopViewPager);
    }

    /* JADX INFO: renamed from: d */
    public static void m76409d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m76410e(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    private final void m76411i() {
        if (this.enableAutoScroll) {
            m76412k();
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m76412k() {
        final LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null) {
            return;
        }
        psd0.m173633z(this.autoScrollSub);
        C22421c<Long> c22421cObserveOn = C22421c.interval(8L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a());
        final Function1 function1 = new Function1() { // from class: l.lin
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlGameBoardBannerView.m76407b(this.f132242a, loopViewPager, (Long) obj);
            }
        };
        this.autoScrollSub = c22421cObserveOn.filter(new qcj() { // from class: l.min
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlGameBoardBannerView.m76410e(function1, obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.nin
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlGameBoardBannerView.m76408c(this.f142141a, loopViewPager, (Long) obj);
            }
        }, new y20() { // from class: l.oin
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlGameBoardBannerView.m76409d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public final void m76413f(@Nullable List<? extends hin> rawBanners, @NotNull Function1<? super hin, Unit> onBannerClick) {
        onBannerClick.getClass();
        if (rawBanners == null) {
            rawBanners = CollectionsKt.emptyList();
        }
        this.banners = rawBanners;
        if (rawBanners.isEmpty()) {
            m76416l();
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105525M0(this, true);
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager == null) {
            return;
        }
        loopViewPager.setAdapter(new kin(this.banners, onBannerClick));
        loopViewPager.setPageShowListener(this);
        loopViewPager.m4187d(this);
        boolean z = this.banners.size() >= 2;
        this.enableAutoScroll = z;
        LoopViewPagerIndicator loopViewPagerIndicator = this.indicator;
        if (!z) {
            bnl0.m105524M(loopViewPagerIndicator, false);
            return;
        }
        bnl0.m105525M0(loopViewPagerIndicator, true);
        LoopViewPagerIndicator loopViewPagerIndicator2 = this.indicator;
        if (loopViewPagerIndicator2 != null) {
            loopViewPagerIndicator2.m69995e(loopViewPager, 0);
        }
        m76411i();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m76414g(LoopViewPager pager) {
        return pager.getAdapter() != null && ynp0.m216944u(pager, true) >= 0.1f;
    }

    /* JADX INFO: renamed from: h */
    public final void m76415h(LoopViewPager pager) {
        if (pager.getAdapter() == null) {
            return;
        }
        int indicatorPosition = pager.getIndicatorPosition();
        int indicatorCount = pager.getIndicatorCount();
        if (indicatorCount <= 0) {
            return;
        }
        pager.m69987l0((indicatorPosition + 1) % indicatorCount);
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoopViewPager.InterfaceC12643c
    /* JADX INFO: renamed from: j */
    public void mo68586j(int dataPosition) {
    }

    /* JADX INFO: renamed from: l */
    public final void m76416l() {
        psd0.m173633z(this.autoScrollSub);
        LoopViewPager loopViewPager = this.viewPager;
        if (loopViewPager != null) {
            loopViewPager.m4177P(this);
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
        this.viewPager = (LoopViewPager) findViewById(mdc0.f135937G);
        this.indicator = (LoopViewPagerIndicator) findViewById(mdc0.f135928F);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int state) {
        if (state == 1) {
            m76411i();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
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
