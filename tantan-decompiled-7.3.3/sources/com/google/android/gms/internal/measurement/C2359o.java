package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C2359o extends AbstractC2372u0<C2359o, a> implements v9y0 {
    private static final C2359o zzc;
    private static volatile yay0<C2359o> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o$a */
    public static final class a extends AbstractC2372u0.b<C2359o, a> implements v9y0 {
        public a() {
            super(C2359o.zzc);
        }
    }

    static {
        C2359o c2359o = new C2359o();
        zzc = c2359o;
        AbstractC2372u0.m14402p(C2359o.class, c2359o);
    }

    /* JADX INFO: renamed from: C */
    public static C2359o m14299C() {
        return zzc;
    }

    /* JADX INFO: renamed from: D */
    public final String m14300D() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: E */
    public final String m14301E() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: h */
    public final int m14302h() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new C2359o();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                yay0<C2359o> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2359o.class) {
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
