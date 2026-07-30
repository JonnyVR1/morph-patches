package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class s6t0 extends kxr0 implements s7t0 {
    public s6t0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
            lxr0.m152086c(parcel);
            mo139872i0(zzeVar);
        } else if (i == 2) {
            zzf();
        } else if (i == 3) {
            zzc();
        } else if (i == 4) {
            zze();
        } else {
            if (i != 5) {
                return false;
            }
            zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
