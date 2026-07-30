package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2339e extends AbstractC2372u0<C2339e, a> implements v9y0 {
    private static final C2339e zzc;
    private static volatile yay0<C2339e> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private C2337d zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e$a */
    public static final class a extends AbstractC2372u0.b<C2339e, a> implements v9y0 {
        public a() {
            super(C2339e.zzc);
        }

        /* JADX INFO: renamed from: v */
        public final a m14194v(String str) {
            m14432r();
            C2339e.m14183B((C2339e) this.f10299b, str);
            return this;
        }
    }

    static {
        C2339e c2339e = new C2339e();
        zzc = c2339e;
        AbstractC2372u0.m14402p(C2339e.class, c2339e);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14183B(C2339e c2339e, String str) {
        str.getClass();
        c2339e.zze |= 2;
        c2339e.zzg = str;
    }

    /* JADX INFO: renamed from: D */
    public static a m14184D() {
        return zzc.m14416s();
    }

    /* JADX INFO: renamed from: C */
    public final C2337d m14186C() {
        C2337d c2337d = this.zzh;
        return c2337d == null ? C2337d.m14146D() : c2337d;
    }

    /* JADX INFO: renamed from: G */
    public final String m14187G() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m14188I() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m14189K() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m14190L() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m14191M() {
        return (this.zze & 1) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m14192N() {
        return (this.zze & 32) != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m14193h() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2330a.f10278a[i - 1];
        switch (i2) {
            case 1:
                return new C2339e();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                yay0<C2339e> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2339e.class) {
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
