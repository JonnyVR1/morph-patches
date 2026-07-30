package com.google.android.gms.internal.play_billing;

import p153l.aby0;
import p153l.dwx0;
import p153l.fby0;
import p153l.orx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2443x0 extends AbstractC2403d0 implements dwx0 {
    private static final C2443x0 zzb;
    private int zzd;
    private int zzf;
    private orx0 zze = AbstractC2403d0.m14815q();
    private String zzg = "";

    static {
        C2443x0 c2443x0 = new C2443x0();
        zzb = c2443x0;
        AbstractC2403d0.m14818v(C2443x0.class, c2443x0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2443x0();
        }
        fby0 fby0Var = null;
        if (i2 == 4) {
            return new aby0(fby0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
