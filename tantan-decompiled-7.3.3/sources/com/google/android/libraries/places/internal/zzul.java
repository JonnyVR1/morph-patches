package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzul extends zzatu implements zzavg {
    private static final zzul zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzi;

    static {
        zzul zzulVar = new zzul();
        zzb = zzulVar;
        zzatu.zzaE(zzul.class, zzulVar);
    }

    private zzul() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"zzf", "zzg", zzuk.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzul();
        }
        zzug zzugVar = null;
        if (i2 == 4) {
            return new zzuj(zzugVar);
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
        synchronized (zzul.class) {
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
