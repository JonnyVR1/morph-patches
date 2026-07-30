package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahm extends zzatu implements zzavg {
    private static final zzahm zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;

    static {
        zzahm zzahmVar = new zzahm();
        zzb = zzahmVar;
        zzatu.zzaE(zzahm.class, zzahmVar);
    }

    private zzahm() {
    }

    public static zzahk zza() {
        return (zzahk) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzahm zzahmVar, int i) {
        zzahmVar.zzg = 1;
        zzahmVar.zzf = 1 | zzahmVar.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"zzf", "zzg", zzahl.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzahm();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzahk(zzaduVar);
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
        synchronized (zzahm.class) {
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
