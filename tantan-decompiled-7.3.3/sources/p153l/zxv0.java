package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zxv0 extends f9s0 implements o1v0 {
    /* JADX INFO: renamed from: P2 */
    public static o1v0 m222087P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return iInterfaceQueryLocalInterface instanceof o1v0 ? (o1v0) iInterfaceQueryLocalInterface : new sqw0(iBinder);
    }
}
