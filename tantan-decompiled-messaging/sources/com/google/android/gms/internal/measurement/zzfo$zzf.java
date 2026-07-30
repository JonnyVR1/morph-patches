package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.ltx0;
import p149l.p0y0;
import p149l.qtx0;
import p149l.s1y0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzfo$zzf extends AbstractC2349u0<zzfo$zzf, C2361a> implements p0y0 {
    private static final zzfo$zzf zzc;
    private static volatile s1y0<zzfo$zzf> zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private cvx0<String> zzi = AbstractC2349u0.m14352x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfo$zzf$a */
    public static final class C2361a extends AbstractC2349u0.b<zzfo$zzf, C2361a> implements p0y0 {
        public C2361a() {
            super(zzfo$zzf.zzc);
        }
    }

    static {
        zzfo$zzf zzfo_zzf = new zzfo$zzf();
        zzc = zzfo_zzf;
        AbstractC2349u0.m14348p(zzfo$zzf.class, zzfo_zzf);
    }

    /* JADX INFO: renamed from: D */
    public static zzfo$zzf m14567D() {
        return zzc;
    }

    /* JADX INFO: renamed from: B */
    public final zzb m14568B() {
        zzb zzbVarZza = zzb.zza(this.zzf);
        return zzbVarZza == null ? zzb.UNKNOWN_MATCH_TYPE : zzbVarZza;
    }

    /* JADX INFO: renamed from: E */
    public final String m14569E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: G */
    public final List<String> m14570G() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14571I() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14572K() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14573L() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14574M() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14575h() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2307a.f10241a[i - 1];
        switch (i2) {
            case 1:
                return new zzfo$zzf();
            case 2:
                return new C2361a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                s1y0<zzfo$zzf> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (zzfo$zzf.class) {
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
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);

        private final int zzi;

        zzb(int i) {
            this.zzi = i;
        }

        public static zzb zza(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static ltx0 zzb() {
            return C2320g.f10243a;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
        }

        @Override // p149l.qtx0
        public final int zza() {
            return this.zzi;
        }
    }
}
