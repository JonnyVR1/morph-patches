package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzacz extends zzatu implements zzavg {
    private static final zzacz zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzauc zzo = zzatu.zzax();
    private int zzp;
    private int zzq;
    private int zzr;

    static {
        zzacz zzaczVar = new zzacz();
        zzb = zzaczVar;
        zzatu.zzaE(zzacz.class, zzaczVar);
    }

    private zzacz() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b\nင\b\u000b᠌\t\fင\n", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzacy.class, "zzp", "zzq", zzacc.zza, "zzr"});
        }
        if (i2 == 3) {
            return new zzacz();
        }
        zzabf zzabfVar = null;
        if (i2 == 4) {
            return new zzacw(zzabfVar);
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
        synchronized (zzacz.class) {
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
