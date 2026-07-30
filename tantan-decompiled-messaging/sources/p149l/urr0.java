package p149l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class urr0 extends aor0 implements etr0 {
    /* JADX INFO: renamed from: P2 */
    public static etr0 m195119P2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return iInterfaceQueryLocalInterface instanceof etr0 ? (etr0) iInterfaceQueryLocalInterface : new uqr0(iBinder);
    }
}
