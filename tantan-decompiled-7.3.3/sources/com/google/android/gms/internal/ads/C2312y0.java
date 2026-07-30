package com.google.android.gms.internal.ads;

import p153l.efs0;
import p153l.ffs0;
import p153l.gkx0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2312y0 extends AbstractC2245p5 implements gkx0 {
    private static final C2312y0 zzb;
    private int zzd;
    private int zze;

    static {
        C2312y0 c2312y0 = new C2312y0();
        zzb = c2312y0;
        AbstractC2245p5.m13213C(C2312y0.class, c2312y0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", ffs0.f98829a});
        }
        if (i2 == 3) {
            return new C2312y0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new efs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
