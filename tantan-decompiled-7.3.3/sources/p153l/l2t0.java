package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class l2t0 extends q6s0 implements m2t0 {
    /* JADX INFO: renamed from: o8 */
    public static m2t0 m152636o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof m2t0 ? (m2t0) iInterfaceQueryLocalInterface : new k2t0(iBinder);
    }
}
