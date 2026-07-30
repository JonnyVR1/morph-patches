package com.google.android.gms.internal.ads;

import p153l.aes0;
import p153l.aix0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.wds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2200k0 extends AbstractC2245p5 implements gkx0 {
    private static final C2200k0 zzb;
    private int zzd;
    private int zze;
    private aix0 zzf = AbstractC2245p5.m13222s();

    static {
        C2200k0 c2200k0 = new C2200k0();
        zzb = c2200k0;
        AbstractC2245p5.m13213C(C2200k0.class, c2200k0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzd", "zze", wds0.f188633a, "zzf"});
        }
        if (i2 == 3) {
            return new C2200k0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new aes0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
