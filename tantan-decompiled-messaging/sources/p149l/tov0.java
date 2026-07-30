package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tov0 extends zzr0 implements isu0 {
    /* JADX INFO: renamed from: P2 */
    public static isu0 m189934P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return iInterfaceQueryLocalInterface instanceof isu0 ? (isu0) iInterfaceQueryLocalInterface : new mhw0(iBinder);
    }
}
