package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j8s0 extends kxr0 implements s8s0 {
    /* JADX INFO: renamed from: o8 */
    public static s8s0 m140342o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof s8s0 ? (s8s0) iInterfaceQueryLocalInterface : new i8s0(iBinder);
    }
}
