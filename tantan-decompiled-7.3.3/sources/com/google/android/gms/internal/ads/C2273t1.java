package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.qew0;
import p153l.rew0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2273t1 extends AbstractC2245p5 implements gkx0 {
    private static final C2273t1 zzb;
    private fjx0 zzd = AbstractC2245p5.m13226w();

    static {
        C2273t1 c2273t1 = new C2273t1();
        zzb = c2273t1;
        AbstractC2245p5.m13213C(C2273t1.class, c2273t1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2265s1.class});
        }
        if (i2 == 3) {
            return new C2273t1();
        }
        qew0 qew0Var = null;
        if (i2 == 4) {
            return new rew0(qew0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
