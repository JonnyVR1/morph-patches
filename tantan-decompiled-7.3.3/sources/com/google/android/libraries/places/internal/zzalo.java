package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzalo extends zzatu implements zzavg {
    private static final zzalo zzb;
    private static volatile zzavn zze;
    private int zzf;
    private boolean zzg;

    static {
        zzalo zzaloVar = new zzalo();
        zzb = zzaloVar;
        zzatu.zzaE(zzalo.class, zzaloVar);
    }

    private zzalo() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzalo();
        }
        zzalm zzalmVar = null;
        if (i2 == 4) {
            return new zzaln(zzalmVar);
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
        synchronized (zzalo.class) {
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
