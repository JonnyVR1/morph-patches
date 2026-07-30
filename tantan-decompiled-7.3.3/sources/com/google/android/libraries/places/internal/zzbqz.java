package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbqz {
    private static final zzbqw zza = new zzbqw(zzbqt.zza);
    private final zzbqt zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private zzbqx zzf;
    private long zzg;
    private final zzbkj zzh;
    private volatile long zzi;

    public zzbqz() {
        this.zzh = zzbkk.zza();
        this.zzb = zzbqt.zza;
    }

    public static zzbqw zza() {
        return zza;
    }

    public final void zzb() {
        this.zzc++;
        this.zzb.zza();
    }

    public final void zzc() {
        this.zzh.zza(1L);
        this.zzi = this.zzb.zza();
    }

    public final void zzd(int i) {
        if (i == 0) {
            return;
        }
        this.zzg += (long) i;
        this.zzb.zza();
    }

    public final void zze(boolean z) {
        if (z) {
            this.zzd++;
        } else {
            this.zze++;
        }
    }

    public final void zzf(zzbqx zzbqxVar) {
        this.zzf = zzbqxVar;
    }

    public /* synthetic */ zzbqz(zzbqt zzbqtVar, zzbqy zzbqyVar) {
        this.zzh = zzbkk.zza();
        this.zzb = zzbqtVar;
    }
}
