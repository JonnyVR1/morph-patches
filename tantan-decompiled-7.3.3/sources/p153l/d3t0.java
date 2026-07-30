package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d3t0 extends b2t0 implements h4t0 {
    /* JADX INFO: renamed from: P2 */
    public static h4t0 m113902P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof h4t0 ? (h4t0) iInterfaceQueryLocalInterface : new v6t0(iBinder);
    }
}
