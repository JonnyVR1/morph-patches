package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.ipr0;
import p149l.jpr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2120d extends AbstractC2222p5 implements abx0 {
    private static final C2120d zzb;
    private int zzd;
    private C2128e zze;
    private C2136f zzf;

    static {
        C2120d c2120d = new C2120d();
        zzb = c2120d;
        AbstractC2222p5.m13159C(C2120d.class, c2120d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2120d();
        }
        ipr0 ipr0Var = null;
        if (i2 == 4) {
            return new jpr0(ipr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
