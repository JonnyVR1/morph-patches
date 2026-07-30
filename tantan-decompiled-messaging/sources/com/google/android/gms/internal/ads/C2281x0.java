package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.x5s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2281x0 extends AbstractC2222p5 implements abx0 {
    private static final C2281x0 zzb;
    private int zzd;
    private int zze = 1000;
    private C2289y0 zzf;
    private C2257u0 zzg;

    static {
        C2281x0 c2281x0 = new C2281x0();
        zzb = c2281x0;
        AbstractC2222p5.m13159C(C2281x0.class, c2281x0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", q4s0.f152670a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2281x0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new x5s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
