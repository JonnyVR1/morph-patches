package com.google.android.gms.internal.play_billing;

import p149l.m0y0;
import p149l.r0y0;
import p149l.xmx0;
import p149l.y0y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2414u0 extends AbstractC2380d0 implements xmx0 {
    private static final C2414u0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C2414u0 c2414u0 = new C2414u0();
        zzb = c2414u0;
        AbstractC2380d0.m14764v(C2414u0.class, c2414u0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", r0y0.f157211a, "zzf"});
        }
        if (i2 == 3) {
            return new C2414u0();
        }
        y0y0 y0y0Var = null;
        if (i2 == 4) {
            return new m0y0(y0y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
