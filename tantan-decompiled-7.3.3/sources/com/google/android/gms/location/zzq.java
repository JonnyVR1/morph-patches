package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.e9s0;
import p153l.x5t0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzq extends e9s0 implements zzr {
    public zzq() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzr zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder);
    }

    @Override // p153l.e9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) x5t0.m209430a(parcel, LocationResult.CREATOR);
            x5t0.m209431b(parcel);
            zze(locationResult);
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) x5t0.m209430a(parcel, LocationAvailability.CREATOR);
            x5t0.m209431b(parcel);
            zzd(locationAvailability);
        } else {
            if (i != 3) {
                return false;
            }
            zzf();
        }
        return true;
    }
}
