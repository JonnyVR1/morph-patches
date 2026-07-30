package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.p5y0;
import p153l.u5y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2427p0 extends AbstractC2403d0 implements dwx0 {
    private static final C2427p0 zzb;

    static {
        C2427p0 c2427p0 = new C2427p0();
        zzb = c2427p0;
        AbstractC2403d0.m14818v(C2427p0.class, c2427p0);
    }

    /* JADX INFO: renamed from: y */
    public static C2427p0 m14980y() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        u5y0 u5y0Var = null;
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new C2427p0();
        }
        if (i2 == 4) {
            return new p5y0(u5y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
