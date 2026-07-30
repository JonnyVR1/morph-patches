package com.p051p1.mobile.putong.core.p058ui.purchase.intlpage;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IapAffiliatePromotion;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.Prices;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.a30;
import p153l.bnl0;
import p153l.din;
import p153l.jbc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.qa00;
import p153l.wib0;
import p153l.y20;
import p153l.z7a;
import p153l.z8p;
import p153l.zwk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00152\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J+\u0010&\u001a\u00020\u00152\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010#¢\u0006\u0004\b&\u0010'J)\u0010)\u001a\u00020\u00152\u001a\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0011\u0018\u00010#¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020\u0015¢\u0006\u0004\b*\u0010\u0019J\u000f\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010\u0019J\u000f\u0010,\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010\u0019J\u0019\u0010-\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b-\u0010\u001dJ\u001f\u00101\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J\u0017\u00103\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b3\u00105J\u0017\u0010:\u001a\u00020\u00112\u0006\u00103\u001a\u00020.H\u0002¢\u0006\u0004\b:\u00105R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010IR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010KR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010LR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010MR$\u0010T\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010UR,\u0010X\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0011\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010W¨\u0006Z"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePagePaymentView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "", "intlPromoFullscreenDiscountPayTracking", "", "h", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Z)V", "m", "()V", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "purchaseSection", "j", "(Lcom/p1/mobile/putong/core/ui/purchase/d;)V", "Ll/y20;", "", "dialogStateAction", "setDialogStateAction", "(Ll/y20;)V", "Ll/a30;", "Lcom/p1/mobile/android/app/Act;", "onPaySuccess", "setOnPaymentSuccess", "(Ll/a30;)V", "failed", "setOnPaymentFailed", "k", "g", "n", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "sectionDetail", "highLightColor", "f", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;I)V", Constants.INAPP_DATA_TAG, "b", "(Lcom/p1/mobile/putong/core/ui/purchase/d$a;)Ljava/lang/String;", "currencySymbol", "numericOrFormatted", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "c", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_renewal_detail", "()Landroid/widget/TextView;", "set_renewal_detail", "(Landroid/widget/TextView;)V", "_renewal_detail", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "get_payment", "()Landroid/widget/FrameLayout;", "set_payment", "(Landroid/widget/FrameLayout;)V", "_payment", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "Z", "Ll/din;", "Ll/din;", "getPaymentComponent", "()Ll/din;", "setPaymentComponent", "(Ll/din;)V", "paymentComponent", "Ll/y20;", RXScreenCaptureService.KEY_INDEX, "Ll/a30;", "onPaymentSuccessAction", "onPaymentFailedAction", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public din paymentComponent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public y20<Integer> dialogStateAction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccessAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlPurchasePagePaymentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        Activity activityM105506D = bnl0.m105506D(getContext());
        activityM105506D.getClass();
        Act act = (Act) activityM105506D;
        this.act = act;
        this.from = "p_purchase_page";
        LayoutInflater layoutInflaterInflater = act.inflater();
        layoutInflaterInflater.getClass();
        m55105a(layoutInflaterInflater, this);
        setOrientation(1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m55104i(IntlPurchasePagePaymentView intlPurchasePagePaymentView, PurchaseType purchaseType, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        intlPurchasePagePaymentView.m55112h(purchaseType, str, z);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m55105a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM219016b = z8p.m219016b(this, inflater, parent);
        viewM219016b.getClass();
        return viewM219016b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: b */
    public final String m55106b(C8928d.a d) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        int iM54788w;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        Merchandise merchandiseM54784s = d.m54784s();
        if (merchandiseM54784s == null || (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String strM54766h = d.m54766h();
        if (strM54766h == null) {
            strM54766h = prices.currencySymbol;
            if (strM54766h == null) {
                strM54766h = "";
            }
        } else {
            if (strM54766h.length() <= 0) {
                strM54766h = null;
            }
            if (strM54766h == null) {
                strM54766h = prices.currencySymbol;
                if (strM54766h == null) {
                    strM54766h = "";
                }
            }
        }
        if (d.m54788w() > 0) {
            iM54788w = d.m54788w();
        } else {
            iM54788w = merchandiseM54784s.quantity;
            if (iM54788w <= 0) {
                iM54788w = 1;
            }
        }
        double d2 = prices.originalPrice;
        if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d3 = prices.originalUnitPrice;
            d2 = d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? d3 * ((double) iM54788w) : 0.0d;
        }
        if (d2 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || strM54766h.length() <= 0) {
            String strM54770j = d.m54770j();
            String string = strM54770j != null ? StringsKt.m94324Z0(strM54770j).toString() : null;
            return m55109e(strM54766h, string != null ? string : "");
        }
        return strM54766h + numberInstance.format(d2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX INFO: renamed from: c */
    public final String m55107c(C8928d.a d) {
        StockKeepUnit stockKeepUnit;
        Prices prices;
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        Merchandise merchandiseM54784s = d.m54784s();
        if (merchandiseM54784s == null || (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) == null || (prices = stockKeepUnit.prices) == null) {
            return "";
        }
        String strM54766h = d.m54766h();
        if (strM54766h == null) {
            strM54766h = prices.currencySymbol;
            if (strM54766h == null) {
                strM54766h = "";
            }
        } else {
            if (strM54766h.length() <= 0) {
                strM54766h = null;
            }
            if (strM54766h == null) {
                strM54766h = prices.currencySymbol;
                if (strM54766h == null) {
                    strM54766h = "";
                }
            }
        }
        double dCeil = prices.originalUnitPrice;
        if (dCeil >= 100.0d) {
            dCeil = Math.ceil(dCeil);
        }
        if (dCeil <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || strM54766h.length() <= 0) {
            String strM54772k = d.m54772k();
            String string = strM54772k != null ? StringsKt.m94324Z0(strM54772k).toString() : null;
            return m55109e(strM54766h, string != null ? string : "");
        }
        return strM54766h + numberInstance.format(dCeil);
    }

    /* JADX INFO: renamed from: d */
    public final String m55108d(C8928d.a d) {
        int iM54788w;
        if (d.m54788w() > 0) {
            iM54788w = d.m54788w();
        } else {
            iM54788w = d.m54784s().quantity;
            if (iM54788w <= 0) {
                iM54788w = 1;
            }
        }
        return String.valueOf(iM54788w);
    }

    /* JADX INFO: renamed from: e */
    public final String m55109e(String currencySymbol, String numericOrFormatted) {
        String string = StringsKt.m94324Z0(numericOrFormatted).toString();
        if (string.length() == 0) {
            return "";
        }
        if (currencySymbol.length() <= 0 || C15493d.m94374J(string, currencySymbol, false, 2, null)) {
            return string;
        }
        return currencySymbol + string;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: f */
    public final void m55110f(C8928d.a sectionDetail, int highLightColor) {
        String string;
        int i;
        String strString = this.act.string(R$string.f28301g4);
        String strString2 = this.act.string(R$string.f28289f4);
        if (CoreModule.f18264c.f20438x0.m31193c4()) {
            IapAffiliatePromotion iapAffiliatePromotionM31169E3 = CoreModule.f18264c.f20438x0.m31169E3();
            if (iapAffiliatePromotionM31169E3 == null) {
                i = 1;
            } else {
                if (iapAffiliatePromotionM31169E3.ftDays <= 0) {
                    iapAffiliatePromotionM31169E3 = null;
                }
                if (iapAffiliatePromotionM31169E3 != null) {
                    i = iapAffiliatePromotionM31169E3.ftDays;
                } else {
                    i = 1;
                }
            }
            string = this.act.getString(R$string.f27952B2, Integer.valueOf(i), m55107c(sectionDetail));
        } else {
            string = this.act.getString(R$string.f28474v2, m55106b(sectionDetail), m55108d(sectionDetail));
        }
        string.getClass();
        get_renewal_detail().setText(z7a.m218879v0(z7a.m218874q0(this.act, string, strString, zwk.m221910j(), strString2, zwk.m221909i()), jyb.m147507f0(strString, strString2), highLightColor, lyh0.m156283c(3)));
        get_renewal_detail().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: g */
    public final void m55111g() {
        PurchaseType purchaseType = this.purchaseType;
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206573q(purchaseType)) {
            setBackgroundResource(jbc0.f119778u1);
            return;
        }
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        if (wib0.m206578v(purchaseType2)) {
            setBackgroundResource(jbc0.f119792v1);
        } else {
            setBackgroundResource(jbc0.f119708p1);
        }
    }

    @Nullable
    public final din getPaymentComponent() {
        return this.paymentComponent;
    }

    @NotNull
    public final FrameLayout get_payment() {
        FrameLayout frameLayout = this._payment;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_payment");
        return null;
    }

    @NotNull
    public final TextView get_renewal_detail() {
        TextView textView = this._renewal_detail;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_renewal_detail");
        return null;
    }

    @JvmOverloads
    /* JADX INFO: renamed from: h */
    public final void m55112h(@NotNull PurchaseType purchaseType, @Nullable String from, boolean intlPromoFullscreenDiscountPayTracking) {
        purchaseType.getClass();
        this.purchaseType = purchaseType;
        this.from = from;
        this.intlPromoFullscreenDiscountPayTracking = intlPromoFullscreenDiscountPayTracking;
    }

    /* JADX INFO: renamed from: j */
    public final void m55113j(@Nullable C8928d purchaseSection) {
        if (purchaseSection == null) {
            return;
        }
        m55115l(purchaseSection);
    }

    /* JADX INFO: renamed from: k */
    public final void m55114k() {
        din dinVar = this.paymentComponent;
        if (dinVar != null) {
            dinVar.release();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m55115l(C8928d purchaseSection) {
        bnl0.m105524M(get_renewal_detail(), true);
        get_renewal_detail().setHighlightColor(0);
        int color = Color.parseColor("#4d000000");
        PurchaseType purchaseType = this.purchaseType;
        C8928d.a aVarM54703b = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206573q(purchaseType)) {
            color = Color.parseColor("#4dffffff");
        } else {
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType2 = null;
            }
            if (wib0.m206578v(purchaseType2)) {
                color = Color.parseColor("#80FFFFFF");
            } else if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.f18264c.f20438x0.m31184N3()) {
                color = Color.parseColor("#4DFFFFFF");
            }
        }
        int color2 = Color.parseColor("#FE7E1D");
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType3 = null;
        }
        if (wib0.m206573q(purchaseType3)) {
            color2 = Color.parseColor("#EDD7A3");
        } else {
            PurchaseType purchaseType4 = this.purchaseType;
            if (purchaseType4 == null) {
                Intrinsics.m88391r("purchaseType");
                purchaseType4 = null;
            }
            if (wib0.m206578v(purchaseType4)) {
                color2 = Color.parseColor("#F9E7FF");
            } else if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.f18264c.f20438x0.m31184N3()) {
                color2 = Color.parseColor("#EDD7A3");
            }
        }
        get_renewal_detail().setTextColor(color);
        if (this.intlPromoFullscreenDiscountPayTracking && CoreModule.f18264c.f20438x0.m31184N3()) {
            get_renewal_detail().setTextSize(2, 9.0f);
            get_renewal_detail().setLineSpacing(qa00.m175859d(1.0f), 1.0f);
            int iM175859d = qa00.m175859d(24.0f);
            ViewGroup.LayoutParams layoutParams = get_renewal_detail().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(iM175859d, 0, iM175859d, 0);
            }
        } else {
            get_renewal_detail().setTextSize(2, 11.0f);
            get_renewal_detail().setLineSpacing(qa00.m175859d(1.0f), 1.0f);
            int iM175859d2 = qa00.m175859d(15.0f);
            ViewGroup.LayoutParams layoutParams2 = get_renewal_detail().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.setMargins(iM175859d2, 0, iM175859d2, 0);
            }
        }
        if (purchaseSection != null) {
            C8928d.a aVarM54705d = purchaseSection.m54705d();
            aVarM54703b = aVarM54705d == null ? purchaseSection.m54703b() : aVarM54705d;
        }
        boolean z = aVarM54703b != null && CoreModule.f18264c.f20311G2.m153653k3(aVarM54703b.m54762f());
        if (this.intlPromoFullscreenDiscountPayTracking && !z && aVarM54703b != null && CoreModule.f18264c.f20438x0.m31184N3()) {
            m55110f(aVarM54703b, color2);
            return;
        }
        int i = IntlCountryCodeController.m29114k() ? R$string.f28287f2 : R$string.f28265d4;
        if (z) {
            i = R$string.f28277e4;
        }
        Act act = this.act;
        get_renewal_detail().setText(z7a.m218879v0(z7a.m218874q0(act, act.getString(i, act.string(R$string.f28301g4), this.act.string(R$string.f28289f4)), this.act.string(R$string.f28301g4), zwk.m221910j(), this.act.string(R$string.f28289f4), zwk.m221909i()), jyb.m147507f0(this.act.string(R$string.f28301g4), this.act.string(R$string.f28289f4)), color2, lyh0.m156283c(3)));
        get_renewal_detail().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: m */
    public final void m55116m() {
        m55111g();
        m55117n();
        m55115l(null);
    }

    /* JADX INFO: renamed from: n */
    public final void m55117n() {
        PurchaseType purchaseType;
        if (this.paymentComponent != null || (purchaseType = this.purchaseType) == null) {
            return;
        }
        PurchaseType purchaseType2 = null;
        if (purchaseType == null) {
            Intrinsics.m88391r("purchaseType");
            purchaseType = null;
        }
        if (wib0.m206575s(purchaseType)) {
            bnl0.m105540X(get_payment(), qa00.m175859d(30.0f));
        } else {
            bnl0.m105540X(get_payment(), 0);
        }
        Act act = this.act;
        PurchaseType purchaseType3 = this.purchaseType;
        if (purchaseType3 == null) {
            Intrinsics.m88391r("purchaseType");
        } else {
            purchaseType2 = purchaseType3;
        }
        din dinVar = new din(act, purchaseType2);
        this.paymentComponent = dinVar;
        get_payment().addView(dinVar.mo115924a(get_payment(), false));
        dinVar.mo138227c(this.from);
        dinVar.m115934g1(this.intlPromoFullscreenDiscountPayTracking);
        dinVar.m140784i0(this.intlPromoFullscreenDiscountPayTracking);
        dinVar.mo115937i(this.dialogStateAction);
        dinVar.m140786k0(this.onPaymentSuccessAction);
        dinVar.m140785j0(this.onPaymentFailedAction);
    }

    public final void setDialogStateAction(@Nullable y20<Integer> dialogStateAction) {
        this.dialogStateAction = dialogStateAction;
    }

    public final void setOnPaymentFailed(@Nullable a30<PurchaseType, Act, String> failed) {
        this.onPaymentFailedAction = failed;
    }

    public final void setOnPaymentSuccess(@Nullable a30<PurchaseType, Act, String> onPaySuccess) {
        this.onPaymentSuccessAction = onPaySuccess;
    }

    public final void setPaymentComponent(@Nullable din dinVar) {
        this.paymentComponent = dinVar;
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
