package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.brr0;
import p149l.mqr0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C2176k extends AbstractC2222p5 implements abx0 {
    private static final C2176k zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        C2176k c2176k = new C2176k();
        zzb = c2176k;
        AbstractC2222p5.m13159C(C2176k.class, c2176k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", brr0.f76937a});
        }
        if (i2 == 3) {
            return new C2176k();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new mqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
