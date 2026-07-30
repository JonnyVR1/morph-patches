package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.gkx0;
import p153l.j0s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C2247q extends AbstractC2245p5 implements gkx0 {
    private static final C2247q zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgyl zzg = zzgyl.zzb;

    static {
        C2247q c2247q = new C2247q();
        zzb = c2247q;
        AbstractC2245p5.m13213C(C2247q.class, c2247q);
    }

    /* JADX INFO: renamed from: N */
    public static C2247q m13245N() {
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
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2247q();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new j0s0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final long m13246L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m13247O() {
        return (this.zzd & 1) != 0;
    }
}
