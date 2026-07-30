package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ats0 extends kxr0 implements cus0 {
    /* JADX INFO: renamed from: o8 */
    public static cus0 m98878o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof cus0 ? (cus0) iInterfaceQueryLocalInterface : new yrs0(iBinder);
    }
}
