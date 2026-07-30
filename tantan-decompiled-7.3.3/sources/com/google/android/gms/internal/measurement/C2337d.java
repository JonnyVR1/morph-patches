package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2337d extends AbstractC2372u0<C2337d, a> implements v9y0 {
    private static final C2337d zzc;
    private static volatile yay0<C2337d> zzd;
    private int zze;
    private zzfo$zzf zzf;
    private zzfo$zzd zzg;
    private boolean zzh;
    private String zzi = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d$a */
    public static final class a extends AbstractC2372u0.b<C2337d, a> implements v9y0 {
        public a() {
            super(C2337d.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14155v(String str) {
            m14432r();
            C2337d.m14145C((C2337d) this.f10299b, str);
            return this;
        }
    }

    static {
        C2337d c2337d = new C2337d();
        zzc = c2337d;
        AbstractC2372u0.m14402p(C2337d.class, c2337d);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14145C(C2337d c2337d, String str) {
        str.getClass();
        c2337d.zze |= 8;
        c2337d.zzi = str;
    }

    /* JADX INFO: renamed from: D */
    public static C2337d m14146D() {
        return zzc;
    }

    /* JADX INFO: renamed from: E */
    public final zzfo$zzd m14147E() {
        zzfo$zzd zzfo_zzd = this.zzg;
        return zzfo_zzd == null ? zzfo$zzd.m14609D() : zzfo_zzd;
    }

    /* JADX INFO: renamed from: G */
    public final zzfo$zzf m14148G() {
        zzfo$zzf zzfo_zzf = this.zzf;
        return zzfo_zzf == null ? zzfo$zzf.m14621D() : zzfo_zzf;
    }

    /* JADX INFO: renamed from: I */
    public final String m14149I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14150K() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14151L() {
        return (this.zze & 4) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14152M() {
        return (this.zze & 2) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14153N() {
        return (this.zze & 8) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m14154T() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2330a.f10278a[i - 1];
        switch (i2) {
            case 1:
                return new C2337d();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                yay0<C2337d> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2337d.class) {
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
