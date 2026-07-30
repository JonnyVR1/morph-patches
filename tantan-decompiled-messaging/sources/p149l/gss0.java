package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gss0 extends kxr0 implements hss0 {
    /* JADX INFO: renamed from: o8 */
    public static hss0 m127838o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof hss0 ? (hss0) iInterfaceQueryLocalInterface : new fss0(iBinder);
    }
}
