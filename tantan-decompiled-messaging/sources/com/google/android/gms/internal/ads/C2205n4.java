package com.google.android.gms.internal.ads;

import p149l.a3x0;
import p149l.abx0;
import p149l.b3x0;
import p149l.d8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2205n4 extends AbstractC2222p5 implements abx0 {
    private static final C2205n4 zzb;
    private int zzd;
    private int zze;

    static {
        C2205n4 c2205n4 = new C2205n4();
        zzb = c2205n4;
        AbstractC2222p5.m13159C(C2205n4.class, c2205n4);
    }

    /* JADX INFO: renamed from: N */
    public static b3x0 m13030N() {
        return (b3x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: P */
    public static C2205n4 m13032P(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2205n4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i2 == 3) {
            return new C2205n4();
        }
        a3x0 a3x0Var = null;
        if (i2 == 4) {
            return new b3x0(a3x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m13034L() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: M */
    public final int m13035M() {
        return this.zze;
    }
}
