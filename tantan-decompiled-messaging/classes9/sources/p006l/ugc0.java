package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RecentContractInfo;
import com.p1.mobile.putong.core.data.RecentContractInfosData;
import com.p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class ugc0 {

    /* JADX INFO: renamed from: a */
    public static RecentContractInfo f23532a;

    /* JADX INFO: renamed from: b */
    public static RecentContractInfo f23533b;

    /* JADX INFO: renamed from: c */
    public static RecentContractInfo f23534c;

    /* JADX INFO: renamed from: d */
    public static RecentContractInfo f23535d;

    /* JADX INFO: renamed from: l.ugc0$a */
    public class C1344a implements e30<RecentContractInfosEnvelope> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(RecentContractInfosEnvelope recentContractInfosEnvelope) {
            RecentContractInfosData recentContractInfosData;
            List list;
            if (recentContractInfosEnvelope == null || (recentContractInfosData = recentContractInfosEnvelope.data) == null || (list = recentContractInfosData.contracts) == null) {
                return;
            }
            ugc0.m25216l(list);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25206b() {
        f23532a = null;
        f23533b = null;
        f23534c = null;
        f23535d = null;
    }

    /* JADX INFO: renamed from: c */
    public static c<RecentContractInfosEnvelope> m25207c() {
        return CoreModule.f1534c.f3618a2.m28393c3().doOnNext(new C1344a());
    }

    /* JADX INFO: renamed from: d */
    public static RecentContractInfo m25208d(PurchaseType purchaseType) {
        if (purchaseType == null) {
            return null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m25213i();
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            return m25210f();
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return m25209e();
        }
        if (purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m25211g();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static RecentContractInfo m25209e() {
        return f23534c;
    }

    /* JADX INFO: renamed from: f */
    public static RecentContractInfo m25210f() {
        return f23533b;
    }

    /* JADX INFO: renamed from: g */
    public static RecentContractInfo m25211g() {
        return f23535d;
    }

    /* JADX INFO: renamed from: h */
    public static String m25212h(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM25208d;
        if (purchaseType != null && (recentContractInfoM25208d = m25208d(purchaseType)) != null && recentContractInfoM25208d.isUpgraded && NullChecker.a(recentContractInfoM25208d.productType)) {
            if ("vip".equals(recentContractInfoM25208d.productType)) {
                return "vipUpgradeToPremium";
            }
            if ("seeWhoLikedMe".equals(recentContractInfoM25208d.productType)) {
                return "seeUpgradeToPremium";
            }
            if ("svip".equals(recentContractInfoM25208d.productType)) {
                return "premiumUpgradeToUltra";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public static RecentContractInfo m25213i() {
        return f23532a;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m25214j(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM25208d = m25208d(purchaseType);
        if (recentContractInfoM25208d != null && "googleplay".equals(recentContractInfoM25208d.platform)) {
            return !recentContractInfoM25208d.autoRenew;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m25215k(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM25208d = m25208d(purchaseType);
        if (recentContractInfoM25208d == null) {
            return false;
        }
        return recentContractInfoM25208d.isUpgraded;
    }

    /* JADX INFO: renamed from: l */
    public static void m25216l(List<RecentContractInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f23532a = null;
        f23533b = null;
        f23534c = null;
        f23535d = null;
        for (RecentContractInfo recentContractInfo : list) {
            if (recentContractInfo != null && NullChecker.a(recentContractInfo.membershipType)) {
                if ("vip".equals(recentContractInfo.membershipType)) {
                    if (f23532a == null) {
                        f23532a = recentContractInfo;
                    }
                } else if ("seeWhoLikedMe".equals(recentContractInfo.membershipType)) {
                    if (f23533b == null) {
                        f23533b = recentContractInfo;
                    }
                } else if ("svip".equals(recentContractInfo.membershipType)) {
                    if (f23534c == null) {
                        f23534c = recentContractInfo;
                    }
                } else if ("tttUltraPremium".equals(recentContractInfo.membershipType) || "ultraPremium".equals(recentContractInfo.membershipType)) {
                    if (f23535d == null) {
                        f23535d = recentContractInfo;
                    }
                }
            }
        }
    }
}
