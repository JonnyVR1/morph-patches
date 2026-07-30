package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.ibx0;
import p153l.jbx0;
import p153l.jhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2148d4 extends AbstractC2245p5 implements gkx0 {
    private static final C2148d4 zzb;
    private int zzd;
    private C2164f4 zze;
    private C2260r4 zzf;

    static {
        C2148d4 c2148d4 = new C2148d4();
        zzb = c2148d4;
        AbstractC2245p5.m13213C(C2148d4.class, c2148d4);
    }

    /* JADX INFO: renamed from: L */
    public static jbx0 m12702L() {
        return (jbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static C2148d4 m12704N(zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        return (C2148d4) AbstractC2245p5.m13219p(zzb, zzgylVar, jhx0Var);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12705Q(C2148d4 c2148d4, C2164f4 c2164f4) {
        c2164f4.getClass();
        c2148d4.zze = c2164f4;
        c2148d4.zzd |= 1;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m12706R(C2148d4 c2148d4, C2260r4 c2260r4) {
        c2260r4.getClass();
        c2148d4.zzf = c2260r4;
        c2148d4.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2148d4();
        }
        ibx0 ibx0Var = null;
        if (i2 == 4) {
            return new jbx0(ibx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public final C2164f4 m12707O() {
        C2164f4 c2164f4 = this.zze;
        return c2164f4 == null ? C2164f4.m12750O() : c2164f4;
    }

    /* JADX INFO: renamed from: P */
    public final C2260r4 m12708P() {
        C2260r4 c2260r4 = this.zzf;
        return c2260r4 == null ? C2260r4.m13280P() : c2260r4;
    }
}
