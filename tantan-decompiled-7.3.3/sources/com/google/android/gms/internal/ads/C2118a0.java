package com.google.android.gms.internal.ads;

import p153l.dds0;
import p153l.gkx0;
import p153l.mcs0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2118a0 extends AbstractC2245p5 implements gkx0 {
    private static final C2118a0 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C2118a0 c2118a0 = new C2118a0();
        zzb = c2118a0;
        AbstractC2245p5.m13213C(C2118a0.class, c2118a0);
    }

    /* JADX INFO: renamed from: L */
    public static dds0 m12555L() {
        return (dds0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12557N(C2118a0 c2118a0, boolean z) {
        c2118a0.zzd |= 1;
        c2118a0.zze = z;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12558O(C2118a0 c2118a0, boolean z) {
        c2118a0.zzd |= 2;
        c2118a0.zzf = z;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12559P(C2118a0 c2118a0, int i) {
        c2118a0.zzd |= 4;
        c2118a0.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2118a0();
        }
        mcs0 mcs0Var = null;
        if (i2 == 4) {
            return new dds0(mcs0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
