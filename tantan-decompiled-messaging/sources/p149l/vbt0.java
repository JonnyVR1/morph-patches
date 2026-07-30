package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vbt0 extends kxr0 implements wbt0 {
    /* JADX INFO: renamed from: o8 */
    public static wbt0 m197735o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof wbt0 ? (wbt0) iInterfaceQueryLocalInterface : new ubt0(iBinder);
    }
}
