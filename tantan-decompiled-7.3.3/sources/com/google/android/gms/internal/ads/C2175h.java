package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.gkx0;
import p153l.h0s0;
import p153l.mzr0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2175h extends AbstractC2245p5 implements gkx0 {
    private static final C2175h zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        C2175h c2175h = new C2175h();
        zzb = c2175h;
        AbstractC2245p5.m13213C(C2175h.class, c2175h);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zhx0 zhx0Var = h0s0.f107329a;
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", zhx0Var, "zzg", zhx0Var});
        }
        if (i2 == 3) {
            return new C2175h();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new mzr0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
