package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzane extends zzatu implements zzavg {
    private static final zzane zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;

    static {
        zzane zzaneVar = new zzane();
        zzb = zzaneVar;
        zzatu.zzaE(zzane.class, zzaneVar);
    }

    private zzane() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzane();
        }
        zzamu zzamuVar = null;
        if (i2 == 4) {
            return new zzand(zzamuVar);
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
        synchronized (zzane.class) {
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
