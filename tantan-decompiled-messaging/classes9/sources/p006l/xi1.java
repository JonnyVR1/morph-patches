package p006l;

import com.p1.mobile.putong.core.data.PurchaseType;
import l.sab0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xi1 {

    /* JADX INFO: renamed from: a */
    public static boolean f27521a = true;

    /* JADX INFO: renamed from: a */
    public static void m27266a(boolean z) {
        f27521a = z;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27267b(PurchaseType purchaseType) {
        return (PurchaseType.TYPE_INTL_TTT_LIVE_COIN == purchaseType || sab0.i(purchaseType) || sab0.j(purchaseType) || sab0.p(purchaseType)) ? false : true;
    }
}
