package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C2348u extends AbstractC2349u0<C2348u, a> implements p0y0 {
    private static final C2348u zzc;
    private static volatile s1y0<C2348u> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u$a */
    public static final class a extends AbstractC2349u0.b<C2348u, a> implements p0y0 {
        public a() {
            super(C2348u.zzc);
        }
    }

    static {
        C2348u c2348u = new C2348u();
        zzc = c2348u;
        AbstractC2349u0.m14348p(C2348u.class, c2348u);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2348u();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2348u> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2348u.class) {
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
