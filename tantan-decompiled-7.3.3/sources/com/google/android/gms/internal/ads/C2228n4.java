package com.google.android.gms.internal.ads;

import p153l.gcx0;
import p153l.gkx0;
import p153l.hcx0;
import p153l.jhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2228n4 extends AbstractC2245p5 implements gkx0 {
    private static final C2228n4 zzb;
    private int zzd;
    private int zze;

    static {
        C2228n4 c2228n4 = new C2228n4();
        zzb = c2228n4;
        AbstractC2245p5.m13213C(C2228n4.class, c2228n4);
    }

    /* JADX INFO: renamed from: N */
    public static hcx0 m13084N() {
        return (hcx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: P */
    public static C2228n4 m13086P(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2228n4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i2 == 3) {
            return new C2228n4();
        }
        gcx0 gcx0Var = null;
        if (i2 == 4) {
            return new hcx0(gcx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13088L() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: M */
    public final int m13089M() {
        return this.zze;
    }
}
