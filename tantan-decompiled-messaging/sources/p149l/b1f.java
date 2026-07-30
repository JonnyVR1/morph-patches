package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class b1f {

    /* JADX INFO: renamed from: f */
    public static b1f f72588f;

    /* JADX INFO: renamed from: a */
    public List<Merchandise> f72589a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f72590b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f72591c;

    /* JADX INFO: renamed from: d */
    public List<Merchandise> f72592d;

    /* JADX INFO: renamed from: e */
    public List<Merchandise> f72593e;

    /* JADX INFO: renamed from: a */
    public static b1f m99829a() {
        if (f72588f == null) {
            synchronized (b1f.class) {
                try {
                    if (f72588f == null) {
                        f72588f = new b1f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f72588f;
    }

    /* JADX INFO: renamed from: c */
    public static j760<Boolean, String> m99830c(Coupon coupon) {
        if (coupon == null) {
            return new j760<>(Boolean.FALSE, "1天");
        }
        long jM155944o = ((long) coupon.endTime) - mqi0.m155944o();
        if (jM155944o <= 0) {
            return new j760<>(Boolean.FALSE, "00:00:00");
        }
        if (jM155944o > 86400000) {
            return new j760<>(Boolean.FALSE, ((int) (jM155944o / 86400000)) + "天");
        }
        int i = (int) (jM155944o / 3600000);
        long j = jM155944o % 3600000;
        int i2 = (int) (j / Constants.ONE_MIN_IN_MILLIS);
        int i3 = (int) ((j % Constants.ONE_MIN_IN_MILLIS) / 1000);
        return new j760<>(Boolean.TRUE, m99834i(i) + ":" + m99834i(i2) + ":" + m99834i(i3));
    }

    /* JADX INFO: renamed from: d */
    public static String m99831d(Coupon coupon) {
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
    public static int m99832e() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("vas_enhanced_promotion_perception");
            if (TextUtils.isEmpty(strM79302F)) {
                return 24;
            }
            return new JSONObject(strM79302F).optInt("show_promotion_hours_limit", 24);
        } catch (Exception unused) {
            return 24;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m99833h(Coupon coupon) {
        if (coupon == null) {
            return false;
        }
        long jM155944o = mqi0.m155944o();
        long j = ((long) coupon.endTime) - jM155944o;
        return coupon.beginTime < ((double) jM155944o) && j > 0 && j < ((long) m99832e()) * 3600000;
    }

    /* JADX INFO: renamed from: i */
    public static String m99834i(int i) {
        if (i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            return sb.toString();
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: b */
    public j760<Merchandise, Coupon> m99835b() {
        j760<Merchandise, Coupon> j760VarM99837g = !vwb.m200296J(this.f72590b) ? m99837g(this.f72590b, MonetizationPromotionsId.lowPriceCallback3SVIP) : null;
        return (j760VarM99837g != null || vwb.m200296J(this.f72592d)) ? j760VarM99837g : m99837g(this.f72592d, MonetizationPromotionsId.lowPriceCustomerSVIP);
    }

    /* JADX INFO: renamed from: f */
    public j760<Merchandise, Coupon> m99836f(String str) {
        if (MonetizationPromotionsId.lowPriceCallback3SVIP.equals(str)) {
            return m99837g(this.f72590b, MonetizationPromotionsId.lowPriceCallback3SVIP);
        }
        if (MonetizationPromotionsId.lowPriceCustomerSVIP.equals(str)) {
            return m99837g(this.f72592d, MonetizationPromotionsId.lowPriceCustomerSVIP);
        }
        if (MonetizationPromotionsId.lowPriceCallback3VIP.equals(str)) {
            return m99837g(this.f72589a, MonetizationPromotionsId.lowPriceCallback3VIP);
        }
        if (MonetizationPromotionsId.lowPriceCustomerVIP.equals(str)) {
            return m99837g(this.f72591c, MonetizationPromotionsId.lowPriceCustomerVIP);
        }
        if (MonetizationPromotionsId.lowPrice3Month.equals(str)) {
            return m99837g(this.f72593e, MonetizationPromotionsId.lowPrice3Month);
        }
        if (MonetizationPromotionsId.lowPriceFirstTime12MSVIP.equals(str)) {
            return w6h0.m201818j().m201823k();
        }
        if (MonetizationPromotionsId.giftDurationSVIP.equals(str)) {
            return v5h0.m197114d().m197116e();
        }
        if (MonetizationPromotionsId.lowPriceODiamond.equals(str)) {
            return ax40.m99370h().m99372i();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final j760<Merchandise, Coupon> m99837g(List<Merchandise> list, String str) {
        if (vwb.m200296J(list)) {
            return null;
        }
        Merchandise merchandise = null;
        Coupon coupon = null;
        for (Merchandise merchandise2 : list) {
            Coupon couponForPromotion = merchandise2.getCouponForPromotion(str);
            if (m99833h(couponForPromotion) && (merchandise == null || (merchandise.quantity > merchandise2.quantity && merchandise2.monthType()))) {
                merchandise = merchandise2;
                coupon = couponForPromotion;
            }
        }
        if (merchandise == null || coupon == null) {
            return null;
        }
        return vwb.m200311Y(merchandise, coupon);
    }
}
