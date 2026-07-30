package com.google.android.gms.internal.play_billing;

import p149l.a3y0;
import p149l.f3y0;
import p149l.v2y0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2424z0 extends AbstractC2380d0 implements xmx0 {
    private static final C2424z0 zzb;
    private int zzd;
    private int zze;

    static {
        C2424z0 c2424z0 = new C2424z0();
        zzb = c2424z0;
        AbstractC2380d0.m14764v(C2424z0.class, c2424z0);
    }

    /* JADX INFO: renamed from: y */
    public static C2424z0 m14971y() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", a3y0.f67429a});
        }
        if (i2 == 3) {
            return new C2424z0();
        }
        f3y0 f3y0Var = null;
        if (i2 == 4) {
            return new v2y0(f3y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
