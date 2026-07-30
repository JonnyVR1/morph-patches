package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2334b0 extends AbstractC2372u0<C2334b0, a> implements v9y0 {
    private static final C2334b0 zzc;
    private static volatile yay0<C2334b0> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C2371u zzh;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b0$a */
    public static final class a extends AbstractC2372u0.b<C2334b0, a> implements v9y0 {
        public a() {
            super(C2334b0.zzc);
        }
    }

    static {
        C2334b0 c2334b0 = new C2334b0();
        zzc = c2334b0;
        AbstractC2372u0.m14402p(C2334b0.class, c2334b0);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2367s.f10292a[i - 1];
        switch (i2) {
            case 1:
                return new C2334b0();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                yay0<C2334b0> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2334b0.class) {
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
