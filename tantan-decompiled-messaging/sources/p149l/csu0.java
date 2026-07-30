package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class csu0 extends szr0 implements mov0 {
    /* JADX INFO: renamed from: O */
    public static mov0 m108562O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof mov0 ? (mov0) iInterfaceQueryLocalInterface : new zut0(iBinder);
    }
}
