package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.eay0;
import p153l.s9y0;
import p153l.x9y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2437u0 extends AbstractC2403d0 implements dwx0 {
    private static final C2437u0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C2437u0 c2437u0 = new C2437u0();
        zzb = c2437u0;
        AbstractC2403d0.m14818v(C2437u0.class, c2437u0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", x9y0.f192979a, "zzf"});
        }
        if (i2 == 3) {
            return new C2437u0();
        }
        eay0 eay0Var = null;
        if (i2 == 4) {
            return new s9y0(eay0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
