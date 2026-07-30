package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.f4s0;
import p149l.g3s0;
import p149l.g4s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2153h0 extends AbstractC2222p5 implements abx0 {
    private static final C2153h0 zzb;
    private int zzd;
    private int zze;
    private C2265v0 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        C2153h0 c2153h0 = new C2153h0();
        zzb = c2153h0;
        AbstractC2222p5.m13159C(C2153h0.class, c2153h0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", g4s0.f100586a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2153h0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new f4s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
