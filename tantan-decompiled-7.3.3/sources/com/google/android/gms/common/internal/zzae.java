package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p153l.l9r0;
import p153l.p1m;
import p153l.u5t0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzae extends l9r0 implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194623c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(6, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) u5t0.m194621a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194623c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) u5t0.m194621a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzB = zzB(9, zza());
        boolean zM194626f = u5t0.m194626f(parcelZzB);
        parcelZzB.recycle();
        return zM194626f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, p1m p1mVar) throws RemoteException {
        Parcel parcelZza = zza();
        u5t0.m194623c(parcelZza, zzsVar);
        u5t0.m194625e(parcelZza, p1mVar);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean zM194626f = u5t0.m194626f(parcelZzB);
        parcelZzB.recycle();
        return zM194626f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzi() throws RemoteException {
        Parcel parcelZzB = zzB(7, zza());
        boolean zM194626f = u5t0.m194626f(parcelZzB);
        parcelZzB.recycle();
        return zM194626f;
    }
}
