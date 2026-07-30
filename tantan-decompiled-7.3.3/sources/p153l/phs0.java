package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class phs0 extends q6s0 implements yhs0 {
    /* JADX INFO: renamed from: o8 */
    public static yhs0 m172332o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof yhs0 ? (yhs0) iInterfaceQueryLocalInterface : new ohs0(iBinder);
    }
}
