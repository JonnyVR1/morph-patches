package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.c4s0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.t8x0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2129e0 extends AbstractC2222p5 implements abx0 {
    private static final C2129e0 zzb;
    private int zzd;
    private String zze = "";
    private z9x0 zzf = AbstractC2222p5.m13172w();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        C2129e0 c2129e0 = new C2129e0();
        zzb = c2129e0;
        AbstractC2222p5.m13159C(C2129e0.class, c2129e0);
    }

    /* JADX INFO: renamed from: M */
    public static C2129e0 m12668M() {
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12669N(C2129e0 c2129e0, String str) {
        str.getClass();
        c2129e0.zzd |= 1;
        c2129e0.zze = str;
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
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", C2113c0.class, "zzg", t8x0Var, "zzh", t8x0Var, "zzi", t8x0Var});
        }
        if (i2 == 3) {
            return new C2129e0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new c4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
