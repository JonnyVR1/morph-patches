package com.google.android.gms.internal.ads;

import p153l.ads0;
import p153l.fjx0;
import p153l.gkx0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2127b0 extends AbstractC2245p5 implements gkx0 {
    private static final C2127b0 zzb;
    private fjx0 zzd = AbstractC2245p5.m13226w();

    static {
        C2127b0 c2127b0 = new C2127b0();
        zzb = c2127b0;
        AbstractC2245p5.m13213C(C2127b0.class, c2127b0);
    }

    /* JADX INFO: renamed from: L */
    public static ads0 m12581L() {
        return (ads0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12583N(C2127b0 c2127b0, C2311y c2311y) {
        c2311y.getClass();
        fjx0 fjx0Var = c2127b0.zzd;
        if (!fjx0Var.zzc()) {
            c2127b0.zzd = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2127b0.zzd.add(c2311y);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2311y.class});
        }
        if (i2 == 3) {
            return new C2127b0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new ads0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
