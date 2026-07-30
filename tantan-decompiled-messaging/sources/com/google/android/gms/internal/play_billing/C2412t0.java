package com.google.android.gms.internal.play_billing;

import p149l.dzx0;
import p149l.xmx0;
import p149l.zyx0;
import p149l.zzx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2412t0 extends AbstractC2380d0 implements xmx0 {
    private static final C2412t0 zzb;
    private int zzd;
    private int zze;

    static {
        C2412t0 c2412t0 = new C2412t0();
        zzb = c2412t0;
        AbstractC2380d0.m14764v(C2412t0.class, c2412t0);
    }

    /* JADX INFO: renamed from: A */
    public static zyx0 m14940A() {
        return (zyx0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14942z(C2412t0 c2412t0, int i) {
        c2412t0.zze = i - 1;
        c2412t0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", dzx0.f88521a});
        }
        if (i2 == 3) {
            return new C2412t0();
        }
        zzx0 zzx0Var = null;
        if (i2 == 4) {
            return new zyx0(zzx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
