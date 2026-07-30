package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaox extends zzatu implements zzavg {
    private static final zzaox zzb;
    private static volatile zzavn zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzaox zzaoxVar = new zzaox();
        zzb = zzaoxVar;
        zzatu.zzaE(zzaox.class, zzaoxVar);
    }

    private zzaox() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaox();
        }
        zzaok zzaokVar = null;
        if (i2 == 4) {
            return new zzaow(zzaokVar);
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
        synchronized (zzaox.class) {
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
