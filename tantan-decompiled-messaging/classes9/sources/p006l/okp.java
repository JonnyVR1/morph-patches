package p006l;

import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class okp {
    /* JADX INFO: renamed from: a */
    public static String m20689a(Act act, PurchaseType purchaseType) {
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            return act.getString(R$string.f2201Vf);
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            return act.getString(R$string.f2851qn);
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return act.getString(R$string.f1991Of);
        }
        return purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM ? act.getString(R$string.f2478ej) : "";
    }

    /* JADX INFO: renamed from: b */
    public static String m20690b(Act act, PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesIdM20691c = m20691c(purchaseType);
        if (summarizedPrivilegesIdM20691c == null) {
            return act.getString(R$string.f2941tn);
        }
        String strM20689a = m20689a(act, purchaseType);
        if (strM20689a == null || strM20689a.isEmpty()) {
            return act.getString(R$string.f2941tn);
        }
        int i = R$string.f2941tn;
        int i2 = R$string.f3020wc;
        int i3 = R$string.f3110zc;
        long jGuessedCurrentServerTime = qib0.f19784H.guessedCurrentServerTime();
        long jM27402v3 = xma.m27402v3(summarizedPrivilegesIdM20691c);
        if (jM27402v3 == 0) {
            return act.getString(i);
        }
        long j = jM27402v3 - jGuessedCurrentServerTime;
        if (j >= 0) {
            return strM20689a + " " + act.getString(i2, "" + m20692d(j));
        }
        return strM20689a + " " + act.getString(i3, "" + m20692d(jGuessedCurrentServerTime - jM27402v3));
    }

    /* JADX INFO: renamed from: c */
    public static SummarizedPrivilegesId m20691c(PurchaseType purchaseType) {
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

    /* JADX INFO: renamed from: d */
    public static long m20692d(long j) {
        return (j / 86400000) + 1;
    }
}
