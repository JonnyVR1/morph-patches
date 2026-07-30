package com.p046p1.mobile.putong.core.p053ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.b1c0;
import p149l.b7p;
import p149l.d3c0;
import p149l.eqh0;
import p149l.sab0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001dR\"\u0010$\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010.\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010/¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;", "Landroid/widget/LinearLayout;", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "", "position", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "c", "(ILcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "getTabSelectChangeListeners", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView$a;", "a", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "f", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)I", "e", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;", "get_root", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;", "set_root", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsItemView;)V", "_root", "Lv/VText;", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "get_subtitle", "set_subtitle", "_subtitle", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class IntlPurchasePageTabsItemView extends LinearLayout implements IntlPurchasePageTabsContainerView.InterfaceC8771a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public IntlPurchasePageTabsItemView _root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _subtitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlPurchasePageTabsItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.purchase.intlpage.IntlPurchasePageTabsContainerView.InterfaceC8771a
    /* JADX INFO: renamed from: a */
    public void mo53938a(@NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        m53941d(purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public final void m53939b(View view) {
        b7p.m100693a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m53940c(int position, @NotNull PurchaseType purchaseType) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        get_title().setText(sab0.m182899q(purchaseType) ? getContext().getString(R$string.f27249O4) : getContext().getString(R$string.f27162G5));
        get_title().setTextColor(m53943f(purchaseType));
        get_subtitle().setTextColor(m53942e(purchaseType));
    }

    /* JADX INFO: renamed from: d */
    public final void m53941d(@NotNull PurchaseType currentPurchaseType) {
        currentPurchaseType.getClass();
        PurchaseType purchaseType = this.purchaseType;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (purchaseType == currentPurchaseType) {
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType2 = null;
            }
            if (sab0.m182899q(purchaseType2)) {
                get_root().setBackgroundResource(d3c0.f83816Y0);
            } else {
                get_root().setBackgroundResource(d3c0.f83829Z0);
            }
        } else {
            get_root().setBackground(null);
        }
        get_title().setTextColor(m53943f(currentPurchaseType));
        get_subtitle().setTextColor(m53942e(currentPurchaseType));
        VText vText = get_subtitle();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = getContext().getString(R$string.f27393b4);
        string.getClass();
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType3 = null;
        }
        vText.setText(String.format(string, Arrays.copyOf(new Object[]{String.valueOf(purchaseType3.getPrivilegeDataForGP(null).size())}, 1)));
    }

    /* JADX INFO: renamed from: e */
    public final int m53942e(PurchaseType currentPurchaseType) {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        PurchaseType purchaseType3 = this.purchaseType;
        if (currentPurchaseType != purchaseType) {
            if (purchaseType3 == null) {
                Intrinsics.m87502r("purchaseType");
            } else {
                purchaseType2 = purchaseType3;
            }
            return sab0.m182899q(purchaseType2) ? getResources().getColor(b1c0.f72543d) : Color.parseColor("#4DFFFFFF");
        }
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        return sab0.m182899q(purchaseType2) ? Color.parseColor("#B38400") : Color.parseColor("#DFB43A");
    }

    /* JADX INFO: renamed from: f */
    public final int m53943f(PurchaseType currentPurchaseType) {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (currentPurchaseType != purchaseType) {
            PurchaseType purchaseType3 = this.purchaseType;
            if (purchaseType3 == null) {
                Intrinsics.m87502r("purchaseType");
            } else {
                purchaseType2 = purchaseType3;
            }
            if (sab0.m182905w(purchaseType2)) {
                return getResources().getColor(b1c0.f72563n);
            }
        }
        return getResources().getColor(b1c0.f72545e);
    }

    @NotNull
    public final IntlPurchasePageTabsContainerView.InterfaceC8771a getTabSelectChangeListeners() {
        return this;
    }

    @NotNull
    public final IntlPurchasePageTabsItemView get_root() {
        IntlPurchasePageTabsItemView intlPurchasePageTabsItemView = this._root;
        if (intlPurchasePageTabsItemView != null) {
            return intlPurchasePageTabsItemView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final VText get_subtitle() {
        VText vText = this._subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53939b(this);
        get_title().setTypeface(eqh0.m117752c(3), 0);
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
