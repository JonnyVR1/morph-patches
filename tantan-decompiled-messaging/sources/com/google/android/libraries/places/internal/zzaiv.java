package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaiv extends zzatu implements zzavg {
    private static final zzaiv zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private zzauc zzh = zzatu.zzax();
    private zzauc zzi = zzatu.zzax();
    private zzauc zzj = zzatu.zzax();

    static {
        zzaiv zzaivVar = new zzaiv();
        zzb = zzaivVar;
        zzatu.zzaE(zzaiv.class, zzaivVar);
    }

    private zzaiv() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001င\u0000\u0002\u001a\u0003\u001b\u0004\u001b", new Object[]{"zzf", "zzg", "zzh", "zzi", zzaix.class, "zzj", zzadz.class});
        }
        if (i2 == 3) {
            return new zzaiv();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzaiu(zzaduVar);
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
        synchronized (zzaiv.class) {
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
