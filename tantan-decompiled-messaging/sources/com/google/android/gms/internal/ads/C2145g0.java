package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.e4s0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.t8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2145g0 extends AbstractC2222p5 implements abx0 {
    private static final C2145g0 zzb;
    private int zzd;
    private C2257u0 zzf;
    private int zzg;
    private C2265v0 zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        C2145g0 c2145g0 = new C2145g0();
        zzb = c2145g0;
        AbstractC2222p5.m13159C(C2145g0.class, c2145g0);
    }

    /* JADX INFO: renamed from: M */
    public static C2145g0 m12711M() {
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12712N(C2145g0 c2145g0, String str) {
        c2145g0.zzd |= 1;
        c2145g0.zze = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12713O(C2145g0 c2145g0, C2265v0 c2265v0) {
        c2265v0.getClass();
        c2145g0.zzh = c2265v0;
        c2145g0.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            t8x0 t8x0Var = q4s0.f152670a;
            return AbstractC2222p5.m13175z(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", t8x0Var, "zzk", t8x0Var, "zzl", t8x0Var});
        }
        if (i2 == 3) {
            return new C2145g0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new e4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
