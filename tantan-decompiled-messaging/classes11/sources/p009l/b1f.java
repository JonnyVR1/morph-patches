package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import java.util.List;
import l.j760;
import l.vwb;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class b1f {

    /* JADX INFO: renamed from: f */
    public static b1f f9865f;

    /* JADX INFO: renamed from: a */
    public List<Merchandise> f9866a;

    /* JADX INFO: renamed from: b */
    public List<Merchandise> f9867b;

    /* JADX INFO: renamed from: c */
    public List<Merchandise> f9868c;

    /* JADX INFO: renamed from: d */
    public List<Merchandise> f9869d;

    /* JADX INFO: renamed from: e */
    public List<Merchandise> f9870e;

    /* JADX INFO: renamed from: a */
    public static b1f m11804a() {
        if (f9865f == null) {
            synchronized (b1f.class) {
                try {
                    if (f9865f == null) {
                        f9865f = new b1f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9865f;
    }

    /* JADX INFO: renamed from: c */
    public static j760<Boolean, String> m11805c(Coupon coupon) {
        if (coupon == null) {
            return new j760<>(Boolean.FALSE, "1天");
        }
        long jM18550o = ((long) coupon.endTime) - mqi0.m18550o();
        if (jM18550o <= 0) {
            return new j760<>(Boolean.FALSE, "00:00:00");
        }
        if (jM18550o > 86400000) {
            return new j760<>(Boolean.FALSE, ((int) (jM18550o / 86400000)) + "天");
        }
        int i = (int) (jM18550o / 3600000);
        long j = jM18550o % 3600000;
        return new j760<>(Boolean.TRUE, m11809i(i) + ":" + m11809i((int) (j / 60000)) + ":" + m11809i((int) ((j % 60000) / 1000)));
    }

    /* JADX INFO: renamed from: d */
    public static String m11806d(Coupon coupon) {
        if (coupon == null) {
            return "";
        }
        if (coupon.isBelongPromotion("lowPriceCallback3SVIP")) {
            return "lowPriceCallback3SVIP";
        }
        if (coupon.isBelongPromotion("lowPriceCallback3VIP")) {
            return "lowPriceCallback3VIP";
        }
        if (coupon.isBelongPromotion("lowPriceCustomerVIP")) {
            return "lowPriceCustomerVIP";
        }
        if (coupon.isBelongPromotion("lowPriceCustomerSVIP")) {
            return "lowPriceCustomerSVIP";
        }
        if (coupon.isBelongPromotion("lowPrice3Month")) {
            return "lowPrice3Month";
        }
        if (coupon.isBelongPromotion("lowPriceFirstTime12MSVIP")) {
            return "lowPriceFirstTime12MSVIP";
        }
        if (coupon.isBelongPromotion("giftDurationSVIP")) {
            return "giftDurationSVIP";
        }
        if (coupon.isBelongPromotion("lowPriceODiamond")) {
            return "lowPriceODiamond";
        }
        return coupon.isBelongPromotion("lowPriceCustomerUpliftSVIP") ? "lowPriceCustomerUpliftSVIP" : "";
    }

    /* JADX INFO: renamed from: e */
    public static int m11807e() {
        try {
            String strM9623F = RemoteConfig.m9619x().m9623F("vas_enhanced_promotion_perception");
            if (TextUtils.isEmpty(strM9623F)) {
                return 24;
            }
            return new JSONObject(strM9623F).optInt("show_promotion_hours_limit", 24);
        } catch (Exception unused) {
            return 24;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11808h(Coupon coupon) {
        if (coupon == null) {
            return false;
        }
        long jM18550o = mqi0.m18550o();
        long j = ((long) coupon.endTime) - jM18550o;
        return coupon.beginTime < ((double) jM18550o) && j > 0 && j < ((long) m11807e()) * 3600000;
    }

    /* JADX INFO: renamed from: i */
    public static String m11809i(int i) {
        if (i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            return sb.toString();
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: b */
    public j760<Merchandise, Coupon> m11810b() {
        j760<Merchandise, Coupon> j760VarM11812g = !vwb.J(this.f9867b) ? m11812g(this.f9867b, "lowPriceCallback3SVIP") : null;
        return (j760VarM11812g != null || vwb.J(this.f9869d)) ? j760VarM11812g : m11812g(this.f9869d, "lowPriceCustomerSVIP");
    }

    /* JADX INFO: renamed from: f */
    public j760<Merchandise, Coupon> m11811f(String str) {
        if ("lowPriceCallback3SVIP".equals(str)) {
            return m11812g(this.f9867b, "lowPriceCallback3SVIP");
        }
        if ("lowPriceCustomerSVIP".equals(str)) {
            return m11812g(this.f9869d, "lowPriceCustomerSVIP");
        }
        if ("lowPriceCallback3VIP".equals(str)) {
            return m11812g(this.f9866a, "lowPriceCallback3VIP");
        }
        if ("lowPriceCustomerVIP".equals(str)) {
            return m11812g(this.f9868c, "lowPriceCustomerVIP");
        }
        if ("lowPrice3Month".equals(str)) {
            return m11812g(this.f9870e, "lowPrice3Month");
        }
        if ("lowPriceFirstTime12MSVIP".equals(str)) {
            return w6h0.m23944j().m23949k();
        }
        if ("giftDurationSVIP".equals(str)) {
            return v5h0.m23307d().m23309e();
        }
        if ("lowPriceODiamond".equals(str)) {
            return ax40.m11690h().m11692i();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final j760<Merchandise, Coupon> m11812g(List<Merchandise> list, String str) {
        if (vwb.J(list)) {
            return null;
        }
        Merchandise merchandise = null;
        Coupon coupon = null;
        for (Merchandise merchandise2 : list) {
            Coupon couponForPromotion = merchandise2.getCouponForPromotion(str);
            if (m11808h(couponForPromotion) && (merchandise == null || (merchandise.quantity > merchandise2.quantity && merchandise2.monthType()))) {
                merchandise = merchandise2;
                coupon = couponForPromotion;
            }
        }
        if (merchandise == null || coupon == null) {
            return null;
        }
        return vwb.Y(merchandise, coupon);
    }
}
