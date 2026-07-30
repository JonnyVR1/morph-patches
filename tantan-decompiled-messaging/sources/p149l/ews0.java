package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ews0 extends kxr0 implements uxs0 {
    /* JADX INFO: renamed from: o8 */
    public static uxs0 m118515o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof uxs0 ? (uxs0) iInterfaceQueryLocalInterface : new dws0(iBinder);
    }
}
