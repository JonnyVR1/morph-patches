package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2316e extends AbstractC2349u0<C2316e, a> implements p0y0 {
    private static final C2316e zzc;
    private static volatile s1y0<C2316e> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C2314d zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e$a */
    public static final class a extends AbstractC2349u0.b<C2316e, a> implements p0y0 {
        public a() {
            super(C2316e.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14140v(String str) {
            m14378r();
            C2316e.m14129B((C2316e) this.f10262b, str);
            return this;
        }
    }

    static {
        C2316e c2316e = new C2316e();
        zzc = c2316e;
        AbstractC2349u0.m14348p(C2316e.class, c2316e);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14129B(C2316e c2316e, String str) {
        str.getClass();
        c2316e.zze |= 2;
        c2316e.zzg = str;
    }

    /* JADX INFO: renamed from: D */
    public static a m14130D() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: C */
    public final C2314d m14132C() {
        C2314d c2314d = this.zzh;
        return c2314d == null ? C2314d.m14092D() : c2314d;
    }

    /* JADX INFO: renamed from: G */
    public final String m14133G() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14134I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14135K() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14136L() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14137M() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14138N() {
        return (this.zze & 32) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14139h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2307a.f10241a[i - 1];
        switch (i2) {
            case 1:
                return new C2316e();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2316e> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2316e.class) {
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
