package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.ybx0;
import p153l.zbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2196j4 extends AbstractC2245p5 implements gkx0 {
    private static final C2196j4 zzb;
    private int zzd;

    static {
        C2196j4 c2196j4 = new C2196j4();
        zzb = c2196j4;
        AbstractC2245p5.m13213C(C2196j4.class, c2196j4);
    }

    /* JADX INFO: renamed from: M */
    public static zbx0 m12830M() {
        return (zbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2196j4 m12832O() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C2196j4();
        }
        ybx0 ybx0Var = null;
        if (i2 == 4) {
            return new zbx0(ybx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12834L() {
        return this.zzd;
    }
}
