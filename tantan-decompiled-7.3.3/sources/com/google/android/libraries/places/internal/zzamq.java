package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzamq extends zzatu implements zzavg {
    private static final zzamq zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzaxp zzg;
    private double zzh;

    static {
        zzamq zzamqVar = new zzamq();
        zzb = zzamqVar;
        zzatu.zzaE(zzamq.class, zzamqVar);
    }

    private zzamq() {
    }

    public static zzamp zza() {
        return (zzamp) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzamq zzamqVar, zzaxp zzaxpVar) {
        zzaxpVar.getClass();
        zzamqVar.zzg = zzaxpVar;
        zzamqVar.zzf |= 1;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzamq();
        }
        zzamo zzamoVar = null;
        if (i2 == 4) {
            return new zzamp(zzamoVar);
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
        synchronized (zzamq.class) {
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
