package com.google.android.gms.internal.ads;

import p153l.cds0;
import p153l.gkx0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C2319z extends AbstractC2245p5 implements gkx0 {
    private static final C2319z zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        C2319z c2319z = new C2319z();
        zzb = c2319z;
        AbstractC2245p5.m13213C(C2319z.class, c2319z);
    }

    /* JADX INFO: renamed from: L */
    public static cds0 m13560L() {
        return (cds0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static C2319z m13562N() {
        return zzb;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13563O(C2319z c2319z, boolean z) {
        c2319z.zzd |= 1;
        c2319z.zze = z;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13564P(C2319z c2319z, int i) {
        c2319z.zzd |= 2;
        c2319z.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2319z();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new cds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
