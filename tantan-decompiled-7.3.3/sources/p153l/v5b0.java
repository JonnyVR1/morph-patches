package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.promotion.ConstantCouponId;
import com.p051p1.mobile.putong.core.data.Coupon;
import com.p051p1.mobile.putong.core.data.Merchandise;
import com.p051p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class v5b0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f182494a = false;

    /* JADX INFO: renamed from: b */
    public static ArrayList<String> f182495b = jyb.m147507f0(ConstantCouponId.lowPriceCustomerVIP_local_1W, ConstantCouponId.lowPriceCustomerVIP_local_1M, ConstantCouponId.lowPriceCustomerVIP_local_1M_21, ConstantCouponId.lowPriceCustomerVIP_local_3M, ConstantCouponId.lowPriceCustomerVIP_local_3M_56, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h_58, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h_128, ConstantCouponId.lowPriceCustomerSVIP_local_6M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_6M_under23age_h, ConstantCouponId.lowPriceFirstMonthVIP1M_local, ConstantCouponId.lowPrice3MonthVIP1M1R_local, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h_60, ConstantCouponId.lowPriceCustomerSVIP_local_6M_exceed23age_h_198);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m199775a(String str, Merchandise merchandise) {
        return m199784j(merchandise, str) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m199776b(Merchandise merchandise) {
        if (m199790p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP) || m199790p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP) || m199790p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
            return true;
        }
        return (CoreModule.f18273l.m143405a().mo34532k() && m199790p(merchandise, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks)) || m199790p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceFirstTime12MSVIP) || m199790p(merchandise, ProductCategory.get("oDiamond"), MonetizationPromotionsId.lowPriceODiamond) || m199790p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m199777c(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (m199776b(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m199778d(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (m199788n(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m199779e(List<Merchandise> list) {
        for (Merchandise merchandise : list) {
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static Merchandise m199780f(ProductCategory productCategory, final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<Merchandise> listM31582D5 = CoreModule.f18264c.f20396j0.m31582D5(productCategory);
        if (jyb.m147479J(listM31582D5)) {
            return null;
        }
        return (Merchandise) jyb.m147529r(listM31582D5, new qcj() { // from class: l.u5b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return v5b0.m199775a(str, (Merchandise) obj);
            }
        });
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static String m199781g(PurchaseTrackPageType purchaseTrackPageType, List<Coupon> list) {
        for (Coupon coupon : list) {
            if (((TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP1M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP3M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP6M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP12M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3VIP1M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3VIP3M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3VIP12M_local)) && purchaseTrackPageType != PurchaseTrackPageType.page_discount_callback) || TextUtils.equals(coupon.couponID, ConstantCouponId.trialSVIP7Day_local_1M)) {
                return "default";
            }
            double dM174454o = pzi0.m174454o();
            if (dM174454o >= coupon.beginTime && dM174454o <= coupon.endTime) {
                return coupon.couponID;
            }
        }
        return "default";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m199782h() {
        return f182494a;
    }

    /* JADX INFO: renamed from: i */
    public static Coupon m199783i(Merchandise merchandise) {
        return merchandise.getCouponForPromotionNew(MonetizationPromotionsId.trial7DSVIP);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m199784j(Merchandise merchandise, String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.m82486a(merchandise) && !jyb.m147479J(merchandise.localCoupons)) {
            Coupon couponWithId = merchandise.getCouponWithId(str);
            if (NullChecker.m82486a(couponWithId)) {
                double dM174454o = pzi0.m174454o();
                if (dM174454o >= couponWithId.beginTime && dM174454o <= couponWithId.endTime) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m199785k(Merchandise merchandise) {
        return m199791q(merchandise, MonetizationPromotionsId.trial7DSVIP);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m199786l(Merchandise merchandise, String str) {
        if (NullChecker.m82486a(merchandise) && merchandise.isBelongPromotion(str)) {
            Coupon couponForPromotion = merchandise.getCouponForPromotion(str);
            long jM174454o = pzi0.m174454o();
            if (NullChecker.m82486a(couponForPromotion)) {
                double d = jM174454o;
                if (d >= couponForPromotion.beginTime && d <= couponForPromotion.endTime) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m199787m(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, ProductCategory.tttVip) && m199786l(merchandise, MonetizationPromotionsId.lowPriceFirstMonth);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m199788n(Merchandise merchandise) {
        return m199789o(merchandise, true);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m199789o(Merchandise merchandise, boolean z) {
        if (merchandise == null) {
            return false;
        }
        if (TEnum.equals(merchandise.category, ProductCategory.tttSeeWhoLikedMe) && !CoreModule.f18273l.m143405a().mo34492e2()) {
            return false;
        }
        if (TEnum.equals(merchandise.category, ProductCategory.tttVip) && CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            return false;
        }
        if ((TEnum.equals(merchandise.category, ProductCategory.tttVip) && merchandise.isBelongPromotion(MonetizationPromotionsId.trial7DVIP)) || jyb.m147479J(merchandise.localCoupons)) {
            return false;
        }
        double d = merchandise.localCoupons.get(0).beginTime;
        double d2 = merchandise.localCoupons.get(0).endTime;
        double dM174454o = pzi0.m174454o();
        return dM174454o >= d && dM174454o <= d2;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m199790p(Merchandise merchandise, ProductCategory productCategory, String str) {
        return TEnum.equals(merchandise.category, productCategory) && m199786l(merchandise, str);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m199791q(Merchandise merchandise, String str) {
        return m199786l(merchandise, str);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m199792r(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f182495b.contains(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m199793s(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && m199786l(merchandise, MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m199794t(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "oDiamond") && m199786l(merchandise, MonetizationPromotionsId.lowPriceODiamond);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m199795u(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svipPicksMembership") && m199786l(merchandise, MonetizationPromotionsId.lowPriceSVIPPicks);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m199796v(String str, Merchandise merchandise) {
        if (TextUtils.equals(str, "svip")) {
            return TEnum.equals(merchandise.category, str) && m199786l(merchandise, MonetizationPromotionsId.lowPriceCallback3SVIP);
        }
        return TextUtils.equals(str, ProductCategory.tttVip) && TEnum.equals(merchandise.category, str) && m199786l(merchandise, MonetizationPromotionsId.lowPriceCallback3VIP);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m199797w(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && m199786l(merchandise, MonetizationPromotionsId.lowPriceCustomerSVIP);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m199798x(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, ProductCategory.tttVip) && m199786l(merchandise, MonetizationPromotionsId.lowPriceCustomerVIP);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m199799y(Merchandise merchandise) {
        if (TEnum.equals(merchandise.category, ProductCategory.tttVip)) {
            return m199786l(merchandise, MonetizationPromotionsId.lowPriceFirstMonth) || m199786l(merchandise, MonetizationPromotionsId.lowPrice3Month) || m199786l(merchandise, MonetizationPromotionsId.lowPriceCustomerVIP);
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m199800z(boolean z) {
        f182494a = z;
    }
}
