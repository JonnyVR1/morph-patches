package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.n6s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2138f1 extends AbstractC2222p5 implements abx0 {
    private static final C2138f1 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        C2138f1 c2138f1 = new C2138f1();
        zzb = c2138f1;
        AbstractC2222p5.m13159C(C2138f1.class, c2138f1);
    }

    /* JADX INFO: renamed from: L */
    public static n6s0 m12684L() {
        return (n6s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12686N(C2138f1 c2138f1, boolean z) {
        c2138f1.zzd |= 1;
        c2138f1.zze = z;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12687O(C2138f1 c2138f1, int i) {
        c2138f1.zzd |= 2;
        c2138f1.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C2138f1();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new n6s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m12688P() {
        return this.zze;
    }
}
