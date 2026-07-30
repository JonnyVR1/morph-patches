package com.google.android.gms.internal.play_billing;

import p149l.i0y0;
import p149l.iix0;
import p149l.xmx0;
import p149l.y0y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2416v0 extends AbstractC2380d0 implements xmx0 {
    private static final C2416v0 zzb;
    private iix0 zzd = AbstractC2380d0.m14761q();

    static {
        C2416v0 c2416v0 = new C2416v0();
        zzb = c2416v0;
        AbstractC2380d0.m14764v(C2416v0.class, c2416v0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2414u0.class});
        }
        if (i2 == 3) {
            return new C2416v0();
        }
        y0y0 y0y0Var = null;
        if (i2 == 4) {
            return new i0y0(y0y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
