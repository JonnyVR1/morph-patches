package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.r5s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2233r0 extends AbstractC2222p5 implements abx0 {
    private static final C2233r0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2233r0 c2233r0 = new C2233r0();
        zzb = c2233r0;
        AbstractC2222p5.m13159C(C2233r0.class, c2233r0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2233r0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new r5s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
