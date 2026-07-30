package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbhl implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbhy zzb;

    public zzbhl(zzbhy zzbhyVar, int i) {
        this.zza = i;
        this.zzb = zzbhyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc.zzm(this.zza);
    }
}
