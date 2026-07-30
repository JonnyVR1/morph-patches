package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gex0;
import p153l.gkx0;
import p153l.hex0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e5 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2157e5 extends AbstractC2245p5 implements gkx0 {
    private static final C2157e5 zzb;
    private String zzd = "";
    private fjx0 zze = AbstractC2245p5.m13226w();

    static {
        C2157e5 c2157e5 = new C2157e5();
        zzb = c2157e5;
        AbstractC2245p5.m13213C(C2157e5.class, c2157e5);
    }

    /* JADX INFO: renamed from: M */
    public static C2157e5 m12734M() {
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
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", C2292v4.class});
        }
        if (i2 == 3) {
            return new C2157e5();
        }
        gex0 gex0Var = null;
        if (i2 == 4) {
            return new hex0(gex0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
