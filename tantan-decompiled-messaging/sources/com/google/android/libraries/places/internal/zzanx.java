package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzanx extends zzatu implements zzavg {
    private static final zzanx zzb;
    private static volatile zzavn zze;
    private String zzf = "";
    private int zzg;
    private int zzh;
    private boolean zzi;

    static {
        zzanx zzanxVar = new zzanx();
        zzb = zzanxVar;
        zzatu.zzaE(zzanx.class, zzanxVar);
    }

    private zzanx() {
    }

    public static zzanw zza() {
        return (zzanw) zzb.zzar();
    }

    public static zzanx zzd() {
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
            return zzatu.zzaB(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzanx();
        }
        zzanv zzanvVar = null;
        if (i2 == 4) {
            return new zzanw(zzanvVar);
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
        synchronized (zzanx.class) {
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
