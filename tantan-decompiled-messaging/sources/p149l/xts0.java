package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xts0 extends vss0 implements bvs0 {
    /* JADX INFO: renamed from: P2 */
    public static bvs0 m211024P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof bvs0 ? (bvs0) iInterfaceQueryLocalInterface : new pxs0(iBinder);
    }
}
