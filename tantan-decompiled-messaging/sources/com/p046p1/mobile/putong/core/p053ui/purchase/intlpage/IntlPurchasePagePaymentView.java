package com.p046p1.mobile.putong.core.p053ui.purchase.intlpage;

import android.app.Activity;
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
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d3c0;
import p149l.dgn;
import p149l.e30;
import p149l.eqh0;
import p149l.g30;
import p149l.juk;
import p149l.n6a;
import p149l.sab0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.z6p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00152\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J+\u0010&\u001a\u00020\u00152\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010#¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\u00152\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0011\u0018\u00010#¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0019J\u000f\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010\u0019J\u0019\u0010-\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b-\u0010\u001dJ\u001f\u00101\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J\u0017\u00103\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00105J\u0017\u0010:\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b:\u00105R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010IR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010KR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010LR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010MR$\u0010T\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010UR,\u0010X\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0011\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010W¨\u0006Z"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "", "intlPromoFullscreenDiscountPayTracking", "", "h", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Z)V", "m", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "j", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/e30;", "", "dialogStateAction", "setDialogStateAction", "(Ll/e30;)V", "Ll/g30;", "Lcom/p1/mobile/android/app/Act;", "onPaySuccess", "setOnPaymentSuccess", "(Ll/g30;)V", "failed", "setOnPaymentFailed", "k", "g", "n", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "sectionDetail", "highLightColor", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;I)V", Constants.INAPP_DATA_TAG, "b", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "currencySymbol", "numericOrFormatted", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "c", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_renewal_detail", "()Landroid/widget/TextView;", "set_renewal_detail", "(Landroid/widget/TextView;)V", "_renewal_detail", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_payment", "()Landroid/widget/FrameLayout;", "set_payment", "(Landroid/widget/FrameLayout;)V", "_payment", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "Z", "Ll/dgn;", "Ll/dgn;", "getPaymentComponent", "()Ll/dgn;", "setPaymentComponent", "(Ll/dgn;)V", "paymentComponent", "Ll/e30;", RXScreenCaptureService.KEY_INDEX, "Ll/g30;", "onPaymentSuccessAction", "onPaymentFailedAction", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        Activity activityM208326D = xdl0.m208326D(getContext());
        activityM208326D.getClass();
        Act act = (Act) activityM208326D;
        this.act = act;
        this.from = "p_purchase_page";
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        m53922a(layoutInflaterInflater, this);
        setOrientation(1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m53921i(IntlPurchasePagePaymentView intlPurchasePagePaymentView, PurchaseType purchaseType, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        intlPurchasePagePaymentView.m53929h(purchaseType, str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m53922a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM217402b = z6p.m217402b(this, inflater, parent);
        viewM217402b.getClass();
        return viewM217402b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: b */
    public final String m53923b(C8765d.a d) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        int iM53605w;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        Merchandise merchandiseM53601s = d.m53601s();
        if (merchandiseM53601s == null || (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String strM53583h = d.m53583h();
        if (strM53583h == null) {
            strM53583h = prices.currencySymbol;
            if (strM53583h == null) {
                strM53583h = "";
            }
        } else {
            if (strM53583h.length() <= 0) {
                strM53583h = null;
            }
            if (strM53583h == null) {
                strM53583h = prices.currencySymbol;
                if (strM53583h == null) {
                    strM53583h = "";
                }
            }
        }
        if (d.m53605w() > 0) {
            iM53605w = d.m53605w();
        } else {
            iM53605w = merchandiseM53601s.quantity;
            if (iM53605w <= 0) {
                iM53605w = 1;
            }
        }
        double d2 = prices.originalPrice;
        if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d3 = prices.originalUnitPrice;
            d2 = d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? d3 * ((double) iM53605w) : 0.0d;
        }
        if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || strM53583h.length() <= 0) {
            String strM53587j = d.m53587j();
            String string = strM53587j != null ? StringsKt.m93433Z0(strM53587j).toString() : null;
            return m53926e(strM53583h, string != null ? string : "");
        }
        return strM53583h + numberInstance.format(d2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX INFO: renamed from: c */
    public final String m53924c(C8765d.a d) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        Merchandise merchandiseM53601s = d.m53601s();
        if (merchandiseM53601s == null || (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String strM53583h = d.m53583h();
        if (strM53583h == null) {
            strM53583h = prices.currencySymbol;
            if (strM53583h == null) {
                strM53583h = "";
            }
        } else {
            if (strM53583h.length() <= 0) {
                strM53583h = null;
            }
            if (strM53583h == null) {
                strM53583h = prices.currencySymbol;
                if (strM53583h == null) {
                    strM53583h = "";
                }
            }
        }
        double dCeil = prices.originalUnitPrice;
        if (dCeil >= 100.0d) {
            dCeil = Math.ceil(dCeil);
        }
        if (dCeil <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || strM53583h.length() <= 0) {
            String strM53589k = d.m53589k();
            String string = strM53589k != null ? StringsKt.m93433Z0(strM53589k).toString() : null;
            return m53926e(strM53583h, string != null ? string : "");
        }
        return strM53583h + numberInstance.format(dCeil);
    }

    /* JADX INFO: renamed from: d */
    public final String m53925d(C8765d.a d) {
        int iM53605w;
        if (d.m53605w() > 0) {
            iM53605w = d.m53605w();
        } else {
            iM53605w = d.m53601s().quantity;
            if (iM53605w <= 0) {
                iM53605w = 1;
            }
        }
        return String.valueOf(iM53605w);
    }

    /* JADX INFO: renamed from: e */
    public final String m53926e(String currencySymbol, String numericOrFormatted) {
        String string = StringsKt.m93433Z0(numericOrFormatted).toString();
        if (string.length() == 0) {
            return "";
        }
        if (currencySymbol.length() <= 0 || C15386d.m93483J(string, currencySymbol, false, 2, null)) {
            return string;
        }
        return currencySymbol + string;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: f */
    public final void m53927f(C8765d.a sectionDetail, int highLightColor) {
        String string;
        int i;
        String strString = this.act.string(R$string.f27453g4);
        String strString2 = this.act.string(R$string.f27441f4);
        if (CoreModule.f17545c.f19696x0.m30195c4()) {
            IapAffiliatePromotion iapAffiliatePromotionM30171E3 = CoreModule.f17545c.f19696x0.m30171E3();
            if (iapAffiliatePromotionM30171E3 == null) {
                i = 1;
            } else {
                if (iapAffiliatePromotionM30171E3.ftDays <= 0) {
                    iapAffiliatePromotionM30171E3 = null;
                }
                if (iapAffiliatePromotionM30171E3 != null) {
                    i = iapAffiliatePromotionM30171E3.ftDays;
                } else {
                    i = 1;
                }
            }
            string = this.act.getString(R$string.f27104B2, Integer.valueOf(i), m53924c(sectionDetail));
        } else {
            string = this.act.getString(R$string.f27626v2, m53923b(sectionDetail), m53925d(sectionDetail));
        }
        string.getClass();
        get_renewal_detail().setText(n6a.m158034v0(n6a.m158029q0(this.act, string, strString, juk.m143328j(), strString2, juk.m143327i()), vwb.m200324f0(strString, strString2), highLightColor, eqh0.m117752c(3)));
        get_renewal_detail().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: g */
    public final void m53928g() {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (sab0.m182899q(purchaseType)) {
            setBackgroundResource(d3c0.f84123u1);
            return;
        }
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        if (sab0.m182904v(purchaseType2)) {
            setBackgroundResource(d3c0.f84137v1);
        } else {
            setBackgroundResource(d3c0.f84053p1);
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
        Intrinsics.m87502r("_payment");
        return null;
    }

    @NotNull
    public final TextView get_renewal_detail() {
        TextView textView = this._renewal_detail;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_renewal_detail");
        return null;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public final void m53929h(@NotNull PurchaseType purchaseType, @Nullable String from, boolean intlPromoFullscreenDiscountPayTracking) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = from;
        this.intlPromoFullscreenDiscountPayTracking = intlPromoFullscreenDiscountPayTracking;
    }

    /* JADX INFO: renamed from: j */
    public final void m53930j(@Nullable C8765d purchaseSection) {
        if (purchaseSection == null) {
            return;
        }
        m53932l(purchaseSection);
    }

    /* JADX INFO: renamed from: k */
    public final void m53931k() {
        dgn dgnVar = this.paymentComponent;
        if (dgnVar != null) {
            dgnVar.release();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m53932l(C8765d purchaseSection) {
        xdl0.m208344M(get_renewal_detail(), true);
        get_renewal_detail().setHighlightColor(0);
        int color = Color.parseColor("#4d000000");
        PurchaseType purchaseType = this.purchaseType;
        C8765d.a aVarM53520b = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (sab0.m182899q(purchaseType)) {
            color = Color.parseColor("#4dffffff");
        } else {
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType2 = null;
            }
            if (sab0.m182904v(purchaseType2)) {
                color = Color.parseColor("#80FFFFFF");
            } else if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.f17545c.f19696x0.m30186N3()) {
                color = Color.parseColor("#4DFFFFFF");
            }
        }
        int color2 = Color.parseColor("#FE7E1D");
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType3 = null;
        }
        if (sab0.m182899q(purchaseType3)) {
            color2 = Color.parseColor("#EDD7A3");
        } else {
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.m87502r("purchaseType");
                purchaseType4 = null;
            }
            if (sab0.m182904v(purchaseType4)) {
                color2 = Color.parseColor("#F9E7FF");
            } else if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.f17545c.f19696x0.m30186N3()) {
                color2 = Color.parseColor("#EDD7A3");
            }
        }
        get_renewal_detail().setTextColor(color);
        if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.f17545c.f19696x0.m30186N3()) {
            get_renewal_detail().setTextSize(2, 9.0f);
            get_renewal_detail().setLineSpacing(t100.m186890d(1.0f), 1.0f);
            int iM186890d = t100.m186890d(24.0f);
            ViewGroup.LayoutParams layoutParams = get_renewal_detail().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(iM186890d, 0, iM186890d, 0);
            }
        } else {
            get_renewal_detail().setTextSize(2, 11.0f);
            get_renewal_detail().setLineSpacing(t100.m186890d(1.0f), 1.0f);
            int iM186890d2 = t100.m186890d(15.0f);
            ViewGroup.LayoutParams layoutParams2 = get_renewal_detail().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMargins(iM186890d2, 0, iM186890d2, 0);
            }
        }
        if (purchaseSection != null) {
            C8765d.a aVarM53522d = purchaseSection.m53522d();
            aVarM53520b = aVarM53522d == null ? purchaseSection.m53520b() : aVarM53522d;
        }
        boolean z = aVarM53520b != null && CoreModule.f17545c.f19569G2.m105983k3(aVarM53520b.m53579f());
        if (this.intlPromoFullscreenDiscountPayTracking && !z && aVarM53520b != null && CoreModule.f17545c.f19696x0.m30186N3()) {
            m53927f(aVarM53520b, color2);
            return;
        }
        int i = IntlCountryCodeController.m28115k() ? R$string.f27439f2 : R$string.f27417d4;
        if (z) {
            i = R$string.f27429e4;
        }
        Act act = this.act;
        get_renewal_detail().setText(n6a.m158034v0(n6a.m158029q0(act, act.getString(i, act.string(R$string.f27453g4), this.act.string(R$string.f27441f4)), this.act.string(R$string.f27453g4), juk.m143328j(), this.act.string(R$string.f27441f4), juk.m143327i()), vwb.m200324f0(this.act.string(R$string.f27453g4), this.act.string(R$string.f27441f4)), color2, eqh0.m117752c(3)));
        get_renewal_detail().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: m */
    public final void m53933m() {
        m53928g();
        m53934n();
        m53932l(null);
    }

    /* JADX INFO: renamed from: n */
    public final void m53934n() {
        PurchaseType purchaseType;
        if (this.paymentComponent != null || (purchaseType = this.purchaseType) == null) {
            return;
        }
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m87502r("purchaseType");
            purchaseType = null;
        }
        if (sab0.m182901s(purchaseType)) {
            xdl0.m208360X(get_payment(), t100.m186890d(30.0f));
        } else {
            xdl0.m208360X(get_payment(), 0);
        }
        Act act = this.act;
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m87502r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        dgn dgnVar = new dgn(act, purchaseType2);
        this.paymentComponent = dgnVar;
        get_payment().addView(dgnVar.mo111145a(get_payment(), false));
        dgnVar.mo111149c(this.from);
        dgnVar.m111709g1(this.intlPromoFullscreenDiscountPayTracking);
        dgnVar.m111160i0(this.intlPromoFullscreenDiscountPayTracking);
        dgnVar.mo111159i(this.dialogStateAction);
        dgnVar.m111162k0(this.onPaymentSuccessAction);
        dgnVar.m111161j0(this.onPaymentFailedAction);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public IntlPurchasePagePaymentView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    public /* synthetic */ IntlPurchasePagePaymentView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
