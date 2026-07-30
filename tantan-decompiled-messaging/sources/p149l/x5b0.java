package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.StockKeepUnit;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.data.PayMethod;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b#\u0010$J9\u0010*\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b*\u0010+J1\u0010-\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010.J1\u0010/\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b/\u0010.JI\u00100\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010:R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010=¨\u0006?"}, m87232d2 = {"Ll/x5b0;", "Ll/hab0;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "productCategory", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;", "pageType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "pageShowParam", "", "defaultSelect", "m", "(Ljava/util/List;Lorg/json/JSONObject;I)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/util/List;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "purchaseSection", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lorg/json/JSONObject;)Lorg/json/JSONObject;", Merchandise.TYPE, "j", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "g", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/data/PayMethod;", "curPayMethod", "", "showTotalPrice", "autoPay", "f", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZLorg/json/JSONObject;)Lorg/json/JSONObject;", "buttonType", Constants.INAPP_DATA_TAG, "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "b", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;ZLcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/data/Merchandise;ZZ)Lorg/json/JSONObject;", "h", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "currentPurchaseSection", "Ll/bi60;", "paymentTextResponseData", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/bi60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;", "Ljava/lang/String;", "Ljava/text/DecimalFormat;", "Ljava/text/DecimalFormat;", "realPayDf", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class x5b0 extends hab0 {

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
    public x5b0(@NotNull ProductCategory productCategory, @NotNull PurchaseTrackPageType purchaseTrackPageType, @Nullable String str) {
        super(vek0.m198207g(CoreModule.m29931H().userId() + mqi0.m155944o()));
        productCategory.getClass();
        purchaseTrackPageType.getClass();
        this.productCategory = productCategory;
        this.pageType = purchaseTrackPageType;
        this.from = str;
        this.from = w2b0.m201088b(str);
        this.realPayDf = new DecimalFormat("#.##");
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: a */
    public JSONObject mo130102a(@NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean showTotalPrice, @NotNull PayMethod curPayMethod, @NotNull Merchandise merchandise, boolean autoPay, boolean buttonType) {
        purchaseType.getClass();
        curPayMethod.getClass();
        merchandise.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        boolean zM81303a = NullChecker.m81303a(iab0.m135142c(merchandise.localCoupons));
        DecimalFormat decimalFormat = this.realPayDf;
        String str = zM81303a ? decimalFormat.format(merchandise.getFirstCouponPrice()) : decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        try {
            jSONObjectM135147h.put("show_price", iab0.m135143d(Boolean.valueOf(showTotalPrice), "false"));
            jSONObjectM135147h.put(FirebaseAnalytics.Param.PRICE, str);
            jSONObjectM135147h.put(BLiveOperationTitleShowType.duration, iab0.m135144e(merchandise));
            jSONObjectM135147h.put("platform", curPayMethod.toString());
            jSONObjectM135147h.put("coupon", rxa0.m181486g(this.pageType, merchandise.localCoupons));
            jSONObjectM135147h.put("skuID", merchandise.defaultStockKeepUnit.f20507id);
            jSONObjectM135147h.put("productType", purchaseType.productCategory().toString());
            jSONObjectM135147h.put("if_password_free", iab0.m135143d(Boolean.valueOf(autoPay), "false"));
            jSONObjectM135147h.put("button_type", buttonType ? BLiveVoiceSingTogehterState.confirm : "refuse");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: b */
    public JSONObject mo130103b(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        C8765d.a aVarM53520b = paymentHandlerData.getCurrentPurchaseSection().m53531m() ? paymentHandlerData.getCurrentPurchaseSection().m53520b() : paymentHandlerData.getCurrentPurchaseSection().m53522d();
        Merchandise merchandiseM53601s = aVarM53520b.m53601s();
        try {
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM135147h.put("show_price", iab0.m135143d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM135147h.put(FirebaseAnalytics.Param.PRICE, iab0.m135148i(aVarM53520b));
            jSONObjectM135147h.put(BLiveOperationTitleShowType.duration, iab0.m135144e(merchandiseM53601s));
            jSONObjectM135147h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM135147h.put("coupon", rxa0.m181486g(this.pageType, merchandiseM53601s != null ? merchandiseM53601s.localCoupons : null));
            jSONObjectM135147h.put("skuID", (merchandiseM53601s == null || (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f20507id);
            jSONObjectM135147h.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM135147h.put("if_password_free", iab0.m135143d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
            jSONObjectM135147h.put("button_type", buttonType ? BLiveVoiceSingTogehterState.confirm : "refuse");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: d */
    public JSONObject mo130105d(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        C8765d.a aVarM53520b = paymentHandlerData.getCurrentPurchaseSection().m53531m() ? paymentHandlerData.getCurrentPurchaseSection().m53520b() : paymentHandlerData.getCurrentPurchaseSection().m53522d();
        Merchandise merchandiseM53601s = aVarM53520b.m53601s();
        try {
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM135147h.put("show_price", iab0.m135143d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM135147h.put(FirebaseAnalytics.Param.PRICE, iab0.m135148i(aVarM53520b));
            jSONObjectM135147h.put(BLiveOperationTitleShowType.duration, iab0.m135144e(merchandiseM53601s));
            jSONObjectM135147h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM135147h.put("coupon", rxa0.m181486g(this.pageType, merchandiseM53601s != null ? merchandiseM53601s.localCoupons : null));
            jSONObjectM135147h.put("skuID", (merchandiseM53601s == null || (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f20507id);
            jSONObjectM135147h.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM135147h.put("if_password_free", iab0.m135143d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
            jSONObjectM135147h.put("button_type", buttonType ? BLiveVoiceSingTogehterState.confirm : "refuse");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: e */
    public JSONObject mo130106e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", this.from);
            jSONObject.put("default_product", this.productCategory.toString());
            jSONObject.put("productType", m130104c().toString());
            jSONObject.put("purchase_page_type", this.pageType.name());
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put("ttc_page_type", this.pageType.name().toString());
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: f */
    public JSONObject mo130107f(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay, @Nullable JSONObject pageShowParam) {
        merchandise.getClass();
        curPayMethod.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        boolean zM81303a = NullChecker.m81303a(iab0.m135142c(merchandise.localCoupons));
        DecimalFormat decimalFormat = this.realPayDf;
        String str = zM81303a ? decimalFormat.format(merchandise.getFirstCouponPrice()) : decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        try {
            jSONObjectM135147h.put("purchaseShowFrom", this.from);
            jSONObjectM135147h.put("purchase_page_type", this.pageType.name());
            jSONObjectM135147h.put("default_product", this.productCategory.toString());
            jSONObjectM135147h.put("show_price", iab0.m135143d(Boolean.valueOf(showTotalPrice), "false"));
            jSONObjectM135147h.put(FirebaseAnalytics.Param.PRICE, str);
            jSONObjectM135147h.put(BLiveOperationTitleShowType.duration, iab0.m135144e(merchandise));
            jSONObjectM135147h.put("platform", curPayMethod.toString());
            jSONObjectM135147h.put("coupon", rxa0.m181486g(this.pageType, merchandise.localCoupons));
            jSONObjectM135147h.put("skuID", merchandise.defaultStockKeepUnit.f20507id);
            jSONObjectM135147h.put("productType", merchandise.category.toString());
            jSONObjectM135147h.put("if_password_free", iab0.m135143d(Boolean.valueOf(autoPay), "false"));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: g */
    public JSONObject mo130108g(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        C8765d.a aVarM53520b = paymentHandlerData.getCurrentPurchaseSection().m53531m() ? paymentHandlerData.getCurrentPurchaseSection().m53520b() : paymentHandlerData.getCurrentPurchaseSection().m53522d();
        Merchandise merchandiseM53601s = aVarM53520b.m53601s();
        try {
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM135147h.put("show_price", iab0.m135143d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM135147h.put(FirebaseAnalytics.Param.PRICE, iab0.m135148i(aVarM53520b));
            jSONObjectM135147h.put(BLiveOperationTitleShowType.duration, iab0.m135144e(merchandiseM53601s));
            jSONObjectM135147h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM135147h.put("coupon", rxa0.m181486g(this.pageType, merchandiseM53601s != null ? merchandiseM53601s.localCoupons : null));
            jSONObjectM135147h.put("skuID", (merchandiseM53601s == null || (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f20507id);
            jSONObjectM135147h.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM135147h.put("if_password_free", iab0.m135143d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: h */
    public JSONObject mo130109h(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObject = new JSONObject();
        C8765d.a aVarM53520b = paymentHandlerData.getCurrentPurchaseSection().m53531m() ? paymentHandlerData.getCurrentPurchaseSection().m53520b() : paymentHandlerData.getCurrentPurchaseSection().m53522d();
        Merchandise merchandiseM53601s = aVarM53520b.m53601s();
        try {
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, iab0.m135148i(aVarM53520b));
            jSONObject.put(BLiveOperationTitleShowType.duration, iab0.m135144e(merchandiseM53601s));
            jSONObject.put("coupon", rxa0.m181486g(this.pageType, merchandiseM53601s != null ? merchandiseM53601s.localCoupons : null));
            jSONObject.put("skuID", (merchandiseM53601s == null || (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) == null) ? null : stockKeepUnit.f20507id);
            jSONObject.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObject.put("tag_content", paymentTextResponseData != null ? paymentTextResponseData.getSticker() : null);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: i */
    public JSONObject mo130110i(@NotNull C8765d currentPurchaseSection, @NotNull bi60 paymentTextResponseData, @NotNull PurchaseType purchaseType) {
        StockKeepUnit stockKeepUnit;
        currentPurchaseSection.getClass();
        paymentTextResponseData.getClass();
        purchaseType.getClass();
        JSONObject jSONObject = new JSONObject();
        C8765d.a aVarM53520b = currentPurchaseSection.m53531m() ? currentPurchaseSection.m53520b() : currentPurchaseSection.m53522d();
        Merchandise merchandiseM53601s = aVarM53520b.m53601s();
        try {
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, iab0.m135148i(aVarM53520b));
            jSONObject.put(BLiveOperationTitleShowType.duration, iab0.m135144e(merchandiseM53601s));
            String str = null;
            jSONObject.put("coupon", rxa0.m181486g(this.pageType, merchandiseM53601s != null ? merchandiseM53601s.localCoupons : null));
            if (merchandiseM53601s != null && (stockKeepUnit = merchandiseM53601s.defaultStockKeepUnit) != null) {
                str = stockKeepUnit.f20507id;
            }
            jSONObject.put("skuID", str);
            jSONObject.put("productType", purchaseType.productCategory().toString());
            jSONObject.put("tag_content", paymentTextResponseData.getSticker());
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return jSONObject;
        }
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: j */
    public JSONObject mo130111j(@NotNull Merchandise merchandise, @Nullable JSONObject pageShowParam) {
        merchandise.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        try {
            jSONObjectM135147h.put("choose_duration", iab0.m135144e(merchandise));
            jSONObjectM135147h.put("choose_coupon", rxa0.m181486g(this.pageType, merchandise.localCoupons));
            jSONObjectM135147h.put("choose_price", iab0.m135141b(this.realPayDf.format(merchandise.getFirstCouponPrice())));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: k */
    public JSONObject mo130112k(@NotNull C8765d purchaseSection, @Nullable JSONObject pageShowParam) {
        Merchandise merchandiseM53601s;
        purchaseSection.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        if (purchaseSection.m53531m()) {
            C8765d.a aVarM53520b = purchaseSection.m53520b();
            if (aVarM53520b != null) {
                merchandiseM53601s = aVarM53520b.m53601s();
            } else {
                merchandiseM53601s = null;
            }
        } else {
            C8765d.a aVarM53522d = purchaseSection.m53522d();
            if (aVarM53522d != null) {
                merchandiseM53601s = aVarM53522d.m53601s();
            } else {
                merchandiseM53601s = null;
            }
        }
        String strM135148i = purchaseSection.m53531m() ? iab0.m135148i(purchaseSection.m53520b()) : iab0.m135148i(purchaseSection.m53522d());
        try {
            jSONObjectM135147h.put("choose_duration", iab0.m135144e(merchandiseM53601s));
            jSONObjectM135147h.put("choose_coupon", rxa0.m181486g(this.pageType, merchandiseM53601s != null ? merchandiseM53601s.localCoupons : null));
            jSONObjectM135147h.put("choose_price", iab0.m135141b(strM135148i));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: l */
    public JSONObject mo130113l(@NotNull List<? extends C8765d> sections, @Nullable JSONObject pageShowParam) {
        List<Coupon> list;
        C8765d next;
        String strM135144e;
        String strM135148i;
        C8765d.a aVarM53522d;
        Merchandise merchandiseM53601s;
        C8765d.a aVarM53522d2;
        Merchandise merchandiseM53601s2;
        sections.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        Iterator<? extends C8765d> it = sections.iterator();
        do {
            list = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.m53530l());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String strM200307U = vwb.m200307U(iab0.m135149j(sections), Constants.SEPARATOR_COMMA);
        for (C8765d c8765d : sections) {
            if (c8765d.m53531m()) {
                sb2.append(iab0.m135148i(c8765d.m53520b()));
                sb2.append(Constants.SEPARATOR_COMMA);
                C8765d.a aVarM53520b = c8765d.m53520b();
                sb.append(iab0.m135144e(aVarM53520b != null ? aVarM53520b.m53601s() : null));
                sb.append(Constants.SEPARATOR_COMMA);
            } else {
                sb2.append(iab0.m135148i(c8765d.m53522d()));
                sb2.append(Constants.SEPARATOR_COMMA);
                C8765d.a aVarM53522d3 = c8765d.m53522d();
                sb.append(iab0.m135144e(aVarM53522d3 != null ? aVarM53522d3.m53601s() : null));
                sb.append(Constants.SEPARATOR_COMMA);
            }
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String strM181486g = "default";
        if (next == null || !next.m53531m()) {
            strM135144e = iab0.m135144e((next == null || (aVarM53522d2 = next.m53522d()) == null) ? null : aVarM53522d2.m53601s());
            strM135144e.getClass();
            strM135148i = iab0.m135148i(next != null ? next.m53522d() : null);
            strM135148i.getClass();
            if (iab0.m135151l(next != null ? next.m53522d() : null)) {
                PurchaseTrackPageType purchaseTrackPageType = this.pageType;
                if (next != null && (aVarM53522d = next.m53522d()) != null && (merchandiseM53601s = aVarM53522d.m53601s()) != null) {
                    list = merchandiseM53601s.localCoupons;
                }
                strM181486g = rxa0.m181486g(purchaseTrackPageType, list);
                strM181486g.getClass();
            }
        } else {
            C8765d.a aVarM53520b2 = next.m53520b();
            strM135144e = iab0.m135144e(aVarM53520b2 != null ? aVarM53520b2.m53601s() : null);
            strM135144e.getClass();
            strM135148i = iab0.m135148i(next.m53520b());
            strM135148i.getClass();
            if (iab0.m135151l(next.m53520b())) {
                PurchaseTrackPageType purchaseTrackPageType2 = this.pageType;
                C8765d.a aVarM53520b3 = next.m53520b();
                if (aVarM53520b3 != null && (merchandiseM53601s2 = aVarM53520b3.m53601s()) != null) {
                    list = merchandiseM53601s2.localCoupons;
                }
                strM181486g = rxa0.m181486g(purchaseTrackPageType2, list);
                strM181486g.getClass();
            }
        }
        try {
            jSONObjectM135147h.put("default_duration", strM135144e);
            jSONObjectM135147h.put("default_coupon", strM181486g);
            jSONObjectM135147h.put("default_price", strM135148i);
            jSONObjectM135147h.put("duration_group", sb.toString());
            jSONObjectM135147h.put("price_group", sb2.toString());
            jSONObjectM135147h.put("skuGroup", strM200307U);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }

    @Override // p149l.hab0
    @NotNull
    /* JADX INFO: renamed from: m */
    public JSONObject mo130114m(@NotNull List<? extends Merchandise> merchandises, @Nullable JSONObject pageShowParam, int defaultSelect) {
        merchandises.getClass();
        JSONObject jSONObjectM135147h = iab0.m135147h(pageShowParam);
        if (vwb.m200296J(merchandises)) {
            jSONObjectM135147h.getClass();
            return jSONObjectM135147h;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : merchandises) {
            if (NullChecker.m81303a(iab0.m135142c(merchandise.localCoupons))) {
                sb2.append(merchandise.getFirstCouponPrice());
                sb2.append(Constants.SEPARATOR_COMMA);
            } else {
                sb2.append(this.realPayDf.format(merchandise.defaultStockKeepUnit.prices.price));
                sb2.append(Constants.SEPARATOR_COMMA);
            }
            String str = merchandise.defaultStockKeepUnit.f20507id;
            str.getClass();
            arrayList.add(str);
            sb.append(iab0.m135144e(merchandise));
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
            jSONObjectM135147h.put("default_duration", iab0.m135144e(merchandise2));
            jSONObjectM135147h.put("default_coupon", rxa0.m181486g(this.pageType, merchandise2.localCoupons));
            jSONObjectM135147h.put("default_price", this.realPayDf.format(merchandise2.getFirstCouponPrice()));
            jSONObjectM135147h.put("duration_group", sb.toString());
            jSONObjectM135147h.put("price_group", sb2.toString());
            jSONObjectM135147h.put("skuGroup", vwb.m200307U(arrayList, Constants.SEPARATOR_COMMA));
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        jSONObjectM135147h.getClass();
        return jSONObjectM135147h;
    }
}
