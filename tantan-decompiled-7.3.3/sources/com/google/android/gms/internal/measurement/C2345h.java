package com.google.android.gms.internal.measurement;

import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2345h extends AbstractC2372u0<C2345h, a> implements v9y0 {
    private static final C2345h zzc;
    private static volatile yay0<C2345h> zzd;
    private int zze;
    private String zzf = "";
    private i4y0<C2355m> zzg = AbstractC2372u0.m14406x();
    private boolean zzh;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h$a */
    public static final class a extends AbstractC2372u0.b<C2345h, a> implements v9y0 {
        public a() {
            super(C2345h.zzc);
        }
    }

    static {
        C2345h c2345h = new C2345h();
        zzc = c2345h;
        AbstractC2372u0.m14402p(C2345h.class, c2345h);
    }

    /* JADX INFO: renamed from: C */
    public final String m14236C() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new C2345h();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", C2355m.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                yay0<C2345h> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2345h.class) {
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
