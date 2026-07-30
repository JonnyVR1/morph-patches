package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uoy0 extends zzr0 implements uny0 {
    /* JADX INFO: renamed from: P2 */
    public static uny0 m194581P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return iInterfaceQueryLocalInterface instanceof uny0 ? (uny0) iInterfaceQueryLocalInterface : new oqy0(iBinder);
    }
}
