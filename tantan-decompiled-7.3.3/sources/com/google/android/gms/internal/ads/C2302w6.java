package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mmx0;
import p153l.rox0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2302w6 extends AbstractC2245p5 implements gkx0 {
    private static final C2302w6 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C2302w6 c2302w6 = new C2302w6();
        zzb = c2302w6;
        AbstractC2245p5.m13213C(C2302w6.class, c2302w6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2302w6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new rox0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
