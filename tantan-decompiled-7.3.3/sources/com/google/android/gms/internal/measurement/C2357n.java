package com.google.android.gms.internal.measurement;

import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C2357n extends AbstractC2372u0<C2357n, a> implements v9y0 {
    private static final C2357n zzc;
    private static volatile yay0<C2357n> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n$a */
    public static final class a extends AbstractC2372u0.b<C2357n, a> implements v9y0 {
        public a() {
            super(C2357n.zzc);
        }
    }

    static {
        C2357n c2357n = new C2357n();
        zzc = c2357n;
        AbstractC2372u0.m14402p(C2357n.class, c2357n);
    }

    /* JADX INFO: renamed from: C */
    public final String m14296C() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final String m14297D() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new C2357n();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                yay0<C2357n> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2357n.class) {
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
