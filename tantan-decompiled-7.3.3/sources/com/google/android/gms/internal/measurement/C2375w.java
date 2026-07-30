package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C2375w extends AbstractC2372u0<C2375w, a> implements v9y0 {
    private static final C2375w zzc;
    private static volatile yay0<C2375w> zzd;
    private int zze;
    private int zzf;
    private C2338d0 zzg;
    private C2338d0 zzh;
    private boolean zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w$a */
    public static final class a extends AbstractC2372u0.b<C2375w, a> implements v9y0 {
        public a() {
            super(C2375w.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14481v(int i) {
            m14432r();
            C2375w.m14468B((C2375w) this.f10299b, i);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14482w(C2338d0.a aVar) {
            m14432r();
            C2375w.m14469C((C2375w) this.f10299b, (C2338d0) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14483x(C2338d0 c2338d0) {
            m14432r();
            C2375w.m14472G((C2375w) this.f10299b, c2338d0);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14484y(boolean z) {
            m14432r();
            C2375w.m14470D((C2375w) this.f10299b, z);
            return this;
        }
    }

    static {
        C2375w c2375w = new C2375w();
        zzc = c2375w;
        AbstractC2372u0.m14402p(C2375w.class, c2375w);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14468B(C2375w c2375w, int i) {
        c2375w.zze |= 1;
        c2375w.zzf = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14469C(C2375w c2375w, C2338d0 c2338d0) {
        c2338d0.getClass();
        c2375w.zzg = c2338d0;
        c2375w.zze |= 2;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14470D(C2375w c2375w, boolean z) {
        c2375w.zze |= 8;
        c2375w.zzi = z;
    }

    /* JADX INFO: renamed from: E */
    public static a m14471E() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m14472G(C2375w c2375w, C2338d0 c2338d0) {
        c2338d0.getClass();
        c2375w.zzh = c2338d0;
        c2375w.zze |= 4;
    }

    /* JADX INFO: renamed from: K */
    public final C2338d0 m14474K() {
        C2338d0 c2338d0 = this.zzg;
        return c2338d0 == null ? C2338d0.m14166W() : c2338d0;
    }

    /* JADX INFO: renamed from: L */
    public final C2338d0 m14475L() {
        C2338d0 c2338d0 = this.zzh;
        return c2338d0 == null ? C2338d0.m14166W() : c2338d0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14476M() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14477N() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m14478T() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m14479U() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14480h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2375w();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                yay0<C2375w> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2375w.class) {
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
