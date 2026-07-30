package com.google.android.gms.internal.play_billing;

import p149l.iix0;
import p149l.u1y0;
import p149l.xmx0;
import p149l.z1y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2420x0 extends AbstractC2380d0 implements xmx0 {
    private static final C2420x0 zzb;
    private int zzd;
    private int zzf;
    private iix0 zze = AbstractC2380d0.m14761q();
    private String zzg = "";

    static {
        C2420x0 c2420x0 = new C2420x0();
        zzb = c2420x0;
        AbstractC2380d0.m14764v(C2420x0.class, c2420x0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2420x0();
        }
        z1y0 z1y0Var = null;
        if (i2 == 4) {
            return new u1y0(z1y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
