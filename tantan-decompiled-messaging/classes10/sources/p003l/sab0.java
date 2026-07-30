package p003l;

import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class sab0 {
    /* JADX INFO: renamed from: a */
    public static boolean m9248a(PurchaseType purchaseType) {
        return m9266s(purchaseType) || m9264q(purchaseType) || m9260m(purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public static PurchaseType m9249b(ProductCategory productCategory) {
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
    public static boolean m9250c(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_ACCELERATE_PAIRING;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m9251d(PurchaseType purchaseType) {
        return m9260m(purchaseType) || m9264q(purchaseType) || m9270w(purchaseType) || m9256i(purchaseType) || m9262o(purchaseType) || m9254g(purchaseType) || m9271x(purchaseType) || m9263p(purchaseType) || m9257j(purchaseType);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9252e(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_BOOST;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9253f(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_NON_LIVE_COIN || purchaseType == PurchaseType.TYPE_INTL_TTT_COIN;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9254g(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_FEMALE_VIP;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m9255h(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_LIMITED_TRIAL_SEE;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m9256i(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_O_DIAMOND;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m9257j(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9258k(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9259l(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m9260m(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_PICKS_MEMBERSHIP || purchaseType == PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9261n(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_PICKS;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m9262o(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_O_PLATINUM;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9263p(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_PRIVATE_CUSTOM;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9264q(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m9265r(PurchaseType purchaseType) {
        return m9270w(purchaseType) || m9266s(purchaseType) || m9258k(purchaseType) || m9264q(purchaseType);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9266s(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_LIKERS;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m9267t(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_VIP_SUPERLIKE;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m9268u(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_SUPREME_PARTNER;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m9269v(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m9270w(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m9271x(PurchaseType purchaseType) {
        return purchaseType == PurchaseType.TYPE_YOUTH_VIP;
    }
}
