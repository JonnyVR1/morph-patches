package com.google.android.gms.internal.ads;

import p153l.acx0;
import p153l.bcx0;
import p153l.gkx0;
import p153l.jhx0;
import p153l.lkx0;
import p153l.thx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2204k4 extends AbstractC2245p5 implements gkx0 {
    private static final C2204k4 zzb;
    private static volatile lkx0 zzd;
    private int zze;
    private zzgyl zzf = zzgyl.zzb;

    static {
        C2204k4 c2204k4 = new C2204k4();
        zzb = c2204k4;
        AbstractC2245p5.m13213C(C2204k4.class, c2204k4);
    }

    /* JADX INFO: renamed from: M */
    public static bcx0 m12874M() {
        return (bcx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2204k4 m12876O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2204k4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static lkx0 m12877Q() {
        return (lkx0) zzb.mo12560H(7, null, null);
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
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2204k4();
        }
        acx0 acx0Var = null;
        if (i2 == 4) {
            return new bcx0(acx0Var);
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
        synchronized (C2204k4.class) {
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
    public final int m12879L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m12880P() {
        return this.zzf;
    }
}
