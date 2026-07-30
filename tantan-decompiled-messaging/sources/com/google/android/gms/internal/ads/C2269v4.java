package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.f4x0;
import p149l.z3x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v4 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2269v4 extends AbstractC2222p5 implements abx0 {
    private static final C2269v4 zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        C2269v4 c2269v4 = new C2269v4();
        zzb = c2269v4;
        AbstractC2222p5.m13159C(C2269v4.class, c2269v4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2269v4();
        }
        z3x0 z3x0Var = null;
        if (i2 == 4) {
            return new f4x0(z3x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
