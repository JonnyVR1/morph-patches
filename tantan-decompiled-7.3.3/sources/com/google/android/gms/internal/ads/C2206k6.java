package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mmx0;
import p153l.mnx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2206k6 extends AbstractC2245p5 implements gkx0 {
    private static final C2206k6 zzb;
    private int zzd;
    private int zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        C2206k6 c2206k6 = new C2206k6();
        zzb = c2206k6;
        AbstractC2245p5.m13213C(C2206k6.class, c2206k6);
    }

    public C2206k6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2206k6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new mnx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
