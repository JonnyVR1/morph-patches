package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.w1x0;
import p149l.x1x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2099a4 extends AbstractC2222p5 implements abx0 {
    private static final C2099a4 zzb;
    private int zzd;
    private int zze;
    private C2108b4 zzf;

    static {
        C2099a4 c2099a4 = new C2099a4();
        zzb = c2099a4;
        AbstractC2222p5.m13159C(C2099a4.class, c2099a4);
    }

    /* JADX INFO: renamed from: M */
    public static x1x0 m12509M() {
        return (x1x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2099a4 m12511O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2099a4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12513R(C2099a4 c2099a4, C2108b4 c2108b4) {
        c2108b4.getClass();
        c2099a4.zzf = c2108b4;
        c2099a4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2099a4();
        }
        w1x0 w1x0Var = null;
        if (i2 == 4) {
            return new x1x0(w1x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12514L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final C2108b4 m12515P() {
        C2108b4 c2108b4 = this.zzf;
        return c2108b4 == null ? C2108b4.m12536O() : c2108b4;
    }
}
