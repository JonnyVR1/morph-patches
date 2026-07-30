package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.gkx0;
import p153l.h0s0;
import p153l.szr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C2199k extends AbstractC2245p5 implements gkx0 {
    private static final C2199k zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        C2199k c2199k = new C2199k();
        zzb = c2199k;
        AbstractC2245p5.m13213C(C2199k.class, c2199k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", h0s0.f107329a});
        }
        if (i2 == 3) {
            return new C2199k();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new szr0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
