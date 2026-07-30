package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.sbx0;
import p153l.tbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2172g4 extends AbstractC2245p5 implements gkx0 {
    private static final C2172g4 zzb;
    private int zzd;

    static {
        C2172g4 c2172g4 = new C2172g4();
        zzb = c2172g4;
        AbstractC2245p5.m13213C(C2172g4.class, c2172g4);
    }

    /* JADX INFO: renamed from: M */
    public static tbx0 m12769M() {
        return (tbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2172g4 m12771O() {
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
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new C2172g4();
        }
        sbx0 sbx0Var = null;
        if (i2 == 4) {
            return new tbx0(sbx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12773L() {
        return this.zzd;
    }
}
