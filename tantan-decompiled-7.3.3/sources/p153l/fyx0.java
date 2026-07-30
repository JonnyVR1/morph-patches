package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fyx0 extends e9s0 implements h3y0 {
    public fyx0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // p153l.e9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg zzgVar = (zzg) x5t0.m209430a(parcel, zzg.CREATOR);
            x5t0.m209431b(parcel);
            mo133524Z7(zzgVar);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
