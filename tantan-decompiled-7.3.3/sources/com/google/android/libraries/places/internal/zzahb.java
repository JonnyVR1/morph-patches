package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahb extends zzatu implements zzavg {
    private static final zzahb zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzm;
    private zzauc zzh = zzatu.zzax();
    private String zzl = "";

    static {
        zzahb zzahbVar = new zzahb();
        zzb = zzahbVar;
        zzatu.zzaE(zzahb.class, zzahbVar);
    }

    private zzahb() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003င\u0001\u0004᠌\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"zzf", "zzg", zzaes.zza, "zzh", "zzi", "zzj", zzahe.zza, "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzahb();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzaha(zzaduVar);
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
        synchronized (zzahb.class) {
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
