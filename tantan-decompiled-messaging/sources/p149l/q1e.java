package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.data.SchemeKey;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0010J%\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u001d\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/q1e;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/data/Merchandise;", Merchandise.TYPE, "", "basePrice", "", "isPromotion", "", "f", "(Lcom/p1/mobile/putong/core/data/Merchandise;DZ)I", SchemeKey.promotion, "", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Merchandise;Z)Ljava/lang/String;", "c", "b", "e", "(Lcom/p1/mobile/putong/core/data/Merchandise;Z)I", "a", "(Lcom/p1/mobile/putong/core/data/Merchandise;DZ)Ljava/lang/String;", "g", "(Lcom/p1/mobile/putong/core/data/Merchandise;)Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q1e {

    @NotNull
    public static final q1e INSTANCE = new q1e();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m172386a(@NotNull Merchandise merchandise, double basePrice, boolean isPromotion) {
        merchandise.getClass();
        String strM133839F = i0g0.m133839F(((isPromotion ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price) / (basePrice * ((double) merchandise.quantity))) * 10.0d, 0);
        strM133839F.getClass();
        return strM133839F;
    }

    /* JADX INFO: renamed from: b */
    public final int m172387b(@NotNull Merchandise merchandise, double basePrice, boolean isPromotion) {
        merchandise.getClass();
        double firstCouponPrice = isPromotion ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        int i = merchandise.quantity;
        double d = basePrice * ((double) i);
        if (d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            d = merchandise.defaultStockKeepUnit.prices.originalUnitPrice * ((double) i);
        }
        return gex.m125858a((1.0d - (firstCouponPrice / d)) * 100.0d);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final String m172388c(@NotNull Merchandise merchandise, boolean promotion) {
        merchandise.getClass();
        return String.valueOf(gex.m125858a(merchandise.defaultStockKeepUnit.prices.noneRenewalPrice - (promotion ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price)));
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m172389d(@NotNull Merchandise merchandise, boolean promotion) {
        merchandise.getClass();
        return i0g0.m133839F(((promotion ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price) / merchandise.defaultStockKeepUnit.prices.noneRenewalPrice) * 10.0d, 1);
    }

    /* JADX INFO: renamed from: e */
    public final int m172390e(@NotNull Merchandise merchandise, boolean isPromotion) {
        merchandise.getClass();
        return gex.m125858a((1.0d - ((isPromotion ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price) / (merchandise.defaultStockKeepUnit.prices.originalUnitPrice * ((double) merchandise.quantity)))) * 100.0d);
    }

    /* JADX INFO: renamed from: f */
    public final int m172391f(@NotNull Merchandise merchandise, double basePrice, boolean isPromotion) {
        merchandise.getClass();
        double firstCouponPrice = isPromotion ? merchandise.getFirstCouponPrice() : merchandise.defaultStockKeepUnit.prices.price;
        double d = basePrice * ((double) merchandise.quantity);
        return (int) (((d - firstCouponPrice) / d) * 100.0d);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m172392g(@NotNull Merchandise merchandise) {
        merchandise.getClass();
        if (merchandise.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            if (merchandise.monthly()) {
                return "前3月优惠";
            }
            double firstCouponPrice = merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return String.format("立减%.0f元", Arrays.copyOf(new Object[]{Double.valueOf(firstCouponPrice)}, 1));
        }
        if (!merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstMonth) && !merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP) && !merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP) && !merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceSVIPPicks) && !merchandise.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP)) {
            return "";
        }
        if (merchandise.monthly()) {
            return "首月优惠";
        }
        double firstCouponPrice2 = merchandise.defaultStockKeepUnit.prices.price - merchandise.getFirstCouponPrice();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return String.format("立减%.0f元", Arrays.copyOf(new Object[]{Double.valueOf(firstCouponPrice2)}, 1));
    }
}
