package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.ddx0;
import p149l.edx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2302z5 extends AbstractC2222p5 implements abx0 {
    private static final C2302z5 zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        C2302z5 c2302z5 = new C2302z5();
        zzb = c2302z5;
        AbstractC2222p5.m13159C(C2302z5.class, c2302z5);
    }

    /* JADX INFO: renamed from: L */
    public static edx0 m13528L() {
        return (edx0) zzb.m13186j();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2302z5();
        }
        ddx0 ddx0Var = null;
        if (i2 == 4) {
            return new edx0(ddx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
