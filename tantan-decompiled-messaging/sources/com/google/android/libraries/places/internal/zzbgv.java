package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbgv implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzbgy zzb;

    public zzbgv(zzbgy zzbgyVar, Object obj) {
        this.zza = obj;
        this.zzb = zzbgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzc(this.zza);
    }
}
