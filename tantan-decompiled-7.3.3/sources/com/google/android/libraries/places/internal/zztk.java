package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zztk extends zzatu implements zzavg {
    private static final zztk zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zztg zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zztk zztkVar = new zztk();
        zzb = zztkVar;
        zzatu.zzaE(zztk.class, zztkVar);
    }

    private zztk() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zztk();
        }
        zzsu zzsuVar = null;
        if (i2 == 4) {
            return new zztj(zzsuVar);
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
        synchronized (zztk.class) {
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
