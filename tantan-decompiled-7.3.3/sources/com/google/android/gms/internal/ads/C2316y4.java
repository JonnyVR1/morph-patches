package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.pdx0;
import p153l.rdx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2316y4 extends AbstractC2245p5 implements gkx0 {
    private static final C2316y4 zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C2316y4 c2316y4 = new C2316y4();
        zzb = c2316y4;
        AbstractC2245p5.m13213C(C2316y4.class, c2316y4);
    }

    /* JADX INFO: renamed from: L */
    public static rdx0 m13541L() {
        return (rdx0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13543N(C2316y4 c2316y4, String str) {
        str.getClass();
        c2316y4.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C2316y4();
        }
        pdx0 pdx0Var = null;
        if (i2 == 4) {
            return new rdx0(pdx0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
