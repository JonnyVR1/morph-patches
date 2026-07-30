package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mmx0;
import p153l.vox0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2318y6 extends AbstractC2245p5 implements gkx0 {
    private static final C2318y6 zzb;
    private int zzd;
    private String zze = "";

    static {
        C2318y6 c2318y6 = new C2318y6();
        zzb = c2318y6;
        AbstractC2245p5.m13213C(C2318y6.class, c2318y6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2318y6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new vox0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
