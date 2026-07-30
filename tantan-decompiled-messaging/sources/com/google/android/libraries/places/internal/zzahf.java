package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahf extends zzatu implements zzavg {
    private static final zzahf zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzaer zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    static {
        zzahf zzahfVar = new zzahf();
        zzb = zzahfVar;
        zzatu.zzaE(zzahf.class, zzahfVar);
    }

    private zzahf() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006᠌\u0005\u0007င\u0006\b᠌\u0007", new Object[]{"zzf", "zzg", "zzh", zzaes.zza, "zzi", zzahe.zza, "zzj", "zzk", "zzl", zzahd.zza, "zzm", "zzn", zzadv.zza});
        }
        if (i2 == 3) {
            return new zzahf();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzahc(zzaduVar);
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
        synchronized (zzahf.class) {
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
