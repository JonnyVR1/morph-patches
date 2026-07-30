package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.kew0;
import p153l.mew0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2249q1 extends AbstractC2245p5 implements gkx0 {
    private static final C2249q1 zzb;
    private int zzd;
    private C2241p1 zze;

    static {
        C2249q1 c2249q1 = new C2249q1();
        zzb = c2249q1;
        AbstractC2245p5.m13213C(C2249q1.class, c2249q1);
    }

    /* JADX INFO: renamed from: L */
    public static mew0 m13249L() {
        return (mew0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13251N(C2249q1 c2249q1, C2241p1 c2241p1) {
        c2241p1.getClass();
        c2249q1.zze = c2241p1;
        c2249q1.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2249q1();
        }
        kew0 kew0Var = null;
        if (i2 == 4) {
            return new mew0(kew0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
