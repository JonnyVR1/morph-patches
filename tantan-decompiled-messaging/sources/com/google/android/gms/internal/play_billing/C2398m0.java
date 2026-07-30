package com.google.android.gms.internal.play_billing;

import p149l.ntx0;
import p149l.stx0;
import p149l.vux0;
import p149l.x4x0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2398m0 extends AbstractC2380d0 implements xmx0 {
    private static final C2398m0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C2402o0 zzh;

    static {
        C2398m0 c2398m0 = new C2398m0();
        zzb = c2398m0;
        AbstractC2380d0.m14764v(C2398m0.class, c2398m0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14867A(C2398m0 c2398m0, C2402o0 c2402o0) {
        c2402o0.getClass();
        c2398m0.zzh = c2402o0;
        c2398m0.zzd |= 2;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14868B(C2398m0 c2398m0, C2412t0 c2412t0) {
        c2412t0.getClass();
        c2398m0.zzf = c2412t0;
        c2398m0.zze = 4;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14869C(C2398m0 c2398m0, int i) {
        c2398m0.zzg = i - 1;
        c2398m0.zzd |= 1;
    }

    /* JADX INFO: renamed from: D */
    public static ntx0 m14870D() {
        return (ntx0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static C2398m0 m14872z(byte[] bArr, x4x0 x4x0Var) throws zzhr {
        return (C2398m0) AbstractC2380d0.m14759n(zzb, bArr, x4x0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", vux0.f183136a, "zzh", C2412t0.class});
        }
        if (i2 == 3) {
            return new C2398m0();
        }
        stx0 stx0Var = null;
        if (i2 == 4) {
            return new ntx0(stx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
