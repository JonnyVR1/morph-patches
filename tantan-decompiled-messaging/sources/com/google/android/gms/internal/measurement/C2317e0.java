package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;
import p149l.vtx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2317e0 extends AbstractC2349u0<C2317e0, a> implements p0y0 {
    private static final C2317e0 zzc;
    private static volatile s1y0<C2317e0> zzd;
    private int zze;
    private int zzf;
    private vtx0 zzg = AbstractC2349u0.m14351w();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0$a */
    public static final class a extends AbstractC2349u0.b<C2317e0, a> implements p0y0 {
        public a() {
            super(C2317e0.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14150v(int i) {
            m14378r();
            C2317e0.m14141C((C2317e0) this.f10262b, i);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14151w(Iterable<? extends Long> iterable) {
            m14378r();
            C2317e0.m14142D((C2317e0) this.f10262b, iterable);
            return this;
        }
    }

    static {
        C2317e0 c2317e0 = new C2317e0();
        zzc = c2317e0;
        AbstractC2349u0.m14348p(C2317e0.class, c2317e0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14141C(C2317e0 c2317e0, int i) {
        c2317e0.zze |= 1;
        c2317e0.zzf = i;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14142D(C2317e0 c2317e0, Iterable iterable) {
        vtx0 vtx0Var = c2317e0.zzg;
        if (!vtx0Var.zzc()) {
            c2317e0.zzg = AbstractC2349u0.m14346n(vtx0Var);
        }
        AbstractC2337o0.m14249d(iterable, c2317e0.zzg);
    }

    /* JADX INFO: renamed from: G */
    public static a m14143G() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: B */
    public final long m14145B(int i) {
        return this.zzg.mo200056e(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m14146E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: K */
    public final List<Long> m14147K() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14148L() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14149h() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2317e0();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2317e0> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2317e0.class) {
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
