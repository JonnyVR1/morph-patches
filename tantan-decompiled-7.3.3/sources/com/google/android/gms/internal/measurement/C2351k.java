package com.google.android.gms.internal.measurement;

import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C2351k extends AbstractC2372u0<C2351k, a> implements v9y0 {
    private static final C2351k zzc;
    private static volatile yay0<C2351k> zzd;
    private i4y0<String> zze = AbstractC2372u0.m14406x();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k$a */
    public static final class a extends AbstractC2372u0.b<C2351k, a> implements v9y0 {
        public a() {
            super(C2351k.zzc);
        }
    }

    static {
        C2351k c2351k = new C2351k();
        zzc = c2351k;
        AbstractC2372u0.m14402p(C2351k.class, c2351k);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2361p.f10286a[i - 1];
        switch (i2) {
            case 1:
                return new C2351k();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                yay0<C2351k> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2351k.class) {
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
