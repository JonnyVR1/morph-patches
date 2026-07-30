package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m1t0 extends q6s0 implements n1t0 {
    /* JADX INFO: renamed from: o8 */
    public static n1t0 m156719o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof n1t0 ? (n1t0) iInterfaceQueryLocalInterface : new l1t0(iBinder);
    }
}
