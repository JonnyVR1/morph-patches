package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvu extends zzatu implements zzavg {
    private static final zzvu zzb;
    private static volatile zzavn zze;

    static {
        zzvu zzvuVar = new zzvu();
        zzb = zzvuVar;
        zzatu.zzaE(zzvu.class, zzvuVar);
    }

    private zzvu() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        zzvs zzvsVar = null;
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new zzvu();
        }
        if (i2 == 4) {
            return new zzvt(zzvsVar);
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
        synchronized (zzvu.class) {
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
