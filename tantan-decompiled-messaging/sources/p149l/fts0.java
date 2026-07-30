package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class fts0 extends kxr0 implements gts0 {
    /* JADX INFO: renamed from: o8 */
    public static gts0 m123088o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof gts0 ? (gts0) iInterfaceQueryLocalInterface : new ets0(iBinder);
    }
}
