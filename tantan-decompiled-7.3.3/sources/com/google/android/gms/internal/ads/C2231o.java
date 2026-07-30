package com.google.android.gms.internal.ads;

import p153l.aix0;
import p153l.e0s0;
import p153l.ezr0;
import p153l.gkx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C2231o extends AbstractC2245p5 implements gkx0 {
    private static final C2231o zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private aix0 zzh = AbstractC2245p5.m13222s();
    private long zzi;

    static {
        C2231o c2231o = new C2231o();
        zzb = c2231o;
        AbstractC2245p5.m13213C(C2231o.class, c2231o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2231o();
        }
        ezr0 ezr0Var = null;
        if (i2 == 4) {
            return new e0s0(ezr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
