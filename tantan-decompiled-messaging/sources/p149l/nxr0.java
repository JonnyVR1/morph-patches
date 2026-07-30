package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nxr0 extends kxr0 implements oxr0 {
    /* JADX INFO: renamed from: o8 */
    public static oxr0 m161950o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof oxr0 ? (oxr0) iInterfaceQueryLocalInterface : new mxr0(iBinder);
    }
}
