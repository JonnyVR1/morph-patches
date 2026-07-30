package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaga extends zzatu implements zzavg {
    private static final zzaga zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;

    static {
        zzaga zzagaVar = new zzaga();
        zzb = zzagaVar;
        zzatu.zzaE(zzaga.class, zzagaVar);
    }

    private zzaga() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzf", "zzg", zzadw.zza});
        }
        if (i2 == 3) {
            return new zzaga();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzafz(zzaduVar);
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
        synchronized (zzaga.class) {
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
