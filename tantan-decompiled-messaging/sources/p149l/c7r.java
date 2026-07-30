package p149l;

import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class c7r {
    /* JADX INFO: renamed from: b */
    public static PurchaseType m105626b() {
        if (!xma.m210081j4()) {
            return PurchaseType.TYPE_ULTRA_PREMIUM;
        }
        if (!xma.m210071e4()) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        if (xma.m210087m4()) {
            return !xma.m210077h4() ? PurchaseType.TYPE_GET_LIKERS : m105627c();
        }
        return PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseType m105627c() {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
        PurchaseType purchaseType4 = PurchaseType.TYPE_GET_VIP;
        ArrayList arrayListM200324f0 = vwb.m200324f0(purchaseType, purchaseType2, purchaseType3, purchaseType4);
        arrayListM200324f0.sort(new Comparator() { // from class: l.b7r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(c7r.m105628d((PurchaseType) obj2), c7r.m105628d((PurchaseType) obj));
            }
        });
        PurchaseType purchaseType5 = (PurchaseType) arrayListM200324f0.get(0);
        return m105628d(purchaseType5) == 0 ? purchaseType4 : purchaseType5;
    }

    /* JADX INFO: renamed from: d */
    public static long m105628d(PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesIdM105629e = m105629e(purchaseType);
        if (summarizedPrivilegesIdM105629e == null) {
            return 0L;
        }
        return xma.m210094v3(summarizedPrivilegesIdM105629e);
    }

    /* JADX INFO: renamed from: e */
    public static SummarizedPrivilegesId m105629e(PurchaseType purchaseType) {
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            return SummarizedPrivilegesId.get("vip");
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            return SummarizedPrivilegesId.get("seeWhoLikedMe");
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return SummarizedPrivilegesId.get("svip");
        }
        if (purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM) {
            return SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m105630f() {
        return xma.m210087m4() && xma.m210077h4() && xma.m210071e4() && xma.m210081j4();
    }
}
