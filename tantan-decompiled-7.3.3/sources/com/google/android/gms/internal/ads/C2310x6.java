package com.google.android.gms.internal.ads;

import p153l.aix0;
import p153l.fjx0;
import p153l.gkx0;
import p153l.mmx0;
import p153l.sox0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2310x6 extends AbstractC2245p5 implements gkx0 {
    private static final C2310x6 zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private aix0 zzg = AbstractC2245p5.m13222s();
    private fjx0 zzi = AbstractC2245p5.m13226w();
    private zzgyl zzj = zzgyl.zzb;

    static {
        C2310x6 c2310x6 = new C2310x6();
        zzb = c2310x6;
        AbstractC2245p5.m13213C(C2310x6.class, c2310x6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C2302w6.class, "zzj"});
        }
        if (i2 == 3) {
            return new C2310x6();
        }
        mmx0 mmx0Var = null;
        if (i2 == 4) {
            return new sox0(mmx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
