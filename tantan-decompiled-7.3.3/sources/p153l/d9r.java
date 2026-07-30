package p153l;

import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class d9r {
    /* JADX INFO: renamed from: b */
    public static PurchaseType m115091b() {
        if (!joa.m146396k4()) {
            return PurchaseType.TYPE_ULTRA_PREMIUM;
        }
        if (!joa.m146386f4()) {
            return PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        }
        if (joa.m146401n4()) {
            return !joa.m146392i4() ? PurchaseType.TYPE_GET_LIKERS : m115092c();
        }
        return PurchaseType.TYPE_GET_VIP;
    }

    /* JADX INFO: renamed from: c */
    public static PurchaseType m115092c() {
        PurchaseType purchaseType = PurchaseType.TYPE_ULTRA_PREMIUM;
        PurchaseType purchaseType2 = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        PurchaseType purchaseType3 = PurchaseType.TYPE_GET_LIKERS;
        PurchaseType purchaseType4 = PurchaseType.TYPE_GET_VIP;
        ArrayList arrayListM147507f0 = jyb.m147507f0(purchaseType, purchaseType2, purchaseType3, purchaseType4);
        arrayListM147507f0.sort(new Comparator() { // from class: l.c9r
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(d9r.m115093d((PurchaseType) obj2), d9r.m115093d((PurchaseType) obj));
            }
        });
        PurchaseType purchaseType5 = (PurchaseType) arrayListM147507f0.get(0);
        return m115093d(purchaseType5) == 0 ? purchaseType4 : purchaseType5;
    }

    /* JADX INFO: renamed from: d */
    public static long m115093d(PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesIdM115094e = m115094e(purchaseType);
        if (summarizedPrivilegesIdM115094e == null) {
            return 0L;
        }
        return joa.m146409w3(summarizedPrivilegesIdM115094e);
    }

    /* JADX INFO: renamed from: e */
    public static SummarizedPrivilegesId m115094e(PurchaseType purchaseType) {
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
    public static boolean m115095f() {
        return joa.m146401n4() && joa.m146392i4() && joa.m146386f4() && joa.m146396k4();
    }
}
