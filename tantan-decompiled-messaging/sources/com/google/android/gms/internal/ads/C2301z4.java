package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.j4x0;
import p149l.k4x0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2301z4 extends AbstractC2222p5 implements abx0 {
    private static final C2301z4 zzb;
    private int zzd;
    private z9x0 zze = AbstractC2222p5.m13172w();

    static {
        C2301z4 c2301z4 = new C2301z4();
        zzb = c2301z4;
        AbstractC2222p5.m13159C(C2301z4.class, c2301z4);
    }

    /* JADX INFO: renamed from: L */
    public static k4x0 m13524L() {
        return (k4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13527O(C2301z4 c2301z4, C2293y4 c2293y4) {
        c2293y4.getClass();
        z9x0 z9x0Var = c2301z4.zze;
        if (!z9x0Var.zzc()) {
            c2301z4.zze = AbstractC2222p5.m13173x(z9x0Var);
        }
        c2301z4.zze.add(c2293y4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C2293y4.class});
        }
        if (i2 == 3) {
            return new C2301z4();
        }
        j4x0 j4x0Var = null;
        if (i2 == 4) {
            return new k4x0(j4x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
