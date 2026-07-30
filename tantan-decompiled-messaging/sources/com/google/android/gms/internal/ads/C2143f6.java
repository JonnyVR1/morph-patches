package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.gdx0;
import p149l.xdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2143f6 extends AbstractC2222p5 implements abx0 {
    private static final C2143f6 zzb;
    private int zzd;
    private C2135e6 zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        C2143f6 c2143f6 = new C2143f6();
        zzb = c2143f6;
        AbstractC2222p5.m13159C(C2143f6.class, c2143f6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2143f6();
        }
        gdx0 gdx0Var = null;
        if (i2 == 4) {
            return new xdx0(gdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
