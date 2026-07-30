package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mmx0;
import p153l.qmx0;
import p153l.rmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2133b6 extends AbstractC2245p5 implements gkx0 {
    private static final C2133b6 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgyl zzg = zzgyl.zzb;

    static {
        C2133b6 c2133b6 = new C2133b6();
        zzb = c2133b6;
        AbstractC2245p5.m13213C(C2133b6.class, c2133b6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", rmx0.f163944a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2133b6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new qmx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
