package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaos extends zzatu implements zzavg {
    private static final zzaos zzb;
    private static volatile zzavn zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzaos zzaosVar = new zzaos();
        zzb = zzaosVar;
        zzatu.zzaE(zzaos.class, zzaosVar);
    }

    private zzaos() {
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
            return new zzaos();
        }
        zzaok zzaokVar = null;
        if (i2 == 4) {
            return new zzaor(zzaokVar);
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
        synchronized (zzaos.class) {
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

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }
}
