package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.t3s0;
import p149l.v3s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C2288y extends AbstractC2222p5 implements abx0 {
    private static final C2288y zzb;
    private int zzd;
    private int zze;
    private C2296z zzf;
    private C2095a0 zzg;

    static {
        C2288y c2288y = new C2288y();
        zzb = c2288y;
        AbstractC2222p5.m13159C(C2288y.class, c2288y);
    }

    /* JADX INFO: renamed from: L */
    public static t3s0 m13479L() {
        return (t3s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13481N(C2288y c2288y, C2296z c2296z) {
        c2296z.getClass();
        c2288y.zzf = c2296z;
        c2288y.zzd |= 2;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13482O(C2288y c2288y, C2095a0 c2095a0) {
        c2095a0.getClass();
        c2288y.zzg = c2095a0;
        c2288y.zzd |= 4;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13483P(C2288y c2288y, int i) {
        c2288y.zze = 1;
        c2288y.zzd = 1 | c2288y.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", v3s0.f179844a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2288y();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new t3s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
