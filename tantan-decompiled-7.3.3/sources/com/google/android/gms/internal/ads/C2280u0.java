package com.google.android.gms.internal.ads;

import p153l.afs0;
import p153l.gkx0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2280u0 extends AbstractC2245p5 implements gkx0 {
    private static final C2280u0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2280u0 c2280u0 = new C2280u0();
        zzb = c2280u0;
        AbstractC2245p5.m13213C(C2280u0.class, c2280u0);
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
            return new C2280u0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new afs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
