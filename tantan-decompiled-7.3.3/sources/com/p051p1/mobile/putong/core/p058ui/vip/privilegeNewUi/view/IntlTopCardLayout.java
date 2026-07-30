package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VPagerCircleIndicator;
import p153l.bnl0;
import p153l.ofp;
import p153l.p9r;
import p153l.qa00;
import p153l.qfp;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 92\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/IntlTopCardLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Landroidx/viewpager/widget/ViewPager$j;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "e", "(Lcom/p1/mobile/putong/app/PutongFrag;Landroidx/viewpager/widget/ViewPager$j;)V", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", Constants.INAPP_DATA_TAG, "(Ljava/util/ArrayList;)V", "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/IntlBounceBackViewPager;", "Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/IntlBounceBackViewPager;", "get_viewpager", "()Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/IntlBounceBackViewPager;", "set_viewpager", "(Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/IntlBounceBackViewPager;)V", "_viewpager", "Lv/VPagerCircleIndicator;", "b", "Lv/VPagerCircleIndicator;", "get_indicator", "()Lv/VPagerCircleIndicator;", "set_indicator", "(Lv/VPagerCircleIndicator;)V", "_indicator", "Ll/ofp;", "c", "Ll/ofp;", "getAdapter", "()Ll/ofp;", "setAdapter", "(Ll/ofp;)V", "adapter", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "setFrag", "(Lcom/p1/mobile/putong/app/PutongFrag;)V", "Companion", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlTopCardLayout extends LinearLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f38807e = qa00.f156323j;

    /* JADX INFO: renamed from: f */
    public static final int f38808f = qa00.f156333t;

    /* JADX INFO: renamed from: g */
    public static final int f38809g = qa00.f156328o;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlBounceBackViewPager _viewpager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VPagerCircleIndicator _indicator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ofp adapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PutongFrag frag;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.view.IntlTopCardLayout$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/IntlTopCardLayout$a;", "", "<init>", "()V", "", "itemSideMargin", "I", "b", "()I", "itemPadding", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m58864a() {
            return IntlTopCardLayout.f38809g;
        }

        /* JADX INFO: renamed from: b */
        public final int m58865b() {
            return IntlTopCardLayout.f38807e;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlTopCardLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(context);
        layoutInflaterM171370a.getClass();
        m58861a(layoutInflaterM171370a, this);
        setOrientation(1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m58861a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM176390b = qfp.m176390b(this, inflater, parent);
        viewM176390b.getClass();
        return viewM176390b;
    }

    /* JADX INFO: renamed from: d */
    public final void m58862d(@NotNull ArrayList<PurchaseType> purchaseTypes) {
        purchaseTypes.getClass();
        getAdapter().m167471t(purchaseTypes);
        if (purchaseTypes.size() == 1) {
            get_indicator().setVisibility(8);
            return;
        }
        get_indicator().setVisibility(0);
        get_indicator().m224389c(get_viewpager(), get_viewpager().getCurrentItem());
        get_indicator().invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m58863e(@NotNull PutongFrag frag, @NotNull ViewPager.InterfaceC0718j listener) {
        frag.getClass();
        listener.getClass();
        setFrag(frag);
        setAdapter(new ofp(frag));
        ViewGroup.LayoutParams layoutParams = get_viewpager().getLayoutParams();
        layoutParams.width = bnl0.m105592y0() - qa00.m175859d(4.0f);
        get_viewpager().setLayoutParams(layoutParams);
        IntlBounceBackViewPager intlBounceBackViewPager = get_viewpager();
        intlBounceBackViewPager.setPageMargin(-f38808f);
        intlBounceBackViewPager.setOffscreenPageLimit(3);
        intlBounceBackViewPager.setAdapter(getAdapter());
        intlBounceBackViewPager.m4187d(listener);
        get_indicator().m224389c(get_viewpager(), get_viewpager().getCurrentItem());
        get_indicator().invalidate();
    }

    @NotNull
    public final ofp getAdapter() {
        ofp ofpVar = this.adapter;
        if (ofpVar != null) {
            return ofpVar;
        }
        Intrinsics.m88391r("adapter");
        return null;
    }

    @NotNull
    public final PutongFrag getFrag() {
        PutongFrag putongFrag = this.frag;
        if (putongFrag != null) {
            return putongFrag;
        }
        Intrinsics.m88391r("frag");
        return null;
    }

    @NotNull
    public final VPagerCircleIndicator get_indicator() {
        VPagerCircleIndicator vPagerCircleIndicator = this._indicator;
        if (vPagerCircleIndicator != null) {
            return vPagerCircleIndicator;
        }
        Intrinsics.m88391r("_indicator");
        return null;
    }

    @NotNull
    public final IntlBounceBackViewPager get_viewpager() {
        IntlBounceBackViewPager intlBounceBackViewPager = this._viewpager;
        if (intlBounceBackViewPager != null) {
            return intlBounceBackViewPager;
        }
        Intrinsics.m88391r("_viewpager");
        return null;
    }

    public final void setAdapter(@NotNull ofp ofpVar) {
        ofpVar.getClass();
        this.adapter = ofpVar;
    }

    public final void setFrag(@NotNull PutongFrag putongFrag) {
        putongFrag.getClass();
        this.frag = putongFrag;
    }

    public final void set_indicator(@NotNull VPagerCircleIndicator vPagerCircleIndicator) {
        vPagerCircleIndicator.getClass();
        this._indicator = vPagerCircleIndicator;
    }

    public final void set_viewpager(@NotNull IntlBounceBackViewPager intlBounceBackViewPager) {
        intlBounceBackViewPager.getClass();
        this._viewpager = intlBounceBackViewPager;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlTopCardLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlTopCardLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ IntlTopCardLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
