package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C2358z extends AbstractC2349u0<C2358z, a> implements p0y0 {
    private static final C2358z zzc;
    private static volatile s1y0<C2358z> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z$a */
    public static final class a extends AbstractC2349u0.b<C2358z, a> implements p0y0 {
        public a() {
            super(C2358z.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14547v(long j) {
            m14378r();
            C2358z.m14544C((C2358z) this.f10262b, j);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14548w(String str) {
            m14378r();
            C2358z.m14545D((C2358z) this.f10262b, str);
            return this;
        }
    }

    static {
        C2358z c2358z = new C2358z();
        zzc = c2358z;
        AbstractC2349u0.m14348p(C2358z.class, c2358z);
    }

    /* JADX INFO: renamed from: B */
    public static a m14543B() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14544C(C2358z c2358z, long j) {
        c2358z.zze |= 2;
        c2358z.zzg = j;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14545D(C2358z c2358z, String str) {
        str.getClass();
        c2358z.zze |= 1;
        c2358z.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2358z();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2358z> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2358z.class) {
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
