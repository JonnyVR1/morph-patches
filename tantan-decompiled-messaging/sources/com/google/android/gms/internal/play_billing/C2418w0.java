package com.google.android.gms.internal.play_billing;

import p149l.g1y0;
import p149l.l1y0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2418w0 extends AbstractC2380d0 implements xmx0 {
    private static final C2418w0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C2408r0 zzg;
    private C2410s0 zzh;

    static {
        C2418w0 c2418w0 = new C2418w0();
        zzb = c2418w0;
        AbstractC2380d0.m14764v(C2418w0.class, c2418w0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14952A(C2418w0 c2418w0, C2400n0 c2400n0) {
        c2418w0.zzf = c2400n0;
        c2418w0.zze = 3;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14953B(C2418w0 c2418w0, C2404p0 c2404p0) {
        c2404p0.getClass();
        c2418w0.zzf = c2404p0;
        c2418w0.zze = 7;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14954C(C2418w0 c2418w0, C2408r0 c2408r0) {
        c2408r0.getClass();
        c2418w0.zzg = c2408r0;
        c2418w0.zzd |= 1;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m14955D(C2418w0 c2418w0, C2422y0 c2422y0) {
        c2422y0.getClass();
        c2418w0.zzf = c2422y0;
        c2418w0.zze = 8;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m14956E(C2418w0 c2418w0, C2424z0 c2424z0) {
        c2418w0.zzf = c2424z0;
        c2418w0.zze = 4;
    }

    /* JADX INFO: renamed from: F */
    public static g1y0 m14957F() {
        return (g1y0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14959z(C2418w0 c2418w0, C2398m0 c2398m0) {
        c2418w0.zzf = c2398m0;
        c2418w0.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C2398m0.class, C2400n0.class, C2424z0.class, C2406q0.class, "zzh", C2404p0.class, C2422y0.class});
        }
        if (i2 == 3) {
            return new C2418w0();
        }
        l1y0 l1y0Var = null;
        if (i2 == 4) {
            return new g1y0(l1y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
