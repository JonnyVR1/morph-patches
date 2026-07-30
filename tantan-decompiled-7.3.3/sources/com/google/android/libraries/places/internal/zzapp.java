package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzapp extends zzatu implements zzavg {
    private static final zzapp zzb;
    private static volatile zzavn zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzapp zzappVar = new zzapp();
        zzb = zzappVar;
        zzatu.zzaE(zzapp.class, zzappVar);
    }

    private zzapp() {
    }

    public static zzapp zzc() {
        return zzb;
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
            return new zzapp();
        }
        zzaok zzaokVar = null;
        if (i2 == 4) {
            return new zzapo(zzaokVar);
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
        synchronized (zzapp.class) {
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

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzf;
    }
}
