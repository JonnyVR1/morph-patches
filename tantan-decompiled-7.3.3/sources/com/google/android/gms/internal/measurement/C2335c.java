package com.google.android.gms.internal.measurement;

import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2335c extends AbstractC2372u0<C2335c, a> implements v9y0 {
    private static final C2335c zzc;
    private static volatile yay0<C2335c> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private i4y0<C2337d> zzh = AbstractC2372u0.m14406x();
    private boolean zzi;
    private zzfo$zzd zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c$a */
    public static final class a extends AbstractC2372u0.b<C2335c, a> implements v9y0 {
        public a() {
            super(C2335c.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final int m13899v() {
            return ((C2335c) this.f10299b).m13898h();
        }

        /* JADX INFO: renamed from: w */
        public final a m13900w(int i, C2337d c2337d) {
            m14432r();
            C2335c.m13883C((C2335c) this.f10299b, i, c2337d);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final a m13901x(String str) {
            m14432r();
            C2335c.m13884D((C2335c) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: y */
        public final C2337d m13902y(int i) {
            return ((C2335c) this.f10299b).m13887B(i);
        }

        /* JADX INFO: renamed from: z */
        public final String m13903z() {
            return ((C2335c) this.f10299b).m13890L();
        }
    }

    static {
        C2335c c2335c = new C2335c();
        zzc = c2335c;
        AbstractC2372u0.m14402p(C2335c.class, c2335c);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m13883C(C2335c c2335c, int i, C2337d c2337d) {
        c2337d.getClass();
        i4y0<C2337d> i4y0Var = c2335c.zzh;
        if (!i4y0Var.zzc()) {
            c2335c.zzh = AbstractC2372u0.m14401o(i4y0Var);
        }
        c2335c.zzh.set(i, c2337d);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m13884D(C2335c c2335c, String str) {
        str.getClass();
        c2335c.zze |= 2;
        c2335c.zzg = str;
    }

    /* JADX INFO: renamed from: G */
    public static a m13885G() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: B */
    public final C2337d m13887B(int i) {
        return this.zzh.get(i);
    }

    /* JADX INFO: renamed from: E */
    public final int m13888E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: K */
    public final zzfo$zzd m13889K() {
        zzfo$zzd zzfo_zzd = this.zzj;
        return zzfo_zzd == null ? zzfo$zzd.m14609D() : zzfo_zzd;
    }

    /* JADX INFO: renamed from: L */
    public final String m13890L() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: M */
    public final List<C2337d> m13891M() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m13892N() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m13893T() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m13894U() {
        return this.zzm;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m13895V() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m13896W() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m13897X() {
        return (this.zze & 64) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m13898h() {
        return this.zzh.size();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2330a.f10278a[i - 1];
        switch (i2) {
            case 1:
                return new C2335c();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", C2337d.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                yay0<C2335c> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2335c.class) {
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
