package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.bz00;
import p149l.p0y0;
import p149l.s1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2319f0 extends AbstractC2349u0<C2319f0, a> implements p0y0 {
    private static final C2319f0 zzc;
    private static volatile s1y0<C2319f0> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0$a */
    public static final class a extends AbstractC2349u0.b<C2319f0, a> implements p0y0 {
        public a() {
            super(C2319f0.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14173A(long j) {
            m14378r();
            C2319f0.m14157L((C2319f0) this.f10262b, j);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14174B(String str) {
            m14378r();
            C2319f0.m14158M((C2319f0) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14175C() {
            m14378r();
            C2319f0.m14159T((C2319f0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final a m14176v() {
            m14378r();
            C2319f0.m14152C((C2319f0) this.f10262b);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14177w(double d) {
            m14378r();
            C2319f0.m14153D((C2319f0) this.f10262b, d);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14178x(long j) {
            m14378r();
            C2319f0.m14154E((C2319f0) this.f10262b, j);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14179y(String str) {
            m14378r();
            C2319f0.m14155G((C2319f0) this.f10262b, str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14180z() {
            m14378r();
            C2319f0.m14156K((C2319f0) this.f10262b);
            return this;
        }
    }

    static {
        C2319f0 c2319f0 = new C2319f0();
        zzc = c2319f0;
        AbstractC2349u0.m14348p(C2319f0.class, c2319f0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14152C(C2319f0 c2319f0) {
        c2319f0.zze &= -33;
        c2319f0.zzk = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14153D(C2319f0 c2319f0, double d) {
        c2319f0.zze |= 32;
        c2319f0.zzk = d;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14154E(C2319f0 c2319f0, long j) {
        c2319f0.zze |= 8;
        c2319f0.zzi = j;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14155G(C2319f0 c2319f0, String str) {
        str.getClass();
        c2319f0.zze |= 2;
        c2319f0.zzg = str;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14156K(C2319f0 c2319f0) {
        c2319f0.zze &= -9;
        c2319f0.zzi = 0L;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14157L(C2319f0 c2319f0, long j) {
        c2319f0.zze |= 1;
        c2319f0.zzf = j;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m14158M(C2319f0 c2319f0, String str) {
        str.getClass();
        c2319f0.zze |= 4;
        c2319f0.zzh = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14159T(C2319f0 c2319f0) {
        c2319f0.zze &= -5;
        c2319f0.zzh = zzc.zzh;
    }

    /* JADX INFO: renamed from: V */
    public static a m14160V() {
        return zzc.m14362s();
    }

    /* JADX INFO: renamed from: B */
    public final double m14162B() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: I */
    public final float m14163I() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: N */
    public final long m14164N() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: U */
    public final long m14165U() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: X */
    public final String m14166X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final String m14167Y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14168Z() {
        return (this.zze & 32) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m14169a0() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m14170b0() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m14171c0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m14172d0() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2349u0
    /* JADX INFO: renamed from: k */
    public final Object mo13794k(int i, Object obj, Object obj2) {
        s1y0 aVar;
        int i2 = C2344s.f10255a[i - 1];
        switch (i2) {
            case 1:
                return new C2319f0();
            case 2:
                return new a();
            case 3:
                return AbstractC2349u0.m14345m(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                s1y0<C2319f0> s1y0Var = zzd;
                if (s1y0Var != null) {
                    return s1y0Var;
                }
                synchronized (C2319f0.class) {
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
