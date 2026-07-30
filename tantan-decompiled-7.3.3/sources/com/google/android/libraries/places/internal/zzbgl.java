package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbgl implements Runnable {
    final /* synthetic */ StringBuilder zza;
    final /* synthetic */ zzbgz zzb;

    public zzbgl(zzbgz zzbgzVar, StringBuilder sb) {
        this.zza = sb;
        this.zzb = zzbgzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzl(zzbdo.zze.zzg(this.zza.toString()), true);
    }
}
