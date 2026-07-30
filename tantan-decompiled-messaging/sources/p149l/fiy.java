package p149l;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.Prices;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import java.text.NumberFormat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010'\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\"\u0010*\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010,\u001a\u00020\u001a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b+\u0010\u001fR\"\u00104\u001a\u00020-8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Ll/fiy;", "Ll/pwl;", "Lcom/p1/mobile/putong/core/ui/purchase/d$a;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "detail", "", "g", "(Landroid/content/Context;Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/ui/purchase/d$a;)V", "Ljava/text/NumberFormat;", "a", "Ljava/text/NumberFormat;", "c", "()Ljava/text/NumberFormat;", "numberFormat", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setCurrencySymbol", "(Ljava/lang/String;)V", "currencySymbol", "", "D", Constants.INAPP_DATA_TAG, "()D", "setPrice", "(D)V", FirebaseAnalytics.Param.PRICE, "f", "setUnitPrice", "unitPrice", "e", "getOriginalPrice", "setOriginalPrice", "originalPrice", "getOriginalUnitPrice", "setOriginalUnitPrice", "originalUnitPrice", "setPromotionPrice", "promotionPrice", "", "h", "Z", "getInPromotion", "()Z", "setInPromotion", "(Z)V", "inPromotion", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class fiy implements pwl<C8765d.a> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NumberFormat numberFormat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public String currencySymbol;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public double price;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public double unitPrice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public double originalPrice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public double originalUnitPrice;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public double promotionPrice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean inPromotion;

    public fiy() {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.getClass();
        this.numberFormat = numberInstance;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final NumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getPromotionPrice() {
        return this.promotionPrice;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getUnitPrice() {
        return this.unitPrice;
    }

    @Override // p149l.pwl
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo116746a(@NotNull Context context, @NotNull PurchaseType type, @NotNull C8765d.a detail) {
        context.getClass();
        type.getClass();
        detail.getClass();
        this.numberFormat.setMaximumFractionDigits(2);
        Merchandise merchandiseM53601s = detail.m53601s();
        Prices prices = merchandiseM53601s.defaultStockKeepUnit.prices;
        this.currencySymbol = prices.currencySymbol;
        this.price = prices.price;
        this.unitPrice = prices.unitPrice;
        this.originalPrice = prices.originalPrice;
        this.originalUnitPrice = prices.originalUnitPrice;
        this.inPromotion = rxa0.m181493n(merchandiseM53601s);
        detail.m53586i0(merchandiseM53601s.quantity);
        detail.m53562R(this.currencySymbol);
        detail.m53567W(this.numberFormat.format(this.price));
        double d = this.unitPrice;
        NumberFormat numberFormat = this.numberFormat;
        if (d >= 100.0d) {
            detail.m53568X(numberFormat.format(Math.ceil(d)));
        } else {
            detail.m53568X(numberFormat.format(d));
        }
        detail.m53565U(this.numberFormat.format(this.originalPrice));
        detail.m53566V(this.numberFormat.format(this.originalUnitPrice));
        if (this.inPromotion) {
            double firstCouponPrice = merchandiseM53601s.getFirstCouponPrice();
            this.promotionPrice = firstCouponPrice;
            detail.m53582g0(this.numberFormat.format(firstCouponPrice));
            detail.m53576d0(true);
            detail.m53584h0(this.promotionPrice);
        }
        detail.m53580f0(this.price);
    }
}
