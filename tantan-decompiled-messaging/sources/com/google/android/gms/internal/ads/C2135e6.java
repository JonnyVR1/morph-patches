package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.ydx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2135e6 extends AbstractC2222p5 implements abx0 {
    private static final C2135e6 zzb;
    private int zzd;
    private zzgyl zze = zzgyl.zzb;

    static {
        C2135e6 c2135e6 = new C2135e6();
        zzb = c2135e6;
        AbstractC2222p5.m13159C(C2135e6.class, c2135e6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C2135e6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new ydx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
