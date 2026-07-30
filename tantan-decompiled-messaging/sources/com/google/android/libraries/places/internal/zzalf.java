package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzalf extends zzatu implements zzavg {
    private static final zzalf zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh = 1;
    private int zzi;
    private int zzj;

    static {
        zzalf zzalfVar = new zzalf();
        zzb = zzalfVar;
        zzatu.zzaE(zzalf.class, zzalfVar);
    }

    private zzalf() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzf", "zzg", zzald.zza, "zzh", zzale.zza, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzalf();
        }
        zzalb zzalbVar = null;
        if (i2 == 4) {
            return new zzalc(zzalbVar);
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
        synchronized (zzalf.class) {
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
