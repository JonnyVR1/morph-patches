package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzail extends zzatu implements zzavg {
    private static final zzail zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        zzail zzailVar = new zzail();
        zzb = zzailVar;
        zzatu.zzaE(zzail.class, zzailVar);
    }

    private zzail() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzf", "zzg", zzadw.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzail();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzaik(zzaduVar);
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
        synchronized (zzail.class) {
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
