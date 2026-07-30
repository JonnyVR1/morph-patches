package p003l;

import com.p000p1.mobile.putong.core.data.ConsumeType;
import com.p000p1.mobile.putong.core.data.PurchaseType;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n4i0 {
    /* JADX INFO: renamed from: a */
    public static PurchaseType m8308a(PurchaseType purchaseType) {
        return m8309b() ? PurchaseType.TYPE_INTL_DIAMOND : purchaseType;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8309b() {
        return ConsumeType.diamond.equals(qib0.D0);
    }
}
