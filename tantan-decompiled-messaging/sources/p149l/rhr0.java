package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rhr0 extends aor0 implements djr0 {
    /* JADX INFO: renamed from: P2 */
    public static djr0 m179461P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof djr0 ? (djr0) iInterfaceQueryLocalInterface : new hgr0(iBinder);
    }
}
