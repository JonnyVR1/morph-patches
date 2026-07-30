package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C2347i extends AbstractC2372u0<C2347i, a> implements v9y0 {
    private static final C2347i zzc;
    private static volatile yay0<C2347i> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i$a */
    public static final class a extends AbstractC2372u0.b<C2347i, a> implements v9y0 {
        public a() {
            super(C2347i.zzc);
        }

        /* JADX INFO: renamed from: A */
        public final boolean m14246A() {
            return ((C2347i) this.f10299b).m14242I();
        }

        /* JADX INFO: renamed from: B */
        public final boolean m14247B() {
            return ((C2347i) this.f10299b).m14243K();
        }

        /* JADX INFO: renamed from: C */
        public final boolean m14248C() {
            return ((C2347i) this.f10299b).m14244L();
        }

        /* JADX INFO: renamed from: v */
        public final int m14249v() {
            return ((C2347i) this.f10299b).m14245h();
        }

        /* JADX INFO: renamed from: w */
        public final a m14250w(String str) {
            m14432r();
            C2347i.m14237B((C2347i) this.f10299b, str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public final String m14251x() {
            return ((C2347i) this.f10299b).m14239D();
        }

        /* JADX INFO: renamed from: y */
        public final boolean m14252y() {
            return ((C2347i) this.f10299b).m14240E();
        }

        /* JADX INFO: renamed from: z */
        public final boolean m14253z() {
            return ((C2347i) this.f10299b).m14241G();
        }
    }

    static {
        C2347i c2347i = new C2347i();
        zzc = c2347i;
        AbstractC2372u0.m14402p(C2347i.class, c2347i);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14237B(C2347i c2347i, String str) {
        str.getClass();
        c2347i.zze |= 1;
        c2347i.zzf = str;
    }

    /* JADX INFO: renamed from: D */
    public final String m14239D() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m14240E() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m14241G() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14242I() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14243K() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14244L() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14245h() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new C2347i();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                yay0<C2347i> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2347i.class) {
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
