package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a1s0 extends gxr0 implements k2s0 {
    /* JADX INFO: renamed from: P2 */
    public static k2s0 m95552P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterfaceQueryLocalInterface instanceof k2s0 ? (k2s0) iInterfaceQueryLocalInterface : new a0s0(iBinder);
    }
}
