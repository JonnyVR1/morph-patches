package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.e9s0;
import p153l.x5t0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzt extends e9s0 implements zzu {
    public zzt() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static zzu zzb(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return iInterfaceQueryLocalInterface instanceof zzu ? (zzu) iInterfaceQueryLocalInterface : new zzs(iBinder);
    }

    @Override // p153l.e9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Location location = (Location) x5t0.m209430a(parcel, Location.CREATOR);
            x5t0.m209431b(parcel);
            zzd(location);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        return true;
    }
}
