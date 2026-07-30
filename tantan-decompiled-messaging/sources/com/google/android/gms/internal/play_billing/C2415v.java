package com.google.android.gms.internal.play_billing;

import p149l.m1w0;
import p149l.v5w0;
import p149l.xmx0;
import p149l.zaw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C2415v extends AbstractC2380d0 implements xmx0 {
    private static final C2415v zzb;
    private int zzd;
    private C2419x zze;
    private C2419x zzf;
    private int zzg;

    static {
        C2415v c2415v = new C2415v();
        zzb = c2415v;
        AbstractC2380d0.m14764v(C2415v.class, c2415v);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m14945A(C2415v c2415v, C2419x c2419x) {
        c2419x.getClass();
        c2415v.zze = c2419x;
        c2415v.zzd |= 1;
    }

    /* JADX INFO: renamed from: y */
    public static m1w0 m14946y() {
        return (m1w0) zzb.m14771j();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2380d0
    /* JADX INFO: renamed from: h */
    public final Object mo14747h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2380d0.m14763s(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zaw0.m217757a()});
        }
        if (i2 == 3) {
            return new C2415v();
        }
        v5w0 v5w0Var = null;
        if (i2 == 4) {
            return new m1w0(v5w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
