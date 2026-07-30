package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C2336o extends AbstractC2349u0<C2336o, a> implements p0y0 {
    private static final C2336o zzc;
    private static volatile s1y0<C2336o> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o$a */
    public static final class a extends AbstractC2349u0.b<C2336o, a> implements p0y0 {
        public a() {
            super(C2336o.zzc);
        }
    }

    static {
        C2336o c2336o = new C2336o();
        zzc = c2336o;
        AbstractC2349u0.m14348p(C2336o.class, c2336o);
    }

    /* JADX INFO: renamed from: C */
    public static C2336o m14245C() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final String m14246D() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: E */
    public final String m14247E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: h */
    public final int m14248h() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2338p.f10249a[i - 1];
        switch (i2) {
            case 1:
                return new C2336o();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2336o> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2336o.class) {
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
