package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.g3s0;
import p149l.u3s0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2104b0 extends AbstractC2222p5 implements abx0 {
    private static final C2104b0 zzb;
    private z9x0 zzd = AbstractC2222p5.m13172w();

    static {
        C2104b0 c2104b0 = new C2104b0();
        zzb = c2104b0;
        AbstractC2222p5.m13159C(C2104b0.class, c2104b0);
    }

    /* JADX INFO: renamed from: L */
    public static u3s0 m12527L() {
        return (u3s0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12529N(C2104b0 c2104b0, C2288y c2288y) {
        c2288y.getClass();
        z9x0 z9x0Var = c2104b0.zzd;
        if (!z9x0Var.zzc()) {
            c2104b0.zzd = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2104b0.zzd.add(c2288y);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2288y.class});
        }
        if (i2 == 3) {
            return new C2104b0();
        }
        g3s0 g3s0Var = null;
        if (i2 == 4) {
            return new u3s0(g3s0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
