package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzabx extends zzatu implements zzavg {
    private static final zzabx zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;

    static {
        zzabx zzabxVar = new zzabx();
        zzb = zzabxVar;
        zzatu.zzaE(zzabx.class, zzabxVar);
    }

    private zzabx() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"zzf", "zzg", zzabw.zza, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzabx();
        }
        zzabf zzabfVar = null;
        if (i2 == 4) {
            return new zzabv(zzabfVar);
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
        synchronized (zzabx.class) {
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
