package com.google.android.gms.internal.play_billing;

import p153l.bcy0;
import p153l.dwx0;
import p153l.gcy0;
import p153l.lcy0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2447z0 extends AbstractC2403d0 implements dwx0 {
    private static final C2447z0 zzb;
    private int zzd;
    private int zze;

    static {
        C2447z0 c2447z0 = new C2447z0();
        zzb = c2447z0;
        AbstractC2403d0.m14818v(C2447z0.class, c2447z0);
    }

    /* JADX INFO: renamed from: y */
    public static C2447z0 m15025y() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", gcy0.f103614a});
        }
        if (i2 == 3) {
            return new C2447z0();
        }
        lcy0 lcy0Var = null;
        if (i2 == 4) {
            return new bcy0(lcy0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
