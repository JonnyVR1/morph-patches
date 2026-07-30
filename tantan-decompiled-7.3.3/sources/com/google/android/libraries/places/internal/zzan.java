package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzan extends zzatu implements zzavg {
    private static final zzan zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzco zzg;
    private zzai zzh;
    private zzal zzi;

    static {
        zzan zzanVar = new zzan();
        zzb = zzanVar;
        zzatu.zzaE(zzan.class, zzanVar);
    }

    private zzan() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000", new Object[]{"zzf", "zzh", "zzi", "zzg"});
        }
        if (i2 == 3) {
            return new zzan();
        }
        zzaj zzajVar = null;
        if (i2 == 4) {
            return new zzam(zzajVar);
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
        synchronized (zzan.class) {
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
