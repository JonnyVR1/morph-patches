package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.jox0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2278t6 extends AbstractC2245p5 implements gkx0 {
    private static final C2278t6 zzb;
    private int zzd;
    private String zze = "";
    private zzgyl zzf = zzgyl.zzb;

    static {
        C2278t6 c2278t6 = new C2278t6();
        zzb = c2278t6;
        AbstractC2245p5.m13213C(C2278t6.class, c2278t6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2278t6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new jox0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
