package com.google.android.gms.internal.measurement;

import java.util.List;
import p153l.b3y0;
import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2338d0 extends AbstractC2372u0<C2338d0, a> implements v9y0 {
    private static final C2338d0 zzc;
    private static volatile yay0<C2338d0> zzd;
    private b3y0 zze = AbstractC2372u0.m14405w();
    private b3y0 zzf = AbstractC2372u0.m14405w();
    private i4y0<C2377x> zzg = AbstractC2372u0.m14406x();
    private i4y0<C2340e0> zzh = AbstractC2372u0.m14406x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d0$a */
    public static final class a extends AbstractC2372u0.b<C2338d0, a> implements v9y0 {
        public a() {
            super(C2338d0.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14175A(Iterable<? extends C2340e0> iterable) {
            m14432r();
            C2338d0.m14161L((C2338d0) this.f10299b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14176B() {
            m14432r();
            C2338d0.m14162N((C2338d0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14177C(Iterable<? extends Long> iterable) {
            m14432r();
            C2338d0.m14163T((C2338d0) this.f10299b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final a m14178v() {
            m14432r();
            C2338d0.m14156B((C2338d0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14179w(Iterable<? extends C2377x> iterable) {
            m14432r();
            C2338d0.m14157C((C2338d0) this.f10299b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14180x() {
            m14432r();
            C2338d0.m14158E((C2338d0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14181y(Iterable<? extends Long> iterable) {
            m14432r();
            C2338d0.m14159G((C2338d0) this.f10299b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14182z() {
            m14432r();
            C2338d0.m14160K((C2338d0) this.f10299b);
            return this;
        }
    }

    static {
        C2338d0 c2338d0 = new C2338d0();
        zzc = c2338d0;
        AbstractC2372u0.m14402p(C2338d0.class, c2338d0);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14156B(C2338d0 c2338d0) {
        c2338d0.zzg = AbstractC2372u0.m14406x();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14157C(C2338d0 c2338d0, Iterable iterable) {
        i4y0<C2377x> i4y0Var = c2338d0.zzg;
        if (!i4y0Var.zzc()) {
            c2338d0.zzg = AbstractC2372u0.m14401o(i4y0Var);
        }
        AbstractC2360o0.m14303d(iterable, c2338d0.zzg);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14158E(C2338d0 c2338d0) {
        c2338d0.zzf = AbstractC2372u0.m14405w();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14159G(C2338d0 c2338d0, Iterable iterable) {
        b3y0 b3y0Var = c2338d0.zzf;
        if (!b3y0Var.zzc()) {
            c2338d0.zzf = AbstractC2372u0.m14400n(b3y0Var);
        }
        AbstractC2360o0.m14303d(iterable, c2338d0.zzf);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14160K(C2338d0 c2338d0) {
        c2338d0.zzh = AbstractC2372u0.m14406x();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14161L(C2338d0 c2338d0, Iterable iterable) {
        i4y0<C2340e0> i4y0Var = c2338d0.zzh;
        if (!i4y0Var.zzc()) {
            c2338d0.zzh = AbstractC2372u0.m14401o(i4y0Var);
        }
        AbstractC2360o0.m14303d(iterable, c2338d0.zzh);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m14162N(C2338d0 c2338d0) {
        c2338d0.zze = AbstractC2372u0.m14405w();
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14163T(C2338d0 c2338d0, Iterable iterable) {
        b3y0 b3y0Var = c2338d0.zze;
        if (!b3y0Var.zzc()) {
            c2338d0.zze = AbstractC2372u0.m14400n(b3y0Var);
        }
        AbstractC2360o0.m14303d(iterable, c2338d0.zze);
    }

    /* JADX INFO: renamed from: U */
    public static a m14164U() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: W */
    public static C2338d0 m14166W() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final int m14167D() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: I */
    public final int m14168I() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: M */
    public final int m14169M() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: X */
    public final List<C2377x> m14170X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final List<Long> m14171Y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Z */
    public final List<C2340e0> m14172Z() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: a0 */
    public final List<Long> m14173a0() {
        return this.zze;
    }

    /* JADX INFO: renamed from: h */
    public final int m14174h() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2338d0();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C2377x.class, "zzh", C2340e0.class});
            case 4:
                return zzc;
            case 5:
                yay0<C2338d0> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2338d0.class) {
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
}
