package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.StockKeepUnit;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.data.PayMethod;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b#\u0010$J9\u0010*\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b*\u0010+J1\u0010-\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010.J1\u0010/\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b/\u0010.JI\u00100\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010:R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010=¨\u0006?"}, m88121d2 = {"Ll/beb0;", "Ll/lib0;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "productCategory", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;", "pageType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "pageShowParam", "", "defaultSelect", "m", "(Ljava/util/List;Lorg/json/JSONObject;I)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/util/List;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "purchaseSection", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lorg/json/JSONObject;)Lorg/json/JSONObject;", Merchandise.TYPE, "j", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Ll/jn60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "g", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/data/PayMethod;", "curPayMethod", "", "showTotalPrice", "autoPay", "f", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZLorg/json/JSONObject;)Lorg/json/JSONObject;", "buttonType", Constants.INAPP_DATA_TAG, "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "b", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;ZLcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/data/Merchandise;ZZ)Lorg/json/JSONObject;", "h", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "currentPurchaseSection", "Ll/gq60;", "paymentTextResponseData", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/gq60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;", "Ljava/lang/String;", "Ljava/text/DecimalFormat;", "Ljava/text/DecimalFormat;", "realPayDf", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class beb0 extends lib0 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ProductCategory productCategory;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final PurchaseTrackPageType pageType;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public String from;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public DecimalFormat realPayDf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beb0(@NotNull ProductCategory productCategory, @NotNull PurchaseTrackPageType purchaseTrackPageType, @Nullable String str) {
        super(bok0.m105703g(CoreModule.m30929H().userId() + pzi0.m174454o()));
        productCategory.getClass();
        purchaseTrackPageType.getClass();
        this.productCategory = productCategory;
        this.pageType = purchaseTrackPageType;
        this.from = str;
        this.from = abb0.m96735b(str);
        this.realPayDf = new DecimalFormat("#.##");
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: a */
    public JSONObject mo103689a(@NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean showTotalPrice, @NotNull PayMethod curPayMethod, @NotNull Merchandise merchandise, boolean autoPay, boolean buttonType) {
        purchaseType.getClass();
        curPayMethod.getClass();
        merchandise.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        boolean zM82486a = NullChecker.m82486a(mib0.m158474c(merchandise.localCoupons));
        DecimalFormat decimalFormat = this.realPayDf;
        String str = zM82486a ? decimalFormat.format(merchandise.getFirstCouponPrice()) : decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        try {
            jSONObjectM158479h.put("show_price", mib0.m158475d(Boolean.valueOf(showTotalPrice), "false"));
            jSONObjectM158479h.put(FirebaseAnalytics.Param.PRICE, str);
            jSONObjectM158479h.put(BLiveOperationTitleShowType.duration, mib0.m158476e(merchandise));
            jSONObjectM158479h.put("platform", curPayMethod.toString());
            jSONObjectM158479h.put("coupon", v5b0.m199781g(this.pageType, merchandise.localCoupons));
            jSONObjectM158479h.put("skuID", merchandise.defaultStockKeepUnit.f21249id);
            jSONObjectM158479h.put("productType", purchaseType.productCategory().toString());
            jSONObjectM158479h.put("if_password_free", mib0.m158475d(Boolean.valueOf(autoPay), "false"));
            jSONObjectM158479h.put("button_type", buttonType ? BLiveVoiceSingTogehterState.confirm : "refuse");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: b */
    public JSONObject mo103690b(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        C8928d.a aVarM54703b = paymentHandlerData.getCurrentPurchaseSection().m54714m() ? paymentHandlerData.getCurrentPurchaseSection().m54703b() : paymentHandlerData.getCurrentPurchaseSection().m54705d();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        try {
            gq60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM158479h.put("show_price", mib0.m158475d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM158479h.put(FirebaseAnalytics.Param.PRICE, mib0.m158480i(aVarM54703b));
            jSONObjectM158479h.put(BLiveOperationTitleShowType.duration, mib0.m158476e(merchandiseM54784s));
            jSONObjectM158479h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM158479h.put("coupon", v5b0.m199781g(this.pageType, merchandiseM54784s != null ? merchandiseM54784s.localCoupons : null));
            jSONObjectM158479h.put("skuID", (merchandiseM54784s == null || (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f21249id);
            jSONObjectM158479h.put("productType", purchaseType.productCategory().toString());
            gq60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM158479h.put("if_password_free", mib0.m158475d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
            jSONObjectM158479h.put("button_type", buttonType ? BLiveVoiceSingTogehterState.confirm : "refuse");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: d */
    public JSONObject mo103691d(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        C8928d.a aVarM54703b = paymentHandlerData.getCurrentPurchaseSection().m54714m() ? paymentHandlerData.getCurrentPurchaseSection().m54703b() : paymentHandlerData.getCurrentPurchaseSection().m54705d();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        try {
            gq60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM158479h.put("show_price", mib0.m158475d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM158479h.put(FirebaseAnalytics.Param.PRICE, mib0.m158480i(aVarM54703b));
            jSONObjectM158479h.put(BLiveOperationTitleShowType.duration, mib0.m158476e(merchandiseM54784s));
            jSONObjectM158479h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM158479h.put("coupon", v5b0.m199781g(this.pageType, merchandiseM54784s != null ? merchandiseM54784s.localCoupons : null));
            jSONObjectM158479h.put("skuID", (merchandiseM54784s == null || (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f21249id);
            jSONObjectM158479h.put("productType", purchaseType.productCategory().toString());
            gq60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM158479h.put("if_password_free", mib0.m158475d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
            jSONObjectM158479h.put("button_type", buttonType ? BLiveVoiceSingTogehterState.confirm : "refuse");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: e */
    public JSONObject mo103692e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", this.from);
            jSONObject.put("default_product", this.productCategory.toString());
            jSONObject.put("productType", m154336c().toString());
            jSONObject.put("purchase_page_type", this.pageType.name());
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put("ttc_page_type", this.pageType.name().toString());
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: f */
    public JSONObject mo103693f(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay, @Nullable JSONObject pageShowParam) {
        merchandise.getClass();
        curPayMethod.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        boolean zM82486a = NullChecker.m82486a(mib0.m158474c(merchandise.localCoupons));
        DecimalFormat decimalFormat = this.realPayDf;
        String str = zM82486a ? decimalFormat.format(merchandise.getFirstCouponPrice()) : decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        try {
            jSONObjectM158479h.put("purchaseShowFrom", this.from);
            jSONObjectM158479h.put("purchase_page_type", this.pageType.name());
            jSONObjectM158479h.put("default_product", this.productCategory.toString());
            jSONObjectM158479h.put("show_price", mib0.m158475d(Boolean.valueOf(showTotalPrice), "false"));
            jSONObjectM158479h.put(FirebaseAnalytics.Param.PRICE, str);
            jSONObjectM158479h.put(BLiveOperationTitleShowType.duration, mib0.m158476e(merchandise));
            jSONObjectM158479h.put("platform", curPayMethod.toString());
            jSONObjectM158479h.put("coupon", v5b0.m199781g(this.pageType, merchandise.localCoupons));
            jSONObjectM158479h.put("skuID", merchandise.defaultStockKeepUnit.f21249id);
            jSONObjectM158479h.put("productType", merchandise.category.toString());
            jSONObjectM158479h.put("if_password_free", mib0.m158475d(Boolean.valueOf(autoPay), "false"));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: g */
    public JSONObject mo103694g(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        C8928d.a aVarM54703b = paymentHandlerData.getCurrentPurchaseSection().m54714m() ? paymentHandlerData.getCurrentPurchaseSection().m54703b() : paymentHandlerData.getCurrentPurchaseSection().m54705d();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        try {
            gq60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM158479h.put("show_price", mib0.m158475d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM158479h.put(FirebaseAnalytics.Param.PRICE, mib0.m158480i(aVarM54703b));
            jSONObjectM158479h.put(BLiveOperationTitleShowType.duration, mib0.m158476e(merchandiseM54784s));
            jSONObjectM158479h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM158479h.put("coupon", v5b0.m199781g(this.pageType, merchandiseM54784s != null ? merchandiseM54784s.localCoupons : null));
            jSONObjectM158479h.put("skuID", (merchandiseM54784s == null || (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f21249id);
            jSONObjectM158479h.put("productType", purchaseType.productCategory().toString());
            gq60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM158479h.put("if_password_free", mib0.m158475d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: h */
    public JSONObject mo103695h(@NotNull jn60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObject = new JSONObject();
        C8928d.a aVarM54703b = paymentHandlerData.getCurrentPurchaseSection().m54714m() ? paymentHandlerData.getCurrentPurchaseSection().m54703b() : paymentHandlerData.getCurrentPurchaseSection().m54705d();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        try {
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, mib0.m158480i(aVarM54703b));
            jSONObject.put(BLiveOperationTitleShowType.duration, mib0.m158476e(merchandiseM54784s));
            jSONObject.put("coupon", v5b0.m199781g(this.pageType, merchandiseM54784s != null ? merchandiseM54784s.localCoupons : null));
            jSONObject.put("skuID", (merchandiseM54784s == null || (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f21249id);
            jSONObject.put("productType", purchaseType.productCategory().toString());
            gq60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObject.put("tag_content", paymentTextResponseData != null ? paymentTextResponseData.getSticker() : null);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: i */
    public JSONObject mo103696i(@NotNull C8928d currentPurchaseSection, @NotNull gq60 paymentTextResponseData, @NotNull PurchaseType purchaseType) {
        StockKeepUnit stockKeepUnit;
        currentPurchaseSection.getClass();
        paymentTextResponseData.getClass();
        purchaseType.getClass();
        JSONObject jSONObject = new JSONObject();
        C8928d.a aVarM54703b = currentPurchaseSection.m54714m() ? currentPurchaseSection.m54703b() : currentPurchaseSection.m54705d();
        Merchandise merchandiseM54784s = aVarM54703b.m54784s();
        try {
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, mib0.m158480i(aVarM54703b));
            jSONObject.put(BLiveOperationTitleShowType.duration, mib0.m158476e(merchandiseM54784s));
            String str = null;
            jSONObject.put("coupon", v5b0.m199781g(this.pageType, merchandiseM54784s != null ? merchandiseM54784s.localCoupons : null));
            if (merchandiseM54784s != null && (stockKeepUnit = merchandiseM54784s.defaultStockKeepUnit) != null) {
                str = stockKeepUnit.f21249id;
            }
            jSONObject.put("skuID", str);
            jSONObject.put("productType", purchaseType.productCategory().toString());
            jSONObject.put("tag_content", paymentTextResponseData.getSticker());
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return jSONObject;
        }
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: j */
    public JSONObject mo103697j(@NotNull Merchandise merchandise, @Nullable JSONObject pageShowParam) {
        merchandise.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        try {
            jSONObjectM158479h.put("choose_duration", mib0.m158476e(merchandise));
            jSONObjectM158479h.put("choose_coupon", v5b0.m199781g(this.pageType, merchandise.localCoupons));
            jSONObjectM158479h.put("choose_price", mib0.m158473b(this.realPayDf.format(merchandise.getFirstCouponPrice())));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: k */
    public JSONObject mo103698k(@NotNull C8928d purchaseSection, @Nullable JSONObject pageShowParam) {
        Merchandise merchandiseM54784s;
        purchaseSection.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        if (purchaseSection.m54714m()) {
            C8928d.a aVarM54703b = purchaseSection.m54703b();
            if (aVarM54703b != null) {
                merchandiseM54784s = aVarM54703b.m54784s();
            } else {
                merchandiseM54784s = null;
            }
        } else {
            C8928d.a aVarM54705d = purchaseSection.m54705d();
            if (aVarM54705d != null) {
                merchandiseM54784s = aVarM54705d.m54784s();
            } else {
                merchandiseM54784s = null;
            }
        }
        String strM158480i = purchaseSection.m54714m() ? mib0.m158480i(purchaseSection.m54703b()) : mib0.m158480i(purchaseSection.m54705d());
        try {
            jSONObjectM158479h.put("choose_duration", mib0.m158476e(merchandiseM54784s));
            jSONObjectM158479h.put("choose_coupon", v5b0.m199781g(this.pageType, merchandiseM54784s != null ? merchandiseM54784s.localCoupons : null));
            jSONObjectM158479h.put("choose_price", mib0.m158473b(strM158480i));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: l */
    public JSONObject mo103699l(@NotNull List<? extends C8928d> sections, @Nullable JSONObject pageShowParam) {
        List<Coupon> list;
        C8928d next;
        String strM158476e;
        String strM158480i;
        C8928d.a aVarM54705d;
        Merchandise merchandiseM54784s;
        C8928d.a aVarM54705d2;
        Merchandise merchandiseM54784s2;
        sections.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        Iterator<? extends C8928d> it = sections.iterator();
        do {
            list = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.m54713l());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String strM147490U = jyb.m147490U(mib0.m158481j(sections), Constants.SEPARATOR_COMMA);
        for (C8928d c8928d : sections) {
            if (c8928d.m54714m()) {
                sb2.append(mib0.m158480i(c8928d.m54703b()));
                sb2.append(Constants.SEPARATOR_COMMA);
                C8928d.a aVarM54703b = c8928d.m54703b();
                sb.append(mib0.m158476e(aVarM54703b != null ? aVarM54703b.m54784s() : null));
                sb.append(Constants.SEPARATOR_COMMA);
            } else {
                sb2.append(mib0.m158480i(c8928d.m54705d()));
                sb2.append(Constants.SEPARATOR_COMMA);
                C8928d.a aVarM54705d3 = c8928d.m54705d();
                sb.append(mib0.m158476e(aVarM54705d3 != null ? aVarM54705d3.m54784s() : null));
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String strM199781g = "default";
        if (next == null || !next.m54714m()) {
            strM158476e = mib0.m158476e((next == null || (aVarM54705d2 = next.m54705d()) == null) ? null : aVarM54705d2.m54784s());
            strM158476e.getClass();
            strM158480i = mib0.m158480i(next != null ? next.m54705d() : null);
            strM158480i.getClass();
            if (mib0.m158483l(next != null ? next.m54705d() : null)) {
                PurchaseTrackPageType purchaseTrackPageType = this.pageType;
                if (next != null && (aVarM54705d = next.m54705d()) != null && (merchandiseM54784s = aVarM54705d.m54784s()) != null) {
                    list = merchandiseM54784s.localCoupons;
                }
                strM199781g = v5b0.m199781g(purchaseTrackPageType, list);
                strM199781g.getClass();
            }
        } else {
            C8928d.a aVarM54703b2 = next.m54703b();
            strM158476e = mib0.m158476e(aVarM54703b2 != null ? aVarM54703b2.m54784s() : null);
            strM158476e.getClass();
            strM158480i = mib0.m158480i(next.m54703b());
            strM158480i.getClass();
            if (mib0.m158483l(next.m54703b())) {
                PurchaseTrackPageType purchaseTrackPageType2 = this.pageType;
                C8928d.a aVarM54703b3 = next.m54703b();
                if (aVarM54703b3 != null && (merchandiseM54784s2 = aVarM54703b3.m54784s()) != null) {
                    list = merchandiseM54784s2.localCoupons;
                }
                strM199781g = v5b0.m199781g(purchaseTrackPageType2, list);
                strM199781g.getClass();
            }
        }
        try {
            jSONObjectM158479h.put("default_duration", strM158476e);
            jSONObjectM158479h.put("default_coupon", strM199781g);
            jSONObjectM158479h.put("default_price", strM158480i);
            jSONObjectM158479h.put("duration_group", sb.toString());
            jSONObjectM158479h.put("price_group", sb2.toString());
            jSONObjectM158479h.put("skuGroup", strM147490U);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }

    @Override // p153l.lib0
    @NotNull
    /* JADX INFO: renamed from: m */
    public JSONObject mo103700m(@NotNull List<? extends Merchandise> merchandises, @Nullable JSONObject pageShowParam, int defaultSelect) {
        merchandises.getClass();
        JSONObject jSONObjectM158479h = mib0.m158479h(pageShowParam);
        if (jyb.m147479J(merchandises)) {
            jSONObjectM158479h.getClass();
            return jSONObjectM158479h;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : merchandises) {
            if (NullChecker.m82486a(mib0.m158474c(merchandise.localCoupons))) {
                sb2.append(merchandise.getFirstCouponPrice());
                sb2.append(Constants.SEPARATOR_COMMA);
            } else {
                sb2.append(this.realPayDf.format(merchandise.defaultStockKeepUnit.prices.price));
                sb2.append(Constants.SEPARATOR_COMMA);
            }
            String str = merchandise.defaultStockKeepUnit.f21249id;
            str.getClass();
            arrayList.add(str);
            sb.append(mib0.m158476e(merchandise));
            sb.append(Constants.SEPARATOR_COMMA);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        Merchandise merchandise2 = merchandises.get(Math.min(merchandises.size() - 1, defaultSelect));
        try {
            jSONObjectM158479h.put("default_duration", mib0.m158476e(merchandise2));
            jSONObjectM158479h.put("default_coupon", v5b0.m199781g(this.pageType, merchandise2.localCoupons));
            jSONObjectM158479h.put("default_price", this.realPayDf.format(merchandise2.getFirstCouponPrice()));
            jSONObjectM158479h.put("duration_group", sb.toString());
            jSONObjectM158479h.put("price_group", sb2.toString());
            jSONObjectM158479h.put("skuGroup", jyb.m147490U(arrayList, Constants.SEPARATOR_COMMA));
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        jSONObjectM158479h.getClass();
        return jSONObjectM158479h;
    }
}
