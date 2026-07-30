package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.c9s0;
import p153l.u5t0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzac extends c9s0 implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p153l.c9s0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) u5t0.m194621a(parcel, Bundle.CREATOR);
            u5t0.m194622b(parcel);
            onPostInitComplete(i3, strongBinder, bundle);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            Bundle bundle2 = (Bundle) u5t0.m194621a(parcel, Bundle.CREATOR);
            u5t0.m194622b(parcel);
            zzb(i4, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) u5t0.m194621a(parcel, zzk.CREATOR);
            u5t0.m194622b(parcel);
            zzc(i5, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
