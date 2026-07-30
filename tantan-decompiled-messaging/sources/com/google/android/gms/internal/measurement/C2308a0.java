package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2308a0 extends AbstractC2349u0<C2308a0, a> implements p0y0 {
    private static final C2308a0 zzc;
    private static volatile s1y0<C2308a0> zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private cvx0<C2308a0> zzk = AbstractC2349u0.m14352x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a0$a */
    public static final class a extends AbstractC2349u0.b<C2308a0, a> implements p0y0 {
        public a() {
            super(C2308a0.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m13795A(String str) {
            m14378r();
            C2308a0.m13774K((C2308a0) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m13796B() {
            m14378r();
            C2308a0.m13769C((C2308a0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m13797C(String str) {
            m14378r();
            C2308a0.m13776N((C2308a0) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public final a m13798D() {
            m14378r();
            C2308a0.m13775M((C2308a0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public final a m13799E() {
            m14378r();
            C2308a0.m13777U((C2308a0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: G */
        public final a m13800G() {
            m14378r();
            C2308a0.m13778W((C2308a0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public final String m13801K() {
            return ((C2308a0) this.f10262b).m13785Z();
        }

        /* JADX INFO: renamed from: L */
        public final String m13802L() {
            return ((C2308a0) this.f10262b).m13786a0();
        }

        /* JADX INFO: renamed from: v */
        public final int m13803v() {
            return ((C2308a0) this.f10262b).m13783T();
        }

        /* JADX INFO: renamed from: w */
        public final a m13804w(double d) {
            m14378r();
            C2308a0.m13770D((C2308a0) this.f10262b, d);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m13805x(long j) {
            m14378r();
            C2308a0.m13771E((C2308a0) this.f10262b, j);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m13806y(a aVar) {
            m14378r();
            C2308a0.m13772G((C2308a0) this.f10262b, (C2308a0) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m13807z(Iterable<? extends C2308a0> iterable) {
            m14378r();
            C2308a0.m13773I((C2308a0) this.f10262b, iterable);
            return this;
        }
    }

    static {
        C2308a0 c2308a0 = new C2308a0();
        zzc = c2308a0;
        AbstractC2349u0.m14348p(C2308a0.class, c2308a0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13769C(C2308a0 c2308a0) {
        c2308a0.zze &= -17;
        c2308a0.zzj = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m13770D(C2308a0 c2308a0, double d) {
        c2308a0.zze |= 16;
        c2308a0.zzj = d;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m13771E(C2308a0 c2308a0, long j) {
        c2308a0.zze |= 4;
        c2308a0.zzh = j;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m13772G(C2308a0 c2308a0, C2308a0 c2308a1) {
        c2308a1.getClass();
        c2308a0.m13793h0();
        c2308a0.zzk.add(c2308a1);
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m13773I(C2308a0 c2308a0, Iterable iterable) {
        c2308a0.m13793h0();
        AbstractC2337o0.m14249d(iterable, c2308a0.zzk);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m13774K(C2308a0 c2308a0, String str) {
        str.getClass();
        c2308a0.zze |= 1;
        c2308a0.zzf = str;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m13775M(C2308a0 c2308a0) {
        c2308a0.zze &= -5;
        c2308a0.zzh = 0L;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13776N(C2308a0 c2308a0, String str) {
        str.getClass();
        c2308a0.zze |= 2;
        c2308a0.zzg = str;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m13777U(C2308a0 c2308a0) {
        c2308a0.zzk = AbstractC2349u0.m14352x();
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m13778W(C2308a0 c2308a0) {
        c2308a0.zze &= -3;
        c2308a0.zzg = zzc.zzg;
    }

    /* JADX INFO: renamed from: X */
    public static a m13779X() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: B */
    public final double m13781B() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: L */
    public final float m13782L() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: T */
    public final int m13783T() {
        return this.zzk.size();
    }

    /* JADX INFO: renamed from: V */
    public final long m13784V() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Z */
    public final String m13785Z() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m13786a0() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: b0 */
    public final List<C2308a0> m13787b0() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m13788c0() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m13789d0() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m13790e0() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m13791f0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m13792g0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m13793h0() {
        cvx0<C2308a0> cvx0Var = this.zzk;
        if (cvx0Var.zzc()) {
            return;
        }
        this.zzk = AbstractC2349u0.m14347o(cvx0Var);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2308a0();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C2308a0.class});
            case 4:
                return zzc;
            case 5:
                s1y0<C2308a0> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2308a0.class) {
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
