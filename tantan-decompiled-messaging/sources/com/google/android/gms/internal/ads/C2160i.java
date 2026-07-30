package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.hqr0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C2160i extends AbstractC2222p5 implements abx0 {
    private static final C2160i zzb;
    private int zzd;
    private long zze = -1;

    static {
        C2160i c2160i = new C2160i();
        zzb = c2160i;
        AbstractC2222p5.m13159C(C2160i.class, c2160i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2160i();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new hqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
