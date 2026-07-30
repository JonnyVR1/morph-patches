package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaei extends zzatu implements zzavg {
    private static final zzaei zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;

    static {
        zzaei zzaeiVar = new zzaei();
        zzb = zzaeiVar;
        zzatu.zzaE(zzaei.class, zzaeiVar);
    }

    private zzaei() {
    }

    public static zzaeh zza() {
        return (zzaeh) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzaei zzaeiVar, int i) {
        zzaeiVar.zzf |= 1;
        zzaeiVar.zzg = i;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaei();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzaeh(zzaduVar);
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
        synchronized (zzaei.class) {
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
