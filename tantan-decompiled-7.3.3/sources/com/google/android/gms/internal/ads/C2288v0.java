package com.google.android.gms.internal.ads;

import p153l.bfs0;
import p153l.gkx0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2288v0 extends AbstractC2245p5 implements gkx0 {
    private static final C2288v0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2288v0 c2288v0 = new C2288v0();
        zzb = c2288v0;
        AbstractC2245p5.m13213C(C2288v0.class, c2288v0);
    }

    /* JADX INFO: renamed from: L */
    public static bfs0 m13424L() {
        return (bfs0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13426N(C2288v0 c2288v0, int i) {
        c2288v0.zzd |= 1;
        c2288v0.zze = i;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13427O(C2288v0 c2288v0, int i) {
        c2288v0.zzd |= 2;
        c2288v0.zzf = i;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13428P(C2288v0 c2288v0, int i) {
        c2288v0.zzd |= 4;
        c2288v0.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2288v0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new bfs0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
