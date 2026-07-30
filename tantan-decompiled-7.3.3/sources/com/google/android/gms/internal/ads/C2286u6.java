package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.kox0;
import p153l.lox0;
import p153l.mmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2286u6 extends AbstractC2245p5 implements gkx0 {
    private static final C2286u6 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C2286u6 c2286u6 = new C2286u6();
        zzb = c2286u6;
        AbstractC2245p5.m13213C(C2286u6.class, c2286u6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", lox0.f132961a, "zzf"});
        }
        if (i2 == 3) {
            return new C2286u6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new kox0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
