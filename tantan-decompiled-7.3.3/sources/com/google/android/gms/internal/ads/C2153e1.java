package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mcs0;
import p153l.sfs0;
import p153l.wds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2153e1 extends AbstractC2245p5 implements gkx0 {
    private static final C2153e1 zzb;
    private int zzd;
    private int zze = 1000;
    private C2312y0 zzf;

    static {
        C2153e1 c2153e1 = new C2153e1();
        zzb = c2153e1;
        AbstractC2245p5.m13213C(C2153e1.class, c2153e1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", wds0.f188633a, "zzf"});
        }
        if (i2 == 3) {
            return new C2153e1();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new sfs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
