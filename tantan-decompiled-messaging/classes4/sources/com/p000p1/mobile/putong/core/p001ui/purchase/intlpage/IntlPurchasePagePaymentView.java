package com.p000p1.mobile.putong.core.p001ui.purchase.intlpage;

import android.content.Context;
import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0190d;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.Prices;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.pay.R;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.d3c0;
import l.e30;
import l.eqh0;
import l.g30;
import l.juk;
import l.n6a;
import l.sab0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z6p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.dgn;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00152\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J+\u0010&\u001a\u00020\u00152\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010#¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\u00152\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0011\u0018\u00010#¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0019J\u000f\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010\u0019J\u0019\u0010-\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b-\u0010\u001dJ\u001f\u00101\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J\u0017\u00103\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00105J\u0017\u0010:\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b:\u00105R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010IR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010KR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010LR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010MR$\u0010T\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010UR,\u0010X\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0011\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010W¨\u0006Z"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "", "intlPromoFullscreenDiscountPayTracking", "", "h", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Z)V", "m", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "j", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/e30;", "", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "Ll/g30;", "Lcom/p1/mobile/android/app/Act;", "onPaySuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "failed", "setOnPaymentFailed", "k", "g", "n", "l", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "sectionDetail", "highLightColor", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;I)V", "d", "b", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "currencySymbol", "numericOrFormatted", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "c", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_renewal_detail", "()Landroid/widget/TextView;", "set_renewal_detail", "(Landroid/widget/TextView;)V", "_renewal_detail", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_payment", "()Landroid/widget/FrameLayout;", "set_payment", "(Landroid/widget/FrameLayout;)V", "_payment", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "Z", "Ll/dgn;", "Ll/dgn;", "getPaymentComponent", "()Ll/dgn;", "setPaymentComponent", "(Ll/dgn;)V", "paymentComponent", "Ll/e30;", "i", "Ll/g30;", "onPaymentSuccessAction", "onPaymentFailedAction", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class IntlPurchasePagePaymentView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TextView _renewal_detail;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public FrameLayout _payment;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public PurchaseType purchaseType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean intlPromoFullscreenDiscountPayTracking;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public dgn paymentComponent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccessAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchasePagePaymentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Act actD = xdl0.D(getContext());
        actD.getClass();
        Act act = actD;
        this.act = act;
        this.from = "p_purchase_page";
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        m4488a(layoutInflaterInflater, this);
        setOrientation(1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m4487i(IntlPurchasePagePaymentView intlPurchasePagePaymentView, PurchaseType purchaseType, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        intlPurchasePagePaymentView.m4495h(purchaseType, str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m4488a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = z6p.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: b */
    public final String m4489b(C0190d.a d) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        int iM4171w;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        Merchandise merchandiseM4167s = d.m4167s();
        if (merchandiseM4167s == null || (stockKeepUnit = merchandiseM4167s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String strM4149h = d.m4149h();
        if (strM4149h == null) {
            strM4149h = prices.currencySymbol;
            if (strM4149h == null) {
                strM4149h = "";
            }
        } else {
            if (strM4149h.length() <= 0) {
                strM4149h = null;
            }
            if (strM4149h == null) {
                strM4149h = prices.currencySymbol;
                if (strM4149h == null) {
                    strM4149h = "";
                }
            }
        }
        if (d.m4171w() > 0) {
            iM4171w = d.m4171w();
        } else {
            iM4171w = merchandiseM4167s.quantity;
            if (iM4171w <= 0) {
                iM4171w = 1;
            }
        }
        double d2 = prices.originalPrice;
        if (d2 <= 0.0d) {
            double d3 = prices.originalUnitPrice;
            d2 = d3 > 0.0d ? d3 * ((double) iM4171w) : 0.0d;
        }
        if (d2 <= 0.0d || strM4149h.length() <= 0) {
            String strM4153j = d.m4153j();
            String string = strM4153j != null ? StringsKt.Z0(strM4153j).toString() : null;
            return m4492e(strM4149h, string != null ? string : "");
        }
        return strM4149h + numberInstance.format(d2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX INFO: renamed from: c */
    public final String m4490c(C0190d.a d) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        Merchandise merchandiseM4167s = d.m4167s();
        if (merchandiseM4167s == null || (stockKeepUnit = merchandiseM4167s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String strM4149h = d.m4149h();
        if (strM4149h == null) {
            strM4149h = prices.currencySymbol;
            if (strM4149h == null) {
                strM4149h = "";
            }
        } else {
            if (strM4149h.length() <= 0) {
                strM4149h = null;
            }
            if (strM4149h == null) {
                strM4149h = prices.currencySymbol;
                if (strM4149h == null) {
                    strM4149h = "";
                }
            }
        }
        double dCeil = prices.originalUnitPrice;
        if (dCeil >= 100.0d) {
            dCeil = Math.ceil(dCeil);
        }
        if (dCeil <= 0.0d || strM4149h.length() <= 0) {
            String strM4155k = d.m4155k();
            String string = strM4155k != null ? StringsKt.Z0(strM4155k).toString() : null;
            return m4492e(strM4149h, string != null ? string : "");
        }
        return strM4149h + numberInstance.format(dCeil);
    }

    /* JADX INFO: renamed from: d */
    public final String m4491d(C0190d.a d) {
        int iM4171w;
        if (d.m4171w() > 0) {
            iM4171w = d.m4171w();
        } else {
            iM4171w = d.m4167s().quantity;
            if (iM4171w <= 0) {
                iM4171w = 1;
            }
        }
        return String.valueOf(iM4171w);
    }

    /* JADX INFO: renamed from: e */
    public final String m4492e(String currencySymbol, String numericOrFormatted) {
        String string = StringsKt.Z0(numericOrFormatted).toString();
        if (string.length() == 0) {
            return "";
        }
        if (currencySymbol.length() <= 0 || d.J(string, currencySymbol, false, 2, (Object) null)) {
            return string;
        }
        return currencySymbol + string;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: f */
    public final void m4493f(C0190d.a sectionDetail, int highLightColor) {
        String string;
        int i;
        String strString = this.act.string(R.string.g4);
        String strString2 = this.act.string(R.string.f4);
        if (CoreModule.c.x0.c4()) {
            IapAffiliatePromotion iapAffiliatePromotionE3 = CoreModule.c.x0.E3();
            if (iapAffiliatePromotionE3 == null) {
                i = 1;
            } else {
                if (iapAffiliatePromotionE3.ftDays <= 0) {
                    iapAffiliatePromotionE3 = null;
                }
                if (iapAffiliatePromotionE3 != null) {
                    i = iapAffiliatePromotionE3.ftDays;
                } else {
                    i = 1;
                }
            }
            string = this.act.getString(R.string.B2, Integer.valueOf(i), m4490c(sectionDetail));
        } else {
            string = this.act.getString(R.string.v2, m4489b(sectionDetail), m4491d(sectionDetail));
        }
        string.getClass();
        get_renewal_detail().setText(n6a.v0(n6a.q0(this.act, string, new String[]{strString, juk.j(), strString2, juk.i()}), vwb.f0(new String[]{strString, strString2}), highLightColor, eqh0.c(3)));
        get_renewal_detail().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: g */
    public final void m4494g() {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (sab0.q(purchaseType)) {
            setBackgroundResource(d3c0.u1);
            return;
        }
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        if (sab0.v(purchaseType2)) {
            setBackgroundResource(d3c0.v1);
        } else {
            setBackgroundResource(d3c0.p1);
        }
    }

    @Nullable
    public final dgn getPaymentComponent() {
        return this.paymentComponent;
    }

    @NotNull
    public final FrameLayout get_payment() {
        FrameLayout frameLayout = this._payment;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_payment");
        return null;
    }

    @NotNull
    public final TextView get_renewal_detail() {
        TextView textView = this._renewal_detail;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_renewal_detail");
        return null;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public final void m4495h(@NotNull PurchaseType purchaseType, @Nullable String from, boolean intlPromoFullscreenDiscountPayTracking) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = from;
        this.intlPromoFullscreenDiscountPayTracking = intlPromoFullscreenDiscountPayTracking;
    }

    /* JADX INFO: renamed from: j */
    public final void m4496j(@Nullable C0190d purchaseSection) {
        if (purchaseSection == null) {
            return;
        }
        m4498l(purchaseSection);
    }

    /* JADX INFO: renamed from: k */
    public final void m4497k() {
        dgn dgnVar = this.paymentComponent;
        if (dgnVar != null) {
            dgnVar.release();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4498l(C0190d purchaseSection) {
        xdl0.M(get_renewal_detail(), true);
        get_renewal_detail().setHighlightColor(0);
        int color = Color.parseColor("#4d000000");
        PurchaseType purchaseType = this.purchaseType;
        C0190d.a aVarM4086b = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (sab0.q(purchaseType)) {
            color = Color.parseColor("#4dffffff");
        } else {
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.r("purchaseType");
                purchaseType2 = null;
            }
            if (sab0.v(purchaseType2)) {
                color = Color.parseColor("#80FFFFFF");
            } else if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.c.x0.N3()) {
                color = Color.parseColor("#4DFFFFFF");
            }
        }
        int color2 = Color.parseColor("#FE7E1D");
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
            purchaseType3 = null;
        }
        if (sab0.q(purchaseType3)) {
            color2 = Color.parseColor("#EDD7A3");
        } else {
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.r("purchaseType");
                purchaseType4 = null;
            }
            if (sab0.v(purchaseType4)) {
                color2 = Color.parseColor("#F9E7FF");
            } else if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.c.x0.N3()) {
                color2 = Color.parseColor("#EDD7A3");
            }
        }
        get_renewal_detail().setTextColor(color);
        if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.c.x0.N3()) {
            get_renewal_detail().setTextSize(2, 9.0f);
            get_renewal_detail().setLineSpacing(t100.d(1.0f), 1.0f);
            int iD = t100.d(24.0f);
            ViewGroup.LayoutParams layoutParams = get_renewal_detail().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(iD, 0, iD, 0);
            }
        } else {
            get_renewal_detail().setTextSize(2, 11.0f);
            get_renewal_detail().setLineSpacing(t100.d(1.0f), 1.0f);
            int iD2 = t100.d(15.0f);
            ViewGroup.LayoutParams layoutParams2 = get_renewal_detail().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMargins(iD2, 0, iD2, 0);
            }
        }
        if (purchaseSection != null) {
            C0190d.a aVarM4088d = purchaseSection.m4088d();
            aVarM4086b = aVarM4088d == null ? purchaseSection.m4086b() : aVarM4088d;
        }
        boolean z = aVarM4086b != null && CoreModule.c.G2.k3(aVarM4086b.m4145f());
        if (this.intlPromoFullscreenDiscountPayTracking && !z && aVarM4086b != null && CoreModule.c.x0.N3()) {
            m4493f(aVarM4086b, color2);
            return;
        }
        int i = IntlCountryCodeController.k() ? R.string.f2 : R.string.d4;
        if (z) {
            i = R.string.e4;
        }
        Act act = this.act;
        get_renewal_detail().setText(n6a.v0(n6a.q0(act, act.getString(i, act.string(R.string.g4), this.act.string(R.string.f4)), new String[]{this.act.string(R.string.g4), juk.j(), this.act.string(R.string.f4), juk.i()}), vwb.f0(new String[]{this.act.string(R.string.g4), this.act.string(R.string.f4)}), color2, eqh0.c(3)));
        get_renewal_detail().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: m */
    public final void m4499m() {
        m4494g();
        m4500n();
        m4498l(null);
    }

    /* JADX INFO: renamed from: n */
    public final void m4500n() {
        PurchaseType purchaseType;
        if (this.paymentComponent != null || (purchaseType = this.purchaseType) == null) {
            return;
        }
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.r("purchaseType");
            purchaseType = null;
        }
        if (sab0.s(purchaseType)) {
            xdl0.X(get_payment(), t100.d(30.0f));
        } else {
            xdl0.X(get_payment(), 0);
        }
        Act act = this.act;
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        dgn dgnVar = new dgn(act, purchaseType2);
        this.paymentComponent = dgnVar;
        get_payment().addView(dgnVar.m11850a(get_payment(), false));
        dgnVar.c(this.from);
        dgnVar.m11860g1(this.intlPromoFullscreenDiscountPayTracking);
        dgnVar.i0(this.intlPromoFullscreenDiscountPayTracking);
        dgnVar.m11863i(this.dialogStateAction);
        dgnVar.k0(this.onPaymentSuccessAction);
        dgnVar.j0(this.onPaymentFailedAction);
    }

    public final void setDialogStateAction(@Nullable e30<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setOnPaymentFailed(@Nullable g30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    public final void setOnPaymentSuccess(@Nullable g30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    public final void setPaymentComponent(@Nullable dgn dgnVar) {
        this.paymentComponent = dgnVar;
    }

    public final void set_payment(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._payment = frameLayout;
    }

    public final void set_renewal_detail(@NotNull TextView textView) {
        textView.getClass();
        this._renewal_detail = textView;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlPurchasePagePaymentView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ IntlPurchasePagePaymentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
