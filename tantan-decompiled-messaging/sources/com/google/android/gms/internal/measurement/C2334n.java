package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C2334n extends AbstractC2349u0<C2334n, a> implements p0y0 {
    private static final C2334n zzc;
    private static volatile s1y0<C2334n> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n$a */
    public static final class a extends AbstractC2349u0.b<C2334n, a> implements p0y0 {
        public a() {
            super(C2334n.zzc);
        }
    }

    static {
        C2334n c2334n = new C2334n();
        zzc = c2334n;
        AbstractC2349u0.m14348p(C2334n.class, c2334n);
    }

    /* JADX INFO: renamed from: C */
    public final String m14242C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final String m14243D() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2338p.f10249a[i - 1];
        switch (i2) {
            case 1:
                return new C2334n();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2334n> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2334n.class) {
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
