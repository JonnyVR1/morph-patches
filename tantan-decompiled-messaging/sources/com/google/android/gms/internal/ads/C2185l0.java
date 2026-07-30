package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.v4s0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2185l0 extends AbstractC2222p5 implements abx0 {
    private static final C2185l0 zzb;
    private int zzd;
    private C2169j0 zze;
    private z9x0 zzf = AbstractC2222p5.m13172w();
    private int zzg;
    private C2257u0 zzh;

    static {
        C2185l0 c2185l0 = new C2185l0();
        zzb = c2185l0;
        AbstractC2222p5.m13159C(C2185l0.class, c2185l0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C2249t0.class, "zzg", q4s0.f152670a, "zzh"});
        }
        if (i2 == 3) {
            return new C2185l0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new v4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
