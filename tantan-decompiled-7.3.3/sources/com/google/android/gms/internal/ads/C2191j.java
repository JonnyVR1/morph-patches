package com.google.android.gms.internal.ads;

import p153l.ezr0;
import p153l.gkx0;
import p153l.jzr0;
import p153l.rzr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2191j extends AbstractC2245p5 implements gkx0 {
    private static final C2191j zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        C2191j c2191j = new C2191j();
        zzb = c2191j;
        AbstractC2245p5.m13213C(C2191j.class, c2191j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", jzr0.f123312a, "zzf"});
        }
        if (i2 == 3) {
            return new C2191j();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new rzr0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
