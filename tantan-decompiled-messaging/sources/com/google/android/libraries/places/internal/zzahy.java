package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahy extends zzatu implements zzavg {
    private static final zzahy zzb;
    private static volatile zzavn zze;
    private zzauc zzf = zzatu.zzax();

    static {
        zzahy zzahyVar = new zzahy();
        zzb = zzahyVar;
        zzatu.zzaE(zzahy.class, zzahyVar);
    }

    private zzahy() {
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
            return new zzahy();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzahx(zzaduVar);
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
        synchronized (zzahy.class) {
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
