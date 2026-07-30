package com.google.android.gms.internal.play_billing;

import p153l.bfw0;
import p153l.dwx0;
import p153l.fkw0;
import p153l.saw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2438v extends AbstractC2403d0 implements dwx0 {
    private static final C2438v zzb;
    private int zzd;
    private C2442x zze;
    private C2442x zzf;
    private int zzg;

    static {
        C2438v c2438v = new C2438v();
        zzb = c2438v;
        AbstractC2403d0.m14818v(C2438v.class, c2438v);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14999A(C2438v c2438v, C2442x c2442x) {
        c2442x.getClass();
        c2438v.zze = c2442x;
        c2438v.zzd |= 1;
    }

    /* JADX INFO: renamed from: y */
    public static saw0 m15000y() {
        return (saw0) zzb.m14825j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2403d0
    /* JADX INFO: renamed from: h */
    public final Object mo14801h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2403d0.m14817s(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", fkw0.m126061a()});
        }
        if (i2 == 3) {
            return new C2438v();
        }
        bfw0 bfw0Var = null;
        if (i2 == 4) {
            return new saw0(bfw0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
