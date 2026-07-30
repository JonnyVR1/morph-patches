package com.google.android.gms.internal.ads;

import p153l.bes0;
import p153l.fjx0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.wds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2208l0 extends AbstractC2245p5 implements gkx0 {
    private static final C2208l0 zzb;
    private int zzd;
    private C2192j0 zze;
    private fjx0 zzf = AbstractC2245p5.m13226w();
    private int zzg;
    private C2280u0 zzh;

    static {
        C2208l0 c2208l0 = new C2208l0();
        zzb = c2208l0;
        AbstractC2245p5.m13213C(C2208l0.class, c2208l0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", C2272t0.class, "zzg", wds0.f188633a, "zzh"});
        }
        if (i2 == 3) {
            return new C2208l0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new bes0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
