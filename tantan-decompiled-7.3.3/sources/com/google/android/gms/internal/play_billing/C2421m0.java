package com.google.android.gms.internal.play_billing;

import p153l.b4y0;
import p153l.dex0;
import p153l.dwx0;
import p153l.t2y0;
import p153l.y2y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2421m0 extends AbstractC2403d0 implements dwx0 {
    private static final C2421m0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C2425o0 zzh;

    static {
        C2421m0 c2421m0 = new C2421m0();
        zzb = c2421m0;
        AbstractC2403d0.m14818v(C2421m0.class, c2421m0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14921A(C2421m0 c2421m0, C2425o0 c2425o0) {
        c2425o0.getClass();
        c2421m0.zzh = c2425o0;
        c2421m0.zzd |= 2;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14922B(C2421m0 c2421m0, C2435t0 c2435t0) {
        c2435t0.getClass();
        c2421m0.zzf = c2435t0;
        c2421m0.zze = 4;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14923C(C2421m0 c2421m0, int i) {
        c2421m0.zzg = i - 1;
        c2421m0.zzd |= 1;
    }

    /* JADX INFO: renamed from: D */
    public static t2y0 m14924D() {
        return (t2y0) zzb.m14825j();
    }

    /* JADX INFO: renamed from: z */
    public static C2421m0 m14926z(byte[] bArr, dex0 dex0Var) throws zzhr {
        return (C2421m0) AbstractC2403d0.m14813n(zzb, bArr, dex0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", b4y0.f75004a, "zzh", C2435t0.class});
        }
        if (i2 == 3) {
            return new C2421m0();
        }
        y2y0 y2y0Var = null;
        if (i2 == 4) {
            return new t2y0(y2y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
