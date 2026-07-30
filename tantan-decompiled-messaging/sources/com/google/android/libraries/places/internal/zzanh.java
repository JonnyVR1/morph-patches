package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzanh extends zzatu implements zzavg {
    private static final zzanh zzb;
    private static volatile zzavn zze;
    private int zzf = 0;
    private Object zzg;

    static {
        zzanh zzanhVar = new zzanh();
        zzb = zzanhVar;
        zzatu.zzaE(zzanh.class, zzanhVar);
    }

    private zzanh() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzg", "zzf", zzang.class, zzana.class});
        }
        if (i2 == 3) {
            return new zzanh();
        }
        zzamu zzamuVar = null;
        if (i2 == 4) {
            return new zzamy(zzamuVar);
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
        synchronized (zzanh.class) {
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
