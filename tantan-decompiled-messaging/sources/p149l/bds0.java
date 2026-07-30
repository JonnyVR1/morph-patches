package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bds0 extends kxr0 implements cds0 {
    /* JADX INFO: renamed from: o8 */
    public static cds0 m101231o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof cds0 ? (cds0) iInterfaceQueryLocalInterface : new ads0(iBinder);
    }
}
