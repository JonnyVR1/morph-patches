package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mmx0;
import p153l.nnx0;
import p153l.onx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n6 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2230n6 extends AbstractC2245p5 implements gkx0 {
    private static final C2230n6 zzb;
    private int zzd;
    private int zze;
    private C2222m6 zzf;
    private C2222m6 zzg;

    static {
        C2230n6 c2230n6 = new C2230n6();
        zzb = c2230n6;
        AbstractC2245p5.m13213C(C2230n6.class, c2230n6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", onx0.f148237a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2230n6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new nnx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
