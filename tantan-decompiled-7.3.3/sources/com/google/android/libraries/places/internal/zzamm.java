package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzamm extends zzatu implements zzavg {
    private static final zzamm zzb;
    private static volatile zzavn zze;
    private int zzf = 0;
    private Object zzg;

    static {
        zzamm zzammVar = new zzamm();
        zzb = zzammVar;
        zzatu.zzaE(zzamm.class, zzammVar);
    }

    private zzamm() {
    }

    public final zzamf zza() {
        return this.zzf == 1 ? (zzamf) this.zzg : zzamf.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzg", "zzf", zzamf.class, zzamh.class});
        }
        if (i2 == 3) {
            return new zzamm();
        }
        zzalz zzalzVar = null;
        if (i2 == 4) {
            return new zzamb(zzalzVar);
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
        synchronized (zzamm.class) {
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

    public final boolean zzd() {
        return this.zzf == 1;
    }
}
