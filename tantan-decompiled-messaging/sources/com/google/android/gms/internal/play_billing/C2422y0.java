package com.google.android.gms.internal.play_billing;

import p149l.h2y0;
import p149l.m2y0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2422y0 extends AbstractC2380d0 implements xmx0 {
    private static final C2422y0 zzb;
    private int zzd;
    private C2402o0 zze;

    static {
        C2422y0 c2422y0 = new C2422y0();
        zzb = c2422y0;
        AbstractC2380d0.m14764v(C2422y0.class, c2422y0);
    }

    /* JADX INFO: renamed from: A */
    public static h2y0 m14966A() {
        return (h2y0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14968z(C2422y0 c2422y0, C2402o0 c2402o0) {
        c2402o0.getClass();
        c2422y0.zze = c2402o0;
        c2422y0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2422y0();
        }
        m2y0 m2y0Var = null;
        if (i2 == 4) {
            return new h2y0(m2y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
