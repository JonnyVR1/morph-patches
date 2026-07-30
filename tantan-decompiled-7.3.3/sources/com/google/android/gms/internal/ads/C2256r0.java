package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mcs0;
import p153l.xes0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2256r0 extends AbstractC2245p5 implements gkx0 {
    private static final C2256r0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2256r0 c2256r0 = new C2256r0();
        zzb = c2256r0;
        AbstractC2245p5.m13213C(C2256r0.class, c2256r0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2256r0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new xes0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
