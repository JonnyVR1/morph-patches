package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C2369t extends AbstractC2372u0<C2369t, a> implements v9y0 {
    private static final C2369t zzc;
    private static volatile yay0<C2369t> zzd;
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
    public static final class a extends AbstractC2372u0.b<C2369t, a> implements v9y0 {
        public a() {
            super(C2369t.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14369A(String str) {
            m14432r();
            C2369t.m14341L((C2369t) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14370B() {
            m14432r();
            C2369t.m14336C((C2369t) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14371C(String str) {
            m14432r();
            C2369t.m14344T((C2369t) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public final a m14372D() {
            m14432r();
            C2369t.m14339I((C2369t) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public final a m14373E(String str) {
            m14432r();
            C2369t.m14347W((C2369t) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public final a m14374G() {
            m14432r();
            C2369t.m14343N((C2369t) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public final a m14375K(String str) {
            m14432r();
            C2369t.m14350Z((C2369t) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: L */
        public final a m14376L() {
            m14432r();
            C2369t.m14346V((C2369t) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: M */
        public final a m14377M(String str) {
            m14432r();
            C2369t.m14352c0((C2369t) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public final a m14378N() {
            m14432r();
            C2369t.m14349Y((C2369t) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: T */
        public final a m14379T() {
            m14432r();
            C2369t.m14351b0((C2369t) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final long m14380v() {
            return ((C2369t) this.f10299b).m14353B();
        }

        /* JADX INFO: renamed from: w */
        public final a m14381w(long j) {
            m14432r();
            C2369t.m14337D((C2369t) this.f10299b, j);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14382x(String str) {
            m14432r();
            C2369t.m14338E((C2369t) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final long m14383y() {
            return ((C2369t) this.f10299b).m14354G();
        }

        /* JADX INFO: renamed from: z */
        public final a m14384z(long j) {
            m14432r();
            C2369t.m14340K((C2369t) this.f10299b, j);
            return this;
        }
    }

    static {
        C2369t c2369t = new C2369t();
        zzc = c2369t;
        AbstractC2372u0.m14402p(C2369t.class, c2369t);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14336C(C2369t c2369t) {
        c2369t.zze &= -5;
        c2369t.zzh = zzc.zzh;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14337D(C2369t c2369t, long j) {
        c2369t.zze |= 8;
        c2369t.zzi = j;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14338E(C2369t c2369t, String str) {
        str.getClass();
        c2369t.zze |= 4;
        c2369t.zzh = str;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14339I(C2369t c2369t) {
        c2369t.zze &= -3;
        c2369t.zzg = zzc.zzg;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14340K(C2369t c2369t, long j) {
        c2369t.zze |= 128;
        c2369t.zzm = j;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14341L(C2369t c2369t, String str) {
        str.getClass();
        c2369t.zze |= 2;
        c2369t.zzg = str;
    }

    /* JADX INFO: renamed from: M */
    public static a m14342M() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m14343N(C2369t c2369t) {
        c2369t.zze &= -2;
        c2369t.zzf = zzc.zzf;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14344T(C2369t c2369t, String str) {
        str.getClass();
        c2369t.zze |= 1;
        c2369t.zzf = str;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m14346V(C2369t c2369t) {
        c2369t.zze &= -65;
        c2369t.zzl = zzc.zzl;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m14347W(C2369t c2369t, String str) {
        str.getClass();
        c2369t.zze |= 64;
        c2369t.zzl = str;
    }

    /* JADX INFO: renamed from: X */
    public static C2369t m14348X() {
        return zzc;
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m14349Y(C2369t c2369t) {
        c2369t.zze &= -33;
        c2369t.zzk = zzc.zzk;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m14350Z(C2369t c2369t, String str) {
        str.getClass();
        c2369t.zze |= 32;
        c2369t.zzk = str;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m14351b0(C2369t c2369t) {
        c2369t.zze &= -17;
        c2369t.zzj = zzc.zzj;
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m14352c0(C2369t c2369t, String str) {
        str.getClass();
        c2369t.zze |= 16;
        c2369t.zzj = str;
    }

    /* JADX INFO: renamed from: B */
    public final long m14353B() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: G */
    public final long m14354G() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m14355a0() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: d0 */
    public final String m14356d0() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m14357e0() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: f0 */
    public final String m14358f0() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: g0 */
    public final String m14359g0() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: h0 */
    public final String m14360h0() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m14361i0() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: j0 */
    public final boolean m14362j0() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2369t();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                yay0<C2369t> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2369t.class) {
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

    /* JADX INFO: renamed from: k0 */
    public final boolean m14363k0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m14364l0() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: m0 */
    public final boolean m14365m0() {
        return (this.zze & 128) != 0;
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m14366n0() {
        return (this.zze & 64) != 0;
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m14367o0() {
        return (this.zze & 32) != 0;
    }

    /* JADX INFO: renamed from: p0 */
    public final boolean m14368p0() {
        return (this.zze & 16) != 0;
    }
}
