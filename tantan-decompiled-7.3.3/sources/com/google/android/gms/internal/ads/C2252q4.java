package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.lkx0;
import p153l.scx0;
import p153l.tcx0;
import p153l.thx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2252q4 extends AbstractC2245p5 implements gkx0 {
    private static final C2252q4 zzb;
    private static volatile lkx0 zzd;
    private int zze;
    private int zzf;
    private C2268s4 zzg;
    private zzgyl zzh = zzgyl.zzb;

    static {
        C2252q4 c2252q4 = new C2252q4();
        zzb = c2252q4;
        AbstractC2245p5.m13213C(C2252q4.class, c2252q4);
    }

    /* JADX INFO: renamed from: M */
    public static tcx0 m13253M() {
        return (tcx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2252q4 m13255O() {
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public static C2252q4 m13256P(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2252q4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: S */
    public static lkx0 m13257S() {
        return (lkx0) zzb.mo12560H(7, null, null);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m13258T(C2252q4 c2252q4, C2268s4 c2268s4) {
        c2268s4.getClass();
        c2252q4.zzg = c2268s4;
        c2252q4.zze |= 1;
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
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2252q4();
        }
        scx0 scx0Var = null;
        if (i2 == 4) {
            return new tcx0(scx0Var);
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
        synchronized (C2252q4.class) {
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
    public final int m13260L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: Q */
    public final C2268s4 m13261Q() {
        C2268s4 c2268s4 = this.zzg;
        return c2268s4 == null ? C2268s4.m13310P() : c2268s4;
    }

    /* JADX INFO: renamed from: R */
    public final zzgyl m13262R() {
        return this.zzh;
    }
}
