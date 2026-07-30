package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.hds0;
import p153l.mcs0;
import p153l.wds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2144d0 extends AbstractC2245p5 implements gkx0 {
    private static final C2144d0 zzb;
    private int zzd;
    private String zze = "";
    private fjx0 zzf = AbstractC2245p5.m13226w();
    private int zzg;

    static {
        C2144d0 c2144d0 = new C2144d0();
        zzb = c2144d0;
        AbstractC2245p5.m13213C(C2144d0.class, c2144d0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", C2136c0.class, "zzg", wds0.f188633a});
        }
        if (i2 == 3) {
            return new C2144d0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new hds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
