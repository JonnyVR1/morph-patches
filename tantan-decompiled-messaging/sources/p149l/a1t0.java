package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a1t0 extends kxr0 implements b1t0 {
    /* JADX INFO: renamed from: o8 */
    public static b1t0 m94574o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof b1t0 ? (b1t0) iInterfaceQueryLocalInterface : new z0t0(iBinder);
    }
}
