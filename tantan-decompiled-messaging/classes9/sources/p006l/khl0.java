package p006l;

import android.app.Activity;
import android.net.Uri;
import com.p1.mobile.putong.core.data.PurchaseType;
import l.juk;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class khl0 {
    /* JADX INFO: renamed from: a */
    public static int m18123a(String str) {
        return ahl0.m11839p0(m18125c(str));
    }

    /* JADX INFO: renamed from: b */
    public static PurchaseType m18124b(String str) {
        if (vwb.L(str)) {
            return PurchaseType.TYPE_GET_VIP;
        }
        str.getClass();
        switch (str) {
            case "ultraPremium":
                return PurchaseType.TYPE_ULTRA_PREMIUM;
            case "youthVip":
                return PurchaseType.TYPE_YOUTH_VIP;
            case "see":
                return PurchaseType.TYPE_GET_LIKERS;
            case "vip":
                return PurchaseType.TYPE_GET_VIP;
            case "svip":
                return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            case "boost":
                return PurchaseType.TYPE_GET_BOOST;
            case "femaleVip":
                return PurchaseType.TYPE_FEMALE_VIP;
            case "quickchat":
                return PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
            case "default":
                return PurchaseType.TYPE_GET_VIP;
            case "platinum":
                return PurchaseType.TYPE_O_PLATINUM;
            default:
                return PurchaseType.TYPE_GET_VIP;
        }
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseType m18125c(String str) {
        if (vwb.L(str)) {
            return PurchaseType.TYPE_GET_VIP;
        }
        str.getClass();
        switch (str) {
            case "ultraPremium":
                return PurchaseType.TYPE_ULTRA_PREMIUM;
            case "partner":
                return PurchaseType.TYPE_SUPREME_PARTNER;
            case "youthVip":
                return PurchaseType.TYPE_YOUTH_VIP;
            case "see":
                return PurchaseType.TYPE_GET_LIKERS;
            case "vip":
                return PurchaseType.TYPE_GET_VIP;
            case "svip":
                return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            case "boost":
                return PurchaseType.TYPE_GET_BOOST;
            case "femaleVip":
                return PurchaseType.TYPE_FEMALE_VIP;
            case "quickchat":
                return PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS;
            case "diamond":
                return PurchaseType.TYPE_O_DIAMOND;
            case "platinum":
                return PurchaseType.TYPE_O_PLATINUM;
            default:
                return PurchaseType.TYPE_GET_VIP;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m18126d(Activity activity, String str, String str2) {
        j2e0.m17248m(activity, Uri.parse("tantanapp://webview?title=" + str + "&url=" + str2));
    }

    /* JADX INFO: renamed from: e */
    public static void m18127e(Activity activity) {
        m18126d(activity, "", juk.e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1");
    }
}
