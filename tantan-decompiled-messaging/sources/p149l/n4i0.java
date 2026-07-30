package p149l;

import com.p046p1.mobile.putong.core.data.PurchaseType;

/* JADX INFO: loaded from: classes10.dex */
public class n4i0 {
    /* JADX INFO: renamed from: a */
    public static PurchaseType m157865a(PurchaseType purchaseType) {
        return m157866b() ? PurchaseType.TYPE_INTL_DIAMOND : purchaseType;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m157866b() {
        return "diamond".equals(qib0.f154686D0);
    }
}
