package com.google.android.gms.internal.play_billing;

import p149l.t6w0;
import p149l.xmx0;
import p149l.z8w0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2419x extends AbstractC2380d0 implements xmx0 {
    private static final C2419x zzb;
    private int zzd;
    private String zze = "";

    static {
        C2419x c2419x = new C2419x();
        zzb = c2419x;
        AbstractC2380d0.m14764v(C2419x.class, c2419x);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14960A(C2419x c2419x, String str) {
        c2419x.zzd |= 1;
        c2419x.zze = str;
    }

    /* JADX INFO: renamed from: y */
    public static t6w0 m14961y() {
        return (t6w0) zzb.m14771j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2419x();
        }
        z8w0 z8w0Var = null;
        if (i2 == 4) {
            return new t6w0(z8w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
