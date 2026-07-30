package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbgu implements Runnable {
    final /* synthetic */ zzbcf zza;
    final /* synthetic */ zzbgy zzb;

    public zzbgu(zzbgy zzbgyVar, zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
        this.zzb = zzbgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzb(this.zza);
    }
}
