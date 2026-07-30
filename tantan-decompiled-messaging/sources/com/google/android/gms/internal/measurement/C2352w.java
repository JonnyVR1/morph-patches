package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C2352w extends AbstractC2349u0<C2352w, a> implements p0y0 {
    private static final C2352w zzc;
    private static volatile s1y0<C2352w> zzd;
    private int zze;
    private int zzf;
    private C2315d0 zzg;
    private C2315d0 zzh;
    private boolean zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w$a */
    public static final class a extends AbstractC2349u0.b<C2352w, a> implements p0y0 {
        public a() {
            super(C2352w.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14427v(int i) {
            m14378r();
            C2352w.m14414B((C2352w) this.f10262b, i);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14428w(C2315d0.a aVar) {
            m14378r();
            C2352w.m14415C((C2352w) this.f10262b, (C2315d0) ((AbstractC2349u0) aVar.mo14369H()));
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14429x(C2315d0 c2315d0) {
            m14378r();
            C2352w.m14418G((C2352w) this.f10262b, c2315d0);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14430y(boolean z) {
            m14378r();
            C2352w.m14416D((C2352w) this.f10262b, z);
            return this;
        }
    }

    static {
        C2352w c2352w = new C2352w();
        zzc = c2352w;
        AbstractC2349u0.m14348p(C2352w.class, c2352w);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14414B(C2352w c2352w, int i) {
        c2352w.zze |= 1;
        c2352w.zzf = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14415C(C2352w c2352w, C2315d0 c2315d0) {
        c2315d0.getClass();
        c2352w.zzg = c2315d0;
        c2352w.zze |= 2;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14416D(C2352w c2352w, boolean z) {
        c2352w.zze |= 8;
        c2352w.zzi = z;
    }

    /* JADX INFO: renamed from: E */
    public static a m14417E() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14418G(C2352w c2352w, C2315d0 c2315d0) {
        c2315d0.getClass();
        c2352w.zzh = c2315d0;
        c2352w.zze |= 4;
    }

    /* JADX INFO: renamed from: K */
    public final C2315d0 m14420K() {
        C2315d0 c2315d0 = this.zzg;
        return c2315d0 == null ? C2315d0.m14112W() : c2315d0;
    }

    /* JADX INFO: renamed from: L */
    public final C2315d0 m14421L() {
        C2315d0 c2315d0 = this.zzh;
        return c2315d0 == null ? C2315d0.m14112W() : c2315d0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14422M() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14423N() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m14424T() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m14425U() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14426h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2352w();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2352w> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2352w.class) {
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
