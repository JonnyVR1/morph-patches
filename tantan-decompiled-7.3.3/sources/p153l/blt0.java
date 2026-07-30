package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class blt0 extends q6s0 implements clt0 {
    /* JADX INFO: renamed from: o8 */
    public static clt0 m104933o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof clt0 ? (clt0) iInterfaceQueryLocalInterface : new alt0(iBinder);
    }
}
