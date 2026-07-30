package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zztu extends zzatu implements zzavg {
    private static final zztu zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzauc zzg = zzatu.zzax();
    private int zzh;

    static {
        zztu zztuVar = new zztu();
        zzb = zztuVar;
        zzatu.zzaE(zztu.class, zztuVar);
    }

    private zztu() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzf", "zzg", zztp.class, "zzh"});
        }
        if (i2 == 3) {
            return new zztu();
        }
        zztn zztnVar = null;
        if (i2 == 4) {
            return new zztt(zztnVar);
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
        synchronized (zztu.class) {
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
