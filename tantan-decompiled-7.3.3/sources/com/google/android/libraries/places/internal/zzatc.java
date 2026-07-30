package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzatc extends zzatu implements zzavg {
    private static final zzatc zzb;
    private static volatile zzavn zze;
    private long zzf;
    private int zzg;

    static {
        zzatc zzatcVar = new zzatc();
        zzb = zzatcVar;
        zzatu.zzaE(zzatc.class, zzatcVar);
    }

    private zzatc() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzavr(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzatc();
        }
        zzata zzataVar = null;
        if (i2 == 4) {
            return new zzatb(zzataVar);
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
        synchronized (zzatc.class) {
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
