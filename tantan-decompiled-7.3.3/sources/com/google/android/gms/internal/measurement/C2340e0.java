package com.google.android.gms.internal.measurement;

import java.util.List;
import p153l.b3y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2340e0 extends AbstractC2372u0<C2340e0, a> implements v9y0 {
    private static final C2340e0 zzc;
    private static volatile yay0<C2340e0> zzd;
    private int zze;
    private int zzf;
    private b3y0 zzg = AbstractC2372u0.m14405w();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0$a */
    public static final class a extends AbstractC2372u0.b<C2340e0, a> implements v9y0 {
        public a() {
            super(C2340e0.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14204v(int i) {
            m14432r();
            C2340e0.m14195C((C2340e0) this.f10299b, i);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14205w(Iterable<? extends Long> iterable) {
            m14432r();
            C2340e0.m14196D((C2340e0) this.f10299b, iterable);
            return this;
        }
    }

    static {
        C2340e0 c2340e0 = new C2340e0();
        zzc = c2340e0;
        AbstractC2372u0.m14402p(C2340e0.class, c2340e0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14195C(C2340e0 c2340e0, int i) {
        c2340e0.zze |= 1;
        c2340e0.zzf = i;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14196D(C2340e0 c2340e0, Iterable iterable) {
        b3y0 b3y0Var = c2340e0.zzg;
        if (!b3y0Var.zzc()) {
            c2340e0.zzg = AbstractC2372u0.m14400n(b3y0Var);
        }
        AbstractC2360o0.m14303d(iterable, c2340e0.zzg);
    }

    /* JADX INFO: renamed from: G */
    public static a m14197G() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: B */
    public final long m14199B(int i) {
        return this.zzg.mo102379e(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m14200E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: K */
    public final List<Long> m14201K() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14202L() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14203h() {
        return this.zzg.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2340e0();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                yay0<C2340e0> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2340e0.class) {
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
