package com.google.android.gms.internal.ads;

import p153l.gbx0;
import p153l.gkx0;
import p153l.hbx0;
import p153l.jhx0;
import p153l.lkx0;
import p153l.thx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2140c4 extends AbstractC2245p5 implements gkx0 {
    private static final C2140c4 zzb;
    private static volatile lkx0 zzd;
    private int zze;
    private int zzf;
    private C2156e4 zzg;
    private C2252q4 zzh;

    static {
        C2140c4 c2140c4 = new C2140c4();
        zzb = c2140c4;
        AbstractC2245p5.m13213C(C2140c4.class, c2140c4);
    }

    /* JADX INFO: renamed from: M */
    public static hbx0 m12675M() {
        return (hbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2140c4 m12677O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2140c4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: R */
    public static lkx0 m12678R() {
        return (lkx0) zzb.mo12560H(7, null, null);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12679S(C2140c4 c2140c4, C2156e4 c2156e4) {
        c2156e4.getClass();
        c2140c4.zzg = c2156e4;
        c2140c4.zze |= 1;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m12680T(C2140c4 c2140c4, C2252q4 c2252q4) {
        c2252q4.getClass();
        c2140c4.zzh = c2252q4;
        c2140c4.zze |= 2;
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
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2140c4();
        }
        gbx0 gbx0Var = null;
        if (i2 == 4) {
            return new hbx0(gbx0Var);
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
        synchronized (C2140c4.class) {
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
    public final int m12681L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2156e4 m12682P() {
        C2156e4 c2156e4 = this.zzg;
        return c2156e4 == null ? C2156e4.m12727O() : c2156e4;
    }

    /* JADX INFO: renamed from: Q */
    public final C2252q4 m12683Q() {
        C2252q4 c2252q4 = this.zzh;
        return c2252q4 == null ? C2252q4.m13255O() : c2252q4;
    }
}
