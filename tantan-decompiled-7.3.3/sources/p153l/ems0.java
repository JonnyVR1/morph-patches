package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ems0 extends q6s0 implements fms0 {
    /* JADX INFO: renamed from: o8 */
    public static fms0 m121382o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof fms0 ? (fms0) iInterfaceQueryLocalInterface : new dms0(iBinder);
    }
}
