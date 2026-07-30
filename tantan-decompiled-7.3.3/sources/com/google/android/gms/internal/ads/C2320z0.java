package com.google.android.gms.internal.ads;

import p153l.gfs0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.wds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2320z0 extends AbstractC2245p5 implements gkx0 {
    private static final C2320z0 zzb;
    private int zzd;
    private C2288v0 zze;
    private int zzf = 1000;
    private C2312y0 zzg;
    private C2280u0 zzh;

    static {
        C2320z0 c2320z0 = new C2320z0();
        zzb = c2320z0;
        AbstractC2245p5.m13213C(C2320z0.class, c2320z0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", wds0.f188633a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2320z0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new gfs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
