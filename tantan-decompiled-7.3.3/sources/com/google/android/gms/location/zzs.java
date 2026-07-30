package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import p153l.n9r0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzs extends n9r0 implements zzu {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // com.google.android.gms.location.zzu
    public final void zzd(Location location) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.location.zzu
    public final void zze() throws RemoteException {
        throw null;
    }
}
