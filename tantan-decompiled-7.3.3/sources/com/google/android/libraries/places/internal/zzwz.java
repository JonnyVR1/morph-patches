package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzwz extends zzatu implements zzavg {
    private static final zzwz zzb;
    private static volatile zzavn zze;
    private zzauc zzf = zzatu.zzax();

    static {
        zzwz zzwzVar = new zzwz();
        zzb = zzwzVar;
        zzatu.zzaE(zzwz.class, zzwzVar);
    }

    private zzwz() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzf", zzyw.class});
        }
        if (i2 == 3) {
            return new zzwz();
        }
        zzwv zzwvVar = null;
        if (i2 == 4) {
            return new zzwy(zzwvVar);
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
        synchronized (zzwz.class) {
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
