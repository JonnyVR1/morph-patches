package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i1v0 extends y8s0 implements sxv0 {
    /* JADX INFO: renamed from: O */
    public static sxv0 m138154O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return iInterfaceQueryLocalInterface instanceof sxv0 ? (sxv0) iInterfaceQueryLocalInterface : new f4u0(iBinder);
    }
}
