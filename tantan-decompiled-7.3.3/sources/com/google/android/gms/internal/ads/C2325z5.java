package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jmx0;
import p153l.kmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2325z5 extends AbstractC2245p5 implements gkx0 {
    private static final C2325z5 zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        C2325z5 c2325z5 = new C2325z5();
        zzb = c2325z5;
        AbstractC2245p5.m13213C(C2325z5.class, c2325z5);
    }

    /* JADX INFO: renamed from: L */
    public static kmx0 m13582L() {
        return (kmx0) zzb.m13240j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2325z5();
        }
        jmx0 jmx0Var = null;
        if (i2 == 4) {
            return new kmx0(jmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
