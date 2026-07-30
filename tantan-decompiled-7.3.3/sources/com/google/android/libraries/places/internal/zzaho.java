package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaho extends zzatu implements zzavg {
    private static final zzaho zzb;
    private static volatile zzavn zze;
    private zzauc zzf = zzatu.zzax();

    static {
        zzaho zzahoVar = new zzaho();
        zzb = zzahoVar;
        zzatu.zzaE(zzaho.class, zzahoVar);
    }

    private zzaho() {
    }

    public static zzahn zza() {
        return (zzahn) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzaho zzahoVar, Iterable iterable) {
        zzauc zzaucVar = zzahoVar.zzf;
        if (!zzaucVar.zzc()) {
            zzahoVar.zzf = zzatu.zzay(zzaucVar);
        }
        zzart.zzam(iterable, zzahoVar.zzf);
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzf"});
        }
        if (i2 == 3) {
            return new zzaho();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzahn(zzaduVar);
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
        synchronized (zzaho.class) {
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
