package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.jmx0;
import p153l.lmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2124a6 extends AbstractC2245p5 implements gkx0 {
    private static final C2124a6 zzb;
    private fjx0 zzd = AbstractC2245p5.m13226w();

    static {
        C2124a6 c2124a6 = new C2124a6();
        zzb = c2124a6;
        AbstractC2245p5.m13213C(C2124a6.class, c2124a6);
    }

    /* JADX INFO: renamed from: L */
    public static lmx0 m12577L() {
        return (lmx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12579N(C2124a6 c2124a6, C2325z5 c2325z5) {
        c2325z5.getClass();
        fjx0 fjx0Var = c2124a6.zzd;
        if (!fjx0Var.zzc()) {
            c2124a6.zzd = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2124a6.zzd.add(c2325z5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2325z5.class});
        }
        if (i2 == 3) {
            return new C2124a6();
        }
        jmx0 jmx0Var = null;
        if (i2 == 4) {
            return new lmx0(jmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
