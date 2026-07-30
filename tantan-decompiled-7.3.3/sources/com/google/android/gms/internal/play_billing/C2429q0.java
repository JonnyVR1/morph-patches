package com.google.android.gms.internal.play_billing;

import p153l.c6y0;
import p153l.dwx0;
import p153l.krx0;
import p153l.l6y0;
import p153l.orx0;
import p153l.q6y0;
import p153l.v6y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2429q0 extends AbstractC2403d0 implements dwx0 {
    private static final C2429q0 zzb;
    private int zzd;
    private int zzf;
    private C2425o0 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private krx0 zzg = AbstractC2403d0.m14814o();
    private orx0 zzh = AbstractC2403d0.m14815q();

    static {
        C2429q0 c2429q0 = new C2429q0();
        zzb = c2429q0;
        AbstractC2403d0.m14818v(C2429q0.class, c2429q0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", q6y0.f155925a, "zzg", c6y0.f80014a, "zzh", C2443x0.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new C2429q0();
        }
        v6y0 v6y0Var = null;
        if (i2 == 4) {
            return new l6y0(v6y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
