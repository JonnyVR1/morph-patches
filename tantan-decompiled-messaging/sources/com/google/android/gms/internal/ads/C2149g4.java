package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.m2x0;
import p149l.n2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2149g4 extends AbstractC2222p5 implements abx0 {
    private static final C2149g4 zzb;
    private int zzd;

    static {
        C2149g4 c2149g4 = new C2149g4();
        zzb = c2149g4;
        AbstractC2222p5.m13159C(C2149g4.class, c2149g4);
    }

    /* JADX INFO: renamed from: M */
    public static n2x0 m12715M() {
        return (n2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2149g4 m12717O() {
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
            return new C2149g4();
        }
        m2x0 m2x0Var = null;
        if (i2 == 4) {
            return new n2x0(m2x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12719L() {
        return this.zzd;
    }
}
