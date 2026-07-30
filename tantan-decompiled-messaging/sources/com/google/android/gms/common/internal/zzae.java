package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p149l.f0r0;
import p149l.ows0;
import p149l.uyl;

/* JADX INFO: loaded from: classes6.dex */
public final class zzae extends f0r0 implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166431c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(6, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) ows0.m166429a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo zzoVar) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166431c(parcelZza, zzoVar);
        Parcel parcelZzB = zzB(8, parcelZza);
        com.google.android.gms.common.zzq zzqVar = (com.google.android.gms.common.zzq) ows0.m166429a(parcelZzB, com.google.android.gms.common.zzq.CREATOR);
        parcelZzB.recycle();
        return zzqVar;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzB = zzB(9, zza());
        boolean zM166434f = ows0.m166434f(parcelZzB);
        parcelZzB.recycle();
        return zM166434f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzh(com.google.android.gms.common.zzs zzsVar, uyl uylVar) throws RemoteException {
        Parcel parcelZza = zza();
        ows0.m166431c(parcelZza, zzsVar);
        ows0.m166433e(parcelZza, uylVar);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean zM166434f = ows0.m166434f(parcelZzB);
        parcelZzB.recycle();
        return zM166434f;
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzi() throws RemoteException {
        Parcel parcelZzB = zzB(7, zza());
        boolean zM166434f = ows0.m166434f(parcelZzB);
        parcelZzB.recycle();
        return zM166434f;
    }
}
