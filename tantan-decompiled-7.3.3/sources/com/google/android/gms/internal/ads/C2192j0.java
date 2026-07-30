package com.google.android.gms.internal.ads;

import p153l.aix0;
import p153l.gkx0;
import p153l.mcs0;
import p153l.wds0;
import p153l.zds0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2192j0 extends AbstractC2245p5 implements gkx0 {
    private static final C2192j0 zzb;
    private int zzd;
    private int zzf;
    private C2280u0 zzh;
    private String zze = "";
    private aix0 zzg = AbstractC2245p5.m13222s();

    static {
        C2192j0 c2192j0 = new C2192j0();
        zzb = c2192j0;
        AbstractC2245p5.m13213C(C2192j0.class, c2192j0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", wds0.f188633a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2192j0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new zds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
