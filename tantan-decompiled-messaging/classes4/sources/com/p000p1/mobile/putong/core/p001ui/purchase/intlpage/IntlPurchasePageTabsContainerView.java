package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlpage.IntlPurchasePageTabsContainerView;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.m6c0;
import l.o7r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "c", "(Ljava/util/List;)V", "purchaseType", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setupWithViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "a", "Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "currentPurchaseType", "Landroidx/viewpager/widget/ViewPager;", "_pager", "", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView$a;", "d", "onTabSelectChangeListeners", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlPurchasePageTabsContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public List<? extends PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public PurchaseType currentPurchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public ViewPager _pager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public List<InterfaceC0196a> onTabSelectChangeListeners;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.intlpage.IntlPurchasePageTabsContainerView$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView$a;", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0196a {
        /* JADX INFO: renamed from: a */
        void mo4504a(@NotNull PurchaseType purchaseType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchasePageTabsContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.onTabSelectChangeListeners = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: renamed from: a */
    public static void m4501a(IntlPurchasePageTabsContainerView intlPurchasePageTabsContainerView, List list, int i, View view) {
        if (intlPurchasePageTabsContainerView.currentPurchaseType == list.get(i)) {
            return;
        }
        intlPurchasePageTabsContainerView.m4502b((PurchaseType) list.get(i));
    }

    /* JADX INFO: renamed from: b */
    public final void m4502b(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        this.currentPurchaseType = purchaseType;
        Iterator<InterfaceC0196a> it = this.onTabSelectChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().mo4504a(purchaseType);
        }
        List<? extends PurchaseType> list = this.purchaseTypes;
        if (list == null) {
            Intrinsics.r("purchaseTypes");
            list = null;
        }
        int iIndexOf = CollectionsKt.indexOf(list, this.currentPurchaseType);
        ViewPager viewPager = this._pager;
        if (viewPager != null) {
            viewPager.T(iIndexOf, true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4503c(@NotNull final List<? extends PurchaseType> purchaseTypes) {
        purchaseTypes.getClass();
        this.purchaseTypes = purchaseTypes;
        int size = purchaseTypes.size();
        for (final int i = 0; i < size; i++) {
            View viewInflate = o7r.a(getContext()).inflate(m6c0.W, (ViewGroup) this, false);
            viewInflate.getClass();
            IntlPurchasePageTabsItemView intlPurchasePageTabsItemView = (IntlPurchasePageTabsItemView) viewInflate;
            intlPurchasePageTabsItemView.m4506c(i, purchaseTypes.get(i));
            intlPurchasePageTabsItemView.setOnClickListener(new View.OnClickListener() { // from class: l.a7p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPurchasePageTabsContainerView.m4501a(this.f7437a, purchaseTypes, i, view);
                }
            });
            this.onTabSelectChangeListeners.add(intlPurchasePageTabsItemView.getTabSelectChangeListeners());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            addView(intlPurchasePageTabsItemView, layoutParams);
        }
    }

    public final void setupWithViewPager(@Nullable ViewPager viewPager) {
        this._pager = viewPager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPurchasePageTabsContainerView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ IntlPurchasePageTabsContainerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
