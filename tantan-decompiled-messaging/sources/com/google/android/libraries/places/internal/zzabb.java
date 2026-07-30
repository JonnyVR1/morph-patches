package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzabb extends zzatu implements zzavg {
    private static final zzabb zzb;
    private static volatile zzavn zze;
    private int zzf;
    private String zzg = "";
    private int zzh;
    private long zzi;

    static {
        zzabb zzabbVar = new zzabb();
        zzb = zzabbVar;
        zzatu.zzaE(zzabb.class, zzabbVar);
    }

    private zzabb() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002", new Object[]{"zzf", "zzg", "zzh", zzaba.zza, "zzi"});
        }
        if (i2 == 3) {
            return new zzabb();
        }
        zzaay zzaayVar = null;
        if (i2 == 4) {
            return new zzaaz(zzaayVar);
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
        synchronized (zzabb.class) {
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
