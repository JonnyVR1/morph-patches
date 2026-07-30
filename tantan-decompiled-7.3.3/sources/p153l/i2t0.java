package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class i2t0 extends q6s0 implements j2t0 {
    /* JADX INFO: renamed from: o8 */
    public static j2t0 m138236o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof j2t0 ? (j2t0) iInterfaceQueryLocalInterface : new h2t0(iBinder);
    }
}
