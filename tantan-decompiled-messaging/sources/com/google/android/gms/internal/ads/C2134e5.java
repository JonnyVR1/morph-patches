package com.google.android.gms.internal.ads;

import p149l.a5x0;
import p149l.abx0;
import p149l.b5x0;
import p149l.z9x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.e5 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2134e5 extends AbstractC2222p5 implements abx0 {
    private static final C2134e5 zzb;
    private String zzd = "";
    private z9x0 zze = AbstractC2222p5.m13172w();

    static {
        C2134e5 c2134e5 = new C2134e5();
        zzb = c2134e5;
        AbstractC2222p5.m13159C(C2134e5.class, c2134e5);
    }

    /* JADX INFO: renamed from: M */
    public static C2134e5 m12680M() {
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
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", C2269v4.class});
        }
        if (i2 == 3) {
            return new C2134e5();
        }
        a5x0 a5x0Var = null;
        if (i2 == 4) {
            return new b5x0(a5x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
