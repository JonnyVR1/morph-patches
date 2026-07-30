package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.lkx0;
import p153l.thx0;
import p153l.ubx0;
import p153l.vbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2180h4 extends AbstractC2245p5 implements gkx0 {
    private static final C2180h4 zzb;
    private static volatile lkx0 zzd;
    private int zze;
    private int zzf;
    private C2196j4 zzg;
    private zzgyl zzh = zzgyl.zzb;

    static {
        C2180h4 c2180h4 = new C2180h4();
        zzb = c2180h4;
        AbstractC2245p5.m13213C(C2180h4.class, c2180h4);
    }

    /* JADX INFO: renamed from: M */
    public static vbx0 m12785M() {
        return (vbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2180h4 m12787O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2180h4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: R */
    public static lkx0 m12788R() {
        return (lkx0) zzb.mo12560H(7, null, null);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m12789S(C2180h4 c2180h4, C2196j4 c2196j4) {
        c2196j4.getClass();
        c2180h4.zzg = c2196j4;
        c2180h4.zze |= 1;
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
            return new C2180h4();
        }
        ubx0 ubx0Var = null;
        if (i2 == 4) {
            return new vbx0(ubx0Var);
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
        synchronized (C2180h4.class) {
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
    public final int m12791L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2196j4 m12792P() {
        C2196j4 c2196j4 = this.zzg;
        return c2196j4 == null ? C2196j4.m12832O() : c2196j4;
    }

    /* JADX INFO: renamed from: Q */
    public final zzgyl m12793Q() {
        return this.zzh;
    }
}
