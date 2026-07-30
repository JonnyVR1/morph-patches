package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.w2x0;
import p149l.x2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2189l4 extends AbstractC2222p5 implements abx0 {
    private static final C2189l4 zzb;
    private int zzd;
    private int zze;

    static {
        C2189l4 c2189l4 = new C2189l4();
        zzb = c2189l4;
        AbstractC2222p5.m13159C(C2189l4.class, c2189l4);
    }

    /* JADX INFO: renamed from: N */
    public static x2x0 m12866N() {
        return (x2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: P */
    public static C2189l4 m12868P(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2189l4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2189l4();
        }
        w2x0 w2x0Var = null;
        if (i2 == 4) {
            return new x2x0(w2x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12870L() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: M */
    public final int m12871M() {
        return this.zze;
    }
}
