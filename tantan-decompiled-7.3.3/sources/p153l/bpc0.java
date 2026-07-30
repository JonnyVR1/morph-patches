package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RecentContractInfo;
import com.p051p1.mobile.putong.core.data.RecentContractInfosData;
import com.p051p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public final class bpc0 {

    /* JADX INFO: renamed from: a */
    public static RecentContractInfo f77747a;

    /* JADX INFO: renamed from: b */
    public static RecentContractInfo f77748b;

    /* JADX INFO: renamed from: c */
    public static RecentContractInfo f77749c;

    /* JADX INFO: renamed from: d */
    public static RecentContractInfo f77750d;

    /* JADX INFO: renamed from: l.bpc0$a */
    public class C16076a implements y20<RecentContractInfosEnvelope> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(RecentContractInfosEnvelope recentContractInfosEnvelope) {
            RecentContractInfosData recentContractInfosData;
            List<RecentContractInfo> list;
            if (recentContractInfosEnvelope == null || (recentContractInfosData = recentContractInfosEnvelope.data) == null || (list = recentContractInfosData.contracts) == null) {
                return;
            }
            bpc0.m105800l(list);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m105790b() {
        f77747a = null;
        f77748b = null;
        f77749c = null;
        f77750d = null;
    }

    /* JADX INFO: renamed from: c */
    public static C22421c<RecentContractInfosEnvelope> m105791c() {
        return CoreModule.f18264c.f20371a2.m151659c3().doOnNext(new C16076a());
    }

    /* JADX INFO: renamed from: d */
    public static RecentContractInfo m105792d(PurchaseType purchaseType) {
        if (purchaseType == null) {
            return null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m105797i();
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            return m105794f();
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return m105793e();
        }
        if (purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m105795g();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static RecentContractInfo m105793e() {
        return f77749c;
    }

    /* JADX INFO: renamed from: f */
    public static RecentContractInfo m105794f() {
        return f77748b;
    }

    /* JADX INFO: renamed from: g */
    public static RecentContractInfo m105795g() {
        return f77750d;
    }

    /* JADX INFO: renamed from: h */
    public static String m105796h(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM105792d;
        if (purchaseType != null && (recentContractInfoM105792d = m105792d(purchaseType)) != null && recentContractInfoM105792d.isUpgraded && NullChecker.m82486a(recentContractInfoM105792d.productType)) {
            if ("vip".equals(recentContractInfoM105792d.productType)) {
                return "vipUpgradeToPremium";
            }
            if ("seeWhoLikedMe".equals(recentContractInfoM105792d.productType)) {
                return "seeUpgradeToPremium";
            }
            if ("svip".equals(recentContractInfoM105792d.productType)) {
                return "premiumUpgradeToUltra";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public static RecentContractInfo m105797i() {
        return f77747a;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m105798j(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM105792d = m105792d(purchaseType);
        if (recentContractInfoM105792d != null && "googleplay".equals(recentContractInfoM105792d.platform)) {
            return !recentContractInfoM105792d.autoRenew;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m105799k(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM105792d = m105792d(purchaseType);
        if (recentContractInfoM105792d == null) {
            return false;
        }
        return recentContractInfoM105792d.isUpgraded;
    }

    /* JADX INFO: renamed from: l */
    public static void m105800l(List<RecentContractInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f77747a = null;
        f77748b = null;
        f77749c = null;
        f77750d = null;
        for (RecentContractInfo recentContractInfo : list) {
            if (recentContractInfo != null && NullChecker.m82486a(recentContractInfo.membershipType)) {
                if ("vip".equals(recentContractInfo.membershipType)) {
                    if (f77747a == null) {
                        f77747a = recentContractInfo;
                    }
                } else if ("seeWhoLikedMe".equals(recentContractInfo.membershipType)) {
                    if (f77748b == null) {
                        f77748b = recentContractInfo;
                    }
                } else if ("svip".equals(recentContractInfo.membershipType)) {
                    if (f77749c == null) {
                        f77749c = recentContractInfo;
                    }
                } else if (ProductCategory.tttUltraPremium.equals(recentContractInfo.membershipType) || SummarizedPrivilegesId.ultraPremium.equals(recentContractInfo.membershipType)) {
                    if (f77750d == null) {
                        f77750d = recentContractInfo;
                    }
                }
            }
        }
    }
}
