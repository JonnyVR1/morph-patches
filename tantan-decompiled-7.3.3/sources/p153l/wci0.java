package p153l;

import com.p051p1.mobile.putong.core.data.PurchaseType;

/* JADX INFO: loaded from: classes12.dex */
public class wci0 {
    /* JADX INFO: renamed from: a */
    public static PurchaseType m205820a(PurchaseType purchaseType) {
        return m205821b() ? PurchaseType.TYPE_INTL_DIAMOND : purchaseType;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m205821b() {
        return "diamond".equals(uqb0.f180369D0);
    }
}
