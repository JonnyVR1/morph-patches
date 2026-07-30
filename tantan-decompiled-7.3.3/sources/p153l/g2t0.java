package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g2t0 extends q6s0 implements i3t0 {
    /* JADX INFO: renamed from: o8 */
    public static i3t0 m128660o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof i3t0 ? (i3t0) iInterfaceQueryLocalInterface : new e1t0(iBinder);
    }
}
