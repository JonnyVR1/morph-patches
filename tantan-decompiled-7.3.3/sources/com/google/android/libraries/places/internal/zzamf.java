package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzamf extends zzatu implements zzavg {
    private static final zzamf zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzamd zzi;
    private zzaml zzj;
    private int zzl;
    private String zzg = "";
    private String zzh = "";
    private zzauc zzk = zzatu.zzax();

    static {
        zzamf zzamfVar = new zzamf();
        zzb = zzamfVar;
        zzatu.zzaE(zzamf.class, zzamfVar);
    }

    private zzamf() {
    }

    public static zzamf zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzl;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ț\u0006\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzamf();
        }
        zzalz zzalzVar = null;
        if (i2 == 4) {
            return new zzame(zzalzVar);
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
        synchronized (zzamf.class) {
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

    public final zzamd zzc() {
        zzamd zzamdVar = this.zzi;
        return zzamdVar == null ? zzamd.zzc() : zzamdVar;
    }

    public final zzaml zzf() {
        zzaml zzamlVar = this.zzj;
        return zzamlVar == null ? zzaml.zze() : zzamlVar;
    }

    public final String zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzk;
    }
}
