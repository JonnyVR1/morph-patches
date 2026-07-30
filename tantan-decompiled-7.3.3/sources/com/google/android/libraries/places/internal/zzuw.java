package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzuw extends zzatu implements zzavg {
    private static final zzuw zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    static {
        zzuw zzuwVar = new zzuw();
        zzb = zzuwVar;
        zzatu.zzaE(zzuw.class, zzuwVar);
    }

    private zzuw() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzuw();
        }
        zzup zzupVar = null;
        if (i2 == 4) {
            return new zzuv(zzupVar);
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
        synchronized (zzuw.class) {
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
