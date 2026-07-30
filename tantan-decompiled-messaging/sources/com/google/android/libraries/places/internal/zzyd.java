package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzyd extends zzatu implements zzavg {
    private static final zzyd zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzyd zzydVar = new zzyd();
        zzb = zzydVar;
        zzatu.zzaE(zzyd.class, zzydVar);
    }

    private zzyd() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzf", "zzg", zzyc.zza, "zzh", zzyb.zza, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzyd();
        }
        zzwv zzwvVar = null;
        if (i2 == 4) {
            return new zzya(zzwvVar);
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
        synchronized (zzyd.class) {
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
