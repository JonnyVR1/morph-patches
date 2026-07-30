package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lcw0 extends kxr0 implements mcw0 {
    /* JADX INFO: renamed from: o8 */
    public static mcw0 m149370o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof mcw0 ? (mcw0) iInterfaceQueryLocalInterface : new kcw0(iBinder);
    }
}
