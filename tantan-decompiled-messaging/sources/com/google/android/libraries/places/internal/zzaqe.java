package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaqe extends zzatu implements zzavg {
    private static final zzaqe zzb;
    private static volatile zzavn zze;
    private zzauc zzf = zzatu.zzax();
    private zzauc zzg = zzatu.zzax();

    static {
        zzaqe zzaqeVar = new zzaqe();
        zzb = zzaqeVar;
        zzatu.zzaE(zzaqe.class, zzaqeVar);
    }

    private zzaqe() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"zzf", zzaqh.class, "zzg"});
        }
        if (i2 == 3) {
            return new zzaqe();
        }
        zzaqc zzaqcVar = null;
        if (i2 == 4) {
            return new zzaqd(zzaqcVar);
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
        synchronized (zzaqe.class) {
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
