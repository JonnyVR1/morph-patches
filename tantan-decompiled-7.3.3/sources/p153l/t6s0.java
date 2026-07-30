package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t6s0 extends q6s0 implements u6s0 {
    /* JADX INFO: renamed from: o8 */
    public static u6s0 m189544o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof u6s0 ? (u6s0) iInterfaceQueryLocalInterface : new s6s0(iBinder);
    }
}
