package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzafy extends zzatu implements zzavg {
    private static final zzafy zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzafy zzafyVar = new zzafy();
        zzb = zzafyVar;
        zzatu.zzaE(zzafy.class, zzafyVar);
    }

    private zzafy() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"zzf", "zzg", zzafx.zza, "zzh"});
        }
        if (i2 == 3) {
            return new zzafy();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzafw(zzaduVar);
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
        synchronized (zzafy.class) {
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
