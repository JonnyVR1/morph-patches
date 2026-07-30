package com.google.android.gms.internal.play_billing;

import p149l.jwx0;
import p149l.owx0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2404p0 extends AbstractC2380d0 implements xmx0 {
    private static final C2404p0 zzb;

    static {
        C2404p0 c2404p0 = new C2404p0();
        zzb = c2404p0;
        AbstractC2380d0.m14764v(C2404p0.class, c2404p0);
    }

    /* JADX INFO: renamed from: y */
    public static C2404p0 m14926y() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        owx0 owx0Var = null;
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new C2404p0();
        }
        if (i2 == 4) {
            return new jwx0(owx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
