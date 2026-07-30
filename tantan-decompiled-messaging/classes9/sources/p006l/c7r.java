package p006l;

import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import java.util.ArrayList;
import java.util.Comparator;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public final class c7r {
    /* JADX INFO: renamed from: b */
    public static PurchaseType m13274b() {
        if (!xma.m27389j4()) {
            return PurchaseType.TYPE_ULTRA_PREMIUM;
        }
        if (!xma.m27379e4()) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        if (xma.m27395m4()) {
            return !xma.m27385h4() ? PurchaseType.TYPE_GET_LIKERS : m13275c();
        }
        return PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseType m13275c() {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
        PurchaseType purchaseType4 = PurchaseType.TYPE_GET_VIP;
        ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{purchaseType, purchaseType2, purchaseType3, purchaseType4});
        arrayListF0.sort(new Comparator() { // from class: l.b7r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(c7r.m13276d((PurchaseType) obj2), c7r.m13276d((PurchaseType) obj));
            }
        });
        PurchaseType purchaseType5 = (PurchaseType) arrayListF0.get(0);
        return m13276d(purchaseType5) == 0 ? purchaseType4 : purchaseType5;
    }

    /* JADX INFO: renamed from: d */
    public static long m13276d(PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesIdM13277e = m13277e(purchaseType);
        if (summarizedPrivilegesIdM13277e == null) {
            return 0L;
        }
        return xma.m27402v3(summarizedPrivilegesIdM13277e);
    }

    /* JADX INFO: renamed from: e */
    public static SummarizedPrivilegesId m13277e(PurchaseType purchaseType) {
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
            return SummarizedPrivilegesId.get("ultraPremium");
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m13278f() {
        return xma.m27395m4() && xma.m27385h4() && xma.m27379e4() && xma.m27389j4();
    }
}
