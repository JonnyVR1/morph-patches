package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzadk extends zzatu implements zzavg {
    private static final zzadk zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;

    static {
        zzadk zzadkVar = new zzadk();
        zzb = zzadkVar;
        zzatu.zzaE(zzadk.class, zzadkVar);
    }

    private zzadk() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzf", "zzg", zzadj.zza});
        }
        if (i2 == 3) {
            return new zzadk();
        }
        zzabf zzabfVar = null;
        if (i2 == 4) {
            return new zzadi(zzabfVar);
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
        synchronized (zzadk.class) {
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
