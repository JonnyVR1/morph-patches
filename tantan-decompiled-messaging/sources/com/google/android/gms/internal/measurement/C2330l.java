package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C2330l extends AbstractC2349u0<C2330l, a> implements p0y0 {
    private static final C2330l zzc;
    private static volatile s1y0<C2330l> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l$a */
    public static final class a extends AbstractC2349u0.b<C2330l, a> implements p0y0 {
        public a() {
            super(C2330l.zzc);
        }
    }

    static {
        C2330l c2330l = new C2330l();
        zzc = c2330l;
        AbstractC2349u0.m14348p(C2330l.class, c2330l);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2338p.f10249a[i - 1];
        switch (i2) {
            case 1:
                return new C2330l();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2330l> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2330l.class) {
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
