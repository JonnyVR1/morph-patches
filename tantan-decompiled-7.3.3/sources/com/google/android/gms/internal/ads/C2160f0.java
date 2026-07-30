package com.google.android.gms.internal.ads;

import p153l.fjx0;
import p153l.gkx0;
import p153l.jds0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2160f0 extends AbstractC2245p5 implements gkx0 {
    private static final C2160f0 zzb;
    private int zzd;
    private int zze;
    private C2280u0 zzf;
    private C2280u0 zzg;
    private C2280u0 zzh;
    private fjx0 zzi = AbstractC2245p5.m13226w();
    private int zzj;

    static {
        C2160f0 c2160f0 = new C2160f0();
        zzb = c2160f0;
        AbstractC2245p5.m13213C(C2160f0.class, c2160f0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C2280u0.class, "zzj"});
        }
        if (i2 == 3) {
            return new C2160f0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new jds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
