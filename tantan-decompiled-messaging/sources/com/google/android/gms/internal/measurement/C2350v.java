package com.google.android.gms.internal.measurement;

import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2350v extends AbstractC2349u0<C2350v, a> implements p0y0 {
    private static final C2350v zzc;
    private static volatile s1y0<C2350v> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v$a */
    public static final class a extends AbstractC2349u0.b<C2350v, a> implements p0y0 {
        public a() {
            super(C2350v.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14403A(boolean z) {
            m14378r();
            C2350v.m14394T((C2350v) this.f10262b, z);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14404B(boolean z) {
            m14378r();
            C2350v.m14395V((C2350v) this.f10262b, z);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final a m14405v(boolean z) {
            m14378r();
            C2350v.m14387C((C2350v) this.f10262b, z);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14406w(boolean z) {
            m14378r();
            C2350v.m14389E((C2350v) this.f10262b, z);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14407x(boolean z) {
            m14378r();
            C2350v.m14391I((C2350v) this.f10262b, z);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14408y(boolean z) {
            m14378r();
            C2350v.m14392K((C2350v) this.f10262b, z);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14409z(boolean z) {
            m14378r();
            C2350v.m14393M((C2350v) this.f10262b, z);
            return this;
        }
    }

    static {
        C2350v c2350v = new C2350v();
        zzc = c2350v;
        AbstractC2349u0.m14348p(C2350v.class, c2350v);
    }

    /* JADX INFO: renamed from: B */
    public static a m14386B() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14387C(C2350v c2350v, boolean z) {
        c2350v.zze |= 32;
        c2350v.zzk = z;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14389E(C2350v c2350v, boolean z) {
        c2350v.zze |= 16;
        c2350v.zzj = z;
    }

    /* JADX INFO: renamed from: G */
    public static C2350v m14390G() {
        return zzc;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14391I(C2350v c2350v, boolean z) {
        c2350v.zze |= 1;
        c2350v.zzf = z;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14392K(C2350v c2350v, boolean z) {
        c2350v.zze |= 64;
        c2350v.zzl = z;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m14393M(C2350v c2350v, boolean z) {
        c2350v.zze |= 2;
        c2350v.zzg = z;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14394T(C2350v c2350v, boolean z) {
        c2350v.zze |= 4;
        c2350v.zzh = z;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m14395V(C2350v c2350v, boolean z) {
        c2350v.zze |= 8;
        c2350v.zzi = z;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14396L() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14397N() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m14398U() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m14399W() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m14400X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m14401Y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14402Z() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2350v();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2350v> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2350v.class) {
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
