package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2373v extends AbstractC2372u0<C2373v, a> implements v9y0 {
    private static final C2373v zzc;
    private static volatile yay0<C2373v> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v$a */
    public static final class a extends AbstractC2372u0.b<C2373v, a> implements v9y0 {
        public a() {
            super(C2373v.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final a m14457A(boolean z) {
            m14432r();
            C2373v.m14448T((C2373v) this.f10299b, z);
            return this;
        }

        /* JADX INFO: renamed from: B */
        public final a m14458B(boolean z) {
            m14432r();
            C2373v.m14449V((C2373v) this.f10299b, z);
            return this;
        }

        /* JADX INFO: renamed from: v */
        public final a m14459v(boolean z) {
            m14432r();
            C2373v.m14441C((C2373v) this.f10299b, z);
            return this;
        }

        /* JADX INFO: renamed from: w */
        public final a m14460w(boolean z) {
            m14432r();
            C2373v.m14443E((C2373v) this.f10299b, z);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m14461x(boolean z) {
            m14432r();
            C2373v.m14445I((C2373v) this.f10299b, z);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final a m14462y(boolean z) {
            m14432r();
            C2373v.m14446K((C2373v) this.f10299b, z);
            return this;
        }

        /* JADX INFO: renamed from: z */
        public final a m14463z(boolean z) {
            m14432r();
            C2373v.m14447M((C2373v) this.f10299b, z);
            return this;
        }
    }

    static {
        C2373v c2373v = new C2373v();
        zzc = c2373v;
        AbstractC2372u0.m14402p(C2373v.class, c2373v);
    }

    /* JADX INFO: renamed from: B */
    public static a m14440B() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14441C(C2373v c2373v, boolean z) {
        c2373v.zze |= 32;
        c2373v.zzk = z;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14443E(C2373v c2373v, boolean z) {
        c2373v.zze |= 16;
        c2373v.zzj = z;
    }

    /* JADX INFO: renamed from: G */
    public static C2373v m14444G() {
        return zzc;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m14445I(C2373v c2373v, boolean z) {
        c2373v.zze |= 1;
        c2373v.zzf = z;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m14446K(C2373v c2373v, boolean z) {
        c2373v.zze |= 64;
        c2373v.zzl = z;
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m14447M(C2373v c2373v, boolean z) {
        c2373v.zze |= 2;
        c2373v.zzg = z;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m14448T(C2373v c2373v, boolean z) {
        c2373v.zze |= 4;
        c2373v.zzh = z;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m14449V(C2373v c2373v, boolean z) {
        c2373v.zze |= 8;
        c2373v.zzi = z;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14450L() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14451N() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m14452U() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m14453W() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m14454X() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m14455Y() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m14456Z() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2373v();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                yay0<C2373v> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2373v.class) {
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
