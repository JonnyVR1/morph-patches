package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;

/* JADX INFO: loaded from: classes9.dex */
public class okp {
    /* JADX INFO: renamed from: a */
    public static String m164885a(Act act, PurchaseType purchaseType) {
        if (purchaseType == PurchaseType.TYPE_GET_VIP) {
            return act.getString(R$string.f18212Vf);
        }
        if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            return act.getString(R$string.f18862qn);
        }
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            return act.getString(R$string.f18002Of);
        }
        return purchaseType == PurchaseType.TYPE_ULTRA_PREMIUM ? act.getString(R$string.f18489ej) : "";
    }

    /* JADX INFO: renamed from: b */
    public static String m164886b(Act act, PurchaseType purchaseType) {
        SummarizedPrivilegesId summarizedPrivilegesIdM164887c = m164887c(purchaseType);
        if (summarizedPrivilegesIdM164887c == null) {
            return act.getString(R$string.f18952tn);
        }
        String strM164885a = m164885a(act, purchaseType);
        if (strM164885a == null || strM164885a.isEmpty()) {
            return act.getString(R$string.f18952tn);
        }
        int i = R$string.f18952tn;
        int i2 = R$string.f19031wc;
        int i3 = R$string.f19121zc;
        long jGuessedCurrentServerTime = qib0.f154693H.guessedCurrentServerTime();
        long jM210094v3 = xma.m210094v3(summarizedPrivilegesIdM164887c);
        if (jM210094v3 == 0) {
            return act.getString(i);
        }
        long j = jM210094v3 - jGuessedCurrentServerTime;
        if (j >= 0) {
            return strM164885a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(i2, "" + m164888d(j));
        }
        return strM164885a + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + act.getString(i3, "" + m164888d(jGuessedCurrentServerTime - jM210094v3));
    }

    /* JADX INFO: renamed from: c */
    public static SummarizedPrivilegesId m164887c(PurchaseType purchaseType) {
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
    public static long m164888d(long j) {
        return (j / 86400000) + 1;
    }
}
