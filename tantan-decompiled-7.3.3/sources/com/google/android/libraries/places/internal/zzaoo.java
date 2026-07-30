package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaoo extends zzatu implements zzavg {
    private static final zzaoo zzb;
    private static volatile zzavn zze;
    private String zzf = "";
    private String zzg = "";
    private zzauc zzh = zzatu.zzax();
    private String zzi = "";

    static {
        zzaoo zzaooVar = new zzaoo();
        zzb = zzaooVar;
        zzatu.zzaE(zzaoo.class, zzaooVar);
    }

    private zzaoo() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaoo();
        }
        zzaok zzaokVar = null;
        if (i2 == 4) {
            return new zzaon(zzaokVar);
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
        synchronized (zzaoo.class) {
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

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List zze() {
        return this.zzh;
    }
}
