package com.google.android.gms.internal.play_billing;

import p153l.dwx0;
import p153l.fiw0;
import p153l.zfw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2442x extends AbstractC2403d0 implements dwx0 {
    private static final C2442x zzb;
    private int zzd;
    private String zze = "";

    static {
        C2442x c2442x = new C2442x();
        zzb = c2442x;
        AbstractC2403d0.m14818v(C2442x.class, c2442x);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m15014A(C2442x c2442x, String str) {
        c2442x.zzd |= 1;
        c2442x.zze = str;
    }

    /* JADX INFO: renamed from: y */
    public static zfw0 m15015y() {
        return (zfw0) zzb.m14825j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2442x();
        }
        fiw0 fiw0Var = null;
        if (i2 == 4) {
            return new zfw0(fiw0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
