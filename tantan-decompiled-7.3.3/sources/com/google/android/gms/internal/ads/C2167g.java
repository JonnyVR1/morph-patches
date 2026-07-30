package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.gkx0;
import p153l.hzr0;
import p153l.lzr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2167g extends AbstractC2245p5 implements gkx0 {
    private static final C2167g zzb;
    private int zzd;
    private int zze;

    static {
        C2167g c2167g = new C2167g();
        zzb = c2167g;
        AbstractC2245p5.m13213C(C2167g.class, c2167g);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", lzr0.f134262a});
        }
        if (i2 == 3) {
            return new C2167g();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new hzr0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
