package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d8x0;
import p149l.fxr0;
import p149l.gxr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C2256u extends AbstractC2222p5 implements abx0 {
    private static final C2256u zzb;
    private int zzd;
    private C2264v zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        C2256u c2256u = new C2256u();
        zzb = c2256u;
        AbstractC2222p5.m13159C(C2256u.class, c2256u);
    }

    public C2256u() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    /* JADX INFO: renamed from: M */
    public static C2256u m13331M(zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        return (C2256u) AbstractC2222p5.m13165p(zzb, zzgylVar, d8x0Var);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2256u();
        }
        fxr0 fxr0Var = null;
        if (i2 == 4) {
            return new gxr0(fxr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: N */
    public final C2264v m13332N() {
        C2264v c2264v = this.zze;
        return c2264v == null ? C2264v.m13357Q() : c2264v;
    }

    /* JADX INFO: renamed from: O */
    public final zzgyl m13333O() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: P */
    public final zzgyl m13334P() {
        return this.zzf;
    }
}
