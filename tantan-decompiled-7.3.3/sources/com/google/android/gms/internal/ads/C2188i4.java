package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jhx0;
import p153l.wbx0;
import p153l.xbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2188i4 extends AbstractC2245p5 implements gkx0 {
    private static final C2188i4 zzb;
    private int zzd;
    private C2196j4 zze;
    private int zzf;

    static {
        C2188i4 c2188i4 = new C2188i4();
        zzb = c2188i4;
        AbstractC2245p5.m13213C(C2188i4.class, c2188i4);
    }

    /* JADX INFO: renamed from: M */
    public static xbx0 m12817M() {
        return (xbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2188i4 m12819O(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2188i4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12820Q(C2188i4 c2188i4, C2196j4 c2196j4) {
        c2196j4.getClass();
        c2188i4.zze = c2196j4;
        c2188i4.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2188i4();
        }
        wbx0 wbx0Var = null;
        if (i2 == 4) {
            return new xbx0(wbx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12822L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2196j4 m12823P() {
        C2196j4 c2196j4 = this.zze;
        return c2196j4 == null ? C2196j4.m12832O() : c2196j4;
    }
}
