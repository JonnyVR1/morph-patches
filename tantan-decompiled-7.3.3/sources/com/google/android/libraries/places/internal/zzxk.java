package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzxk extends zzatu implements zzavg {
    private static final zzxk zzb;
    private static volatile zzavn zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzaub zzm = zzatu.zzaw();
    private long zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;
    private int zzs;
    private long zzt;

    static {
        zzxk zzxkVar = new zzxk();
        zzb = zzxkVar;
        zzatu.zzaE(zzxk.class, zzxkVar);
    }

    private zzxk() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzaty zzatyVar = zzxh.zza;
            zzaty zzatyVar2 = zzxg.zza;
            zzaty zzatyVar3 = zzxe.zza;
            return zzatu.zzaB(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005\u0007\u0014\bဂ\u0006\t᠌\u0007\n᠌\b\u000b᠌\t\fဂ\n\rင\u000b\u000eဂ\f", new Object[]{"zzf", "zzg", "zzh", "zzi", zzatyVar, "zzj", zzatyVar2, "zzk", zzatyVar3, "zzl", "zzm", "zzn", "zzo", zzatyVar, "zzp", zzatyVar2, "zzq", zzatyVar3, "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new zzxk();
        }
        zzwv zzwvVar = null;
        if (i2 == 4) {
            return new zzxj(zzwvVar);
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
        synchronized (zzxk.class) {
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
