package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzca extends zzatu implements zzavg {
    private static final zzca zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzcd zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;

    static {
        zzca zzcaVar = new zzca();
        zzb = zzcaVar;
        zzatu.zzaE(zzca.class, zzcaVar);
    }

    private zzca() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007င\u0007\bင\u0006", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzm"});
        }
        if (i2 == 3) {
            return new zzca();
        }
        zzbp zzbpVar = null;
        if (i2 == 4) {
            return new zzbz(zzbpVar);
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
        synchronized (zzca.class) {
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
