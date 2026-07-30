package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.eay0;
import p153l.o9y0;
import p153l.orx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2439v0 extends AbstractC2403d0 implements dwx0 {
    private static final C2439v0 zzb;
    private orx0 zzd = AbstractC2403d0.m14815q();

    static {
        C2439v0 c2439v0 = new C2439v0();
        zzb = c2439v0;
        AbstractC2403d0.m14818v(C2439v0.class, c2439v0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2437u0.class});
        }
        if (i2 == 3) {
            return new C2439v0();
        }
        eay0 eay0Var = null;
        if (i2 == 4) {
            return new o9y0(eay0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
