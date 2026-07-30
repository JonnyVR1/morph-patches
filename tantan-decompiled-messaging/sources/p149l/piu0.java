package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class piu0 extends kxr0 implements uju0 {
    public piu0() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
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
            boolean zM152090g = lxr0.m152090g(parcel);
            lxr0.m152086c(parcel);
            mo144125S(zM152090g);
        }
        parcel2.writeNoException();
        return true;
    }
}
