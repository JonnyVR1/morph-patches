package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.f0r0;
import p149l.uyl;

/* JADX INFO: loaded from: classes6.dex */
public final class zzy extends f0r0 implements zzaa {
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
    public final uyl zzd() throws RemoteException {
        Parcel parcelZzB = zzB(1, zza());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return uylVarM196295O;
    }
}
