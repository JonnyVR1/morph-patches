package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaqy extends zzatu implements zzavg {
    private static final zzaqy zzb;
    private static volatile zzavn zze;
    private int zzf = 0;
    private Object zzg;

    static {
        zzaqy zzaqyVar = new zzaqy();
        zzb = zzaqyVar;
        zzatu.zzaE(zzaqy.class, zzaqyVar);
    }

    private zzaqy() {
    }

    public static zzaqx zza() {
        return (zzaqx) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzaqy zzaqyVar, zzamq zzamqVar) {
        zzamqVar.getClass();
        zzaqyVar.zzg = zzamqVar;
        zzaqyVar.zzf = 2;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȼ\u0000\u0004<\u0000\u0005Ȼ\u0000", new Object[]{"zzg", "zzf", zzaod.class, zzamq.class, zzaqw.class});
        }
        if (i2 == 3) {
            return new zzaqy();
        }
        zzaqt zzaqtVar = null;
        if (i2 == 4) {
            return new zzaqx(zzaqtVar);
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
        synchronized (zzaqy.class) {
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
