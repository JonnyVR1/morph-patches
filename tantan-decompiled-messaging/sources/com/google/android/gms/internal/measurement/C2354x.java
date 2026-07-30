package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2354x extends AbstractC2349u0<C2354x, a> implements p0y0 {
    private static final C2354x zzc;
    private static volatile s1y0<C2354x> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x$a */
    public static final class a extends AbstractC2349u0.b<C2354x, a> implements p0y0 {
        public a() {
            super(C2354x.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14483v(int i) {
            m14378r();
            C2354x.m14475B((C2354x) this.f10262b, i);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14484w(long j) {
            m14378r();
            C2354x.m14476C((C2354x) this.f10262b, j);
            return this;
        }
    }

    static {
        C2354x c2354x = new C2354x();
        zzc = c2354x;
        AbstractC2349u0.m14348p(C2354x.class, c2354x);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14475B(C2354x c2354x, int i) {
        c2354x.zze |= 1;
        c2354x.zzf = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14476C(C2354x c2354x, long j) {
        c2354x.zze |= 2;
        c2354x.zzg = j;
    }

    /* JADX INFO: renamed from: E */
    public static a m14477E() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: D */
    public final long m14479D() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14480I() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14481K() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14482h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2354x();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2354x> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2354x.class) {
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
