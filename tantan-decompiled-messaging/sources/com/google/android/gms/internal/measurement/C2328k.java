package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.cvx0;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C2328k extends AbstractC2349u0<C2328k, a> implements p0y0 {
    private static final C2328k zzc;
    private static volatile s1y0<C2328k> zzd;
    private cvx0<String> zze = AbstractC2349u0.m14352x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k$a */
    public static final class a extends AbstractC2349u0.b<C2328k, a> implements p0y0 {
        public a() {
            super(C2328k.zzc);
        }
    }

    static {
        C2328k c2328k = new C2328k();
        zzc = c2328k;
        AbstractC2349u0.m14348p(C2328k.class, c2328k);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2338p.f10249a[i - 1];
        switch (i2) {
            case 1:
                return new C2328k();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2328k> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2328k.class) {
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
