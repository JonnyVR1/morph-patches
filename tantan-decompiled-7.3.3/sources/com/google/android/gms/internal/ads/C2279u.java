package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.l6s0;
import p153l.m6s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C2279u extends AbstractC2245p5 implements gkx0 {
    private static final C2279u zzb;
    private int zzd;
    private C2287v zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        C2279u c2279u = new C2279u();
        zzb = c2279u;
        AbstractC2245p5.m13213C(C2279u.class, c2279u);
    }

    public C2279u() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    /* JADX INFO: renamed from: M */
    public static C2279u m13385M(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2279u) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2279u();
        }
        l6s0 l6s0Var = null;
        if (i2 == 4) {
            return new m6s0(l6s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public final C2287v m13386N() {
        C2287v c2287v = this.zze;
        return c2287v == null ? C2287v.m13411Q() : c2287v;
    }

    /* JADX INFO: renamed from: O */
    public final zzgyl m13387O() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m13388P() {
        return this.zzf;
    }
}
