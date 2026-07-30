package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xqr0 extends gxr0 implements jsr0 {
    /* JADX INFO: renamed from: P2 */
    public static jsr0 m212740P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return iInterfaceQueryLocalInterface instanceof jsr0 ? (jsr0) iInterfaceQueryLocalInterface : new npr0(iBinder);
    }
}
