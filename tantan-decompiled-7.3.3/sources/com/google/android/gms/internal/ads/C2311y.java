package com.google.android.gms.internal.ads;

import p153l.bds0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.zcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C2311y extends AbstractC2245p5 implements gkx0 {
    private static final C2311y zzb;
    private int zzd;
    private int zze;
    private C2319z zzf;
    private C2118a0 zzg;

    static {
        C2311y c2311y = new C2311y();
        zzb = c2311y;
        AbstractC2245p5.m13213C(C2311y.class, c2311y);
    }

    /* JADX INFO: renamed from: L */
    public static zcs0 m13533L() {
        return (zcs0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13535N(C2311y c2311y, C2319z c2319z) {
        c2319z.getClass();
        c2311y.zzf = c2319z;
        c2311y.zzd |= 2;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13536O(C2311y c2311y, C2118a0 c2118a0) {
        c2118a0.getClass();
        c2311y.zzg = c2118a0;
        c2311y.zzd |= 4;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13537P(C2311y c2311y, int i) {
        c2311y.zze = 1;
        c2311y.zzd = 1 | c2311y.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", bds0.f76295a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2311y();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new zcs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
