package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C2355m extends AbstractC2372u0<C2355m, a> implements v9y0 {
    private static final C2355m zzc;
    private static volatile yay0<C2355m> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m$a */
    public static final class a extends AbstractC2372u0.b<C2355m, a> implements v9y0 {
        public a() {
            super(C2355m.zzc);
        }
    }

    static {
        C2355m c2355m = new C2355m();
        zzc = c2355m;
        AbstractC2372u0.m14402p(C2355m.class, c2355m);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new C2355m();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                yay0<C2355m> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2355m.class) {
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
