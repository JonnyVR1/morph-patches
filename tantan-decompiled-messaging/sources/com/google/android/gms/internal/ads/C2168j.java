package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.dqr0;
import p149l.lqr0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2168j extends AbstractC2222p5 implements abx0 {
    private static final C2168j zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        C2168j c2168j = new C2168j();
        zzb = c2168j;
        AbstractC2222p5.m13159C(C2168j.class, c2168j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", dqr0.f87497a, "zzf"});
        }
        if (i2 == 3) {
            return new C2168j();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new lqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
