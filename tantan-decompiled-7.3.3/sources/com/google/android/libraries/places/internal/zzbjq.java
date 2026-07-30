package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbjq implements Runnable {
    final /* synthetic */ zzbkd zza;

    public zzbjq(zzbkd zzbkdVar) {
        this.zza = zzbkdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzi.zza(2, "Terminated");
        zzbkd zzbkdVar = this.zza;
        zzblv zzblvVar = (zzblv) zzbkdVar.zzc;
        zzblvVar.zzb.zzj.zzJ.remove(zzbkdVar);
        zzblvVar.zzb.zzj.zzX.zzh(zzbkdVar);
        zzbma.zzQ(zzblvVar.zzb.zzj);
    }
}
