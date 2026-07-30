package com.google.android.gms.internal.ads;

import p149l.abx0;
import p149l.j4x0;
import p149l.l4x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2293y4 extends AbstractC2222p5 implements abx0 {
    private static final C2293y4 zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2293y4 c2293y4 = new C2293y4();
        zzb = c2293y4;
        AbstractC2222p5.m13159C(C2293y4.class, c2293y4);
    }

    /* JADX INFO: renamed from: L */
    public static l4x0 m13487L() {
        return (l4x0) zzb.m13186j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13489N(C2293y4 c2293y4, String str) {
        str.getClass();
        c2293y4.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2222p5
    /* JADX INFO: renamed from: H */
    public final Object mo12506H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2222p5.m13175z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2293y4();
        }
        j4x0 j4x0Var = null;
        if (i2 == 4) {
            return new l4x0(j4x0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
