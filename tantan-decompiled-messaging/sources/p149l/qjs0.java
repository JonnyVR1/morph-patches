package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class qjs0 extends kxr0 implements rjs0 {
    /* JADX INFO: renamed from: o8 */
    public static rjs0 m175037o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof rjs0 ? (rjs0) iInterfaceQueryLocalInterface : new pjs0(iBinder);
    }
}
