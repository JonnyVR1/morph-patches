package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaxm extends zzatu implements zzavg {
    private static final zzaxm zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzaxm zzaxmVar = new zzaxm();
        zzb = zzaxmVar;
        zzatu.zzaE(zzaxm.class, zzaxmVar);
    }

    private zzaxm() {
    }

    public static zzaxm zzh() {
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaxm();
        }
        zzaxk zzaxkVar = null;
        if (i2 == 4) {
            return new zzaxl(zzaxkVar);
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
        synchronized (zzaxm.class) {
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

    public final int zzc() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzg;
    }

    public final int zzf() {
        return this.zzf;
    }
}
