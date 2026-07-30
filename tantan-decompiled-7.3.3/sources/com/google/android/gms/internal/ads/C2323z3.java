package com.google.android.gms.internal.ads;

import p153l.abx0;
import p153l.bbx0;
import p153l.gkx0;
import p153l.jhx0;
import p153l.lkx0;
import p153l.thx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2323z3 extends AbstractC2245p5 implements gkx0 {
    private static final C2323z3 zzb;
    private static volatile lkx0 zzd;
    private int zze;
    private int zzf;
    private zzgyl zzg = zzgyl.zzb;
    private C2131b4 zzh;

    static {
        C2323z3 c2323z3 = new C2323z3();
        zzb = c2323z3;
        AbstractC2245p5.m13213C(C2323z3.class, c2323z3);
    }

    /* JADX INFO: renamed from: M */
    public static bbx0 m13569M() {
        return (bbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2323z3 m13571O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2323z3) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: R */
    public static lkx0 m13572R() {
        return (lkx0) zzb.mo12560H(7, null, null);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13574T(C2323z3 c2323z3, C2131b4 c2131b4) {
        c2131b4.getClass();
        c2323z3.zzh = c2131b4;
        c2323z3.zze |= 1;
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
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2323z3();
        }
        abx0 abx0Var = null;
        if (i2 == 4) {
            return new bbx0(abx0Var);
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
        synchronized (C2323z3.class) {
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
    public final int m13575L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2131b4 m13576P() {
        C2131b4 c2131b4 = this.zzh;
        return c2131b4 == null ? C2131b4.m12590O() : c2131b4;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m13577Q() {
        return this.zzg;
    }
}
