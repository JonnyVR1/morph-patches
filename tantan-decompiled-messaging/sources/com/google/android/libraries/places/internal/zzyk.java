package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzyk extends zzatu implements zzavg {
    private static final zzyk zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzyh zzg;
    private zzxt zzi;
    private zzxt zzj;
    private zzuf zzk;
    private int zzl;
    private zzxv zzm;
    private zzxr zzn;
    private zzxo zzo;
    private zzxx zzp;
    private zzxm zzr;
    private zzxz zzs;
    private zzxb zzt;
    private zzzb zzu;
    private zzzd zzv;
    private zzys zzw;
    private zzauc zzh = zzatu.zzax();
    private zzauc zzq = zzatu.zzax();

    static {
        zzyk zzykVar = new zzyk();
        zzb = zzykVar;
        zzatu.zzaE(zzyk.class, zzykVar);
    }

    private zzyk() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e", new Object[]{"zzf", "zzg", "zzh", zzym.class, "zzi", "zzj", "zzk", "zzl", zzyj.zza, "zzm", "zzn", "zzo", "zzp", "zzq", zzyd.class, "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new zzyk();
        }
        zzwv zzwvVar = null;
        if (i2 == 4) {
            return new zzyi(zzwvVar);
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
        synchronized (zzyk.class) {
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
