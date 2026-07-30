package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.lkx0;
import p153l.sdx0;
import p153l.tdx0;
import p153l.thx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2123a5 extends AbstractC2245p5 implements gkx0 {
    private static final C2123a5 zzb;
    private static volatile lkx0 zzd;
    private int zze;
    private int zzf;
    private C2132b5 zzg;

    static {
        C2123a5 c2123a5 = new C2123a5();
        zzb = c2123a5;
        AbstractC2245p5.m13213C(C2123a5.class, c2123a5);
    }

    /* JADX INFO: renamed from: M */
    public static tdx0 m12570M() {
        return (tdx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2123a5 m12572O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2123a5) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static lkx0 m12573Q() {
        return (lkx0) zzb.mo12560H(7, null, null);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12574R(C2123a5 c2123a5, C2132b5 c2132b5) {
        c2132b5.getClass();
        c2123a5.zzg = c2132b5;
        c2123a5.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        lkx0 thx0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2123a5();
        }
        sdx0 sdx0Var = null;
        if (i2 == 4) {
            return new tdx0(sdx0Var);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        lkx0 lkx0Var = zzd;
        if (lkx0Var != null) {
            return lkx0Var;
        }
        synchronized (C2123a5.class) {
            try {
                thx0Var = zzd;
                if (thx0Var == null) {
                    thx0Var = new thx0(zzb);
                    zzd = thx0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return thx0Var;
    }

    /* JADX INFO: renamed from: L */
    public final int m12575L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2132b5 m12576P() {
        C2132b5 c2132b5 = this.zzg;
        return c2132b5 == null ? C2132b5.m12595N() : c2132b5;
    }
}
