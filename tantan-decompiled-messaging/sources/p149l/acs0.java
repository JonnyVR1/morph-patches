package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class acs0 extends kxr0 implements bcs0 {
    /* JADX INFO: renamed from: o8 */
    public static bcs0 m95835o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof bcs0 ? (bcs0) iInterfaceQueryLocalInterface : new zbs0(iBinder);
    }
}
