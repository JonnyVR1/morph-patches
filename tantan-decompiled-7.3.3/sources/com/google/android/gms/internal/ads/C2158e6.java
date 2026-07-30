package com.google.android.gms.internal.ads;

import p153l.enx0;
import p153l.gkx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2158e6 extends AbstractC2245p5 implements gkx0 {
    private static final C2158e6 zzb;
    private int zzd;
    private zzgyl zze = zzgyl.zzb;

    static {
        C2158e6 c2158e6 = new C2158e6();
        zzb = c2158e6;
        AbstractC2245p5.m13213C(C2158e6.class, c2158e6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2158e6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new enx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
