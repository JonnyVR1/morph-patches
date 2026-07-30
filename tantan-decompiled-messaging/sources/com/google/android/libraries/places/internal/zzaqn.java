package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaqn extends zzatu implements zzavg {
    private static final zzaqn zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzaxp zzg;
    private int zzh;
    private zzaqk zzi;

    static {
        zzaqn zzaqnVar = new zzaqn();
        zzb = zzaqnVar;
        zzatu.zzaE(zzaqn.class, zzaqnVar);
    }

    private zzaqn() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaqn();
        }
        zzaql zzaqlVar = null;
        if (i2 == 4) {
            return new zzaqm(zzaqlVar);
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
        synchronized (zzaqn.class) {
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
