package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wss0 extends q6s0 implements xss0 {
    /* JADX INFO: renamed from: o8 */
    public static xss0 m207790o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof xss0 ? (xss0) iInterfaceQueryLocalInterface : new vss0(iBinder);
    }
}
