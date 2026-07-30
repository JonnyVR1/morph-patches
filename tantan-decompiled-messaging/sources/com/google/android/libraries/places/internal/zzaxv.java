package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaxv extends zzatu implements zzavg {
    private static final zzaxv zzb;
    private static volatile zzavn zze;
    private String zzf = "";
    private long zzg;
    private int zzh;

    static {
        zzaxv zzaxvVar = new zzaxv();
        zzb = zzaxvVar;
        zzatu.zzaE(zzaxv.class, zzaxvVar);
    }

    private zzaxv() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaxv();
        }
        zzaxt zzaxtVar = null;
        if (i2 == 4) {
            return new zzaxu(zzaxtVar);
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
        synchronized (zzaxv.class) {
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
