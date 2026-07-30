package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.efx0;
import p149l.ffx0;
import p149l.gdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2263u6 extends AbstractC2222p5 implements abx0 {
    private static final C2263u6 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C2263u6 c2263u6 = new C2263u6();
        zzb = c2263u6;
        AbstractC2222p5.m13159C(C2263u6.class, c2263u6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", ffx0.f97319a, "zzf"});
        }
        if (i2 == 3) {
            return new C2263u6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new efx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
