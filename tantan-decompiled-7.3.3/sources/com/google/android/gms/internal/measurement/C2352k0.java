package com.google.android.gms.internal.measurement;

import java.util.List;
import p153l.i4y0;
import p153l.l710;
import p153l.v9y0;
import p153l.yay0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2352k0 extends AbstractC2372u0<C2352k0, a> implements v9y0 {
    private static final C2352k0 zzc;
    private static volatile yay0<C2352k0> zzd;
    private int zze;
    private i4y0<zzgd$zzd> zzf = AbstractC2372u0.m14406x();
    private C2348i0 zzg;

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k0$a */
    public static final class a extends AbstractC2372u0.b<C2352k0, a> implements v9y0 {
        public a() {
            super(C2352k0.zzc);
        }
    }

    static {
        C2352k0 c2352k0 = new C2352k0();
        zzc = c2352k0;
        AbstractC2372u0.m14402p(C2352k0.class, c2352k0);
    }

    /* JADX INFO: renamed from: B */
    public final C2348i0 m14291B() {
        C2348i0 c2348i0 = this.zzg;
        return c2348i0 == null ? C2348i0.m14255C() : c2348i0;
    }

    /* JADX INFO: renamed from: D */
    public final List<zzgd$zzd> m14292D() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2372u0
    /* JADX INFO: renamed from: k */
    public final Object mo13848k(int i, Object obj, Object obj2) {
        yay0 aVar;
        int i2 = C2354l0.f10283a[i - 1];
        switch (i2) {
            case 1:
                return new C2352k0();
            case 2:
                return new a();
            case 3:
                return AbstractC2372u0.m14399m(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgd$zzd.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                yay0<C2352k0> yay0Var = zzd;
                if (yay0Var != null) {
                    return yay0Var;
                }
                synchronized (C2352k0.class) {
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
