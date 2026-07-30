package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Coupon;
import com.p1.mobile.putong.core.data.Merchandise;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rxa0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f20018a = false;

    /* JADX INFO: renamed from: b */
    public static ArrayList<String> f20019b = vwb.f0(new String[]{"lowPriceCustomerVIP_local_1W", "lowPriceCustomerVIP@local_1M", "lowPriceCustomerVIP@local_1M_21", "lowPriceCustomerVIP@local_3M", "lowPriceCustomerVIP@local_3M_56", "lowPriceCustomerSVIP@local_1M_exceed23age_h", "lowPriceCustomerSVIP_local_1M_under23age_h", "lowPriceCustomerSVIP@local_3M_exceed23age_h", "lowPriceCustomerSVIP@local_3M_under23age_h", "lowPriceCustomerSVIP@local_1M_exceed23age_h_58", "lowPriceCustomerSVIP@local_3M_exceed23age_h_128", "lowPriceCustomerSVIP@local_6M_exceed23age_h", "lowPriceCustomerSVIP@local_6M_under23age_h", "lowPriceFirstMonthVIP1M@local", "lowPrice3MonthVIP1M1R@local", "lowPriceCustomerSVIP@local_1M_exceed23age_h_60", "lowPriceCustomerSVIP@local_6M_exceed23age_h_198"});

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m21864a(String str, Merchandise merchandise) {
        return m21873j(merchandise, str) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m21865b(Merchandise merchandise) {
        if (m21879p(merchandise, ProductCategory.get("svip"), "lowPriceCustomerSVIP") || m21879p(merchandise, ProductCategory.get("tttVip"), "lowPriceCustomerVIP") || m21879p(merchandise, ProductCategory.get("tttVip"), "lowPrice3Month")) {
            return true;
        }
        return (CoreModule.l.a().k() && m21879p(merchandise, ProductCategory.get("svipPicksMembership"), "lowPriceSVIPPicks")) || m21879p(merchandise, ProductCategory.get("svip"), "lowPriceFirstTime12MSVIP") || m21879p(merchandise, ProductCategory.get("oDiamond"), "lowPriceODiamond") || m21879p(merchandise, ProductCategory.get("svip"), "lowPriceCustomerUpliftSVIP");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21866c(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (m21865b(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21867d(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (m21877n(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m21868e(List<Merchandise> list) {
        for (Merchandise merchandise : list) {
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static Merchandise m21869f(ProductCategory productCategory, final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List listD5 = CoreModule.c.j0.D5(productCategory);
        if (vwb.J(listD5)) {
            return null;
        }
        return (Merchandise) vwb.r(listD5, new w9j() { // from class: l.qxa0
            public final Object call(Object obj) {
                return rxa0.m21864a(str, (Merchandise) obj);
            }
        });
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static String m21870g(PurchaseTrackPageType purchaseTrackPageType, List<Coupon> list) {
        for (Coupon coupon : list) {
            if (((TextUtils.equals(coupon.couponID, "lowPriceCallback3SVIP1M@local") || TextUtils.equals(coupon.couponID, "lowPriceCallback3SVIP3M@local") || TextUtils.equals(coupon.couponID, "lowPriceCallback3SVIP6M@local") || TextUtils.equals(coupon.couponID, "lowPriceCallback3SVIP12M@local") || TextUtils.equals(coupon.couponID, "lowPriceCallback3VIP1M@local") || TextUtils.equals(coupon.couponID, "lowPriceCallback3VIP3M@local") || TextUtils.equals(coupon.couponID, "lowPriceCallback3VIP12M@local")) && purchaseTrackPageType != PurchaseTrackPageType.page_discount_callback) || TextUtils.equals(coupon.couponID, "trialSVIP7Day@local_1M")) {
                return "default";
            }
            double dM18550o = mqi0.m18550o();
            if (dM18550o >= coupon.beginTime && dM18550o <= coupon.endTime) {
                return coupon.couponID;
            }
        }
        return "default";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21871h() {
        return f20018a;
    }

    /* JADX INFO: renamed from: i */
    public static Coupon m21872i(Merchandise merchandise) {
        return merchandise.getCouponForPromotionNew("trial7DSVIP");
    }

    /* JADX INFO: renamed from: j */
    public static boolean m21873j(Merchandise merchandise, String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.a(merchandise) && !vwb.J(merchandise.localCoupons)) {
            Coupon couponWithId = merchandise.getCouponWithId(str);
            if (NullChecker.a(couponWithId)) {
                double dM18550o = mqi0.m18550o();
                if (dM18550o >= couponWithId.beginTime && dM18550o <= couponWithId.endTime) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m21874k(Merchandise merchandise) {
        return m21880q(merchandise, "trial7DSVIP");
    }

    /* JADX INFO: renamed from: l */
    public static boolean m21875l(Merchandise merchandise, String str) {
        if (NullChecker.a(merchandise) && merchandise.isBelongPromotion(str)) {
            Coupon couponForPromotion = merchandise.getCouponForPromotion(str);
            long jM18550o = mqi0.m18550o();
            if (NullChecker.a(couponForPromotion)) {
                double d = jM18550o;
                if (d >= couponForPromotion.beginTime && d <= couponForPromotion.endTime) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m21876m(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "tttVip") && m21875l(merchandise, "lowPriceFirstMonth");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m21877n(Merchandise merchandise) {
        return m21878o(merchandise, true);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m21878o(Merchandise merchandise, boolean z) {
        if (merchandise == null) {
            return false;
        }
        if (TEnum.equals(merchandise.category, "tttSeeWhoLikedMe") && !CoreModule.l.a().e2()) {
            return false;
        }
        if (TEnum.equals(merchandise.category, "tttVip") && CoreModule.c.e0.p9().isVIP()) {
            return false;
        }
        if ((TEnum.equals(merchandise.category, "tttVip") && merchandise.isBelongPromotion("trial7DVIP")) || vwb.J(merchandise.localCoupons)) {
            return false;
        }
        double d = ((Coupon) merchandise.localCoupons.get(0)).beginTime;
        double d2 = ((Coupon) merchandise.localCoupons.get(0)).endTime;
        double dM18550o = mqi0.m18550o();
        return dM18550o >= d && dM18550o <= d2;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m21879p(Merchandise merchandise, ProductCategory productCategory, String str) {
        return TEnum.equals(merchandise.category, productCategory) && m21875l(merchandise, str);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m21880q(Merchandise merchandise, String str) {
        return m21875l(merchandise, str);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m21881r(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f20019b.contains(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m21882s(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && m21875l(merchandise, "lowPriceCustomerUpliftSVIP");
    }

    /* JADX INFO: renamed from: t */
    public static boolean m21883t(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "oDiamond") && m21875l(merchandise, "lowPriceODiamond");
    }

    /* JADX INFO: renamed from: u */
    public static boolean m21884u(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svipPicksMembership") && m21875l(merchandise, "lowPriceSVIPPicks");
    }

    /* JADX INFO: renamed from: v */
    public static boolean m21885v(String str, Merchandise merchandise) {
        if (TextUtils.equals(str, "svip")) {
            return TEnum.equals(merchandise.category, str) && m21875l(merchandise, "lowPriceCallback3SVIP");
        }
        return TextUtils.equals(str, "tttVip") && TEnum.equals(merchandise.category, str) && m21875l(merchandise, "lowPriceCallback3VIP");
    }

    /* JADX INFO: renamed from: w */
    public static boolean m21886w(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && m21875l(merchandise, "lowPriceCustomerSVIP");
    }

    /* JADX INFO: renamed from: x */
    public static boolean m21887x(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "tttVip") && m21875l(merchandise, "lowPriceCustomerVIP");
    }

    /* JADX INFO: renamed from: y */
    public static boolean m21888y(Merchandise merchandise) {
        if (TEnum.equals(merchandise.category, "tttVip")) {
            return m21875l(merchandise, "lowPriceFirstMonth") || m21875l(merchandise, "lowPrice3Month") || m21875l(merchandise, "lowPriceCustomerVIP");
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m21889z(boolean z) {
        f20018a = z;
    }
}
