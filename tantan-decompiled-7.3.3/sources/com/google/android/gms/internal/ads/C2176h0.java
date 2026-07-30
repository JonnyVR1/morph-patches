package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.lds0;
import p153l.mcs0;
import p153l.mds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2176h0 extends AbstractC2245p5 implements gkx0 {
    private static final C2176h0 zzb;
    private int zzd;
    private int zze;
    private C2288v0 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        C2176h0 c2176h0 = new C2176h0();
        zzb = c2176h0;
        AbstractC2245p5.m13213C(C2176h0.class, c2176h0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", mds0.f136408a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2176h0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new lds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
