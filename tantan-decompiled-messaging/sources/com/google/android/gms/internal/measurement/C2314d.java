package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2314d extends AbstractC2349u0<C2314d, a> implements p0y0 {
    private static final C2314d zzc;
    private static volatile s1y0<C2314d> zzd;
    private int zze;
    private zzfo$zzf zzf;
    private zzfo$zzd zzg;
    private boolean zzh;
    private String zzi = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d$a */
    public static final class a extends AbstractC2349u0.b<C2314d, a> implements p0y0 {
        public a() {
            super(C2314d.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14101v(String str) {
            m14378r();
            C2314d.m14091C((C2314d) this.f10262b, str);
            return this;
        }
    }

    static {
        C2314d c2314d = new C2314d();
        zzc = c2314d;
        AbstractC2349u0.m14348p(C2314d.class, c2314d);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14091C(C2314d c2314d, String str) {
        str.getClass();
        c2314d.zze |= 8;
        c2314d.zzi = str;
    }

    /* JADX INFO: renamed from: D */
    public static C2314d m14092D() {
        return zzc;
    }

    /* JADX INFO: renamed from: E */
    public final zzfo$zzd m14093E() {
        zzfo$zzd zzfo_zzd = this.zzg;
        return zzfo_zzd == null ? zzfo$zzd.m14555D() : zzfo_zzd;
    }

    /* JADX INFO: renamed from: G */
    public final zzfo$zzf m14094G() {
        zzfo$zzf zzfo_zzf = this.zzf;
        return zzfo_zzf == null ? zzfo$zzf.m14567D() : zzfo_zzf;
    }

    /* JADX INFO: renamed from: I */
    public final String m14095I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14096K() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14097L() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14098M() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14099N() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m14100T() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2307a.f10241a[i - 1];
        switch (i2) {
            case 1:
                return new C2314d();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2314d> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2314d.class) {
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
