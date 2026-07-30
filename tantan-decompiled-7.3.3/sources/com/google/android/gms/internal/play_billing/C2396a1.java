package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.tcy0;
import p153l.wcy0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2396a1 extends AbstractC2403d0 implements dwx0 {
    private static final C2396a1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        C2396a1 c2396a1 = new C2396a1();
        zzb = c2396a1;
        AbstractC2403d0.m14818v(C2396a1.class, c2396a1);
    }

    /* JADX INFO: renamed from: A */
    public static tcy0 m14798A() {
        return (tcy0) zzb.m14825j();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m14800z(C2396a1 c2396a1, boolean z) {
        c2396a1.zzd |= 2;
        c2396a1.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2396a1();
        }
        wcy0 wcy0Var = null;
        if (i2 == 4) {
            return new tcy0(wcy0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
