package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vru0 extends q6s0 implements atu0 {
    public vru0() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzi();
        } else if (i == 2) {
            zzh();
        } else if (i == 3) {
            zzg();
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            boolean zM180045g = r6s0.m180045g(parcel);
            r6s0.m180041c(parcel);
            mo100274S(zM180045g);
        }
        parcel2.writeNoException();
        return true;
    }
}
