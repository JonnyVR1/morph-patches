package com.google.android.gms.internal.measurement;

import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.r2y0;
import p153l.v9y0;
import p153l.w2y0;
import p153l.yay0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzgd$zzd extends AbstractC2372u0<zzgd$zzd, C2391a> implements v9y0 {
    private static final zzgd$zzd zzc;
    private static volatile yay0<zzgd$zzd> zzd;
    private int zze;
    private int zzf;
    private i4y0<zzgd$zzd> zzg = AbstractC2372u0.m14406x();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzgd$zzd$a */
    public static final class C2391a extends AbstractC2372u0.b<zzgd$zzd, C2391a> implements v9y0 {
        public C2391a() {
            super(zzgd$zzd.zzc);
        }
    }

    static {
        zzgd$zzd zzgd_zzd = new zzgd$zzd();
        zzc = zzgd_zzd;
        AbstractC2372u0.m14402p(zzgd$zzd.class, zzgd_zzd);
    }

    /* JADX INFO: renamed from: B */
    public final double m14676B() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: C */
    public final zza m14677C() {
        zza zzaVarZza = zza.zza(this.zzf);
        return zzaVarZza == null ? zza.UNKNOWN : zzaVarZza;
    }

    /* JADX INFO: renamed from: E */
    public final String m14678E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: G */
    public final String m14679G() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: I */
    public final List<zzgd$zzd> m14680I() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14681K() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14682L() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14683M() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14684N() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2354l0.f10283a[i - 1];
        switch (i2) {
            case 1:
                return new zzgd$zzd();
            case 2:
                return new C2391a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zza.zzb(), "zzg", zzgd$zzd.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                yay0<zzgd$zzd> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (zzgd$zzd.class) {
                    try {
                        aVar = zzd;
                        if (aVar == null) {
                            aVar = new AbstractC2372u0.a(zzc);
                            zzd = aVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return aVar;
            case 6:
                return (byte) 1;
            default:
                l710.m153113a();
            case 7:
                return null;
        }
    }

    public enum zza implements w2y0 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);

        private final int zzg;

        zza(int i) {
            this.zzg = i;
        }

        public static zza zza(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return STRING;
            }
            if (i == 2) {
                return NUMBER;
            }
            if (i == 3) {
                return BOOLEAN;
            }
            if (i != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static r2y0 zzb() {
            return C2356m0.f10284a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // p153l.w2y0
        public final int zza() {
            return this.zzg;
        }
    }
}
