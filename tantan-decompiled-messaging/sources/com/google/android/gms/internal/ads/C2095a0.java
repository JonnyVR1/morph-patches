package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.x3s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2095a0 extends AbstractC2222p5 implements abx0 {
    private static final C2095a0 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        C2095a0 c2095a0 = new C2095a0();
        zzb = c2095a0;
        AbstractC2222p5.m13159C(C2095a0.class, c2095a0);
    }

    /* JADX INFO: renamed from: L */
    public static x3s0 m12501L() {
        return (x3s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12503N(C2095a0 c2095a0, boolean z) {
        c2095a0.zzd |= 1;
        c2095a0.zze = z;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m12504O(C2095a0 c2095a0, boolean z) {
        c2095a0.zzd |= 2;
        c2095a0.zzf = z;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m12505P(C2095a0 c2095a0, int i) {
        c2095a0.zzd |= 4;
        c2095a0.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2095a0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new x3s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
