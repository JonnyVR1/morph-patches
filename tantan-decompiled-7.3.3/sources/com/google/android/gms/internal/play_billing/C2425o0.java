package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.g5y0;
import p153l.r4y0;
import p153l.w4y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2425o0 extends AbstractC2403d0 implements dwx0 {
    private static final C2425o0 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        C2425o0 c2425o0 = new C2425o0();
        zzb = c2425o0;
        AbstractC2403d0.m14818v(C2425o0.class, c2425o0);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14958A(C2425o0 c2425o0, String str) {
        str.getClass();
        c2425o0.zzd |= 2;
        c2425o0.zzf = str;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m14959B(C2425o0 c2425o0, int i) {
        c2425o0.zzd |= 1;
        c2425o0.zze = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m14960C(C2425o0 c2425o0, int i) {
        c2425o0.zzg = i - 1;
        c2425o0.zzd |= 4;
    }

    /* JADX INFO: renamed from: D */
    public static r4y0 m14961D() {
        return (r4y0) zzb.m14825j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14963z(C2425o0 c2425o0, String str) {
        c2425o0.zzd |= 8;
        c2425o0.zzh = str;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", w4y0.f187452a, "zzh"});
        }
        if (i2 == 3) {
            return new C2425o0();
        }
        g5y0 g5y0Var = null;
        if (i2 == 4) {
            return new r4y0(g5y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
