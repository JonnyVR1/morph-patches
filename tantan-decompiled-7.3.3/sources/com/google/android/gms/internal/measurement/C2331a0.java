package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2331a0 extends AbstractC2372u0<C2331a0, a> implements v9y0 {
    private static final C2331a0 zzc;
    private static volatile yay0<C2331a0> zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private i4y0<C2331a0> zzk = AbstractC2372u0.m14406x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0$a */
    public static final class a extends AbstractC2372u0.b<C2331a0, a> implements v9y0 {
        public a() {
            super(C2331a0.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m13849A(String str) {
            m14432r();
            C2331a0.m13828K((C2331a0) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m13850B() {
            m14432r();
            C2331a0.m13823C((C2331a0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m13851C(String str) {
            m14432r();
            C2331a0.m13830N((C2331a0) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public final a m13852D() {
            m14432r();
            C2331a0.m13829M((C2331a0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public final a m13853E() {
            m14432r();
            C2331a0.m13831U((C2331a0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public final a m13854G() {
            m14432r();
            C2331a0.m13832W((C2331a0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public final String m13855K() {
            return ((C2331a0) this.f10299b).m13839Z();
        }

        /* JADX INFO: renamed from: L */
        public final String m13856L() {
            return ((C2331a0) this.f10299b).m13840a0();
        }

        /* JADX INFO: renamed from: v */
        public final int m13857v() {
            return ((C2331a0) this.f10299b).m13837T();
        }

        /* JADX INFO: renamed from: w */
        public final a m13858w(double d) {
            m14432r();
            C2331a0.m13824D((C2331a0) this.f10299b, d);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m13859x(long j) {
            m14432r();
            C2331a0.m13825E((C2331a0) this.f10299b, j);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m13860y(a aVar) {
            m14432r();
            C2331a0.m13826G((C2331a0) this.f10299b, (C2331a0) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m13861z(Iterable<? extends C2331a0> iterable) {
            m14432r();
            C2331a0.m13827I((C2331a0) this.f10299b, iterable);
            return this;
        }
    }

    static {
        C2331a0 c2331a0 = new C2331a0();
        zzc = c2331a0;
        AbstractC2372u0.m14402p(C2331a0.class, c2331a0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13823C(C2331a0 c2331a0) {
        c2331a0.zze &= -17;
        c2331a0.zzj = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m13824D(C2331a0 c2331a0, double d) {
        c2331a0.zze |= 16;
        c2331a0.zzj = d;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m13825E(C2331a0 c2331a0, long j) {
        c2331a0.zze |= 4;
        c2331a0.zzh = j;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m13826G(C2331a0 c2331a0, C2331a0 c2331a1) {
        c2331a1.getClass();
        c2331a0.m13847h0();
        c2331a0.zzk.add(c2331a1);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m13827I(C2331a0 c2331a0, Iterable iterable) {
        c2331a0.m13847h0();
        AbstractC2360o0.m14303d(iterable, c2331a0.zzk);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m13828K(C2331a0 c2331a0, String str) {
        str.getClass();
        c2331a0.zze |= 1;
        c2331a0.zzf = str;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m13829M(C2331a0 c2331a0) {
        c2331a0.zze &= -5;
        c2331a0.zzh = 0L;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13830N(C2331a0 c2331a0, String str) {
        str.getClass();
        c2331a0.zze |= 2;
        c2331a0.zzg = str;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13831U(C2331a0 c2331a0) {
        c2331a0.zzk = AbstractC2372u0.m14406x();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13832W(C2331a0 c2331a0) {
        c2331a0.zze &= -3;
        c2331a0.zzg = zzc.zzg;
    }

    /* JADX INFO: renamed from: X */
    public static a m13833X() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: B */
    public final double m13835B() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: L */
    public final float m13836L() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: T */
    public final int m13837T() {
        return this.zzk.size();
    }

    /* JADX INFO: renamed from: V */
    public final long m13838V() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Z */
    public final String m13839Z() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m13840a0() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: b0 */
    public final List<C2331a0> m13841b0() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m13842c0() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m13843d0() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m13844e0() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m13845f0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m13846g0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m13847h0() {
        i4y0<C2331a0> i4y0Var = this.zzk;
        if (i4y0Var.zzc()) {
            return;
        }
        this.zzk = AbstractC2372u0.m14401o(i4y0Var);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2331a0();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C2331a0.class});
            case 4:
                return zzc;
            case 5:
                yay0<C2331a0> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2331a0.class) {
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
