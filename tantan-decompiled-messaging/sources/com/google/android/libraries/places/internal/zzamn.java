package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class zzamn extends zzatu implements zzavg {
    private static final zzamn zzb;
    private static volatile zzavn zze;
    private zzauc zzf = zzatu.zzax();

    static {
        zzamn zzamnVar = new zzamn();
        zzb = zzamnVar;
        zzatu.zzaE(zzamn.class, zzamnVar);
    }

    private zzamn() {
    }

    public static zzamn zzc() {
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
            return zzatu.zzaB(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzf", zzamm.class});
        }
        if (i2 == 3) {
            return new zzamn();
        }
        zzalz zzalzVar = null;
        if (i2 == 4) {
            return new zzama(zzalzVar);
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
        synchronized (zzamn.class) {
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

    public final List zzd() {
        return this.zzf;
    }
}
