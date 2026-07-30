package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.gkx0;
import p153l.nzr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C2183i extends AbstractC2245p5 implements gkx0 {
    private static final C2183i zzb;
    private int zzd;
    private long zze = -1;

    static {
        C2183i c2183i = new C2183i();
        zzb = c2183i;
        AbstractC2245p5.m13213C(C2183i.class, c2183i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2183i();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new nzr0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
