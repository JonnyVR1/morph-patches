package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.e5x0;
import p149l.f5x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2150g5 extends AbstractC2222p5 implements abx0 {
    private static final C2150g5 zzb;
    private int zzd;

    static {
        C2150g5 c2150g5 = new C2150g5();
        zzb = c2150g5;
        AbstractC2222p5.m13159C(C2150g5.class, c2150g5);
    }

    /* JADX INFO: renamed from: N */
    public static C2150g5 m12721N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static C2150g5 m12722O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2150g5) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C2150g5();
        }
        e5x0 e5x0Var = null;
        if (i2 == 4) {
            return new f5x0(e5x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12723L() {
        return this.zzd;
    }
}
