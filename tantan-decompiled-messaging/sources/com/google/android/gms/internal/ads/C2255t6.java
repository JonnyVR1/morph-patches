package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.dfx0;
import p149l.gdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2255t6 extends AbstractC2222p5 implements abx0 {
    private static final C2255t6 zzb;
    private int zzd;
    private String zze = "";
    private zzgyl zzf = zzgyl.zzb;

    static {
        C2255t6 c2255t6 = new C2255t6();
        zzb = c2255t6;
        AbstractC2222p5.m13159C(C2255t6.class, c2255t6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2255t6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new dfx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
