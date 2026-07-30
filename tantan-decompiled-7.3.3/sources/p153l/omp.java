package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;

/* JADX INFO: loaded from: classes12.dex */
public class omp {
    /* JADX INFO: renamed from: a */
    public static String m168276a(Act act, PurchaseType purchaseType) {
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            return act.getString(R$string.f19524og);
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            return act.getString(R$string.f18680Mn);
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return act.getString(R$string.f19278gg);
        }
        return purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM ? act.getString(R$string.f18305Aj) : "";
    }

    /* JADX INFO: renamed from: b */
    public static String m168277b(Act act, PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesIdM168278c = m168278c(purchaseType);
        if (summarizedPrivilegesIdM168278c == null) {
            return act.getString(R$string.f18770Pn);
        }
        String strM168276a = m168276a(act, purchaseType);
        if (strM168276a == null || strM168276a.isEmpty()) {
            return act.getString(R$string.f18770Pn);
        }
        int i = R$string.f18770Pn;
        int i2 = R$string.f18639Lc;
        int i3 = R$string.f18729Oc;
        long jGuessedCurrentServerTime = uqb0.f180376H.guessedCurrentServerTime();
        long jM146409w3 = joa.m146409w3(summarizedPrivilegesIdM168278c);
        if (jM146409w3 == 0) {
            return act.getString(i);
        }
        long j = jM146409w3 - jGuessedCurrentServerTime;
        if (j >= 0) {
            return strM168276a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(i2, "" + m168279d(j));
        }
        return strM168276a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(i3, "" + m168279d(jGuessedCurrentServerTime - jM146409w3));
    }

    /* JADX INFO: renamed from: c */
    public static SummarizedPrivilegesId m168278c(PurchaseType purchaseType) {
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

    /* JADX INFO: renamed from: d */
    public static long m168279d(long j) {
        return (j / 86400000) + 1;
    }
}
