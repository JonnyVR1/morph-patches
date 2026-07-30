package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.j3x0;
import p149l.k3x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2221p4 extends AbstractC2222p5 implements abx0 {
    private static final C2221p4 zzb;

    static {
        C2221p4 c2221p4 = new C2221p4();
        zzb = c2221p4;
        AbstractC2222p5.m13159C(C2221p4.class, c2221p4);
    }

    /* JADX INFO: renamed from: M */
    public static C2221p4 m13157M() {
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public static C2221p4 m13158N(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2221p4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        j3x0 j3x0Var = null;
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new C2221p4();
        }
        if (i2 == 4) {
            return new k3x0(j3x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
