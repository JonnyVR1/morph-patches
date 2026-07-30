package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzahh extends zzatu implements zzavg {
    private static final zzahh zzb;
    private static volatile zzavn zze;
    private int zzf;
    private int zzh;
    private boolean zzj;
    private zzauc zzg = zzatu.zzax();
    private String zzi = "";

    static {
        zzahh zzahhVar = new zzahh();
        zzb = zzahhVar;
        zzatu.zzaE(zzahh.class, zzahhVar);
    }

    private zzahh() {
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"zzf", "zzg", "zzh", zzahe.zza, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzahh();
        }
        zzadu zzaduVar = null;
        if (i2 == 4) {
            return new zzahg(zzaduVar);
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
        synchronized (zzahh.class) {
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
