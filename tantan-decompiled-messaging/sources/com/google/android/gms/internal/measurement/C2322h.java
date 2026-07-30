package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2322h extends AbstractC2349u0<C2322h, a> implements p0y0 {
    private static final C2322h zzc;
    private static volatile s1y0<C2322h> zzd;
    private int zze;
    private String zzf = "";
    private cvx0<C2332m> zzg = AbstractC2349u0.m14352x();
    private boolean zzh;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h$a */
    public static final class a extends AbstractC2349u0.b<C2322h, a> implements p0y0 {
        public a() {
            super(C2322h.zzc);
        }
    }

    static {
        C2322h c2322h = new C2322h();
        zzc = c2322h;
        AbstractC2349u0.m14348p(C2322h.class, c2322h);
    }

    /* JADX INFO: renamed from: C */
    public final String m14182C() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2338p.f10249a[i - 1];
        switch (i2) {
            case 1:
                return new C2322h();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C2332m.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2322h> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2322h.class) {
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
