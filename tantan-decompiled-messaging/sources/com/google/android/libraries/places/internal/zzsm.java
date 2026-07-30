package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes7.dex */
public final class zzsm extends zzatu implements zzavg {
    private static final zzsm zzb;
    private static volatile zzavn zze;
    private zzbf zzA;
    private zzae zzB;
    private zzcg zzC;
    private zzbl zzD;
    private int zzf;
    private zzagi zzh;
    private zzus zzi;
    private zzajj zzj;
    private zzadd zzk;
    private zzyk zzl;
    private zzbw zzm;
    private zzum zzn;
    private zzts zzo;
    private zzvr zzp;
    private zzaaj zzq;
    private zzabb zzr;
    private zzabe zzs;
    private zzta zzt;
    private zzwl zzu;
    private zzc zzv;
    private zzan zzw;
    private zzav zzx;
    private zzcy zzy;
    private zzay zzz;
    private byte zzE = 2;
    private int zzg = 1;

    static {
        zzsm zzsmVar = new zzsm();
        zzb = zzsmVar;
        zzatu.zzaE(zzsm.class, zzsmVar);
    }

    private zzsm() {
    }

    public static zzsk zza() {
        return (zzsk) zzb.zzar();
    }

    public static /* synthetic */ void zzd(zzsm zzsmVar, zzagi zzagiVar) {
        zzagiVar.getClass();
        zzsmVar.zzh = zzagiVar;
        zzsmVar.zzf |= 2;
    }

    public static /* synthetic */ void zze(zzsm zzsmVar, int i) {
        zzsmVar.zzg = 1;
        zzsmVar.zzf = 1 | zzsmVar.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzatu
    public final Object zzb(int i, Object obj, Object obj2) {
        zzavn zzatpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzE);
        }
        if (i2 == 2) {
            return zzatu.zzaB(zzb, "\u0001\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ဉ\u0014\u0017ဉ\u0015\u0018ဉ\u0016\u0019ဉ\u0017", new Object[]{"zzf", "zzg", zzsl.zza, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD"});
        }
        if (i2 == 3) {
            return new zzsm();
        }
        zzsj zzsjVar = null;
        if (i2 == 4) {
            return new zzsk(zzsjVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            this.zzE = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzavn zzavnVar = zze;
        if (zzavnVar != null) {
            return zzavnVar;
        }
        synchronized (zzsm.class) {
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
