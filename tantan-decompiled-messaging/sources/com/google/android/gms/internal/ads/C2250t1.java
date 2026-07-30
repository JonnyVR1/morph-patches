package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.k5w0;
import p149l.l5w0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2250t1 extends AbstractC2222p5 implements abx0 {
    private static final C2250t1 zzb;
    private z9x0 zzd = AbstractC2222p5.m13172w();

    static {
        C2250t1 c2250t1 = new C2250t1();
        zzb = c2250t1;
        AbstractC2222p5.m13159C(C2250t1.class, c2250t1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2242s1.class});
        }
        if (i2 == 3) {
            return new C2250t1();
        }
        k5w0 k5w0Var = null;
        if (i2 == 4) {
            return new l5w0(k5w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
