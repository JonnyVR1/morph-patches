package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.o7r;
import l.pdp;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.ndp;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 ?2\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/view/IntlTopCardLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/app/PutongFrag;", "frag", "Landroidx/viewpager/widget/ViewPager$j;", "listener", "", "e", "(Lcom/p1/mobile/putong/app/PutongFrag;Landroidx/viewpager/widget/ViewPager$j;)V", "Ljava/util/ArrayList;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Lkotlin/collections/ArrayList;", "purchaseTypes", "d", "(Ljava/util/ArrayList;)V", "selected", "setCurrentItem", "(I)V", "getCurrentItem", "()I", "Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/view/IntlBounceBackViewPager;", "Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/view/IntlBounceBackViewPager;", "get_viewpager", "()Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/view/IntlBounceBackViewPager;", "set_viewpager", "(Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/view/IntlBounceBackViewPager;)V", "_viewpager", "Lv/VPagerCircleIndicator;", "b", "Lv/VPagerCircleIndicator;", "get_indicator", "()Lv/VPagerCircleIndicator;", "set_indicator", "(Lv/VPagerCircleIndicator;)V", "_indicator", "Ll/ndp;", "c", "Ll/ndp;", "getAdapter", "()Ll/ndp;", "setAdapter", "(Ll/ndp;)V", "adapter", "Lcom/p1/mobile/putong/app/PutongFrag;", "getFrag", "()Lcom/p1/mobile/putong/app/PutongFrag;", "setFrag", "(Lcom/p1/mobile/putong/app/PutongFrag;)V", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlTopCardLayout extends LinearLayout {

    /* JADX INFO: renamed from: e */
    public static final int f6999e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlBounceBackViewPager _viewpager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VPagerCircleIndicator _indicator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ndp adapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PutongFrag frag;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final int f7000f = t100.f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.view.IntlTopCardLayout$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/intlPrivilege/view/IntlTopCardLayout$a;", "", "<init>", "()V", "", "itemSideMargin", "I", "b", "()I", "itemPadding", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m9977a() {
            return IntlTopCardLayout.f7000f;
        }

        /* JADX INFO: renamed from: b */
        public final int m9978b() {
            return IntlTopCardLayout.f6999e;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlTopCardLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(context);
        layoutInflaterA.getClass();
        m9974a(layoutInflaterA, this);
        setOrientation(1);
        get_viewpager().setOffscreenPageLimit(3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m9974a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = pdp.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: d */
    public final void m9975d(@NotNull ArrayList<PurchaseType> purchaseTypes) {
        purchaseTypes.getClass();
        if (getFrag() == null || purchaseTypes.isEmpty()) {
            return;
        }
        getAdapter().m20074t(purchaseTypes);
        if (purchaseTypes.size() == 1) {
            get_indicator().setVisibility(8);
            return;
        }
        get_indicator().setVisibility(0);
        get_indicator().setViewPager(get_viewpager());
        get_indicator().invalidate();
    }

    /* JADX INFO: renamed from: e */
    public final void m9976e(@NotNull PutongFrag frag, @NotNull ViewPager.j listener) {
        frag.getClass();
        listener.getClass();
        setFrag(frag);
        setAdapter(new ndp(frag));
        IntlBounceBackViewPager intlBounceBackViewPager = get_viewpager();
        intlBounceBackViewPager.setOffscreenPageLimit(3);
        intlBounceBackViewPager.setAdapter(getAdapter());
        intlBounceBackViewPager.setOnPageChangeListener(listener);
        get_indicator().setViewPager(get_viewpager());
        get_indicator().invalidate();
    }

    @NotNull
    public final ndp getAdapter() {
        ndp ndpVar = this.adapter;
        if (ndpVar != null) {
            return ndpVar;
        }
        Intrinsics.r("adapter");
        return null;
    }

    public final int getCurrentItem() {
        return get_viewpager().getCurrentItem();
    }

    @NotNull
    public final PutongFrag getFrag() {
        PutongFrag putongFrag = this.frag;
        if (putongFrag != null) {
            return putongFrag;
        }
        Intrinsics.r("frag");
        return null;
    }

    @NotNull
    public final VPagerCircleIndicator get_indicator() {
        VPagerCircleIndicator vPagerCircleIndicator = this._indicator;
        if (vPagerCircleIndicator != null) {
            return vPagerCircleIndicator;
        }
        Intrinsics.r("_indicator");
        return null;
    }

    @NotNull
    public final IntlBounceBackViewPager get_viewpager() {
        IntlBounceBackViewPager intlBounceBackViewPager = this._viewpager;
        if (intlBounceBackViewPager != null) {
            return intlBounceBackViewPager;
        }
        Intrinsics.r("_viewpager");
        return null;
    }

    public final void setAdapter(@NotNull ndp ndpVar) {
        ndpVar.getClass();
        this.adapter = ndpVar;
    }

    public final void setCurrentItem(int selected) {
        get_viewpager().setCurrentItem(selected);
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
