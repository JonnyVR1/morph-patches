package com.google.android.gms.internal.ads;

import p153l.ccx0;
import p153l.dcx0;
import p153l.gkx0;
import p153l.jhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2212l4 extends AbstractC2245p5 implements gkx0 {
    private static final C2212l4 zzb;
    private int zzd;
    private int zze;

    static {
        C2212l4 c2212l4 = new C2212l4();
        zzb = c2212l4;
        AbstractC2245p5.m13213C(C2212l4.class, c2212l4);
    }

    /* JADX INFO: renamed from: N */
    public static dcx0 m12920N() {
        return (dcx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: P */
    public static C2212l4 m12922P(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2212l4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2212l4();
        }
        ccx0 ccx0Var = null;
        if (i2 == 4) {
            return new dcx0(ccx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12924L() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: M */
    public final int m12925M() {
        return this.zze;
    }
}
