package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t1t0 extends q6s0 implements u1t0 {
    /* JADX INFO: renamed from: o8 */
    public static u1t0 m188933o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof u1t0 ? (u1t0) iInterfaceQueryLocalInterface : new s1t0(iBinder);
    }
}
