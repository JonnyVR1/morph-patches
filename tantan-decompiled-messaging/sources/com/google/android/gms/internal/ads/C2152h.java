package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.brr0;
import p149l.gqr0;
import p149l.t8x0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C2152h extends AbstractC2222p5 implements abx0 {
    private static final C2152h zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        C2152h c2152h = new C2152h();
        zzb = c2152h;
        AbstractC2222p5.m13159C(C2152h.class, c2152h);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            t8x0 t8x0Var = brr0.f76937a;
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", t8x0Var, "zzg", t8x0Var});
        }
        if (i2 == 3) {
            return new C2152h();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new gqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
