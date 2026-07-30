package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.kew0;
import p153l.lew0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2257r1 extends AbstractC2245p5 implements gkx0 {
    private static final C2257r1 zzb;
    private fjx0 zzd = AbstractC2245p5.m13226w();

    static {
        C2257r1 c2257r1 = new C2257r1();
        zzb = c2257r1;
        AbstractC2245p5.m13213C(C2257r1.class, c2257r1);
    }

    /* JADX INFO: renamed from: M */
    public static lew0 m13273M() {
        return (lew0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13276P(C2257r1 c2257r1, C2249q1 c2249q1) {
        c2249q1.getClass();
        fjx0 fjx0Var = c2257r1.zzd;
        if (!fjx0Var.zzc()) {
            c2257r1.zzd = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2257r1.zzd.add(c2249q1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2249q1.class});
        }
        if (i2 == 3) {
            return new C2257r1();
        }
        kew0 kew0Var = null;
        if (i2 == 4) {
            return new lew0(kew0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13277L() {
        return this.zzd.size();
    }
}
