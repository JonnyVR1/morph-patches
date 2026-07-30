package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.promotion.ConstantCouponId;
import com.p046p1.mobile.putong.core.data.Coupon;
import com.p046p1.mobile.putong.core.data.Merchandise;
import com.p046p1.mobile.putong.core.data.MonetizationPromotionsId;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class rxa0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f161413a = false;

    /* JADX INFO: renamed from: b */
    public static ArrayList<String> f161414b = vwb.m200324f0(ConstantCouponId.lowPriceCustomerVIP_local_1W, ConstantCouponId.lowPriceCustomerVIP_local_1M, ConstantCouponId.lowPriceCustomerVIP_local_1M_21, ConstantCouponId.lowPriceCustomerVIP_local_3M, ConstantCouponId.lowPriceCustomerVIP_local_3M_56, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_3M_under23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h_58, ConstantCouponId.lowPriceCustomerSVIP_local_3M_exceed23age_h_128, ConstantCouponId.lowPriceCustomerSVIP_local_6M_exceed23age_h, ConstantCouponId.lowPriceCustomerSVIP_local_6M_under23age_h, ConstantCouponId.lowPriceFirstMonthVIP1M_local, ConstantCouponId.lowPrice3MonthVIP1M1R_local, ConstantCouponId.lowPriceCustomerSVIP_local_1M_exceed23age_h_60, ConstantCouponId.lowPriceCustomerSVIP_local_6M_exceed23age_h_198);

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m181480a(String str, Merchandise merchandise) {
        return m181489j(merchandise, str) ? Boolean.TRUE : Boolean.FALSE;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m181481b(Merchandise merchandise) {
        if (m181495p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerSVIP) || m181495p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPriceCustomerVIP) || m181495p(merchandise, ProductCategory.get(ProductCategory.tttVip), MonetizationPromotionsId.lowPrice3Month)) {
            return true;
        }
        return (CoreModule.f17554l.m94651a().mo33529k() && m181495p(merchandise, ProductCategory.get("svipPicksMembership"), MonetizationPromotionsId.lowPriceSVIPPicks)) || m181495p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceFirstTime12MSVIP) || m181495p(merchandise, ProductCategory.get("oDiamond"), MonetizationPromotionsId.lowPriceODiamond) || m181495p(merchandise, ProductCategory.get("svip"), MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m181482c(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (m181481b(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m181483d(List<Merchandise> list) {
        Iterator<Merchandise> it = list.iterator();
        while (it.hasNext()) {
            if (m181493n(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m181484e(List<Merchandise> list) {
        for (Merchandise merchandise : list) {
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static Merchandise m181485f(ProductCategory productCategory, final String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<Merchandise> listM30579D5 = CoreModule.f17545c.f19654j0.m30579D5(productCategory);
        if (vwb.m200296J(listM30579D5)) {
            return null;
        }
        return (Merchandise) vwb.m200346r(listM30579D5, new w9j() { // from class: l.qxa0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return rxa0.m181480a(str, (Merchandise) obj);
            }
        });
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static String m181486g(PurchaseTrackPageType purchaseTrackPageType, List<Coupon> list) {
        for (Coupon coupon : list) {
            if (((TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP1M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP3M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP6M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3SVIP12M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3VIP1M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3VIP3M_local) || TextUtils.equals(coupon.couponID, ConstantCouponId.lowPriceCallback3VIP12M_local)) && purchaseTrackPageType != PurchaseTrackPageType.page_discount_callback) || TextUtils.equals(coupon.couponID, ConstantCouponId.trialSVIP7Day_local_1M)) {
                return "default";
            }
            double dM155944o = mqi0.m155944o();
            if (dM155944o >= coupon.beginTime && dM155944o <= coupon.endTime) {
                return coupon.couponID;
            }
        }
        return "default";
    }

    /* JADX INFO: renamed from: h */
    public static boolean m181487h() {
        return f161413a;
    }

    /* JADX INFO: renamed from: i */
    public static Coupon m181488i(Merchandise merchandise) {
        return merchandise.getCouponForPromotionNew(MonetizationPromotionsId.trial7DSVIP);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m181489j(Merchandise merchandise, String str) {
        if (!TextUtils.isEmpty(str) && NullChecker.m81303a(merchandise) && !vwb.m200296J(merchandise.localCoupons)) {
            Coupon couponWithId = merchandise.getCouponWithId(str);
            if (NullChecker.m81303a(couponWithId)) {
                double dM155944o = mqi0.m155944o();
                if (dM155944o >= couponWithId.beginTime && dM155944o <= couponWithId.endTime) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m181490k(Merchandise merchandise) {
        return m181496q(merchandise, MonetizationPromotionsId.trial7DSVIP);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m181491l(Merchandise merchandise, String str) {
        if (NullChecker.m81303a(merchandise) && merchandise.isBelongPromotion(str)) {
            Coupon couponForPromotion = merchandise.getCouponForPromotion(str);
            long jM155944o = mqi0.m155944o();
            if (NullChecker.m81303a(couponForPromotion)) {
                double d = jM155944o;
                if (d >= couponForPromotion.beginTime && d <= couponForPromotion.endTime) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m181492m(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, ProductCategory.tttVip) && m181491l(merchandise, MonetizationPromotionsId.lowPriceFirstMonth);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m181493n(Merchandise merchandise) {
        return m181494o(merchandise, true);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m181494o(Merchandise merchandise, boolean z) {
        if (merchandise == null) {
            return false;
        }
        if (TEnum.equals(merchandise.category, ProductCategory.tttSeeWhoLikedMe) && !CoreModule.f17554l.m94651a().mo33489e2()) {
            return false;
        }
        if (TEnum.equals(merchandise.category, ProductCategory.tttVip) && CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            return false;
        }
        if ((TEnum.equals(merchandise.category, ProductCategory.tttVip) && merchandise.isBelongPromotion(MonetizationPromotionsId.trial7DVIP)) || vwb.m200296J(merchandise.localCoupons)) {
            return false;
        }
        double d = merchandise.localCoupons.get(0).beginTime;
        double d2 = merchandise.localCoupons.get(0).endTime;
        double dM155944o = mqi0.m155944o();
        return dM155944o >= d && dM155944o <= d2;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m181495p(Merchandise merchandise, ProductCategory productCategory, String str) {
        return TEnum.equals(merchandise.category, productCategory) && m181491l(merchandise, str);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m181496q(Merchandise merchandise, String str) {
        return m181491l(merchandise, str);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m181497r(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f161414b.contains(str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m181498s(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && m181491l(merchandise, MonetizationPromotionsId.lowPriceCustomerUpliftSVIP);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m181499t(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "oDiamond") && m181491l(merchandise, MonetizationPromotionsId.lowPriceODiamond);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m181500u(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svipPicksMembership") && m181491l(merchandise, MonetizationPromotionsId.lowPriceSVIPPicks);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m181501v(String str, Merchandise merchandise) {
        if (TextUtils.equals(str, "svip")) {
            return TEnum.equals(merchandise.category, str) && m181491l(merchandise, MonetizationPromotionsId.lowPriceCallback3SVIP);
        }
        return TextUtils.equals(str, ProductCategory.tttVip) && TEnum.equals(merchandise.category, str) && m181491l(merchandise, MonetizationPromotionsId.lowPriceCallback3VIP);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m181502w(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, "svip") && m181491l(merchandise, MonetizationPromotionsId.lowPriceCustomerSVIP);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m181503x(Merchandise merchandise) {
        return TEnum.equals(merchandise.category, ProductCategory.tttVip) && m181491l(merchandise, MonetizationPromotionsId.lowPriceCustomerVIP);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m181504y(Merchandise merchandise) {
        if (TEnum.equals(merchandise.category, ProductCategory.tttVip)) {
            return m181491l(merchandise, MonetizationPromotionsId.lowPriceFirstMonth) || m181491l(merchandise, MonetizationPromotionsId.lowPrice3Month) || m181491l(merchandise, MonetizationPromotionsId.lowPriceCustomerVIP);
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m181505z(boolean z) {
        f161413a = z;
    }
}
