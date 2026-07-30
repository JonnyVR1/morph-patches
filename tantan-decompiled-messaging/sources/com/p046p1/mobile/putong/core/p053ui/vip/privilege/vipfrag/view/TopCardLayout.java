package com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VPagerCircleIndicator;
import p147v.VSegmentBar;
import p149l.ahl0;
import p149l.bhl0;
import p149l.eb3;
import p149l.g6a;
import p149l.lti0;
import p149l.mti0;
import p149l.o7r;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 L2\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010'\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010K\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006M"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Lv/VSegmentBar;", "_tab_layout", "", "g", "(Lcom/p1/mobile/putong/app/PutongFrag;Lv/VSegmentBar;)V", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Lkotlin/collections/ArrayList;", "purchaseTypes", "f", "(Ljava/util/ArrayList;)V", "position", "h", "(I)V", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/BounceBackViewPager;", "Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/BounceBackViewPager;", "get_viewpager", "()Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/BounceBackViewPager;", "set_viewpager", "(Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/BounceBackViewPager;)V", "_viewpager", "Lv/VPagerCircleIndicator;", "b", "Lv/VPagerCircleIndicator;", "get_indicator", "()Lv/VPagerCircleIndicator;", "set_indicator", "(Lv/VPagerCircleIndicator;)V", "_indicator", "Ll/eb3;", "c", "Ll/eb3;", "getBottomContentInterface", "()Ll/eb3;", "setBottomContentInterface", "(Ll/eb3;)V", "bottomContentInterface", "Ll/lti0;", Constants.INAPP_DATA_TAG, "Ll/lti0;", "getTopcardAdapter", "()Ll/lti0;", "setTopcardAdapter", "(Ll/lti0;)V", "topcardAdapter", "e", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "setFrag", "(Lcom/p1/mobile/putong/app/PutongFrag;)V", "Lv/VSegmentBar;", "getTabLayout", "()Lv/VSegmentBar;", "setTabLayout", "(Lv/VSegmentBar;)V", "tabLayout", "Companion", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class TopCardLayout extends LinearLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final int f37829g = t100.f167264m;

    /* JADX INFO: renamed from: h */
    public static final int f37830h;

    /* JADX INFO: renamed from: i */
    public static final int f37831i;

    /* JADX INFO: renamed from: j */
    public static final int f37832j;

    /* JADX INFO: renamed from: k */
    public static final int f37833k;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public BounceBackViewPager _viewpager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VPagerCircleIndicator _indicator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public eb3 bottomContentInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public lti0 topcardAdapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PutongFrag frag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VSegmentBar tabLayout;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.view.TopCardLayout$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b¨\u0006\r"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout$a;", "", "<init>", "()V", "", "itemSideMargin", "I", "c", "()I", "itemMargin", "a", "itemNewPadding", "b", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m57451a() {
            return TopCardLayout.f37830h;
        }

        /* JADX INFO: renamed from: b */
        public final int m57452b() {
            return TopCardLayout.f37833k;
        }

        /* JADX INFO: renamed from: c */
        public final int m57453c() {
            return TopCardLayout.f37829g;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.view.TopCardLayout$b */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m87232d2 = {"com/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/TopCardLayout$b", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C9013b implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VSegmentBar f37841b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BounceBackViewPager f37842c;

        public C9013b(VSegmentBar vSegmentBar, BounceBackViewPager bounceBackViewPager) {
            this.f37841b = vSegmentBar;
            this.f37842c = bounceBackViewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int state) {
            if (state == 0) {
                VSegmentBar vSegmentBar = this.f37841b;
                vSegmentBar.selectTab(vSegmentBar.getTabAt(this.f37842c.getCurrentItem()));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int position) {
            eb3 bottomContentInterface = TopCardLayout.this.getBottomContentInterface();
            if (bottomContentInterface != null) {
                bottomContentInterface.mo106968a(position);
            }
            TopCardLayout.this.m57450h(position);
        }
    }

    static {
        int i = t100.f167259h;
        f37830h = i;
        int i2 = t100.f167271t;
        f37831i = i2;
        f37832j = (i2 + i) / 2;
        f37833k = t100.m186890d(19.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopCardLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(context);
        layoutInflaterM163037a.getClass();
        m57447a(layoutInflaterM163037a, this);
        setOrientation(1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m57447a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM156233b = mti0.m156233b(this, inflater, parent);
        viewM156233b.getClass();
        return viewM156233b;
    }

    /* JADX INFO: renamed from: f */
    public final void m57448f(@NotNull ArrayList<PurchaseType> purchaseTypes) {
        TabLayout.TabView tabView;
        purchaseTypes.getClass();
        getTopcardAdapter().m151691s(purchaseTypes);
        VSegmentBar tabLayout = getTabLayout();
        if (tabLayout == null || tabLayout.getTabMode() != 0) {
            return;
        }
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i);
            if (tabAt != null && (tabView = tabAt.view) != null) {
                xdl0.m208327D0(bhl0.f75637b, tabView);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57449g(@NotNull PutongFrag frag, @NotNull VSegmentBar _tab_layout) {
        frag.getClass();
        _tab_layout.getClass();
        setFrag(frag);
        setTabLayout(_tab_layout);
        setTopcardAdapter(new lti0(frag));
        float pageWidth = (((getTopcardAdapter().getPageWidth(0) * xdl0.m208412y0()) - (f37829g + f37830h)) * 13.0f) / 32.0f;
        ViewGroup.LayoutParams layoutParams = get_viewpager().getLayoutParams();
        layoutParams.height = (int) pageWidth;
        get_viewpager().setLayoutParams(layoutParams);
        _tab_layout.setupWithViewPager(get_viewpager());
        BounceBackViewPager bounceBackViewPager = get_viewpager();
        bounceBackViewPager.setPageMargin(-f37831i);
        bounceBackViewPager.setOffscreenPageLimit(3);
        bounceBackViewPager.setAdapter(getTopcardAdapter());
        bounceBackViewPager.m4185d(new C9013b(_tab_layout, bounceBackViewPager));
        get_indicator().m223143c(get_viewpager(), get_viewpager().getCurrentItem());
        m57450h(get_viewpager().getCurrentItem());
    }

    @Nullable
    public final eb3 getBottomContentInterface() {
        return this.bottomContentInterface;
    }

    @NotNull
    public final PutongFrag getFrag() {
        PutongFrag putongFrag = this.frag;
        if (putongFrag != null) {
            return putongFrag;
        }
        Intrinsics.m87502r("frag");
        return null;
    }

    @NotNull
    public final VSegmentBar getTabLayout() {
        VSegmentBar vSegmentBar = this.tabLayout;
        if (vSegmentBar != null) {
            return vSegmentBar;
        }
        Intrinsics.m87502r("tabLayout");
        return null;
    }

    @NotNull
    public final lti0 getTopcardAdapter() {
        lti0 lti0Var = this.topcardAdapter;
        if (lti0Var != null) {
            return lti0Var;
        }
        Intrinsics.m87502r("topcardAdapter");
        return null;
    }

    @NotNull
    public final VPagerCircleIndicator get_indicator() {
        VPagerCircleIndicator vPagerCircleIndicator = this._indicator;
        if (vPagerCircleIndicator != null) {
            return vPagerCircleIndicator;
        }
        Intrinsics.m87502r("_indicator");
        return null;
    }

    @NotNull
    public final BounceBackViewPager get_viewpager() {
        BounceBackViewPager bounceBackViewPager = this._viewpager;
        if (bounceBackViewPager != null) {
            return bounceBackViewPager;
        }
        Intrinsics.m87502r("_viewpager");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m57450h(int position) {
        int color;
        int color2 = Color.parseColor("#15000000");
        if (ahl0.m96504t0(PurchaseType.TYPE_YOUTH_VIP, position)) {
            color = Color.parseColor("#BCE46A");
        } else if (ahl0.m96504t0(PurchaseType.TYPE_FEMALE_VIP, position)) {
            color = Color.parseColor("#F482CE");
        } else if (ahl0.m96504t0(PurchaseType.TYPE_GET_VIP, position)) {
            color = Color.parseColor("#E9B48E");
        } else if (ahl0.m96504t0(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE, position)) {
            color = Color.parseColor("#FF9B38");
        } else if (ahl0.m96504t0(PurchaseType.TYPE_O_DIAMOND, position)) {
            if (g6a.m124566o()) {
                color = Color.parseColor("#FCD49A");
                color2 = Color.parseColor("#33FCD49A");
            } else {
                color = Color.parseColor("#A76F11");
            }
        } else if (ahl0.m96504t0(PurchaseType.TYPE_O_PLATINUM, position)) {
            color = Color.parseColor("#656F7B");
        } else if (ahl0.m96504t0(PurchaseType.TYPE_SUPREME_PARTNER, position)) {
            color = Color.parseColor("#FFD589");
            color2 = Color.parseColor("#33FFD589");
        } else {
            color = Color.parseColor("#E9B48E");
        }
        get_indicator().setFillColor(color);
        get_indicator().setPageColor(color2);
        get_indicator().invalidate();
    }

    public final void setBottomContentInterface(@Nullable eb3 eb3Var) {
        this.bottomContentInterface = eb3Var;
    }

    public final void setFrag(@NotNull PutongFrag putongFrag) {
        putongFrag.getClass();
        this.frag = putongFrag;
    }

    public final void setTabLayout(@NotNull VSegmentBar vSegmentBar) {
        vSegmentBar.getClass();
        this.tabLayout = vSegmentBar;
    }

    public final void setTopcardAdapter(@NotNull lti0 lti0Var) {
        lti0Var.getClass();
        this.topcardAdapter = lti0Var;
    }

    public final void set_indicator(@NotNull VPagerCircleIndicator vPagerCircleIndicator) {
        vPagerCircleIndicator.getClass();
        this._indicator = vPagerCircleIndicator;
    }

    public final void set_viewpager(@NotNull BounceBackViewPager bounceBackViewPager) {
        bounceBackViewPager.getClass();
        this._viewpager = bounceBackViewPager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopCardLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TopCardLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ TopCardLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
