package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.f8y0;
import p153l.f9y0;
import p153l.j8y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2435t0 extends AbstractC2403d0 implements dwx0 {
    private static final C2435t0 zzb;
    private int zzd;
    private int zze;

    static {
        C2435t0 c2435t0 = new C2435t0();
        zzb = c2435t0;
        AbstractC2403d0.m14818v(C2435t0.class, c2435t0);
    }

    /* JADX INFO: renamed from: A */
    public static f8y0 m14994A() {
        return (f8y0) zzb.m14825j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14996z(C2435t0 c2435t0, int i) {
        c2435t0.zze = i - 1;
        c2435t0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", j8y0.f118832a});
        }
        if (i2 == 3) {
            return new C2435t0();
        }
        f9y0 f9y0Var = null;
        if (i2 == 4) {
            return new f8y0(f9y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
