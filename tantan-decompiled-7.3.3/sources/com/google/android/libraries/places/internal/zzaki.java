package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzaki extends zzatu implements zzavg {
    private static final zzaki zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzaxp zzg;
    private zzaxp zzh;

    static {
        zzaki zzakiVar = new zzaki();
        zzb = zzakiVar;
        zzatu.zzaE(zzaki.class, zzakiVar);
    }

    private zzaki() {
    }

    public static zzakh zza() {
        return (zzakh) zzb.zzar();
    }

    public static zzaki zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzaki zzakiVar, zzaxp zzaxpVar) {
        zzaxpVar.getClass();
        zzakiVar.zzg = zzaxpVar;
        zzakiVar.zzf |= 1;
    }

    public static /* synthetic */ void zzh(zzaki zzakiVar, zzaxp zzaxpVar) {
        zzaxpVar.getClass();
        zzakiVar.zzh = zzaxpVar;
        zzakiVar.zzf |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaki();
        }
        zzakg zzakgVar = null;
        if (i2 == 4) {
            return new zzakh(zzakgVar);
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
        synchronized (zzaki.class) {
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

    public final zzaxp zze() {
        zzaxp zzaxpVar = this.zzh;
        return zzaxpVar == null ? zzaxp.zzh() : zzaxpVar;
    }

    public final zzaxp zzf() {
        zzaxp zzaxpVar = this.zzg;
        return zzaxpVar == null ? zzaxp.zzh() : zzaxpVar;
    }
}
