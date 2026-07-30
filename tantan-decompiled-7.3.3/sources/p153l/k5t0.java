package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k5t0 extends q6s0 implements a7t0 {
    /* JADX INFO: renamed from: o8 */
    public static a7t0 m148505o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof a7t0 ? (a7t0) iInterfaceQueryLocalInterface : new j5t0(iBinder);
    }
}
