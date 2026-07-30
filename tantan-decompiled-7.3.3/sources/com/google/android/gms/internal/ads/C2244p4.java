package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.pcx0;
import p153l.qcx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2244p4 extends AbstractC2245p5 implements gkx0 {
    private static final C2244p4 zzb;

    static {
        C2244p4 c2244p4 = new C2244p4();
        zzb = c2244p4;
        AbstractC2245p5.m13213C(C2244p4.class, c2244p4);
    }

    /* JADX INFO: renamed from: M */
    public static C2244p4 m13211M() {
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public static C2244p4 m13212N(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2244p4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        pcx0 pcx0Var = null;
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new C2244p4();
        }
        if (i2 == 4) {
            return new qcx0(pcx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
