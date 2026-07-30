package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.i5w0;
import p149l.j5w0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2242s1 extends AbstractC2222p5 implements abx0 {
    private static final C2242s1 zzb;
    private int zzd;
    private int zzf;
    private String zze = "";
    private String zzg = "";

    static {
        C2242s1 c2242s1 = new C2242s1();
        zzb = c2242s1;
        AbstractC2222p5.m13159C(C2242s1.class, c2242s1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2242s1();
        }
        i5w0 i5w0Var = null;
        if (i2 == 4) {
            return new j5w0(i5w0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
