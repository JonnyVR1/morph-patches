package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.mmx0;
import p153l.onx0;
import p153l.pnx0;
import p153l.zhx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2222m6 extends AbstractC2245p5 implements gkx0 {
    private static final C2222m6 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        C2222m6 c2222m6 = new C2222m6();
        zzb = c2222m6;
        AbstractC2245p5.m13213C(C2222m6.class, c2222m6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zhx0 zhx0Var = onx0.f148237a;
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zhx0Var, "zzf", "zzg", zhx0Var});
        }
        if (i2 == 3) {
            return new C2222m6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new pnx0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
