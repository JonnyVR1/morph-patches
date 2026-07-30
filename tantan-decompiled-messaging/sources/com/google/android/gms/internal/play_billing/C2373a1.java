package com.google.android.gms.internal.play_billing;

import p149l.n3y0;
import p149l.q3y0;
import p149l.xmx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2373a1 extends AbstractC2380d0 implements xmx0 {
    private static final C2373a1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        C2373a1 c2373a1 = new C2373a1();
        zzb = c2373a1;
        AbstractC2380d0.m14764v(C2373a1.class, c2373a1);
    }

    /* JADX INFO: renamed from: A */
    public static n3y0 m14744A() {
        return (n3y0) zzb.m14771j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14746z(C2373a1 c2373a1, boolean z) {
        c2373a1.zzd |= 2;
        c2373a1.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2373a1();
        }
        q3y0 q3y0Var = null;
        if (i2 == 4) {
            return new n3y0(q3y0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
