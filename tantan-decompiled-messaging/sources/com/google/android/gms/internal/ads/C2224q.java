package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.drr0;
import p149l.ypr0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C2224q extends AbstractC2222p5 implements abx0 {
    private static final C2224q zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgyl zzg = zzgyl.zzb;

    static {
        C2224q c2224q = new C2224q();
        zzb = c2224q;
        AbstractC2222p5.m13159C(C2224q.class, c2224q);
    }

    /* JADX INFO: renamed from: N */
    public static C2224q m13191N() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2224q();
        }
        ypr0 ypr0Var = null;
        if (i2 == 4) {
            return new drr0(ypr0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: L */
    public final long m13192L() {
        return this.zze;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m13193O() {
        return (this.zzd & 1) != 0;
    }
}
