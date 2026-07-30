package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzg;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zox0 extends yzr0 implements bux0 {
    public zox0() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // p149l.yzr0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg zzgVar = (zzg) rws0.m181446a(parcel, zzg.CREATOR);
            rws0.m181447b(parcel);
            mo104005Z7(zzgVar);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
