package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzzt extends zzatu implements zzavg {
    private static final zzzt zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzn;
    private String zzg = "";
    private zzauc zzm = zzatu.zzax();

    static {
        zzzt zzztVar = new zzzt();
        zzb = zzztVar;
        zzatu.zzaE(zzzt.class, zzztVar);
    }

    private zzzt() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u001b\bင\u0006", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzzq.class, "zzn"});
        }
        if (i2 == 3) {
            return new zzzt();
        }
        zzzg zzzgVar = null;
        if (i2 == 4) {
            return new zzzs(zzzgVar);
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
        synchronized (zzzt.class) {
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
