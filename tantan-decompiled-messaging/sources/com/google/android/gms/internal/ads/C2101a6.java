package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.ddx0;
import p149l.fdx0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2101a6 extends AbstractC2222p5 implements abx0 {
    private static final C2101a6 zzb;
    private z9x0 zzd = AbstractC2222p5.m13172w();

    static {
        C2101a6 c2101a6 = new C2101a6();
        zzb = c2101a6;
        AbstractC2222p5.m13159C(C2101a6.class, c2101a6);
    }

    /* JADX INFO: renamed from: L */
    public static fdx0 m12523L() {
        return (fdx0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m12525N(C2101a6 c2101a6, C2302z5 c2302z5) {
        c2302z5.getClass();
        z9x0 z9x0Var = c2101a6.zzd;
        if (!z9x0Var.zzc()) {
            c2101a6.zzd = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2101a6.zzd.add(c2302z5);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2302z5.class});
        }
        if (i2 == 3) {
            return new C2101a6();
        }
        ddx0 ddx0Var = null;
        if (i2 == 4) {
            return new fdx0(ddx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
