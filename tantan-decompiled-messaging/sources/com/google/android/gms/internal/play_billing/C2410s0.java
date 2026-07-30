package com.google.android.gms.internal.play_billing;

import p149l.myx0;
import p149l.qyx0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2410s0 extends AbstractC2380d0 implements xmx0 {
    private static final C2410s0 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C2410s0 c2410s0 = new C2410s0();
        zzb = c2410s0;
        AbstractC2380d0.m14764v(C2410s0.class, c2410s0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2410s0();
        }
        qyx0 qyx0Var = null;
        if (i2 == 4) {
            return new myx0(qyx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
