package p002l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.PayMethod;
import l.c3m;
import l.id40;
import l.lej;
import l.oej;
import l.ozl;
import l.r0m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l2b0 {
    /* JADX INFO: renamed from: a */
    public static ozl m16939a(Act act, PurchaseType purchaseType, String str) {
        return new lej(act, purchaseType);
    }

    /* JADX INFO: renamed from: b */
    public static r0m m16940b(Act act, PurchaseType purchaseType, String str, boolean z, boolean z2) {
        return new oej(act, purchaseType, str, z2);
    }

    /* JADX INFO: renamed from: c */
    public static c3m m16941c(Act act, PurchaseType purchaseType, String str, PayMethod payMethod) {
        return new id40(act, purchaseType);
    }
}
