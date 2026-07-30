package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzvg extends zzatu implements zzavg {
    private static final zzvg zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private String zzg = "";
    private String zzl = "";

    static {
        zzvg zzvgVar = new zzvg();
        zzb = zzvgVar;
        zzatu.zzaE(zzvg.class, zzvgVar);
    }

    private zzvg() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzvg();
        }
        zzup zzupVar = null;
        if (i2 == 4) {
            return new zzvf(zzupVar);
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
        synchronized (zzvg.class) {
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
