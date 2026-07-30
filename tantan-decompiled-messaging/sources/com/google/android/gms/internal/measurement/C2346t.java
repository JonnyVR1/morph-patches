package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C2346t extends AbstractC2349u0<C2346t, a> implements p0y0 {
    private static final C2346t zzc;
    private static volatile s1y0<C2346t> zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t$a */
    public static final class a extends AbstractC2349u0.b<C2346t, a> implements p0y0 {
        public a() {
            super(C2346t.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14315A(String str) {
            m14378r();
            C2346t.m14287L((C2346t) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14316B() {
            m14378r();
            C2346t.m14282C((C2346t) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14317C(String str) {
            m14378r();
            C2346t.m14290T((C2346t) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public final a m14318D() {
            m14378r();
            C2346t.m14285I((C2346t) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public final a m14319E(String str) {
            m14378r();
            C2346t.m14293W((C2346t) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public final a m14320G() {
            m14378r();
            C2346t.m14289N((C2346t) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public final a m14321K(String str) {
            m14378r();
            C2346t.m14296Z((C2346t) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: L */
        public final a m14322L() {
            m14378r();
            C2346t.m14292V((C2346t) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: M */
        public final a m14323M(String str) {
            m14378r();
            C2346t.m14298c0((C2346t) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public final a m14324N() {
            m14378r();
            C2346t.m14295Y((C2346t) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: T */
        public final a m14325T() {
            m14378r();
            C2346t.m14297b0((C2346t) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final long m14326v() {
            return ((C2346t) this.f10262b).m14299B();
        }

        /* JADX INFO: renamed from: w */
        public final a m14327w(long j) {
            m14378r();
            C2346t.m14283D((C2346t) this.f10262b, j);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14328x(String str) {
            m14378r();
            C2346t.m14284E((C2346t) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final long m14329y() {
            return ((C2346t) this.f10262b).m14300G();
        }

        /* JADX INFO: renamed from: z */
        public final a m14330z(long j) {
            m14378r();
            C2346t.m14286K((C2346t) this.f10262b, j);
            return this;
        }
    }

    static {
        C2346t c2346t = new C2346t();
        zzc = c2346t;
        AbstractC2349u0.m14348p(C2346t.class, c2346t);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14282C(C2346t c2346t) {
        c2346t.zze &= -5;
        c2346t.zzh = zzc.zzh;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14283D(C2346t c2346t, long j) {
        c2346t.zze |= 8;
        c2346t.zzi = j;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14284E(C2346t c2346t, String str) {
        str.getClass();
        c2346t.zze |= 4;
        c2346t.zzh = str;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14285I(C2346t c2346t) {
        c2346t.zze &= -3;
        c2346t.zzg = zzc.zzg;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14286K(C2346t c2346t, long j) {
        c2346t.zze |= 128;
        c2346t.zzm = j;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14287L(C2346t c2346t, String str) {
        str.getClass();
        c2346t.zze |= 2;
        c2346t.zzg = str;
    }

    /* JADX INFO: renamed from: M */
    public static a m14288M() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m14289N(C2346t c2346t) {
        c2346t.zze &= -2;
        c2346t.zzf = zzc.zzf;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14290T(C2346t c2346t, String str) {
        str.getClass();
        c2346t.zze |= 1;
        c2346t.zzf = str;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m14292V(C2346t c2346t) {
        c2346t.zze &= -65;
        c2346t.zzl = zzc.zzl;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m14293W(C2346t c2346t, String str) {
        str.getClass();
        c2346t.zze |= 64;
        c2346t.zzl = str;
    }

    /* JADX INFO: renamed from: X */
    public static C2346t m14294X() {
        return zzc;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m14295Y(C2346t c2346t) {
        c2346t.zze &= -33;
        c2346t.zzk = zzc.zzk;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m14296Z(C2346t c2346t, String str) {
        str.getClass();
        c2346t.zze |= 32;
        c2346t.zzk = str;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m14297b0(C2346t c2346t) {
        c2346t.zze &= -17;
        c2346t.zzj = zzc.zzj;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m14298c0(C2346t c2346t, String str) {
        str.getClass();
        c2346t.zze |= 16;
        c2346t.zzj = str;
    }

    /* JADX INFO: renamed from: B */
    public final long m14299B() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: G */
    public final long m14300G() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m14301a0() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m14302d0() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m14303e0() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: f0 */
    public final String m14304f0() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: g0 */
    public final String m14305g0() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: h0 */
    public final String m14306h0() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m14307i0() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m14308j0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2346t();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2346t> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2346t.class) {
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

    /* JADX INFO: renamed from: k0 */
    public final boolean m14309k0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m14310l0() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m14311m0() {
        return (this.zze & 128) != 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m14312n0() {
        return (this.zze & 64) != 0;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m14313o0() {
        return (this.zze & 32) != 0;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m14314p0() {
        return (this.zze & 16) != 0;
    }
}
