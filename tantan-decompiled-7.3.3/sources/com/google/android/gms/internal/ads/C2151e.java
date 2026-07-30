package com.google.android.gms.internal.ads;

import p153l.bzr0;
import p153l.czr0;
import p153l.gkx0;
import p153l.oyr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2151e extends AbstractC2245p5 implements gkx0 {
    private static final C2151e zzb;
    private int zzd;
    private int zze = 2;

    static {
        C2151e c2151e = new C2151e();
        zzb = c2151e;
        AbstractC2245p5.m13213C(C2151e.class, c2151e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", czr0.f84494a});
        }
        if (i2 == 3) {
            return new C2151e();
        }
        oyr0 oyr0Var = null;
        if (i2 == 4) {
            return new bzr0(oyr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
