package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.kex0;
import p153l.lex0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2173g5 extends AbstractC2245p5 implements gkx0 {
    private static final C2173g5 zzb;
    private int zzd;

    static {
        C2173g5 c2173g5 = new C2173g5();
        zzb = c2173g5;
        AbstractC2245p5.m13213C(C2173g5.class, c2173g5);
    }

    /* JADX INFO: renamed from: N */
    public static C2173g5 m12775N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static C2173g5 m12776O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2173g5) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C2173g5();
        }
        kex0 kex0Var = null;
        if (i2 == 4) {
            return new lex0(kex0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12777L() {
        return this.zzd;
    }
}
