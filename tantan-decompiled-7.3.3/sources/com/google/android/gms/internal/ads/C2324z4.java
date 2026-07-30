package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.pdx0;
import p153l.qdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2324z4 extends AbstractC2245p5 implements gkx0 {
    private static final C2324z4 zzb;
    private int zzd;
    private fjx0 zze = AbstractC2245p5.m13226w();

    static {
        C2324z4 c2324z4 = new C2324z4();
        zzb = c2324z4;
        AbstractC2245p5.m13213C(C2324z4.class, c2324z4);
    }

    /* JADX INFO: renamed from: L */
    public static qdx0 m13578L() {
        return (qdx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13581O(C2324z4 c2324z4, C2316y4 c2316y4) {
        c2316y4.getClass();
        fjx0 fjx0Var = c2324z4.zze;
        if (!fjx0Var.zzc()) {
            c2324z4.zze = AbstractC2245p5.m13227x(fjx0Var);
        }
        c2324z4.zze.add(c2316y4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C2316y4.class});
        }
        if (i2 == 3) {
            return new C2324z4();
        }
        pdx0 pdx0Var = null;
        if (i2 == 4) {
            return new qdx0(pdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
