package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzarj extends zzatu implements zzavg {
    private static final zzarj zzb;
    private static volatile zzavn zze;
    private int zzf = 0;
    private Object zzg;

    static {
        zzarj zzarjVar = new zzarj();
        zzb = zzarjVar;
        zzatu.zzaE(zzarj.class, zzarjVar);
    }

    private zzarj() {
    }

    public static zzari zza() {
        return (zzari) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzarj zzarjVar, zzaki zzakiVar) {
        zzakiVar.getClass();
        zzarjVar.zzg = zzakiVar;
        zzarjVar.zzf = 1;
    }

    public static /* synthetic */ void zze(zzarj zzarjVar, zzamq zzamqVar) {
        zzamqVar.getClass();
        zzarjVar.zzg = zzamqVar;
        zzarjVar.zzf = 2;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzg", "zzf", zzaki.class, zzamq.class});
        }
        if (i2 == 3) {
            return new zzarj();
        }
        zzard zzardVar = null;
        if (i2 == 4) {
            return new zzari(zzardVar);
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
        synchronized (zzarj.class) {
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
