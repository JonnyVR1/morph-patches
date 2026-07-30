package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzapw {
    private static volatile zzbcl zza;
    private static volatile zzbcl zzb;
    private static volatile zzbcl zzc;
    private static volatile zzbcl zzd;
    private static volatile zzbcl zze;

    private zzapw() {
    }

    public static zzapv zza(zzayk zzaykVar) {
        return (zzapv) zzbup.zzb(new zzapt(), zzaykVar, zzayj.zza);
    }

    public static zzbcl zzb() {
        zzbcl zzbclVarZzf;
        zzbcl zzbclVar = zze;
        if (zzbclVar != null) {
            return zzbclVar;
        }
        synchronized (zzapw.class) {
            try {
                zzbclVarZzf = zze;
                if (zzbclVarZzf == null) {
                    zzbch zzbchVarZza = zzbcl.zza(null, null);
                    zzbchVarZza.zze(zzbcj.UNARY);
                    zzbchVarZza.zza(zzbcl.zze("google.maps.places.v1.Places", "AutocompletePlaces"));
                    zzbchVarZza.zzd(true);
                    zzbchVarZza.zzb(zzbuo.zza(zzaly.zzd()));
                    zzbchVarZza.zzc(zzbuo.zza(zzamn.zzc()));
                    zzbclVarZzf = zzbchVarZza.zzf();
                    zze = zzbclVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbclVarZzf;
    }

    public static zzbcl zzc() {
        zzbcl zzbclVarZzf;
        zzbcl zzbclVar = zzc;
        if (zzbclVar != null) {
            return zzbclVar;
        }
        synchronized (zzapw.class) {
            try {
                zzbclVarZzf = zzc;
                if (zzbclVarZzf == null) {
                    zzbch zzbchVarZza = zzbcl.zza(null, null);
                    zzbchVarZza.zze(zzbcj.UNARY);
                    zzbchVarZza.zza(zzbcl.zze("google.maps.places.v1.Places", "GetPhotoMedia"));
                    zzbchVarZza.zzd(true);
                    zzbchVarZza.zzb(zzbuo.zza(zzanx.zzd()));
                    zzbchVarZza.zzc(zzbuo.zza(zzaoj.zzc()));
                    zzbclVarZzf = zzbchVarZza.zzf();
                    zzc = zzbclVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbclVarZzf;
    }

    public static zzbcl zzd() {
        zzbcl zzbclVarZzf;
        zzbcl zzbclVar = zzd;
        if (zzbclVar != null) {
            return zzbclVar;
        }
        synchronized (zzapw.class) {
            try {
                zzbclVarZzf = zzd;
                if (zzbclVarZzf == null) {
                    zzbch zzbchVarZza = zzbcl.zza(null, null);
                    zzbchVarZza.zze(zzbcj.UNARY);
                    zzbchVarZza.zza(zzbcl.zze("google.maps.places.v1.Places", "GetPlace"));
                    zzbchVarZza.zzd(true);
                    zzbchVarZza.zzb(zzbuo.zza(zzaoa.zzd()));
                    zzbchVarZza.zzc(zzbuo.zza(zzaps.zzl()));
                    zzbclVarZzf = zzbchVarZza.zzf();
                    zzd = zzbclVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbclVarZzf;
    }

    public static zzbcl zze() {
        zzbcl zzbclVarZzf;
        zzbcl zzbclVar = zza;
        if (zzbclVar != null) {
            return zzbclVar;
        }
        synchronized (zzapw.class) {
            try {
                zzbclVarZzf = zza;
                if (zzbclVarZzf == null) {
                    zzbch zzbchVarZza = zzbcl.zza(null, null);
                    zzbchVarZza.zze(zzbcj.UNARY);
                    zzbchVarZza.zza(zzbcl.zze("google.maps.places.v1.Places", "SearchNearby"));
                    zzbchVarZza.zzd(true);
                    zzbchVarZza.zzb(zzbuo.zza(zzaqz.zzd()));
                    zzbchVarZza.zzc(zzbuo.zza(zzarc.zzc()));
                    zzbclVarZzf = zzbchVarZza.zzf();
                    zza = zzbclVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbclVarZzf;
    }

    public static zzbcl zzf() {
        zzbcl zzbclVarZzf;
        zzbcl zzbclVar = zzb;
        if (zzbclVar != null) {
            return zzbclVar;
        }
        synchronized (zzapw.class) {
            try {
                zzbclVarZzf = zzb;
                if (zzbclVarZzf == null) {
                    zzbch zzbchVarZza = zzbcl.zza(null, null);
                    zzbchVarZza.zze(zzbcj.UNARY);
                    zzbchVarZza.zza(zzbcl.zze("google.maps.places.v1.Places", "SearchText"));
                    zzbchVarZza.zzd(true);
                    zzbchVarZza.zzb(zzbuo.zza(zzaro.zzd()));
                    zzbchVarZza.zzc(zzbuo.zza(zzarr.zzc()));
                    zzbclVarZzf = zzbchVarZza.zzf();
                    zzb = zzbclVarZzf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbclVarZzf;
    }
}
