package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Gender;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.b1c0;
import l.b7p;
import l.d3c0;
import l.eqh0;
import l.sab0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\"\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010/¨\u00060"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;", "Landroid/widget/LinearLayout;", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "position", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "c", "(ILcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", "d", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "getTabSelectChangeListeners", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView$a;", "a", "Landroid/view/View;", "view", "b", "(Landroid/view/View;)V", "f", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)I", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;)V", "_root", "Lv/VText;", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "get_subtitle", "set_subtitle", "_subtitle", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlPurchasePageTabsItemView extends LinearLayout implements IntlPurchasePageTabsContainerView.InterfaceC0196a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlPurchasePageTabsItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPurchasePageTabsItemView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.purchase.intlpage.IntlPurchasePageTabsContainerView.InterfaceC0196a
    /* JADX INFO: renamed from: a */
    public void mo4504a(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        m4507d(purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public final void m4505b(View view) {
        b7p.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m4506c(int position, @NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        get_title().setText(sab0.q(purchaseType) ? getContext().getString(R.string.O4) : getContext().getString(R.string.G5));
        get_title().setTextColor(m4509f(purchaseType));
        get_subtitle().setTextColor(m4508e(purchaseType));
    }

    /* JADX INFO: renamed from: d */
    public final void m4507d(@NotNull PurchaseType currentPurchaseType) {
        currentPurchaseType.getClass();
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == currentPurchaseType) {
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.r("purchaseType");
                purchaseType2 = null;
            }
            if (sab0.q(purchaseType2)) {
                get_root().setBackgroundResource(d3c0.Y0);
            } else {
                get_root().setBackgroundResource(d3c0.Z0);
            }
        } else {
            get_root().setBackground(null);
        }
        get_title().setTextColor(m4509f(currentPurchaseType));
        get_subtitle().setTextColor(m4508e(currentPurchaseType));
        VText vText = get_subtitle();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R.string.b4);
        string.getClass();
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        vText.setText(String.format(string, Arrays.copyOf(new Object[]{String.valueOf(purchaseType3.getPrivilegeDataForGP((Gender) null).size())}, 1)));
    }

    /* JADX INFO: renamed from: e */
    public final int m4508e(PurchaseType currentPurchaseType) {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        PurchaseType purchaseType3 = this.purchaseType;
        if (currentPurchaseType != purchaseType) {
            if (purchaseType3 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType2 = purchaseType3;
            }
            return sab0.q(purchaseType2) ? getResources().getColor(b1c0.d) : Color.parseColor("#4DFFFFFF");
        }
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        return sab0.q(purchaseType2) ? Color.parseColor("#B38400") : Color.parseColor("#DFB43A");
    }

    /* JADX INFO: renamed from: f */
    public final int m4509f(PurchaseType currentPurchaseType) {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (currentPurchaseType != purchaseType) {
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.r("purchaseType");
            } else {
                purchaseType2 = purchaseType3;
            }
            if (sab0.w(purchaseType2)) {
                return getResources().getColor(b1c0.n);
            }
        }
        return getResources().getColor(b1c0.e);
    }

    @NotNull
    public final IntlPurchasePageTabsContainerView.InterfaceC0196a getTabSelectChangeListeners() {
        return this;
    }

    @NotNull
    public final IntlPurchasePageTabsItemView get_root() {
        IntlPurchasePageTabsItemView intlPurchasePageTabsItemView = this._root;
        if (intlPurchasePageTabsItemView != null) {
            return intlPurchasePageTabsItemView;
        }
        Intrinsics.r("_root");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4505b(this);
        get_title().setTypeface(eqh0.c(3), 0);
    }

    public final void set_root(@NotNull IntlPurchasePageTabsItemView intlPurchasePageTabsItemView) {
        intlPurchasePageTabsItemView.getClass();
        this._root = intlPurchasePageTabsItemView;
    }

    public final void set_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._subtitle = vText;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchasePageTabsItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ IntlPurchasePageTabsItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
