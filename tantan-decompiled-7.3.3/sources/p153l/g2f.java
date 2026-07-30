package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class g2f {

    /* JADX INFO: renamed from: f */
    public static g2f f101829f;

    /* JADX INFO: renamed from: a */
    public List<Merchandise> f101830a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f101831b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f101832c;

    /* JADX INFO: renamed from: d */
    public List<Merchandise> f101833d;

    /* JADX INFO: renamed from: e */
    public List<Merchandise> f101834e;

    /* JADX INFO: renamed from: a */
    public static g2f m128610a() {
        if (f101829f == null) {
            synchronized (g2f.class) {
                try {
                    if (f101829f == null) {
                        f101829f = new g2f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f101829f;
    }

    /* JADX INFO: renamed from: c */
    public static pf60<Boolean, String> m128611c(Coupon coupon) {
        if (coupon == null) {
            return new pf60<>(Boolean.FALSE, "1天");
        }
        long jM174454o = ((long) coupon.endTime) - pzi0.m174454o();
        if (jM174454o <= 0) {
            return new pf60<>(Boolean.FALSE, "00:00:00");
        }
        if (jM174454o > 86400000) {
            return new pf60<>(Boolean.FALSE, ((int) (jM174454o / 86400000)) + "天");
        }
        int i = (int) (jM174454o / 3600000);
        long j = jM174454o % 3600000;
        int i2 = (int) (j / Constants.ONE_MIN_IN_MILLIS);
        int i3 = (int) ((j % Constants.ONE_MIN_IN_MILLIS) / 1000);
        return new pf60<>(Boolean.TRUE, m128615i(i) + ":" + m128615i(i2) + ":" + m128615i(i3));
    }

    /* JADX INFO: renamed from: d */
    public static String m128612d(Coupon coupon) {
        if (coupon == null) {
            return "";
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3SVIP)) {
            return MonetizationPromotionsId.lowPriceCallback3SVIP;
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceCallback3VIP)) {
            return MonetizationPromotionsId.lowPriceCallback3VIP;
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerVIP)) {
            return MonetizationPromotionsId.lowPriceCustomerVIP;
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerSVIP)) {
            return MonetizationPromotionsId.lowPriceCustomerSVIP;
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.lowPrice3Month)) {
            return MonetizationPromotionsId.lowPrice3Month;
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceFirstTime12MSVIP)) {
            return MonetizationPromotionsId.lowPriceFirstTime12MSVIP;
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.giftDurationSVIP)) {
            return MonetizationPromotionsId.giftDurationSVIP;
        }
        if (coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceODiamond)) {
            return MonetizationPromotionsId.lowPriceODiamond;
        }
        return coupon.isBelongPromotion(MonetizationPromotionsId.lowPriceCustomerUpliftSVIP) ? MonetizationPromotionsId.lowPriceCustomerUpliftSVIP : "";
    }

    /* JADX INFO: renamed from: e */
    public static int m128613e() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("vas_enhanced_promotion_perception");
            if (TextUtils.isEmpty(strM80485F)) {
                return 24;
            }
            return new JSONObject(strM80485F).optInt("show_promotion_hours_limit", 24);
        } catch (Exception unused) {
            return 24;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m128614h(Coupon coupon) {
        if (coupon == null) {
            return false;
        }
        long jM174454o = pzi0.m174454o();
        long j = ((long) coupon.endTime) - jM174454o;
        return coupon.beginTime < ((double) jM174454o) && j > 0 && j < ((long) m128613e()) * 3600000;
    }

    /* JADX INFO: renamed from: i */
    public static String m128615i(int i) {
        if (i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            return sb.toString();
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: b */
    public pf60<Merchandise, Coupon> m128616b() {
        pf60<Merchandise, Coupon> pf60VarM128618g = !jyb.m147479J(this.f101831b) ? m128618g(this.f101831b, MonetizationPromotionsId.lowPriceCallback3SVIP) : null;
        return (pf60VarM128618g != null || jyb.m147479J(this.f101833d)) ? pf60VarM128618g : m128618g(this.f101833d, MonetizationPromotionsId.lowPriceCustomerSVIP);
    }

    /* JADX INFO: renamed from: f */
    public pf60<Merchandise, Coupon> m128617f(String str) {
        if (MonetizationPromotionsId.lowPriceCallback3SVIP.equals(str)) {
            return m128618g(this.f101831b, MonetizationPromotionsId.lowPriceCallback3SVIP);
        }
        if (MonetizationPromotionsId.lowPriceCustomerSVIP.equals(str)) {
            return m128618g(this.f101833d, MonetizationPromotionsId.lowPriceCustomerSVIP);
        }
        if (MonetizationPromotionsId.lowPriceCallback3VIP.equals(str)) {
            return m128618g(this.f101830a, MonetizationPromotionsId.lowPriceCallback3VIP);
        }
        if (MonetizationPromotionsId.lowPriceCustomerVIP.equals(str)) {
            return m128618g(this.f101832c, MonetizationPromotionsId.lowPriceCustomerVIP);
        }
        if (MonetizationPromotionsId.lowPrice3Month.equals(str)) {
            return m128618g(this.f101834e, MonetizationPromotionsId.lowPrice3Month);
        }
        if (MonetizationPromotionsId.lowPriceFirstTime12MSVIP.equals(str)) {
            return efh0.m120692j().m120697k();
        }
        if (MonetizationPromotionsId.giftDurationSVIP.equals(str)) {
            return deh0.m115414d().m115416e();
        }
        if (MonetizationPromotionsId.lowPriceODiamond.equals(str)) {
            return p550.m170601h().m170603i();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final pf60<Merchandise, Coupon> m128618g(List<Merchandise> list, String str) {
        if (jyb.m147479J(list)) {
            return null;
        }
        Merchandise merchandise = null;
        Coupon coupon = null;
        for (Merchandise merchandise2 : list) {
            Coupon couponForPromotion = merchandise2.getCouponForPromotion(str);
            if (m128614h(couponForPromotion) && (merchandise == null || (merchandise.quantity > merchandise2.quantity && merchandise2.monthType()))) {
                merchandise = merchandise2;
                coupon = couponForPromotion;
            }
        }
        if (merchandise == null || coupon == null) {
            return null;
        }
        return jyb.m147494Y(merchandise, coupon);
    }
}
