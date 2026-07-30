package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzanp extends zzatu implements zzavg {
    private static final zzanp zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzauc zzg = zzatu.zzax();
    private zzauc zzh = zzatu.zzax();

    static {
        zzanp zzanpVar = new zzanp();
        zzb = zzanpVar;
        zzatu.zzaE(zzanp.class, zzanpVar);
    }

    private zzanp() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"zzf", "zzg", zzanm.class, "zzh", zzano.class});
        }
        if (i2 == 3) {
            return new zzanp();
        }
        zzanj zzanjVar = null;
        if (i2 == 4) {
            return new zzank(zzanjVar);
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
        synchronized (zzanp.class) {
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
