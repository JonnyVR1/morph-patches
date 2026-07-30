package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.l9r0;
import p153l.p1m;

/* JADX INFO: loaded from: classes6.dex */
public final class zzy extends l9r0 implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() throws RemoteException {
        Parcel parcelZzB = zzB(2, zza());
        int i = parcelZzB.readInt();
        parcelZzB.recycle();
        return i;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final p1m zzd() throws RemoteException {
        Parcel parcelZzB = zzB(1, zza());
        p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return p1mVarM170217O;
    }
}
