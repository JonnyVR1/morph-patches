package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzacb extends zzatu implements zzavg {
    private static final zzacb zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzacb zzacbVar = new zzacb();
        zzb = zzacbVar;
        zzatu.zzaE(zzacb.class, zzacbVar);
    }

    private zzacb() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"zzf", "zzg", zzabz.zza, "zzh", zzaca.zza, "zzi", zzacc.zza, "zzj"});
        }
        if (i2 == 3) {
            return new zzacb();
        }
        zzabf zzabfVar = null;
        if (i2 == 4) {
            return new zzaby(zzabfVar);
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
        synchronized (zzacb.class) {
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
