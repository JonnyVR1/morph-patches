package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahr extends zzatu implements zzavg {
    private static final zzahr zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private int zzi;

    static {
        zzahr zzahrVar = new zzahr();
        zzb = zzahrVar;
        zzatu.zzaE(zzahr.class, zzahrVar);
    }

    private zzahr() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\b᠌\u0002", new Object[]{"zzf", "zzg", zzahq.zza, "zzh", "zzi", zzadv.zza});
        }
        if (i2 == 3) {
            return new zzahr();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzahp(zzaduVar);
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
        synchronized (zzahr.class) {
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
