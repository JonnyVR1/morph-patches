package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.udx0;
import p153l.vdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2132b5 extends AbstractC2245p5 implements gkx0 {
    private static final C2132b5 zzb;
    private String zzd = "";

    static {
        C2132b5 c2132b5 = new C2132b5();
        zzb = c2132b5;
        AbstractC2245p5.m13213C(C2132b5.class, c2132b5);
    }

    /* JADX INFO: renamed from: L */
    public static vdx0 m12593L() {
        return (vdx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static C2132b5 m12595N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static C2132b5 m12596O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2132b5) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12597Q(C2132b5 c2132b5, String str) {
        str.getClass();
        c2132b5.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C2132b5();
        }
        udx0 udx0Var = null;
        if (i2 == 4) {
            return new vdx0(udx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public final String m12598P() {
        return this.zzd;
    }
}
