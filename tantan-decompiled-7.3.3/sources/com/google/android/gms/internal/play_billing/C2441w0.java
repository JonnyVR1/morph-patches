package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.may0;
import p153l.ray0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2441w0 extends AbstractC2403d0 implements dwx0 {
    private static final C2441w0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C2431r0 zzg;
    private C2433s0 zzh;

    static {
        C2441w0 c2441w0 = new C2441w0();
        zzb = c2441w0;
        AbstractC2403d0.m14818v(C2441w0.class, c2441w0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m15006A(C2441w0 c2441w0, C2423n0 c2423n0) {
        c2441w0.zzf = c2423n0;
        c2441w0.zze = 3;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m15007B(C2441w0 c2441w0, C2427p0 c2427p0) {
        c2427p0.getClass();
        c2441w0.zzf = c2427p0;
        c2441w0.zze = 7;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m15008C(C2441w0 c2441w0, C2431r0 c2431r0) {
        c2431r0.getClass();
        c2441w0.zzg = c2431r0;
        c2441w0.zzd |= 1;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m15009D(C2441w0 c2441w0, C2445y0 c2445y0) {
        c2445y0.getClass();
        c2441w0.zzf = c2445y0;
        c2441w0.zze = 8;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m15010E(C2441w0 c2441w0, C2447z0 c2447z0) {
        c2441w0.zzf = c2447z0;
        c2441w0.zze = 4;
    }

    /* JADX INFO: renamed from: F */
    public static may0 m15011F() {
        return (may0) zzb.m14825j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m15013z(C2441w0 c2441w0, C2421m0 c2421m0) {
        c2441w0.zzf = c2421m0;
        c2441w0.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C2421m0.class, C2423n0.class, C2447z0.class, C2429q0.class, "zzh", C2427p0.class, C2445y0.class});
        }
        if (i2 == 3) {
            return new C2441w0();
        }
        ray0 ray0Var = null;
        if (i2 == 4) {
            return new may0(ray0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
