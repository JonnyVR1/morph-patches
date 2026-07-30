package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ycs0 extends kxr0 implements zcs0 {
    /* JADX INFO: renamed from: o8 */
    public static zcs0 m214205o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zcs0 ? (zcs0) iInterfaceQueryLocalInterface : new xcs0(iBinder);
    }
}
