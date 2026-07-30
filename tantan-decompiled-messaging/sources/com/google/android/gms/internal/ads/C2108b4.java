package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.y1x0;
import p149l.z1x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2108b4 extends AbstractC2222p5 implements abx0 {
    private static final C2108b4 zzb;
    private int zzd;

    static {
        C2108b4 c2108b4 = new C2108b4();
        zzb = c2108b4;
        AbstractC2222p5.m13159C(C2108b4.class, c2108b4);
    }

    /* JADX INFO: renamed from: M */
    public static z1x0 m12534M() {
        return (z1x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2108b4 m12536O() {
        return zzb;
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
            return new C2108b4();
        }
        y1x0 y1x0Var = null;
        if (i2 == 4) {
            return new z1x0(y1x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12538L() {
        return this.zzd;
    }
}
