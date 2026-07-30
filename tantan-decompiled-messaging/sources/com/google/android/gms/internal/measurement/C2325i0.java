package com.google.android.gms.internal.measurement;

import java.util.List;
import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2325i0 extends AbstractC2349u0<C2325i0, a> implements p0y0 {
    private static final C2325i0 zzc;
    private static volatile s1y0<C2325i0> zzd;
    private cvx0<C2327j0> zze = AbstractC2349u0.m14352x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i0$a */
    public static final class a extends AbstractC2349u0.b<C2325i0, a> implements p0y0 {
        public a() {
            super(C2325i0.zzc);
        }
    }

    static {
        C2325i0 c2325i0 = new C2325i0();
        zzc = c2325i0;
        AbstractC2349u0.m14348p(C2325i0.class, c2325i0);
    }

    /* JADX INFO: renamed from: C */
    public static C2325i0 m14201C() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final List<C2327j0> m14202D() {
        return this.zze;
    }

    /* JADX INFO: renamed from: h */
    public final int m14203h() {
        return this.zze.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2331l0.f10246a[i - 1];
        switch (i2) {
            case 1:
                return new C2325i0();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C2327j0.class});
            case 4:
                return zzc;
            case 5:
                s1y0<C2325i0> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2325i0.class) {
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
