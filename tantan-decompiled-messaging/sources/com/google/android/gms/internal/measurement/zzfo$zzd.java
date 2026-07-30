package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.ltx0;
import p149l.p0y0;
import p149l.qtx0;
import p149l.s1y0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfo$zzd extends AbstractC2349u0<zzfo$zzd, C2360a> implements p0y0 {
    private static final zzfo$zzd zzc;
    private static volatile s1y0<zzfo$zzd> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfo$zzd$a */
    public static final class C2360a extends AbstractC2349u0.b<zzfo$zzd, C2360a> implements p0y0 {
        public C2360a() {
            super(zzfo$zzd.zzc);
        }
    }

    static {
        zzfo$zzd zzfo_zzd = new zzfo$zzd();
        zzc = zzfo_zzd;
        AbstractC2349u0.m14348p(zzfo$zzd.class, zzfo_zzd);
    }

    /* JADX INFO: renamed from: D */
    public static zzfo$zzd m14555D() {
        return zzc;
    }

    /* JADX INFO: renamed from: B */
    public final zzb m14556B() {
        zzb zzbVarZza = zzb.zza(this.zzf);
        return zzbVarZza == null ? zzb.UNKNOWN_COMPARISON_TYPE : zzbVarZza;
    }

    /* JADX INFO: renamed from: E */
    public final String m14557E() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: G */
    public final String m14558G() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: I */
    public final String m14559I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14560K() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14561L() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14562M() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14563N() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m14564T() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m14565U() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2307a.f10241a[i - 1];
        switch (i2) {
            case 1:
                return new zzfo$zzd();
            case 2:
                return new C2360a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                s1y0<zzfo$zzd> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (zzfo$zzd.class) {
                    try {
                        aVar = zzd;
                        if (aVar == null) {
                            aVar = new AbstractC2349u0.a(zzc);
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
                bz00.m104536a();
            case 7:
                return null;
        }
    }

    public enum zzb implements qtx0 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);

        private final int zzg;

        zzb(int i) {
            this.zzg = i;
        }

        public static zzb zza(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static ltx0 zzb() {
            return C2318f.f10242a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
        }

        @Override // p149l.qtx0
        public final int zza() {
            return this.zzg;
        }
    }
}
