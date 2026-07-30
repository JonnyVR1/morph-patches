package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
final class zzbfg {
    static final zzbff zza = new zzbfe();
    private final zzbqt zzb;
    private final zzbkj zzc = zzbkk.zza();
    private final zzbkj zzd = zzbkk.zza();
    private final zzbkj zze = zzbkk.zza();
    private volatile long zzf;

    public zzbfg(zzbqt zzbqtVar) {
        this.zzb = zzbqtVar;
    }

    public final void zza(boolean z) {
        if (z) {
            this.zzd.zza(1L);
        } else {
            this.zze.zza(1L);
        }
    }

    public final void zzb() {
        this.zzc.zza(1L);
        this.zzf = this.zzb.zza();
    }
}
