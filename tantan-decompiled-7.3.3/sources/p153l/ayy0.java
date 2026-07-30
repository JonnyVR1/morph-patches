package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ayy0 extends f9s0 implements axy0 {
    /* JADX INFO: renamed from: P2 */
    public static axy0 m100972P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return iInterfaceQueryLocalInterface instanceof axy0 ? (axy0) iInterfaceQueryLocalInterface : new uzy0(iBinder);
    }
}
