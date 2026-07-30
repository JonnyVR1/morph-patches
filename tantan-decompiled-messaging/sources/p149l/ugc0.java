package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RecentContractInfo;
import com.p046p1.mobile.putong.core.data.RecentContractInfosData;
import com.p046p1.mobile.putong.core.data.RecentContractInfosEnvelope;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public final class ugc0 {

    /* JADX INFO: renamed from: a */
    public static RecentContractInfo f176371a;

    /* JADX INFO: renamed from: b */
    public static RecentContractInfo f176372b;

    /* JADX INFO: renamed from: c */
    public static RecentContractInfo f176373c;

    /* JADX INFO: renamed from: d */
    public static RecentContractInfo f176374d;

    /* JADX INFO: renamed from: l.ugc0$a */
    public class C20424a implements e30<RecentContractInfosEnvelope> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(RecentContractInfosEnvelope recentContractInfosEnvelope) {
            RecentContractInfosData recentContractInfosData;
            List<RecentContractInfo> list;
            if (recentContractInfosEnvelope == null || (recentContractInfosData = recentContractInfosEnvelope.data) == null || (list = recentContractInfosData.contracts) == null) {
                return;
            }
            ugc0.m193545l(list);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m193535b() {
        f176371a = null;
        f176372b = null;
        f176373c = null;
        f176374d = null;
    }

    /* JADX INFO: renamed from: c */
    public static C22306c<RecentContractInfosEnvelope> m193536c() {
        return CoreModule.f17545c.f19629a2.m216000c3().doOnNext(new C20424a());
    }

    /* JADX INFO: renamed from: d */
    public static RecentContractInfo m193537d(PurchaseType purchaseType) {
        if (purchaseType == null) {
            return null;
        }
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            return m193542i();
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            return m193539f();
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return m193538e();
        }
        if (purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return m193540g();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static RecentContractInfo m193538e() {
        return f176373c;
    }

    /* JADX INFO: renamed from: f */
    public static RecentContractInfo m193539f() {
        return f176372b;
    }

    /* JADX INFO: renamed from: g */
    public static RecentContractInfo m193540g() {
        return f176374d;
    }

    /* JADX INFO: renamed from: h */
    public static String m193541h(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM193537d;
        if (purchaseType != null && (recentContractInfoM193537d = m193537d(purchaseType)) != null && recentContractInfoM193537d.isUpgraded && NullChecker.m81303a(recentContractInfoM193537d.productType)) {
            if ("vip".equals(recentContractInfoM193537d.productType)) {
                return "vipUpgradeToPremium";
            }
            if ("seeWhoLikedMe".equals(recentContractInfoM193537d.productType)) {
                return "seeUpgradeToPremium";
            }
            if ("svip".equals(recentContractInfoM193537d.productType)) {
                return "premiumUpgradeToUltra";
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: i */
    public static RecentContractInfo m193542i() {
        return f176371a;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m193543j(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM193537d = m193537d(purchaseType);
        if (recentContractInfoM193537d != null && "googleplay".equals(recentContractInfoM193537d.platform)) {
            return !recentContractInfoM193537d.autoRenew;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m193544k(PurchaseType purchaseType) {
        RecentContractInfo recentContractInfoM193537d = m193537d(purchaseType);
        if (recentContractInfoM193537d == null) {
            return false;
        }
        return recentContractInfoM193537d.isUpgraded;
    }

    /* JADX INFO: renamed from: l */
    public static void m193545l(List<RecentContractInfo> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        f176371a = null;
        f176372b = null;
        f176373c = null;
        f176374d = null;
        for (RecentContractInfo recentContractInfo : list) {
            if (recentContractInfo != null && NullChecker.m81303a(recentContractInfo.membershipType)) {
                if ("vip".equals(recentContractInfo.membershipType)) {
                    if (f176371a == null) {
                        f176371a = recentContractInfo;
                    }
                } else if ("seeWhoLikedMe".equals(recentContractInfo.membershipType)) {
                    if (f176372b == null) {
                        f176372b = recentContractInfo;
                    }
                } else if ("svip".equals(recentContractInfo.membershipType)) {
                    if (f176373c == null) {
                        f176373c = recentContractInfo;
                    }
                } else if (ProductCategory.tttUltraPremium.equals(recentContractInfo.membershipType) || SummarizedPrivilegesId.ultraPremium.equals(recentContractInfo.membershipType)) {
                    if (f176374d == null) {
                        f176374d = recentContractInfo;
                    }
                }
            }
        }
    }
}
