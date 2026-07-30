package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.ows0;
import p149l.wzr0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zzac extends wzr0 implements IGmsCallbacks {
    public zzac() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p149l.wzr0
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ows0.m166429a(parcel, Bundle.CREATOR);
            ows0.m166430b(parcel);
            onPostInitComplete(i3, strongBinder, bundle);
        } else if (i == 2) {
            int i4 = parcel.readInt();
            Bundle bundle2 = (Bundle) ows0.m166429a(parcel, Bundle.CREATOR);
            ows0.m166430b(parcel);
            zzb(i4, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) ows0.m166429a(parcel, zzk.CREATOR);
            ows0.m166430b(parcel);
            zzc(i5, strongBinder2, zzkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
