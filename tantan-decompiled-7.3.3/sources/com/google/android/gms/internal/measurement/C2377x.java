package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2377x extends AbstractC2372u0<C2377x, a> implements v9y0 {
    private static final C2377x zzc;
    private static volatile yay0<C2377x> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x$a */
    public static final class a extends AbstractC2372u0.b<C2377x, a> implements v9y0 {
        public a() {
            super(C2377x.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14537v(int i) {
            m14432r();
            C2377x.m14529B((C2377x) this.f10299b, i);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14538w(long j) {
            m14432r();
            C2377x.m14530C((C2377x) this.f10299b, j);
            return this;
        }
    }

    static {
        C2377x c2377x = new C2377x();
        zzc = c2377x;
        AbstractC2372u0.m14402p(C2377x.class, c2377x);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14529B(C2377x c2377x, int i) {
        c2377x.zze |= 1;
        c2377x.zzf = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14530C(C2377x c2377x, long j) {
        c2377x.zze |= 2;
        c2377x.zzg = j;
    }

    /* JADX INFO: renamed from: E */
    public static a m14531E() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: D */
    public final long m14533D() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14534I() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14535K() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14536h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2377x();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                yay0<C2377x> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2377x.class) {
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
