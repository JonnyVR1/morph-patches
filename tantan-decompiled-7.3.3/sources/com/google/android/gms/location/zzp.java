package com.google.android.gms.location;

import android.os.IBinder;
import android.os.RemoteException;
import p153l.n9r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzp extends n9r0 implements zzr {
    public zzp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzd(LocationAvailability locationAvailability) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzr
    public final void zze(LocationResult locationResult) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzr
    public final void zzf() throws RemoteException {
        throw null;
    }
}
