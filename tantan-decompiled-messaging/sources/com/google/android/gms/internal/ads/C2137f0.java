package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.d4s0;
import p149l.g3s0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2137f0 extends AbstractC2222p5 implements abx0 {
    private static final C2137f0 zzb;
    private int zzd;
    private int zze;
    private C2257u0 zzf;
    private C2257u0 zzg;
    private C2257u0 zzh;
    private z9x0 zzi = AbstractC2222p5.m13172w();
    private int zzj;

    static {
        C2137f0 c2137f0 = new C2137f0();
        zzb = c2137f0;
        AbstractC2222p5.m13159C(C2137f0.class, c2137f0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C2257u0.class, "zzj"});
        }
        if (i2 == 3) {
            return new C2137f0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new d4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
