package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;
import p149l.vtx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2315d0 extends AbstractC2349u0<C2315d0, a> implements p0y0 {
    private static final C2315d0 zzc;
    private static volatile s1y0<C2315d0> zzd;
    private vtx0 zze = AbstractC2349u0.m14351w();
    private vtx0 zzf = AbstractC2349u0.m14351w();
    private cvx0<C2354x> zzg = AbstractC2349u0.m14352x();
    private cvx0<C2317e0> zzh = AbstractC2349u0.m14352x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0$a */
    public static final class a extends AbstractC2349u0.b<C2315d0, a> implements p0y0 {
        public a() {
            super(C2315d0.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14121A(Iterable<? extends C2317e0> iterable) {
            m14378r();
            C2315d0.m14107L((C2315d0) this.f10262b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14122B() {
            m14378r();
            C2315d0.m14108N((C2315d0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14123C(Iterable<? extends Long> iterable) {
            m14378r();
            C2315d0.m14109T((C2315d0) this.f10262b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final a m14124v() {
            m14378r();
            C2315d0.m14102B((C2315d0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14125w(Iterable<? extends C2354x> iterable) {
            m14378r();
            C2315d0.m14103C((C2315d0) this.f10262b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14126x() {
            m14378r();
            C2315d0.m14104E((C2315d0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14127y(Iterable<? extends Long> iterable) {
            m14378r();
            C2315d0.m14105G((C2315d0) this.f10262b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14128z() {
            m14378r();
            C2315d0.m14106K((C2315d0) this.f10262b);
            return this;
        }
    }

    static {
        C2315d0 c2315d0 = new C2315d0();
        zzc = c2315d0;
        AbstractC2349u0.m14348p(C2315d0.class, c2315d0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14102B(C2315d0 c2315d0) {
        c2315d0.zzg = AbstractC2349u0.m14352x();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14103C(C2315d0 c2315d0, Iterable iterable) {
        cvx0<C2354x> cvx0Var = c2315d0.zzg;
        if (!cvx0Var.zzc()) {
            c2315d0.zzg = AbstractC2349u0.m14347o(cvx0Var);
        }
        AbstractC2337o0.m14249d(iterable, c2315d0.zzg);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14104E(C2315d0 c2315d0) {
        c2315d0.zzf = AbstractC2349u0.m14351w();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14105G(C2315d0 c2315d0, Iterable iterable) {
        vtx0 vtx0Var = c2315d0.zzf;
        if (!vtx0Var.zzc()) {
            c2315d0.zzf = AbstractC2349u0.m14346n(vtx0Var);
        }
        AbstractC2337o0.m14249d(iterable, c2315d0.zzf);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14106K(C2315d0 c2315d0) {
        c2315d0.zzh = AbstractC2349u0.m14352x();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14107L(C2315d0 c2315d0, Iterable iterable) {
        cvx0<C2317e0> cvx0Var = c2315d0.zzh;
        if (!cvx0Var.zzc()) {
            c2315d0.zzh = AbstractC2349u0.m14347o(cvx0Var);
        }
        AbstractC2337o0.m14249d(iterable, c2315d0.zzh);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m14108N(C2315d0 c2315d0) {
        c2315d0.zze = AbstractC2349u0.m14351w();
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14109T(C2315d0 c2315d0, Iterable iterable) {
        vtx0 vtx0Var = c2315d0.zze;
        if (!vtx0Var.zzc()) {
            c2315d0.zze = AbstractC2349u0.m14346n(vtx0Var);
        }
        AbstractC2337o0.m14249d(iterable, c2315d0.zze);
    }

    /* JADX INFO: renamed from: U */
    public static a m14110U() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: W */
    public static C2315d0 m14112W() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final int m14113D() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: I */
    public final int m14114I() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: M */
    public final int m14115M() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: X */
    public final List<C2354x> m14116X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final List<Long> m14117Y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Z */
    public final List<C2317e0> m14118Z() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: a0 */
    public final List<Long> m14119a0() {
        return this.zze;
    }

    /* JADX INFO: renamed from: h */
    public final int m14120h() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2315d0();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C2354x.class, "zzh", C2317e0.class});
            case 4:
                return zzc;
            case 5:
                s1y0<C2315d0> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2315d0.class) {
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
}
