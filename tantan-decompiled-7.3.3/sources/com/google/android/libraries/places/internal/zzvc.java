package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvc extends zzatu implements zzavg {
    private static final zzvc zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private float zzs;
    private float zzt;
    private int zzu;

    static {
        zzvc zzvcVar = new zzvc();
        zzb = zzvcVar;
        zzatu.zzaE(zzvc.class, zzvcVar);
    }

    private zzvc() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဇ\b\nင\t\u000bင\n\fင\u000b\rခ\f\u000eခ\r\u000fင\u000e", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzvc();
        }
        zzup zzupVar = null;
        if (i2 == 4) {
            return new zzvb(zzupVar);
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
        synchronized (zzvc.class) {
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
