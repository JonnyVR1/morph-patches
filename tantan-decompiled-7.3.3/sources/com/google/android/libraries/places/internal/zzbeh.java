package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbeh implements Runnable {
    final /* synthetic */ zzbvq zza;
    final /* synthetic */ zzbei zzb;

    public zzbeh(zzbei zzbeiVar, zzbvq zzbvqVar, int i) {
        this.zza = zzbvqVar;
        this.zzb = zzbeiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = zzbvr.zza;
            this.zzb.zzr.zzc(2);
        } catch (Throwable th) {
            this.zzb.zzF(th);
        }
    }
}
