package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nss0 extends kxr0 implements oss0 {
    /* JADX INFO: renamed from: o8 */
    public static oss0 m160792o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof oss0 ? (oss0) iInterfaceQueryLocalInterface : new mss0(iBinder);
    }
}
