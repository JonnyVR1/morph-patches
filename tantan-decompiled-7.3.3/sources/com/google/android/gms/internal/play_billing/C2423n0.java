package com.google.android.gms.internal.play_billing;

import p153l.b4y0;
import p153l.dwx0;
import p153l.f4y0;
import p153l.k4y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2423n0 extends AbstractC2403d0 implements dwx0 {
    private static final C2423n0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C2423n0 c2423n0 = new C2423n0();
        zzb = c2423n0;
        AbstractC2403d0.m14818v(C2423n0.class, c2423n0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14927A(C2423n0 c2423n0, C2396a1 c2396a1) {
        c2396a1.getClass();
        c2423n0.zzf = c2396a1;
        c2423n0.zze = 3;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14928B(C2423n0 c2423n0, int i) {
        c2423n0.zzg = i - 1;
        c2423n0.zzd |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static f4y0 m14929C() {
        return (f4y0) zzb.m14825j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14931z(C2423n0 c2423n0, C2435t0 c2435t0) {
        c2435t0.getClass();
        c2423n0.zzf = c2435t0;
        c2423n0.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", b4y0.f75004a, C2435t0.class, C2396a1.class, C2439v0.class});
        }
        if (i2 == 3) {
            return new C2423n0();
        }
        k4y0 k4y0Var = null;
        if (i2 == 4) {
            return new f4y0(k4y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
