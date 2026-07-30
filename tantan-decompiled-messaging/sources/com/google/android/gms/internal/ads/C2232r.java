package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.err0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C2232r extends AbstractC2222p5 implements abx0 {
    private static final C2232r zzb;
    private int zzd;
    private String zze = "";

    static {
        C2232r c2232r = new C2232r();
        zzb = c2232r;
        AbstractC2222p5.m13159C(C2232r.class, c2232r);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2232r();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new err0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
