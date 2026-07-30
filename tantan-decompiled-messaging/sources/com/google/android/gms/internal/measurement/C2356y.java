package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C2356y extends AbstractC2349u0<C2356y, a> implements p0y0 {
    private static final C2356y zzc;
    private static volatile s1y0<C2356y> zzd;
    private int zze;
    private cvx0<C2308a0> zzf = AbstractC2349u0.m14352x();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y$a */
    public static final class a extends AbstractC2349u0.b<C2356y, a> implements p0y0 {
        public a() {
            super(C2356y.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14507A(C2308a0.a aVar) {
            m14378r();
            C2356y.m14490I((C2356y) this.f10262b, (C2308a0) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14508B(C2308a0 c2308a0) {
            m14378r();
            C2356y.m14490I((C2356y) this.f10262b, c2308a0);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14509C(Iterable<? extends C2308a0> iterable) {
            m14378r();
            C2356y.m14491K((C2356y) this.f10262b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public final a m14510D(String str) {
            m14378r();
            C2356y.m14492L((C2356y) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public final long m14511E() {
            return ((C2356y) this.f10262b).m14498T();
        }

        /* JADX INFO: renamed from: G */
        public final a m14512G(long j) {
            m14378r();
            C2356y.m14493N((C2356y) this.f10262b, j);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public final C2308a0 m14513K(int i) {
            return ((C2356y) this.f10262b).m14496B(i);
        }

        /* JADX INFO: renamed from: L */
        public final long m14514L() {
            return ((C2356y) this.f10262b).m14499U();
        }

        /* JADX INFO: renamed from: M */
        public final a m14515M() {
            m14378r();
            C2356y.m14486C((C2356y) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public final String m14516N() {
            return ((C2356y) this.f10262b).m14500X();
        }

        /* JADX INFO: renamed from: T */
        public final List<C2308a0> m14517T() {
            return Collections.unmodifiableList(((C2356y) this.f10262b).m14501Y());
        }

        /* JADX INFO: renamed from: U */
        public final boolean m14518U() {
            return ((C2356y) this.f10262b).m14504b0();
        }

        /* JADX INFO: renamed from: v */
        public final int m14519v() {
            return ((C2356y) this.f10262b).m14497M();
        }

        /* JADX INFO: renamed from: w */
        public final a m14520w(int i) {
            m14378r();
            C2356y.m14487D((C2356y) this.f10262b, i);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14521x(int i, C2308a0.a aVar) {
            m14378r();
            C2356y.m14488E((C2356y) this.f10262b, i, (C2308a0) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14522y(int i, C2308a0 c2308a0) {
            m14378r();
            C2356y.m14488E((C2356y) this.f10262b, i, c2308a0);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14523z(long j) {
            m14378r();
            C2356y.m14489G((C2356y) this.f10262b, j);
            return this;
        }
    }

    static {
        C2356y c2356y = new C2356y();
        zzc = c2356y;
        AbstractC2349u0.m14348p(C2356y.class, c2356y);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14486C(C2356y c2356y) {
        c2356y.zzf = AbstractC2349u0.m14352x();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14487D(C2356y c2356y, int i) {
        c2356y.m14505c0();
        c2356y.zzf.remove(i);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14488E(C2356y c2356y, int i, C2308a0 c2308a0) {
        c2308a0.getClass();
        c2356y.m14505c0();
        c2356y.zzf.set(i, c2308a0);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14489G(C2356y c2356y, long j) {
        c2356y.zze |= 4;
        c2356y.zzi = j;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14490I(C2356y c2356y, C2308a0 c2308a0) {
        c2308a0.getClass();
        c2356y.m14505c0();
        c2356y.zzf.add(c2308a0);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14491K(C2356y c2356y, Iterable iterable) {
        c2356y.m14505c0();
        AbstractC2337o0.m14249d(iterable, c2356y.zzf);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14492L(C2356y c2356y, String str) {
        str.getClass();
        c2356y.zze |= 1;
        c2356y.zzg = str;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m14493N(C2356y c2356y, long j) {
        c2356y.zze |= 2;
        c2356y.zzh = j;
    }

    /* JADX INFO: renamed from: V */
    public static a m14494V() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: B */
    public final C2308a0 m14496B(int i) {
        return this.zzf.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final int m14497M() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: T */
    public final long m14498T() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: U */
    public final long m14499U() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: X */
    public final String m14500X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final List<C2308a0> m14501Y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14502Z() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m14503a0() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m14504b0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m14505c0() {
        cvx0<C2308a0> cvx0Var = this.zzf;
        if (cvx0Var.zzc()) {
            return;
        }
        this.zzf = AbstractC2349u0.m14347o(cvx0Var);
    }

    /* JADX INFO: renamed from: h */
    public final int m14506h() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2356y();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C2308a0.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2356y> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2356y.class) {
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
