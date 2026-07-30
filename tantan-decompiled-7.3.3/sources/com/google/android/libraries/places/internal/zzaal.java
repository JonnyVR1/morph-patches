package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaal extends zzatu implements zzavg {
    private static final zzaal zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private float zzi;

    static {
        zzaal zzaalVar = new zzaal();
        zzb = zzaalVar;
        zzatu.zzaE(zzaal.class, zzaalVar);
    }

    private zzaal() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzf", "zzg", zzaaf.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaal();
        }
        zzzg zzzgVar = null;
        if (i2 == 4) {
            return new zzaak(zzzgVar);
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
        synchronized (zzaal.class) {
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
