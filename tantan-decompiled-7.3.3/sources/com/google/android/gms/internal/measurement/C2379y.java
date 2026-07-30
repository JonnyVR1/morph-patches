package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C2379y extends AbstractC2372u0<C2379y, a> implements v9y0 {
    private static final C2379y zzc;
    private static volatile yay0<C2379y> zzd;
    private int zze;
    private i4y0<C2331a0> zzf = AbstractC2372u0.m14406x();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y$a */
    public static final class a extends AbstractC2372u0.b<C2379y, a> implements v9y0 {
        public a() {
            super(C2379y.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14561A(C2331a0.a aVar) {
            m14432r();
            C2379y.m14544I((C2379y) this.f10299b, (C2331a0) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14562B(C2331a0 c2331a0) {
            m14432r();
            C2379y.m14544I((C2379y) this.f10299b, c2331a0);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14563C(Iterable<? extends C2331a0> iterable) {
            m14432r();
            C2379y.m14545K((C2379y) this.f10299b, iterable);
            return this;
        }

        /* JADX INFO: renamed from: D */
        public final a m14564D(String str) {
            m14432r();
            C2379y.m14546L((C2379y) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: E */
        public final long m14565E() {
            return ((C2379y) this.f10299b).m14552T();
        }

        /* JADX INFO: renamed from: G */
        public final a m14566G(long j) {
            m14432r();
            C2379y.m14547N((C2379y) this.f10299b, j);
            return this;
        }

        /* JADX INFO: renamed from: K */
        public final C2331a0 m14567K(int i) {
            return ((C2379y) this.f10299b).m14550B(i);
        }

        /* JADX INFO: renamed from: L */
        public final long m14568L() {
            return ((C2379y) this.f10299b).m14553U();
        }

        /* JADX INFO: renamed from: M */
        public final a m14569M() {
            m14432r();
            C2379y.m14540C((C2379y) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: N */
        public final String m14570N() {
            return ((C2379y) this.f10299b).m14554X();
        }

        /* JADX INFO: renamed from: T */
        public final List<C2331a0> m14571T() {
            return Collections.unmodifiableList(((C2379y) this.f10299b).m14555Y());
        }

        /* JADX INFO: renamed from: U */
        public final boolean m14572U() {
            return ((C2379y) this.f10299b).m14558b0();
        }

        /* JADX INFO: renamed from: v */
        public final int m14573v() {
            return ((C2379y) this.f10299b).m14551M();
        }

        /* JADX INFO: renamed from: w */
        public final a m14574w(int i) {
            m14432r();
            C2379y.m14541D((C2379y) this.f10299b, i);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14575x(int i, C2331a0.a aVar) {
            m14432r();
            C2379y.m14542E((C2379y) this.f10299b, i, (C2331a0) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14576y(int i, C2331a0 c2331a0) {
            m14432r();
            C2379y.m14542E((C2379y) this.f10299b, i, c2331a0);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14577z(long j) {
            m14432r();
            C2379y.m14543G((C2379y) this.f10299b, j);
            return this;
        }
    }

    static {
        C2379y c2379y = new C2379y();
        zzc = c2379y;
        AbstractC2372u0.m14402p(C2379y.class, c2379y);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14540C(C2379y c2379y) {
        c2379y.zzf = AbstractC2372u0.m14406x();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14541D(C2379y c2379y, int i) {
        c2379y.m14559c0();
        c2379y.zzf.remove(i);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14542E(C2379y c2379y, int i, C2331a0 c2331a0) {
        c2331a0.getClass();
        c2379y.m14559c0();
        c2379y.zzf.set(i, c2331a0);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14543G(C2379y c2379y, long j) {
        c2379y.zze |= 4;
        c2379y.zzi = j;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14544I(C2379y c2379y, C2331a0 c2331a0) {
        c2331a0.getClass();
        c2379y.m14559c0();
        c2379y.zzf.add(c2331a0);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14545K(C2379y c2379y, Iterable iterable) {
        c2379y.m14559c0();
        AbstractC2360o0.m14303d(iterable, c2379y.zzf);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14546L(C2379y c2379y, String str) {
        str.getClass();
        c2379y.zze |= 1;
        c2379y.zzg = str;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m14547N(C2379y c2379y, long j) {
        c2379y.zze |= 2;
        c2379y.zzh = j;
    }

    /* JADX INFO: renamed from: V */
    public static a m14548V() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: B */
    public final C2331a0 m14550B(int i) {
        return this.zzf.get(i);
    }

    /* JADX INFO: renamed from: M */
    public final int m14551M() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: T */
    public final long m14552T() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: U */
    public final long m14553U() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: X */
    public final String m14554X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final List<C2331a0> m14555Y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14556Z() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m14557a0() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m14558b0() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m14559c0() {
        i4y0<C2331a0> i4y0Var = this.zzf;
        if (i4y0Var.zzc()) {
            return;
        }
        this.zzf = AbstractC2372u0.m14401o(i4y0Var);
    }

    /* JADX INFO: renamed from: h */
    public final int m14560h() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2379y();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C2331a0.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                yay0<C2379y> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2379y.class) {
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
