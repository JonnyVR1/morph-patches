package com.google.android.gms.internal.measurement;

import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2333b extends AbstractC2372u0<C2333b, a> implements v9y0 {
    private static final C2333b zzc;
    private static volatile yay0<C2333b> zzd;
    private int zze;
    private int zzf;
    private i4y0<C2339e> zzg = AbstractC2372u0.m14406x();
    private i4y0<C2335c> zzh = AbstractC2372u0.m14406x();
    private boolean zzi;
    private boolean zzj;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b$a */
    public static final class a extends AbstractC2372u0.b<C2333b, a> implements v9y0 {
        public a() {
            super(C2333b.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final C2339e m13876A(int i) {
            return ((C2333b) this.f10299b).m13870G(i);
        }

        /* JADX INFO: renamed from: v */
        public final int m13877v() {
            return ((C2333b) this.f10299b).m13869E();
        }

        /* JADX INFO: renamed from: w */
        public final a m13878w(int i, C2335c.a aVar) {
            m14432r();
            C2333b.m13865C((C2333b) this.f10299b, i, (C2335c) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m13879x(int i, C2339e.a aVar) {
            m14432r();
            C2333b.m13866D((C2333b) this.f10299b, i, (C2339e) ((AbstractC2372u0) aVar.mo14423H()));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final C2335c m13880y(int i) {
            return ((C2333b) this.f10299b).m13868B(i);
        }

        /* JADX INFO: renamed from: z */
        public final int m13881z() {
            return ((C2333b) this.f10299b).m13871I();
        }
    }

    static {
        C2333b c2333b = new C2333b();
        zzc = c2333b;
        AbstractC2372u0.m14402p(C2333b.class, c2333b);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13865C(C2333b c2333b, int i, C2335c c2335c) {
        c2335c.getClass();
        i4y0<C2335c> i4y0Var = c2333b.zzh;
        if (!i4y0Var.zzc()) {
            c2333b.zzh = AbstractC2372u0.m14401o(i4y0Var);
        }
        c2333b.zzh.set(i, c2335c);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m13866D(C2333b c2333b, int i, C2339e c2339e) {
        c2339e.getClass();
        i4y0<C2339e> i4y0Var = c2333b.zzg;
        if (!i4y0Var.zzc()) {
            c2333b.zzg = AbstractC2372u0.m14401o(i4y0Var);
        }
        c2333b.zzg.set(i, c2339e);
    }

    /* JADX INFO: renamed from: B */
    public final C2335c m13868B(int i) {
        return this.zzh.get(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m13869E() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: G */
    public final C2339e m13870G(int i) {
        return this.zzg.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final int m13871I() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: L */
    public final List<C2335c> m13872L() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: M */
    public final List<C2339e> m13873M() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m13874N() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m13875h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2330a.f10278a[i - 1];
        switch (i2) {
            case 1:
                return new C2333b();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", C2339e.class, "zzh", C2335c.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                yay0<C2333b> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2333b.class) {
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
