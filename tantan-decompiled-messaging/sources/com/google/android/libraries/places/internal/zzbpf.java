package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbpf implements Runnable {
    final /* synthetic */ zzbpg zza;

    public zzbpf(zzbpg zzbpgVar) {
        this.zza = zzbpgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbpg zzbpgVar = this.zza;
        zzbpgVar.zzc.zzb.zzai(zzbpgVar.zzb);
    }
}
