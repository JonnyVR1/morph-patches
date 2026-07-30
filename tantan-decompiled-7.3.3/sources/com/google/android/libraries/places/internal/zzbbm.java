package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzbbm {
    public static final zzayc zza = zzayc.zza("internal:health-checking-config");
    public static final zzbay zzb = zzbay.zza("internal:health-check-consumer-listener");
    public static final zzayc zzc = zzayc.zza("internal:has-health-check-producer-listener");
    public static final zzayc zzd = zzayc.zza("io.grpc.IS_PETIOLE_POLICY");

    @Deprecated
    public static final zzbbk zze = new zzbaw();
    private int zzf;

    public zzbdo zza(zzbbi zzbbiVar) {
        if (!zzbbiVar.zze().isEmpty()) {
            int i = this.zzf;
            this.zzf = i + 1;
            if (i == 0) {
                zzc(zzbbiVar);
            }
            this.zzf = 0;
            return zzbdo.zza;
        }
        zzf();
        zzbdo zzbdoVarZzg = zzbdo.zzp.zzg("NameResolver returned no usable address. addrs=" + String.valueOf(zzbbiVar.zze()) + ", attrs=" + zzbbiVar.zza().toString());
        zzb(zzbdoVarZzg);
        return zzbdoVarZzg;
    }

    public abstract void zzb(zzbdo zzbdoVar);

    public void zzc(zzbbi zzbbiVar) {
        int i = this.zzf;
        this.zzf = i + 1;
        if (i == 0) {
            zza(zzbbiVar);
        }
        this.zzf = 0;
    }

    public void zzd() {
    }

    public abstract void zze();

    public boolean zzf() {
        return false;
    }
}
