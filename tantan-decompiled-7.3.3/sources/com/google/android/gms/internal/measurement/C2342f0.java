package com.google.android.gms.internal.measurement;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2342f0 extends AbstractC2372u0<C2342f0, a> implements v9y0 {
    private static final C2342f0 zzc;
    private static volatile yay0<C2342f0> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0$a */
    public static final class a extends AbstractC2372u0.b<C2342f0, a> implements v9y0 {
        public a() {
            super(C2342f0.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14227A(long j) {
            m14432r();
            C2342f0.m14211L((C2342f0) this.f10299b, j);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14228B(String str) {
            m14432r();
            C2342f0.m14212M((C2342f0) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: C */
        public final a m14229C() {
            m14432r();
            C2342f0.m14213T((C2342f0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final a m14230v() {
            m14432r();
            C2342f0.m14206C((C2342f0) this.f10299b);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14231w(double d) {
            m14432r();
            C2342f0.m14207D((C2342f0) this.f10299b, d);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14232x(long j) {
            m14432r();
            C2342f0.m14208E((C2342f0) this.f10299b, j);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14233y(String str) {
            m14432r();
            C2342f0.m14209G((C2342f0) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14234z() {
            m14432r();
            C2342f0.m14210K((C2342f0) this.f10299b);
            return this;
        }
    }

    static {
        C2342f0 c2342f0 = new C2342f0();
        zzc = c2342f0;
        AbstractC2372u0.m14402p(C2342f0.class, c2342f0);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14206C(C2342f0 c2342f0) {
        c2342f0.zze &= -33;
        c2342f0.zzk = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14207D(C2342f0 c2342f0, double d) {
        c2342f0.zze |= 32;
        c2342f0.zzk = d;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14208E(C2342f0 c2342f0, long j) {
        c2342f0.zze |= 8;
        c2342f0.zzi = j;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14209G(C2342f0 c2342f0, String str) {
        str.getClass();
        c2342f0.zze |= 2;
        c2342f0.zzg = str;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14210K(C2342f0 c2342f0) {
        c2342f0.zze &= -9;
        c2342f0.zzi = 0L;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m14211L(C2342f0 c2342f0, long j) {
        c2342f0.zze |= 1;
        c2342f0.zzf = j;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m14212M(C2342f0 c2342f0, String str) {
        str.getClass();
        c2342f0.zze |= 4;
        c2342f0.zzh = str;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14213T(C2342f0 c2342f0) {
        c2342f0.zze &= -5;
        c2342f0.zzh = zzc.zzh;
    }

    /* JADX INFO: renamed from: V */
    public static a m14214V() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: B */
    public final double m14216B() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: I */
    public final float m14217I() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: N */
    public final long m14218N() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: U */
    public final long m14219U() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: X */
    public final String m14220X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final String m14221Y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14222Z() {
        return (this.zze & 32) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m14223a0() {
        return (this.zze & 16) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m14224b0() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m14225c0() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m14226d0() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2342f0();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                yay0<C2342f0> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2342f0.class) {
                    try {
                        aVar = zzd;
                        if (aVar == null) {
                            aVar = new AbstractC2372u0.a(zzc);
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
                l710.m153113a();
            case 7:
                return null;
        }
    }
}
