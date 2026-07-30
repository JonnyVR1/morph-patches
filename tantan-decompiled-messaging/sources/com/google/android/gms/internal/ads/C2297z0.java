package com.google.android.gms.internal.ads;

import p149l.a6s0;
import p149l.abx0;
import p149l.g3s0;
import p149l.q4s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2297z0 extends AbstractC2222p5 implements abx0 {
    private static final C2297z0 zzb;
    private int zzd;
    private C2265v0 zze;
    private int zzf = 1000;
    private C2289y0 zzg;
    private C2257u0 zzh;

    static {
        C2297z0 c2297z0 = new C2297z0();
        zzb = c2297z0;
        AbstractC2222p5.m13159C(C2297z0.class, c2297z0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", q4s0.f152670a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2297z0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new a6s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
