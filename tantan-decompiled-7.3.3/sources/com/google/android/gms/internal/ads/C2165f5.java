package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.iex0;
import p153l.jex0;
import p153l.jhx0;
import p153l.lkx0;
import p153l.thx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2165f5 extends AbstractC2245p5 implements gkx0 {
    private static final C2165f5 zzb;
    private static volatile lkx0 zzd;
    private int zze;
    private zzgyl zzf = zzgyl.zzb;

    static {
        C2165f5 c2165f5 = new C2165f5();
        zzb = c2165f5;
        AbstractC2245p5.m13213C(C2165f5.class, c2165f5);
    }

    /* JADX INFO: renamed from: M */
    public static jex0 m12755M() {
        return (jex0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2165f5 m12757O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2165f5) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static lkx0 m12758Q() {
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
            return new C2165f5();
        }
        iex0 iex0Var = null;
        if (i2 == 4) {
            return new jex0(iex0Var);
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
        synchronized (C2165f5.class) {
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
    public final int m12760L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m12761P() {
        return this.zzf;
    }
}
