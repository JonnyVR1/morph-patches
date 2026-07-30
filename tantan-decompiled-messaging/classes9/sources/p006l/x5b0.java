package p006l;

import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.StockKeepUnit;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import l.mqi0;
import l.rxa0;
import l.vek0;
import l.vwb;
import l.w2b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b#\u0010$J9\u0010*\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b*\u0010+J1\u0010-\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010.J1\u0010/\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b/\u0010.JI\u00100\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020'2\u0006\u0010,\u001a\u00020'H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00102\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b2\u00103J'\u00107\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00152\u0006\u00106\u001a\u0002052\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010:R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010=¨\u0006?"}, d2 = {"Ll/x5b0;", "Ll/hab0;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "productCategory", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;", "pageType", "", "from", "<init>", "(Lcom/p1/mobile/putong/core/data/ProductCategory;Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "", "Lcom/p1/mobile/putong/core/data/Merchandise;", "merchandises", "pageShowParam", "", "defaultSelect", "m", "(Ljava/util/List;Lorg/json/JSONObject;I)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "l", "(Ljava/util/List;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "purchaseSection", "k", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "merchandise", "j", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "g", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/data/PayMethod;", "curPayMethod", "", "showTotalPrice", "autoPay", "f", "(Lcom/p1/mobile/putong/core/data/Merchandise;Lcom/p1/mobile/putong/data/PayMethod;ZZLorg/json/JSONObject;)Lorg/json/JSONObject;", "buttonType", "d", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;Z)Lorg/json/JSONObject;", "b", "a", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lorg/json/JSONObject;ZLcom/p1/mobile/putong/data/PayMethod;Lcom/p1/mobile/putong/core/data/Merchandise;ZZ)Lorg/json/JSONObject;", "h", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "currentPurchaseSection", "Ll/bi60;", "paymentTextResponseData", "i", "(Lcom/p1/mobile/putong/core/ui/purchase/d;Ll/bi60;Lcom/p1/mobile/putong/core/data/PurchaseType;)Lorg/json/JSONObject;", "Lcom/p1/mobile/putong/core/data/ProductCategory;", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/track/PurchaseTrackPageType;", "Ljava/lang/String;", "Ljava/text/DecimalFormat;", "Ljava/text/DecimalFormat;", "realPayDf", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        super(vek0.g(CoreModule.m1850H().userId() + mqi0.o()));
        productCategory.getClass();
        purchaseTrackPageType.getClass();
        this.productCategory = productCategory;
        this.pageType = purchaseTrackPageType;
        this.from = str;
        this.from = w2b0.b(str);
        this.realPayDf = new DecimalFormat("#.##");
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: a */
    public JSONObject mo16109a(@NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean showTotalPrice, @NotNull PayMethod curPayMethod, @NotNull Merchandise merchandise, boolean autoPay, boolean buttonType) {
        purchaseType.getClass();
        curPayMethod.getClass();
        merchandise.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        boolean zA = NullChecker.a(iab0.m16576c(merchandise.localCoupons));
        DecimalFormat decimalFormat = this.realPayDf;
        String str = zA ? decimalFormat.format(merchandise.getFirstCouponPrice()) : decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        try {
            jSONObjectM16581h.put("show_price", iab0.m16577d(Boolean.valueOf(showTotalPrice), "false"));
            jSONObjectM16581h.put("price", str);
            jSONObjectM16581h.put("duration", iab0.m16578e(merchandise));
            jSONObjectM16581h.put("platform", curPayMethod.toString());
            jSONObjectM16581h.put("coupon", rxa0.g(this.pageType, merchandise.localCoupons));
            jSONObjectM16581h.put("skuID", merchandise.defaultStockKeepUnit.id);
            jSONObjectM16581h.put("productType", purchaseType.productCategory().toString());
            jSONObjectM16581h.put("if_password_free", iab0.m16577d(Boolean.valueOf(autoPay), "false"));
            jSONObjectM16581h.put("button_type", buttonType ? "confirm" : "refuse");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: b */
    public JSONObject mo16110b(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        d.a aVarB = paymentHandlerData.getCurrentPurchaseSection().m() ? paymentHandlerData.getCurrentPurchaseSection().b() : paymentHandlerData.getCurrentPurchaseSection().d();
        Merchandise merchandiseS = aVarB.s();
        try {
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM16581h.put("show_price", iab0.m16577d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM16581h.put("price", iab0.m16582i(aVarB));
            jSONObjectM16581h.put("duration", iab0.m16578e(merchandiseS));
            jSONObjectM16581h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM16581h.put("coupon", rxa0.g(this.pageType, merchandiseS != null ? merchandiseS.localCoupons : null));
            jSONObjectM16581h.put("skuID", (merchandiseS == null || (stockKeepUnit = merchandiseS.defaultStockKeepUnit) == null) ? null : stockKeepUnit.id);
            jSONObjectM16581h.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM16581h.put("if_password_free", iab0.m16577d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
            jSONObjectM16581h.put("button_type", buttonType ? "confirm" : "refuse");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: d */
    public JSONObject mo16112d(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam, boolean buttonType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        d.a aVarB = paymentHandlerData.getCurrentPurchaseSection().m() ? paymentHandlerData.getCurrentPurchaseSection().b() : paymentHandlerData.getCurrentPurchaseSection().d();
        Merchandise merchandiseS = aVarB.s();
        try {
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM16581h.put("show_price", iab0.m16577d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM16581h.put("price", iab0.m16582i(aVarB));
            jSONObjectM16581h.put("duration", iab0.m16578e(merchandiseS));
            jSONObjectM16581h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM16581h.put("coupon", rxa0.g(this.pageType, merchandiseS != null ? merchandiseS.localCoupons : null));
            jSONObjectM16581h.put("skuID", (merchandiseS == null || (stockKeepUnit = merchandiseS.defaultStockKeepUnit) == null) ? null : stockKeepUnit.id);
            jSONObjectM16581h.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM16581h.put("if_password_free", iab0.m16577d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
            jSONObjectM16581h.put("button_type", buttonType ? "confirm" : "refuse");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: e */
    public JSONObject mo16113e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", this.from);
            jSONObject.put("default_product", this.productCategory.toString());
            jSONObject.put("productType", m16111c().toString());
            jSONObject.put("purchase_page_type", this.pageType.name());
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put("ttc_page_type", this.pageType.name().toString());
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: f */
    public JSONObject mo16114f(@NotNull Merchandise merchandise, @NotNull PayMethod curPayMethod, boolean showTotalPrice, boolean autoPay, @Nullable JSONObject pageShowParam) {
        merchandise.getClass();
        curPayMethod.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        boolean zA = NullChecker.a(iab0.m16576c(merchandise.localCoupons));
        DecimalFormat decimalFormat = this.realPayDf;
        String str = zA ? decimalFormat.format(merchandise.getFirstCouponPrice()) : decimalFormat.format(merchandise.defaultStockKeepUnit.prices.price);
        try {
            jSONObjectM16581h.put("purchaseShowFrom", this.from);
            jSONObjectM16581h.put("purchase_page_type", this.pageType.name());
            jSONObjectM16581h.put("default_product", this.productCategory.toString());
            jSONObjectM16581h.put("show_price", iab0.m16577d(Boolean.valueOf(showTotalPrice), "false"));
            jSONObjectM16581h.put("price", str);
            jSONObjectM16581h.put("duration", iab0.m16578e(merchandise));
            jSONObjectM16581h.put("platform", curPayMethod.toString());
            jSONObjectM16581h.put("coupon", rxa0.g(this.pageType, merchandise.localCoupons));
            jSONObjectM16581h.put("skuID", merchandise.defaultStockKeepUnit.id);
            jSONObjectM16581h.put("productType", merchandise.category.toString());
            jSONObjectM16581h.put("if_password_free", iab0.m16577d(Boolean.valueOf(autoPay), "false"));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: g */
    public JSONObject mo16115g(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType, @Nullable JSONObject pageShowParam) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        d.a aVarB = paymentHandlerData.getCurrentPurchaseSection().m() ? paymentHandlerData.getCurrentPurchaseSection().b() : paymentHandlerData.getCurrentPurchaseSection().d();
        Merchandise merchandiseS = aVarB.s();
        try {
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM16581h.put("show_price", iab0.m16577d(paymentTextResponseData != null ? Boolean.valueOf(paymentTextResponseData.getShowTotalPrice()) : null, "false"));
            jSONObjectM16581h.put("price", iab0.m16582i(aVarB));
            jSONObjectM16581h.put("duration", iab0.m16578e(merchandiseS));
            jSONObjectM16581h.put("platform", paymentHandlerData.getCurrentPayMethod().toString());
            jSONObjectM16581h.put("coupon", rxa0.g(this.pageType, merchandiseS != null ? merchandiseS.localCoupons : null));
            jSONObjectM16581h.put("skuID", (merchandiseS == null || (stockKeepUnit = merchandiseS.defaultStockKeepUnit) == null) ? null : stockKeepUnit.id);
            jSONObjectM16581h.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData2 = paymentHandlerData.getPaymentTextResponseData();
            jSONObjectM16581h.put("if_password_free", iab0.m16577d(paymentTextResponseData2 != null ? Boolean.valueOf(paymentTextResponseData2.getAutoPay()) : null, "false"));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: h */
    public JSONObject mo16116h(@NotNull ef60 paymentHandlerData, @NotNull PurchaseType purchaseType) {
        StockKeepUnit stockKeepUnit;
        paymentHandlerData.getClass();
        purchaseType.getClass();
        JSONObject jSONObject = new JSONObject();
        d.a aVarB = paymentHandlerData.getCurrentPurchaseSection().m() ? paymentHandlerData.getCurrentPurchaseSection().b() : paymentHandlerData.getCurrentPurchaseSection().d();
        Merchandise merchandiseS = aVarB.s();
        try {
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put("price", iab0.m16582i(aVarB));
            jSONObject.put("duration", iab0.m16578e(merchandiseS));
            jSONObject.put("coupon", rxa0.g(this.pageType, merchandiseS != null ? merchandiseS.localCoupons : null));
            jSONObject.put("skuID", (merchandiseS == null || (stockKeepUnit = merchandiseS.defaultStockKeepUnit) == null) ? null : stockKeepUnit.id);
            jSONObject.put("productType", purchaseType.productCategory().toString());
            bi60 paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData();
            jSONObject.put("tag_content", paymentTextResponseData != null ? paymentTextResponseData.getSticker() : null);
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: i */
    public JSONObject mo16117i(@NotNull d currentPurchaseSection, @NotNull bi60 paymentTextResponseData, @NotNull PurchaseType purchaseType) {
        StockKeepUnit stockKeepUnit;
        currentPurchaseSection.getClass();
        paymentTextResponseData.getClass();
        purchaseType.getClass();
        JSONObject jSONObject = new JSONObject();
        d.a aVarB = currentPurchaseSection.m() ? currentPurchaseSection.b() : currentPurchaseSection.d();
        Merchandise merchandiseS = aVarB.s();
        try {
            jSONObject.put("purchase_id", getPurchaseTrackId());
            jSONObject.put("price", iab0.m16582i(aVarB));
            jSONObject.put("duration", iab0.m16578e(merchandiseS));
            String str = null;
            jSONObject.put("coupon", rxa0.g(this.pageType, merchandiseS != null ? merchandiseS.localCoupons : null));
            if (merchandiseS != null && (stockKeepUnit = merchandiseS.defaultStockKeepUnit) != null) {
                str = stockKeepUnit.id;
            }
            jSONObject.put("skuID", str);
            jSONObject.put("productType", purchaseType.productCategory().toString());
            jSONObject.put("tag_content", paymentTextResponseData.getSticker());
            return jSONObject;
        } catch (JSONException e) {
            CrashHelper.c(e);
            return jSONObject;
        }
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: j */
    public JSONObject mo16118j(@NotNull Merchandise merchandise, @Nullable JSONObject pageShowParam) {
        merchandise.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        try {
            jSONObjectM16581h.put("choose_duration", iab0.m16578e(merchandise));
            jSONObjectM16581h.put("choose_coupon", rxa0.g(this.pageType, merchandise.localCoupons));
            jSONObjectM16581h.put("choose_price", iab0.m16575b(this.realPayDf.format(merchandise.getFirstCouponPrice())));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: k */
    public JSONObject mo16119k(@NotNull d purchaseSection, @Nullable JSONObject pageShowParam) {
        Merchandise merchandiseS;
        purchaseSection.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        if (purchaseSection.m()) {
            d.a aVarB = purchaseSection.b();
            if (aVarB != null) {
                merchandiseS = aVarB.s();
            } else {
                merchandiseS = null;
            }
        } else {
            d.a aVarD = purchaseSection.d();
            if (aVarD != null) {
                merchandiseS = aVarD.s();
            } else {
                merchandiseS = null;
            }
        }
        String strM16582i = purchaseSection.m() ? iab0.m16582i(purchaseSection.b()) : iab0.m16582i(purchaseSection.d());
        try {
            jSONObjectM16581h.put("choose_duration", iab0.m16578e(merchandiseS));
            jSONObjectM16581h.put("choose_coupon", rxa0.g(this.pageType, merchandiseS != null ? merchandiseS.localCoupons : null));
            jSONObjectM16581h.put("choose_price", iab0.m16575b(strM16582i));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: l */
    public JSONObject mo16120l(@NotNull List<? extends d> sections, @Nullable JSONObject pageShowParam) {
        List list;
        d next;
        String strM16578e;
        String strM16582i;
        d.a aVarD;
        Merchandise merchandiseS;
        d.a aVarD2;
        Merchandise merchandiseS2;
        sections.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        Iterator<? extends d> it = sections.iterator();
        do {
            list = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.l());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String strU = vwb.U(iab0.m16583j(sections), ",");
        for (d dVar : sections) {
            if (dVar.m()) {
                sb2.append(iab0.m16582i(dVar.b()));
                sb2.append(",");
                d.a aVarB = dVar.b();
                sb.append(iab0.m16578e(aVarB != null ? aVarB.s() : null));
                sb.append(",");
            } else {
                sb2.append(iab0.m16582i(dVar.d()));
                sb2.append(",");
                d.a aVarD3 = dVar.d();
                sb.append(iab0.m16578e(aVarD3 != null ? aVarD3.s() : null));
                sb.append(",");
            }
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String strG = CameraSticker.CATEGORY_DEFAULT_FILTER;
        if (next == null || !next.m()) {
            strM16578e = iab0.m16578e((next == null || (aVarD2 = next.d()) == null) ? null : aVarD2.s());
            strM16578e.getClass();
            strM16582i = iab0.m16582i(next != null ? next.d() : null);
            strM16582i.getClass();
            if (iab0.m16585l(next != null ? next.d() : null)) {
                PurchaseTrackPageType purchaseTrackPageType = this.pageType;
                if (next != null && (aVarD = next.d()) != null && (merchandiseS = aVarD.s()) != null) {
                    list = merchandiseS.localCoupons;
                }
                strG = rxa0.g(purchaseTrackPageType, list);
                strG.getClass();
            }
        } else {
            d.a aVarB2 = next.b();
            strM16578e = iab0.m16578e(aVarB2 != null ? aVarB2.s() : null);
            strM16578e.getClass();
            strM16582i = iab0.m16582i(next.b());
            strM16582i.getClass();
            if (iab0.m16585l(next.b())) {
                PurchaseTrackPageType purchaseTrackPageType2 = this.pageType;
                d.a aVarB3 = next.b();
                if (aVarB3 != null && (merchandiseS2 = aVarB3.s()) != null) {
                    list = merchandiseS2.localCoupons;
                }
                strG = rxa0.g(purchaseTrackPageType2, list);
                strG.getClass();
            }
        }
        try {
            jSONObjectM16581h.put("default_duration", strM16578e);
            jSONObjectM16581h.put("default_coupon", strG);
            jSONObjectM16581h.put("default_price", strM16582i);
            jSONObjectM16581h.put("duration_group", sb.toString());
            jSONObjectM16581h.put("price_group", sb2.toString());
            jSONObjectM16581h.put("skuGroup", strU);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }

    @Override // p006l.hab0
    @NotNull
    /* JADX INFO: renamed from: m */
    public JSONObject mo16121m(@NotNull List<? extends Merchandise> merchandises, @Nullable JSONObject pageShowParam, int defaultSelect) {
        merchandises.getClass();
        JSONObject jSONObjectM16581h = iab0.m16581h(pageShowParam);
        if (vwb.J(merchandises)) {
            jSONObjectM16581h.getClass();
            return jSONObjectM16581h;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        for (Merchandise merchandise : merchandises) {
            if (NullChecker.a(iab0.m16576c(merchandise.localCoupons))) {
                sb2.append(merchandise.getFirstCouponPrice());
                sb2.append(",");
            } else {
                sb2.append(this.realPayDf.format(merchandise.defaultStockKeepUnit.prices.price));
                sb2.append(",");
            }
            String str = merchandise.defaultStockKeepUnit.id;
            str.getClass();
            arrayList.add(str);
            sb.append(iab0.m16578e(merchandise));
            sb.append(",");
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        Merchandise merchandise2 = merchandises.get(Math.min(merchandises.size() - 1, defaultSelect));
        try {
            jSONObjectM16581h.put("default_duration", iab0.m16578e(merchandise2));
            jSONObjectM16581h.put("default_coupon", rxa0.g(this.pageType, merchandise2.localCoupons));
            jSONObjectM16581h.put("default_price", this.realPayDf.format(merchandise2.getFirstCouponPrice()));
            jSONObjectM16581h.put("duration_group", sb.toString());
            jSONObjectM16581h.put("price_group", sb2.toString());
            jSONObjectM16581h.put("skuGroup", vwb.U(arrayList, ","));
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        jSONObjectM16581h.getClass();
        return jSONObjectM16581h;
    }
}
