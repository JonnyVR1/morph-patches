package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class cts0 extends kxr0 implements dts0 {
    /* JADX INFO: renamed from: o8 */
    public static dts0 m108696o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof dts0 ? (dts0) iInterfaceQueryLocalInterface : new bts0(iBinder);
    }
}
