package com.google.android.gms.internal.ads;

import p153l.aix0;
import p153l.cjx0;
import p153l.gkx0;
import p153l.tiw0;
import p153l.uiw0;
import p153l.viw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2289v1 extends AbstractC2245p5 implements gkx0 {
    private static final cjx0 zzb = new tiw0();
    private static final C2289v1 zzd;
    private int zze;
    private aix0 zzf = AbstractC2245p5.m13222s();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C2289v1 c2289v1 = new C2289v1();
        zzd = c2289v1;
        AbstractC2245p5.m13213C(C2289v1.class, c2289v1);
    }

    /* JADX INFO: renamed from: L */
    public static viw0 m13429L() {
        return (viw0) zzd.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13431N(C2289v1 c2289v1, String str) {
        str.getClass();
        c2289v1.zze |= 1;
        c2289v1.zzg = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13432O(C2289v1 c2289v1, int i) {
        aix0 aix0Var = c2289v1.zzf;
        if (!aix0Var.zzc()) {
            c2289v1.zzf = AbstractC2245p5.m13223t(aix0Var);
        }
        c2289v1.zzf.zzh(2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", uiw0.f179155a, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new C2289v1();
        }
        tiw0 tiw0Var = null;
        if (i2 == 4) {
            return new viw0(tiw0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }
}
