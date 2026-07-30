package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzapi extends zzatu implements zzavg {
    private static final zzapi zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzaxm zzg;

    static {
        zzapi zzapiVar = new zzapi();
        zzb = zzapiVar;
        zzatu.zzaE(zzapi.class, zzapiVar);
    }

    private zzapi() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzapi();
        }
        zzaok zzaokVar = null;
        if (i2 == 4) {
            return new zzaph(zzaokVar);
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
        synchronized (zzapi.class) {
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

    public final zzaxm zzc() {
        zzaxm zzaxmVar = this.zzg;
        return zzaxmVar == null ? zzaxm.zzh() : zzaxmVar;
    }
}
