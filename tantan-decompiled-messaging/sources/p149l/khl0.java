package p149l;

import android.app.Activity;
import android.net.Uri;
import com.p046p1.mobile.putong.core.data.PurchaseType;

/* JADX INFO: loaded from: classes9.dex */
public class khl0 {
    /* JADX INFO: renamed from: a */
    public static int m145975a(String str) {
        return ahl0.m96501p0(m145977c(str));
    }

    /* JADX INFO: renamed from: b */
    public static PurchaseType m145976b(String str) {
        if (vwb.m200298L(str)) {
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
    public static PurchaseType m145977c(String str) {
        if (vwb.m200298L(str)) {
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
    public static void m145978d(Activity activity, String str, String str2) {
        j2e0.m139446m(activity, Uri.parse("tantanapp://webview?title=" + str + "&url=" + str2));
    }

    /* JADX INFO: renamed from: e */
    public static void m145979e(Activity activity) {
        m145978d(activity, "", juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/commerce/supreme-partner/index.html?speed=true&_bid=1004554&hideNavigationBar=1&hideNotch=1");
    }
}
