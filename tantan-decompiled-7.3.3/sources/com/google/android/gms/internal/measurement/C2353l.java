package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C2353l extends AbstractC2372u0<C2353l, a> implements v9y0 {
    private static final C2353l zzc;
    private static volatile yay0<C2353l> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l$a */
    public static final class a extends AbstractC2372u0.b<C2353l, a> implements v9y0 {
        public a() {
            super(C2353l.zzc);
        }
    }

    static {
        C2353l c2353l = new C2353l();
        zzc = c2353l;
        AbstractC2372u0.m14402p(C2353l.class, c2353l);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new C2353l();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                yay0<C2353l> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2353l.class) {
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
