package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mcs0;
import p153l.pfs0;
import p153l.wds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2128b1 extends AbstractC2245p5 implements gkx0 {
    private static final C2128b1 zzb;
    private int zzd;
    private int zze = 1000;
    private C2312y0 zzf;
    private C2280u0 zzg;

    static {
        C2128b1 c2128b1 = new C2128b1();
        zzb = c2128b1;
        AbstractC2245p5.m13213C(C2128b1.class, c2128b1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", wds0.f188633a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2128b1();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new pfs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
