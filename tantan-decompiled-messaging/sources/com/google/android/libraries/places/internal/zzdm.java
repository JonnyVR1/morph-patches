package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzdm extends zzatu implements zzavg {
    private static final zzdm zzb;
    private static volatile zzavn zze;
    private int zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;

    static {
        zzdm zzdmVar = new zzdm();
        zzb = zzdmVar;
        zzatu.zzaE(zzdm.class, zzdmVar);
    }

    private zzdm() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzdl.zza, "zzl", zzdk.zza, "zzm", zzdj.zza, "zzn"});
        }
        if (i2 == 3) {
            return new zzdm();
        }
        zzdh zzdhVar = null;
        if (i2 == 4) {
            return new zzdi(zzdhVar);
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
        synchronized (zzdm.class) {
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
