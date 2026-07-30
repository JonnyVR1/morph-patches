package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.k6s0;
import p149l.q4s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2114c1 extends AbstractC2222p5 implements abx0 {
    private static final C2114c1 zzb;
    private int zzd;
    private int zze = 1000;
    private C2289y0 zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        C2114c1 c2114c1 = new C2114c1();
        zzb = c2114c1;
        AbstractC2222p5.m13159C(C2114c1.class, c2114c1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", q4s0.f152670a, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C2114c1();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new k6s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
