package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.c2x0;
import p149l.d2x0;
import p149l.d8x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2125d4 extends AbstractC2222p5 implements abx0 {
    private static final C2125d4 zzb;
    private int zzd;
    private C2141f4 zze;
    private C2237r4 zzf;

    static {
        C2125d4 c2125d4 = new C2125d4();
        zzb = c2125d4;
        AbstractC2222p5.m13159C(C2125d4.class, c2125d4);
    }

    /* JADX INFO: renamed from: L */
    public static d2x0 m12648L() {
        return (d2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static C2125d4 m12650N(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2125d4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12651Q(C2125d4 c2125d4, C2141f4 c2141f4) {
        c2141f4.getClass();
        c2125d4.zze = c2141f4;
        c2125d4.zzd |= 1;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12652R(C2125d4 c2125d4, C2237r4 c2237r4) {
        c2237r4.getClass();
        c2125d4.zzf = c2237r4;
        c2125d4.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2125d4();
        }
        c2x0 c2x0Var = null;
        if (i2 == 4) {
            return new d2x0(c2x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public final C2141f4 m12653O() {
        C2141f4 c2141f4 = this.zze;
        return c2141f4 == null ? C2141f4.m12696O() : c2141f4;
    }

    /* JADX INFO: renamed from: P */
    public final C2237r4 m12654P() {
        C2237r4 c2237r4 = this.zzf;
        return c2237r4 == null ? C2237r4.m13226P() : c2237r4;
    }
}
