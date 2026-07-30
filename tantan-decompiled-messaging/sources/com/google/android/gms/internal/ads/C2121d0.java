package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.b4s0;
import p149l.g3s0;
import p149l.q4s0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2121d0 extends AbstractC2222p5 implements abx0 {
    private static final C2121d0 zzb;
    private int zzd;
    private String zze = "";
    private z9x0 zzf = AbstractC2222p5.m13172w();
    private int zzg;

    static {
        C2121d0 c2121d0 = new C2121d0();
        zzb = c2121d0;
        AbstractC2222p5.m13159C(C2121d0.class, c2121d0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", C2113c0.class, "zzg", q4s0.f152670a});
        }
        if (i2 == 3) {
            return new C2121d0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new b4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
