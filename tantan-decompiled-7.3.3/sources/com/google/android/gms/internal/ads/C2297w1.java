package com.google.android.gms.internal.ads;

import p153l.gkx0;
import p153l.wiw0;
import p153l.xiw0;
import p153l.yiw0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2297w1 extends AbstractC2245p5 implements gkx0 {
    private static final C2297w1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private C2289v1 zzh;

    static {
        C2297w1 c2297w1 = new C2297w1();
        zzb = c2297w1;
        AbstractC2245p5.m13213C(C2297w1.class, c2297w1);
    }

    /* JADX INFO: renamed from: L */
    public static xiw0 m13468L() {
        return (xiw0) zzb.m13240j();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m13470N(C2297w1 c2297w1, String str) {
        str.getClass();
        c2297w1.zzd |= 2;
        c2297w1.zzf = str;
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m13471O(C2297w1 c2297w1, C2289v1 c2289v1) {
        c2289v1.getClass();
        c2297w1.zzh = c2289v1;
        c2297w1.zzd |= 8;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m13472P(C2297w1 c2297w1, int i) {
        c2297w1.zze = 1;
        c2297w1.zzd = 1 | c2297w1.zzd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2245p5
    /* JADX INFO: renamed from: H */
    public final Object mo12560H(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return AbstractC2245p5.m13229z(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", yiw0.f200250a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new C2297w1();
        }
        wiw0 wiw0Var = null;
        if (i2 == 4) {
            return new xiw0(wiw0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
