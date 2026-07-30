package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mbx0;
import p153l.nbx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2164f4 extends AbstractC2245p5 implements gkx0 {
    private static final C2164f4 zzb;
    private int zzd;
    private C2172g4 zze;
    private int zzf;

    static {
        C2164f4 c2164f4 = new C2164f4();
        zzb = c2164f4;
        AbstractC2245p5.m13213C(C2164f4.class, c2164f4);
    }

    /* JADX INFO: renamed from: M */
    public static nbx0 m12748M() {
        return (nbx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: O */
    public static C2164f4 m12750O() {
        return zzb;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m12751Q(C2164f4 c2164f4, C2172g4 c2172g4) {
        c2172g4.getClass();
        c2164f4.zze = c2172g4;
        c2164f4.zzd |= 1;
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
            return new C2164f4();
        }
        mbx0 mbx0Var = null;
        if (i2 == 4) {
            return new nbx0(mbx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final int m12753L() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: P */
    public final C2172g4 m12754P() {
        C2172g4 c2172g4 = this.zze;
        return c2172g4 == null ? C2172g4.m12771O() : c2172g4;
    }
}
