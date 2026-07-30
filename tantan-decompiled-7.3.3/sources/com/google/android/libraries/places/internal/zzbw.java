package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbw extends zzatu implements zzavg {
    private static final zzbw zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg = 1;
    private zzby zzh;
    private zzbr zzi;
    private zzco zzj;
    private zzbt zzk;
    private zzca zzl;

    static {
        zzbw zzbwVar = new zzbw();
        zzb = zzbwVar;
        zzatu.zzaE(zzbw.class, zzbwVar);
    }

    private zzbw() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzf", "zzg", zzbv.zza, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzbw();
        }
        zzbp zzbpVar = null;
        if (i2 == 4) {
            return new zzbu(zzbpVar);
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
        synchronized (zzbw.class) {
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
