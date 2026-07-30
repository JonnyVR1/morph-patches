package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2311b0 extends AbstractC2349u0<C2311b0, a> implements p0y0 {
    private static final C2311b0 zzc;
    private static volatile s1y0<C2311b0> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C2348u zzh;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0$a */
    public static final class a extends AbstractC2349u0.b<C2311b0, a> implements p0y0 {
        public a() {
            super(C2311b0.zzc);
        }
    }

    static {
        C2311b0 c2311b0 = new C2311b0();
        zzc = c2311b0;
        AbstractC2349u0.m14348p(C2311b0.class, c2311b0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2311b0();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2311b0> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2311b0.class) {
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
