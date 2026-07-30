package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzafc extends zzatu implements zzavg {
    private static final zzafc zzb;
    private static volatile zzavn zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        zzafc zzafcVar = new zzafc();
        zzb = zzafcVar;
        zzatu.zzaE(zzafc.class, zzafcVar);
    }

    private zzafc() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", zzafb.zza});
        }
        if (i2 == 3) {
            return new zzafc();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzafa(zzaduVar);
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
        synchronized (zzafc.class) {
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
