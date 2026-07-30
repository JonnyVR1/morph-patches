package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.bqr0;
import p149l.fqr0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2144g extends AbstractC2222p5 implements abx0 {
    private static final C2144g zzb;
    private int zzd;
    private int zze;

    static {
        C2144g c2144g = new C2144g();
        zzb = c2144g;
        AbstractC2222p5.m13159C(C2144g.class, c2144g);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", fqr0.f98841a});
        }
        if (i2 == 3) {
            return new C2144g();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new bqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
