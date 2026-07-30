package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaer extends zzatu implements zzavg {
    private static final zzaer zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzatz zzg = zzatu.zzau();
    private zzauc zzh = zzatu.zzax();
    private String zzi = "";
    private boolean zzj;
    private int zzk;

    static {
        zzaer zzaerVar = new zzaer();
        zzb = zzaerVar;
        zzatu.zzaE(zzaer.class, zzaerVar);
    }

    private zzaer() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0016\u0002\u001a\u0003ဈ\u0000\u0004ဇ\u0001\u0005ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzaer();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzaeq(zzaduVar);
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
        synchronized (zzaer.class) {
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
