package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzafv extends zzatu implements zzavg {
    private static final zzafv zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh = 1;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    static {
        zzafv zzafvVar = new zzafv();
        zzb = zzafvVar;
        zzatu.zzaE(zzafv.class, zzafvVar);
    }

    private zzafv() {
    }

    public static zzafs zza() {
        return (zzafs) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzafv zzafvVar, boolean z) {
        zzafvVar.zzf |= 4;
        zzafvVar.zzi = z;
    }

    public static /* synthetic */ void zze(zzafv zzafvVar, boolean z) {
        zzafvVar.zzf |= 8;
        zzafvVar.zzj = z;
    }

    public static /* synthetic */ void zzf(zzafv zzafvVar, boolean z) {
        zzafvVar.zzf |= 16;
        zzafvVar.zzk = z;
    }

    public static /* synthetic */ void zzg(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 32;
        zzafvVar.zzl = i;
    }

    public static /* synthetic */ void zzh(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 64;
        zzafvVar.zzm = i;
    }

    public static /* synthetic */ void zzi(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 128;
        zzafvVar.zzn = i;
    }

    public static /* synthetic */ void zzj(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 256;
        zzafvVar.zzo = i;
    }

    public static /* synthetic */ void zzk(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 512;
        zzafvVar.zzp = i;
    }

    public static /* synthetic */ void zzl(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 1024;
        zzafvVar.zzq = i;
    }

    public static /* synthetic */ void zzm(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 2048;
        zzafvVar.zzr = i;
    }

    public static /* synthetic */ void zzn(zzafv zzafvVar, boolean z) {
        zzafvVar.zzf |= 4096;
        zzafvVar.zzs = z;
    }

    public static /* synthetic */ void zzo(zzafv zzafvVar, int i) {
        zzafvVar.zzf |= 8192;
        zzafvVar.zzt = i;
    }

    public static /* synthetic */ void zzp(zzafv zzafvVar, int i) {
        zzafvVar.zzg = i - 1;
        zzafvVar.zzf |= 1;
    }

    public static /* synthetic */ void zzq(zzafv zzafvVar, int i) {
        zzafvVar.zzh = i;
        zzafvVar.zzf |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e\u0011᠌\u000f", new Object[]{"zzf", "zzg", zzafu.zza, "zzh", zzafr.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzq", "zzr", "zzs", "zzt", "zzo", "zzu", "zzv", zzaft.zza});
        }
        if (i2 == 3) {
            return new zzafv();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzafs(zzaduVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        zzavn zzavnVar = zze;
        if (zzavnVar != null) {
            return zzavnVar;
        }
        synchronized (zzafv.class) {
            try {
                zzatpVar = zze;
                if (zzatpVar == null) {
                    zzatpVar = new zzatp(zzb);
                    zze = zzatpVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzatpVar;
    }
}
