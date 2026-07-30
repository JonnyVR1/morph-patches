package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbod implements Runnable {
    final /* synthetic */ zzboe zza;

    public /* synthetic */ zzbod(zzboe zzboeVar, zzboc zzbocVar) {
        this.zza = zzboeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzboe zzboeVar = this.zza;
        zzbdw zzbdwVar = (zzbdw) zzboeVar.zzb;
        zzbdwVar.zzc(new zzbob(zzboeVar, null));
        zzbdwVar.zzb();
    }
}
