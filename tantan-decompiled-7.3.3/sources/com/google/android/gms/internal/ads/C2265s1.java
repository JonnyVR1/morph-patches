package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.oew0;
import p153l.pew0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2265s1 extends AbstractC2245p5 implements gkx0 {
    private static final C2265s1 zzb;
    private int zzd;
    private int zzf;
    private String zze = "";
    private String zzg = "";

    static {
        C2265s1 c2265s1 = new C2265s1();
        zzb = c2265s1;
        AbstractC2245p5.m13213C(C2265s1.class, c2265s1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2265s1();
        }
        oew0 oew0Var = null;
        if (i2 == 4) {
            return new pew0(oew0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
