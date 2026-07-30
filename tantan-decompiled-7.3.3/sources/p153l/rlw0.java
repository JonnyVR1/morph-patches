package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rlw0 extends q6s0 implements slw0 {
    /* JADX INFO: renamed from: o8 */
    public static slw0 m182034o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof slw0 ? (slw0) iInterfaceQueryLocalInterface : new qlw0(iBinder);
    }
}
