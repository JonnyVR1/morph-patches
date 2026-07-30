package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.lfx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2279w6 extends AbstractC2222p5 implements abx0 {
    private static final C2279w6 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C2279w6 c2279w6 = new C2279w6();
        zzb = c2279w6;
        AbstractC2222p5.m13159C(C2279w6.class, c2279w6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2279w6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new lfx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
