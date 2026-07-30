package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.oyr0;
import p153l.pyr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2143d extends AbstractC2245p5 implements gkx0 {
    private static final C2143d zzb;
    private int zzd;
    private C2151e zze;
    private C2159f zzf;

    static {
        C2143d c2143d = new C2143d();
        zzb = c2143d;
        AbstractC2245p5.m13213C(C2143d.class, c2143d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2143d();
        }
        oyr0 oyr0Var = null;
        if (i2 == 4) {
            return new pyr0(oyr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
