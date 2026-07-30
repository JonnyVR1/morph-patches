package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzadd extends zzatu implements zzavg {
    private static final zzadd zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private zzatz zzl = zzatu.zzau();
    private int zzm;
    private zzacj zzn;
    private zzacz zzo;
    private zzabk zzp;
    private zzact zzq;
    private zzacp zzr;
    private zzacv zzs;
    private zzabn zzt;
    private zzabs zzu;
    private zzadk zzv;
    private zzadr zzw;
    private zzacb zzx;
    private zzabx zzy;

    static {
        zzadd zzaddVar = new zzadd();
        zzb = zzaddVar;
        zzatu.zzaE(zzadd.class, zzaddVar);
    }

    private zzadd() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003င\u0003\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဇ\u0004\tဉ\n\nဉ\u000b\u000b\u0016\fင\u0005\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011င\u0000\u0012ဉ\u0010\u0013ဉ\u0011", new Object[]{"zzf", "zzh", zzadb.zza, "zzi", zzadc.zza, "zzj", "zzn", "zzo", "zzp", "zzq", "zzk", "zzr", "zzs", "zzl", "zzm", "zzt", "zzu", "zzv", "zzw", "zzg", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new zzadd();
        }
        zzabf zzabfVar = null;
        if (i2 == 4) {
            return new zzada(zzabfVar);
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
        synchronized (zzadd.class) {
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
