package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.rws0;
import p149l.yzr0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzq extends yzr0 implements zzr {
    public zzq() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzr zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzp(iBinder);
    }

    @Override // p149l.yzr0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) rws0.m181446a(parcel, LocationResult.CREATOR);
            rws0.m181447b(parcel);
            zze(locationResult);
        } else if (i == 2) {
            LocationAvailability locationAvailability = (LocationAvailability) rws0.m181446a(parcel, LocationAvailability.CREATOR);
            rws0.m181447b(parcel);
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
