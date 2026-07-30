package p153l;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gat0 extends q6s0 implements hat0 {
    /* JADX INFO: renamed from: o8 */
    public static hat0 m129745o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof hat0 ? (hat0) iInterfaceQueryLocalInterface : new fat0(iBinder);
    }
}
