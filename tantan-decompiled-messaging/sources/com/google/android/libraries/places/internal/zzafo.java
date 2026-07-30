package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzafo extends zzatu implements zzavg {
    private static final zzafo zzb;
    private static volatile zzavn zze;
    private int zzf;
    private zzwd zzh;
    private byte zzm = 2;
    private String zzg = "";
    private String zzi = "";
    private zzauc zzj = zzatu.zzax();
    private String zzk = "";
    private String zzl = "";

    static {
        zzafo zzafoVar = new zzafo();
        zzb = zzafoVar;
        zzatu.zzaE(zzafo.class, zzafoVar);
    }

    private zzafo() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzafo();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzafn(zzaduVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzavn zzavnVar = zze;
        if (zzavnVar != null) {
            return zzavnVar;
        }
        synchronized (zzafo.class) {
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
