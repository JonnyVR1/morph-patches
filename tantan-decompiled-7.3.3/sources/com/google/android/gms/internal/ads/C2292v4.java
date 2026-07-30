package com.google.android.gms.internal.ads;

import p153l.fdx0;
import p153l.gkx0;
import p153l.ldx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v4 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2292v4 extends AbstractC2245p5 implements gkx0 {
    private static final C2292v4 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        C2292v4 c2292v4 = new C2292v4();
        zzb = c2292v4;
        AbstractC2245p5.m13213C(C2292v4.class, c2292v4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2292v4();
        }
        fdx0 fdx0Var = null;
        if (i2 == 4) {
            return new ldx0(fdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
