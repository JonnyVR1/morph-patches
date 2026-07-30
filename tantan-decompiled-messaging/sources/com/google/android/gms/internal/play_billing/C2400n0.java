package com.google.android.gms.internal.play_billing;

import p149l.evx0;
import p149l.vux0;
import p149l.xmx0;
import p149l.zux0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2400n0 extends AbstractC2380d0 implements xmx0 {
    private static final C2400n0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        C2400n0 c2400n0 = new C2400n0();
        zzb = c2400n0;
        AbstractC2380d0.m14764v(C2400n0.class, c2400n0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14873A(C2400n0 c2400n0, C2373a1 c2373a1) {
        c2373a1.getClass();
        c2400n0.zzf = c2373a1;
        c2400n0.zze = 3;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14874B(C2400n0 c2400n0, int i) {
        c2400n0.zzg = i - 1;
        c2400n0.zzd |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static zux0 m14875C() {
        return (zux0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14877z(C2400n0 c2400n0, C2412t0 c2412t0) {
        c2412t0.getClass();
        c2400n0.zzf = c2412t0;
        c2400n0.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", vux0.f183136a, C2412t0.class, C2373a1.class, C2416v0.class});
        }
        if (i2 == 3) {
            return new C2400n0();
        }
        evx0 evx0Var = null;
        if (i2 == 4) {
            return new zux0(evx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
