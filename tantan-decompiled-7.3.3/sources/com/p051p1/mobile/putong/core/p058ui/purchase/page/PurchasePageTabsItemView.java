package com.p051p1.mobile.putong.core.p058ui.purchase.page;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.aeb0;
import p153l.h9c0;
import p153l.jbc0;
import p153l.lyh0;
import p153l.qa00;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(¨\u0006)"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsItemView;", "Landroid/widget/FrameLayout;", "Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "position", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "multiTabs", "c", "(ILcom/p1/mobile/putong/core/data/PurchaseType;Z)V", "currentPurchaseType", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "getTabSelectChangeListeners", "()Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePageTabsContainerView$a;", "a", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "e", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)I", "Lv/VText;", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Z", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PurchasePageTabsItemView extends FrameLayout implements PurchasePageTabsContainerView.InterfaceC8947a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean multiTabs;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePageTabsItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.purchase.page.PurchasePageTabsContainerView.InterfaceC8947a
    /* JADX INFO: renamed from: a */
    public void mo55356a(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        m55359d(purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public final void m55357b(View view) {
        aeb0.m97235a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m55358c(int position, @NotNull PurchaseType purchaseType, boolean multiTabs) {
        String str;
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.multiTabs = multiTabs;
        VText vText = get_title();
        if (wib0.m206580x(purchaseType)) {
            str = multiTabs ? "青春专享会员" : "开通青春专享会员";
        } else if (wib0.m206563g(purchaseType)) {
            str = multiTabs ? "她专享会员" : "开通她专享会员";
        } else if (wib0.m206565i(purchaseType)) {
            str = multiTabs ? "黑金会员" : "开通黑金会员";
        } else if (wib0.m206573q(purchaseType)) {
            str = multiTabs ? "SVIP会员" : "开通SVIP会员";
        } else {
            str = multiTabs ? "VIP会员" : "开通VIP会员";
        }
        vText.setText(str);
        get_title().setTextColor(m55360e(purchaseType));
        if (multiTabs) {
            ViewGroup.LayoutParams layoutParams = get_title().getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (position == 0) {
                layoutParams2.gravity = 8388613;
                layoutParams2.rightMargin = qa00.f156328o;
            } else {
                layoutParams2.gravity = 8388611;
                layoutParams2.leftMargin = qa00.f156328o;
            }
            get_title().setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m55359d(@NotNull PurchaseType currentPurchaseType) {
        int i;
        currentPurchaseType.getClass();
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == currentPurchaseType) {
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType2 = null;
            }
            if (wib0.m206580x(purchaseType2)) {
                i = jbc0.f119742r7;
            } else {
                PurchaseType purchaseType3 = this.purchaseType;
                if (purchaseType3 == null) {
                    Intrinsics.m88391r("purchaseType");
                    purchaseType3 = null;
                }
                if (wib0.m206563g(purchaseType3)) {
                    i = jbc0.f119686n7;
                } else if (wib0.m206565i(currentPurchaseType)) {
                    i = jbc0.f119700o7;
                } else {
                    i = wib0.m206573q(currentPurchaseType) ? jbc0.f119714p7 : jbc0.f119728q7;
                }
            }
            if (this.multiTabs) {
                get_title().setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(i), (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                get_title().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, getResources().getDrawable(i), (Drawable) null);
            }
        } else {
            get_title().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        get_title().setTextColor(m55360e(currentPurchaseType));
    }

    /* JADX INFO: renamed from: e */
    public final int m55360e(PurchaseType currentPurchaseType) {
        if (!this.multiTabs) {
            return wib0.m206565i(currentPurchaseType) ? Color.parseColor("#CCFFDEA2") : getResources().getColor(h9c0.f108369g);
        }
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (currentPurchaseType != purchaseType) {
            return getResources().getColor(h9c0.f108377k);
        }
        if (wib0.m206565i(currentPurchaseType)) {
            return Color.parseColor("#CCFFDEA2");
        }
        return wib0.m206573q(currentPurchaseType) ? getResources().getColor(h9c0.f108351U) : Color.parseColor("#D3804B");
    }

    @NotNull
    public final PurchasePageTabsContainerView.InterfaceC8947a getTabSelectChangeListeners() {
        return this;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55357b(this);
        get_title().setTypeface(lyh0.m156283c(3), 0);
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePageTabsItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePageTabsItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
