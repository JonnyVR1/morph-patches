package p153l;

import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes12.dex */
public class wib0 {
    /* JADX INFO: renamed from: a */
    public static boolean m206557a(PurchaseType purchaseType) {
        return m206575s(purchaseType) || m206573q(purchaseType) || m206569m(purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public static PurchaseType m206558b(ProductCategory productCategory) {
        if (TEnum.equals(productCategory, "svip")) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        if (TEnum.equals(productCategory, "oDiamond")) {
            return PurchaseType.TYPE_O_DIAMOND;
        }
        if (TEnum.equals(productCategory, ProductCategory.tttVip)) {
            return PurchaseType.TYPE_GET_VIP;
        }
        if (TEnum.equals(productCategory, "picksMembership")) {
            return PurchaseType.TYPE_PICKS_MEMBERSHIP;
        }
        if (TEnum.equals(productCategory, "coin")) {
            return PurchaseType.TYPE_GET_NON_LIVE_COIN;
        }
        if (TEnum.equals(productCategory, ProductCategory.tttCoin)) {
            return PurchaseType.TYPE_INTL_TTT_COIN;
        }
        if (TEnum.equals(productCategory, ProductCategory.tttLiveCoin)) {
            return PurchaseType.TYPE_INTL_TTT_LIVE_COIN;
        }
        if (TEnum.equals(productCategory, "platinum")) {
            return PurchaseType.TYPE_O_PLATINUM;
        }
        if (TEnum.equals(productCategory, "femaleVip")) {
            return PurchaseType.TYPE_FEMALE_VIP;
        }
        if (TEnum.equals(productCategory, "youthVip")) {
            return PurchaseType.TYPE_YOUTH_VIP;
        }
        if (TEnum.equals(productCategory, "privateCustom")) {
            return PurchaseType.TYPE_PRIVATE_CUSTOM;
        }
        return TEnum.equals(productCategory, ProductCategory.oDiamondPrivateCustom) ? PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM : PurchaseType.TYPE_NONE;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m206559c(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_ACCELERATE_PAIRING;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m206560d(PurchaseType purchaseType) {
        return m206569m(purchaseType) || m206573q(purchaseType) || m206579w(purchaseType) || m206565i(purchaseType) || m206571o(purchaseType) || m206563g(purchaseType) || m206580x(purchaseType) || m206572p(purchaseType) || m206566j(purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m206561e(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_BOOST;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m206562f(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_NON_LIVE_COIN || purchaseType == PurchaseType.TYPE_INTL_TTT_COIN;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m206563g(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_FEMALE_VIP;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m206564h(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_LIMITED_TRIAL_SEE;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m206565i(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_O_DIAMOND;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m206566j(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m206567k(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m206568l(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m206569m(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m206570n(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_PICKS;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m206571o(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_O_PLATINUM;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m206572p(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_PRIVATE_CUSTOM;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m206573q(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m206574r(PurchaseType purchaseType) {
        return m206579w(purchaseType) || m206575s(purchaseType) || m206567k(purchaseType) || m206573q(purchaseType);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m206575s(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_LIKERS;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m206576t(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m206577u(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_SUPREME_PARTNER;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m206578v(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m206579w(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m206580x(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_YOUTH_VIP;
    }
}
