package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzamd extends zzatu implements zzavg {
    private static final zzamd zzb;
    private static volatile zzavn zze;
    private String zzf = "";
    private zzauc zzg = zzatu.zzax();

    static {
        zzamd zzamdVar = new zzamd();
        zzb = zzamdVar;
        zzatu.zzaE(zzamd.class, zzamdVar);
    }

    private zzamd() {
    }

    public static zzamd zzc() {
        return zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzf", "zzg", zzamj.class});
        }
        if (i2 == 3) {
            return new zzamd();
        }
        zzalz zzalzVar = null;
        if (i2 == 4) {
            return new zzamc(zzalzVar);
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
        synchronized (zzamd.class) {
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

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzg;
    }
}
