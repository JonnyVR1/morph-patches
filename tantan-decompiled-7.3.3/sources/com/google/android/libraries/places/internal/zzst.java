package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzst extends zzatu implements zzavg {
    private static final zzst zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private String zzg = "";
    private String zzj = "";

    static {
        zzst zzstVar = new zzst();
        zzb = zzstVar;
        zzatu.zzaE(zzst.class, zzstVar);
    }

    private zzst() {
    }

    public static zzso zza() {
        return (zzso) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzst zzstVar, String str) {
        zzstVar.zzf |= 1;
        zzstVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzst zzstVar, int i) {
        zzstVar.zzf |= 2;
        zzstVar.zzh = i;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzsp.zza, "zzm", zzsr.zza, "zzn", zzsq.zza, "zzo", zzss.zza});
        }
        if (i2 == 3) {
            return new zzst();
        }
        zzsn zzsnVar = null;
        if (i2 == 4) {
            return new zzso(zzsnVar);
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
        synchronized (zzst.class) {
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
