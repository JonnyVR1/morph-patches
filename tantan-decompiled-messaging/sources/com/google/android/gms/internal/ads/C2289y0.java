package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.y5s0;
import p149l.z5s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2289y0 extends AbstractC2222p5 implements abx0 {
    private static final C2289y0 zzb;
    private int zzd;
    private int zze;

    static {
        C2289y0 c2289y0 = new C2289y0();
        zzb = c2289y0;
        AbstractC2222p5.m13159C(C2289y0.class, c2289y0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", z5s0.f201845a});
        }
        if (i2 == 3) {
            return new C2289y0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new y5s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
