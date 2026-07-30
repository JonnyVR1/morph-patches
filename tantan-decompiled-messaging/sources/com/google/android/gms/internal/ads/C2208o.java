package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.u8x0;
import p149l.ypr0;
import p149l.yqr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C2208o extends AbstractC2222p5 implements abx0 {
    private static final C2208o zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private u8x0 zzh = AbstractC2222p5.m13168s();
    private long zzi;

    static {
        C2208o c2208o = new C2208o();
        zzb = c2208o;
        AbstractC2222p5.m13159C(C2208o.class, c2208o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2208o();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new yqr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
