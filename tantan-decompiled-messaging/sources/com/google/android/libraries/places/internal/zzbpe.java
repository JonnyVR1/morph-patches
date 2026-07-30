package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbpe implements Runnable {
    final /* synthetic */ zzbcf zza;
    final /* synthetic */ zzbpl zzb;

    public zzbpe(zzbpl zzbplVar, zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
        this.zzb = zzbplVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzy.zze(this.zza);
    }
}
