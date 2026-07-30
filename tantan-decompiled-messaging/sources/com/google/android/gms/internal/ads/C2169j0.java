package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.t4s0;
import p149l.u8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2169j0 extends AbstractC2222p5 implements abx0 {
    private static final C2169j0 zzb;
    private int zzd;
    private int zzf;
    private C2257u0 zzh;
    private String zze = "";
    private u8x0 zzg = AbstractC2222p5.m13168s();

    static {
        C2169j0 c2169j0 = new C2169j0();
        zzb = c2169j0;
        AbstractC2222p5.m13159C(C2169j0.class, c2169j0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", q4s0.f152670a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2169j0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new t4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
