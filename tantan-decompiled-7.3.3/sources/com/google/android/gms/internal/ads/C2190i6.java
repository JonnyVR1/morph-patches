package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.knx0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2190i6 extends AbstractC2245p5 implements gkx0 {
    private static final C2190i6 zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        C2190i6 c2190i6 = new C2190i6();
        zzb = c2190i6;
        AbstractC2245p5.m13213C(C2190i6.class, c2190i6);
    }

    public C2190i6() {
        zzgyl zzgylVar = zzgyl.zzb;
        this.zze = zzgylVar;
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
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2190i6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new knx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
