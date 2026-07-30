package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.q2x0;
import p149l.r2x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2165i4 extends AbstractC2222p5 implements abx0 {
    private static final C2165i4 zzb;
    private int zzd;
    private C2173j4 zze;
    private int zzf;

    static {
        C2165i4 c2165i4 = new C2165i4();
        zzb = c2165i4;
        AbstractC2222p5.m13159C(C2165i4.class, c2165i4);
    }

    /* JADX INFO: renamed from: M */
    public static r2x0 m12763M() {
        return (r2x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static C2165i4 m12765O(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2165i4) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12766Q(C2165i4 c2165i4, C2173j4 c2173j4) {
        c2173j4.getClass();
        c2165i4.zze = c2173j4;
        c2165i4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2165i4();
        }
        q2x0 q2x0Var = null;
        if (i2 == 4) {
            return new r2x0(q2x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12768L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2173j4 m12769P() {
        C2173j4 c2173j4 = this.zze;
        return c2173j4 == null ? C2173j4.m12778O() : c2173j4;
    }
}
