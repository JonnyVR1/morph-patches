package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzzm extends zzatu implements zzavg {
    private static final zzzm zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzh;
    private String zzg = "";
    private zzauc zzi = zzatu.zzax();

    static {
        zzzm zzzmVar = new zzzm();
        zzb = zzzmVar;
        zzatu.zzaE(zzzm.class, zzzmVar);
    }

    private zzzm() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"zzf", "zzg", "zzh", "zzi", zzzl.class});
        }
        if (i2 == 3) {
            return new zzzm();
        }
        zzzg zzzgVar = null;
        if (i2 == 4) {
            return new zzzj(zzzgVar);
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
        synchronized (zzzm.class) {
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
