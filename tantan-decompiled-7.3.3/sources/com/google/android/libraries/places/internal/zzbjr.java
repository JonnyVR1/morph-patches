package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbjr implements Runnable {
    final /* synthetic */ zzbgf zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbkd zzc;

    public zzbjr(zzbkd zzbkdVar, zzbgf zzbgfVar, boolean z) {
        this.zza = zzbgfVar;
        this.zzb = z;
        this.zzc = zzbkdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzs.zzc(this.zza, this.zzb);
    }
}
